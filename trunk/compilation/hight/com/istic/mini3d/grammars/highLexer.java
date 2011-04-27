// $ANTLR 3.3 Nov 30, 2010 12:50:56 H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g 2011-04-27 16:17:10

    package com.istic.mini3d.grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class highLexer extends Lexer {
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

    public highLexer() {;} 
    public highLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public highLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g"; }

    // $ANTLR start "GAME_KW"
    public final void mGAME_KW() throws RecognitionException {
        try {
            int _type = GAME_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:7:9: ( 'GAME_KW' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:7:11: 'GAME_KW'
            {
            match("GAME_KW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAME_KW"

    // $ANTLR start "GAME_ATTRIBUT_KW"
    public final void mGAME_ATTRIBUT_KW() throws RecognitionException {
        try {
            int _type = GAME_ATTRIBUT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:8:18: ( 'GAME_ATTRIBUT_KW' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:8:20: 'GAME_ATTRIBUT_KW'
            {
            match("GAME_ATTRIBUT_KW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAME_ATTRIBUT_KW"

    // $ANTLR start "INIT_IS_KW"
    public final void mINIT_IS_KW() throws RecognitionException {
        try {
            int _type = INIT_IS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:9:12: ( 'INIT_IS_KW' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:9:14: 'INIT_IS_KW'
            {
            match("INIT_IS_KW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INIT_IS_KW"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:10:5: ( 'DEC' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:10:7: 'DEC'
            {
            match("DEC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:11:8: ( 'true' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:11:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:12:8: ( 'false' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:12:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:421:13: ( '//' (~ '\\n' )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:421:15: '//' (~ '\\n' )*
            {
            match("//"); 

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:421:19: (~ '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:421:20: ~ '\\n'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "PD"
    public final void mPD() throws RecognitionException {
        try {
            int _type = PD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:423:4: ( ')' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:423:6: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PD"

    // $ANTLR start "PG"
    public final void mPG() throws RecognitionException {
        try {
            int _type = PG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:424:4: ( '(' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:424:6: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PG"

    // $ANTLR start "FIN"
    public final void mFIN() throws RecognitionException {
        try {
            int _type = FIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:425:5: ( ';' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:425:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIN"

    // $ANTLR start "VIRG"
    public final void mVIRG() throws RecognitionException {
        try {
            int _type = VIRG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:426:6: ( ',' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:426:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIRG"

    // $ANTLR start "HAS"
    public final void mHAS() throws RecognitionException {
        try {
            int _type = HAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:427:5: ( 'has' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:427:7: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAS"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:428:4: ( 'at' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:428:6: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:429:4: ( 'is' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:429:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:430:5: ( 'and' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:430:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:431:4: ( 'of' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:431:6: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:432:6: ( 'with' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:432:8: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:433:9: ( 'between' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:433:11: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:434:6: ( '+' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:434:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:435:7: ( '-' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:435:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:436:5: ( '*' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:436:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:437:5: ( '/' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:437:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:438:5: ( '^' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:438:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:439:5: ( '%' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:439:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            int _type = X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:440:3: ( 'x' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:440:5: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            int _type = Y;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:441:3: ( 'y' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:441:5: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            int _type = Z;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:442:3: ( 'z' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:442:5: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:443:5: ( 'all' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:443:7: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:444:5: ( 'not' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:444:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:445:5: ( 'min' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:445:7: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "SEC"
    public final void mSEC() throws RecognitionException {
        try {
            int _type = SEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:446:5: ( 's' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:446:7: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEC"

    // $ANTLR start "MS"
    public final void mMS() throws RecognitionException {
        try {
            int _type = MS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:447:4: ( 'ms' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:447:6: 'ms'
            {
            match("ms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MS"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:448:6: ( 'then' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:448:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:449:5: ( 'for' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:449:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:450:8: ( '=' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:450:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "INF"
    public final void mINF() throws RecognitionException {
        try {
            int _type = INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:451:5: ( '<' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:451:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INF"

    // $ANTLR start "SUP"
    public final void mSUP() throws RecognitionException {
        try {
            int _type = SUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:452:5: ( '>' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:452:8: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUP"

    // $ANTLR start "INFEG"
    public final void mINFEG() throws RecognitionException {
        try {
            int _type = INFEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:453:7: ( '<=' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:453:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INFEG"

    // $ANTLR start "SUPED"
    public final void mSUPED() throws RecognitionException {
        try {
            int _type = SUPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:454:7: ( '>=' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:454:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPED"

    // $ANTLR start "DIFF"
    public final void mDIFF() throws RecognitionException {
        try {
            int _type = DIFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:455:6: ( '!=' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:455:8: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIFF"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:456:7: ( 'from' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:456:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "DBP"
    public final void mDBP() throws RecognitionException {
        try {
            int _type = DBP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:457:9: ( ':' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:457:11: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DBP"

    // $ANTLR start "GAME"
    public final void mGAME() throws RecognitionException {
        try {
            int _type = GAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:459:7: ( 'game' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:459:9: 'game'
            {
            match("game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAME"

    // $ANTLR start "GRAVITY_KW"
    public final void mGRAVITY_KW() throws RecognitionException {
        try {
            int _type = GRAVITY_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:460:12: ( 'gravity' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:460:14: 'gravity'
            {
            match("gravity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRAVITY_KW"

    // $ANTLR start "SCORE"
    public final void mSCORE() throws RecognitionException {
        try {
            int _type = SCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:461:8: ( 'score' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:461:10: 'score'
            {
            match("score"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCORE"

    // $ANTLR start "TURNBASED_KW"
    public final void mTURNBASED_KW() throws RecognitionException {
        try {
            int _type = TURNBASED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:462:17: ( 'turnbased' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:462:19: 'turnbased'
            {
            match("turnbased"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TURNBASED_KW"

    // $ANTLR start "WORLD_KW"
    public final void mWORLD_KW() throws RecognitionException {
        try {
            int _type = WORLD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:463:17: ( 'world' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:463:19: 'world'
            {
            match("world"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORLD_KW"

    // $ANTLR start "GRIDSIZE_KW"
    public final void mGRIDSIZE_KW() throws RecognitionException {
        try {
            int _type = GRIDSIZE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:464:17: ( 'gridsize' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:464:19: 'gridsize'
            {
            match("gridsize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRIDSIZE_KW"

    // $ANTLR start "GENERIC"
    public final void mGENERIC() throws RecognitionException {
        try {
            int _type = GENERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:465:17: ( 'generic' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:465:19: 'generic'
            {
            match("generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENERIC"

    // $ANTLR start "GRID"
    public final void mGRID() throws RecognitionException {
        try {
            int _type = GRID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:466:15: ( 'grid' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:466:17: 'grid'
            {
            match("grid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRID"

    // $ANTLR start "RIBBON"
    public final void mRIBBON() throws RecognitionException {
        try {
            int _type = RIBBON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:467:17: ( 'ribbon' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:467:19: 'ribbon'
            {
            match("ribbon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIBBON"

    // $ANTLR start "NAME_KW"
    public final void mNAME_KW() throws RecognitionException {
        try {
            int _type = NAME_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:468:17: ( 'name' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:468:19: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME_KW"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:469:7: ( 'type' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:469:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "INSERT_KW"
    public final void mINSERT_KW() throws RecognitionException {
        try {
            int _type = INSERT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:470:11: ( 'insert' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:470:14: 'insert'
            {
            match("insert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT_KW"

    // $ANTLR start "REMOVE_KW"
    public final void mREMOVE_KW() throws RecognitionException {
        try {
            int _type = REMOVE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:471:11: ( 'remove' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:471:13: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REMOVE_KW"

    // $ANTLR start "SOLO"
    public final void mSOLO() throws RecognitionException {
        try {
            int _type = SOLO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:472:7: ( 'solo' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:472:9: 'solo'
            {
            match("solo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOLO"

    // $ANTLR start "PLAYER"
    public final void mPLAYER() throws RecognitionException {
        try {
            int _type = PLAYER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:473:9: ( 'Player' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:473:11: 'Player'
            {
            match("Player"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLAYER"

    // $ANTLR start "LIST_KW"
    public final void mLIST_KW() throws RecognitionException {
        try {
            int _type = LIST_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:474:10: ( 'list' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:474:12: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST_KW"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:475:5: ( 'in' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:475:7: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:476:7: ( 'loop' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:476:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "ONCE"
    public final void mONCE() throws RecognitionException {
        try {
            int _type = ONCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:477:7: ( 'once' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:477:9: 'once'
            {
            match("once"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONCE"

    // $ANTLR start "RANDOM_KW"
    public final void mRANDOM_KW() throws RecognitionException {
        try {
            int _type = RANDOM_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:478:11: ( 'random' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:478:13: 'random'
            {
            match("random"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANDOM_KW"

    // $ANTLR start "DEFINITION_KW"
    public final void mDEFINITION_KW() throws RecognitionException {
        try {
            int _type = DEFINITION_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:479:15: ( 'definition' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:479:17: 'definition'
            {
            match("definition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINITION_KW"

    // $ANTLR start "MEANS"
    public final void mMEANS() throws RecognitionException {
        try {
            int _type = MEANS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:480:8: ( 'means' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:480:10: 'means'
            {
            match("means"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEANS"

    // $ANTLR start "PAUSE_KW"
    public final void mPAUSE_KW() throws RecognitionException {
        try {
            int _type = PAUSE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:481:10: ( 'pause' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:481:12: 'pause'
            {
            match("pause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAUSE_KW"

    // $ANTLR start "MUTE_KW"
    public final void mMUTE_KW() throws RecognitionException {
        try {
            int _type = MUTE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:482:10: ( 'mute' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:482:12: 'mute'
            {
            match("mute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUTE_KW"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:483:5: ( 'on' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:483:7: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OFF"
    public final void mOFF() throws RecognitionException {
        try {
            int _type = OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:484:6: ( 'off' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:484:8: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OFF"

    // $ANTLR start "PLAY_KW"
    public final void mPLAY_KW() throws RecognitionException {
        try {
            int _type = PLAY_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:485:10: ( 'play' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:485:12: 'play'
            {
            match("play"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLAY_KW"

    // $ANTLR start "STOP_KW"
    public final void mSTOP_KW() throws RecognitionException {
        try {
            int _type = STOP_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:486:10: ( 'stop' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:486:12: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STOP_KW"

    // $ANTLR start "ENDS_KW"
    public final void mENDS_KW() throws RecognitionException {
        try {
            int _type = ENDS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:487:10: ( 'ends' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:487:12: 'ends'
            {
            match("ends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDS_KW"

    // $ANTLR start "STARTS_KW"
    public final void mSTARTS_KW() throws RecognitionException {
        try {
            int _type = STARTS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:488:11: ( 'starts' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:488:13: 'starts'
            {
            match("starts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STARTS_KW"

    // $ANTLR start "BLOCK_KW"
    public final void mBLOCK_KW() throws RecognitionException {
        try {
            int _type = BLOCK_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:489:10: ( 'block' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:489:12: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK_KW"

    // $ANTLR start "TRANSLATION"
    public final void mTRANSLATION() throws RecognitionException {
        try {
            int _type = TRANSLATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:490:13: ( 'translation' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:490:15: 'translation'
            {
            match("translation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSLATION"

    // $ANTLR start "ROTATION"
    public final void mROTATION() throws RecognitionException {
        try {
            int _type = ROTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:491:10: ( 'rotation' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:491:12: 'rotation'
            {
            match("rotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROTATION"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:492:8: ( 'scale' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:492:10: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "EFFACE_KW"
    public final void mEFFACE_KW() throws RecognitionException {
        try {
            int _type = EFFACE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:493:11: ( 'efface' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:493:13: 'efface'
            {
            match("efface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EFFACE_KW"

    // $ANTLR start "GENERATE_KW"
    public final void mGENERATE_KW() throws RecognitionException {
        try {
            int _type = GENERATE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:494:13: ( 'generate' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:494:15: 'generate'
            {
            match("generate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENERATE_KW"

    // $ANTLR start "WAIT_KW"
    public final void mWAIT_KW() throws RecognitionException {
        try {
            int _type = WAIT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:495:10: ( 'wait' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:495:12: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WAIT_KW"

    // $ANTLR start "ENDWAIT"
    public final void mENDWAIT() throws RecognitionException {
        try {
            int _type = ENDWAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:496:10: ( 'endWait' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:496:12: 'endWait'
            {
            match("endWait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDWAIT"

    // $ANTLR start "SAVE_KW"
    public final void mSAVE_KW() throws RecognitionException {
        try {
            int _type = SAVE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:497:10: ( 'save' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:497:12: 'save'
            {
            match("save"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVE_KW"

    // $ANTLR start "RULE_KW"
    public final void mRULE_KW() throws RecognitionException {
        try {
            int _type = RULE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:498:10: ( 'rule' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:498:12: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW"

    // $ANTLR start "MOVES_KW"
    public final void mMOVES_KW() throws RecognitionException {
        try {
            int _type = MOVES_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:499:10: ( 'moves' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:499:12: 'moves'
            {
            match("moves"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVES_KW"

    // $ANTLR start "DIES_KW"
    public final void mDIES_KW() throws RecognitionException {
        try {
            int _type = DIES_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:500:9: ( 'dies' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:500:11: 'dies'
            {
            match("dies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIES_KW"

    // $ANTLR start "TOUCHES_KW"
    public final void mTOUCHES_KW() throws RecognitionException {
        try {
            int _type = TOUCHES_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:501:12: ( 'touches' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:501:14: 'touches'
            {
            match("touches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOUCHES_KW"

    // $ANTLR start "KILLS_KW"
    public final void mKILLS_KW() throws RecognitionException {
        try {
            int _type = KILLS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:502:10: ( 'kills' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:502:12: 'kills'
            {
            match("kills"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KILLS_KW"

    // $ANTLR start "KILLED_KW"
    public final void mKILLED_KW() throws RecognitionException {
        try {
            int _type = KILLED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:503:11: ( 'killed' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:503:13: 'killed'
            {
            match("killed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KILLED_KW"

    // $ANTLR start "TOUCHED_KW"
    public final void mTOUCHED_KW() throws RecognitionException {
        try {
            int _type = TOUCHED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:504:12: ( 'touched' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:504:14: 'touched'
            {
            match("touched"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOUCHED_KW"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:505:4: ( 'by' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:505:6: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "OTHER"
    public final void mOTHER() throws RecognitionException {
        try {
            int _type = OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:506:7: ( 'other' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:506:9: 'other'
            {
            match("other"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OTHER"

    // $ANTLR start "BECOMES"
    public final void mBECOMES() throws RecognitionException {
        try {
            int _type = BECOMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:507:9: ( 'becomes' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:507:11: 'becomes'
            {
            match("becomes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BECOMES"

    // $ANTLR start "VICTORY_KW"
    public final void mVICTORY_KW() throws RecognitionException {
        try {
            int _type = VICTORY_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:508:12: ( 'victory' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:508:14: 'victory'
            {
            match("victory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VICTORY_KW"

    // $ANTLR start "DEFEAT_KW"
    public final void mDEFEAT_KW() throws RecognitionException {
        try {
            int _type = DEFEAT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:509:11: ( 'defeat' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:509:13: 'defeat'
            {
            match("defeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFEAT_KW"

    // $ANTLR start "IF_KW"
    public final void mIF_KW() throws RecognitionException {
        try {
            int _type = IF_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:510:7: ( 'if' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:510:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF_KW"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:511:6: ( 'else' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:511:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:512:7: ( 'endIf' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:512:9: 'endIf'
            {
            match("endIf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:513:4: ( 'or' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:513:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "COMP"
    public final void mCOMP() throws RecognitionException {
        try {
            int _type = COMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:514:6: ( 'comp' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:514:8: 'comp'
            {
            match("comp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMP"

    // $ANTLR start "DEAD_KW"
    public final void mDEAD_KW() throws RecognitionException {
        try {
            int _type = DEAD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:515:9: ( 'dead' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:515:11: 'dead'
            {
            match("dead"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEAD_KW"

    // $ANTLR start "ALIVE_KW"
    public final void mALIVE_KW() throws RecognitionException {
        try {
            int _type = ALIVE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:516:10: ( 'alive' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:516:12: 'alive'
            {
            match("alive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALIVE_KW"

    // $ANTLR start "EFFACED_KW"
    public final void mEFFACED_KW() throws RecognitionException {
        try {
            int _type = EFFACED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:517:12: ( 'effaced' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:517:13: 'effaced'
            {
            match("effaced"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EFFACED_KW"

    // $ANTLR start "GENERATED_KW"
    public final void mGENERATED_KW() throws RecognitionException {
        try {
            int _type = GENERATED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:518:14: ( 'generated' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:518:16: 'generated'
            {
            match("generated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENERATED_KW"

    // $ANTLR start "TOUCHING_KW"
    public final void mTOUCHING_KW() throws RecognitionException {
        try {
            int _type = TOUCHING_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:519:13: ( 'touching' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:519:15: 'touching'
            {
            match("touching"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOUCHING_KW"

    // $ANTLR start "MOVING_KW"
    public final void mMOVING_KW() throws RecognitionException {
        try {
            int _type = MOVING_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:520:11: ( 'moving' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:520:13: 'moving'
            {
            match("moving"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVING_KW"

    // $ANTLR start "WAITING_KW"
    public final void mWAITING_KW() throws RecognitionException {
        try {
            int _type = WAITING_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:521:12: ( 'waiting' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:521:14: 'waiting'
            {
            match("waiting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WAITING_KW"

    // $ANTLR start "FINISHED_KW"
    public final void mFINISHED_KW() throws RecognitionException {
        try {
            int _type = FINISHED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:522:13: ( 'finished' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:522:15: 'finished'
            {
            match("finished"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINISHED_KW"

    // $ANTLR start "STARTED_KW"
    public final void mSTARTED_KW() throws RecognitionException {
        try {
            int _type = STARTED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:523:12: ( 'started' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:523:14: 'started'
            {
            match("started"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STARTED_KW"

    // $ANTLR start "PAUSED_KW"
    public final void mPAUSED_KW() throws RecognitionException {
        try {
            int _type = PAUSED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:524:11: ( 'paused' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:524:13: 'paused'
            {
            match("paused"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAUSED_KW"

    // $ANTLR start "MUTED_KW"
    public final void mMUTED_KW() throws RecognitionException {
        try {
            int _type = MUTED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:525:10: ( 'muted' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:525:12: 'muted'
            {
            match("muted"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUTED_KW"

    // $ANTLR start "PLAYED_KW"
    public final void mPLAYED_KW() throws RecognitionException {
        try {
            int _type = PLAYED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:526:11: ( 'played' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:526:13: 'played'
            {
            match("played"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLAYED_KW"

    // $ANTLR start "STOPPED_KW"
    public final void mSTOPPED_KW() throws RecognitionException {
        try {
            int _type = STOPPED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:527:12: ( 'stopped' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:527:14: 'stopped'
            {
            match("stopped"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STOPPED_KW"

    // $ANTLR start "ASSIGN_KW"
    public final void mASSIGN_KW() throws RecognitionException {
        try {
            int _type = ASSIGN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:528:11: ( 'assign' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:528:13: 'assign'
            {
            match("assign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN_KW"

    // $ANTLR start "ADD_KW"
    public final void mADD_KW() throws RecognitionException {
        try {
            int _type = ADD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:529:8: ( 'add' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:529:10: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD_KW"

    // $ANTLR start "SUB_KW"
    public final void mSUB_KW() throws RecognitionException {
        try {
            int _type = SUB_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:530:8: ( 'sub' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:530:10: 'sub'
            {
            match("sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB_KW"

    // $ANTLR start "INVERT_KW"
    public final void mINVERT_KW() throws RecognitionException {
        try {
            int _type = INVERT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:531:11: ( 'invert' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:531:13: 'invert'
            {
            match("invert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVERT_KW"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:532:7: ( 'num' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:532:9: 'num'
            {
            match("num"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "IA_KW"
    public final void mIA_KW() throws RecognitionException {
        try {
            int _type = IA_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:533:8: ( 'ai' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:533:11: 'ai'
            {
            match("ai"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IA_KW"

    // $ANTLR start "DURING"
    public final void mDURING() throws RecognitionException {
        try {
            int _type = DURING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:534:8: ( 'during' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:534:10: 'during'
            {
            match("during"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DURING"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:535:7: ( 'until' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:535:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "EQUIP"
    public final void mEQUIP() throws RecognitionException {
        try {
            int _type = EQUIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:536:7: ( 'equip' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:536:9: 'equip'
            {
            match("equip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUIP"

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:537:6: ( 'next' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:537:8: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXT"

    // $ANTLR start "PREVIOUS"
    public final void mPREVIOUS() throws RecognitionException {
        try {
            int _type = PREVIOUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:538:10: ( 'previous' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:538:12: 'previous'
            {
            match("previous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREVIOUS"

    // $ANTLR start "KEYBOARD"
    public final void mKEYBOARD() throws RecognitionException {
        try {
            int _type = KEYBOARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:539:10: ( 'keyboard' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:539:12: 'keyboard'
            {
            match("keyboard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYBOARD"

    // $ANTLR start "ACTIVATE_KW"
    public final void mACTIVATE_KW() throws RecognitionException {
        try {
            int _type = ACTIVATE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:540:13: ( 'activate' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:540:15: 'activate'
            {
            match("activate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTIVATE_KW"

    // $ANTLR start "DISABLE_KW"
    public final void mDISABLE_KW() throws RecognitionException {
        try {
            int _type = DISABLE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:541:11: ( 'disable' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:541:12: 'disable'
            {
            match("disable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISABLE_KW"

    // $ANTLR start "COMMANDS"
    public final void mCOMMANDS() throws RecognitionException {
        try {
            int _type = COMMANDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:542:9: ( 'commands' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:542:10: 'commands'
            {
            match("commands"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMANDS"

    // $ANTLR start "CLOCKWISE"
    public final void mCLOCKWISE() throws RecognitionException {
        try {
            int _type = CLOCKWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:543:15: ( 'clockwise' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:543:17: 'clockwise'
            {
            match("clockwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOCKWISE"

    // $ANTLR start "ANTICLOCKWISE"
    public final void mANTICLOCKWISE() throws RecognitionException {
        try {
            int _type = ANTICLOCKWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:544:15: ( 'anticlockwise' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:544:17: 'anticlockwise'
            {
            match("anticlockwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANTICLOCKWISE"

    // $ANTLR start "NEXTURN_KW"
    public final void mNEXTURN_KW() throws RecognitionException {
        try {
            int _type = NEXTURN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:545:12: ( 'nexturn' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:545:14: 'nexturn'
            {
            match("nexturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXTURN_KW"

    // $ANTLR start "RELOAD_KW"
    public final void mRELOAD_KW() throws RecognitionException {
        try {
            int _type = RELOAD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:546:11: ( 'reload' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:546:13: 'reload'
            {
            match("reload"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELOAD_KW"

    // $ANTLR start "GRASPS_KW"
    public final void mGRASPS_KW() throws RecognitionException {
        try {
            int _type = GRASPS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:547:10: ( 'grasps' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:547:11: 'grasps'
            {
            match("grasps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRASPS_KW"

    // $ANTLR start "EXPELS_KW"
    public final void mEXPELS_KW() throws RecognitionException {
        try {
            int _type = EXPELS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:548:10: ( 'expels' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:548:12: 'expels'
            {
            match("expels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPELS_KW"

    // $ANTLR start "INGESTS_KW"
    public final void mINGESTS_KW() throws RecognitionException {
        try {
            int _type = INGESTS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:549:11: ( 'ingests' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:549:13: 'ingests'
            {
            match("ingests"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INGESTS_KW"

    // $ANTLR start "DUPLICABLE"
    public final void mDUPLICABLE() throws RecognitionException {
        try {
            int _type = DUPLICABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:550:12: ( 'duplicable' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:550:14: 'duplicable'
            {
            match("duplicable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DUPLICABLE"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:551:8: ( 'first' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:551:10: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "THIRD"
    public final void mTHIRD() throws RecognitionException {
        try {
            int _type = THIRD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:552:8: ( 'third' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:552:10: 'third'
            {
            match("third"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRD"

    // $ANTLR start "POSITION"
    public final void mPOSITION() throws RecognitionException {
        try {
            int _type = POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:553:10: ( 'position' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:553:12: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSITION"

    // $ANTLR start "ORIENTATION"
    public final void mORIENTATION() throws RecognitionException {
        try {
            int _type = ORIENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:554:13: ( 'orientation' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:554:15: 'orientation'
            {
            match("orientation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORIENTATION"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:555:7: ( 'size' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:555:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "PERSON"
    public final void mPERSON() throws RecognitionException {
        try {
            int _type = PERSON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:556:9: ( 'person' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:556:11: 'person'
            {
            match("person"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERSON"

    // $ANTLR start "FREE"
    public final void mFREE() throws RecognitionException {
        try {
            int _type = FREE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:557:7: ( 'free' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:557:9: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FREE"

    // $ANTLR start "FRAME"
    public final void mFRAME() throws RecognitionException {
        try {
            int _type = FRAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:558:8: ( 'frame' | 'frames' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='f') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='r') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='a') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='m') ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4=='e') ) {
                                int LA2_5 = input.LA(6);

                                if ( (LA2_5=='s') ) {
                                    alt2=2;
                                }
                                else {
                                    alt2=1;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:558:10: 'frame'
                    {
                    match("frame"); 


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:558:20: 'frames'
                    {
                    match("frames"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FRAME"

    // $ANTLR start "PRESSED_KW"
    public final void mPRESSED_KW() throws RecognitionException {
        try {
            int _type = PRESSED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:559:12: ( 'pressed' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:559:14: 'pressed'
            {
            match("pressed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRESSED_KW"

    // $ANTLR start "HELD_KW"
    public final void mHELD_KW() throws RecognitionException {
        try {
            int _type = HELD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:560:9: ( 'held' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:560:11: 'held'
            {
            match("held"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HELD_KW"

    // $ANTLR start "RELEASED_KW"
    public final void mRELEASED_KW() throws RecognitionException {
        try {
            int _type = RELEASED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:561:13: ( 'released' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:561:15: 'released'
            {
            match("released"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELEASED_KW"

    // $ANTLR start "OWNES_KW"
    public final void mOWNES_KW() throws RecognitionException {
        try {
            int _type = OWNES_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:562:10: ( 'ownes' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:562:12: 'ownes'
            {
            match("ownes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OWNES_KW"

    // $ANTLR start "NOTOWNES_KW"
    public final void mNOTOWNES_KW() throws RecognitionException {
        try {
            int _type = NOTOWNES_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:563:13: ( 'notOwnes' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:563:16: 'notOwnes'
            {
            match("notOwnes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTOWNES_KW"

    // $ANTLR start "OWNED_KW"
    public final void mOWNED_KW() throws RecognitionException {
        try {
            int _type = OWNED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:564:9: ( 'owned' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:564:10: 'owned'
            {
            match("owned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OWNED_KW"

    // $ANTLR start "NOTOWNED_KW"
    public final void mNOTOWNED_KW() throws RecognitionException {
        try {
            int _type = NOTOWNED_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:565:12: ( 'notOwned' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:565:13: 'notOwned'
            {
            match("notOwned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTOWNED_KW"

    // $ANTLR start "HAPPENS"
    public final void mHAPPENS() throws RecognitionException {
        try {
            int _type = HAPPENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:566:9: ( 'happens' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:566:12: 'happens'
            {
            match("happens"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAPPENS"

    // $ANTLR start "CONTAINS_KW"
    public final void mCONTAINS_KW() throws RecognitionException {
        try {
            int _type = CONTAINS_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:567:14: ( 'contains' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:567:17: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTAINS_KW"

    // $ANTLR start "DISTANCE_KW"
    public final void mDISTANCE_KW() throws RecognitionException {
        try {
            int _type = DISTANCE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:568:13: ( 'distance' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:568:15: 'distance'
            {
            match("distance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTANCE_KW"

    // $ANTLR start "ANGLE_KW"
    public final void mANGLE_KW() throws RecognitionException {
        try {
            int _type = ANGLE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:569:10: ( 'angle' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:569:12: 'angle'
            {
            match("angle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGLE_KW"

    // $ANTLR start "WUP"
    public final void mWUP() throws RecognitionException {
        try {
            int _type = WUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:572:5: ( 'up' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:572:7: 'up'
            {
            match("up"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WUP"

    // $ANTLR start "WDOWN"
    public final void mWDOWN() throws RecognitionException {
        try {
            int _type = WDOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:573:7: ( 'down' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:573:9: 'down'
            {
            match("down"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WDOWN"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:574:6: ( 'left' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:574:8: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:575:7: ( 'right' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:575:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:576:7: ( 'space' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:576:9: 'space'
            {
            match("space"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:577:8: ( 'escape' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:577:10: 'escape'
            {
            match("escape"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "ENTER"
    public final void mENTER() throws RecognitionException {
        try {
            int _type = ENTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:578:7: ( 'enter' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:578:9: 'enter'
            {
            match("enter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTER"

    // $ANTLR start "MOUSE"
    public final void mMOUSE() throws RecognitionException {
        try {
            int _type = MOUSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:579:7: ( 'mouse' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:579:9: 'mouse'
            {
            match("mouse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOUSE"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:580:5: ( 'key' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:580:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "CLICK_LEFT"
    public final void mCLICK_LEFT() throws RecognitionException {
        try {
            int _type = CLICK_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:581:12: ( 'lClick' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:581:14: 'lClick'
            {
            match("lClick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLICK_LEFT"

    // $ANTLR start "CLICK_MIDDLE"
    public final void mCLICK_MIDDLE() throws RecognitionException {
        try {
            int _type = CLICK_MIDDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:582:14: ( 'mClick' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:582:16: 'mClick'
            {
            match("mClick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLICK_MIDDLE"

    // $ANTLR start "CLICK_RIGHT"
    public final void mCLICK_RIGHT() throws RecognitionException {
        try {
            int _type = CLICK_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:583:13: ( 'rClick' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:583:15: 'rClick'
            {
            match("rClick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLICK_RIGHT"

    // $ANTLR start "SCROLL_UP"
    public final void mSCROLL_UP() throws RecognitionException {
        try {
            int _type = SCROLL_UP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:584:11: ( 'scrollUp' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:584:13: 'scrollUp'
            {
            match("scrollUp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCROLL_UP"

    // $ANTLR start "SCROLL_DOWN"
    public final void mSCROLL_DOWN() throws RecognitionException {
        try {
            int _type = SCROLL_DOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:585:13: ( 'scrollDown' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:585:15: 'scrollDown'
            {
            match("scrollDown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCROLL_DOWN"

    // $ANTLR start "COMMAND_KW"
    public final void mCOMMAND_KW() throws RecognitionException {
        try {
            int _type = COMMAND_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:587:12: ( 'command' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:587:14: 'command'
            {
            match("command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMAND_KW"

    // $ANTLR start "JUMP"
    public final void mJUMP() throws RecognitionException {
        try {
            int _type = JUMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:588:6: ( 'jump' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:588:8: 'jump'
            {
            match("jump"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUMP"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:589:6: ( 'move' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:589:8: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "FORWARD"
    public final void mFORWARD() throws RecognitionException {
        try {
            int _type = FORWARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:590:9: ( 'forward' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:590:11: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORWARD"

    // $ANTLR start "BACKWARD"
    public final void mBACKWARD() throws RecognitionException {
        try {
            int _type = BACKWARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:591:10: ( 'backward' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:591:12: 'backward'
            {
            match("backward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKWARD"

    // $ANTLR start "TURN"
    public final void mTURN() throws RecognitionException {
        try {
            int _type = TURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:592:6: ( 'turn' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:592:8: 'turn'
            {
            match("turn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TURN"

    // $ANTLR start "ACCELERATE"
    public final void mACCELERATE() throws RecognitionException {
        try {
            int _type = ACCELERATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:593:12: ( 'accelerate' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:593:14: 'accelerate'
            {
            match("accelerate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCELERATE"

    // $ANTLR start "BRAKE"
    public final void mBRAKE() throws RecognitionException {
        try {
            int _type = BRAKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:594:7: ( 'brake' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:594:9: 'brake'
            {
            match("brake"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRAKE"

    // $ANTLR start "CAMERA"
    public final void mCAMERA() throws RecognitionException {
        try {
            int _type = CAMERA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:597:8: ( 'Camera' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:597:10: 'Camera'
            {
            match("Camera"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAMERA"

    // $ANTLR start "MEDIA"
    public final void mMEDIA() throws RecognitionException {
        try {
            int _type = MEDIA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:598:7: ( 'Media' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:598:9: 'Media'
            {
            match("Media"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEDIA"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:599:6: ( 'Time' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:599:8: 'Time'
            {
            match("Time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:601:8: ( 'value' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:601:10: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "BOOST_INTERVAL"
    public final void mBOOST_INTERVAL() throws RecognitionException {
        try {
            int _type = BOOST_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:603:16: ( 'boostInterval' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:603:18: 'boostInterval'
            {
            match("boostInterval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOST_INTERVAL"

    // $ANTLR start "SHOOT_INTERVAL"
    public final void mSHOOT_INTERVAL() throws RecognitionException {
        try {
            int _type = SHOOT_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:604:16: ( 'shootInterval' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:604:18: 'shootInterval'
            {
            match("shootInterval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHOOT_INTERVAL"

    // $ANTLR start "RELOAD_TIME"
    public final void mRELOAD_TIME() throws RecognitionException {
        try {
            int _type = RELOAD_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:605:13: ( 'reloadTime' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:605:15: 'reloadTime'
            {
            match("reloadTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELOAD_TIME"

    // $ANTLR start "INVENTORY"
    public final void mINVENTORY() throws RecognitionException {
        try {
            int _type = INVENTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:607:11: ( 'inventory' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:607:13: 'inventory'
            {
            match("inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVENTORY"

    // $ANTLR start "EQUIPED_OBJECT"
    public final void mEQUIPED_OBJECT() throws RecognitionException {
        try {
            int _type = EQUIPED_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:608:16: ( 'equipedObjects' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:608:18: 'equipedObjects'
            {
            match("equipedObjects"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUIPED_OBJECT"

    // $ANTLR start "ENTRANCES"
    public final void mENTRANCES() throws RecognitionException {
        try {
            int _type = ENTRANCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:609:11: ( 'entrances' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:609:13: 'entrances'
            {
            match("entrances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTRANCES"

    // $ANTLR start "EXITS"
    public final void mEXITS() throws RecognitionException {
        try {
            int _type = EXITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:610:8: ( 'exits' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:610:10: 'exits'
            {
            match("exits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXITS"

    // $ANTLR start "DAMAGE_ZONE"
    public final void mDAMAGE_ZONE() throws RecognitionException {
        try {
            int _type = DAMAGE_ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:611:13: ( 'damageZone' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:611:15: 'damageZone'
            {
            match("damageZone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAMAGE_ZONE"

    // $ANTLR start "COLLECTORS"
    public final void mCOLLECTORS() throws RecognitionException {
        try {
            int _type = COLLECTORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:612:12: ( 'collectors' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:612:14: 'collectors'
            {
            match("collectors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECTORS"

    // $ANTLR start "TYPES_COLLECTORS"
    public final void mTYPES_COLLECTORS() throws RecognitionException {
        try {
            int _type = TYPES_COLLECTORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:613:17: ( 'typesCollectors' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:613:19: 'typesCollectors'
            {
            match("typesCollectors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPES_COLLECTORS"

    // $ANTLR start "GENERATORS"
    public final void mGENERATORS() throws RecognitionException {
        try {
            int _type = GENERATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:614:12: ( 'generators' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:614:14: 'generators'
            {
            match("generators"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENERATORS"

    // $ANTLR start "TYPE_GENERATORS"
    public final void mTYPE_GENERATORS() throws RecognitionException {
        try {
            int _type = TYPE_GENERATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:615:17: ( 'typeGenerators' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:615:19: 'typeGenerators'
            {
            match("typeGenerators"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_GENERATORS"

    // $ANTLR start "BREAKERS"
    public final void mBREAKERS() throws RecognitionException {
        try {
            int _type = BREAKERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:616:10: ( 'breakers' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:616:12: 'breakers'
            {
            match("breakers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAKERS"

    // $ANTLR start "TYPES_BREAKERS"
    public final void mTYPES_BREAKERS() throws RecognitionException {
        try {
            int _type = TYPES_BREAKERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:617:16: ( 'typesBreakers' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:617:18: 'typesBreakers'
            {
            match("typesBreakers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPES_BREAKERS"

    // $ANTLR start "TELEPORTABLES"
    public final void mTELEPORTABLES() throws RecognitionException {
        try {
            int _type = TELEPORTABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:618:15: ( 'teleportables' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:618:17: 'teleportables'
            {
            match("teleportables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TELEPORTABLES"

    // $ANTLR start "TYPES_TELEPORTABLES"
    public final void mTYPES_TELEPORTABLES() throws RecognitionException {
        try {
            int _type = TYPES_TELEPORTABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:620:2: ( 'typesTeleportables' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:620:5: 'typesTeleportables'
            {
            match("typesTeleportables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPES_TELEPORTABLES"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:623:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:9: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:21: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:22: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:26: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:624:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:7: ( LETTER ( LETTER | '0' .. '9' | '_' | '-' | '@' )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:9: LETTER ( LETTER | '0' .. '9' | '_' | '-' | '@' )*
            {
            mLETTER(); 
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:15: ( LETTER | '0' .. '9' | '_' | '-' | '@' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='@' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:626:5: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:626:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:626:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||(LA7_0>='\f' && LA7_0<='\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:8: ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__221 | T__222 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | FROM | DBP | GAME | GRAVITY_KW | SCORE | TURNBASED_KW | WORLD_KW | GRIDSIZE_KW | GENERIC | GRID | RIBBON | NAME_KW | TYPE | INSERT_KW | REMOVE_KW | SOLO | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | CLOCKWISE | ANTICLOCKWISE | NEXTURN_KW | RELOAD_KW | GRASPS_KW | EXPELS_KW | INGESTS_KW | DUPLICABLE | FIRST | THIRD | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | PRESSED_KW | HELD_KW | RELEASED_KW | OWNES_KW | NOTOWNES_KW | OWNED_KW | NOTOWNED_KW | HAPPENS | CONTAINS_KW | DISTANCE_KW | ANGLE_KW | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | TIME | VALUE | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | LETTER | FLOAT | IDENT | WS )
        int alt8=199;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:10: GAME_KW
                {
                mGAME_KW(); 

                }
                break;
            case 2 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:18: GAME_ATTRIBUT_KW
                {
                mGAME_ATTRIBUT_KW(); 

                }
                break;
            case 3 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:35: INIT_IS_KW
                {
                mINIT_IS_KW(); 

                }
                break;
            case 4 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:46: DEC
                {
                mDEC(); 

                }
                break;
            case 5 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:50: T__221
                {
                mT__221(); 

                }
                break;
            case 6 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:57: T__222
                {
                mT__222(); 

                }
                break;
            case 7 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:64: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 8 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:72: PD
                {
                mPD(); 

                }
                break;
            case 9 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:75: PG
                {
                mPG(); 

                }
                break;
            case 10 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:78: FIN
                {
                mFIN(); 

                }
                break;
            case 11 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:82: VIRG
                {
                mVIRG(); 

                }
                break;
            case 12 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:87: HAS
                {
                mHAS(); 

                }
                break;
            case 13 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:91: AT
                {
                mAT(); 

                }
                break;
            case 14 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:94: IS
                {
                mIS(); 

                }
                break;
            case 15 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:97: AND
                {
                mAND(); 

                }
                break;
            case 16 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:101: OF
                {
                mOF(); 

                }
                break;
            case 17 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:104: WITH
                {
                mWITH(); 

                }
                break;
            case 18 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:109: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 19 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:117: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:122: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:128: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:132: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:136: POW
                {
                mPOW(); 

                }
                break;
            case 24 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:140: MOD
                {
                mMOD(); 

                }
                break;
            case 25 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:144: X
                {
                mX(); 

                }
                break;
            case 26 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:146: Y
                {
                mY(); 

                }
                break;
            case 27 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:148: Z
                {
                mZ(); 

                }
                break;
            case 28 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:150: ALL
                {
                mALL(); 

                }
                break;
            case 29 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:154: NOT
                {
                mNOT(); 

                }
                break;
            case 30 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:158: MIN
                {
                mMIN(); 

                }
                break;
            case 31 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:162: SEC
                {
                mSEC(); 

                }
                break;
            case 32 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:166: MS
                {
                mMS(); 

                }
                break;
            case 33 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:169: THEN
                {
                mTHEN(); 

                }
                break;
            case 34 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:174: FOR
                {
                mFOR(); 

                }
                break;
            case 35 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:178: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 36 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:185: INF
                {
                mINF(); 

                }
                break;
            case 37 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:189: SUP
                {
                mSUP(); 

                }
                break;
            case 38 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:193: INFEG
                {
                mINFEG(); 

                }
                break;
            case 39 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:199: SUPED
                {
                mSUPED(); 

                }
                break;
            case 40 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:205: DIFF
                {
                mDIFF(); 

                }
                break;
            case 41 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:210: FROM
                {
                mFROM(); 

                }
                break;
            case 42 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:215: DBP
                {
                mDBP(); 

                }
                break;
            case 43 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:219: GAME
                {
                mGAME(); 

                }
                break;
            case 44 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:224: GRAVITY_KW
                {
                mGRAVITY_KW(); 

                }
                break;
            case 45 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:235: SCORE
                {
                mSCORE(); 

                }
                break;
            case 46 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:241: TURNBASED_KW
                {
                mTURNBASED_KW(); 

                }
                break;
            case 47 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:254: WORLD_KW
                {
                mWORLD_KW(); 

                }
                break;
            case 48 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:263: GRIDSIZE_KW
                {
                mGRIDSIZE_KW(); 

                }
                break;
            case 49 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:275: GENERIC
                {
                mGENERIC(); 

                }
                break;
            case 50 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:283: GRID
                {
                mGRID(); 

                }
                break;
            case 51 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:288: RIBBON
                {
                mRIBBON(); 

                }
                break;
            case 52 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:295: NAME_KW
                {
                mNAME_KW(); 

                }
                break;
            case 53 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:303: TYPE
                {
                mTYPE(); 

                }
                break;
            case 54 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:308: INSERT_KW
                {
                mINSERT_KW(); 

                }
                break;
            case 55 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:318: REMOVE_KW
                {
                mREMOVE_KW(); 

                }
                break;
            case 56 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:328: SOLO
                {
                mSOLO(); 

                }
                break;
            case 57 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:333: PLAYER
                {
                mPLAYER(); 

                }
                break;
            case 58 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:340: LIST_KW
                {
                mLIST_KW(); 

                }
                break;
            case 59 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:348: IN
                {
                mIN(); 

                }
                break;
            case 60 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:351: LOOP
                {
                mLOOP(); 

                }
                break;
            case 61 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:356: ONCE
                {
                mONCE(); 

                }
                break;
            case 62 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:361: RANDOM_KW
                {
                mRANDOM_KW(); 

                }
                break;
            case 63 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:371: DEFINITION_KW
                {
                mDEFINITION_KW(); 

                }
                break;
            case 64 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:385: MEANS
                {
                mMEANS(); 

                }
                break;
            case 65 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:391: PAUSE_KW
                {
                mPAUSE_KW(); 

                }
                break;
            case 66 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:400: MUTE_KW
                {
                mMUTE_KW(); 

                }
                break;
            case 67 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:408: ON
                {
                mON(); 

                }
                break;
            case 68 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:411: OFF
                {
                mOFF(); 

                }
                break;
            case 69 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:415: PLAY_KW
                {
                mPLAY_KW(); 

                }
                break;
            case 70 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:423: STOP_KW
                {
                mSTOP_KW(); 

                }
                break;
            case 71 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:431: ENDS_KW
                {
                mENDS_KW(); 

                }
                break;
            case 72 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:439: STARTS_KW
                {
                mSTARTS_KW(); 

                }
                break;
            case 73 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:449: BLOCK_KW
                {
                mBLOCK_KW(); 

                }
                break;
            case 74 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:458: TRANSLATION
                {
                mTRANSLATION(); 

                }
                break;
            case 75 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:470: ROTATION
                {
                mROTATION(); 

                }
                break;
            case 76 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:479: SCALE
                {
                mSCALE(); 

                }
                break;
            case 77 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:485: EFFACE_KW
                {
                mEFFACE_KW(); 

                }
                break;
            case 78 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:495: GENERATE_KW
                {
                mGENERATE_KW(); 

                }
                break;
            case 79 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:507: WAIT_KW
                {
                mWAIT_KW(); 

                }
                break;
            case 80 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:515: ENDWAIT
                {
                mENDWAIT(); 

                }
                break;
            case 81 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:523: SAVE_KW
                {
                mSAVE_KW(); 

                }
                break;
            case 82 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:531: RULE_KW
                {
                mRULE_KW(); 

                }
                break;
            case 83 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:539: MOVES_KW
                {
                mMOVES_KW(); 

                }
                break;
            case 84 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:548: DIES_KW
                {
                mDIES_KW(); 

                }
                break;
            case 85 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:556: TOUCHES_KW
                {
                mTOUCHES_KW(); 

                }
                break;
            case 86 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:567: KILLS_KW
                {
                mKILLS_KW(); 

                }
                break;
            case 87 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:576: KILLED_KW
                {
                mKILLED_KW(); 

                }
                break;
            case 88 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:586: TOUCHED_KW
                {
                mTOUCHED_KW(); 

                }
                break;
            case 89 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:597: BY
                {
                mBY(); 

                }
                break;
            case 90 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:600: OTHER
                {
                mOTHER(); 

                }
                break;
            case 91 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:606: BECOMES
                {
                mBECOMES(); 

                }
                break;
            case 92 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:614: VICTORY_KW
                {
                mVICTORY_KW(); 

                }
                break;
            case 93 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:625: DEFEAT_KW
                {
                mDEFEAT_KW(); 

                }
                break;
            case 94 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:635: IF_KW
                {
                mIF_KW(); 

                }
                break;
            case 95 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:641: ELSE
                {
                mELSE(); 

                }
                break;
            case 96 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:646: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 97 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:652: OR
                {
                mOR(); 

                }
                break;
            case 98 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:655: COMP
                {
                mCOMP(); 

                }
                break;
            case 99 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:660: DEAD_KW
                {
                mDEAD_KW(); 

                }
                break;
            case 100 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:668: ALIVE_KW
                {
                mALIVE_KW(); 

                }
                break;
            case 101 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:677: EFFACED_KW
                {
                mEFFACED_KW(); 

                }
                break;
            case 102 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:688: GENERATED_KW
                {
                mGENERATED_KW(); 

                }
                break;
            case 103 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:701: TOUCHING_KW
                {
                mTOUCHING_KW(); 

                }
                break;
            case 104 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:713: MOVING_KW
                {
                mMOVING_KW(); 

                }
                break;
            case 105 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:723: WAITING_KW
                {
                mWAITING_KW(); 

                }
                break;
            case 106 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:734: FINISHED_KW
                {
                mFINISHED_KW(); 

                }
                break;
            case 107 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:746: STARTED_KW
                {
                mSTARTED_KW(); 

                }
                break;
            case 108 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:757: PAUSED_KW
                {
                mPAUSED_KW(); 

                }
                break;
            case 109 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:767: MUTED_KW
                {
                mMUTED_KW(); 

                }
                break;
            case 110 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:776: PLAYED_KW
                {
                mPLAYED_KW(); 

                }
                break;
            case 111 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:786: STOPPED_KW
                {
                mSTOPPED_KW(); 

                }
                break;
            case 112 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:797: ASSIGN_KW
                {
                mASSIGN_KW(); 

                }
                break;
            case 113 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:807: ADD_KW
                {
                mADD_KW(); 

                }
                break;
            case 114 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:814: SUB_KW
                {
                mSUB_KW(); 

                }
                break;
            case 115 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:821: INVERT_KW
                {
                mINVERT_KW(); 

                }
                break;
            case 116 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:831: NUM
                {
                mNUM(); 

                }
                break;
            case 117 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:835: IA_KW
                {
                mIA_KW(); 

                }
                break;
            case 118 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:841: DURING
                {
                mDURING(); 

                }
                break;
            case 119 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:848: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 120 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:854: EQUIP
                {
                mEQUIP(); 

                }
                break;
            case 121 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:860: NEXT
                {
                mNEXT(); 

                }
                break;
            case 122 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:865: PREVIOUS
                {
                mPREVIOUS(); 

                }
                break;
            case 123 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:874: KEYBOARD
                {
                mKEYBOARD(); 

                }
                break;
            case 124 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:883: ACTIVATE_KW
                {
                mACTIVATE_KW(); 

                }
                break;
            case 125 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:895: DISABLE_KW
                {
                mDISABLE_KW(); 

                }
                break;
            case 126 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:906: COMMANDS
                {
                mCOMMANDS(); 

                }
                break;
            case 127 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:915: CLOCKWISE
                {
                mCLOCKWISE(); 

                }
                break;
            case 128 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:925: ANTICLOCKWISE
                {
                mANTICLOCKWISE(); 

                }
                break;
            case 129 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:939: NEXTURN_KW
                {
                mNEXTURN_KW(); 

                }
                break;
            case 130 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:950: RELOAD_KW
                {
                mRELOAD_KW(); 

                }
                break;
            case 131 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:960: GRASPS_KW
                {
                mGRASPS_KW(); 

                }
                break;
            case 132 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:970: EXPELS_KW
                {
                mEXPELS_KW(); 

                }
                break;
            case 133 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:980: INGESTS_KW
                {
                mINGESTS_KW(); 

                }
                break;
            case 134 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:991: DUPLICABLE
                {
                mDUPLICABLE(); 

                }
                break;
            case 135 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1002: FIRST
                {
                mFIRST(); 

                }
                break;
            case 136 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1008: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 137 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1014: POSITION
                {
                mPOSITION(); 

                }
                break;
            case 138 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1023: ORIENTATION
                {
                mORIENTATION(); 

                }
                break;
            case 139 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1035: SIZE
                {
                mSIZE(); 

                }
                break;
            case 140 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1040: PERSON
                {
                mPERSON(); 

                }
                break;
            case 141 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1047: FREE
                {
                mFREE(); 

                }
                break;
            case 142 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1052: FRAME
                {
                mFRAME(); 

                }
                break;
            case 143 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1058: PRESSED_KW
                {
                mPRESSED_KW(); 

                }
                break;
            case 144 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1069: HELD_KW
                {
                mHELD_KW(); 

                }
                break;
            case 145 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1077: RELEASED_KW
                {
                mRELEASED_KW(); 

                }
                break;
            case 146 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1089: OWNES_KW
                {
                mOWNES_KW(); 

                }
                break;
            case 147 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1098: NOTOWNES_KW
                {
                mNOTOWNES_KW(); 

                }
                break;
            case 148 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1110: OWNED_KW
                {
                mOWNED_KW(); 

                }
                break;
            case 149 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1119: NOTOWNED_KW
                {
                mNOTOWNED_KW(); 

                }
                break;
            case 150 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1131: HAPPENS
                {
                mHAPPENS(); 

                }
                break;
            case 151 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1139: CONTAINS_KW
                {
                mCONTAINS_KW(); 

                }
                break;
            case 152 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1151: DISTANCE_KW
                {
                mDISTANCE_KW(); 

                }
                break;
            case 153 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1163: ANGLE_KW
                {
                mANGLE_KW(); 

                }
                break;
            case 154 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1172: WUP
                {
                mWUP(); 

                }
                break;
            case 155 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1176: WDOWN
                {
                mWDOWN(); 

                }
                break;
            case 156 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1182: LEFT
                {
                mLEFT(); 

                }
                break;
            case 157 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1187: RIGHT
                {
                mRIGHT(); 

                }
                break;
            case 158 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1193: SPACE
                {
                mSPACE(); 

                }
                break;
            case 159 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1199: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 160 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1206: ENTER
                {
                mENTER(); 

                }
                break;
            case 161 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1212: MOUSE
                {
                mMOUSE(); 

                }
                break;
            case 162 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1218: KEY
                {
                mKEY(); 

                }
                break;
            case 163 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1222: CLICK_LEFT
                {
                mCLICK_LEFT(); 

                }
                break;
            case 164 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1233: CLICK_MIDDLE
                {
                mCLICK_MIDDLE(); 

                }
                break;
            case 165 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1246: CLICK_RIGHT
                {
                mCLICK_RIGHT(); 

                }
                break;
            case 166 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1258: SCROLL_UP
                {
                mSCROLL_UP(); 

                }
                break;
            case 167 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1268: SCROLL_DOWN
                {
                mSCROLL_DOWN(); 

                }
                break;
            case 168 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1280: COMMAND_KW
                {
                mCOMMAND_KW(); 

                }
                break;
            case 169 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1291: JUMP
                {
                mJUMP(); 

                }
                break;
            case 170 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1296: MOVE
                {
                mMOVE(); 

                }
                break;
            case 171 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1301: FORWARD
                {
                mFORWARD(); 

                }
                break;
            case 172 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1309: BACKWARD
                {
                mBACKWARD(); 

                }
                break;
            case 173 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1318: TURN
                {
                mTURN(); 

                }
                break;
            case 174 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1323: ACCELERATE
                {
                mACCELERATE(); 

                }
                break;
            case 175 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1334: BRAKE
                {
                mBRAKE(); 

                }
                break;
            case 176 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1340: CAMERA
                {
                mCAMERA(); 

                }
                break;
            case 177 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1347: MEDIA
                {
                mMEDIA(); 

                }
                break;
            case 178 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1353: TIME
                {
                mTIME(); 

                }
                break;
            case 179 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1358: VALUE
                {
                mVALUE(); 

                }
                break;
            case 180 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1364: BOOST_INTERVAL
                {
                mBOOST_INTERVAL(); 

                }
                break;
            case 181 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1379: SHOOT_INTERVAL
                {
                mSHOOT_INTERVAL(); 

                }
                break;
            case 182 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1394: RELOAD_TIME
                {
                mRELOAD_TIME(); 

                }
                break;
            case 183 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1406: INVENTORY
                {
                mINVENTORY(); 

                }
                break;
            case 184 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1416: EQUIPED_OBJECT
                {
                mEQUIPED_OBJECT(); 

                }
                break;
            case 185 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1431: ENTRANCES
                {
                mENTRANCES(); 

                }
                break;
            case 186 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1441: EXITS
                {
                mEXITS(); 

                }
                break;
            case 187 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1447: DAMAGE_ZONE
                {
                mDAMAGE_ZONE(); 

                }
                break;
            case 188 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1459: COLLECTORS
                {
                mCOLLECTORS(); 

                }
                break;
            case 189 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1470: TYPES_COLLECTORS
                {
                mTYPES_COLLECTORS(); 

                }
                break;
            case 190 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1487: GENERATORS
                {
                mGENERATORS(); 

                }
                break;
            case 191 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1498: TYPE_GENERATORS
                {
                mTYPE_GENERATORS(); 

                }
                break;
            case 192 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1514: BREAKERS
                {
                mBREAKERS(); 

                }
                break;
            case 193 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1523: TYPES_BREAKERS
                {
                mTYPES_BREAKERS(); 

                }
                break;
            case 194 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1538: TELEPORTABLES
                {
                mTELEPORTABLES(); 

                }
                break;
            case 195 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1552: TYPES_TELEPORTABLES
                {
                mTYPES_TELEPORTABLES(); 

                }
                break;
            case 196 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1572: LETTER
                {
                mLETTER(); 

                }
                break;
            case 197 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1579: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 198 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1585: IDENT
                {
                mIDENT(); 

                }
                break;
            case 199 :
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1591: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\5\64\1\103\4\uffff\6\64\5\uffff\1\136\1\137\1\140\2\64"+
        "\1\163\1\uffff\1\165\1\167\2\uffff\20\64\2\uffff\1\65\2\uffff\14"+
        "\65\2\uffff\2\65\1\u00b7\4\65\1\u00bf\1\65\1\u00c2\1\u00c6\1\u00c7"+
        "\1\u00c9\1\u00cb\1\65\1\u00ce\6\65\1\u00d6\3\65\3\uffff\5\65\1\u00e0"+
        "\14\65\5\uffff\45\65\1\u0120\6\65\1\u0127\11\65\1\u0132\5\65\1\u0138"+
        "\2\65\1\uffff\1\u013b\2\65\1\u013e\2\65\1\u0141\1\uffff\2\65\1\uffff"+
        "\3\65\2\uffff\1\u0147\1\uffff\1\65\1\uffff\2\65\1\uffff\7\65\1\uffff"+
        "\4\65\1\u0157\1\65\1\u0159\1\65\1\u015b\1\uffff\14\65\1\u0169\52"+
        "\65\1\u019d\7\65\1\uffff\6\65\1\uffff\1\u01ac\1\65\1\u01ae\1\65"+
        "\1\u01b1\1\u01b4\4\65\1\uffff\1\u01b9\1\u01ba\3\65\1\uffff\1\65"+
        "\1\u01bf\1\uffff\2\65\1\uffff\2\65\1\uffff\5\65\1\uffff\1\u01ca"+
        "\3\65\1\u01cf\1\65\1\u01d2\10\65\1\uffff\1\u01db\1\uffff\1\u01dd"+
        "\1\uffff\1\65\1\u01e0\1\u01e2\6\65\1\u01e9\1\u01eb\1\65\1\u01ed"+
        "\1\uffff\1\u01ee\2\65\1\u01f1\2\65\1\u01f5\10\65\1\u01fe\2\65\1"+
        "\u0201\1\u0202\1\u0203\3\65\1\u0207\1\u0208\4\65\1\u020d\2\65\1"+
        "\u0211\4\65\1\u0216\5\65\1\u021c\6\65\1\uffff\2\65\1\u0226\5\65"+
        "\1\u022c\2\65\1\u022f\2\65\1\uffff\1\65\1\uffff\1\u0234\1\65\1\uffff"+
        "\2\65\1\uffff\2\65\1\u023d\1\65\2\uffff\1\u0240\1\65\1\u0242\1\65"+
        "\1\uffff\1\65\1\u0245\1\u0246\7\65\1\uffff\1\u024e\1\65\1\u0250"+
        "\1\u0251\1\uffff\1\u0252\1\65\1\uffff\2\65\1\u0256\1\65\1\u0258"+
        "\3\65\1\uffff\1\65\1\uffff\1\u025d\1\u025e\1\uffff\1\u025f\1\uffff"+
        "\1\65\1\u0261\1\65\1\u0263\1\u0264\1\65\1\uffff\1\65\1\uffff\1\65"+
        "\2\uffff\1\u0269\1\65\1\uffff\3\65\1\uffff\2\65\1\u0271\5\65\1\uffff"+
        "\2\65\3\uffff\3\65\2\uffff\4\65\1\uffff\1\65\1\u0282\1\65\1\uffff"+
        "\4\65\1\uffff\1\65\1\u0289\1\u028a\2\65\1\uffff\1\u028e\1\65\1\u0290"+
        "\1\65\1\u0292\3\65\1\u0296\1\uffff\4\65\1\u029b\1\uffff\1\65\1\u029d"+
        "\1\uffff\4\65\1\uffff\10\65\1\uffff\1\65\1\u0240\1\uffff\1\65\1"+
        "\uffff\2\65\2\uffff\1\u02af\2\65\1\u02b2\1\u02b3\2\65\1\uffff\1"+
        "\65\3\uffff\3\65\1\uffff\1\65\1\uffff\4\65\3\uffff\1\u02bf\1\uffff"+
        "\1\u02c0\2\uffff\2\65\1\u02c4\1\65\1\uffff\2\65\1\u02c8\3\65\1\u02cc"+
        "\1\uffff\1\u02cd\1\u02cf\1\65\1\u02d1\1\65\1\u02d3\1\u02d4\1\u02d5"+
        "\1\65\1\u02d7\2\65\1\u02da\2\65\1\u02dd\1\uffff\1\u02de\3\65\1\u02e2"+
        "\1\65\2\uffff\1\65\1\u02e6\1\65\1\uffff\1\u02e8\1\uffff\1\u02e9"+
        "\1\uffff\1\u02ea\2\65\1\uffff\4\65\1\uffff\1\u02f1\1\uffff\1\u02f2"+
        "\10\65\1\u02fb\1\u02fc\2\65\1\u02ff\1\65\1\u0301\1\65\1\uffff\2"+
        "\65\2\uffff\1\65\1\u0306\1\65\1\u0308\1\u0309\1\u030a\4\65\1\u0310"+
        "\2\uffff\2\65\1\u0313\1\uffff\1\u0314\1\65\1\u0316\1\uffff\1\65"+
        "\1\u0318\1\65\2\uffff\1\65\1\uffff\1\65\1\uffff\1\65\3\uffff\1\65"+
        "\1\uffff\1\u031f\1\65\1\uffff\2\65\2\uffff\1\65\1\u0324\1\65\1\uffff"+
        "\1\u0326\1\65\1\u0328\1\uffff\1\65\3\uffff\1\65\1\u032b\1\u032d"+
        "\3\65\2\uffff\10\65\2\uffff\1\u0339\1\65\1\uffff\1\u033b\1\uffff"+
        "\1\65\1\u033d\2\65\1\uffff\1\65\3\uffff\1\u0341\1\u0342\1\65\1\u0344"+
        "\1\u0345\1\uffff\1\u0346\1\65\2\uffff\1\65\1\uffff\1\u0349\1\uffff"+
        "\1\u034b\2\65\1\u034e\1\u034f\1\65\1\uffff\1\u0351\2\65\1\u0354"+
        "\1\uffff\1\u0355\1\uffff\1\65\1\uffff\1\65\1\u0358\1\uffff\1\u0359"+
        "\1\uffff\1\u035a\5\65\1\u0360\4\65\1\uffff\1\65\1\uffff\1\65\1\uffff"+
        "\1\65\1\u0368\1\65\2\uffff\1\65\3\uffff\2\65\1\uffff\1\u036d\1\uffff"+
        "\2\65\2\uffff\1\65\1\uffff\2\65\2\uffff\1\u0373\1\65\3\uffff\1\65"+
        "\1\u0376\1\65\1\u0378\1\65\1\uffff\6\65\1\u0380\1\uffff\2\65\1\u0383"+
        "\1\65\1\uffff\1\u0385\1\u0386\1\u0387\1\u0388\1\u0389\1\uffff\1"+
        "\65\1\u038b\1\uffff\1\65\1\uffff\1\u038d\6\65\1\uffff\1\u0394\1"+
        "\65\1\uffff\1\65\5\uffff\1\65\1\uffff\1\65\1\uffff\6\65\1\uffff"+
        "\5\65\1\u03a4\2\65\1\u03a7\1\u03a8\1\u03a9\1\u03aa\3\65\1\uffff"+
        "\1\65\1\u03af\4\uffff\1\u03b0\1\65\1\u03b2\1\65\2\uffff\1\u03b4"+
        "\1\uffff\1\65\1\uffff\1\65\1\u03b7\1\uffff";
    static final String DFA8_eofS =
        "\u03b8\uffff";
    static final String DFA8_minS =
        "\1\11\5\55\1\57\4\uffff\6\55\5\uffff\6\55\1\uffff\2\75\2\uffff"+
        "\20\55\2\uffff\1\115\2\uffff\1\111\1\103\1\141\1\145\1\162\1\160"+
        "\1\165\2\154\1\162\1\141\1\156\2\uffff\1\160\1\154\1\55\1\144\1"+
        "\151\1\163\1\144\1\55\1\143\5\55\1\150\1\55\1\156\1\164\1\162\1"+
        "\151\1\143\1\157\1\55\1\143\1\141\1\157\3\uffff\1\164\2\155\1\170"+
        "\1\156\1\55\1\141\1\164\1\165\1\154\1\141\1\154\1\141\1\166\1\142"+
        "\1\172\1\141\1\157\5\uffff\1\155\1\141\1\156\1\142\1\154\1\156\1"+
        "\164\2\154\1\141\1\163\1\157\1\146\1\154\1\141\1\145\1\160\1\167"+
        "\1\155\1\165\1\141\1\145\1\163\1\162\1\144\1\146\1\163\1\165\1\151"+
        "\1\143\1\154\1\171\1\143\2\154\1\157\1\164\1\55\2\155\1\144\1\155"+
        "\1\105\1\124\1\55\1\145\2\156\1\162\1\156\1\145\1\143\1\145\1\163"+
        "\1\55\1\155\1\145\1\155\1\151\1\163\1\55\1\160\1\144\1\uffff\1\55"+
        "\1\151\1\154\1\55\1\166\1\151\1\55\1\uffff\1\151\1\145\1\uffff\3"+
        "\145\2\uffff\1\55\1\uffff\1\145\1\uffff\2\145\1\uffff\1\145\1\150"+
        "\1\154\1\164\1\167\1\157\1\143\1\uffff\2\153\1\141\1\163\1\55\1"+
        "\145\1\55\1\164\1\55\1\uffff\1\156\2\145\1\163\1\151\1\162\1\154"+
        "\2\157\1\160\1\162\1\145\1\55\1\145\1\143\1\157\1\145\1\163\1\144"+
        "\1\145\1\142\1\150\1\157\1\145\1\144\1\141\1\145\1\151\1\171\1\164"+
        "\1\160\1\164\1\151\1\145\1\144\1\163\1\141\1\151\1\154\1\156\1\141"+
        "\1\163\1\171\1\163\1\151\1\163\1\111\1\145\1\141\1\145\1\151\1\145"+
        "\1\164\1\141\1\154\1\55\1\164\1\165\1\155\1\164\1\154\1\143\1\151"+
        "\1\uffff\1\160\1\145\1\151\1\145\2\137\1\uffff\1\55\1\163\1\55\1"+
        "\144\2\55\1\150\1\160\1\145\1\141\1\uffff\2\55\1\145\1\163\1\164"+
        "\1\uffff\1\145\1\55\1\uffff\1\143\1\145\1\uffff\1\145\1\147\1\uffff"+
        "\1\166\1\154\1\162\1\156\1\163\1\uffff\1\55\1\162\1\156\1\144\1"+
        "\55\1\144\1\55\1\145\1\155\1\153\1\167\1\145\1\153\1\164\1\167\1"+
        "\uffff\1\55\1\uffff\1\55\1\uffff\1\163\2\55\1\156\1\145\1\143\2"+
        "\145\1\154\2\55\1\164\1\55\1\uffff\1\55\1\145\1\164\1\55\1\151\1"+
        "\160\1\55\1\162\1\157\1\164\1\166\2\141\1\157\1\164\1\55\1\143\1"+
        "\145\3\55\1\143\1\156\1\141\2\55\1\142\1\141\1\156\1\151\1\55\1"+
        "\147\1\145\1\55\1\151\1\163\1\164\1\157\1\55\1\141\1\146\1\162\1"+
        "\141\1\143\1\55\1\160\1\154\1\163\1\160\1\145\1\157\1\uffff\1\157"+
        "\1\145\1\55\2\141\1\145\1\153\1\154\1\55\1\162\1\141\1\55\1\101"+
        "\1\111\1\uffff\1\154\1\uffff\1\55\1\141\1\uffff\1\102\1\145\1\uffff"+
        "\1\145\1\157\1\55\1\162\2\uffff\1\55\1\150\1\55\1\156\1\uffff\1"+
        "\154\2\55\1\156\1\141\1\145\4\164\1\uffff\1\55\1\164\2\55\1\uffff"+
        "\1\55\1\156\1\uffff\2\145\1\55\1\141\1\55\1\145\1\111\1\156\1\uffff"+
        "\1\162\1\uffff\2\55\1\uffff\1\55\1\uffff\1\147\1\55\1\153\2\55\1"+
        "\154\1\uffff\1\145\1\uffff\1\145\2\uffff\1\55\1\111\1\uffff\1\164"+
        "\1\163\1\151\1\uffff\1\141\1\156\1\55\1\145\1\144\1\163\1\155\1"+
        "\151\1\uffff\1\153\1\162\3\uffff\1\153\1\151\1\164\2\uffff\1\154"+
        "\1\156\1\147\1\143\1\uffff\1\145\1\55\1\144\1\uffff\1\157\1\145"+
        "\1\151\1\156\1\uffff\1\151\2\55\1\156\1\145\1\uffff\1\55\1\163\1"+
        "\55\1\145\1\55\1\144\1\141\1\162\1\55\1\uffff\1\156\1\151\1\143"+
        "\1\167\1\55\1\uffff\1\141\1\55\1\uffff\1\127\1\124\1\123\1\141\1"+
        "\uffff\1\163\1\157\1\162\1\145\1\156\1\144\1\156\1\162\1\uffff\1"+
        "\144\1\55\1\uffff\1\145\1\uffff\1\163\1\157\2\uffff\1\55\1\164\1"+
        "\162\2\55\1\157\1\163\1\uffff\1\141\3\uffff\1\147\1\156\1\163\1"+
        "\uffff\1\162\1\uffff\1\162\1\156\1\145\1\156\3\uffff\1\55\1\uffff"+
        "\1\55\2\uffff\1\104\1\144\1\55\1\144\1\uffff\1\156\1\171\1\55\1"+
        "\172\1\143\1\164\1\55\1\uffff\2\55\1\145\1\55\1\157\3\55\1\164\1"+
        "\55\1\145\1\143\1\55\1\141\1\132\1\55\1\uffff\1\55\1\165\1\144\1"+
        "\157\1\55\1\164\2\uffff\1\143\1\55\1\144\1\uffff\1\55\1\uffff\1"+
        "\55\1\uffff\1\55\1\162\1\171\1\uffff\1\144\1\156\1\164\1\151\1\uffff"+
        "\1\55\1\uffff\1\55\1\124\1\137\1\164\1\145\1\154\1\145\1\154\1\145"+
        "\2\55\1\147\1\164\1\55\1\144\1\55\1\143\1\uffff\1\145\1\141\2\uffff"+
        "\1\162\1\55\1\164\3\55\1\144\1\163\1\164\1\144\1\55\2\uffff\1\160"+
        "\1\157\1\55\1\uffff\1\55\1\164\1\55\1\uffff\1\145\1\55\1\145\2\uffff"+
        "\1\151\1\uffff\1\144\1\uffff\1\156\3\uffff\1\151\1\uffff\1\55\1"+
        "\145\1\uffff\1\142\1\157\2\uffff\1\163\1\55\1\156\1\uffff\1\55\1"+
        "\145\1\55\1\uffff\1\117\3\uffff\1\144\2\55\1\163\1\157\1\163\2\uffff"+
        "\1\122\1\113\1\151\1\144\1\154\1\141\1\145\1\162\2\uffff\1\55\1"+
        "\141\1\uffff\1\55\1\uffff\1\153\1\55\1\164\1\171\1\uffff\1\151\3"+
        "\uffff\2\55\1\145\2\55\1\uffff\1\55\1\167\2\uffff\1\145\1\uffff"+
        "\1\55\1\uffff\1\55\1\162\1\155\2\55\1\157\1\uffff\1\55\1\154\1\156"+
        "\1\55\1\uffff\1\55\1\uffff\1\163\1\uffff\1\142\1\55\1\uffff\1\55"+
        "\1\uffff\1\55\1\162\1\145\1\111\1\127\1\157\1\55\1\145\1\153\1\160"+
        "\1\141\1\uffff\1\142\1\uffff\1\167\1\uffff\1\145\1\55\1\157\2\uffff"+
        "\1\162\3\uffff\1\156\1\162\1\uffff\1\55\1\uffff\1\163\1\145\2\uffff"+
        "\1\156\1\uffff\2\145\2\uffff\1\55\1\152\3\uffff\1\163\1\55\1\102"+
        "\1\55\1\156\1\uffff\1\143\1\145\1\157\1\164\1\154\1\151\1\55\1\uffff"+
        "\1\156\1\166\1\55\1\166\1\uffff\5\55\1\uffff\1\145\1\55\1\uffff"+
        "\1\125\1\uffff\1\55\1\164\2\162\1\157\1\145\1\163\1\uffff\1\55\1"+
        "\141\1\uffff\1\141\5\uffff\1\143\1\uffff\1\124\1\uffff\1\157\1\163"+
        "\1\164\1\162\1\163\1\145\1\uffff\2\154\1\164\1\137\1\162\1\55\1"+
        "\141\1\163\4\55\1\163\1\113\1\163\1\uffff\1\142\1\55\4\uffff\1\55"+
        "\1\127\1\55\1\154\2\uffff\1\55\1\uffff\1\145\1\uffff\1\163\1\55"+
        "\1\uffff";
    static final String DFA8_maxS =
        "\6\172\1\57\4\uffff\6\172\5\uffff\6\172\1\uffff\2\75\2\uffff\20"+
        "\172\2\uffff\1\115\2\uffff\1\111\1\103\1\165\1\151\1\162\1\160\1"+
        "\165\2\154\1\162\1\157\1\162\2\uffff\1\163\1\154\1\172\1\164\1\154"+
        "\1\163\1\144\1\172\1\164\5\172\1\150\1\172\1\156\1\164\1\162\1\151"+
        "\1\164\1\157\1\172\1\143\1\145\1\157\3\uffff\1\164\2\155\1\170\1"+
        "\156\1\172\1\141\1\164\1\166\1\154\1\162\1\154\1\157\1\166\1\142"+
        "\1\172\1\141\1\157\5\uffff\1\155\1\151\1\156\1\147\1\155\1\156\1"+
        "\164\2\154\1\141\1\163\1\157\1\146\1\154\1\146\1\163\1\162\1\167"+
        "\1\155\1\165\1\141\1\145\1\163\1\162\1\164\1\146\1\163\1\165\1\160"+
        "\1\143\1\154\1\171\1\143\1\154\1\156\1\157\1\164\1\172\2\155\1\144"+
        "\1\155\1\105\1\124\1\172\1\145\2\156\1\162\1\156\1\145\1\143\1\145"+
        "\1\163\1\172\1\155\1\145\1\155\1\151\1\163\1\172\1\160\1\144\1\uffff"+
        "\1\172\1\151\1\154\1\172\1\166\1\151\1\172\1\uffff\1\151\1\145\1"+
        "\uffff\3\145\2\uffff\1\172\1\uffff\1\145\1\uffff\2\145\1\uffff\1"+
        "\145\1\150\1\154\1\164\1\167\1\157\1\143\1\uffff\2\153\1\141\1\163"+
        "\1\172\1\145\1\172\1\164\1\172\1\uffff\1\156\1\145\1\151\1\163\1"+
        "\151\1\162\1\154\2\157\1\160\1\162\1\145\1\172\1\145\1\143\1\157"+
        "\1\145\1\166\1\144\1\145\1\142\1\150\2\157\1\144\1\141\1\145\1\151"+
        "\1\171\1\164\1\160\1\164\2\151\1\144\1\163\1\164\1\151\1\154\1\156"+
        "\1\141\1\163\1\171\1\166\1\151\2\163\1\162\1\141\1\145\1\151\1\145"+
        "\1\164\1\141\1\154\1\172\1\164\1\165\1\160\1\164\1\154\1\143\1\151"+
        "\1\uffff\1\160\1\145\1\151\1\145\2\137\1\uffff\1\172\1\163\1\172"+
        "\1\144\2\172\1\150\1\160\1\145\1\141\1\uffff\2\172\1\145\1\163\1"+
        "\164\1\uffff\1\145\1\172\1\uffff\1\143\1\145\1\uffff\1\145\1\147"+
        "\1\uffff\1\166\1\154\2\162\1\163\1\uffff\1\172\1\162\1\156\1\163"+
        "\1\172\1\144\1\172\1\145\1\155\1\153\1\167\1\145\1\153\1\164\1\167"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\1\163\2\172\1\156\1\145\1\143"+
        "\2\145\1\154\2\172\1\164\1\172\1\uffff\1\172\1\145\1\164\1\172\1"+
        "\151\1\160\1\172\1\162\1\157\1\164\1\166\2\141\1\157\1\164\1\172"+
        "\1\143\1\145\3\172\1\143\1\156\1\141\2\172\1\142\1\141\1\156\1\151"+
        "\1\172\1\147\1\145\1\172\1\151\1\163\1\164\1\157\1\172\1\141\1\146"+
        "\1\162\1\141\1\143\1\172\1\160\1\154\1\163\1\160\1\163\1\157\1\uffff"+
        "\1\157\1\145\1\172\2\141\1\145\1\153\1\154\1\172\1\162\1\141\1\172"+
        "\1\113\1\111\1\uffff\1\154\1\uffff\1\172\1\141\1\uffff\1\124\1\145"+
        "\1\uffff\1\151\1\157\1\172\1\162\2\uffff\1\172\1\150\1\172\1\156"+
        "\1\uffff\1\154\2\172\1\156\1\141\1\145\4\164\1\uffff\1\172\1\164"+
        "\2\172\1\uffff\1\172\1\156\1\uffff\2\145\1\172\1\141\1\172\1\145"+
        "\1\111\1\156\1\uffff\1\162\1\uffff\2\172\1\uffff\1\172\1\uffff\1"+
        "\147\1\172\1\153\2\172\1\154\1\uffff\1\145\1\uffff\1\163\2\uffff"+
        "\1\172\1\111\1\uffff\1\164\1\163\1\151\1\uffff\1\151\1\156\1\172"+
        "\1\145\1\144\1\163\1\155\1\151\1\uffff\1\153\1\162\3\uffff\1\153"+
        "\1\151\1\164\2\uffff\1\154\1\156\1\147\1\143\1\uffff\1\145\1\172"+
        "\1\144\1\uffff\1\157\1\145\1\151\1\156\1\uffff\1\151\2\172\1\156"+
        "\1\145\1\uffff\1\172\1\163\1\172\1\145\1\172\1\144\1\141\1\162\1"+
        "\172\1\uffff\1\156\1\151\1\143\1\167\1\172\1\uffff\1\141\1\172\1"+
        "\uffff\1\127\1\124\1\123\1\141\1\uffff\1\163\1\157\1\162\1\145\1"+
        "\156\1\163\1\156\1\162\1\uffff\1\144\1\172\1\uffff\1\145\1\uffff"+
        "\1\163\1\157\2\uffff\1\172\1\164\1\162\2\172\1\157\1\163\1\uffff"+
        "\1\141\3\uffff\1\147\1\156\1\163\1\uffff\1\162\1\uffff\1\162\1\156"+
        "\1\145\1\156\3\uffff\1\172\1\uffff\1\172\2\uffff\1\125\1\144\1\172"+
        "\1\144\1\uffff\1\156\1\171\2\172\1\143\1\164\1\172\1\uffff\2\172"+
        "\1\145\1\172\1\157\3\172\1\164\1\172\1\145\1\143\1\172\1\141\1\132"+
        "\1\172\1\uffff\1\172\1\165\1\144\1\157\1\172\1\164\2\uffff\1\143"+
        "\1\172\1\144\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\162\1\171"+
        "\1\uffff\1\144\1\156\1\164\1\151\1\uffff\1\172\1\uffff\1\172\1\124"+
        "\1\137\1\164\1\145\1\154\1\145\1\154\1\145\2\172\1\147\1\164\1\172"+
        "\1\144\1\172\1\143\1\uffff\1\145\1\141\2\uffff\1\162\1\172\1\164"+
        "\3\172\1\144\1\163\1\164\1\163\1\172\2\uffff\1\160\1\157\1\172\1"+
        "\uffff\1\172\1\164\1\172\1\uffff\1\145\1\172\1\157\2\uffff\1\151"+
        "\1\uffff\1\144\1\uffff\1\156\3\uffff\1\151\1\uffff\1\172\1\145\1"+
        "\uffff\1\142\1\157\2\uffff\1\163\1\172\1\156\1\uffff\1\172\1\145"+
        "\1\172\1\uffff\1\117\3\uffff\1\144\2\172\1\163\1\157\1\163\2\uffff"+
        "\1\122\1\113\1\151\1\144\1\154\1\141\1\145\1\162\2\uffff\1\172\1"+
        "\141\1\uffff\1\172\1\uffff\1\153\1\172\1\164\1\171\1\uffff\1\151"+
        "\3\uffff\2\172\1\145\2\172\1\uffff\1\172\1\167\2\uffff\1\145\1\uffff"+
        "\1\172\1\uffff\1\172\1\162\1\155\2\172\1\157\1\uffff\1\172\1\154"+
        "\1\156\1\172\1\uffff\1\172\1\uffff\1\163\1\uffff\1\142\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\162\1\145\1\111\1\127\1\157\1\172\1\145\1"+
        "\153\1\160\1\141\1\uffff\1\142\1\uffff\1\167\1\uffff\1\145\1\172"+
        "\1\157\2\uffff\1\162\3\uffff\1\156\1\162\1\uffff\1\172\1\uffff\1"+
        "\163\1\145\2\uffff\1\156\1\uffff\2\145\2\uffff\1\172\1\152\3\uffff"+
        "\1\163\1\172\1\102\1\172\1\156\1\uffff\1\143\1\145\1\157\1\164\1"+
        "\154\1\151\1\172\1\uffff\1\156\1\166\1\172\1\166\1\uffff\5\172\1"+
        "\uffff\1\145\1\172\1\uffff\1\125\1\uffff\1\172\1\164\2\162\1\157"+
        "\1\145\1\163\1\uffff\1\172\1\141\1\uffff\1\141\5\uffff\1\143\1\uffff"+
        "\1\124\1\uffff\1\157\1\163\1\164\1\162\1\163\1\145\1\uffff\2\154"+
        "\1\164\1\137\1\162\1\172\1\141\1\163\4\172\1\163\1\113\1\163\1\uffff"+
        "\1\142\1\172\4\uffff\1\172\1\127\1\172\1\154\2\uffff\1\172\1\uffff"+
        "\1\145\1\uffff\1\163\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\10\1\11\1\12\1\13\6\uffff\1\23\1\24\1\25\1\27\1\30\6"+
        "\uffff\1\43\2\uffff\1\50\1\52\20\uffff\1\u00c5\1\u00c7\1\uffff\1"+
        "\u00c4\1\u00c6\14\uffff\1\7\1\26\32\uffff\1\31\1\32\1\33\22\uffff"+
        "\1\37\1\46\1\44\1\47\1\45\77\uffff\1\15\7\uffff\1\165\2\uffff\1"+
        "\16\3\uffff\1\73\1\136\1\uffff\1\20\1\uffff\1\103\2\uffff\1\141"+
        "\7\uffff\1\131\11\uffff\1\40\77\uffff\1\u009a\6\uffff\1\4\12\uffff"+
        "\1\42\5\uffff\1\14\2\uffff\1\17\2\uffff\1\34\2\uffff\1\161\5\uffff"+
        "\1\104\17\uffff\1\35\1\uffff\1\164\1\uffff\1\36\15\uffff\1\162\63"+
        "\uffff\1\u00a2\16\uffff\1\5\1\uffff\1\41\2\uffff\1\u00ad\2\uffff"+
        "\1\65\4\uffff\1\51\1\u008d\4\uffff\1\u0090\12\uffff\1\75\4\uffff"+
        "\1\21\2\uffff\1\117\10\uffff\1\64\1\uffff\1\171\2\uffff\1\102\1"+
        "\uffff\1\u00aa\6\uffff\1\70\1\uffff\1\106\1\uffff\1\121\1\u008b"+
        "\2\uffff\1\53\3\uffff\1\62\10\uffff\1\122\2\uffff\1\72\1\74\1\u009c"+
        "\3\uffff\1\143\1\124\4\uffff\1\u009b\3\uffff\1\105\4\uffff\1\107"+
        "\5\uffff\1\137\11\uffff\1\142\5\uffff\1\u00a9\2\uffff\1\u00b2\4"+
        "\uffff\1\u0088\10\uffff\1\6\2\uffff\1\u008e\1\uffff\1\u0087\2\uffff"+
        "\1\u0099\1\144\7\uffff\1\132\1\uffff\1\u0092\1\u0094\1\57\3\uffff"+
        "\1\111\1\uffff\1\u00af\4\uffff\1\100\1\155\1\123\1\uffff\1\u00a1"+
        "\1\uffff\1\55\1\114\4\uffff\1\u009e\7\uffff\1\u009d\20\uffff\1\101"+
        "\6\uffff\1\140\1\u00a0\3\uffff\1\170\1\uffff\1\u00ba\1\uffff\1\126"+
        "\3\uffff\1\u00b3\4\uffff\1\167\1\uffff\1\u00b1\21\uffff\1\160\2"+
        "\uffff\1\66\1\163\13\uffff\1\150\1\u00a4\3\uffff\1\110\3\uffff\1"+
        "\u0083\3\uffff\1\63\1\67\1\uffff\1\u0082\1\uffff\1\76\1\uffff\1"+
        "\u00a5\1\71\1\u00a3\1\uffff\1\135\2\uffff\1\166\2\uffff\1\154\1"+
        "\156\3\uffff\1\u008c\3\uffff\1\115\1\uffff\1\u0084\1\u009f\1\127"+
        "\6\uffff\1\u00b0\1\1\10\uffff\1\125\1\130\2\uffff\1\u00ab\1\uffff"+
        "\1\u0096\4\uffff\1\u0085\1\uffff\1\151\1\22\1\133\5\uffff\1\u0081"+
        "\2\uffff\1\157\1\153\1\uffff\1\54\1\uffff\1\61\6\uffff\1\175\4\uffff"+
        "\1\u008f\1\uffff\1\120\1\uffff\1\145\2\uffff\1\134\1\uffff\1\u00a8"+
        "\13\uffff\1\147\1\uffff\1\152\1\uffff\1\174\3\uffff\1\u00ac\1\u00c0"+
        "\1\uffff\1\u0093\1\u0095\1\u00a6\2\uffff\1\60\1\uffff\1\116\2\uffff"+
        "\1\u0091\1\113\1\uffff\1\u0098\2\uffff\1\172\1\u0089\2\uffff\1\173"+
        "\1\176\1\u0097\5\uffff\1\56\7\uffff\1\u00b7\4\uffff\1\146\5\uffff"+
        "\1\u00b9\2\uffff\1\177\1\uffff\1\3\7\uffff\1\u00ae\2\uffff\1\u00a7"+
        "\1\uffff\1\u00be\1\u00b6\1\77\1\u0086\1\u00bb\1\uffff\1\u00bc\1"+
        "\uffff\1\112\6\uffff\1\u008a\17\uffff\1\u00c1\2\uffff\1\u00c2\1"+
        "\u0080\1\u00b4\1\u00b5\4\uffff\1\u00bf\1\u00b8\1\uffff\1\u00bd\1"+
        "\uffff\1\2\2\uffff\1\u00c3";
    static final String DFA8_specialS =
        "\u03b8\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\62\1\uffff\2\62\22\uffff\1\62\1\37\3\uffff\1\25\2\uffff"+
            "\1\10\1\7\1\23\1\21\1\12\1\22\1\uffff\1\6\12\61\1\40\1\11\1"+
            "\35\1\34\1\36\2\uffff\2\60\1\55\1\3\2\60\1\1\1\60\1\2\3\60\1"+
            "\56\2\60\1\43\3\60\1\57\6\60\3\uffff\1\24\2\uffff\1\14\1\20"+
            "\1\52\1\45\1\47\1\5\1\41\1\13\1\15\1\54\1\50\1\44\1\32\1\31"+
            "\1\16\1\46\1\60\1\42\1\33\1\4\1\53\1\51\1\17\1\26\1\27\1\30",
            "\1\65\2\uffff\12\65\6\uffff\1\65\1\63\31\65\4\uffff\1\65\1"+
            "\uffff\32\65",
            "\1\65\2\uffff\12\65\6\uffff\16\65\1\66\14\65\4\uffff\1\65"+
            "\1\uffff\32\65",
            "\1\65\2\uffff\12\65\6\uffff\5\65\1\67\25\65\4\uffff\1\65\1"+
            "\uffff\32\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\4\65"+
            "\1\75\2\65\1\71\6\65\1\74\2\65\1\70\2\65\1\72\3\65\1\73\1\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\76"+
            "\7\65\1\101\5\65\1\77\2\65\1\100\10\65",
            "\1\102",
            "",
            "",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\104"+
            "\3\65\1\105\25\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\2\65"+
            "\1\114\1\112\4\65\1\113\2\65\1\110\1\65\1\107\4\65\1\111\1\106"+
            "\6\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\5\65"+
            "\1\117\7\65\1\116\4\65\1\115\7\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\5\65"+
            "\1\120\7\65\1\121\3\65\1\123\1\65\1\122\2\65\1\124\3\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\127"+
            "\7\65\1\125\5\65\1\126\13\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\133"+
            "\3\65\1\130\6\65\1\131\2\65\1\135\2\65\1\134\6\65\1\132\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\142"+
            "\3\65\1\144\11\65\1\141\5\65\1\143\5\65",
            "\1\65\2\uffff\12\65\6\uffff\3\65\1\152\27\65\4\uffff\1\65"+
            "\1\uffff\4\65\1\147\3\65\1\145\5\65\1\151\3\65\1\146\1\65\1"+
            "\150\5\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\156"+
            "\1\65\1\153\4\65\1\162\1\160\5\65\1\154\1\161\3\65\1\155\1\157"+
            "\5\65",
            "",
            "\1\164",
            "\1\166",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\170"+
            "\3\65\1\172\14\65\1\171\10\65",
            "\1\65\2\uffff\12\65\6\uffff\3\65\1\u0080\27\65\4\uffff\1\65"+
            "\1\uffff\1\175\3\65\1\174\3\65\1\173\5\65\1\176\5\65\1\177\5"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\13"+
            "\65\1\u0081\16\65",
            "\1\65\2\uffff\12\65\6\uffff\3\65\1\u0085\27\65\4\uffff\1\65"+
            "\1\uffff\4\65\1\u0084\3\65\1\u0082\5\65\1\u0083\13\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\u008a"+
            "\3\65\1\u0086\3\65\1\u0087\5\65\1\u0089\5\65\1\u0088\5\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\u008b"+
            "\3\65\1\u008f\6\65\1\u008c\2\65\1\u008e\2\65\1\u008d\10\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\5\65"+
            "\1\u0091\5\65\1\u0092\1\65\1\u0090\2\65\1\u0093\1\65\1\u0095"+
            "\4\65\1\u0094\2\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\4\65"+
            "\1\u0097\3\65\1\u0096\21\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\u0099"+
            "\7\65\1\u0098\21\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\13"+
            "\65\1\u009b\2\65\1\u009a\13\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\15"+
            "\65\1\u009c\1\65\1\u009d\12\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\24"+
            "\65\1\u009e\5\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\u009f"+
            "\31\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\4\65"+
            "\1\u00a0\25\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\10"+
            "\65\1\u00a1\21\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\23\uffff\1\u00a5",
            "\1\u00a7\3\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00b1\3\uffff\1\u00b0\11\uffff\1\u00af",
            "\1\u00b2\3\uffff\1\u00b3",
            "",
            "",
            "\1\u00b5\2\uffff\1\u00b4",
            "\1\u00b6",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00b8\2\uffff\1\u00ba\14\uffff\1\u00b9",
            "\1\u00bc\2\uffff\1\u00bb",
            "\1\u00bd",
            "\1\u00be",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00c1\20\uffff\1\u00c0",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\6\65"+
            "\1\u00c5\13\65\1\u00c3\2\65\1\u00c4\4\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\5\65"+
            "\1\u00c8\24\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\2\65"+
            "\1\u00ca\27\65",
            "\1\u00cc",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\10"+
            "\65\1\u00cd\21\65",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d4\20\uffff\1\u00d3",
            "\1\u00d5",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00d7",
            "\1\u00d8\3\uffff\1\u00d9",
            "\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e4\1\u00e3",
            "\1\u00e5",
            "\1\u00e7\15\uffff\1\u00e6\2\uffff\1\u00e8",
            "\1\u00e9",
            "\1\u00eb\15\uffff\1\u00ea",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2\7\uffff\1\u00f3",
            "\1\u00f4",
            "\1\u00f5\4\uffff\1\u00f6",
            "\1\u00f8\1\u00f7",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0103\4\uffff\1\u0102",
            "\1\u0104\15\uffff\1\u0105",
            "\1\u0107\1\uffff\1\u0106",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f\17\uffff\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0115\6\uffff\1\u0114",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011d\1\u011b\1\u011c",
            "\1\u011e",
            "\1\u011f",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\26"+
            "\65\1\u0131\3\65",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u013c",
            "\1\u013d",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u013f",
            "\1\u0140",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\65\2\uffff\12\65\6\uffff\17\65\1\u0156\13\65\4\uffff\1"+
            "\65\1\uffff\32\65",
            "\1\u0158",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u015a",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e\3\uffff\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016f\2\uffff\1\u016e",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0176\11\uffff\1\u0175",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0181\3\uffff\1\u0180",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184\22\uffff\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018d\2\uffff\1\u018c",
            "\1\u018e",
            "\1\u018f",
            "\1\u0192\15\uffff\1\u0191\33\uffff\1\u0190",
            "\1\u0193\14\uffff\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\65"+
            "\1\u019c\30\65",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a1\2\uffff\1\u01a0",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01ad",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01af",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\1\65"+
            "\1\u01b0\30\65",
            "\1\65\2\uffff\12\65\6\uffff\7\65\1\u01b3\23\65\4\uffff\1\65"+
            "\1\uffff\22\65\1\u01b2\7\65",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c8\3\uffff\1\u01c7",
            "\1\u01c9",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01ce\16\uffff\1\u01cd",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01d0",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\10"+
            "\65\1\u01d1\21\65",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\24"+
            "\65\1\u01dc\5\65",
            "",
            "\1\u01de",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\3\65"+
            "\1\u01df\26\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\22"+
            "\65\1\u01e1\7\65",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\17"+
            "\65\1\u01ea\12\65",
            "\1\u01ec",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01ef",
            "\1\u01f0",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01f2",
            "\1\u01f3",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\22"+
            "\65\1\u01f4\7\65",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u01ff",
            "\1\u0200",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u020e",
            "\1\u020f",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\4\65"+
            "\1\u0210\25\65",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0222\15\uffff\1\u0221",
            "\1\u0223",
            "",
            "\1\u0224",
            "\1\u0225",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u022d",
            "\1\u022e",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0231\11\uffff\1\u0230",
            "\1\u0232",
            "",
            "\1\u0233",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0235",
            "",
            "\1\u0237\1\u0236\20\uffff\1\u0238",
            "\1\u0239",
            "",
            "\1\u023a\3\uffff\1\u023b",
            "\1\u023c",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u023e",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\22"+
            "\65\1\u023f\7\65",
            "\1\u0241",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0243",
            "",
            "\1\u0244",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u024f",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0253",
            "",
            "\1\u0254",
            "\1\u0255",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0257",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "",
            "\1\u025c",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0260",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0262",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0265",
            "",
            "\1\u0266",
            "",
            "\1\u0268\15\uffff\1\u0267",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u026a",
            "",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "",
            "\1\u026f\7\uffff\1\u026e",
            "\1\u0270",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "",
            "\1\u0277",
            "\1\u0278",
            "",
            "",
            "",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "",
            "",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "",
            "\1\u0280",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\3\65"+
            "\1\u0281\26\65",
            "\1\u0283",
            "",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "",
            "\1\u0288",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u028b",
            "\1\u028c",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\4\65"+
            "\1\u028d\25\65",
            "\1\u028f",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0291",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u029c",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a8\16\uffff\1\u02a7",
            "\1\u02a9",
            "\1\u02aa",
            "",
            "\1\u02ab",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u02ac",
            "",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02b0",
            "\1\u02b1",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02b4",
            "\1\u02b5",
            "",
            "\1\u02b6",
            "",
            "",
            "",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "",
            "\1\u02ba",
            "",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "\1\u02c2\20\uffff\1\u02c1",
            "\1\u02c3",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02c5",
            "",
            "\1\u02c6",
            "\1\u02c7",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\24\65\1\u02ce\6\65\4\uffff\1\65"+
            "\1\uffff\32\65",
            "\1\u02d0",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02d2",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02d6",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02d8",
            "\1\u02d9",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02db",
            "\1\u02dc",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02e3",
            "",
            "",
            "\1\u02e4",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\3\65"+
            "\1\u02e5\26\65",
            "\1\u02e7",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02eb",
            "\1\u02ec",
            "",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u02fd",
            "\1\u02fe",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0300",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0302",
            "",
            "\1\u0303",
            "\1\u0304",
            "",
            "",
            "\1\u0305",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0307",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030f\16\uffff\1\u030e",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "\1\u0311",
            "\1\u0312",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0315",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0317",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0319\11\uffff\1\u031a",
            "",
            "",
            "\1\u031b",
            "",
            "\1\u031c",
            "",
            "\1\u031d",
            "",
            "",
            "",
            "\1\u031e",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0320",
            "",
            "\1\u0321",
            "\1\u0322",
            "",
            "",
            "\1\u0323",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0325",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0327",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0329",
            "",
            "",
            "",
            "\1\u032a",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\22"+
            "\65\1\u032c\7\65",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "",
            "",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u033a",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u033c",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u033e",
            "\1\u033f",
            "",
            "\1\u0340",
            "",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0343",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0347",
            "",
            "",
            "\1\u0348",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\3\65"+
            "\1\u034a\26\65",
            "\1\u034c",
            "\1\u034d",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0350",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0352",
            "\1\u0353",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0356",
            "",
            "\1\u0357",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "",
            "\1\u0365",
            "",
            "\1\u0366",
            "",
            "\1\u0367",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0369",
            "",
            "",
            "\1\u036a",
            "",
            "",
            "",
            "\1\u036b",
            "\1\u036c",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u036e",
            "\1\u036f",
            "",
            "",
            "\1\u0370",
            "",
            "\1\u0371",
            "\1\u0372",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0374",
            "",
            "",
            "",
            "\1\u0375",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0377",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0379",
            "",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0381",
            "\1\u0382",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0384",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u038a",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u038c",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0395",
            "",
            "\1\u0396",
            "",
            "",
            "",
            "",
            "",
            "\1\u0397",
            "",
            "\1\u0398",
            "",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\u039d",
            "\1\u039e",
            "",
            "\1\u039f",
            "\1\u03a0",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u03a5",
            "\1\u03a6",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "",
            "\1\u03ae",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u03b1",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u03b3",
            "",
            "",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u03b5",
            "",
            "\1\u03b6",
            "\1\65\2\uffff\12\65\6\uffff\33\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__221 | T__222 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | FROM | DBP | GAME | GRAVITY_KW | SCORE | TURNBASED_KW | WORLD_KW | GRIDSIZE_KW | GENERIC | GRID | RIBBON | NAME_KW | TYPE | INSERT_KW | REMOVE_KW | SOLO | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | CLOCKWISE | ANTICLOCKWISE | NEXTURN_KW | RELOAD_KW | GRASPS_KW | EXPELS_KW | INGESTS_KW | DUPLICABLE | FIRST | THIRD | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | PRESSED_KW | HELD_KW | RELEASED_KW | OWNES_KW | NOTOWNES_KW | OWNED_KW | NOTOWNED_KW | HAPPENS | CONTAINS_KW | DISTANCE_KW | ANGLE_KW | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | TIME | VALUE | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | LETTER | FLOAT | IDENT | WS );";
        }
    }
 

}