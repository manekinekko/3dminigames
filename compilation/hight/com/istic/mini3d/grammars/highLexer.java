// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g 2011-05-09 21:09:13
 
    package com.istic.mini3d.grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class highLexer extends Lexer {
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

    public highLexer() {;} 
    public highLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public highLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g"; }

    // $ANTLR start "GAME_KW"
    public final void mGAME_KW() throws RecognitionException {
        try {
            int _type = GAME_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:7:9: ( 'GAME_KW' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:7:11: 'GAME_KW'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:8:18: ( 'GAME_ATTRIBUT_KW' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:8:20: 'GAME_ATTRIBUT_KW'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:9:12: ( 'INIT_IS_KW' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:9:14: 'INIT_IS_KW'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:10:5: ( 'DEC' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:10:7: 'DEC'
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

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:11:8: ( 'true' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:11:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "T__223"
    public final void mT__223() throws RecognitionException {
        try {
            int _type = T__223;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:12:8: ( 'false' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:12:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__223"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:423:13: ( '//' (~ '\\n' )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:423:15: '//' (~ '\\n' )*
            {
            match("//"); 

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:423:19: (~ '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:423:20: ~ '\\n'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:425:4: ( ')' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:425:6: ')'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:426:4: ( '(' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:426:6: '('
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:427:5: ( ';' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:427:7: ';'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:428:6: ( ',' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:428:8: ','
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:429:5: ( 'has' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:429:7: 'has'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:430:4: ( 'at' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:430:6: 'at'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:431:4: ( 'is' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:431:6: 'is'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:432:5: ( 'and' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:432:7: 'and'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:433:4: ( 'of' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:433:6: 'of'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:434:6: ( 'with' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:434:8: 'with'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:435:9: ( 'between' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:435:11: 'between'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:436:6: ( '+' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:436:8: '+'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:437:7: ( '-' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:437:9: '-'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:438:5: ( '*' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:438:7: '*'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:439:5: ( '/' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:439:7: '/'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:440:5: ( '^' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:440:7: '^'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:441:5: ( '%' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:441:7: '%'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:442:3: ( 'x' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:442:5: 'x'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:443:3: ( 'y' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:443:5: 'y'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:444:3: ( 'z' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:444:5: 'z'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:445:5: ( 'all' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:445:7: 'all'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:446:5: ( 'not' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:446:7: 'not'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:447:5: ( 'min' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:447:7: 'min'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:448:5: ( 's' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:448:7: 's'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:449:4: ( 'ms' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:449:6: 'ms'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:450:6: ( 'then' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:450:8: 'then'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:451:5: ( 'for' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:451:7: 'for'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:452:8: ( '=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:452:10: '='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:453:5: ( '<' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:453:8: '<'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:454:5: ( '>' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:454:8: '>'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:455:7: ( '<=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:455:9: '<='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:456:7: ( '>=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:456:9: '>='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:457:6: ( '!=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:457:8: '!='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:458:7: ( 'from' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:458:8: 'from'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:459:9: ( ':' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:459:11: ':'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:461:7: ( 'game' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:461:9: 'game'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:462:12: ( 'gravity' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:462:14: 'gravity'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:463:8: ( 'score' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:463:10: 'score'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:464:17: ( 'turnbased' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:464:19: 'turnbased'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:465:17: ( 'world' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:465:19: 'world'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:466:17: ( 'gridsize' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:466:19: 'gridsize'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:467:17: ( 'generic' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:467:19: 'generic'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:468:15: ( 'grid' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:468:17: 'grid'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:469:17: ( 'ribbon' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:469:19: 'ribbon'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:470:17: ( 'name' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:470:19: 'name'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:471:7: ( 'type' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:471:9: 'type'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:472:11: ( 'insert' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:472:14: 'insert'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:473:11: ( 'remove' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:473:13: 'remove'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:474:7: ( 'solo' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:474:9: 'solo'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:475:9: ( 'Player' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:475:11: 'Player'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:476:10: ( 'list' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:476:12: 'list'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:477:5: ( 'in' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:477:7: 'in'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:478:7: ( 'loop' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:478:9: 'loop'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:479:7: ( 'once' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:479:9: 'once'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:480:11: ( 'random' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:480:13: 'random'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:481:15: ( 'definition' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:481:17: 'definition'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:482:8: ( 'means' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:482:10: 'means'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:483:10: ( 'pause' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:483:12: 'pause'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:484:10: ( 'mute' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:484:12: 'mute'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:485:5: ( 'on' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:485:7: 'on'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:486:6: ( 'off' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:486:8: 'off'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:487:10: ( 'play' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:487:12: 'play'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:488:10: ( 'stop' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:488:12: 'stop'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:489:10: ( 'ends' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:489:12: 'ends'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:490:11: ( 'starts' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:490:13: 'starts'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:491:10: ( 'block' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:491:12: 'block'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:492:13: ( 'translation' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:492:15: 'translation'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:493:10: ( 'rotation' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:493:12: 'rotation'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:494:8: ( 'scale' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:494:10: 'scale'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:495:11: ( 'efface' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:495:13: 'efface'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:496:13: ( 'generate' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:496:15: 'generate'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:497:10: ( 'wait' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:497:12: 'wait'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:498:10: ( 'endWait' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:498:12: 'endWait'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:499:10: ( 'save' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:499:12: 'save'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:500:10: ( 'rule' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:500:12: 'rule'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:501:10: ( 'moves' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:501:12: 'moves'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:502:9: ( 'dies' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:502:11: 'dies'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:503:12: ( 'touches' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:503:14: 'touches'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:504:10: ( 'kills' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:504:12: 'kills'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:505:11: ( 'killed' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:505:13: 'killed'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:506:12: ( 'touched' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:506:14: 'touched'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:507:4: ( 'by' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:507:6: 'by'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:508:7: ( 'other' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:508:9: 'other'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:509:9: ( 'becomes' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:509:11: 'becomes'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:510:12: ( 'victory' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:510:14: 'victory'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:511:11: ( 'defeat' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:511:13: 'defeat'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:512:7: ( 'if' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:512:9: 'if'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:513:6: ( 'else' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:513:8: 'else'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:514:7: ( 'endIf' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:514:9: 'endIf'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:515:4: ( 'or' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:515:6: 'or'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:516:6: ( 'comp' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:516:8: 'comp'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:517:9: ( 'dead' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:517:11: 'dead'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:518:10: ( 'alive' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:518:12: 'alive'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:519:12: ( 'effaced' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:519:13: 'effaced'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:520:14: ( 'generated' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:520:16: 'generated'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:521:13: ( 'touching' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:521:15: 'touching'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:522:11: ( 'moving' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:522:13: 'moving'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:523:12: ( 'waiting' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:523:14: 'waiting'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:524:13: ( 'finished' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:524:15: 'finished'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:525:12: ( 'started' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:525:14: 'started'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:526:11: ( 'paused' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:526:13: 'paused'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:527:10: ( 'muted' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:527:12: 'muted'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:528:11: ( 'played' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:528:13: 'played'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:529:12: ( 'stopped' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:529:14: 'stopped'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:530:11: ( 'assign' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:530:13: 'assign'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:531:8: ( 'add' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:531:10: 'add'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:532:8: ( 'sub' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:532:10: 'sub'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:533:11: ( 'invert' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:533:13: 'invert'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:534:7: ( 'num' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:534:9: 'num'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:535:8: ( 'ai' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:535:11: 'ai'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:536:8: ( 'during' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:536:10: 'during'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:537:7: ( 'until' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:537:9: 'until'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:538:7: ( 'equip' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:538:9: 'equip'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:539:6: ( 'next' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:539:8: 'next'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:540:10: ( 'previous' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:540:12: 'previous'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:541:10: ( 'keyboard' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:541:12: 'keyboard'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:542:13: ( 'activate' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:542:15: 'activate'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:543:11: ( 'disable' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:543:12: 'disable'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:544:9: ( 'commands' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:544:10: 'commands'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:545:15: ( 'clockwise' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:545:17: 'clockwise'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:546:15: ( 'anticlockwise' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:546:17: 'anticlockwise'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:547:12: ( 'nexturn' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:547:14: 'nexturn'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:548:11: ( 'reload' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:548:13: 'reload'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:549:10: ( 'grasps' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:549:11: 'grasps'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:550:10: ( 'expels' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:550:12: 'expels'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:551:11: ( 'ingests' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:551:13: 'ingests'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:552:12: ( 'duplicable' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:552:14: 'duplicable'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:553:8: ( 'first' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:553:10: 'first'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:554:8: ( 'third' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:554:10: 'third'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:555:10: ( 'position' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:555:12: 'position'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:556:13: ( 'orientation' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:556:15: 'orientation'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:557:7: ( 'size' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:557:9: 'size'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:558:9: ( 'person' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:558:11: 'person'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:559:7: ( 'free' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:559:9: 'free'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:560:8: ( 'frame' | 'frames' )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:560:10: 'frame'
                    {
                    match("frame"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:560:20: 'frames'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:561:12: ( 'pressed' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:561:14: 'pressed'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:562:9: ( 'held' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:562:11: 'held'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:563:13: ( 'released' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:563:15: 'released'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:564:10: ( 'ownes' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:564:12: 'ownes'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:565:13: ( 'notOwnes' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:565:16: 'notOwnes'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:566:9: ( 'owned' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:566:10: 'owned'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:567:12: ( 'notOwned' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:567:13: 'notOwned'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:568:9: ( 'happens' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:568:12: 'happens'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:569:14: ( 'contains' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:569:17: 'contains'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:570:13: ( 'distance' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:570:15: 'distance'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:571:10: ( 'angle' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:571:12: 'angle'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:574:5: ( 'up' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:574:7: 'up'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:575:7: ( 'down' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:575:9: 'down'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:576:6: ( 'left' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:576:8: 'left'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:577:7: ( 'right' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:577:9: 'right'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:578:7: ( 'space' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:578:9: 'space'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:579:8: ( 'escape' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:579:10: 'escape'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:580:7: ( 'enter' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:580:9: 'enter'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:581:7: ( 'mouse' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:581:9: 'mouse'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:582:5: ( 'key' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:582:7: 'key'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:583:12: ( 'lClick' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:583:14: 'lClick'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:584:14: ( 'mClick' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:584:16: 'mClick'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:585:13: ( 'rClick' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:585:15: 'rClick'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:586:11: ( 'scrollUp' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:586:13: 'scrollUp'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:587:13: ( 'scrollDown' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:587:15: 'scrollDown'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:589:12: ( 'command' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:589:14: 'command'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:590:6: ( 'jump' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:590:8: 'jump'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:591:6: ( 'move' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:591:8: 'move'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:592:9: ( 'forward' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:592:11: 'forward'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:593:10: ( 'backward' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:593:12: 'backward'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:594:6: ( 'turns' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:594:8: 'turns'
            {
            match("turns"); 


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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:595:12: ( 'accelerates' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:595:14: 'accelerates'
            {
            match("accelerates"); 


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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:596:7: ( 'brakes' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:596:9: 'brakes'
            {
            match("brakes"); 


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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:599:8: ( 'Camera' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:599:10: 'Camera'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:600:7: ( 'Media' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:600:9: 'Media'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:601:6: ( 'Time' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:601:8: 'Time'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:603:8: ( 'value' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:603:10: 'value'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:605:16: ( 'boostInterval' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:605:18: 'boostInterval'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:606:16: ( 'shootInterval' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:606:18: 'shootInterval'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:607:13: ( 'reloadTime' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:607:15: 'reloadTime'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:609:11: ( 'inventory' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:609:13: 'inventory'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:610:16: ( 'equipedObjects' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:610:18: 'equipedObjects'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:611:11: ( 'entrances' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:611:13: 'entrances'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:612:8: ( 'exits' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:612:10: 'exits'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:613:13: ( 'damageZone' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:613:15: 'damageZone'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:614:12: ( 'collectors' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:614:14: 'collectors'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:615:17: ( 'typesCollectors' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:615:19: 'typesCollectors'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:616:12: ( 'generators' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:616:14: 'generators'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:617:17: ( 'typeGenerators' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:617:19: 'typeGenerators'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:618:10: ( 'breakers' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:618:12: 'breakers'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:619:16: ( 'typesBreakers' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:619:18: 'typesBreakers'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:620:15: ( 'teleportables' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:620:17: 'teleportables'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:622:2: ( 'typesTeleportables' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:622:5: 'typesTeleportables'
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

    // $ANTLR start "TEXTE"
    public final void mTEXTE() throws RecognitionException {
        try {
            int _type = TEXTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:7: ( '\\\"' ( '/' )? IDENT '\\\"' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:9: '\\\"' ( '/' )? IDENT '\\\"'
            {
            match('\"'); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:13: ( '/' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='/') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:625:14: '/'
                    {
                    match('/'); 

                    }
                    break;

            }

            mIDENT(); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXTE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:626:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:7: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:9: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:9: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:15: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:27: ( '.' ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:32: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:627:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:628:7: ( LETTER ( LETTER | '0' .. '9' | '_' | '-' | '@' | '/' | '.' )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:628:9: LETTER ( LETTER | '0' .. '9' | '_' | '-' | '@' | '/' | '.' )*
            {
            mLETTER(); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:628:15: ( LETTER | '0' .. '9' | '_' | '-' | '@' | '/' | '.' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='-' && LA8_0<='9')||(LA8_0>='@' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:629:5: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:629:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:629:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||(LA9_0>='\f' && LA9_0<='\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:8: ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__222 | T__223 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | FROM | DBP | GAME | GRAVITY_KW | SCORE | TURNBASED_KW | WORLD_KW | GRIDSIZE_KW | GENERIC | GRID | RIBBON | NAME_KW | TYPE | INSERT_KW | REMOVE_KW | SOLO | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | CLOCKWISE | ANTICLOCKWISE | NEXTURN_KW | RELOAD_KW | GRASPS_KW | EXPELS_KW | INGESTS_KW | DUPLICABLE | FIRST | THIRD | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | PRESSED_KW | HELD_KW | RELEASED_KW | OWNES_KW | NOTOWNES_KW | OWNED_KW | NOTOWNED_KW | HAPPENS | CONTAINS_KW | DISTANCE_KW | ANGLE_KW | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | TIME | VALUE | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | TEXTE | LETTER | FLOAT | IDENT | WS )
        int alt10=200;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:10: GAME_KW
                {
                mGAME_KW(); 

                }
                break;
            case 2 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:18: GAME_ATTRIBUT_KW
                {
                mGAME_ATTRIBUT_KW(); 

                }
                break;
            case 3 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:35: INIT_IS_KW
                {
                mINIT_IS_KW(); 

                }
                break;
            case 4 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:46: DEC
                {
                mDEC(); 

                }
                break;
            case 5 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:50: T__222
                {
                mT__222(); 

                }
                break;
            case 6 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:57: T__223
                {
                mT__223(); 

                }
                break;
            case 7 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:64: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 8 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:72: PD
                {
                mPD(); 

                }
                break;
            case 9 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:75: PG
                {
                mPG(); 

                }
                break;
            case 10 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:78: FIN
                {
                mFIN(); 

                }
                break;
            case 11 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:82: VIRG
                {
                mVIRG(); 

                }
                break;
            case 12 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:87: HAS
                {
                mHAS(); 

                }
                break;
            case 13 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:91: AT
                {
                mAT(); 

                }
                break;
            case 14 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:94: IS
                {
                mIS(); 

                }
                break;
            case 15 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:97: AND
                {
                mAND(); 

                }
                break;
            case 16 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:101: OF
                {
                mOF(); 

                }
                break;
            case 17 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:104: WITH
                {
                mWITH(); 

                }
                break;
            case 18 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:109: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 19 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:117: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:122: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:128: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:132: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:136: POW
                {
                mPOW(); 

                }
                break;
            case 24 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:140: MOD
                {
                mMOD(); 

                }
                break;
            case 25 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:144: X
                {
                mX(); 

                }
                break;
            case 26 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:146: Y
                {
                mY(); 

                }
                break;
            case 27 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:148: Z
                {
                mZ(); 

                }
                break;
            case 28 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:150: ALL
                {
                mALL(); 

                }
                break;
            case 29 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:154: NOT
                {
                mNOT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:158: MIN
                {
                mMIN(); 

                }
                break;
            case 31 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:162: SEC
                {
                mSEC(); 

                }
                break;
            case 32 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:166: MS
                {
                mMS(); 

                }
                break;
            case 33 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:169: THEN
                {
                mTHEN(); 

                }
                break;
            case 34 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:174: FOR
                {
                mFOR(); 

                }
                break;
            case 35 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:178: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 36 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:185: INF
                {
                mINF(); 

                }
                break;
            case 37 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:189: SUP
                {
                mSUP(); 

                }
                break;
            case 38 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:193: INFEG
                {
                mINFEG(); 

                }
                break;
            case 39 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:199: SUPED
                {
                mSUPED(); 

                }
                break;
            case 40 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:205: DIFF
                {
                mDIFF(); 

                }
                break;
            case 41 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:210: FROM
                {
                mFROM(); 

                }
                break;
            case 42 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:215: DBP
                {
                mDBP(); 

                }
                break;
            case 43 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:219: GAME
                {
                mGAME(); 

                }
                break;
            case 44 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:224: GRAVITY_KW
                {
                mGRAVITY_KW(); 

                }
                break;
            case 45 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:235: SCORE
                {
                mSCORE(); 

                }
                break;
            case 46 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:241: TURNBASED_KW
                {
                mTURNBASED_KW(); 

                }
                break;
            case 47 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:254: WORLD_KW
                {
                mWORLD_KW(); 

                }
                break;
            case 48 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:263: GRIDSIZE_KW
                {
                mGRIDSIZE_KW(); 

                }
                break;
            case 49 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:275: GENERIC
                {
                mGENERIC(); 

                }
                break;
            case 50 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:283: GRID
                {
                mGRID(); 

                }
                break;
            case 51 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:288: RIBBON
                {
                mRIBBON(); 

                }
                break;
            case 52 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:295: NAME_KW
                {
                mNAME_KW(); 

                }
                break;
            case 53 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:303: TYPE
                {
                mTYPE(); 

                }
                break;
            case 54 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:308: INSERT_KW
                {
                mINSERT_KW(); 

                }
                break;
            case 55 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:318: REMOVE_KW
                {
                mREMOVE_KW(); 

                }
                break;
            case 56 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:328: SOLO
                {
                mSOLO(); 

                }
                break;
            case 57 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:333: PLAYER
                {
                mPLAYER(); 

                }
                break;
            case 58 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:340: LIST_KW
                {
                mLIST_KW(); 

                }
                break;
            case 59 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:348: IN
                {
                mIN(); 

                }
                break;
            case 60 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:351: LOOP
                {
                mLOOP(); 

                }
                break;
            case 61 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:356: ONCE
                {
                mONCE(); 

                }
                break;
            case 62 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:361: RANDOM_KW
                {
                mRANDOM_KW(); 

                }
                break;
            case 63 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:371: DEFINITION_KW
                {
                mDEFINITION_KW(); 

                }
                break;
            case 64 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:385: MEANS
                {
                mMEANS(); 

                }
                break;
            case 65 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:391: PAUSE_KW
                {
                mPAUSE_KW(); 

                }
                break;
            case 66 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:400: MUTE_KW
                {
                mMUTE_KW(); 

                }
                break;
            case 67 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:408: ON
                {
                mON(); 

                }
                break;
            case 68 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:411: OFF
                {
                mOFF(); 

                }
                break;
            case 69 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:415: PLAY_KW
                {
                mPLAY_KW(); 

                }
                break;
            case 70 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:423: STOP_KW
                {
                mSTOP_KW(); 

                }
                break;
            case 71 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:431: ENDS_KW
                {
                mENDS_KW(); 

                }
                break;
            case 72 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:439: STARTS_KW
                {
                mSTARTS_KW(); 

                }
                break;
            case 73 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:449: BLOCK_KW
                {
                mBLOCK_KW(); 

                }
                break;
            case 74 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:458: TRANSLATION
                {
                mTRANSLATION(); 

                }
                break;
            case 75 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:470: ROTATION
                {
                mROTATION(); 

                }
                break;
            case 76 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:479: SCALE
                {
                mSCALE(); 

                }
                break;
            case 77 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:485: EFFACE_KW
                {
                mEFFACE_KW(); 

                }
                break;
            case 78 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:495: GENERATE_KW
                {
                mGENERATE_KW(); 

                }
                break;
            case 79 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:507: WAIT_KW
                {
                mWAIT_KW(); 

                }
                break;
            case 80 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:515: ENDWAIT
                {
                mENDWAIT(); 

                }
                break;
            case 81 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:523: SAVE_KW
                {
                mSAVE_KW(); 

                }
                break;
            case 82 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:531: RULE_KW
                {
                mRULE_KW(); 

                }
                break;
            case 83 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:539: MOVES_KW
                {
                mMOVES_KW(); 

                }
                break;
            case 84 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:548: DIES_KW
                {
                mDIES_KW(); 

                }
                break;
            case 85 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:556: TOUCHES_KW
                {
                mTOUCHES_KW(); 

                }
                break;
            case 86 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:567: KILLS_KW
                {
                mKILLS_KW(); 

                }
                break;
            case 87 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:576: KILLED_KW
                {
                mKILLED_KW(); 

                }
                break;
            case 88 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:586: TOUCHED_KW
                {
                mTOUCHED_KW(); 

                }
                break;
            case 89 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:597: BY
                {
                mBY(); 

                }
                break;
            case 90 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:600: OTHER
                {
                mOTHER(); 

                }
                break;
            case 91 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:606: BECOMES
                {
                mBECOMES(); 

                }
                break;
            case 92 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:614: VICTORY_KW
                {
                mVICTORY_KW(); 

                }
                break;
            case 93 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:625: DEFEAT_KW
                {
                mDEFEAT_KW(); 

                }
                break;
            case 94 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:635: IF_KW
                {
                mIF_KW(); 

                }
                break;
            case 95 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:641: ELSE
                {
                mELSE(); 

                }
                break;
            case 96 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:646: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 97 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:652: OR
                {
                mOR(); 

                }
                break;
            case 98 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:655: COMP
                {
                mCOMP(); 

                }
                break;
            case 99 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:660: DEAD_KW
                {
                mDEAD_KW(); 

                }
                break;
            case 100 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:668: ALIVE_KW
                {
                mALIVE_KW(); 

                }
                break;
            case 101 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:677: EFFACED_KW
                {
                mEFFACED_KW(); 

                }
                break;
            case 102 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:688: GENERATED_KW
                {
                mGENERATED_KW(); 

                }
                break;
            case 103 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:701: TOUCHING_KW
                {
                mTOUCHING_KW(); 

                }
                break;
            case 104 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:713: MOVING_KW
                {
                mMOVING_KW(); 

                }
                break;
            case 105 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:723: WAITING_KW
                {
                mWAITING_KW(); 

                }
                break;
            case 106 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:734: FINISHED_KW
                {
                mFINISHED_KW(); 

                }
                break;
            case 107 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:746: STARTED_KW
                {
                mSTARTED_KW(); 

                }
                break;
            case 108 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:757: PAUSED_KW
                {
                mPAUSED_KW(); 

                }
                break;
            case 109 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:767: MUTED_KW
                {
                mMUTED_KW(); 

                }
                break;
            case 110 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:776: PLAYED_KW
                {
                mPLAYED_KW(); 

                }
                break;
            case 111 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:786: STOPPED_KW
                {
                mSTOPPED_KW(); 

                }
                break;
            case 112 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:797: ASSIGN_KW
                {
                mASSIGN_KW(); 

                }
                break;
            case 113 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:807: ADD_KW
                {
                mADD_KW(); 

                }
                break;
            case 114 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:814: SUB_KW
                {
                mSUB_KW(); 

                }
                break;
            case 115 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:821: INVERT_KW
                {
                mINVERT_KW(); 

                }
                break;
            case 116 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:831: NUM
                {
                mNUM(); 

                }
                break;
            case 117 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:835: IA_KW
                {
                mIA_KW(); 

                }
                break;
            case 118 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:841: DURING
                {
                mDURING(); 

                }
                break;
            case 119 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:848: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 120 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:854: EQUIP
                {
                mEQUIP(); 

                }
                break;
            case 121 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:860: NEXT
                {
                mNEXT(); 

                }
                break;
            case 122 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:865: PREVIOUS
                {
                mPREVIOUS(); 

                }
                break;
            case 123 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:874: KEYBOARD
                {
                mKEYBOARD(); 

                }
                break;
            case 124 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:883: ACTIVATE_KW
                {
                mACTIVATE_KW(); 

                }
                break;
            case 125 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:895: DISABLE_KW
                {
                mDISABLE_KW(); 

                }
                break;
            case 126 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:906: COMMANDS
                {
                mCOMMANDS(); 

                }
                break;
            case 127 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:915: CLOCKWISE
                {
                mCLOCKWISE(); 

                }
                break;
            case 128 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:925: ANTICLOCKWISE
                {
                mANTICLOCKWISE(); 

                }
                break;
            case 129 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:939: NEXTURN_KW
                {
                mNEXTURN_KW(); 

                }
                break;
            case 130 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:950: RELOAD_KW
                {
                mRELOAD_KW(); 

                }
                break;
            case 131 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:960: GRASPS_KW
                {
                mGRASPS_KW(); 

                }
                break;
            case 132 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:970: EXPELS_KW
                {
                mEXPELS_KW(); 

                }
                break;
            case 133 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:980: INGESTS_KW
                {
                mINGESTS_KW(); 

                }
                break;
            case 134 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:991: DUPLICABLE
                {
                mDUPLICABLE(); 

                }
                break;
            case 135 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1002: FIRST
                {
                mFIRST(); 

                }
                break;
            case 136 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1008: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 137 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1014: POSITION
                {
                mPOSITION(); 

                }
                break;
            case 138 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1023: ORIENTATION
                {
                mORIENTATION(); 

                }
                break;
            case 139 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1035: SIZE
                {
                mSIZE(); 

                }
                break;
            case 140 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1040: PERSON
                {
                mPERSON(); 

                }
                break;
            case 141 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1047: FREE
                {
                mFREE(); 

                }
                break;
            case 142 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1052: FRAME
                {
                mFRAME(); 

                }
                break;
            case 143 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1058: PRESSED_KW
                {
                mPRESSED_KW(); 

                }
                break;
            case 144 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1069: HELD_KW
                {
                mHELD_KW(); 

                }
                break;
            case 145 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1077: RELEASED_KW
                {
                mRELEASED_KW(); 

                }
                break;
            case 146 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1089: OWNES_KW
                {
                mOWNES_KW(); 

                }
                break;
            case 147 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1098: NOTOWNES_KW
                {
                mNOTOWNES_KW(); 

                }
                break;
            case 148 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1110: OWNED_KW
                {
                mOWNED_KW(); 

                }
                break;
            case 149 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1119: NOTOWNED_KW
                {
                mNOTOWNED_KW(); 

                }
                break;
            case 150 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1131: HAPPENS
                {
                mHAPPENS(); 

                }
                break;
            case 151 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1139: CONTAINS_KW
                {
                mCONTAINS_KW(); 

                }
                break;
            case 152 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1151: DISTANCE_KW
                {
                mDISTANCE_KW(); 

                }
                break;
            case 153 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1163: ANGLE_KW
                {
                mANGLE_KW(); 

                }
                break;
            case 154 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1172: WUP
                {
                mWUP(); 

                }
                break;
            case 155 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1176: WDOWN
                {
                mWDOWN(); 

                }
                break;
            case 156 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1182: LEFT
                {
                mLEFT(); 

                }
                break;
            case 157 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1187: RIGHT
                {
                mRIGHT(); 

                }
                break;
            case 158 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1193: SPACE
                {
                mSPACE(); 

                }
                break;
            case 159 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1199: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 160 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1206: ENTER
                {
                mENTER(); 

                }
                break;
            case 161 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1212: MOUSE
                {
                mMOUSE(); 

                }
                break;
            case 162 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1218: KEY
                {
                mKEY(); 

                }
                break;
            case 163 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1222: CLICK_LEFT
                {
                mCLICK_LEFT(); 

                }
                break;
            case 164 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1233: CLICK_MIDDLE
                {
                mCLICK_MIDDLE(); 

                }
                break;
            case 165 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1246: CLICK_RIGHT
                {
                mCLICK_RIGHT(); 

                }
                break;
            case 166 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1258: SCROLL_UP
                {
                mSCROLL_UP(); 

                }
                break;
            case 167 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1268: SCROLL_DOWN
                {
                mSCROLL_DOWN(); 

                }
                break;
            case 168 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1280: COMMAND_KW
                {
                mCOMMAND_KW(); 

                }
                break;
            case 169 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1291: JUMP
                {
                mJUMP(); 

                }
                break;
            case 170 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1296: MOVE
                {
                mMOVE(); 

                }
                break;
            case 171 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1301: FORWARD
                {
                mFORWARD(); 

                }
                break;
            case 172 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1309: BACKWARD
                {
                mBACKWARD(); 

                }
                break;
            case 173 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1318: TURN
                {
                mTURN(); 

                }
                break;
            case 174 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1323: ACCELERATE
                {
                mACCELERATE(); 

                }
                break;
            case 175 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1334: BRAKE
                {
                mBRAKE(); 

                }
                break;
            case 176 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1340: CAMERA
                {
                mCAMERA(); 

                }
                break;
            case 177 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1347: MEDIA
                {
                mMEDIA(); 

                }
                break;
            case 178 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1353: TIME
                {
                mTIME(); 

                }
                break;
            case 179 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1358: VALUE
                {
                mVALUE(); 

                }
                break;
            case 180 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1364: BOOST_INTERVAL
                {
                mBOOST_INTERVAL(); 

                }
                break;
            case 181 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1379: SHOOT_INTERVAL
                {
                mSHOOT_INTERVAL(); 

                }
                break;
            case 182 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1394: RELOAD_TIME
                {
                mRELOAD_TIME(); 

                }
                break;
            case 183 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1406: INVENTORY
                {
                mINVENTORY(); 

                }
                break;
            case 184 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1416: EQUIPED_OBJECT
                {
                mEQUIPED_OBJECT(); 

                }
                break;
            case 185 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1431: ENTRANCES
                {
                mENTRANCES(); 

                }
                break;
            case 186 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1441: EXITS
                {
                mEXITS(); 

                }
                break;
            case 187 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1447: DAMAGE_ZONE
                {
                mDAMAGE_ZONE(); 

                }
                break;
            case 188 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1459: COLLECTORS
                {
                mCOLLECTORS(); 

                }
                break;
            case 189 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1470: TYPES_COLLECTORS
                {
                mTYPES_COLLECTORS(); 

                }
                break;
            case 190 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1487: GENERATORS
                {
                mGENERATORS(); 

                }
                break;
            case 191 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1498: TYPE_GENERATORS
                {
                mTYPE_GENERATORS(); 

                }
                break;
            case 192 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1514: BREAKERS
                {
                mBREAKERS(); 

                }
                break;
            case 193 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1523: TYPES_BREAKERS
                {
                mTYPES_BREAKERS(); 

                }
                break;
            case 194 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1538: TELEPORTABLES
                {
                mTELEPORTABLES(); 

                }
                break;
            case 195 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1552: TYPES_TELEPORTABLES
                {
                mTYPES_TELEPORTABLES(); 

                }
                break;
            case 196 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1572: TEXTE
                {
                mTEXTE(); 

                }
                break;
            case 197 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1578: LETTER
                {
                mLETTER(); 

                }
                break;
            case 198 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1585: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 199 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1591: IDENT
                {
                mIDENT(); 

                }
                break;
            case 200 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:1:1597: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\5\65\1\104\4\uffff\6\65\1\uffff\1\137\3\uffff\1\140\1"+
        "\141\1\142\2\65\1\165\1\uffff\1\167\1\171\2\uffff\17\65\1\uffff"+
        "\1\65\2\uffff\1\66\2\uffff\14\66\2\uffff\2\66\1\u00b9\4\66\1\u00c1"+
        "\1\66\1\u00c4\1\u00c8\1\u00c9\1\u00cb\1\u00cd\1\66\1\u00d0\6\66"+
        "\1\u00d8\3\66\4\uffff\5\66\1\u00e2\14\66\5\uffff\45\66\1\u0122\6"+
        "\66\1\u0129\11\66\1\u0134\5\66\1\u013a\2\66\1\uffff\1\u013d\2\66"+
        "\1\u0140\2\66\1\u0143\1\uffff\2\66\1\uffff\3\66\2\uffff\1\u0149"+
        "\1\uffff\1\66\1\uffff\2\66\1\uffff\7\66\1\uffff\4\66\1\u0159\1\66"+
        "\1\u015b\1\66\1\u015d\1\uffff\14\66\1\u016b\52\66\1\u019f\7\66\1"+
        "\uffff\6\66\1\uffff\1\u01ae\1\66\1\u01b0\2\66\1\u01b6\4\66\1\uffff"+
        "\1\u01bb\1\u01bc\3\66\1\uffff\1\66\1\u01c1\1\uffff\2\66\1\uffff"+
        "\2\66\1\uffff\5\66\1\uffff\1\u01cc\3\66\1\u01d1\1\66\1\u01d4\10"+
        "\66\1\uffff\1\u01dd\1\uffff\1\u01df\1\uffff\1\66\1\u01e2\1\u01e4"+
        "\6\66\1\u01eb\1\u01ed\1\66\1\u01ef\1\uffff\1\u01f0\2\66\1\u01f3"+
        "\2\66\1\u01f7\10\66\1\u0200\2\66\1\u0203\1\u0204\1\u0205\3\66\1"+
        "\u0209\1\u020a\4\66\1\u020f\2\66\1\u0213\4\66\1\u0218\5\66\1\u021e"+
        "\6\66\1\uffff\2\66\1\u0228\5\66\1\u022e\2\66\1\u0231\2\66\1\uffff"+
        "\1\66\1\uffff\1\u0236\1\66\1\u0238\2\66\1\uffff\2\66\1\u0240\1\66"+
        "\2\uffff\1\u0243\1\66\1\u0245\1\66\1\uffff\1\66\1\u0248\1\u0249"+
        "\7\66\1\uffff\1\u0251\1\66\1\u0253\1\u0254\1\uffff\1\u0255\1\66"+
        "\1\uffff\2\66\1\u0259\5\66\1\uffff\1\66\1\uffff\1\u0260\1\u0261"+
        "\1\uffff\1\u0262\1\uffff\1\66\1\u0264\1\66\1\u0266\1\u0267\1\66"+
        "\1\uffff\1\66\1\uffff\1\66\2\uffff\1\u026c\1\66\1\uffff\3\66\1\uffff"+
        "\2\66\1\u0274\5\66\1\uffff\2\66\3\uffff\3\66\2\uffff\4\66\1\uffff"+
        "\1\66\1\u0285\1\66\1\uffff\4\66\1\uffff\1\66\1\u028c\1\u028d\2\66"+
        "\1\uffff\1\u0291\1\66\1\u0293\1\66\1\u0295\3\66\1\u0299\1\uffff"+
        "\4\66\1\u029e\1\uffff\1\66\1\u02a0\1\uffff\4\66\1\uffff\1\66\1\uffff"+
        "\7\66\1\uffff\1\66\1\u0243\1\uffff\1\66\1\uffff\2\66\2\uffff\1\u02b2"+
        "\2\66\1\u02b5\1\u02b6\2\66\1\uffff\1\66\3\uffff\3\66\1\uffff\1\66"+
        "\1\u02be\4\66\3\uffff\1\u02c3\1\uffff\1\u02c4\2\uffff\2\66\1\u02c8"+
        "\1\66\1\uffff\2\66\1\u02cc\3\66\1\u02d0\1\uffff\1\u02d1\1\u02d3"+
        "\1\66\1\u02d5\1\66\1\u02d7\1\u02d8\1\u02d9\1\66\1\u02db\2\66\1\u02de"+
        "\2\66\1\u02e1\1\uffff\1\u02e2\3\66\1\u02e6\1\66\2\uffff\1\66\1\u02ea"+
        "\1\66\1\uffff\1\u02ec\1\uffff\1\u02ed\1\uffff\1\u02ee\2\66\1\uffff"+
        "\4\66\1\uffff\1\u02f5\1\uffff\1\u02f6\10\66\1\u02ff\1\u0300\2\66"+
        "\1\u0303\1\66\1\u0305\1\66\1\uffff\2\66\2\uffff\1\66\1\u030a\1\66"+
        "\1\u030c\1\u030d\1\u030e\1\66\1\uffff\3\66\1\u0314\2\uffff\2\66"+
        "\1\u0317\1\uffff\1\u0318\1\66\1\u031a\1\uffff\1\66\1\u031c\1\66"+
        "\2\uffff\1\66\1\uffff\1\66\1\uffff\1\66\3\uffff\1\66\1\uffff\1\u0323"+
        "\1\66\1\uffff\2\66\2\uffff\1\66\1\u0328\1\66\1\uffff\1\u032a\1\66"+
        "\1\u032c\1\uffff\1\66\3\uffff\1\66\1\u032f\1\u0331\3\66\2\uffff"+
        "\10\66\2\uffff\1\u033d\1\66\1\uffff\1\u033f\1\uffff\1\66\1\u0341"+
        "\2\66\1\uffff\1\66\3\uffff\1\u0345\1\u0346\1\66\1\u0348\1\u0349"+
        "\1\uffff\1\u034a\1\66\2\uffff\1\66\1\uffff\1\u034d\1\uffff\1\u034f"+
        "\2\66\1\u0352\1\u0353\1\66\1\uffff\1\u0355\2\66\1\u0358\1\uffff"+
        "\1\u0359\1\uffff\1\66\1\uffff\1\66\1\u035c\1\uffff\1\u035d\1\uffff"+
        "\1\u035e\5\66\1\u0364\4\66\1\uffff\1\66\1\uffff\1\66\1\uffff\1\66"+
        "\1\u036c\1\66\2\uffff\1\66\3\uffff\2\66\1\uffff\1\u0371\1\uffff"+
        "\2\66\2\uffff\1\66\1\uffff\2\66\2\uffff\1\u0377\1\66\3\uffff\1\66"+
        "\1\u037a\1\66\1\u037c\1\66\1\uffff\7\66\1\uffff\2\66\1\u0387\1\66"+
        "\1\uffff\1\u0389\1\u038a\1\u038b\1\u038c\1\u038d\1\uffff\1\66\1"+
        "\u038f\1\uffff\1\66\1\uffff\1\u0391\6\66\1\u0398\1\u0399\1\66\1"+
        "\uffff\1\66\5\uffff\1\66\1\uffff\1\66\1\uffff\6\66\2\uffff\5\66"+
        "\1\u03a9\2\66\1\u03ac\1\u03ad\1\u03ae\1\u03af\3\66\1\uffff\1\66"+
        "\1\u03b4\4\uffff\1\u03b5\1\66\1\u03b7\1\66\2\uffff\1\u03b9\1\uffff"+
        "\1\66\1\uffff\1\66\1\u03bc\1\uffff";
    static final String DFA10_eofS =
        "\u03bd\uffff";
    static final String DFA10_minS =
        "\1\11\5\55\1\57\4\uffff\6\55\1\uffff\1\60\3\uffff\6\55\1\uffff"+
        "\2\75\2\uffff\17\55\1\uffff\1\55\2\uffff\1\115\2\uffff\1\111\1\103"+
        "\1\141\1\145\1\162\1\160\1\165\2\154\1\162\1\141\1\156\2\uffff\1"+
        "\160\1\154\1\55\1\144\1\151\1\163\1\144\1\55\1\143\5\55\1\150\1"+
        "\55\1\156\1\164\1\162\1\151\1\143\1\157\1\55\1\143\1\141\1\157\4"+
        "\uffff\1\164\2\155\1\170\1\156\1\55\1\141\1\164\1\165\1\154\1\141"+
        "\1\154\1\141\1\166\1\142\1\172\1\141\1\157\5\uffff\1\155\1\141\1"+
        "\156\1\142\1\154\1\156\1\164\2\154\1\141\1\163\1\157\1\146\1\154"+
        "\1\141\1\145\1\160\1\167\1\155\1\165\1\141\1\145\1\163\1\162\1\144"+
        "\1\146\1\163\1\165\1\151\1\143\1\154\1\171\1\143\2\154\1\157\1\164"+
        "\1\55\2\155\1\144\1\155\1\105\1\124\1\55\1\145\2\156\1\162\1\156"+
        "\1\145\1\143\1\145\1\163\1\55\1\155\1\145\1\155\1\151\1\163\1\55"+
        "\1\160\1\144\1\uffff\1\55\1\151\1\154\1\55\1\166\1\151\1\55\1\uffff"+
        "\1\151\1\145\1\uffff\3\145\2\uffff\1\55\1\uffff\1\145\1\uffff\2"+
        "\145\1\uffff\1\145\1\150\1\154\1\164\1\167\1\157\1\143\1\uffff\2"+
        "\153\1\141\1\163\1\55\1\145\1\55\1\164\1\55\1\uffff\1\156\2\145"+
        "\1\163\1\151\1\162\1\154\2\157\1\160\1\162\1\145\1\55\1\145\1\143"+
        "\1\157\1\145\1\163\1\144\1\145\1\142\1\150\1\157\1\145\1\144\1\141"+
        "\1\145\1\151\1\171\1\164\1\160\1\164\1\151\1\145\1\144\1\163\1\141"+
        "\1\151\1\154\1\156\1\141\1\163\1\171\1\163\1\151\1\163\1\111\1\145"+
        "\1\141\1\145\1\151\1\145\1\164\1\141\1\154\1\55\1\164\1\165\1\155"+
        "\1\164\1\154\1\143\1\151\1\uffff\1\160\1\145\1\151\1\145\2\137\1"+
        "\uffff\1\55\1\163\1\55\1\144\1\142\1\55\1\150\1\160\1\145\1\141"+
        "\1\uffff\2\55\1\145\1\163\1\164\1\uffff\1\145\1\55\1\uffff\1\143"+
        "\1\145\1\uffff\1\145\1\147\1\uffff\1\166\1\154\1\162\1\156\1\163"+
        "\1\uffff\1\55\1\162\1\156\1\144\1\55\1\144\1\55\1\145\1\155\1\153"+
        "\1\167\1\145\1\153\1\164\1\167\1\uffff\1\55\1\uffff\1\55\1\uffff"+
        "\1\163\2\55\1\156\1\145\1\143\2\145\1\154\2\55\1\164\1\55\1\uffff"+
        "\1\55\1\145\1\164\1\55\1\151\1\160\1\55\1\162\1\157\1\164\1\166"+
        "\2\141\1\157\1\164\1\55\1\143\1\145\3\55\1\143\1\156\1\141\2\55"+
        "\1\142\1\141\1\156\1\151\1\55\1\147\1\145\1\55\1\151\1\163\1\164"+
        "\1\157\1\55\1\141\1\146\1\162\1\141\1\143\1\55\1\160\1\154\1\163"+
        "\1\160\1\145\1\157\1\uffff\1\157\1\145\1\55\2\141\1\145\1\153\1"+
        "\154\1\55\1\162\1\141\1\55\1\101\1\111\1\uffff\1\154\1\uffff\1\55"+
        "\1\141\1\55\1\102\1\145\1\uffff\1\145\1\157\1\55\1\162\2\uffff\1"+
        "\55\1\150\1\55\1\156\1\uffff\1\154\2\55\1\156\1\141\1\145\4\164"+
        "\1\uffff\1\55\1\164\2\55\1\uffff\1\55\1\156\1\uffff\2\145\1\55\1"+
        "\141\1\163\1\145\1\111\1\156\1\uffff\1\162\1\uffff\2\55\1\uffff"+
        "\1\55\1\uffff\1\147\1\55\1\153\2\55\1\154\1\uffff\1\145\1\uffff"+
        "\1\145\2\uffff\1\55\1\111\1\uffff\1\164\1\163\1\151\1\uffff\1\141"+
        "\1\156\1\55\1\145\1\144\1\163\1\155\1\151\1\uffff\1\153\1\162\3"+
        "\uffff\1\153\1\151\1\164\2\uffff\1\154\1\156\1\147\1\143\1\uffff"+
        "\1\145\1\55\1\144\1\uffff\1\157\1\145\1\151\1\156\1\uffff\1\151"+
        "\2\55\1\156\1\145\1\uffff\1\55\1\163\1\55\1\145\1\55\1\144\1\141"+
        "\1\162\1\55\1\uffff\1\156\1\151\1\143\1\167\1\55\1\uffff\1\141\1"+
        "\55\1\uffff\1\127\1\124\1\123\1\141\1\uffff\1\163\1\uffff\1\157"+
        "\1\162\1\145\1\156\1\144\1\156\1\162\1\uffff\1\144\1\55\1\uffff"+
        "\1\145\1\uffff\1\163\1\157\2\uffff\1\55\1\164\1\162\2\55\1\157\1"+
        "\163\1\uffff\1\141\3\uffff\1\147\1\156\1\163\1\uffff\1\162\1\55"+
        "\1\162\1\156\1\145\1\156\3\uffff\1\55\1\uffff\1\55\2\uffff\1\104"+
        "\1\144\1\55\1\144\1\uffff\1\156\1\171\1\55\1\172\1\143\1\164\1\55"+
        "\1\uffff\2\55\1\145\1\55\1\157\3\55\1\164\1\55\1\145\1\143\1\55"+
        "\1\141\1\132\1\55\1\uffff\1\55\1\165\1\144\1\157\1\55\1\164\2\uffff"+
        "\1\143\1\55\1\144\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\162\1"+
        "\171\1\uffff\1\144\1\156\1\164\1\151\1\uffff\1\55\1\uffff\1\55\1"+
        "\124\1\137\1\164\1\145\1\154\1\145\1\154\1\145\2\55\1\147\1\164"+
        "\1\55\1\144\1\55\1\143\1\uffff\1\145\1\141\2\uffff\1\162\1\55\1"+
        "\164\3\55\1\144\1\uffff\1\163\1\164\1\144\1\55\2\uffff\1\160\1\157"+
        "\1\55\1\uffff\1\55\1\164\1\55\1\uffff\1\145\1\55\1\145\2\uffff\1"+
        "\151\1\uffff\1\144\1\uffff\1\156\3\uffff\1\151\1\uffff\1\55\1\145"+
        "\1\uffff\1\142\1\157\2\uffff\1\163\1\55\1\156\1\uffff\1\55\1\145"+
        "\1\55\1\uffff\1\117\3\uffff\1\144\2\55\1\163\1\157\1\163\2\uffff"+
        "\1\122\1\113\1\151\1\144\1\154\1\141\1\145\1\162\2\uffff\1\55\1"+
        "\141\1\uffff\1\55\1\uffff\1\153\1\55\1\164\1\171\1\uffff\1\151\3"+
        "\uffff\2\55\1\145\2\55\1\uffff\1\55\1\167\2\uffff\1\145\1\uffff"+
        "\1\55\1\uffff\1\55\1\162\1\155\2\55\1\157\1\uffff\1\55\1\154\1\156"+
        "\1\55\1\uffff\1\55\1\uffff\1\163\1\uffff\1\142\1\55\1\uffff\1\55"+
        "\1\uffff\1\55\1\162\1\145\1\111\1\127\1\157\1\55\1\145\1\153\1\160"+
        "\1\141\1\uffff\1\142\1\uffff\1\167\1\uffff\1\145\1\55\1\157\2\uffff"+
        "\1\162\3\uffff\1\156\1\162\1\uffff\1\55\1\uffff\1\163\1\145\2\uffff"+
        "\1\156\1\uffff\2\145\2\uffff\1\55\1\152\3\uffff\1\163\1\55\1\102"+
        "\1\55\1\156\1\uffff\1\143\1\145\1\157\1\164\1\154\1\151\1\163\1"+
        "\uffff\1\156\1\166\1\55\1\166\1\uffff\5\55\1\uffff\1\145\1\55\1"+
        "\uffff\1\125\1\uffff\1\55\1\164\2\162\1\157\1\145\1\163\2\55\1\141"+
        "\1\uffff\1\141\5\uffff\1\143\1\uffff\1\124\1\uffff\1\157\1\163\1"+
        "\164\1\162\1\163\1\145\2\uffff\2\154\1\164\1\137\1\162\1\55\1\141"+
        "\1\163\4\55\1\163\1\113\1\163\1\uffff\1\142\1\55\4\uffff\1\55\1"+
        "\127\1\55\1\154\2\uffff\1\55\1\uffff\1\145\1\uffff\1\163\1\55\1"+
        "\uffff";
    static final String DFA10_maxS =
        "\6\172\1\57\4\uffff\6\172\1\uffff\1\71\3\uffff\6\172\1\uffff\2"+
        "\75\2\uffff\17\172\1\uffff\1\172\2\uffff\1\115\2\uffff\1\111\1\103"+
        "\1\165\1\151\1\162\1\160\1\165\2\154\1\162\1\157\1\162\2\uffff\1"+
        "\163\1\154\1\172\1\164\1\154\1\163\1\144\1\172\1\164\5\172\1\150"+
        "\1\172\1\156\1\164\1\162\1\151\1\164\1\157\1\172\1\143\1\145\1\157"+
        "\4\uffff\1\164\2\155\1\170\1\156\1\172\1\141\1\164\1\166\1\154\1"+
        "\162\1\154\1\157\1\166\1\142\1\172\1\141\1\157\5\uffff\1\155\1\151"+
        "\1\156\1\147\1\155\1\156\1\164\2\154\1\141\1\163\1\157\1\146\1\154"+
        "\1\146\1\163\1\162\1\167\1\155\1\165\1\141\1\145\1\163\1\162\1\164"+
        "\1\146\1\163\1\165\1\160\1\143\1\154\1\171\1\143\1\154\1\156\1\157"+
        "\1\164\1\172\2\155\1\144\1\155\1\105\1\124\1\172\1\145\2\156\1\162"+
        "\1\156\1\145\1\143\1\145\1\163\1\172\1\155\1\145\1\155\1\151\1\163"+
        "\1\172\1\160\1\144\1\uffff\1\172\1\151\1\154\1\172\1\166\1\151\1"+
        "\172\1\uffff\1\151\1\145\1\uffff\3\145\2\uffff\1\172\1\uffff\1\145"+
        "\1\uffff\2\145\1\uffff\1\145\1\150\1\154\1\164\1\167\1\157\1\143"+
        "\1\uffff\2\153\1\141\1\163\1\172\1\145\1\172\1\164\1\172\1\uffff"+
        "\1\156\1\145\1\151\1\163\1\151\1\162\1\154\2\157\1\160\1\162\1\145"+
        "\1\172\1\145\1\143\1\157\1\145\1\166\1\144\1\145\1\142\1\150\2\157"+
        "\1\144\1\141\1\145\1\151\1\171\1\164\1\160\1\164\2\151\1\144\1\163"+
        "\1\164\1\151\1\154\1\156\1\141\1\163\1\171\1\166\1\151\2\163\1\162"+
        "\1\141\1\145\1\151\1\145\1\164\1\141\1\154\1\172\1\164\1\165\1\160"+
        "\1\164\1\154\1\143\1\151\1\uffff\1\160\1\145\1\151\1\145\2\137\1"+
        "\uffff\1\172\1\163\1\172\1\144\1\163\1\172\1\150\1\160\1\145\1\141"+
        "\1\uffff\2\172\1\145\1\163\1\164\1\uffff\1\145\1\172\1\uffff\1\143"+
        "\1\145\1\uffff\1\145\1\147\1\uffff\1\166\1\154\2\162\1\163\1\uffff"+
        "\1\172\1\162\1\156\1\163\1\172\1\144\1\172\1\145\1\155\1\153\1\167"+
        "\1\145\1\153\1\164\1\167\1\uffff\1\172\1\uffff\1\172\1\uffff\1\163"+
        "\2\172\1\156\1\145\1\143\2\145\1\154\2\172\1\164\1\172\1\uffff\1"+
        "\172\1\145\1\164\1\172\1\151\1\160\1\172\1\162\1\157\1\164\1\166"+
        "\2\141\1\157\1\164\1\172\1\143\1\145\3\172\1\143\1\156\1\141\2\172"+
        "\1\142\1\141\1\156\1\151\1\172\1\147\1\145\1\172\1\151\1\163\1\164"+
        "\1\157\1\172\1\141\1\146\1\162\1\141\1\143\1\172\1\160\1\154\1\163"+
        "\1\160\1\163\1\157\1\uffff\1\157\1\145\1\172\2\141\1\145\1\153\1"+
        "\154\1\172\1\162\1\141\1\172\1\113\1\111\1\uffff\1\154\1\uffff\1"+
        "\172\1\141\1\172\1\124\1\145\1\uffff\1\151\1\157\1\172\1\162\2\uffff"+
        "\1\172\1\150\1\172\1\156\1\uffff\1\154\2\172\1\156\1\141\1\145\4"+
        "\164\1\uffff\1\172\1\164\2\172\1\uffff\1\172\1\156\1\uffff\2\145"+
        "\1\172\1\141\1\163\1\145\1\111\1\156\1\uffff\1\162\1\uffff\2\172"+
        "\1\uffff\1\172\1\uffff\1\147\1\172\1\153\2\172\1\154\1\uffff\1\145"+
        "\1\uffff\1\163\2\uffff\1\172\1\111\1\uffff\1\164\1\163\1\151\1\uffff"+
        "\1\151\1\156\1\172\1\145\1\144\1\163\1\155\1\151\1\uffff\1\153\1"+
        "\162\3\uffff\1\153\1\151\1\164\2\uffff\1\154\1\156\1\147\1\143\1"+
        "\uffff\1\145\1\172\1\144\1\uffff\1\157\1\145\1\151\1\156\1\uffff"+
        "\1\151\2\172\1\156\1\145\1\uffff\1\172\1\163\1\172\1\145\1\172\1"+
        "\144\1\141\1\162\1\172\1\uffff\1\156\1\151\1\143\1\167\1\172\1\uffff"+
        "\1\141\1\172\1\uffff\1\127\1\124\1\123\1\141\1\uffff\1\163\1\uffff"+
        "\1\157\1\162\1\145\1\156\1\163\1\156\1\162\1\uffff\1\144\1\172\1"+
        "\uffff\1\145\1\uffff\1\163\1\157\2\uffff\1\172\1\164\1\162\2\172"+
        "\1\157\1\163\1\uffff\1\141\3\uffff\1\147\1\156\1\163\1\uffff\1\162"+
        "\1\172\1\162\1\156\1\145\1\156\3\uffff\1\172\1\uffff\1\172\2\uffff"+
        "\1\125\1\144\1\172\1\144\1\uffff\1\156\1\171\2\172\1\143\1\164\1"+
        "\172\1\uffff\2\172\1\145\1\172\1\157\3\172\1\164\1\172\1\145\1\143"+
        "\1\172\1\141\1\132\1\172\1\uffff\1\172\1\165\1\144\1\157\1\172\1"+
        "\164\2\uffff\1\143\1\172\1\144\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\1\162\1\171\1\uffff\1\144\1\156\1\164\1\151\1\uffff\1\172"+
        "\1\uffff\1\172\1\124\1\137\1\164\1\145\1\154\1\145\1\154\1\145\2"+
        "\172\1\147\1\164\1\172\1\144\1\172\1\143\1\uffff\1\145\1\141\2\uffff"+
        "\1\162\1\172\1\164\3\172\1\144\1\uffff\1\163\1\164\1\163\1\172\2"+
        "\uffff\1\160\1\157\1\172\1\uffff\1\172\1\164\1\172\1\uffff\1\145"+
        "\1\172\1\157\2\uffff\1\151\1\uffff\1\144\1\uffff\1\156\3\uffff\1"+
        "\151\1\uffff\1\172\1\145\1\uffff\1\142\1\157\2\uffff\1\163\1\172"+
        "\1\156\1\uffff\1\172\1\145\1\172\1\uffff\1\117\3\uffff\1\144\2\172"+
        "\1\163\1\157\1\163\2\uffff\1\122\1\113\1\151\1\144\1\154\1\141\1"+
        "\145\1\162\2\uffff\1\172\1\141\1\uffff\1\172\1\uffff\1\153\1\172"+
        "\1\164\1\171\1\uffff\1\151\3\uffff\2\172\1\145\2\172\1\uffff\1\172"+
        "\1\167\2\uffff\1\145\1\uffff\1\172\1\uffff\1\172\1\162\1\155\2\172"+
        "\1\157\1\uffff\1\172\1\154\1\156\1\172\1\uffff\1\172\1\uffff\1\163"+
        "\1\uffff\1\142\1\172\1\uffff\1\172\1\uffff\1\172\1\162\1\145\1\111"+
        "\1\127\1\157\1\172\1\145\1\153\1\160\1\141\1\uffff\1\142\1\uffff"+
        "\1\167\1\uffff\1\145\1\172\1\157\2\uffff\1\162\3\uffff\1\156\1\162"+
        "\1\uffff\1\172\1\uffff\1\163\1\145\2\uffff\1\156\1\uffff\2\145\2"+
        "\uffff\1\172\1\152\3\uffff\1\163\1\172\1\102\1\172\1\156\1\uffff"+
        "\1\143\1\145\1\157\1\164\1\154\1\151\1\163\1\uffff\1\156\1\166\1"+
        "\172\1\166\1\uffff\5\172\1\uffff\1\145\1\172\1\uffff\1\125\1\uffff"+
        "\1\172\1\164\2\162\1\157\1\145\1\163\2\172\1\141\1\uffff\1\141\5"+
        "\uffff\1\143\1\uffff\1\124\1\uffff\1\157\1\163\1\164\1\162\1\163"+
        "\1\145\2\uffff\2\154\1\164\1\137\1\162\1\172\1\141\1\163\4\172\1"+
        "\163\1\113\1\163\1\uffff\1\142\1\172\4\uffff\1\172\1\127\1\172\1"+
        "\154\2\uffff\1\172\1\uffff\1\145\1\uffff\1\163\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\7\uffff\1\10\1\11\1\12\1\13\6\uffff\1\23\1\uffff\1\25\1\27\1\30"+
        "\6\uffff\1\43\2\uffff\1\50\1\52\17\uffff\1\u00c4\1\uffff\1\u00c6"+
        "\1\u00c8\1\uffff\1\u00c5\1\u00c7\14\uffff\1\7\1\26\32\uffff\1\24"+
        "\1\31\1\32\1\33\22\uffff\1\37\1\46\1\44\1\47\1\45\77\uffff\1\15"+
        "\7\uffff\1\165\2\uffff\1\16\3\uffff\1\73\1\136\1\uffff\1\20\1\uffff"+
        "\1\103\2\uffff\1\141\7\uffff\1\131\11\uffff\1\40\77\uffff\1\u009a"+
        "\6\uffff\1\4\12\uffff\1\42\5\uffff\1\14\2\uffff\1\17\2\uffff\1\34"+
        "\2\uffff\1\161\5\uffff\1\104\17\uffff\1\35\1\uffff\1\164\1\uffff"+
        "\1\36\15\uffff\1\162\63\uffff\1\u00a2\16\uffff\1\5\1\uffff\1\41"+
        "\5\uffff\1\65\4\uffff\1\51\1\u008d\4\uffff\1\u0090\12\uffff\1\75"+
        "\4\uffff\1\21\2\uffff\1\117\10\uffff\1\64\1\uffff\1\171\2\uffff"+
        "\1\102\1\uffff\1\u00aa\6\uffff\1\70\1\uffff\1\106\1\uffff\1\121"+
        "\1\u008b\2\uffff\1\53\3\uffff\1\62\10\uffff\1\122\2\uffff\1\72\1"+
        "\74\1\u009c\3\uffff\1\143\1\124\4\uffff\1\u009b\3\uffff\1\105\4"+
        "\uffff\1\107\5\uffff\1\137\11\uffff\1\142\5\uffff\1\u00a9\2\uffff"+
        "\1\u00b2\4\uffff\1\u0088\1\uffff\1\u00ad\7\uffff\1\6\2\uffff\1\u008e"+
        "\1\uffff\1\u0087\2\uffff\1\u0099\1\144\7\uffff\1\132\1\uffff\1\u0092"+
        "\1\u0094\1\57\3\uffff\1\111\6\uffff\1\100\1\155\1\123\1\uffff\1"+
        "\u00a1\1\uffff\1\55\1\114\4\uffff\1\u009e\7\uffff\1\u009d\20\uffff"+
        "\1\101\6\uffff\1\140\1\u00a0\3\uffff\1\170\1\uffff\1\u00ba\1\uffff"+
        "\1\126\3\uffff\1\u00b3\4\uffff\1\167\1\uffff\1\u00b1\21\uffff\1"+
        "\160\2\uffff\1\66\1\163\7\uffff\1\u00af\4\uffff\1\150\1\u00a4\3"+
        "\uffff\1\110\3\uffff\1\u0083\3\uffff\1\63\1\67\1\uffff\1\u0082\1"+
        "\uffff\1\76\1\uffff\1\u00a5\1\71\1\u00a3\1\uffff\1\135\2\uffff\1"+
        "\166\2\uffff\1\154\1\156\3\uffff\1\u008c\3\uffff\1\115\1\uffff\1"+
        "\u0084\1\u009f\1\127\6\uffff\1\u00b0\1\1\10\uffff\1\125\1\130\2"+
        "\uffff\1\u00ab\1\uffff\1\u0096\4\uffff\1\u0085\1\uffff\1\151\1\22"+
        "\1\133\5\uffff\1\u0081\2\uffff\1\157\1\153\1\uffff\1\54\1\uffff"+
        "\1\61\6\uffff\1\175\4\uffff\1\u008f\1\uffff\1\120\1\uffff\1\145"+
        "\2\uffff\1\134\1\uffff\1\u00a8\13\uffff\1\147\1\uffff\1\152\1\uffff"+
        "\1\174\3\uffff\1\u00ac\1\u00c0\1\uffff\1\u0093\1\u0095\1\u00a6\2"+
        "\uffff\1\60\1\uffff\1\116\2\uffff\1\u0091\1\113\1\uffff\1\u0098"+
        "\2\uffff\1\172\1\u0089\2\uffff\1\173\1\176\1\u0097\5\uffff\1\56"+
        "\7\uffff\1\u00b7\4\uffff\1\146\5\uffff\1\u00b9\2\uffff\1\177\1\uffff"+
        "\1\3\12\uffff\1\u00a7\1\uffff\1\u00be\1\u00b6\1\77\1\u0086\1\u00bb"+
        "\1\uffff\1\u00bc\1\uffff\1\112\6\uffff\1\u00ae\1\u008a\17\uffff"+
        "\1\u00c1\2\uffff\1\u00c2\1\u0080\1\u00b4\1\u00b5\4\uffff\1\u00bf"+
        "\1\u00b8\1\uffff\1\u00bd\1\uffff\1\2\2\uffff\1\u00c3";
    static final String DFA10_specialS =
        "\u03bd\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\63\1\uffff\2\63\22\uffff\1\63\1\37\1\60\2\uffff\1\25\2\uffff"+
            "\1\10\1\7\1\23\1\21\1\12\1\22\1\uffff\1\6\12\62\1\40\1\11\1"+
            "\35\1\34\1\36\2\uffff\2\61\1\55\1\3\2\61\1\1\1\61\1\2\3\61\1"+
            "\56\2\61\1\43\3\61\1\57\6\61\3\uffff\1\24\2\uffff\1\14\1\20"+
            "\1\52\1\45\1\47\1\5\1\41\1\13\1\15\1\54\1\50\1\44\1\32\1\31"+
            "\1\16\1\46\1\61\1\42\1\33\1\4\1\53\1\51\1\17\1\26\1\27\1\30",
            "\15\66\6\uffff\1\66\1\64\31\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\16\66\1\67\14\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\5\66\1\70\25\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\4\66\1\76\2\66\1"+
            "\72\6\66\1\75\2\66\1\71\2\66\1\73\3\66\1\74\1\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\77\7\66\1\102"+
            "\5\66\1\100\2\66\1\101\10\66",
            "\1\103",
            "",
            "",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\105\3\66\1\106"+
            "\25\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\2\66\1\115\1\113"+
            "\4\66\1\114\2\66\1\111\1\66\1\110\4\66\1\112\1\107\6\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\5\66\1\120\7\66"+
            "\1\117\4\66\1\116\7\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\5\66\1\121\7\66"+
            "\1\122\3\66\1\124\1\66\1\123\2\66\1\125\3\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\130\7\66\1\126"+
            "\5\66\1\127\13\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\134\3\66\1\131"+
            "\6\66\1\132\2\66\1\136\2\66\1\135\6\66\1\133\1\66",
            "",
            "\12\62",
            "",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\144\3\66\1\146"+
            "\11\66\1\143\5\66\1\145\5\66",
            "\15\66\6\uffff\3\66\1\154\27\66\4\uffff\1\66\1\uffff\4\66"+
            "\1\151\3\66\1\147\5\66\1\153\3\66\1\150\1\66\1\152\5\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\160\1\66\1\155"+
            "\4\66\1\164\1\162\5\66\1\156\1\163\3\66\1\157\1\161\5\66",
            "",
            "\1\166",
            "\1\170",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\172\3\66\1\174"+
            "\14\66\1\173\10\66",
            "\15\66\6\uffff\3\66\1\u0082\27\66\4\uffff\1\66\1\uffff\1\177"+
            "\3\66\1\176\3\66\1\175\5\66\1\u0080\5\66\1\u0081\5\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\13\66\1\u0083\16"+
            "\66",
            "\15\66\6\uffff\3\66\1\u0087\27\66\4\uffff\1\66\1\uffff\4\66"+
            "\1\u0086\3\66\1\u0084\5\66\1\u0085\13\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\u008c\3\66\1\u0088"+
            "\3\66\1\u0089\5\66\1\u008b\5\66\1\u008a\5\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\u008d\3\66\1\u0091"+
            "\6\66\1\u008e\2\66\1\u0090\2\66\1\u008f\10\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\5\66\1\u0093\5\66"+
            "\1\u0094\1\66\1\u0092\2\66\1\u0095\1\66\1\u0097\4\66\1\u0096"+
            "\2\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\4\66\1\u0099\3\66"+
            "\1\u0098\21\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\u009b\7\66\1\u009a"+
            "\21\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\13\66\1\u009d\2"+
            "\66\1\u009c\13\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\15\66\1\u009e\1"+
            "\66\1\u009f\12\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\24\66\1\u00a0\5"+
            "\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\u00a1\31\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\4\66\1\u00a2\25"+
            "\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\10\66\1\u00a3\21"+
            "\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a8\23\uffff\1\u00a7",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b3\3\uffff\1\u00b2\11\uffff\1\u00b1",
            "\1\u00b4\3\uffff\1\u00b5",
            "",
            "",
            "\1\u00b7\2\uffff\1\u00b6",
            "\1\u00b8",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ba\2\uffff\1\u00bc\14\uffff\1\u00bb",
            "\1\u00be\2\uffff\1\u00bd",
            "\1\u00bf",
            "\1\u00c0",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00c3\20\uffff\1\u00c2",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\6\66\1\u00c7\13"+
            "\66\1\u00c5\2\66\1\u00c6\4\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\5\66\1\u00ca\24"+
            "\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\2\66\1\u00cc\27"+
            "\66",
            "\1\u00ce",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\10\66\1\u00cf\21"+
            "\66",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d6\20\uffff\1\u00d5",
            "\1\u00d7",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d9",
            "\1\u00da\3\uffff\1\u00db",
            "\1\u00dc",
            "",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e6\1\u00e5",
            "\1\u00e7",
            "\1\u00e9\15\uffff\1\u00e8\2\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ed\15\uffff\1\u00ec",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4\7\uffff\1\u00f5",
            "\1\u00f6",
            "\1\u00f7\4\uffff\1\u00f8",
            "\1\u00fa\1\u00f9",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0105\4\uffff\1\u0104",
            "\1\u0106\15\uffff\1\u0107",
            "\1\u0109\1\uffff\1\u0108",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111\17\uffff\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0117\6\uffff\1\u0116",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011f\1\u011d\1\u011e",
            "\1\u0120",
            "\1\u0121",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\26\66\1\u0133\3"+
            "\66",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013b",
            "\1\u013c",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013e",
            "\1\u013f",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0141",
            "\1\u0142",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\15\66\6\uffff\17\66\1\u0158\13\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u015a",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015c",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160\3\uffff\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0171\2\uffff\1\u0170",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0178\11\uffff\1\u0177",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0183\3\uffff\1\u0182",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186\22\uffff\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018f\2\uffff\1\u018e",
            "\1\u0190",
            "\1\u0191",
            "\1\u0194\15\uffff\1\u0193\33\uffff\1\u0192",
            "\1\u0195\14\uffff\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\1\66\1\u019e\30"+
            "\66",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a3\2\uffff\1\u01a2",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01af",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b1",
            "\1\u01b2\20\uffff\1\u01b3",
            "\15\66\6\uffff\7\66\1\u01b5\23\66\4\uffff\1\66\1\uffff\22"+
            "\66\1\u01b4\7\66",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01ca\3\uffff\1\u01c9",
            "\1\u01cb",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01d0\16\uffff\1\u01cf",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d2",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\10\66\1\u01d3\21"+
            "\66",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\24\66\1\u01de\5"+
            "\66",
            "",
            "\1\u01e0",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\3\66\1\u01e1\26"+
            "\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\22\66\1\u01e3\7"+
            "\66",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\17\66\1\u01ec\12"+
            "\66",
            "\1\u01ee",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01f1",
            "\1\u01f2",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01f4",
            "\1\u01f5",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\22\66\1\u01f6\7"+
            "\66",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0201",
            "\1\u0202",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0210",
            "\1\u0211",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\4\66\1\u0212\25"+
            "\66",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0224\15\uffff\1\u0223",
            "\1\u0225",
            "",
            "\1\u0226",
            "\1\u0227",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u022f",
            "\1\u0230",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0233\11\uffff\1\u0232",
            "\1\u0234",
            "",
            "\1\u0235",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0237",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u023a\1\u0239\20\uffff\1\u023b",
            "\1\u023c",
            "",
            "\1\u023d\3\uffff\1\u023e",
            "\1\u023f",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0241",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\22\66\1\u0242\7"+
            "\66",
            "\1\u0244",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0246",
            "",
            "\1\u0247",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0252",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0256",
            "",
            "\1\u0257",
            "\1\u0258",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "",
            "\1\u025f",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0263",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0265",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0268",
            "",
            "\1\u0269",
            "",
            "\1\u026b\15\uffff\1\u026a",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u026d",
            "",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "",
            "\1\u0272\7\uffff\1\u0271",
            "\1\u0273",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "",
            "\1\u027a",
            "\1\u027b",
            "",
            "",
            "",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "",
            "",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "",
            "\1\u0283",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\3\66\1\u0284\26"+
            "\66",
            "\1\u0286",
            "",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "",
            "\1\u028b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u028e",
            "\1\u028f",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\4\66\1\u0290\25"+
            "\66",
            "\1\u0292",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0294",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u029f",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "",
            "\1\u02a5",
            "",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02ab\16\uffff\1\u02aa",
            "\1\u02ac",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u02af",
            "",
            "\1\u02b0",
            "\1\u02b1",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02b3",
            "\1\u02b4",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02b7",
            "\1\u02b8",
            "",
            "\1\u02b9",
            "",
            "",
            "",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "",
            "\1\u02bd",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u02c6\20\uffff\1\u02c5",
            "\1\u02c7",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02c9",
            "",
            "\1\u02ca",
            "\1\u02cb",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\24\66\1\u02d2\6\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u02d4",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02d6",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02da",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02dc",
            "\1\u02dd",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02df",
            "\1\u02e0",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02e7",
            "",
            "",
            "\1\u02e8",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\3\66\1\u02e9\26"+
            "\66",
            "\1\u02eb",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02ef",
            "\1\u02f0",
            "",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0301",
            "\1\u0302",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0304",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0306",
            "",
            "\1\u0307",
            "\1\u0308",
            "",
            "",
            "\1\u0309",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u030b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u030f",
            "",
            "\1\u0310",
            "\1\u0311",
            "\1\u0313\16\uffff\1\u0312",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0315",
            "\1\u0316",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0319",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u031b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u031d\11\uffff\1\u031e",
            "",
            "",
            "\1\u031f",
            "",
            "\1\u0320",
            "",
            "\1\u0321",
            "",
            "",
            "",
            "\1\u0322",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0324",
            "",
            "\1\u0325",
            "\1\u0326",
            "",
            "",
            "\1\u0327",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0329",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u032b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u032d",
            "",
            "",
            "",
            "\1\u032e",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\22\66\1\u0330\7"+
            "\66",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "",
            "",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u033e",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0340",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0342",
            "\1\u0343",
            "",
            "\1\u0344",
            "",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0347",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u034b",
            "",
            "",
            "\1\u034c",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\3\66\1\u034e\26"+
            "\66",
            "\1\u0350",
            "\1\u0351",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0354",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0356",
            "\1\u0357",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u035a",
            "",
            "\1\u035b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "",
            "\1\u0369",
            "",
            "\1\u036a",
            "",
            "\1\u036b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u036d",
            "",
            "",
            "\1\u036e",
            "",
            "",
            "",
            "\1\u036f",
            "\1\u0370",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0372",
            "\1\u0373",
            "",
            "",
            "\1\u0374",
            "",
            "\1\u0375",
            "\1\u0376",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0378",
            "",
            "",
            "",
            "\1\u0379",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u037b",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u037d",
            "",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "",
            "\1\u0385",
            "\1\u0386",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0388",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u038e",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0390",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u039a",
            "",
            "\1\u039b",
            "",
            "",
            "",
            "",
            "",
            "\1\u039c",
            "",
            "\1\u039d",
            "",
            "\1\u039e",
            "\1\u039f",
            "\1\u03a0",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "",
            "",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03aa",
            "\1\u03ab",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "",
            "\1\u03b3",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b6",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b8",
            "",
            "",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u03ba",
            "",
            "\1\u03bb",
            "\15\66\6\uffff\33\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__222 | T__223 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | FROM | DBP | GAME | GRAVITY_KW | SCORE | TURNBASED_KW | WORLD_KW | GRIDSIZE_KW | GENERIC | GRID | RIBBON | NAME_KW | TYPE | INSERT_KW | REMOVE_KW | SOLO | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | CLOCKWISE | ANTICLOCKWISE | NEXTURN_KW | RELOAD_KW | GRASPS_KW | EXPELS_KW | INGESTS_KW | DUPLICABLE | FIRST | THIRD | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | PRESSED_KW | HELD_KW | RELEASED_KW | OWNES_KW | NOTOWNES_KW | OWNED_KW | NOTOWNED_KW | HAPPENS | CONTAINS_KW | DISTANCE_KW | ANGLE_KW | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | TIME | VALUE | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | TEXTE | LETTER | FLOAT | IDENT | WS );";
        }
    }
 

}