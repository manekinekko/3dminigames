// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g 2011-03-05 01:33:16

    package grammars;
    import java.util.LinkedList;


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:1: game : ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:6: ( ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:63:5: ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )*
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:63:5: ( gameData FIN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:63:6: gameData FIN
                    {
                    pushFollow(FOLLOW_gameData_in_game245);
                    gameData1=gameData();

                    state._fsp--;

                    stream_gameData.add(gameData1.getTree());
                    FIN2=(Token)match(input,FIN,FOLLOW_FIN_in_game247);  
                    stream_FIN.add(FIN2);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:64:5: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:64:6: newType FIN
            	    {
            	    pushFollow(FOLLOW_newType_in_game256);
            	    newType3=newType();

            	    state._fsp--;

            	    stream_newType.add(newType3.getTree());
            	    FIN4=(Token)match(input,FIN,FOLLOW_FIN_in_game258);  
            	    stream_FIN.add(FIN4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:65:5: ( init FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:65:6: init FIN
            	    {
            	    pushFollow(FOLLOW_init_in_game267);
            	    init5=init();

            	    state._fsp--;

            	    stream_init.add(init5.getTree());
            	    FIN6=(Token)match(input,FIN,FOLLOW_FIN_in_game269);  
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:66:5: ( definition FIN )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DEFINITION_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:66:6: definition FIN
            	    {
            	    pushFollow(FOLLOW_definition_in_game278);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    FIN8=(Token)match(input,FIN,FOLLOW_FIN_in_game280);  
            	    stream_FIN.add(FIN8);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:67:5: ( commande FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:67:6: commande FIN
            	    {
            	    pushFollow(FOLLOW_commande_in_game289);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game291);  
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:5: ( reglesJeu FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:6: reglesJeu FIN
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game300);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game302);  
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:5: ( iaBasique FIN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IA_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:6: iaBasique FIN
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game311);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    FIN14=(Token)match(input,FIN,FOLLOW_FIN_in_game313);  
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
            // 70:7: -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:10: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:20: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:30: ( newType )*
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:45: ( definition )*
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:78: ( iaBasique )*
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:75:5: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData367);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData369);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData371);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:75:27: ( VIRG attributGame )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VIRG) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:75:28: VIRG attributGame
            	    {
            	    VIRG18=(Token)match(input,VIRG,FOLLOW_VIRG_in_gameData374);  
            	    stream_VIRG.add(VIRG18);

            	    pushFollow(FOLLOW_attributGame_in_gameData376);
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:76:10: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:79:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | TURNBASED_KW AT ( 'true' | 'false' ) | WORLD_KW AT mapType | GRIDSIZE_KW AT FLOAT | NAME_KW AT name );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:79:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | TURNBASED_KW AT ( 'true' | 'false' ) | WORLD_KW AT mapType | GRIDSIZE_KW AT FLOAT | NAME_KW AT name )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:5: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame410);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame412);  
                    stream_AT.add(AT21);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:19: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:20: FLOAT
                            {
                            FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame415);  
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:81:10: ^( GRAVITY_KW FLOAT )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:82:7: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame437);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame439);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame441);  
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
                            // 83:7: -> ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:10: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:84:7: TURNBASED_KW AT ( 'true' | 'false' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURNBASED_KW26=(Token)match(input,TURNBASED_KW,FOLLOW_TURNBASED_KW_in_attributGame469); 
                    TURNBASED_KW26_tree = (CommonTree)adaptor.create(TURNBASED_KW26);
                    root_0 = (CommonTree)adaptor.becomeRoot(TURNBASED_KW26_tree, root_0);

                    AT27=(Token)match(input,AT,FOLLOW_AT_in_attributGame472); 
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:85:7: WORLD_KW AT mapType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORLD_KW29=(Token)match(input,WORLD_KW,FOLLOW_WORLD_KW_in_attributGame487); 
                    WORLD_KW29_tree = (CommonTree)adaptor.create(WORLD_KW29);
                    root_0 = (CommonTree)adaptor.becomeRoot(WORLD_KW29_tree, root_0);

                    AT30=(Token)match(input,AT,FOLLOW_AT_in_attributGame490); 
                    pushFollow(FOLLOW_mapType_in_attributGame493);
                    mapType31=mapType();

                    state._fsp--;

                    adaptor.addChild(root_0, mapType31.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:86:7: GRIDSIZE_KW AT FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GRIDSIZE_KW32=(Token)match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame501); 
                    GRIDSIZE_KW32_tree = (CommonTree)adaptor.create(GRIDSIZE_KW32);
                    root_0 = (CommonTree)adaptor.becomeRoot(GRIDSIZE_KW32_tree, root_0);

                    AT33=(Token)match(input,AT,FOLLOW_AT_in_attributGame504); 
                    FLOAT34=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame507); 
                    FLOAT34_tree = (CommonTree)adaptor.create(FLOAT34);
                    adaptor.addChild(root_0, FLOAT34_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:87:7: NAME_KW AT name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NAME_KW35=(Token)match(input,NAME_KW,FOLLOW_NAME_KW_in_attributGame515); 
                    NAME_KW35_tree = (CommonTree)adaptor.create(NAME_KW35);
                    root_0 = (CommonTree)adaptor.becomeRoot(NAME_KW35_tree, root_0);

                    AT36=(Token)match(input,AT,FOLLOW_AT_in_attributGame519); 
                    pushFollow(FOLLOW_name_in_attributGame522);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:1: mapType : ( GENERIC | GRID | RIBBON );
    public final hightParser.mapType_return mapType() throws RecognitionException {
        hightParser.mapType_return retval = new hightParser.mapType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set38=null;

        CommonTree set38_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:9: ( GENERIC | GRID | RIBBON )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:1: name : IDENT ;
    public final hightParser.name_return name() throws RecognitionException {
        hightParser.name_return retval = new hightParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT39=null;

        CommonTree IDENT39_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:6: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:8: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_name551); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:96:5: TYPE IDENT IS subType ( AND subType )*
            {
            TYPE40=(Token)match(input,TYPE,FOLLOW_TYPE_in_newType565);  
            stream_TYPE.add(TYPE40);

            IDENT41=(Token)match(input,IDENT,FOLLOW_IDENT_in_newType567);  
            stream_IDENT.add(IDENT41);

            IS42=(Token)match(input,IS,FOLLOW_IS_in_newType569);  
            stream_IS.add(IS42);

            pushFollow(FOLLOW_subType_in_newType571);
            subType43=subType();

            state._fsp--;

            stream_subType.add(subType43.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:96:27: ( AND subType )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:96:28: AND subType
            	    {
            	    AND44=(Token)match(input,AND,FOLLOW_AND_in_newType574);  
            	    stream_AND.add(AND44);

            	    pushFollow(FOLLOW_subType_in_newType576);
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
            // 97:7: -> ^( TYPE IDENT subType ( subType )* )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:97:10: ^( TYPE IDENT subType ( subType )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_subType.nextTree());
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:97:31: ( subType )*
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:1: subType : IDENT ;
    public final hightParser.subType_return subType() throws RecognitionException {
        hightParser.subType_return retval = new hightParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT46=null;

        CommonTree IDENT46_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:9: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:101:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT46=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType616); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:107:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) | INSERT_KW IDENT IN IDENT ( NUM operation )? | REMOVE_KW ( IDENT | NUM operation ) FROM IDENT );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:107:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) | INSERT_KW IDENT IN IDENT ( NUM operation )? | REMOVE_KW ( IDENT | NUM operation ) FROM IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:108:5: IDENT IS declarationObjet
                    {
                    IDENT47=(Token)match(input,IDENT,FOLLOW_IDENT_in_init641);  
                    stream_IDENT.add(IDENT47);

                    IS48=(Token)match(input,IS,FOLLOW_IS_in_init643);  
                    stream_IS.add(IS48);

                    pushFollow(FOLLOW_declarationObjet_in_init645);
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
                    // 109:7: -> ^( INIT_IS_KW IDENT declarationObjet )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:109:10: ^( INIT_IS_KW IDENT declarationObjet )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:110:7: accesClasse HAS allocationObject ( VIRG allocationObject )*
                    {
                    pushFollow(FOLLOW_accesClasse_in_init669);
                    accesClasse50=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse50.getTree());
                    HAS51=(Token)match(input,HAS,FOLLOW_HAS_in_init671);  
                    stream_HAS.add(HAS51);

                    pushFollow(FOLLOW_allocationObject_in_init673);
                    allocationObject52=allocationObject();

                    state._fsp--;

                    stream_allocationObject.add(allocationObject52.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:110:40: ( VIRG allocationObject )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VIRG) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:110:41: VIRG allocationObject
                    	    {
                    	    VIRG53=(Token)match(input,VIRG,FOLLOW_VIRG_in_init676);  
                    	    stream_VIRG.add(VIRG53);

                    	    pushFollow(FOLLOW_allocationObject_in_init678);
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
                    // 111:7: -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:111:10: ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:112:7: INSERT_KW IDENT IN IDENT ( NUM operation )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSERT_KW55=(Token)match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init706); 
                    INSERT_KW55_tree = (CommonTree)adaptor.create(INSERT_KW55);
                    root_0 = (CommonTree)adaptor.becomeRoot(INSERT_KW55_tree, root_0);

                    IDENT56=(Token)match(input,IDENT,FOLLOW_IDENT_in_init709); 
                    IDENT56_tree = (CommonTree)adaptor.create(IDENT56);
                    adaptor.addChild(root_0, IDENT56_tree);

                    IN57=(Token)match(input,IN,FOLLOW_IN_in_init711); 
                    IDENT58=(Token)match(input,IDENT,FOLLOW_IDENT_in_init714); 
                    IDENT58_tree = (CommonTree)adaptor.create(IDENT58);
                    adaptor.addChild(root_0, IDENT58_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:112:34: ( NUM operation )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NUM) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:112:35: NUM operation
                            {
                            NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_init717); 
                            pushFollow(FOLLOW_operation_in_init720);
                            operation60=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation60.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:113:7: REMOVE_KW ( IDENT | NUM operation ) FROM IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REMOVE_KW61=(Token)match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init732); 
                    REMOVE_KW61_tree = (CommonTree)adaptor.create(REMOVE_KW61);
                    root_0 = (CommonTree)adaptor.becomeRoot(REMOVE_KW61_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:113:18: ( IDENT | NUM operation )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:113:19: IDENT
                            {
                            IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_init736); 
                            IDENT62_tree = (CommonTree)adaptor.create(IDENT62);
                            adaptor.addChild(root_0, IDENT62_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:113:25: NUM operation
                            {
                            NUM63=(Token)match(input,NUM,FOLLOW_NUM_in_init738); 
                            pushFollow(FOLLOW_operation_in_init741);
                            operation64=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation64.getTree());

                            }
                            break;

                    }

                    FROM65=(Token)match(input,FROM,FOLLOW_FROM_in_init744); 
                    IDENT66=(Token)match(input,IDENT,FOLLOW_IDENT_in_init747); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:117:1: declarationObjet : ( IDENT ( dupli )? -> ^( DEC IDENT ( dupli )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) | PLAYER ( SOLO )? );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:117:18: ( IDENT ( dupli )? -> ^( DEC IDENT ( dupli )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) | PLAYER ( SOLO )? )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:118:5: IDENT ( dupli )?
                    {
                    IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet765);  
                    stream_IDENT.add(IDENT67);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:118:11: ( dupli )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==DUPLICABLE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:118:11: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_declarationObjet767);
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:119:10: ^( DEC IDENT ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:119:22: ( dupli )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:7: LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW69=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet796);  
                    stream_LIST_KW.add(LIST_KW69);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:15: ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OF) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:16: OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )*
                            {
                            OF70=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet799);  
                            stream_OF.add(OF70);

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:19: ( operation )?
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
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:20: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet802);
                                    operation71=operation();

                                    state._fsp--;

                                    stream_operation.add(operation71.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:32: ( IDENT )
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:33: IDENT
                            {
                            IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet807);  
                            stream_IDENT.add(IDENT72);


                            }

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:40: ( ',' ( operation )? ( IDENT ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==VIRG) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:41: ',' ( operation )? ( IDENT )
                            	    {
                            	    char_literal73=(Token)match(input,VIRG,FOLLOW_VIRG_in_declarationObjet811);  
                            	    stream_VIRG.add(char_literal73);

                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:45: ( operation )?
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
                            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:46: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet814);
                            	            operation74=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation74.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:58: ( IDENT )
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:120:59: IDENT
                            	    {
                            	    IDENT75=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet819);  
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
                    // 121:7: -> ^( LIST_KW ( ( operation )? IDENT )+ )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:121:9: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:121:20: ( operation )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:7: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    {
                    CAMERA76=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet854);  
                    stream_CAMERA.add(CAMERA76);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:14: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:15: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet857);
                            view77=view();

                            state._fsp--;

                            stream_view.add(view77.getTree());
                            PERSON78=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet859);  
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
                            // 122:27: -> ^( CAMERA_KW PERSON view )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:30: ^( CAMERA_KW PERSON view )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:57: FREE
                            {
                            FREE79=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet873);  
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:65: ^( CAMERA_KW FREE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:123:7: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA80=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet891);  
                    stream_MEDIA.add(MEDIA80);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:123:13: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:123:14: LOOP
                            {
                            LOOP81=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet894);  
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:123:21: ^( MEDIA_KW LOOP )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:123:40: ONCE
                            {
                            ONCE82=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet905);  
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:123:47: ^( MEDIA_KW ONCE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:124:7: IN IDENT
                    {
                    IN83=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet930);  
                    stream_IN.add(IN83);

                    IDENT84=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet932);  
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:124:19: ^( IN_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:7: PLAYER ( SOLO )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER85=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet948); 
                    PLAYER85_tree = (CommonTree)adaptor.create(PLAYER85);
                    adaptor.addChild(root_0, PLAYER85_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:14: ( SOLO )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==SOLO) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:14: SOLO
                            {
                            SOLO86=(Token)match(input,SOLO,FOLLOW_SOLO_in_declarationObjet950); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:128:1: typeEntity : IDENT ;
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT87=null;

        CommonTree IDENT87_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:128:12: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:129:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity978); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:132:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE88=null;

        CommonTree DUPLICABLE88_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:132:7: ( DUPLICABLE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:133:5: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE88=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli995); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:136:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set89=null;

        CommonTree set89_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:136:6: ( FIRST | THIRD )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:1: allocationObject : ( ( IDENT | 'value' ) ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
    public final hightParser.allocationObject_return allocationObject() throws RecognitionException {
        hightParser.allocationObject_return retval = new hightParser.allocationObject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT90=null;
        Token string_literal91=null;
        Token AT92=null;
        Token AT95=null;
        Token AT98=null;
        Token IDENT99=null;
        Token AT101=null;
        hightParser.valAggregation_return valAggregation93 = null;

        hightParser.typeCoordonnees_return typeCoordonnees94 = null;

        hightParser.coordinates_return coordinates96 = null;

        hightParser.attributListeOuObjet_return attributListeOuObjet97 = null;

        hightParser.attributTps_return attributTps100 = null;

        hightParser.operation_return operation102 = null;

        hightParser.timeUnit_return timeUnit103 = null;


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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:18: ( ( IDENT | 'value' ) ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:5: ( IDENT | 'value' ) ( AT valAggregation )?
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:5: ( IDENT | 'value' )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:6: IDENT
                            {
                            IDENT90=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject1039);  
                            stream_IDENT.add(IDENT90);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:14: 'value'
                            {
                            string_literal91=(Token)match(input,VALUE,FOLLOW_VALUE_in_allocationObject1043);  
                            stream_VALUE.add(string_literal91);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:23: ( AT valAggregation )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==AT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:24: AT valAggregation
                            {
                            AT92=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1047);  
                            stream_AT.add(AT92);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject1049);
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:143:10: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:143:33: ( valAggregation )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:144:7: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject1085);
                    typeCoordonnees94=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees94.getTree());
                    AT95=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1087);  
                    stream_AT.add(AT95);

                    pushFollow(FOLLOW_coordinates_in_allocationObject1089);
                    coordinates96=coordinates();

                    state._fsp--;

                    stream_coordinates.add(coordinates96.getTree());


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
                    // 145:7: -> ^( ALLOCATION_KW typeCoordonnees coordinates )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:145:10: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:146:7: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject1126);
                    attributListeOuObjet97=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet97.getTree());
                    AT98=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1128);  
                    stream_AT.add(AT98);

                    IDENT99=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject1130);  
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:147:10: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:148:7: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject1168);
                    attributTps100=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps100.getTree());
                    AT101=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1170);  
                    stream_AT.add(AT101);

                    pushFollow(FOLLOW_operation_in_allocationObject1172);
                    operation102=operation();

                    state._fsp--;

                    stream_operation.add(operation102.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject1174);
                    timeUnit103=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit103.getTree());


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
                    // 149:7: -> ^( ALLOCATION_KW attributTps operation timeUnit )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:149:10: ^( ALLOCATION_KW attributTps operation timeUnit )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:152:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | 'true' | 'false' );
    public final hightParser.valAggregation_return valAggregation() throws RecognitionException {
        hightParser.valAggregation_return retval = new hightParser.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        hightParser.operation_return operation104 = null;

        hightParser.timeUnit_return timeUnit105 = null;


        CommonTree IDENT106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree string_literal108_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:152:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | 'true' | 'false' )
            int alt29=4;
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
            case 221:
                {
                alt29=3;
                }
                break;
            case 222:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:153:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation1216);
                    operation104=operation();

                    state._fsp--;

                    stream_operation.add(operation104.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:153:12: ( timeUnit )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=MIN && LA28_0<=FRAME)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:153:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1219);
                            timeUnit105=timeUnit();

                            state._fsp--;

                            stream_timeUnit.add(timeUnit105.getTree());

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
                    // 154:4: -> ^( AGGREGATION_KW operation ( timeUnit )? )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:34: ( timeUnit )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:155:4: IDENT
                    {
                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1241);  
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:156:7: ^( AGGREGATION_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:157:4: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal107=(Token)match(input,221,FOLLOW_221_in_valAggregation1257); 
                    string_literal107_tree = (CommonTree)adaptor.create(string_literal107);
                    adaptor.addChild(root_0, string_literal107_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:158:4: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal108=(Token)match(input,222,FOLLOW_222_in_valAggregation1262); 
                    string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:162:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final hightParser.definition_return definition() throws RecognitionException {
        hightParser.definition_return retval = new hightParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW109=null;
        Token IDENT110=null;
        Token MEANS111=null;
        hightParser.consequences_return consequences112 = null;


        CommonTree DEFINITION_KW109_tree=null;
        CommonTree IDENT110_tree=null;
        CommonTree MEANS111_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:162:12: ( DEFINITION_KW IDENT MEANS consequences )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:162:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW109=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1275); 
            DEFINITION_KW109_tree = (CommonTree)adaptor.create(DEFINITION_KW109);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW109_tree, root_0);

            IDENT110=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1278); 
            IDENT110_tree = (CommonTree)adaptor.create(IDENT110);
            adaptor.addChild(root_0, IDENT110_tree);

            MEANS111=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1280); 
            pushFollow(FOLLOW_consequences_in_definition1283);
            consequences112=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences112.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:164:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final hightParser.consequences_return consequences() throws RecognitionException {
        hightParser.consequences_return retval = new hightParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG114=null;
        hightParser.consequ_return consequ113 = null;

        hightParser.consequ_return consequ115 = null;


        CommonTree VIRG114_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:164:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:5: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1295);
            consequ113=consequ();

            state._fsp--;

            stream_consequ.add(consequ113.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:13: ( VIRG consequ )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==VIRG) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:14: VIRG consequ
            	    {
            	    VIRG114=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1298);  
            	    stream_VIRG.add(VIRG114);

            	    pushFollow(FOLLOW_consequ_in_consequences1300);
            	    consequ115=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ115.getTree());

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
            // 166:7: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:166:9: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:169:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW OF IDENT ( DBP IDENT )? | DEFEAT_KW OF IDENT ( DBP IDENT )? );
    public final hightParser.consequ_return consequ() throws RecognitionException {
        hightParser.consequ_return retval = new hightParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT120=null;
        Token VICTORY_KW121=null;
        Token OF122=null;
        Token IDENT123=null;
        Token DBP124=null;
        Token IDENT125=null;
        Token DEFEAT_KW126=null;
        Token OF127=null;
        Token IDENT128=null;
        Token DBP129=null;
        Token IDENT130=null;
        hightParser.siAlors_return siAlors116 = null;

        hightParser.action_return action117 = null;

        hightParser.affectation_return affectation118 = null;

        hightParser.activCommande_return activCommande119 = null;


        CommonTree IDENT120_tree=null;
        CommonTree VICTORY_KW121_tree=null;
        CommonTree OF122_tree=null;
        CommonTree IDENT123_tree=null;
        CommonTree DBP124_tree=null;
        CommonTree IDENT125_tree=null;
        CommonTree DEFEAT_KW126_tree=null;
        CommonTree OF127_tree=null;
        CommonTree IDENT128_tree=null;
        CommonTree DBP129_tree=null;
        CommonTree IDENT130_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:169:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW OF IDENT ( DBP IDENT )? | DEFEAT_KW OF IDENT ( DBP IDENT )? )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:5: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1334);
                    siAlors116=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors116.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:7: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1342);
                    action117=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action117.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:172:7: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1350);
                    affectation118=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation118.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:7: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1358);
                    activCommande119=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande119.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:7: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT120=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1366); 
                    IDENT120_tree = (CommonTree)adaptor.create(IDENT120);
                    adaptor.addChild(root_0, IDENT120_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:7: VICTORY_KW OF IDENT ( DBP IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW121=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1374); 
                    VICTORY_KW121_tree = (CommonTree)adaptor.create(VICTORY_KW121);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW121_tree, root_0);

                    OF122=(Token)match(input,OF,FOLLOW_OF_in_consequ1377); 
                    IDENT123=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1380); 
                    IDENT123_tree = (CommonTree)adaptor.create(IDENT123);
                    adaptor.addChild(root_0, IDENT123_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:29: ( DBP IDENT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==DBP) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:30: DBP IDENT
                            {
                            DBP124=(Token)match(input,DBP,FOLLOW_DBP_in_consequ1383); 
                            DBP124_tree = (CommonTree)adaptor.create(DBP124);
                            adaptor.addChild(root_0, DBP124_tree);

                            IDENT125=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1385); 
                            IDENT125_tree = (CommonTree)adaptor.create(IDENT125);
                            adaptor.addChild(root_0, IDENT125_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:7: DEFEAT_KW OF IDENT ( DBP IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW126=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1395); 
                    DEFEAT_KW126_tree = (CommonTree)adaptor.create(DEFEAT_KW126);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW126_tree, root_0);

                    OF127=(Token)match(input,OF,FOLLOW_OF_in_consequ1398); 
                    IDENT128=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1401); 
                    IDENT128_tree = (CommonTree)adaptor.create(IDENT128);
                    adaptor.addChild(root_0, IDENT128_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:28: ( DBP IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==DBP) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:29: DBP IDENT
                            {
                            DBP129=(Token)match(input,DBP,FOLLOW_DBP_in_consequ1404); 
                            DBP129_tree = (CommonTree)adaptor.create(DBP129);
                            adaptor.addChild(root_0, DBP129_tree);

                            IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1406); 
                            IDENT130_tree = (CommonTree)adaptor.create(IDENT130);
                            adaptor.addChild(root_0, IDENT130_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT );
    public final hightParser.action_return action() throws RecognitionException {
        hightParser.action_return retval = new hightParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set133=null;
        Token ENDS_KW134=null;
        Token STARTS_KW135=null;
        Token PAUSE_KW136=null;
        Token char_literal137=null;
        Token IDENT138=null;
        Token PAUSE_KW139=null;
        Token MUTE_KW140=null;
        Token set141=null;
        Token PLAY_KW142=null;
        Token STOP_KW143=null;
        Token IDENT144=null;
        Token BLOCK_KW145=null;
        Token OF147=null;
        Token EFFACE_KW150=null;
        Token GENERATE_KW151=null;
        Token IN154=null;
        Token ON155=null;
        Token AT157=null;
        Token WAIT_KW159=null;
        Token THEN162=null;
        Token ENDWAIT164=null;
        Token SAVE_KW165=null;
        Token NEXTURN_KW166=null;
        Token IDENT167=null;
        Token IDENT168=null;
        Token GRASPS_KW169=null;
        Token IDENT170=null;
        Token IDENT171=null;
        Token EXPELS_KW172=null;
        Token IDENT173=null;
        Token BY174=null;
        Token IDENT176=null;
        Token INGESTS_KW177=null;
        Token IDENT178=null;
        Token IN179=null;
        Token IDENT180=null;
        hightParser.accesClasse_return accesClasse131 = null;

        hightParser.actionObjet_return actionObjet132 = null;

        hightParser.transformation_return transformation146 = null;

        hightParser.accesClasse_return accesClasse148 = null;

        hightParser.coordinates_return coordinates149 = null;

        hightParser.operation_return operation152 = null;

        hightParser.accesLocal_return accesLocal153 = null;

        hightParser.accesLocal_return accesLocal156 = null;

        hightParser.coordinates_return coordinates158 = null;

        hightParser.operation_return operation160 = null;

        hightParser.timeUnit_return timeUnit161 = null;

        hightParser.consequences_return consequences163 = null;

        hightParser.operation_return operation175 = null;


        CommonTree set133_tree=null;
        CommonTree ENDS_KW134_tree=null;
        CommonTree STARTS_KW135_tree=null;
        CommonTree PAUSE_KW136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree IDENT138_tree=null;
        CommonTree PAUSE_KW139_tree=null;
        CommonTree MUTE_KW140_tree=null;
        CommonTree set141_tree=null;
        CommonTree PLAY_KW142_tree=null;
        CommonTree STOP_KW143_tree=null;
        CommonTree IDENT144_tree=null;
        CommonTree BLOCK_KW145_tree=null;
        CommonTree OF147_tree=null;
        CommonTree EFFACE_KW150_tree=null;
        CommonTree GENERATE_KW151_tree=null;
        CommonTree IN154_tree=null;
        CommonTree ON155_tree=null;
        CommonTree AT157_tree=null;
        CommonTree WAIT_KW159_tree=null;
        CommonTree THEN162_tree=null;
        CommonTree ENDWAIT164_tree=null;
        CommonTree SAVE_KW165_tree=null;
        CommonTree NEXTURN_KW166_tree=null;
        CommonTree IDENT167_tree=null;
        CommonTree IDENT168_tree=null;
        CommonTree GRASPS_KW169_tree=null;
        CommonTree IDENT170_tree=null;
        CommonTree IDENT171_tree=null;
        CommonTree EXPELS_KW172_tree=null;
        CommonTree IDENT173_tree=null;
        CommonTree BY174_tree=null;
        CommonTree IDENT176_tree=null;
        CommonTree INGESTS_KW177_tree=null;
        CommonTree IDENT178_tree=null;
        CommonTree IN179_tree=null;
        CommonTree IDENT180_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT )
            int alt41=11;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:180:5: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1426);
                    accesClasse131=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse131.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1428);
                    actionObjet132=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet132.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:7: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set133=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set133));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:22: ( ENDS_KW | STARTS_KW | PAUSE_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:23: ENDS_KW
                            {
                            ENDS_KW134=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1445); 
                            ENDS_KW134_tree = (CommonTree)adaptor.create(ENDS_KW134);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW134_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:34: STARTS_KW
                            {
                            STARTS_KW135=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1450); 
                            STARTS_KW135_tree = (CommonTree)adaptor.create(STARTS_KW135);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW135_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:47: PAUSE_KW
                            {
                            PAUSE_KW136=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1455); 
                            PAUSE_KW136_tree = (CommonTree)adaptor.create(PAUSE_KW136);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW136_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:58: ( ':' IDENT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==DBP) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:59: ':' IDENT
                            {
                            char_literal137=(Token)match(input,DBP,FOLLOW_DBP_in_action1460); 
                            char_literal137_tree = (CommonTree)adaptor.create(char_literal137);
                            adaptor.addChild(root_0, char_literal137_tree);

                            IDENT138=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1462); 
                            IDENT138_tree = (CommonTree)adaptor.create(IDENT138);
                            adaptor.addChild(root_0, IDENT138_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:7: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:7: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:8: PAUSE_KW
                            {
                            PAUSE_KW139=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1475); 
                            PAUSE_KW139_tree = (CommonTree)adaptor.create(PAUSE_KW139);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW139_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:20: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW140=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1480); 
                            MUTE_KW140_tree = (CommonTree)adaptor.create(MUTE_KW140);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW140_tree, root_0);

                            set141=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set141));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:42: PLAY_KW
                            {
                            PLAY_KW142=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1493); 
                            PLAY_KW142_tree = (CommonTree)adaptor.create(PLAY_KW142);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW142_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:53: STOP_KW
                            {
                            STOP_KW143=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1498); 
                            STOP_KW143_tree = (CommonTree)adaptor.create(STOP_KW143);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW143_tree, root_0);


                            }
                            break;

                    }

                    IDENT144=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1503); 
                    IDENT144_tree = (CommonTree)adaptor.create(IDENT144);
                    adaptor.addChild(root_0, IDENT144_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:183:7: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW145=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1511); 
                    BLOCK_KW145_tree = (CommonTree)adaptor.create(BLOCK_KW145);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW145_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1514);
                    transformation146=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation146.getTree());
                    OF147=(Token)match(input,OF,FOLLOW_OF_in_action1516); 
                    pushFollow(FOLLOW_accesClasse_in_action1519);
                    accesClasse148=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse148.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1521);
                    coordinates149=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates149.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:7: ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:7: ( EFFACE_KW | GENERATE_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:8: EFFACE_KW
                            {
                            EFFACE_KW150=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1530); 
                            EFFACE_KW150_tree = (CommonTree)adaptor.create(EFFACE_KW150);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW150_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:21: GENERATE_KW
                            {
                            GENERATE_KW151=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1535); 
                            GENERATE_KW151_tree = (CommonTree)adaptor.create(GENERATE_KW151);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW151_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:35: ( ( operation )? accesLocal )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:36: ( operation )? accesLocal
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:36: ( operation )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:36: operation
                            {
                            pushFollow(FOLLOW_operation_in_action1540);
                            operation152=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation152.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesLocal_in_action1543);
                    accesLocal153=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal153.getTree());

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:59: ( ( IN | ON ) accesLocal | AT coordinates )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:60: ( IN | ON ) accesLocal
                            {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:60: ( IN | ON )
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
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:61: IN
                                    {
                                    IN154=(Token)match(input,IN,FOLLOW_IN_in_action1548); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:65: ON
                                    {
                                    ON155=(Token)match(input,ON,FOLLOW_ON_in_action1551); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1555);
                            accesLocal156=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal156.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:83: AT coordinates
                            {
                            AT157=(Token)match(input,AT,FOLLOW_AT_in_action1559); 
                            pushFollow(FOLLOW_coordinates_in_action1562);
                            coordinates158=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates158.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:7: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW159=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1573); 
                    WAIT_KW159_tree = (CommonTree)adaptor.create(WAIT_KW159);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW159_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1576);
                    operation160=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation160.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1578);
                    timeUnit161=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit161.getTree());
                    THEN162=(Token)match(input,THEN,FOLLOW_THEN_in_action1580); 
                    pushFollow(FOLLOW_consequences_in_action1583);
                    consequences163=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences163.getTree());
                    ENDWAIT164=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1585); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:186:7: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW165=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1594); 
                    SAVE_KW165_tree = (CommonTree)adaptor.create(SAVE_KW165);
                    adaptor.addChild(root_0, SAVE_KW165_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:187:7: NEXTURN_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEXTURN_KW166=(Token)match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1602); 
                    NEXTURN_KW166_tree = (CommonTree)adaptor.create(NEXTURN_KW166);
                    root_0 = (CommonTree)adaptor.becomeRoot(NEXTURN_KW166_tree, root_0);

                    IDENT167=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1605); 
                    IDENT167_tree = (CommonTree)adaptor.create(IDENT167);
                    adaptor.addChild(root_0, IDENT167_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:189:7: IDENT GRASPS_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT168=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1661); 
                    IDENT168_tree = (CommonTree)adaptor.create(IDENT168);
                    adaptor.addChild(root_0, IDENT168_tree);

                    GRASPS_KW169=(Token)match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1663); 
                    GRASPS_KW169_tree = (CommonTree)adaptor.create(GRASPS_KW169);
                    root_0 = (CommonTree)adaptor.becomeRoot(GRASPS_KW169_tree, root_0);

                    IDENT170=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1666); 
                    IDENT170_tree = (CommonTree)adaptor.create(IDENT170);
                    adaptor.addChild(root_0, IDENT170_tree);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:190:7: IDENT EXPELS_KW IDENT BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT171=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1674); 
                    IDENT171_tree = (CommonTree)adaptor.create(IDENT171);
                    adaptor.addChild(root_0, IDENT171_tree);

                    EXPELS_KW172=(Token)match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1676); 
                    EXPELS_KW172_tree = (CommonTree)adaptor.create(EXPELS_KW172);
                    root_0 = (CommonTree)adaptor.becomeRoot(EXPELS_KW172_tree, root_0);

                    IDENT173=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1679); 
                    IDENT173_tree = (CommonTree)adaptor.create(IDENT173);
                    adaptor.addChild(root_0, IDENT173_tree);

                    BY174=(Token)match(input,BY,FOLLOW_BY_in_action1681); 
                    pushFollow(FOLLOW_operation_in_action1684);
                    operation175=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation175.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:191:7: IDENT INGESTS_KW IDENT IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT176=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1692); 
                    IDENT176_tree = (CommonTree)adaptor.create(IDENT176);
                    adaptor.addChild(root_0, IDENT176_tree);

                    INGESTS_KW177=(Token)match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1694); 
                    INGESTS_KW177_tree = (CommonTree)adaptor.create(INGESTS_KW177);
                    root_0 = (CommonTree)adaptor.becomeRoot(INGESTS_KW177_tree, root_0);

                    IDENT178=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1697); 
                    IDENT178_tree = (CommonTree)adaptor.create(IDENT178);
                    adaptor.addChild(root_0, IDENT178_tree);

                    IN179=(Token)match(input,IN,FOLLOW_IN_in_action1699); 
                    IDENT180=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1702); 
                    IDENT180_tree = (CommonTree)adaptor.create(IDENT180);
                    adaptor.addChild(root_0, IDENT180_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )? | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final hightParser.actionObjet_return actionObjet() throws RecognitionException {
        hightParser.actionObjet_return retval = new hightParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW181=null;
        Token DURING184=null;
        Token UNTIL187=null;
        Token HAPPENS189=null;
        Token EQUIP190=null;
        Token NEXT192=null;
        Token PREVIOUS193=null;
        hightParser.actionCommandePressee_return actionCommandePressee182 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue183 = null;

        hightParser.operation_return operation185 = null;

        hightParser.timeUnit_return timeUnit186 = null;

        hightParser.conditions_return conditions188 = null;

        hightParser.accesLocal_return accesLocal191 = null;


        CommonTree DIES_KW181_tree=null;
        CommonTree DURING184_tree=null;
        CommonTree UNTIL187_tree=null;
        CommonTree HAPPENS189_tree=null;
        CommonTree EQUIP190_tree=null;
        CommonTree NEXT192_tree=null;
        CommonTree PREVIOUS193_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )? | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:5: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW181=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1745); 
                    DIES_KW181_tree = (CommonTree)adaptor.create(DIES_KW181);
                    adaptor.addChild(root_0, DIES_KW181_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:197:7: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1753);
                    actionCommandePressee182=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee182.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:198:7: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1761);
                    actionCommandeMaintenue183=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue183.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:198:31: ( DURING operation timeUnit | UNTIL conditions HAPPENS )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:198:32: DURING operation timeUnit
                            {
                            DURING184=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1764); 
                            DURING184_tree = (CommonTree)adaptor.create(DURING184);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING184_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1767);
                            operation185=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation185.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1769);
                            timeUnit186=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit186.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:198:61: UNTIL conditions HAPPENS
                            {
                            UNTIL187=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1773); 
                            UNTIL187_tree = (CommonTree)adaptor.create(UNTIL187);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL187_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1776);
                            conditions188=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions188.getTree());
                            HAPPENS189=(Token)match(input,HAPPENS,FOLLOW_HAPPENS_in_actionObjet1778); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:7: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP190=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1789); 
                    EQUIP190_tree = (CommonTree)adaptor.create(EQUIP190);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP190_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:14: ( accesLocal | NEXT | PREVIOUS )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:15: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1793);
                            accesLocal191=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal191.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:28: NEXT
                            {
                            NEXT192=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1797); 
                            NEXT192_tree = (CommonTree)adaptor.create(NEXT192);
                            adaptor.addChild(root_0, NEXT192_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:35: PREVIOUS
                            {
                            PREVIOUS193=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1801); 
                            PREVIOUS193_tree = (CommonTree)adaptor.create(PREVIOUS193);
                            adaptor.addChild(root_0, PREVIOUS193_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:1: actionCommandePressee : JUMP operation ;
    public final hightParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        hightParser.actionCommandePressee_return retval = new hightParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP194=null;
        hightParser.operation_return operation195 = null;


        CommonTree JUMP194_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:23: ( JUMP operation )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:203:5: JUMP operation
            {
            root_0 = (CommonTree)adaptor.nil();

            JUMP194=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1821); 
            JUMP194_tree = (CommonTree)adaptor.create(JUMP194);
            root_0 = (CommonTree)adaptor.becomeRoot(JUMP194_tree, root_0);

            pushFollow(FOLLOW_operation_in_actionCommandePressee1824);
            operation195=operation();

            state._fsp--;

            adaptor.addChild(root_0, operation195.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:206:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation | TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation | ACCELERATE BY operation | BRAKE BY operation );
    public final hightParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        hightParser.actionCommandeMaintenue_return retval = new hightParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE196=null;
        Token set197=null;
        Token BY198=null;
        Token TURN200=null;
        Token set201=null;
        Token BY202=null;
        Token ACCELERATE204=null;
        Token BY205=null;
        Token BRAKE207=null;
        Token BY208=null;
        hightParser.operation_return operation199 = null;

        hightParser.operation_return operation203 = null;

        hightParser.operation_return operation206 = null;

        hightParser.operation_return operation209 = null;


        CommonTree MOVE196_tree=null;
        CommonTree set197_tree=null;
        CommonTree BY198_tree=null;
        CommonTree TURN200_tree=null;
        CommonTree set201_tree=null;
        CommonTree BY202_tree=null;
        CommonTree ACCELERATE204_tree=null;
        CommonTree BY205_tree=null;
        CommonTree BRAKE207_tree=null;
        CommonTree BY208_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:206:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation | TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation | ACCELERATE BY operation | BRAKE BY operation )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:207:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE196=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1841); 
                    MOVE196_tree = (CommonTree)adaptor.create(MOVE196);
                    root_0 = (CommonTree)adaptor.becomeRoot(MOVE196_tree, root_0);

                    set197=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=WDOWN) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set197));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    BY198=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1868); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1871);
                    operation199=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation199.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:208:5: TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN200=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1877); 
                    TURN200_tree = (CommonTree)adaptor.create(TURN200);
                    root_0 = (CommonTree)adaptor.becomeRoot(TURN200_tree, root_0);

                    set201=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set201));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    BY202=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1897); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1900);
                    operation203=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation203.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:209:5: ACCELERATE BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE204=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1906); 
                    ACCELERATE204_tree = (CommonTree)adaptor.create(ACCELERATE204);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACCELERATE204_tree, root_0);

                    BY205=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1909); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1912);
                    operation206=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation206.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:210:5: BRAKE BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE207=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1918); 
                    BRAKE207_tree = (CommonTree)adaptor.create(BRAKE207);
                    root_0 = (CommonTree)adaptor.becomeRoot(BRAKE207_tree, root_0);

                    BY208=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1921); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1924);
                    operation209=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation209.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:213:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set210=null;

        CommonTree set210_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:213:16: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set210=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set210));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:219:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation211 = null;

        hightParser.operation_return operation212 = null;

        hightParser.operation_return operation213 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:219:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:220:5: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1973);
            operation211=operation();

            state._fsp--;

            stream_operation.add(operation211.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1975);
            operation212=operation();

            state._fsp--;

            stream_operation.add(operation212.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1977);
            operation213=operation();

            state._fsp--;

            stream_operation.add(operation213.getTree());


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
            // 221:7: -> ^( COORDINATE_KW operation operation operation )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:10: ^( COORDINATE_KW operation operation operation )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:226:1: commande : COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )* ;
    public final hightParser.commande_return commande() throws RecognitionException {
        hightParser.commande_return retval = new hightParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW214=null;
        Token FOR215=null;
        Token IS217=null;
        Token VIRG219=null;
        hightParser.player_list_return player_list216 = null;

        hightParser.actionCommande_return actionCommande218 = null;

        hightParser.actionCommande_return actionCommande220 = null;


        CommonTree COMMAND_KW214_tree=null;
        CommonTree FOR215_tree=null;
        CommonTree IS217_tree=null;
        CommonTree VIRG219_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:226:10: ( COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:5: COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW214=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2016); 
            COMMAND_KW214_tree = (CommonTree)adaptor.create(COMMAND_KW214);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW214_tree, root_0);

            FOR215=(Token)match(input,FOR,FOLLOW_FOR_in_commande2019); 
            pushFollow(FOLLOW_player_list_in_commande2022);
            player_list216=player_list();

            state._fsp--;

            adaptor.addChild(root_0, player_list216.getTree());
            IS217=(Token)match(input,IS,FOLLOW_IS_in_commande2024); 
            pushFollow(FOLLOW_actionCommande_in_commande2027);
            actionCommande218=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande218.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:53: ( VIRG actionCommande )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==VIRG) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:54: VIRG actionCommande
            	    {
            	    VIRG219=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande2030); 
            	    pushFollow(FOLLOW_actionCommande_in_commande2033);
            	    actionCommande220=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande220.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:230:1: player_list : IDENT ( VIRG IDENT )* ;
    public final hightParser.player_list_return player_list() throws RecognitionException {
        hightParser.player_list_return retval = new hightParser.player_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT221=null;
        Token VIRG222=null;
        Token IDENT223=null;

        CommonTree IDENT221_tree=null;
        CommonTree VIRG222_tree=null;
        CommonTree IDENT223_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:230:12: ( IDENT ( VIRG IDENT )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:231:5: IDENT ( VIRG IDENT )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT221=(Token)match(input,IDENT,FOLLOW_IDENT_in_player_list2052); 
            IDENT221_tree = (CommonTree)adaptor.create(IDENT221);
            adaptor.addChild(root_0, IDENT221_tree);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:231:11: ( VIRG IDENT )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==VIRG) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:231:12: VIRG IDENT
            	    {
            	    VIRG222=(Token)match(input,VIRG,FOLLOW_VIRG_in_player_list2055); 
            	    IDENT223=(Token)match(input,IDENT,FOLLOW_IDENT_in_player_list2058); 
            	    IDENT223_tree = (CommonTree)adaptor.create(IDENT223);
            	    adaptor.addChild(root_0, IDENT223_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:234:1: actionCommande : ( MOUSE souris ( commandMode )? FOR definitionId -> ^( MOUSE_KW souris ( commandMode )? definitionId ) | KEY clavier ( commandMode )? FOR definitionId -> ^( KEY_KW clavier ( commandMode )? definitionId ) );
    public final hightParser.actionCommande_return actionCommande() throws RecognitionException {
        hightParser.actionCommande_return retval = new hightParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE224=null;
        Token FOR227=null;
        Token KEY229=null;
        Token FOR232=null;
        hightParser.souris_return souris225 = null;

        hightParser.commandMode_return commandMode226 = null;

        hightParser.definitionId_return definitionId228 = null;

        hightParser.clavier_return clavier230 = null;

        hightParser.commandMode_return commandMode231 = null;

        hightParser.definitionId_return definitionId233 = null;


        CommonTree MOUSE224_tree=null;
        CommonTree FOR227_tree=null;
        CommonTree KEY229_tree=null;
        CommonTree FOR232_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_commandMode=new RewriteRuleSubtreeStream(adaptor,"rule commandMode");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        RewriteRuleSubtreeStream stream_definitionId=new RewriteRuleSubtreeStream(adaptor,"rule definitionId");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:234:16: ( MOUSE souris ( commandMode )? FOR definitionId -> ^( MOUSE_KW souris ( commandMode )? definitionId ) | KEY clavier ( commandMode )? FOR definitionId -> ^( KEY_KW clavier ( commandMode )? definitionId ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:5: MOUSE souris ( commandMode )? FOR definitionId
                    {
                    MOUSE224=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_actionCommande2077);  
                    stream_MOUSE.add(MOUSE224);

                    pushFollow(FOLLOW_souris_in_actionCommande2079);
                    souris225=souris();

                    state._fsp--;

                    stream_souris.add(souris225.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:18: ( commandMode )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=PRESSED_KW && LA48_0<=RELEASED_KW)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:19: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2082);
                            commandMode226=commandMode();

                            state._fsp--;

                            stream_commandMode.add(commandMode226.getTree());

                            }
                            break;

                    }

                    FOR227=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande2086);  
                    stream_FOR.add(FOR227);

                    pushFollow(FOLLOW_definitionId_in_actionCommande2088);
                    definitionId228=definitionId();

                    state._fsp--;

                    stream_definitionId.add(definitionId228.getTree());


                    // AST REWRITE
                    // elements: souris, definitionId, commandMode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:7: -> ^( MOUSE_KW souris ( commandMode )? definitionId )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:236:10: ^( MOUSE_KW souris ( commandMode )? definitionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        adaptor.addChild(root_1, stream_souris.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:236:28: ( commandMode )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:7: KEY clavier ( commandMode )? FOR definitionId
                    {
                    KEY229=(Token)match(input,KEY,FOLLOW_KEY_in_actionCommande2117);  
                    stream_KEY.add(KEY229);

                    pushFollow(FOLLOW_clavier_in_actionCommande2119);
                    clavier230=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier230.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:19: ( commandMode )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=PRESSED_KW && LA49_0<=RELEASED_KW)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:20: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2122);
                            commandMode231=commandMode();

                            state._fsp--;

                            stream_commandMode.add(commandMode231.getTree());

                            }
                            break;

                    }

                    FOR232=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande2126);  
                    stream_FOR.add(FOR232);

                    pushFollow(FOLLOW_definitionId_in_actionCommande2128);
                    definitionId233=definitionId();

                    state._fsp--;

                    stream_definitionId.add(definitionId233.getTree());


                    // AST REWRITE
                    // elements: clavier, commandMode, definitionId
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:7: -> ^( KEY_KW clavier ( commandMode )? definitionId )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:10: ^( KEY_KW clavier ( commandMode )? definitionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY_KW, "KEY_KW"), root_1);

                        adaptor.addChild(root_1, stream_clavier.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:27: ( commandMode )?
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:241:1: commandMode : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final hightParser.commandMode_return commandMode() throws RecognitionException {
        hightParser.commandMode_return retval = new hightParser.commandMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set234=null;

        CommonTree set234_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:241:13: ( PRESSED_KW | HELD_KW | RELEASED_KW )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set234=(Token)input.LT(1);
            if ( (input.LA(1)>=PRESSED_KW && input.LA(1)<=RELEASED_KW) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set234));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:245:1: definitionId : IDENT ;
    public final hightParser.definitionId_return definitionId() throws RecognitionException {
        hightParser.definitionId_return retval = new hightParser.definitionId_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT235=null;

        CommonTree IDENT235_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:245:14: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:246:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT235=(Token)match(input,IDENT,FOLLOW_IDENT_in_definitionId2191); 
            IDENT235_tree = (CommonTree)adaptor.create(IDENT235);
            adaptor.addChild(root_0, IDENT235_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:249:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set236=null;

        CommonTree set236_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:249:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set236=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLICK_LEFT && input.LA(1)<=SCROLL_DOWN) ) {
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
    // $ANTLR end "souris"

    public static class clavier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clavier"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set237=null;

        CommonTree set237_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set237=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
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
    // $ANTLR end "clavier"

    public static class activCommande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activCommande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:257:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) typeCommand ;
    public final hightParser.activCommande_return activCommande() throws RecognitionException {
        hightParser.activCommande_return retval = new hightParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW238=null;
        Token DISABLE_KW239=null;
        hightParser.typeCommand_return typeCommand240 = null;


        CommonTree ACTIVATE_KW238_tree=null;
        CommonTree DISABLE_KW239_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:257:15: ( ( ACTIVATE_KW | DISABLE_KW ) typeCommand )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:258:5: ( ACTIVATE_KW | DISABLE_KW ) typeCommand
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:258:5: ( ACTIVATE_KW | DISABLE_KW )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:258:6: ACTIVATE_KW
                    {
                    ACTIVATE_KW238=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2317); 
                    ACTIVATE_KW238_tree = (CommonTree)adaptor.create(ACTIVATE_KW238);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW238_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:258:21: DISABLE_KW
                    {
                    DISABLE_KW239=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2322); 
                    DISABLE_KW239_tree = (CommonTree)adaptor.create(DISABLE_KW239);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW239_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeCommand_in_activCommande2326);
            typeCommand240=typeCommand();

            state._fsp--;

            adaptor.addChild(root_0, typeCommand240.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:261:1: typeCommand : ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD );
    public final hightParser.typeCommand_return typeCommand() throws RecognitionException {
        hightParser.typeCommand_return retval = new hightParser.typeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMANDS241=null;
        Token MOUSE242=null;
        Token VIRG244=null;
        Token KEY246=null;
        Token VIRG248=null;
        Token KEYBOARD250=null;
        hightParser.souris_return souris243 = null;

        hightParser.souris_return souris245 = null;

        hightParser.clavier_return clavier247 = null;

        hightParser.clavier_return clavier249 = null;


        CommonTree COMMANDS241_tree=null;
        CommonTree MOUSE242_tree=null;
        CommonTree VIRG244_tree=null;
        CommonTree KEY246_tree=null;
        CommonTree VIRG248_tree=null;
        CommonTree KEYBOARD250_tree=null;
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:261:13: ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:5: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMANDS241=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2343); 
                    COMMANDS241_tree = (CommonTree)adaptor.create(COMMANDS241);
                    adaptor.addChild(root_0, COMMANDS241_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:7: MOUSE ( souris ( VIRG souris )* )?
                    {
                    MOUSE242=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_typeCommand2351);  
                    stream_MOUSE.add(MOUSE242);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:13: ( souris ( VIRG souris )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=LEFT && LA53_0<=RIGHT)||(LA53_0>=WUP && LA53_0<=WDOWN)||(LA53_0>=CLICK_LEFT && LA53_0<=SCROLL_DOWN)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:14: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_typeCommand2354);
                            souris243=souris();

                            state._fsp--;

                            stream_souris.add(souris243.getTree());
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:21: ( VIRG souris )*
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
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:22: VIRG souris
                            	    {
                            	    VIRG244=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand2357);  
                            	    stream_VIRG.add(VIRG244);

                            	    pushFollow(FOLLOW_souris_in_typeCommand2359);
                            	    souris245=souris();

                            	    state._fsp--;

                            	    stream_souris.add(souris245.getTree());

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
                    // 264:7: -> ^( MOUSE_KW ( souris )* )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:10: ^( MOUSE_KW ( souris )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:21: ( souris )*
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:7: KEY clavier ( VIRG clavier )*
                    {
                    KEY246=(Token)match(input,KEY,FOLLOW_KEY_in_typeCommand2386);  
                    stream_KEY.add(KEY246);

                    pushFollow(FOLLOW_clavier_in_typeCommand2388);
                    clavier247=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier247.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:19: ( VIRG clavier )*
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
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:20: VIRG clavier
                    	    {
                    	    VIRG248=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand2391);  
                    	    stream_VIRG.add(VIRG248);

                    	    pushFollow(FOLLOW_clavier_in_typeCommand2393);
                    	    clavier249=clavier();

                    	    state._fsp--;

                    	    stream_clavier.add(clavier249.getTree());

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
                    // 266:7: -> ^( KEY_KW ( clavier )+ )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:266:10: ^( KEY_KW ( clavier )+ )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:267:7: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KEYBOARD250=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2418); 
                    KEYBOARD250_tree = (CommonTree)adaptor.create(KEYBOARD250);
                    adaptor.addChild(root_0, KEYBOARD250_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:1: reglesJeu : RULE_KW declencheur THEN definitionId ;
    public final hightParser.reglesJeu_return reglesJeu() throws RecognitionException {
        hightParser.reglesJeu_return retval = new hightParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW251=null;
        Token THEN253=null;
        hightParser.declencheur_return declencheur252 = null;

        hightParser.definitionId_return definitionId254 = null;


        CommonTree RULE_KW251_tree=null;
        CommonTree THEN253_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:11: ( RULE_KW declencheur THEN definitionId )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:270:5: RULE_KW declencheur THEN definitionId
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW251=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2430); 
            RULE_KW251_tree = (CommonTree)adaptor.create(RULE_KW251);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW251_tree, root_0);

            pushFollow(FOLLOW_declencheur_in_reglesJeu2433);
            declencheur252=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur252.getTree());
            THEN253=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu2435); 
            pushFollow(FOLLOW_definitionId_in_reglesJeu2438);
            definitionId254=definitionId();

            state._fsp--;

            adaptor.addChild(root_0, definitionId254.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | VICTORY_KW OF ( PLAYER | IDENT ) | DEFEAT_KW OF ( PLAYER | IDENT ) );
    public final hightParser.declencheur_return declencheur() throws RecognitionException {
        hightParser.declencheur_return retval = new hightParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW256=null;
        Token DIES_KW257=null;
        Token set260=null;
        Token ENDS_KW261=null;
        Token STARTS_KW262=null;
        Token BECOMES264=null;
        Token VICTORY_KW266=null;
        Token OF267=null;
        Token set268=null;
        Token DEFEAT_KW269=null;
        Token OF270=null;
        Token set271=null;
        hightParser.accesClasse_return accesClasse255 = null;

        hightParser.declencheurTK_return declencheurTK258 = null;

        hightParser.declencheurKT_return declencheurKT259 = null;

        hightParser.variable_return variable263 = null;

        hightParser.varOuNB_return varOuNB265 = null;


        CommonTree MOVES_KW256_tree=null;
        CommonTree DIES_KW257_tree=null;
        CommonTree set260_tree=null;
        CommonTree ENDS_KW261_tree=null;
        CommonTree STARTS_KW262_tree=null;
        CommonTree BECOMES264_tree=null;
        CommonTree VICTORY_KW266_tree=null;
        CommonTree OF267_tree=null;
        CommonTree set268_tree=null;
        CommonTree DEFEAT_KW269_tree=null;
        CommonTree OF270_tree=null;
        CommonTree set271_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | VICTORY_KW OF ( PLAYER | IDENT ) | DEFEAT_KW OF ( PLAYER | IDENT ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:5: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur2456);
                    accesClasse255=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse255.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:17: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:18: MOVES_KW
                            {
                            MOVES_KW256=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2459); 
                            MOVES_KW256_tree = (CommonTree)adaptor.create(MOVES_KW256);
                            adaptor.addChild(root_0, MOVES_KW256_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:29: DIES_KW
                            {
                            DIES_KW257=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2463); 
                            DIES_KW257_tree = (CommonTree)adaptor.create(DIES_KW257);
                            adaptor.addChild(root_0, DIES_KW257_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:39: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2467);
                            declencheurTK258=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK258.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:55: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2471);
                            declencheurKT259=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT259.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:7: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set260=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set260));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:22: ( ENDS_KW | STARTS_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:23: ENDS_KW
                            {
                            ENDS_KW261=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2489); 
                            ENDS_KW261_tree = (CommonTree)adaptor.create(ENDS_KW261);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW261_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:33: STARTS_KW
                            {
                            STARTS_KW262=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2493); 
                            STARTS_KW262_tree = (CommonTree)adaptor.create(STARTS_KW262);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW262_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:7: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur2513);
                    variable263=variable();

                    state._fsp--;

                    stream_variable.add(variable263.getTree());
                    BECOMES264=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur2515);  
                    stream_BECOMES.add(BECOMES264);

                    pushFollow(FOLLOW_varOuNB_in_declencheur2517);
                    varOuNB265=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB265.getTree());


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
                    // 277:7: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:277:10: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:7: VICTORY_KW OF ( PLAYER | IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW266=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2541); 
                    VICTORY_KW266_tree = (CommonTree)adaptor.create(VICTORY_KW266);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW266_tree, root_0);

                    OF267=(Token)match(input,OF,FOLLOW_OF_in_declencheur2544); 
                    set268=(Token)input.LT(1);
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set268));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:7: DEFEAT_KW OF ( PLAYER | IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW269=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2561); 
                    DEFEAT_KW269_tree = (CommonTree)adaptor.create(DEFEAT_KW269);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW269_tree, root_0);

                    OF270=(Token)match(input,OF,FOLLOW_OF_in_declencheur2564); 
                    set271=(Token)input.LT(1);
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set271));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT273=null;
        hightParser.variable_return variable272 = null;


        CommonTree FLOAT273_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:9: ( variable | FLOAT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:5: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB2589);
                    variable272=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable272.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:16: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT273=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2593); 
                    FLOAT273_tree = (CommonTree)adaptor.create(FLOAT273);
                    adaptor.addChild(root_0, FLOAT273_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:285:1: declencheurTK : ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal ) ;
    public final hightParser.declencheurTK_return declencheurTK() throws RecognitionException {
        hightParser.declencheurTK_return retval = new hightParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW274=null;
        Token KILLS_KW275=null;
        Token OWNES_KW276=null;
        Token NOTOWNES_KW277=null;
        Token OTHER278=null;
        hightParser.accesLocal_return accesLocal279 = null;


        CommonTree TOUCHES_KW274_tree=null;
        CommonTree KILLS_KW275_tree=null;
        CommonTree OWNES_KW276_tree=null;
        CommonTree NOTOWNES_KW277_tree=null;
        CommonTree OTHER278_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:285:15: ( ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:5: ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:5: ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:6: TOUCHES_KW
                    {
                    TOUCHES_KW274=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2606); 
                    TOUCHES_KW274_tree = (CommonTree)adaptor.create(TOUCHES_KW274);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW274_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:20: KILLS_KW
                    {
                    KILLS_KW275=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2611); 
                    KILLS_KW275_tree = (CommonTree)adaptor.create(KILLS_KW275);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW275_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:32: OWNES_KW
                    {
                    OWNES_KW276=(Token)match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2616); 
                    OWNES_KW276_tree = (CommonTree)adaptor.create(OWNES_KW276);
                    root_0 = (CommonTree)adaptor.becomeRoot(OWNES_KW276_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:44: NOTOWNES_KW
                    {
                    NOTOWNES_KW277=(Token)match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2621); 
                    NOTOWNES_KW277_tree = (CommonTree)adaptor.create(NOTOWNES_KW277);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOTOWNES_KW277_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:58: ( ( OTHER )? accesLocal )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:59: ( OTHER )? accesLocal
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:59: ( OTHER )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==OTHER) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:60: OTHER
                    {
                    OTHER278=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2627); 
                    OTHER278_tree = (CommonTree)adaptor.create(OTHER278);
                    adaptor.addChild(root_0, OTHER278_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_accesLocal_in_declencheurTK2631);
            accesLocal279=accesLocal();

            state._fsp--;

            adaptor.addChild(root_0, accesLocal279.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:288:1: declencheurKT : ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )? ;
    public final hightParser.declencheurKT_return declencheurKT() throws RecognitionException {
        hightParser.declencheurKT_return retval = new hightParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW280=null;
        Token TOUCHED_KW281=null;
        Token OWNED_KW282=null;
        Token NOTOWNED_KW283=null;
        Token BY284=null;
        Token OTHER285=null;
        hightParser.accesLocal_return accesLocal286 = null;


        CommonTree KILLED_KW280_tree=null;
        CommonTree TOUCHED_KW281_tree=null;
        CommonTree OWNED_KW282_tree=null;
        CommonTree NOTOWNED_KW283_tree=null;
        CommonTree BY284_tree=null;
        CommonTree OTHER285_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:288:15: ( ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:5: ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:5: ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:6: KILLED_KW
                    {
                    KILLED_KW280=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2646); 
                    KILLED_KW280_tree = (CommonTree)adaptor.create(KILLED_KW280);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW280_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:19: TOUCHED_KW
                    {
                    TOUCHED_KW281=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2651); 
                    TOUCHED_KW281_tree = (CommonTree)adaptor.create(TOUCHED_KW281);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW281_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:33: OWNED_KW
                    {
                    OWNED_KW282=(Token)match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2656); 
                    OWNED_KW282_tree = (CommonTree)adaptor.create(OWNED_KW282);
                    root_0 = (CommonTree)adaptor.becomeRoot(OWNED_KW282_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:45: NOTOWNED_KW
                    {
                    NOTOWNED_KW283=(Token)match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2661); 
                    NOTOWNED_KW283_tree = (CommonTree)adaptor.create(NOTOWNED_KW283);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOTOWNED_KW283_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:59: ( BY ( ( OTHER )? accesLocal ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==BY) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:60: BY ( ( OTHER )? accesLocal )
                    {
                    BY284=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT2666); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:64: ( ( OTHER )? accesLocal )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:65: ( OTHER )? accesLocal
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:65: ( OTHER )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==OTHER) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:66: OTHER
                            {
                            OTHER285=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2671); 
                            OTHER285_tree = (CommonTree)adaptor.create(OTHER285);
                            adaptor.addChild(root_0, OTHER285_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesLocal_in_declencheurKT2675);
                    accesLocal286=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal286.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final hightParser.siAlors_return siAlors() throws RecognitionException {
        hightParser.siAlors_return retval = new hightParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW287=null;
        Token THEN289=null;
        Token ELSE291=null;
        Token ENDIF293=null;
        hightParser.conditions_return conditions288 = null;

        hightParser.consequences_return consequences290 = null;

        hightParser.consequences_return consequences292 = null;


        CommonTree IF_KW287_tree=null;
        CommonTree THEN289_tree=null;
        CommonTree ELSE291_tree=null;
        CommonTree ENDIF293_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:293:5: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW287=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2694); 
            IF_KW287_tree = (CommonTree)adaptor.create(IF_KW287);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW287_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2697);
            conditions288=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions288.getTree());
            THEN289=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2699); 
            pushFollow(FOLLOW_consequences_in_siAlors2702);
            consequences290=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences290.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:293:42: ( ELSE consequences )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ELSE) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:293:43: ELSE consequences
                    {
                    ELSE291=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2705); 
                    pushFollow(FOLLOW_consequences_in_siAlors2708);
                    consequences292=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences292.getTree());

                    }
                    break;

            }

            ENDIF293=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2712); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final hightParser.conditions_return conditions() throws RecognitionException {
        hightParser.conditions_return retval = new hightParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT294=null;
        hightParser.conditionOu_return conditionOu295 = null;


        CommonTree NOT294_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:5: ( NOT )? conditionOu
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:5: ( NOT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==NOT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:6: NOT
                    {
                    NOT294=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2731);  
                    stream_NOT.add(NOT294);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2735);
            conditionOu295=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu295.getTree());


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
            // 298:7: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:298:10: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:298:25: ( NOT )?
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:1: conditionOu : conditionEt ( OR conditionEt )* ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR297=null;
        hightParser.conditionEt_return conditionEt296 = null;

        hightParser.conditionEt_return conditionEt298 = null;


        CommonTree OR297_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:13: ( conditionEt ( OR conditionEt )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:302:5: conditionEt ( OR conditionEt )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2769);
            conditionEt296=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt296.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:302:17: ( OR conditionEt )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==OR) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:302:18: OR conditionEt
            	    {
            	    OR297=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2772); 
            	    OR297_tree = (CommonTree)adaptor.create(OR297);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR297_tree, root_0);

            	    pushFollow(FOLLOW_conditionEt_in_conditionOu2775);
            	    conditionEt298=conditionEt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionEt298.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:1: conditionEt : cond ( AND cond )* ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND300=null;
        hightParser.cond_return cond299 = null;

        hightParser.cond_return cond301 = null;


        CommonTree AND300_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:13: ( cond ( AND cond )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:306:5: cond ( AND cond )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2794);
            cond299=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond299.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:306:10: ( AND cond )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==AND) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:306:11: AND cond
            	    {
            	    AND300=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2797); 
            	    AND300_tree = (CommonTree)adaptor.create(AND300);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND300_tree, root_0);

            	    pushFollow(FOLLOW_cond_in_conditionEt2800);
            	    cond301=cond();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cond301.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD | IDENT CONTAINS_KW IDENT );
    public final hightParser.cond_return cond() throws RecognitionException {
        hightParser.cond_return retval = new hightParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP303=null;
        Token EQUALS305=null;
        Token INF306=null;
        Token SUP307=null;
        Token INFEG308=null;
        Token SUPED309=null;
        Token DIFF310=null;
        Token PG312=null;
        Token PD314=null;
        Token IDENT315=null;
        Token CONTAINS_KW316=null;
        Token IDENT317=null;
        hightParser.etat_return etat302 = null;

        hightParser.operation_return operation304 = null;

        hightParser.operation_return operation311 = null;

        hightParser.conditions_return conditions313 = null;


        CommonTree COMP303_tree=null;
        CommonTree EQUALS305_tree=null;
        CommonTree INF306_tree=null;
        CommonTree SUP307_tree=null;
        CommonTree INFEG308_tree=null;
        CommonTree SUPED309_tree=null;
        CommonTree DIFF310_tree=null;
        CommonTree PG312_tree=null;
        CommonTree PD314_tree=null;
        CommonTree IDENT315_tree=null;
        CommonTree CONTAINS_KW316_tree=null;
        CommonTree IDENT317_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD | IDENT CONTAINS_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:310:5: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2819);
                    etat302=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat302.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:7: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP303=(Token)match(input,COMP,FOLLOW_COMP_in_cond2827); 
                    pushFollow(FOLLOW_operation_in_cond2830);
                    operation304=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation304.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:23: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:24: EQUALS
                            {
                            EQUALS305=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2833); 
                            EQUALS305_tree = (CommonTree)adaptor.create(EQUALS305);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS305_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:34: INF
                            {
                            INF306=(Token)match(input,INF,FOLLOW_INF_in_cond2838); 
                            INF306_tree = (CommonTree)adaptor.create(INF306);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF306_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:41: SUP
                            {
                            SUP307=(Token)match(input,SUP,FOLLOW_SUP_in_cond2843); 
                            SUP307_tree = (CommonTree)adaptor.create(SUP307);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP307_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:48: INFEG
                            {
                            INFEG308=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2848); 
                            INFEG308_tree = (CommonTree)adaptor.create(INFEG308);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG308_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:57: SUPED
                            {
                            SUPED309=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2853); 
                            SUPED309_tree = (CommonTree)adaptor.create(SUPED309);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED309_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:66: DIFF
                            {
                            DIFF310=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2858); 
                            DIFF310_tree = (CommonTree)adaptor.create(DIFF310);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF310_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2862);
                    operation311=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation311.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:312:7: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG312=(Token)match(input,PG,FOLLOW_PG_in_cond2881); 
                    PG312_tree = (CommonTree)adaptor.create(PG312);
                    adaptor.addChild(root_0, PG312_tree);

                    pushFollow(FOLLOW_conditions_in_cond2883);
                    conditions313=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions313.getTree());
                    PD314=(Token)match(input,PD,FOLLOW_PD_in_cond2885); 
                    PD314_tree = (CommonTree)adaptor.create(PD314);
                    adaptor.addChild(root_0, PD314_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:313:7: IDENT CONTAINS_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT315=(Token)match(input,IDENT,FOLLOW_IDENT_in_cond2893); 
                    IDENT315_tree = (CommonTree)adaptor.create(IDENT315);
                    adaptor.addChild(root_0, IDENT315_tree);

                    CONTAINS_KW316=(Token)match(input,CONTAINS_KW,FOLLOW_CONTAINS_KW_in_cond2895); 
                    CONTAINS_KW316_tree = (CommonTree)adaptor.create(CONTAINS_KW316);
                    root_0 = (CommonTree)adaptor.becomeRoot(CONTAINS_KW316_tree, root_0);

                    IDENT317=(Token)match(input,IDENT,FOLLOW_IDENT_in_cond2898); 
                    IDENT317_tree = (CommonTree)adaptor.create(IDENT317);
                    adaptor.addChild(root_0, IDENT317_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:316:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW OF IDENT | DEFEAT_KW OF IDENT );
    public final hightParser.etat_return etat() throws RecognitionException {
        hightParser.etat_return retval = new hightParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS319=null;
        Token NOT320=null;
        Token DEAD_KW321=null;
        Token ALIVE_KW322=null;
        Token EFFACED_KW323=null;
        Token GENERATED_KW324=null;
        Token TOUCHING_KW325=null;
        Token OTHER326=null;
        Token MOVING_KW328=null;
        Token WAITING_KW329=null;
        Token set330=null;
        Token IS331=null;
        Token NOT332=null;
        Token FINISHED_KW333=null;
        Token STARTED_KW334=null;
        Token PAUSED_KW335=null;
        Token MUTED_KW336=null;
        Token set337=null;
        Token PLAYED_KW338=null;
        Token STOPPED_KW339=null;
        Token VICTORY_KW340=null;
        Token OF341=null;
        Token IDENT342=null;
        Token DEFEAT_KW343=null;
        Token OF344=null;
        Token IDENT345=null;
        hightParser.accesClasse_return accesClasse318 = null;

        hightParser.accesLocal_return accesLocal327 = null;


        CommonTree IS319_tree=null;
        CommonTree NOT320_tree=null;
        CommonTree DEAD_KW321_tree=null;
        CommonTree ALIVE_KW322_tree=null;
        CommonTree EFFACED_KW323_tree=null;
        CommonTree GENERATED_KW324_tree=null;
        CommonTree TOUCHING_KW325_tree=null;
        CommonTree OTHER326_tree=null;
        CommonTree MOVING_KW328_tree=null;
        CommonTree WAITING_KW329_tree=null;
        CommonTree set330_tree=null;
        CommonTree IS331_tree=null;
        CommonTree NOT332_tree=null;
        CommonTree FINISHED_KW333_tree=null;
        CommonTree STARTED_KW334_tree=null;
        CommonTree PAUSED_KW335_tree=null;
        CommonTree MUTED_KW336_tree=null;
        CommonTree set337_tree=null;
        CommonTree PLAYED_KW338_tree=null;
        CommonTree STOPPED_KW339_tree=null;
        CommonTree VICTORY_KW340_tree=null;
        CommonTree OF341_tree=null;
        CommonTree IDENT342_tree=null;
        CommonTree DEFEAT_KW343_tree=null;
        CommonTree OF344_tree=null;
        CommonTree IDENT345_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:316:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW OF IDENT | DEFEAT_KW OF IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:5: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2916);
                    accesClasse318=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse318.getTree());
                    IS319=(Token)match(input,IS,FOLLOW_IS_in_etat2918); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:21: ( NOT )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NOT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:22: NOT
                            {
                            NOT320=(Token)match(input,NOT,FOLLOW_NOT_in_etat2922); 
                            NOT320_tree = (CommonTree)adaptor.create(NOT320);
                            adaptor.addChild(root_0, NOT320_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:28: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:29: DEAD_KW
                            {
                            DEAD_KW321=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2927); 
                            DEAD_KW321_tree = (CommonTree)adaptor.create(DEAD_KW321);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW321_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:40: ALIVE_KW
                            {
                            ALIVE_KW322=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2932); 
                            ALIVE_KW322_tree = (CommonTree)adaptor.create(ALIVE_KW322);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW322_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:52: EFFACED_KW
                            {
                            EFFACED_KW323=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2937); 
                            EFFACED_KW323_tree = (CommonTree)adaptor.create(EFFACED_KW323);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW323_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:66: GENERATED_KW
                            {
                            GENERATED_KW324=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2942); 
                            GENERATED_KW324_tree = (CommonTree)adaptor.create(GENERATED_KW324);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW324_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:82: TOUCHING_KW ( ( OTHER )? accesLocal )
                            {
                            TOUCHING_KW325=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2947); 
                            TOUCHING_KW325_tree = (CommonTree)adaptor.create(TOUCHING_KW325);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW325_tree, root_0);

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:95: ( ( OTHER )? accesLocal )
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:96: ( OTHER )? accesLocal
                            {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:96: ( OTHER )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==OTHER) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:97: OTHER
                                    {
                                    OTHER326=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2952); 
                                    OTHER326_tree = (CommonTree)adaptor.create(OTHER326);
                                    adaptor.addChild(root_0, OTHER326_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_etat2956);
                            accesLocal327=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal327.getTree());

                            }


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:119: MOVING_KW
                            {
                            MOVING_KW328=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2961); 
                            MOVING_KW328_tree = (CommonTree)adaptor.create(MOVING_KW328);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW328_tree, root_0);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:132: WAITING_KW
                            {
                            WAITING_KW329=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2966); 
                            WAITING_KW329_tree = (CommonTree)adaptor.create(WAITING_KW329);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW329_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:7: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set330=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set330));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS331=(Token)match(input,IS,FOLLOW_IS_in_etat2986); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:26: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:27: NOT
                            {
                            NOT332=(Token)match(input,NOT,FOLLOW_NOT_in_etat2990); 
                            NOT332_tree = (CommonTree)adaptor.create(NOT332);
                            adaptor.addChild(root_0, NOT332_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:33: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:34: FINISHED_KW
                            {
                            FINISHED_KW333=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2995); 
                            FINISHED_KW333_tree = (CommonTree)adaptor.create(FINISHED_KW333);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW333_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:48: STARTED_KW
                            {
                            STARTED_KW334=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2999); 
                            STARTED_KW334_tree = (CommonTree)adaptor.create(STARTED_KW334);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW334_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:62: PAUSED_KW
                            {
                            PAUSED_KW335=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3004); 
                            PAUSED_KW335_tree = (CommonTree)adaptor.create(PAUSED_KW335);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW335_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:75: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW336=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3009); 
                            MUTED_KW336_tree = (CommonTree)adaptor.create(MUTED_KW336);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW336_tree, root_0);

                            set337=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set337));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:98: PLAYED_KW
                            {
                            PLAYED_KW338=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3022); 
                            PLAYED_KW338_tree = (CommonTree)adaptor.create(PLAYED_KW338);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW338_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:111: STOPPED_KW
                            {
                            STOPPED_KW339=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3027); 
                            STOPPED_KW339_tree = (CommonTree)adaptor.create(STOPPED_KW339);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW339_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:320:7: VICTORY_KW OF IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW340=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3045); 
                    VICTORY_KW340_tree = (CommonTree)adaptor.create(VICTORY_KW340);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW340_tree, root_0);

                    OF341=(Token)match(input,OF,FOLLOW_OF_in_etat3048); 
                    IDENT342=(Token)match(input,IDENT,FOLLOW_IDENT_in_etat3051); 
                    IDENT342_tree = (CommonTree)adaptor.create(IDENT342);
                    adaptor.addChild(root_0, IDENT342_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:321:7: DEFEAT_KW OF IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW343=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3059); 
                    DEFEAT_KW343_tree = (CommonTree)adaptor.create(DEFEAT_KW343);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW343_tree, root_0);

                    OF344=(Token)match(input,OF,FOLLOW_OF_in_etat3062); 
                    IDENT345=(Token)match(input,IDENT,FOLLOW_IDENT_in_etat3065); 
                    IDENT345_tree = (CommonTree)adaptor.create(IDENT345);
                    adaptor.addChild(root_0, IDENT345_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:324:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final hightParser.affectation_return affectation() throws RecognitionException {
        hightParser.affectation_return retval = new hightParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW346=null;
        Token ADD_KW347=null;
        Token SUB_KW348=null;
        Token FOR350=null;
        Token INVERT_KW352=null;
        Token WITH354=null;
        hightParser.operation_return operation349 = null;

        hightParser.variable_return variable351 = null;

        hightParser.variable_return variable353 = null;

        hightParser.variable_return variable355 = null;


        CommonTree ASSIGN_KW346_tree=null;
        CommonTree ADD_KW347_tree=null;
        CommonTree SUB_KW348_tree=null;
        CommonTree FOR350_tree=null;
        CommonTree INVERT_KW352_tree=null;
        CommonTree WITH354_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:324:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:5: ASSIGN_KW
                            {
                            ASSIGN_KW346=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3084); 
                            ASSIGN_KW346_tree = (CommonTree)adaptor.create(ASSIGN_KW346);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW346_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:18: ADD_KW
                            {
                            ADD_KW347=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3089); 
                            ADD_KW347_tree = (CommonTree)adaptor.create(ADD_KW347);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW347_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:28: SUB_KW
                            {
                            SUB_KW348=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3094); 
                            SUB_KW348_tree = (CommonTree)adaptor.create(SUB_KW348);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW348_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation3098);
                    operation349=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation349.getTree());

                    }

                    FOR350=(Token)match(input,FOR,FOLLOW_FOR_in_affectation3101); 
                    pushFollow(FOLLOW_variable_in_affectation3104);
                    variable351=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable351.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:326:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW352=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3111); 
                    INVERT_KW352_tree = (CommonTree)adaptor.create(INVERT_KW352);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW352_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation3114);
                    variable353=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable353.getTree());
                    WITH354=(Token)match(input,WITH,FOLLOW_WITH_in_affectation3116); 
                    pushFollow(FOLLOW_variable_in_affectation3119);
                    variable355=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable355.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:331:1: iaBasique : IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )* ;
    public final hightParser.iaBasique_return iaBasique() throws RecognitionException {
        hightParser.iaBasique_return retval = new hightParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW356=null;
        Token IDENT357=null;
        Token IS358=null;
        Token VIRG360=null;
        hightParser.reglesJeu_return reglesJeu359 = null;

        hightParser.reglesJeu_return reglesJeu361 = null;


        CommonTree IA_KW356_tree=null;
        CommonTree IDENT357_tree=null;
        CommonTree IS358_tree=null;
        CommonTree VIRG360_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:331:11: ( IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:5: IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW356=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3139); 
            IA_KW356_tree = (CommonTree)adaptor.create(IA_KW356);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW356_tree, root_0);

            IDENT357=(Token)match(input,IDENT,FOLLOW_IDENT_in_iaBasique3142); 
            IDENT357_tree = (CommonTree)adaptor.create(IDENT357);
            adaptor.addChild(root_0, IDENT357_tree);

            IS358=(Token)match(input,IS,FOLLOW_IS_in_iaBasique3144); 
            pushFollow(FOLLOW_reglesJeu_in_iaBasique3147);
            reglesJeu359=reglesJeu();

            state._fsp--;

            adaptor.addChild(root_0, reglesJeu359.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:32: ( VIRG reglesJeu )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==VIRG) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:33: VIRG reglesJeu
            	    {
            	    VIRG360=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique3150); 
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3153);
            	    reglesJeu361=reglesJeu();

            	    state._fsp--;

            	    adaptor.addChild(root_0, reglesJeu361.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final hightParser.operation_return operation() throws RecognitionException {
        hightParser.operation_return retval = new hightParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW363=null;
        Token BETWEEN364=null;
        Token AND366=null;
        hightParser.operationPlus_return operationPlus362 = null;

        hightParser.operationPlus_return operationPlus365 = null;

        hightParser.operationPlus_return operationPlus367 = null;


        CommonTree RANDOM_KW363_tree=null;
        CommonTree BETWEEN364_tree=null;
        CommonTree AND366_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:337:5: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation3171);
                    operationPlus362=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus362.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:338:7: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW363=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3179); 
                    RANDOM_KW363_tree = (CommonTree)adaptor.create(RANDOM_KW363);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW363_tree, root_0);

                    BETWEEN364=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation3182); 
                    pushFollow(FOLLOW_operationPlus_in_operation3185);
                    operationPlus365=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus365.getTree());
                    AND366=(Token)match(input,AND,FOLLOW_AND_in_operation3187); 
                    pushFollow(FOLLOW_operationPlus_in_operation3190);
                    operationPlus367=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus367.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:341:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final hightParser.operationPlus_return operationPlus() throws RecognitionException {
        hightParser.operationPlus_return retval = new hightParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS369=null;
        Token MINUS370=null;
        hightParser.operationMul_return operationMul368 = null;

        hightParser.operationMul_return operationMul371 = null;


        CommonTree PLUS369_tree=null;
        CommonTree MINUS370_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:341:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:5: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus3208);
            operationMul368=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul368.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:18: ( ( PLUS | MINUS ) operationMul )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=PLUS && LA82_0<=MINUS)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:19: ( PLUS | MINUS ) operationMul
            	    {
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:19: ( PLUS | MINUS )
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
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:20: PLUS
            	            {
            	            PLUS369=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus3212); 
            	            PLUS369_tree = (CommonTree)adaptor.create(PLUS369);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS369_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:28: MINUS
            	            {
            	            MINUS370=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus3217); 
            	            MINUS370_tree = (CommonTree)adaptor.create(MINUS370);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS370_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus3221);
            	    operationMul371=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul371.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:345:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final hightParser.operationMul_return operationMul() throws RecognitionException {
        hightParser.operationMul_return retval = new hightParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL373=null;
        Token DIV374=null;
        Token MOD375=null;
        hightParser.operationPow_return operationPow372 = null;

        hightParser.operationPow_return operationPow376 = null;


        CommonTree MUL373_tree=null;
        CommonTree DIV374_tree=null;
        CommonTree MOD375_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:345:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:5: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul3240);
            operationPow372=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow372.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:18: ( ( MUL | DIV | MOD ) operationPow )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=MUL && LA84_0<=MOD)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:19: ( MUL | DIV | MOD ) operationPow
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:19: ( MUL | DIV | MOD )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:20: MUL
                            {
                            MUL373=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul3244); 
                            MUL373_tree = (CommonTree)adaptor.create(MUL373);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL373_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:27: DIV
                            {
                            DIV374=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul3249); 
                            DIV374_tree = (CommonTree)adaptor.create(DIV374);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV374_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:34: MOD
                            {
                            MOD375=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul3254); 
                            MOD375_tree = (CommonTree)adaptor.create(MOD375);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD375_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul3258);
                    operationPow376=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow376.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW378=null;
        hightParser.operationBracket_return operationBracket377 = null;

        hightParser.operationBracket_return operationBracket379 = null;


        CommonTree POW378_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:14: ( operationBracket ( POW operationBracket )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:350:5: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow3279);
            operationBracket377=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket377.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:350:22: ( POW operationBracket )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==POW) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:350:23: POW operationBracket
                    {
                    POW378=(Token)match(input,POW,FOLLOW_POW_in_operationPow3282); 
                    POW378_tree = (CommonTree)adaptor.create(POW378);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW378_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow3285);
                    operationBracket379=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket379.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:353:1: operationBracket : ( PG operation PD | variable | FLOAT | ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT );
    public final hightParser.operationBracket_return operationBracket() throws RecognitionException {
        hightParser.operationBracket_return retval = new hightParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG380=null;
        Token PD382=null;
        Token FLOAT384=null;
        Token DISTANCE_KW385=null;
        Token ANGLE_KW386=null;
        Token BETWEEN387=null;
        Token IDENT388=null;
        Token AND389=null;
        Token IDENT390=null;
        hightParser.operation_return operation381 = null;

        hightParser.variable_return variable383 = null;


        CommonTree PG380_tree=null;
        CommonTree PD382_tree=null;
        CommonTree FLOAT384_tree=null;
        CommonTree DISTANCE_KW385_tree=null;
        CommonTree ANGLE_KW386_tree=null;
        CommonTree BETWEEN387_tree=null;
        CommonTree IDENT388_tree=null;
        CommonTree AND389_tree=null;
        CommonTree IDENT390_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:353:18: ( PG operation PD | variable | FLOAT | ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:354:5: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG380=(Token)match(input,PG,FOLLOW_PG_in_operationBracket3306); 
                    pushFollow(FOLLOW_operation_in_operationBracket3309);
                    operation381=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation381.getTree());
                    PD382=(Token)match(input,PD,FOLLOW_PD_in_operationBracket3311); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:355:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket3320);
                    variable383=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable383.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:356:7: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT384=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket3328); 
                    FLOAT384_tree = (CommonTree)adaptor.create(FLOAT384);
                    adaptor.addChild(root_0, FLOAT384_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:357:7: ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:357:7: ( DISTANCE_KW | ANGLE_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:357:8: DISTANCE_KW
                            {
                            DISTANCE_KW385=(Token)match(input,DISTANCE_KW,FOLLOW_DISTANCE_KW_in_operationBracket3337); 
                            DISTANCE_KW385_tree = (CommonTree)adaptor.create(DISTANCE_KW385);
                            root_0 = (CommonTree)adaptor.becomeRoot(DISTANCE_KW385_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:357:22: ANGLE_KW
                            {
                            ANGLE_KW386=(Token)match(input,ANGLE_KW,FOLLOW_ANGLE_KW_in_operationBracket3341); 
                            ANGLE_KW386_tree = (CommonTree)adaptor.create(ANGLE_KW386);
                            root_0 = (CommonTree)adaptor.becomeRoot(ANGLE_KW386_tree, root_0);


                            }
                            break;

                    }

                    BETWEEN387=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operationBracket3345); 
                    IDENT388=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationBracket3348); 
                    IDENT388_tree = (CommonTree)adaptor.create(IDENT388);
                    adaptor.addChild(root_0, IDENT388_tree);

                    AND389=(Token)match(input,AND,FOLLOW_AND_in_operationBracket3350); 
                    IDENT390=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationBracket3353); 
                    IDENT390_tree = (CommonTree)adaptor.create(IDENT390);
                    adaptor.addChild(root_0, IDENT390_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:360:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) );
    public final hightParser.variable_return variable() throws RecognitionException {
        hightParser.variable_return retval = new hightParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X391=null;
        Token Y392=null;
        Token Z393=null;
        Token OF394=null;
        Token OF396=null;
        Token IDENT398=null;
        Token OF399=null;
        Token SCORE401=null;
        Token OF402=null;
        Token GAME403=null;
        Token VALUE404=null;
        Token OF405=null;
        Token OF407=null;
        hightParser.typeCoordonnees_return typeCoordonnees395 = null;

        hightParser.accesLocal_return accesLocal397 = null;

        hightParser.accesLocal_return accesLocal400 = null;

        hightParser.attributTps_return attributTps406 = null;

        hightParser.accesLocal_return accesLocal408 = null;


        CommonTree X391_tree=null;
        CommonTree Y392_tree=null;
        CommonTree Z393_tree=null;
        CommonTree OF394_tree=null;
        CommonTree OF396_tree=null;
        CommonTree IDENT398_tree=null;
        CommonTree OF399_tree=null;
        CommonTree SCORE401_tree=null;
        CommonTree OF402_tree=null;
        CommonTree GAME403_tree=null;
        CommonTree VALUE404_tree=null;
        CommonTree OF405_tree=null;
        CommonTree OF407_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_accesLocal=new RewriteRuleSubtreeStream(adaptor,"rule accesLocal");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:360:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:361:5: ( X | Y | Z ) OF typeCoordonnees OF accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:361:5: ( X | Y | Z )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:361:6: X
                            {
                            X391=(Token)match(input,X,FOLLOW_X_in_variable3372); 
                            X391_tree = (CommonTree)adaptor.create(X391);
                            root_0 = (CommonTree)adaptor.becomeRoot(X391_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:361:11: Y
                            {
                            Y392=(Token)match(input,Y,FOLLOW_Y_in_variable3377); 
                            Y392_tree = (CommonTree)adaptor.create(Y392);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y392_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:361:16: Z
                            {
                            Z393=(Token)match(input,Z,FOLLOW_Z_in_variable3382); 
                            Z393_tree = (CommonTree)adaptor.create(Z393);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z393_tree, root_0);


                            }
                            break;

                    }

                    OF394=(Token)match(input,OF,FOLLOW_OF_in_variable3386); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3389);
                    typeCoordonnees395=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees395.getTree());
                    OF396=(Token)match(input,OF,FOLLOW_OF_in_variable3391); 
                    pushFollow(FOLLOW_accesLocal_in_variable3394);
                    accesLocal397=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal397.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:362:7: IDENT OF accesLocal
                    {
                    IDENT398=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable3402);  
                    stream_IDENT.add(IDENT398);

                    OF399=(Token)match(input,OF,FOLLOW_OF_in_variable3404);  
                    stream_OF.add(OF399);

                    pushFollow(FOLLOW_accesLocal_in_variable3406);
                    accesLocal400=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal400.getTree());


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
                    // 363:7: -> ^( VAR_I_KW IDENT accesLocal )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:363:10: ^( VAR_I_KW IDENT accesLocal )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:364:7: SCORE OF GAME
                    {
                    SCORE401=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable3450);  
                    stream_SCORE.add(SCORE401);

                    OF402=(Token)match(input,OF,FOLLOW_OF_in_variable3452);  
                    stream_OF.add(OF402);

                    GAME403=(Token)match(input,GAME,FOLLOW_GAME_in_variable3454);  
                    stream_GAME.add(GAME403);



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
                    // 365:7: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:366:7: VALUE OF attributTps OF accesLocal
                    {
                    VALUE404=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable3472);  
                    stream_VALUE.add(VALUE404);

                    OF405=(Token)match(input,OF,FOLLOW_OF_in_variable3474);  
                    stream_OF.add(OF405);

                    pushFollow(FOLLOW_attributTps_in_variable3476);
                    attributTps406=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps406.getTree());
                    OF407=(Token)match(input,OF,FOLLOW_OF_in_variable3478);  
                    stream_OF.add(OF407);

                    pushFollow(FOLLOW_accesLocal_in_variable3480);
                    accesLocal408=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal408.getTree());


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
                    // 367:7: -> ^( VALUE_KW attributTps accesLocal )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:367:10: ^( VALUE_KW attributTps accesLocal )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:370:1: accesClasse : ( ALL -> ^( ACCESS_KW ALL ) | accesLocal );
    public final hightParser.accesClasse_return accesClasse() throws RecognitionException {
        hightParser.accesClasse_return retval = new hightParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL409=null;
        hightParser.accesLocal_return accesLocal410 = null;


        CommonTree ALL409_tree=null;
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:370:13: ( ALL -> ^( ACCESS_KW ALL ) | accesLocal )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:371:3: ALL
                    {
                    ALL409=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse3512);  
                    stream_ALL.add(ALL409);



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
                    // 372:5: -> ^( ACCESS_KW ALL )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:372:8: ^( ACCESS_KW ALL )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:373:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse3530);
                    accesLocal410=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal410.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:376:1: accesLocal : ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) );
    public final hightParser.accesLocal_return accesLocal() throws RecognitionException {
        hightParser.accesLocal_return retval = new hightParser.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT411=null;
        Token NUM412=null;
        Token IN414=null;
        Token IDENT415=null;
        Token PLAYER416=null;
        hightParser.operation_return operation413 = null;


        CommonTree IDENT411_tree=null;
        CommonTree NUM412_tree=null;
        CommonTree IN414_tree=null;
        CommonTree IDENT415_tree=null;
        CommonTree PLAYER416_tree=null;
        RewriteRuleTokenStream stream_PLAYER=new RewriteRuleTokenStream(adaptor,"token PLAYER");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:376:12: ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:377:3: IDENT
                    {
                    IDENT411=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal3543);  
                    stream_IDENT.add(IDENT411);



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
                    // 378:5: -> ^( ACCESS_KW IDENT )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:378:8: ^( ACCESS_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:379:5: NUM operation IN IDENT
                    {
                    NUM412=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal3561);  
                    stream_NUM.add(NUM412);

                    pushFollow(FOLLOW_operation_in_accesLocal3563);
                    operation413=operation();

                    state._fsp--;

                    stream_operation.add(operation413.getTree());
                    IN414=(Token)match(input,IN,FOLLOW_IN_in_accesLocal3565);  
                    stream_IN.add(IN414);

                    IDENT415=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal3567);  
                    stream_IDENT.add(IDENT415);



                    // AST REWRITE
                    // elements: IDENT, operation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 380:5: -> ^( ACCESS_KW IDENT operation )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:380:8: ^( ACCESS_KW IDENT operation )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:381:5: PLAYER
                    {
                    PLAYER416=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal3587);  
                    stream_PLAYER.add(PLAYER416);



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
                    // 382:5: -> ^( ACCESS_KW PLAYER )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:382:8: ^( ACCESS_KW PLAYER )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:385:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set417=null;

        CommonTree set417_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:385:17: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set417=(Token)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set417));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:389:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set418=null;

        CommonTree set418_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:389:10: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set418=(Token)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
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
    // $ANTLR end "timeUnit"

    public static class attributTps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributTps"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:398:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set419=null;

        CommonTree set419_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:398:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set419=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
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
    // $ANTLR end "attributTps"

    public static class attributListeOuObjet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributListeOuObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:404:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set420=null;

        CommonTree set420_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:404:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set420=(Token)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
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
    // $ANTLR end "attributListeOuObjet"

    // Delegated rules


    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA41_eotS =
        "\15\uffff";
    static final String DFA41_eofS =
        "\15\uffff";
    static final String DFA41_minS =
        "\1\35\1\uffff\1\105\12\uffff";
    static final String DFA41_maxS =
        "\1\u00c1\1\uffff\1\154\12\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA41_specialS =
        "\15\uffff}>";
    static final String[] DFA41_transitionS = {
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
            return "179:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT );";
        }
    }
 

    public static final BitSet FOLLOW_gameData_in_game245 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game247 = new BitSet(new long[]{0x08034C0000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_newType_in_game256 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game258 = new BitSet(new long[]{0x08034C0000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_game267 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game269 = new BitSet(new long[]{0x08034C0000000000L,0x0001000000000001L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_game278 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game280 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L});
    public static final BitSet FOLLOW_commande_in_game289 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game291 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_game300 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000010L});
    public static final BitSet FOLLOW_iaBasique_in_game311 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_GAME_in_gameData367 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_gameData369 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData371 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_gameData374 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData376 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame410 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame412 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame437 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame439 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURNBASED_KW_in_attributGame469 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_attributGame475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORLD_KW_in_attributGame487 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame490 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_mapType_in_attributGame493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRIDSIZE_KW_in_attributGame501 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame504 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_KW_in_attributGame515 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame519 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_name_in_attributGame522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mapType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_name551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType565 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_newType567 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_newType569 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_subType_in_newType571 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_newType574 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_subType_in_newType576 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init641 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_init643 = new BitSet(new long[]{0x0928840000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init669 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_init671 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFE1DL});
    public static final BitSet FOLLOW_allocationObject_in_init673 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_init676 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFE1DL});
    public static final BitSet FOLLOW_allocationObject_in_init678 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INSERT_KW_in_init706 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init709 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_init711 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init714 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_NUM_in_init717 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_init720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_KW_in_init732 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init736 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NUM_in_init738 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_init741 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_FROM_in_init744 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet765 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_dupli_in_declarationObjet767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet796 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet799 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_declarationObjet802 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet807 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_declarationObjet811 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_declarationObjet814 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet819 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet854 = new BitSet(new long[]{0xC080000000000002L});
    public static final BitSet FOLLOW_view_in_declarationObjet857 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet891 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet930 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet948 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject1039 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_VALUE_in_allocationObject1043 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject1047 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000060000001L});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject1085 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1087 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_coordinates_in_allocationObject1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject1126 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1128 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject1168 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1170 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_allocationObject1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation1216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_valAggregation1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1275 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MEANS_in_definition1280 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_definition1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1295 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1298 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1300 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1374 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_consequ1377 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DBP_in_consequ1383 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1395 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_consequ1398 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DBP_in_consequ1404 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1426 = new BitSet(new long[]{0x0000000000000000L,0x0000190322000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1436 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DBP_in_action1460 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1475 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_action1483 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1493 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1498 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1511 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_transformation_in_action1514 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_action1516 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1519 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_coordinates_in_action1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1530 = new BitSet(new long[]{0x0801040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1535 = new BitSet(new long[]{0x0801040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_action1540 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_action1543 = new BitSet(new long[]{0x0000800200000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_IN_in_action1548 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_action1551 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_action1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1559 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_coordinates_in_action1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1573 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_action1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_action1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_action1580 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_action1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1602 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1663 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1676 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_action1681 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_action1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1694 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1697 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_action1699 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1761 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1764 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionObjet1767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1773 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_HAPPENS_in_actionObjet1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1789 = new BitSet(new long[]{0x0801040000000000L,0x00000000C0000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1821 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1841 = new BitSet(new long[]{0x0000000000000000L,0x000000FC00000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1868 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1877 = new BitSet(new long[]{0x0000000000000000L,0x000006CC00000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1897 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1909 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1921 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1973 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_coordinates1975 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_coordinates1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2016 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_commande2019 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_player_list_in_commande2022 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_commande2024 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_actionCommande_in_commande2027 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_commande2030 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_actionCommande_in_commande2033 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_player_list2052 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_player_list2055 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_player_list2058 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_MOUSE_in_actionCommande2077 = new BitSet(new long[]{0x0000000000000000L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_souris_in_actionCommande2079 = new BitSet(new long[]{0x0000000000000000L,0x0072000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2082 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande2086 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_actionCommande2117 = new BitSet(new long[]{0x0000000000000000L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2119 = new BitSet(new long[]{0x0000000000000000L,0x0072000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2122 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande2126 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commandMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2317 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2322 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_in_typeCommand2351 = new BitSet(new long[]{0x0000000000000002L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand2354 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand2357 = new BitSet(new long[]{0x0000000000000000L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand2359 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEY_in_typeCommand2386 = new BitSet(new long[]{0x0000000000000000L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2388 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand2391 = new BitSet(new long[]{0x0000000000000000L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2393 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2430 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu2435 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x000000000000F7A0L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur2513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur2515 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2541 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_declencheur2544 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_set_in_declencheur2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2561 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_declencheur2564 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_set_in_declencheur2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2606 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2611 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2616 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2621 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2627 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT2666 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2671 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2694 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_siAlors2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_siAlors2699 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_siAlors2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2705 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_siAlors2708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2731 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2772 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2775 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_cond_in_conditionEt2794 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2797 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_cond_in_conditionEt2800 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_etat_in_cond2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2827 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_cond2830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000FC00000L});
    public static final BitSet FOLLOW_EQUALS_in_cond2833 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_INF_in_cond2838 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SUP_in_cond2843 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_INFEG_in_cond2848 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SUPED_in_cond2853 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIFF_in_cond2858 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_cond2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2881 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_cond2883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_PD_in_cond2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cond2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_CONTAINS_KW_in_cond2895 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_cond2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2916 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_etat2918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F80080000L});
    public static final BitSet FOLLOW_NOT_in_etat2922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2947 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OTHER_in_etat2952 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat2978 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_etat2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000FC000080000L});
    public static final BitSet FOLLOW_NOT_in_etat2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000FC000000000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_etat3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3045 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_etat3048 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_etat3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3059 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_etat3062 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_etat3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3084 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3089 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3094 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_affectation3098 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_affectation3101 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variable_in_affectation3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3111 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variable_in_affectation3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation3116 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variable_in_affectation3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3139 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3142 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3147 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique3150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3153 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation3182 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationPlus_in_operation3185 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_AND_in_operation3187 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationPlus_in_operation3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus3208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus3212 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_operationPlus3217 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus3221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul3240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul3244 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIV_in_operationMul3249 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_MOD_in_operationMul3254 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationPow_in_operationMul3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow3279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_POW_in_operationPow3282 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket3306 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_operationBracket3309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_PD_in_operationBracket3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_KW_in_operationBracket3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ANGLE_KW_in_operationBracket3341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operationBracket3345 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_operationBracket3348 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_AND_in_operationBracket3350 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_operationBracket3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3372 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Y_in_variable3377 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Z_in_variable3382 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3389 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3391 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_variable3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable3402 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3404 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_variable3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable3450 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3452 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GAME_in_variable3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable3472 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3474 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFE1DL});
    public static final BitSet FOLLOW_attributTps_in_variable3476 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3478 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_variable3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal3561 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_accesLocal3563 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal3565 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}