// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g 2011-02-09 17:22:03

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class hightLexer extends Lexer {
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

    public hightLexer() {;} 
    public hightLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public hightLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g"; }

    // $ANTLR start "GAME_KW"
    public final void mGAME_KW() throws RecognitionException {
        try {
            int _type = GAME_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:7:9: ( 'GAME_KW' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:7:11: 'GAME_KW'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:8:18: ( 'GAME_ATTRIBUT_KW' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:8:20: 'GAME_ATTRIBUT_KW'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:9:12: ( 'INIT_IS_KW' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:9:14: 'INIT_IS_KW'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:10:5: ( 'DEC' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:10:7: 'DEC'
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

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:11:8: ( 'true' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:11:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:12:8: ( 'false' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:12:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:412:13: ( '//' (~ '\\n' )* )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:412:15: '//' (~ '\\n' )*
            {
            match("//"); 

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:412:19: (~ '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:412:20: ~ '\\n'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:414:4: ( ')' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:414:6: ')'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:415:4: ( '(' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:415:6: '('
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:416:5: ( ';' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:416:7: ';'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:417:6: ( ',' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:417:8: ','
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:418:5: ( 'has' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:418:7: 'has'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:419:4: ( 'at' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:419:6: 'at'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:420:4: ( 'is' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:420:6: 'is'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:421:5: ( 'and' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:421:7: 'and'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:422:4: ( 'of' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:422:6: 'of'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:423:6: ( 'with' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:423:8: 'with'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:424:9: ( 'between' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:424:11: 'between'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:425:6: ( '+' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:425:8: '+'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:426:7: ( '-' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:426:9: '-'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:427:5: ( '*' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:427:7: '*'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:428:5: ( '/' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:428:7: '/'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:429:5: ( '^' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:429:7: '^'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:430:5: ( '%' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:430:7: '%'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:431:3: ( 'x' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:431:5: 'x'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:432:3: ( 'y' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:432:5: 'y'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:433:3: ( 'z' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:433:5: 'z'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:434:5: ( 'all' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:434:7: 'all'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:435:5: ( 'not' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:435:7: 'not'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:436:5: ( 'min' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:436:7: 'min'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:437:5: ( 'sec' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:437:7: 'sec'
            {
            match("sec"); 


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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:438:4: ( 'ms' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:438:6: 'ms'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:439:6: ( 'then' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:439:8: 'then'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:440:5: ( 'for' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:440:7: 'for'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:441:8: ( '=' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:441:10: '='
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:442:5: ( '<' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:442:8: '<'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:443:5: ( '>' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:443:8: '>'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:444:7: ( '<=' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:444:9: '<='
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:445:7: ( '>=' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:445:9: '>='
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:446:6: ( '!=' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:446:8: '!='
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

    // $ANTLR start "GAME"
    public final void mGAME() throws RecognitionException {
        try {
            int _type = GAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:448:7: ( 'Game' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:448:9: 'Game'
            {
            match("Game"); 


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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:449:12: ( 'gravity' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:449:14: 'gravity'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:450:8: ( 'score' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:450:10: 'score'
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

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:451:7: ( 'type' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:451:9: 'type'
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

    // $ANTLR start "PLAYER"
    public final void mPLAYER() throws RecognitionException {
        try {
            int _type = PLAYER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:452:9: ( 'player' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:452:11: 'player'
            {
            match("player"); 


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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:453:10: ( 'list' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:453:12: 'list'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:454:5: ( 'in' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:454:7: 'in'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:455:7: ( 'loop' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:455:9: 'loop'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:456:7: ( 'once' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:456:9: 'once'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:457:11: ( 'random' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:457:13: 'random'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:458:15: ( 'definition' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:458:17: 'definition'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:459:8: ( 'means' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:459:10: 'means'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:460:10: ( 'pause' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:460:12: 'pause'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:461:10: ( 'mute' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:461:12: 'mute'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:462:5: ( 'on' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:462:7: 'on'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:463:6: ( 'off' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:463:8: 'off'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:464:10: ( 'play' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:464:12: 'play'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:465:10: ( 'stop' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:465:12: 'stop'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:466:10: ( 'ends' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:466:12: 'ends'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:467:11: ( 'starts' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:467:13: 'starts'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:468:10: ( 'block' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:468:12: 'block'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:469:13: ( 'translation' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:469:15: 'translation'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:470:10: ( 'rotation' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:470:12: 'rotation'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:471:8: ( 'scale' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:471:10: 'scale'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:472:11: ( 'efface' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:472:13: 'efface'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:473:13: ( 'generate' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:473:15: 'generate'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:474:10: ( 'wait' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:474:12: 'wait'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:475:10: ( 'endWait' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:475:12: 'endWait'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:476:10: ( 'save' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:476:12: 'save'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:477:10: ( 'rule' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:477:12: 'rule'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:478:10: ( 'moves' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:478:12: 'moves'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:479:9: ( 'dies' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:479:11: 'dies'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:480:12: ( 'touches' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:480:14: 'touches'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:481:10: ( 'kills' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:481:12: 'kills'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:482:11: ( 'killed' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:482:13: 'killed'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:483:12: ( 'touched' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:483:14: 'touched'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:484:4: ( 'by' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:484:6: 'by'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:485:7: ( 'other' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:485:9: 'other'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:486:9: ( 'becomes' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:486:11: 'becomes'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:487:12: ( 'victory' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:487:14: 'victory'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:488:11: ( 'defeat' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:488:13: 'defeat'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:489:7: ( 'if' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:489:9: 'if'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:490:6: ( 'else' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:490:8: 'else'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:491:7: ( 'endIf' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:491:9: 'endIf'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:492:4: ( 'or' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:492:6: 'or'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:493:6: ( 'comp' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:493:8: 'comp'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:494:9: ( 'dead' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:494:11: 'dead'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:495:10: ( 'alive' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:495:12: 'alive'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:496:12: ( 'effaced' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:496:13: 'effaced'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:497:14: ( 'generated' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:497:16: 'generated'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:498:13: ( 'touching' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:498:15: 'touching'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:499:11: ( 'moving' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:499:13: 'moving'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:500:12: ( 'waiting' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:500:14: 'waiting'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:501:13: ( 'finished' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:501:15: 'finished'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:502:12: ( 'started' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:502:14: 'started'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:503:11: ( 'paused' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:503:13: 'paused'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:504:10: ( 'muted' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:504:12: 'muted'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:505:11: ( 'played' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:505:13: 'played'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:506:12: ( 'stopped' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:506:14: 'stopped'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:507:11: ( 'assign' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:507:13: 'assign'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:508:8: ( 'add' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:508:10: 'add'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:509:8: ( 'sub' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:509:10: 'sub'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:510:11: ( 'invert' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:510:13: 'invert'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:511:7: ( 'num' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:511:9: 'num'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:512:8: ( 'ia' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:512:11: 'ia'
            {
            match("ia"); 


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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:513:8: ( 'during' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:513:10: 'during'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:514:7: ( 'until' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:514:9: 'until'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:515:7: ( 'equip' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:515:9: 'equip'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:516:6: ( 'next' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:516:8: 'next'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:517:10: ( 'previous' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:517:12: 'previous'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:518:10: ( 'keyboard' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:518:12: 'keyboard'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:519:13: ( 'activate' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:519:15: 'activate'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:520:11: ( 'disable' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:520:12: 'disable'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:521:9: ( 'commands' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:521:10: 'commands'
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

    // $ANTLR start "DUPLICABLE"
    public final void mDUPLICABLE() throws RecognitionException {
        try {
            int _type = DUPLICABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:523:12: ( 'duplicable' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:523:14: 'duplicable'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:524:8: ( 'first' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:524:10: 'first'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:525:8: ( 'third' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:525:10: 'third'
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

    // $ANTLR start "ALLY"
    public final void mALLY() throws RecognitionException {
        try {
            int _type = ALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:526:7: ( 'ally' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:526:9: 'ally'
            {
            match("ally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALLY"

    // $ANTLR start "ENEMY"
    public final void mENEMY() throws RecognitionException {
        try {
            int _type = ENEMY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:527:8: ( 'enemy' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:527:10: 'enemy'
            {
            match("enemy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENEMY"

    // $ANTLR start "NEUTRAL"
    public final void mNEUTRAL() throws RecognitionException {
        try {
            int _type = NEUTRAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:528:10: ( 'neutral' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:528:12: 'neutral'
            {
            match("neutral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEUTRAL"

    // $ANTLR start "POSITION"
    public final void mPOSITION() throws RecognitionException {
        try {
            int _type = POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:529:10: ( 'position' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:529:12: 'position'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:530:13: ( 'orientation' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:530:15: 'orientation'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:531:7: ( 'size' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:531:9: 'size'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:532:9: ( 'person' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:532:11: 'person'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:533:7: ( 'free' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:533:9: 'free'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:534:8: ( 'frame' | 'frames' )
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
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:534:10: 'frame'
                    {
                    match("frame"); 


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:534:20: 'frames'
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

    // $ANTLR start "WUP"
    public final void mWUP() throws RecognitionException {
        try {
            int _type = WUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:537:5: ( 'up' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:537:7: 'up'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:538:7: ( 'down' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:538:9: 'down'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:539:6: ( 'left' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:539:8: 'left'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:540:7: ( 'right' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:540:9: 'right'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:541:7: ( 'space' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:541:9: 'space'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:542:8: ( 'escape' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:542:10: 'escape'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:543:7: ( 'enter' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:543:9: 'enter'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:544:7: ( 'mouse' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:544:9: 'mouse'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:545:5: ( 'key' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:545:7: 'key'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:546:12: ( 'lClick' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:546:14: 'lClick'
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

    // $ANTLR start "CLICK_CENTER"
    public final void mCLICK_CENTER() throws RecognitionException {
        try {
            int _type = CLICK_CENTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:547:14: ( 'cClick' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:547:16: 'cClick'
            {
            match("cClick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLICK_CENTER"

    // $ANTLR start "CLICK_RIGHT"
    public final void mCLICK_RIGHT() throws RecognitionException {
        try {
            int _type = CLICK_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:548:13: ( 'rClick' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:548:15: 'rClick'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:549:11: ( 'scrollUp' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:549:13: 'scrollUp'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:550:13: ( 'scrollDown' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:550:15: 'scrollDown'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:552:12: ( 'command' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:552:14: 'command'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:553:6: ( 'jump' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:553:8: 'jump'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:554:6: ( 'move' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:554:8: 'move'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:555:9: ( 'forward' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:555:11: 'forward'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:556:10: ( 'backward' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:556:12: 'backward'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:557:6: ( 'turn' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:557:8: 'turn'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:558:12: ( 'accelerate' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:558:14: 'accelerate'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:559:7: ( 'brake' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:559:9: 'brake'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:562:8: ( 'Camera' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:562:10: 'Camera'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:563:7: ( 'Media' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:563:9: 'Media'
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

    // $ANTLR start "COUNTER"
    public final void mCOUNTER() throws RecognitionException {
        try {
            int _type = COUNTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:564:9: ( 'Counter' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:564:11: 'Counter'
            {
            match("Counter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNTER"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:565:6: ( 'Time' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:565:8: 'Time'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:567:8: ( 'value' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:567:10: 'value'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:569:16: ( 'boostInterval' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:569:18: 'boostInterval'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:570:16: ( 'shootInterval' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:570:18: 'shootInterval'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:571:13: ( 'reloadTime' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:571:15: 'reloadTime'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:573:11: ( 'inventory' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:573:13: 'inventory'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:574:16: ( 'equipedObjects' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:574:18: 'equipedObjects'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:575:11: ( 'entrances' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:575:13: 'entrances'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:576:8: ( 'exits' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:576:10: 'exits'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:577:13: ( 'damageZone' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:577:15: 'damageZone'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:578:12: ( 'collectors' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:578:14: 'collectors'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:579:17: ( 'typesCollectors' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:579:19: 'typesCollectors'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:580:12: ( 'generators' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:580:14: 'generators'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:581:17: ( 'typeGenerators' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:581:19: 'typeGenerators'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:582:10: ( 'breakers' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:582:12: 'breakers'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:583:16: ( 'typesBreakers' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:583:18: 'typesBreakers'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:584:15: ( 'teleportables' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:584:17: 'teleportables'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:586:2: ( 'typesTeleportables' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:586:5: 'typesTeleportables'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:589:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:9: ( '0' .. '9' )+
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
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:10: '0' .. '9'
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

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:21: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:22: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:26: ( '0' .. '9' )+
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
                    	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:590:27: '0' .. '9'
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:591:7: ( LETTER ( LETTER | '0' .. '9' )* )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:591:9: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:591:15: ( LETTER | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:592:5: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:592:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:592:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:
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
        // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:8: ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__195 | T__196 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | GAME | GRAVITY_KW | SCORE | TYPE | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | DUPLICABLE | FIRST | THIRD | ALLY | ENEMY | NEUTRAL | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | COUNTER | TIME | VALUE | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | LETTER | FLOAT | IDENT | WS )
        int alt8=173;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:10: GAME_KW
                {
                mGAME_KW(); 

                }
                break;
            case 2 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:18: GAME_ATTRIBUT_KW
                {
                mGAME_ATTRIBUT_KW(); 

                }
                break;
            case 3 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:35: INIT_IS_KW
                {
                mINIT_IS_KW(); 

                }
                break;
            case 4 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:46: DEC
                {
                mDEC(); 

                }
                break;
            case 5 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:50: T__195
                {
                mT__195(); 

                }
                break;
            case 6 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:57: T__196
                {
                mT__196(); 

                }
                break;
            case 7 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:64: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 8 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:72: PD
                {
                mPD(); 

                }
                break;
            case 9 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:75: PG
                {
                mPG(); 

                }
                break;
            case 10 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:78: FIN
                {
                mFIN(); 

                }
                break;
            case 11 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:82: VIRG
                {
                mVIRG(); 

                }
                break;
            case 12 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:87: HAS
                {
                mHAS(); 

                }
                break;
            case 13 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:91: AT
                {
                mAT(); 

                }
                break;
            case 14 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:94: IS
                {
                mIS(); 

                }
                break;
            case 15 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:97: AND
                {
                mAND(); 

                }
                break;
            case 16 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:101: OF
                {
                mOF(); 

                }
                break;
            case 17 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:104: WITH
                {
                mWITH(); 

                }
                break;
            case 18 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:109: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 19 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:117: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:122: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:128: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:132: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:136: POW
                {
                mPOW(); 

                }
                break;
            case 24 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:140: MOD
                {
                mMOD(); 

                }
                break;
            case 25 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:144: X
                {
                mX(); 

                }
                break;
            case 26 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:146: Y
                {
                mY(); 

                }
                break;
            case 27 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:148: Z
                {
                mZ(); 

                }
                break;
            case 28 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:150: ALL
                {
                mALL(); 

                }
                break;
            case 29 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:154: NOT
                {
                mNOT(); 

                }
                break;
            case 30 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:158: MIN
                {
                mMIN(); 

                }
                break;
            case 31 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:162: SEC
                {
                mSEC(); 

                }
                break;
            case 32 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:166: MS
                {
                mMS(); 

                }
                break;
            case 33 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:169: THEN
                {
                mTHEN(); 

                }
                break;
            case 34 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:174: FOR
                {
                mFOR(); 

                }
                break;
            case 35 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:178: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 36 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:185: INF
                {
                mINF(); 

                }
                break;
            case 37 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:189: SUP
                {
                mSUP(); 

                }
                break;
            case 38 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:193: INFEG
                {
                mINFEG(); 

                }
                break;
            case 39 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:199: SUPED
                {
                mSUPED(); 

                }
                break;
            case 40 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:205: DIFF
                {
                mDIFF(); 

                }
                break;
            case 41 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:210: GAME
                {
                mGAME(); 

                }
                break;
            case 42 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:215: GRAVITY_KW
                {
                mGRAVITY_KW(); 

                }
                break;
            case 43 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:226: SCORE
                {
                mSCORE(); 

                }
                break;
            case 44 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:232: TYPE
                {
                mTYPE(); 

                }
                break;
            case 45 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:237: PLAYER
                {
                mPLAYER(); 

                }
                break;
            case 46 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:244: LIST_KW
                {
                mLIST_KW(); 

                }
                break;
            case 47 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:252: IN
                {
                mIN(); 

                }
                break;
            case 48 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:255: LOOP
                {
                mLOOP(); 

                }
                break;
            case 49 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:260: ONCE
                {
                mONCE(); 

                }
                break;
            case 50 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:265: RANDOM_KW
                {
                mRANDOM_KW(); 

                }
                break;
            case 51 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:275: DEFINITION_KW
                {
                mDEFINITION_KW(); 

                }
                break;
            case 52 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:289: MEANS
                {
                mMEANS(); 

                }
                break;
            case 53 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:295: PAUSE_KW
                {
                mPAUSE_KW(); 

                }
                break;
            case 54 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:304: MUTE_KW
                {
                mMUTE_KW(); 

                }
                break;
            case 55 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:312: ON
                {
                mON(); 

                }
                break;
            case 56 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:315: OFF
                {
                mOFF(); 

                }
                break;
            case 57 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:319: PLAY_KW
                {
                mPLAY_KW(); 

                }
                break;
            case 58 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:327: STOP_KW
                {
                mSTOP_KW(); 

                }
                break;
            case 59 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:335: ENDS_KW
                {
                mENDS_KW(); 

                }
                break;
            case 60 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:343: STARTS_KW
                {
                mSTARTS_KW(); 

                }
                break;
            case 61 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:353: BLOCK_KW
                {
                mBLOCK_KW(); 

                }
                break;
            case 62 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:362: TRANSLATION
                {
                mTRANSLATION(); 

                }
                break;
            case 63 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:374: ROTATION
                {
                mROTATION(); 

                }
                break;
            case 64 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:383: SCALE
                {
                mSCALE(); 

                }
                break;
            case 65 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:389: EFFACE_KW
                {
                mEFFACE_KW(); 

                }
                break;
            case 66 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:399: GENERATE_KW
                {
                mGENERATE_KW(); 

                }
                break;
            case 67 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:411: WAIT_KW
                {
                mWAIT_KW(); 

                }
                break;
            case 68 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:419: ENDWAIT
                {
                mENDWAIT(); 

                }
                break;
            case 69 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:427: SAVE_KW
                {
                mSAVE_KW(); 

                }
                break;
            case 70 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:435: RULE_KW
                {
                mRULE_KW(); 

                }
                break;
            case 71 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:443: MOVES_KW
                {
                mMOVES_KW(); 

                }
                break;
            case 72 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:452: DIES_KW
                {
                mDIES_KW(); 

                }
                break;
            case 73 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:460: TOUCHES_KW
                {
                mTOUCHES_KW(); 

                }
                break;
            case 74 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:471: KILLS_KW
                {
                mKILLS_KW(); 

                }
                break;
            case 75 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:480: KILLED_KW
                {
                mKILLED_KW(); 

                }
                break;
            case 76 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:490: TOUCHED_KW
                {
                mTOUCHED_KW(); 

                }
                break;
            case 77 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:501: BY
                {
                mBY(); 

                }
                break;
            case 78 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:504: OTHER
                {
                mOTHER(); 

                }
                break;
            case 79 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:510: BECOMES
                {
                mBECOMES(); 

                }
                break;
            case 80 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:518: VICTORY_KW
                {
                mVICTORY_KW(); 

                }
                break;
            case 81 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:529: DEFEAT_KW
                {
                mDEFEAT_KW(); 

                }
                break;
            case 82 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:539: IF_KW
                {
                mIF_KW(); 

                }
                break;
            case 83 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:545: ELSE
                {
                mELSE(); 

                }
                break;
            case 84 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:550: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 85 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:556: OR
                {
                mOR(); 

                }
                break;
            case 86 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:559: COMP
                {
                mCOMP(); 

                }
                break;
            case 87 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:564: DEAD_KW
                {
                mDEAD_KW(); 

                }
                break;
            case 88 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:572: ALIVE_KW
                {
                mALIVE_KW(); 

                }
                break;
            case 89 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:581: EFFACED_KW
                {
                mEFFACED_KW(); 

                }
                break;
            case 90 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:592: GENERATED_KW
                {
                mGENERATED_KW(); 

                }
                break;
            case 91 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:605: TOUCHING_KW
                {
                mTOUCHING_KW(); 

                }
                break;
            case 92 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:617: MOVING_KW
                {
                mMOVING_KW(); 

                }
                break;
            case 93 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:627: WAITING_KW
                {
                mWAITING_KW(); 

                }
                break;
            case 94 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:638: FINISHED_KW
                {
                mFINISHED_KW(); 

                }
                break;
            case 95 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:650: STARTED_KW
                {
                mSTARTED_KW(); 

                }
                break;
            case 96 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:661: PAUSED_KW
                {
                mPAUSED_KW(); 

                }
                break;
            case 97 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:671: MUTED_KW
                {
                mMUTED_KW(); 

                }
                break;
            case 98 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:680: PLAYED_KW
                {
                mPLAYED_KW(); 

                }
                break;
            case 99 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:690: STOPPED_KW
                {
                mSTOPPED_KW(); 

                }
                break;
            case 100 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:701: ASSIGN_KW
                {
                mASSIGN_KW(); 

                }
                break;
            case 101 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:711: ADD_KW
                {
                mADD_KW(); 

                }
                break;
            case 102 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:718: SUB_KW
                {
                mSUB_KW(); 

                }
                break;
            case 103 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:725: INVERT_KW
                {
                mINVERT_KW(); 

                }
                break;
            case 104 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:735: NUM
                {
                mNUM(); 

                }
                break;
            case 105 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:739: IA_KW
                {
                mIA_KW(); 

                }
                break;
            case 106 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:745: DURING
                {
                mDURING(); 

                }
                break;
            case 107 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:752: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 108 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:758: EQUIP
                {
                mEQUIP(); 

                }
                break;
            case 109 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:764: NEXT
                {
                mNEXT(); 

                }
                break;
            case 110 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:769: PREVIOUS
                {
                mPREVIOUS(); 

                }
                break;
            case 111 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:778: KEYBOARD
                {
                mKEYBOARD(); 

                }
                break;
            case 112 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:787: ACTIVATE_KW
                {
                mACTIVATE_KW(); 

                }
                break;
            case 113 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:799: DISABLE_KW
                {
                mDISABLE_KW(); 

                }
                break;
            case 114 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:810: COMMANDS
                {
                mCOMMANDS(); 

                }
                break;
            case 115 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:819: DUPLICABLE
                {
                mDUPLICABLE(); 

                }
                break;
            case 116 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:830: FIRST
                {
                mFIRST(); 

                }
                break;
            case 117 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:836: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 118 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:842: ALLY
                {
                mALLY(); 

                }
                break;
            case 119 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:847: ENEMY
                {
                mENEMY(); 

                }
                break;
            case 120 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:853: NEUTRAL
                {
                mNEUTRAL(); 

                }
                break;
            case 121 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:861: POSITION
                {
                mPOSITION(); 

                }
                break;
            case 122 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:870: ORIENTATION
                {
                mORIENTATION(); 

                }
                break;
            case 123 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:882: SIZE
                {
                mSIZE(); 

                }
                break;
            case 124 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:887: PERSON
                {
                mPERSON(); 

                }
                break;
            case 125 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:894: FREE
                {
                mFREE(); 

                }
                break;
            case 126 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:899: FRAME
                {
                mFRAME(); 

                }
                break;
            case 127 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:905: WUP
                {
                mWUP(); 

                }
                break;
            case 128 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:909: WDOWN
                {
                mWDOWN(); 

                }
                break;
            case 129 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:915: LEFT
                {
                mLEFT(); 

                }
                break;
            case 130 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:920: RIGHT
                {
                mRIGHT(); 

                }
                break;
            case 131 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:926: SPACE
                {
                mSPACE(); 

                }
                break;
            case 132 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:932: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 133 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:939: ENTER
                {
                mENTER(); 

                }
                break;
            case 134 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:945: MOUSE
                {
                mMOUSE(); 

                }
                break;
            case 135 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:951: KEY
                {
                mKEY(); 

                }
                break;
            case 136 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:955: CLICK_LEFT
                {
                mCLICK_LEFT(); 

                }
                break;
            case 137 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:966: CLICK_CENTER
                {
                mCLICK_CENTER(); 

                }
                break;
            case 138 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:979: CLICK_RIGHT
                {
                mCLICK_RIGHT(); 

                }
                break;
            case 139 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:991: SCROLL_UP
                {
                mSCROLL_UP(); 

                }
                break;
            case 140 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1001: SCROLL_DOWN
                {
                mSCROLL_DOWN(); 

                }
                break;
            case 141 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1013: COMMAND_KW
                {
                mCOMMAND_KW(); 

                }
                break;
            case 142 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1024: JUMP
                {
                mJUMP(); 

                }
                break;
            case 143 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1029: MOVE
                {
                mMOVE(); 

                }
                break;
            case 144 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1034: FORWARD
                {
                mFORWARD(); 

                }
                break;
            case 145 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1042: BACKWARD
                {
                mBACKWARD(); 

                }
                break;
            case 146 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1051: TURN
                {
                mTURN(); 

                }
                break;
            case 147 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1056: ACCELERATE
                {
                mACCELERATE(); 

                }
                break;
            case 148 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1067: BRAKE
                {
                mBRAKE(); 

                }
                break;
            case 149 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1073: CAMERA
                {
                mCAMERA(); 

                }
                break;
            case 150 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1080: MEDIA
                {
                mMEDIA(); 

                }
                break;
            case 151 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1086: COUNTER
                {
                mCOUNTER(); 

                }
                break;
            case 152 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1094: TIME
                {
                mTIME(); 

                }
                break;
            case 153 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1099: VALUE
                {
                mVALUE(); 

                }
                break;
            case 154 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1105: BOOST_INTERVAL
                {
                mBOOST_INTERVAL(); 

                }
                break;
            case 155 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1120: SHOOT_INTERVAL
                {
                mSHOOT_INTERVAL(); 

                }
                break;
            case 156 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1135: RELOAD_TIME
                {
                mRELOAD_TIME(); 

                }
                break;
            case 157 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1147: INVENTORY
                {
                mINVENTORY(); 

                }
                break;
            case 158 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1157: EQUIPED_OBJECT
                {
                mEQUIPED_OBJECT(); 

                }
                break;
            case 159 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1172: ENTRANCES
                {
                mENTRANCES(); 

                }
                break;
            case 160 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1182: EXITS
                {
                mEXITS(); 

                }
                break;
            case 161 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1188: DAMAGE_ZONE
                {
                mDAMAGE_ZONE(); 

                }
                break;
            case 162 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1200: COLLECTORS
                {
                mCOLLECTORS(); 

                }
                break;
            case 163 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1211: TYPES_COLLECTORS
                {
                mTYPES_COLLECTORS(); 

                }
                break;
            case 164 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1228: GENERATORS
                {
                mGENERATORS(); 

                }
                break;
            case 165 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1239: TYPE_GENERATORS
                {
                mTYPE_GENERATORS(); 

                }
                break;
            case 166 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1255: BREAKERS
                {
                mBREAKERS(); 

                }
                break;
            case 167 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1264: TYPES_BREAKERS
                {
                mTYPES_BREAKERS(); 

                }
                break;
            case 168 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1279: TELEPORTABLES
                {
                mTELEPORTABLES(); 

                }
                break;
            case 169 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1293: TYPES_TELEPORTABLES
                {
                mTYPES_TELEPORTABLES(); 

                }
                break;
            case 170 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1313: LETTER
                {
                mLETTER(); 

                }
                break;
            case 171 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1320: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 172 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1326: IDENT
                {
                mIDENT(); 

                }
                break;
            case 173 :
                // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hight.g:1:1332: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\5\63\1\102\4\uffff\6\63\5\uffff\1\132\1\133\1\134\3\63"+
        "\1\uffff\1\156\1\160\1\uffff\17\63\2\uffff\2\64\2\uffff\14\64\2"+
        "\uffff\1\64\1\u00ad\5\64\1\u00b5\1\u00b7\1\u00b8\1\u00b9\1\u00bb"+
        "\1\u00bd\1\64\1\u00c0\4\64\1\u00c6\3\64\3\uffff\4\64\1\u00d0\13"+
        "\64\4\uffff\43\64\1\u0109\10\64\1\u0112\11\64\1\u011d\4\64\1\u0122"+
        "\1\uffff\1\u0123\1\u0125\2\64\1\u0128\2\64\1\uffff\1\64\3\uffff"+
        "\1\u012c\1\uffff\1\64\1\uffff\2\64\1\uffff\5\64\1\uffff\4\64\1\u0139"+
        "\1\u013a\2\64\1\u013d\1\uffff\4\64\1\u0143\6\64\1\u014a\45\64\1"+
        "\u0175\6\64\1\uffff\6\64\1\u0183\1\64\1\uffff\1\u0185\1\64\1\u0187"+
        "\1\64\1\u018b\1\64\1\u018d\3\64\1\uffff\2\64\1\u0193\1\64\2\uffff"+
        "\1\u0195\1\uffff\2\64\1\uffff\3\64\1\uffff\1\u019c\2\64\1\u019f"+
        "\1\u01a1\7\64\2\uffff\1\u01a9\1\64\1\uffff\1\64\1\u01ad\1\u01af"+
        "\2\64\1\uffff\3\64\1\u01b6\1\64\1\u01b8\1\uffff\1\u01b9\4\64\1\u01bf"+
        "\4\64\1\u01c4\1\u01c5\1\u01c6\3\64\1\u01ca\5\64\1\u01d0\1\u01d1"+
        "\3\64\1\u01d5\1\64\1\u01d7\6\64\1\u01de\5\64\1\uffff\2\64\1\u01e7"+
        "\4\64\1\u01ec\3\64\1\u01f0\4\uffff\1\64\1\uffff\1\u01f4\2\64\1\uffff"+
        "\1\64\1\uffff\1\64\1\u01fc\2\64\1\u01ff\1\uffff\1\u0201\1\uffff"+
        "\1\u0202\5\64\1\uffff\1\u0208\1\64\1\uffff\1\64\1\uffff\2\64\1\u020d"+
        "\1\64\1\u020f\2\64\1\uffff\1\64\1\u0213\1\u0214\1\uffff\1\u0215"+
        "\1\uffff\1\64\1\u0217\1\u0218\1\u0219\2\64\1\uffff\1\64\2\uffff"+
        "\1\u021e\4\64\1\uffff\1\u0225\3\64\3\uffff\3\64\1\uffff\1\u022c"+
        "\4\64\2\uffff\3\64\1\uffff\1\64\1\uffff\1\64\1\u0236\1\u0237\1\u0238"+
        "\2\64\1\uffff\1\u023c\1\64\1\u023e\1\u023f\3\64\1\u0243\1\uffff"+
        "\3\64\1\u0247\1\uffff\2\64\1\u024a\3\uffff\1\64\1\uffff\7\64\1\uffff"+
        "\2\64\1\uffff\1\u0201\2\uffff\1\u0256\2\64\1\u0259\1\64\1\uffff"+
        "\4\64\1\uffff\1\64\1\uffff\3\64\3\uffff\1\u0263\3\uffff\2\64\1\u0267"+
        "\1\64\1\uffff\3\64\1\u026c\1\u026d\1\u026e\1\uffff\2\64\1\u0271"+
        "\1\u0272\1\u0273\1\64\1\uffff\1\u0275\2\64\1\u0278\1\64\1\u027a"+
        "\3\64\3\uffff\1\64\1\u0280\1\64\1\uffff\1\u0282\2\uffff\1\u0283"+
        "\2\64\1\uffff\2\64\1\u0288\1\uffff\1\u0289\1\64\1\uffff\5\64\1\u0290"+
        "\1\u0291\2\64\1\u0294\1\64\1\uffff\2\64\1\uffff\2\64\1\u029a\1\u029b"+
        "\1\u029c\3\64\1\u02a0\1\uffff\2\64\1\u02a3\1\uffff\1\u02a4\1\64"+
        "\1\u02a6\1\64\3\uffff\2\64\3\uffff\1\64\1\uffff\2\64\1\uffff\1\u02ae"+
        "\1\uffff\2\64\1\u02b1\1\64\1\u02b3\1\uffff\1\64\2\uffff\1\64\1\u02b6"+
        "\1\u02b8\1\64\2\uffff\1\u02ba\5\64\2\uffff\1\u02c0\1\64\1\uffff"+
        "\1\u02c2\1\u02c3\3\64\3\uffff\1\u02c7\1\u02c8\1\64\1\uffff\1\u02ca"+
        "\1\64\2\uffff\1\64\1\uffff\1\u02ce\1\64\1\u02d0\1\u02d1\1\u02d2"+
        "\2\64\1\uffff\2\64\1\uffff\1\64\1\uffff\1\64\1\u02d9\1\uffff\1\u02da"+
        "\1\uffff\1\64\1\uffff\5\64\1\uffff\1\64\2\uffff\1\64\1\u02e3\1\64"+
        "\2\uffff\1\64\1\uffff\2\64\1\u02e8\1\uffff\1\64\3\uffff\4\64\1\u02ee"+
        "\1\64\2\uffff\7\64\1\u02f7\1\uffff\2\64\1\u02fa\1\64\1\uffff\1\u02fc"+
        "\1\u02fd\1\u02fe\1\u02ff\1\u0300\1\uffff\1\64\1\u0302\1\u0303\5"+
        "\64\1\uffff\1\u0309\1\64\1\uffff\1\64\5\uffff\1\64\2\uffff\5\64"+
        "\1\uffff\4\64\1\u0316\2\64\1\u0319\1\u031a\1\u031b\2\64\1\uffff"+
        "\1\64\1\u031f\3\uffff\1\u0320\1\u0321\1\64\3\uffff\2\64\1\u0325"+
        "\1\uffff";
    static final String DFA8_eofS =
        "\u0326\uffff";
    static final String DFA8_minS =
        "\1\11\5\60\1\57\4\uffff\6\60\5\uffff\6\60\1\uffff\2\75\1\uffff\17"+
        "\60\2\uffff\1\115\1\155\2\uffff\1\111\1\103\1\141\1\145\1\160\1"+
        "\165\1\162\2\154\1\162\1\156\1\141\2\uffff\1\163\1\60\1\144\1\151"+
        "\1\163\1\144\1\143\6\60\1\150\1\60\1\164\1\151\1\143\1\157\1\60"+
        "\1\143\1\141\1\157\3\uffff\1\164\1\155\1\165\1\156\1\60\1\141\1"+
        "\164\1\165\1\143\2\141\1\166\1\142\1\172\1\141\1\157\4\uffff\1\141"+
        "\1\156\1\141\1\165\1\145\1\163\1\162\1\163\1\157\1\146\1\154\1\156"+
        "\1\164\1\154\1\147\2\154\1\141\1\145\1\160\1\167\1\155\1\144\1\146"+
        "\1\163\1\165\1\143\1\151\1\154\1\171\1\143\3\154\1\164\1\60\2\155"+
        "\1\165\1\144\1\155\1\105\1\145\1\124\1\60\1\145\2\156\1\162\1\145"+
        "\1\143\1\156\1\145\1\163\1\60\1\151\1\163\1\145\1\155\1\60\1\uffff"+
        "\2\60\1\166\1\151\1\60\1\151\1\145\1\uffff\1\145\3\uffff\1\60\1"+
        "\uffff\1\145\1\uffff\2\145\1\uffff\1\150\1\164\1\167\1\157\1\143"+
        "\1\uffff\2\153\1\141\1\163\2\60\2\164\1\60\1\uffff\1\156\2\145\1"+
        "\163\1\60\1\162\1\154\1\157\1\160\1\162\1\145\1\60\1\145\1\143\1"+
        "\157\1\166\1\145\1\171\1\163\1\166\1\151\1\163\1\164\1\160\1\164"+
        "\1\151\1\144\1\141\1\145\1\150\1\151\1\157\1\145\1\144\1\163\1\141"+
        "\1\151\1\154\1\156\1\141\1\111\1\155\1\145\1\141\1\145\1\151\1\141"+
        "\1\164\1\154\1\60\1\164\1\165\1\155\1\154\2\151\1\uffff\1\160\1"+
        "\145\1\156\1\151\1\145\1\137\1\60\1\137\1\uffff\1\60\1\163\1\60"+
        "\1\144\1\60\1\150\1\60\1\160\1\145\1\141\1\uffff\1\163\1\164\1\60"+
        "\1\145\2\uffff\1\60\1\uffff\1\145\1\147\1\uffff\1\166\1\154\1\156"+
        "\1\uffff\1\60\1\162\1\156\2\60\1\145\1\155\1\153\1\167\1\145\1\153"+
        "\1\164\2\uffff\1\60\1\162\1\uffff\1\163\2\60\1\156\1\145\1\uffff"+
        "\2\145\1\154\1\60\1\164\1\60\1\uffff\1\60\1\145\1\164\1\151\1\162"+
        "\1\60\1\145\1\151\1\164\1\157\3\60\1\143\1\157\1\164\1\60\1\164"+
        "\1\143\1\141\1\156\1\141\2\60\1\142\1\156\1\151\1\60\1\147\1\60"+
        "\1\141\1\146\1\171\1\162\1\141\1\143\1\60\2\160\1\163\1\145\1\157"+
        "\1\uffff\1\157\1\145\1\60\1\141\1\145\1\143\1\154\1\60\1\162\1\164"+
        "\1\141\1\60\1\101\3\uffff\1\154\1\uffff\1\60\1\102\1\145\1\uffff"+
        "\1\145\1\uffff\1\157\1\60\1\162\1\150\1\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\156\1\141\1\145\2\164\1\uffff\1\60\1\164\1\uffff\1\156\1"+
        "\uffff\2\145\1\60\1\141\1\60\1\145\1\111\1\uffff\1\141\2\60\1\uffff"+
        "\1\60\1\uffff\1\147\3\60\1\154\1\145\1\uffff\1\145\2\uffff\1\60"+
        "\1\111\1\164\1\141\1\144\1\uffff\1\60\1\157\1\151\1\156\3\uffff"+
        "\1\153\1\155\1\151\1\uffff\1\60\1\153\1\144\1\151\1\164\2\uffff"+
        "\1\154\1\147\1\143\1\uffff\1\145\1\uffff\1\151\3\60\1\156\1\145"+
        "\1\uffff\1\60\1\145\2\60\1\144\1\141\1\162\1\60\1\uffff\1\156\1"+
        "\143\1\153\1\60\1\uffff\1\141\1\145\1\60\3\uffff\1\141\1\uffff\1"+
        "\157\1\162\1\145\1\156\1\144\1\156\1\162\1\uffff\1\144\1\145\1\uffff"+
        "\1\60\2\uffff\1\60\1\164\1\162\1\60\1\157\1\uffff\1\141\1\147\1"+
        "\156\1\163\1\uffff\1\162\1\uffff\1\162\1\156\1\154\3\uffff\1\60"+
        "\3\uffff\1\104\1\144\1\60\1\144\1\uffff\1\156\1\171\1\164\3\60\1"+
        "\uffff\1\165\1\157\3\60\1\157\1\uffff\1\60\1\124\1\164\1\60\1\145"+
        "\1\60\1\141\1\132\1\164\3\uffff\1\143\1\60\1\144\1\uffff\1\60\2"+
        "\uffff\1\60\1\162\1\171\1\uffff\1\144\1\164\1\60\1\uffff\1\60\1"+
        "\162\1\uffff\1\164\1\154\1\145\1\154\1\145\2\60\1\147\1\164\1\60"+
        "\1\144\1\uffff\1\145\1\141\1\uffff\1\162\1\164\3\60\1\144\1\163"+
        "\1\164\1\60\1\uffff\1\160\1\157\1\60\1\uffff\1\60\1\164\1\60\1\145"+
        "\3\uffff\1\163\1\156\3\uffff\1\156\1\uffff\2\151\1\uffff\1\60\1"+
        "\uffff\1\142\1\157\1\60\1\145\1\60\1\uffff\1\117\2\uffff\1\144\2"+
        "\60\1\157\2\uffff\1\60\1\151\1\154\1\141\1\145\1\162\2\uffff\1\60"+
        "\1\141\1\uffff\2\60\1\164\1\171\1\151\3\uffff\2\60\1\145\1\uffff"+
        "\1\60\1\167\2\uffff\1\145\1\uffff\1\60\1\162\3\60\1\155\1\157\1"+
        "\uffff\1\154\1\156\1\uffff\1\163\1\uffff\1\142\1\60\1\uffff\1\60"+
        "\1\uffff\1\162\1\uffff\1\157\1\145\1\153\1\160\1\141\1\uffff\1\142"+
        "\2\uffff\1\145\1\60\1\157\2\uffff\1\162\1\uffff\1\156\1\162\1\60"+
        "\1\uffff\1\163\3\uffff\1\145\1\156\2\145\1\60\1\152\2\uffff\1\163"+
        "\1\156\1\143\1\145\1\157\1\164\1\154\1\60\1\uffff\1\156\1\166\1"+
        "\60\1\166\1\uffff\5\60\1\uffff\1\145\2\60\1\164\2\162\1\157\1\145"+
        "\1\uffff\1\60\1\141\1\uffff\1\141\5\uffff\1\143\2\uffff\1\157\1"+
        "\163\1\164\1\162\1\163\1\uffff\2\154\1\164\1\162\1\60\1\141\1\163"+
        "\3\60\2\163\1\uffff\1\142\1\60\3\uffff\2\60\1\154\3\uffff\1\145"+
        "\1\163\1\60\1\uffff";
    static final String DFA8_maxS =
        "\6\172\1\57\4\uffff\6\172\5\uffff\6\172\1\uffff\2\75\1\uffff\17"+
        "\172\2\uffff\1\115\1\155\2\uffff\1\111\1\103\1\165\1\151\1\160\1"+
        "\165\1\162\2\154\2\162\1\145\2\uffff\1\163\1\172\1\144\1\154\1\163"+
        "\1\144\1\164\6\172\1\150\1\172\1\164\1\151\1\164\1\157\1\172\1\143"+
        "\1\145\1\157\3\uffff\1\164\1\155\1\170\1\156\1\172\1\141\1\164\1"+
        "\166\1\143\1\162\1\157\1\166\1\142\1\172\1\141\1\157\4\uffff\1\141"+
        "\1\156\1\141\1\165\1\145\1\163\1\162\1\163\1\157\1\146\1\154\1\156"+
        "\1\164\1\154\1\147\2\154\1\146\1\163\1\162\1\167\1\155\1\164\1\146"+
        "\1\163\1\165\1\143\1\151\1\154\1\171\1\143\1\154\1\155\1\154\1\164"+
        "\1\172\2\155\1\165\1\144\1\155\1\105\1\145\1\124\1\172\1\145\2\156"+
        "\1\162\1\145\1\143\1\156\1\145\1\163\1\172\1\151\1\163\1\145\1\155"+
        "\1\172\1\uffff\2\172\1\166\1\151\1\172\1\151\1\145\1\uffff\1\145"+
        "\3\uffff\1\172\1\uffff\1\145\1\uffff\2\145\1\uffff\1\150\1\164\1"+
        "\167\1\157\1\143\1\uffff\2\153\1\141\1\163\2\172\2\164\1\172\1\uffff"+
        "\1\156\1\145\1\151\1\163\1\172\1\162\1\154\1\157\1\160\1\162\1\145"+
        "\1\172\1\145\1\143\1\157\1\166\1\145\1\171\1\163\1\166\1\151\1\163"+
        "\1\164\1\160\1\164\1\151\1\144\1\141\1\145\1\150\1\151\1\157\1\151"+
        "\1\144\1\163\1\141\1\151\1\154\1\156\1\141\1\163\1\155\1\162\1\141"+
        "\1\145\1\151\1\141\1\164\1\154\1\172\1\164\1\165\1\160\1\154\2\151"+
        "\1\uffff\1\160\1\145\1\156\1\151\1\145\1\137\1\172\1\137\1\uffff"+
        "\1\172\1\163\1\172\1\144\1\172\1\150\1\172\1\160\1\145\1\141\1\uffff"+
        "\1\163\1\164\1\172\1\145\2\uffff\1\172\1\uffff\1\145\1\147\1\uffff"+
        "\1\166\1\154\1\162\1\uffff\1\172\1\162\1\156\2\172\1\145\1\155\1"+
        "\153\1\167\1\145\1\153\1\164\2\uffff\1\172\1\162\1\uffff\1\163\2"+
        "\172\1\156\1\145\1\uffff\2\145\1\154\1\172\1\164\1\172\1\uffff\1"+
        "\172\1\145\1\164\1\151\1\162\1\172\1\145\1\151\1\164\1\157\3\172"+
        "\1\143\1\157\1\164\1\172\1\164\1\143\1\141\1\156\1\141\2\172\1\142"+
        "\1\156\1\151\1\172\1\147\1\172\1\141\1\146\1\171\1\162\1\141\1\143"+
        "\1\172\2\160\2\163\1\157\1\uffff\1\157\1\145\1\172\1\141\1\145\1"+
        "\143\1\154\1\172\1\162\1\164\1\141\1\172\1\113\3\uffff\1\154\1\uffff"+
        "\1\172\1\124\1\145\1\uffff\1\151\1\uffff\1\157\1\172\1\162\1\150"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\156\1\141\1\145\2\164\1\uffff"+
        "\1\172\1\164\1\uffff\1\156\1\uffff\2\145\1\172\1\141\1\172\1\145"+
        "\1\111\1\uffff\1\141\2\172\1\uffff\1\172\1\uffff\1\147\3\172\1\154"+
        "\1\145\1\uffff\1\163\2\uffff\1\172\1\111\1\164\1\141\1\162\1\uffff"+
        "\1\172\1\157\1\151\1\156\3\uffff\1\153\1\155\1\151\1\uffff\1\172"+
        "\1\153\1\144\1\151\1\164\2\uffff\1\154\1\147\1\143\1\uffff\1\145"+
        "\1\uffff\1\151\3\172\1\156\1\145\1\uffff\1\172\1\145\2\172\1\144"+
        "\1\141\1\162\1\172\1\uffff\1\156\1\143\1\153\1\172\1\uffff\1\141"+
        "\1\145\1\172\3\uffff\1\141\1\uffff\1\157\1\162\1\145\1\156\1\163"+
        "\1\156\1\162\1\uffff\1\144\1\145\1\uffff\1\172\2\uffff\1\172\1\164"+
        "\1\162\1\172\1\157\1\uffff\1\141\1\147\1\156\1\163\1\uffff\1\162"+
        "\1\uffff\1\162\1\156\1\154\3\uffff\1\172\3\uffff\1\125\1\144\1\172"+
        "\1\144\1\uffff\1\156\1\171\1\164\3\172\1\uffff\1\165\1\157\3\172"+
        "\1\157\1\uffff\1\172\1\124\1\164\1\172\1\145\1\172\1\141\1\132\1"+
        "\164\3\uffff\1\143\1\172\1\144\1\uffff\1\172\2\uffff\1\172\1\162"+
        "\1\171\1\uffff\1\144\1\164\1\172\1\uffff\1\172\1\162\1\uffff\1\164"+
        "\1\154\1\145\1\154\1\145\2\172\1\147\1\164\1\172\1\144\1\uffff\1"+
        "\145\1\141\1\uffff\1\162\1\164\3\172\1\144\1\163\1\164\1\172\1\uffff"+
        "\1\160\1\157\1\172\1\uffff\1\172\1\164\1\172\1\157\3\uffff\1\163"+
        "\1\156\3\uffff\1\156\1\uffff\2\151\1\uffff\1\172\1\uffff\1\142\1"+
        "\157\1\172\1\145\1\172\1\uffff\1\117\2\uffff\1\144\2\172\1\157\2"+
        "\uffff\1\172\1\151\1\154\1\141\1\145\1\162\2\uffff\1\172\1\141\1"+
        "\uffff\2\172\1\164\1\171\1\151\3\uffff\2\172\1\145\1\uffff\1\172"+
        "\1\167\2\uffff\1\145\1\uffff\1\172\1\162\3\172\1\155\1\157\1\uffff"+
        "\1\154\1\156\1\uffff\1\163\1\uffff\1\142\1\172\1\uffff\1\172\1\uffff"+
        "\1\162\1\uffff\1\157\1\145\1\153\1\160\1\141\1\uffff\1\142\2\uffff"+
        "\1\145\1\172\1\157\2\uffff\1\162\1\uffff\1\156\1\162\1\172\1\uffff"+
        "\1\163\3\uffff\1\145\1\156\2\145\1\172\1\152\2\uffff\1\163\1\156"+
        "\1\143\1\145\1\157\1\164\1\154\1\172\1\uffff\1\156\1\166\1\172\1"+
        "\166\1\uffff\5\172\1\uffff\1\145\2\172\1\164\2\162\1\157\1\145\1"+
        "\uffff\1\172\1\141\1\uffff\1\141\5\uffff\1\143\2\uffff\1\157\1\163"+
        "\1\164\1\162\1\163\1\uffff\2\154\1\164\1\162\1\172\1\141\1\163\3"+
        "\172\2\163\1\uffff\1\142\1\172\3\uffff\2\172\1\154\3\uffff\1\145"+
        "\1\163\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\10\1\11\1\12\1\13\6\uffff\1\23\1\24\1\25\1\27\1\30\6"+
        "\uffff\1\43\2\uffff\1\50\17\uffff\1\u00ab\1\u00ad\2\uffff\1\u00aa"+
        "\1\u00ac\14\uffff\1\7\1\26\27\uffff\1\31\1\32\1\33\20\uffff\1\46"+
        "\1\44\1\47\1\45\74\uffff\1\15\7\uffff\1\16\1\uffff\1\57\1\122\1"+
        "\151\1\uffff\1\20\1\uffff\1\67\2\uffff\1\125\5\uffff\1\115\11\uffff"+
        "\1\40\70\uffff\1\177\10\uffff\1\4\12\uffff\1\42\4\uffff\1\14\1\17"+
        "\1\uffff\1\34\2\uffff\1\145\3\uffff\1\70\14\uffff\1\35\1\150\2\uffff"+
        "\1\36\5\uffff\1\37\6\uffff\1\146\52\uffff\1\u0087\15\uffff\1\51"+
        "\1\3\1\5\1\uffff\1\41\3\uffff\1\54\1\uffff\1\u0092\5\uffff\1\175"+
        "\1\uffff\1\166\6\uffff\1\61\2\uffff\1\21\1\uffff\1\103\7\uffff\1"+
        "\155\3\uffff\1\66\1\uffff\1\u008f\6\uffff\1\72\1\uffff\1\105\1\173"+
        "\5\uffff\1\71\4\uffff\1\56\1\60\1\u0081\3\uffff\1\106\5\uffff\1"+
        "\127\1\110\3\uffff\1\u0080\1\uffff\1\73\6\uffff\1\123\10\uffff\1"+
        "\126\4\uffff\1\u008e\3\uffff\1\u0098\1\1\1\2\1\uffff\1\165\7\uffff"+
        "\1\6\2\uffff\1\164\1\uffff\1\176\1\130\5\uffff\1\116\4\uffff\1\75"+
        "\1\uffff\1\u0094\3\uffff\1\64\1\141\1\107\1\uffff\1\u0086\1\53\1"+
        "\100\4\uffff\1\u0083\6\uffff\1\65\6\uffff\1\u0082\11\uffff\1\124"+
        "\1\167\1\u0085\3\uffff\1\154\1\uffff\1\u00a0\1\112\3\uffff\1\u0099"+
        "\3\uffff\1\153\2\uffff\1\u0096\13\uffff\1\144\2\uffff\1\147\11\uffff"+
        "\1\134\3\uffff\1\74\4\uffff\1\55\1\142\1\140\2\uffff\1\174\1\u0088"+
        "\1\62\1\uffff\1\u008a\2\uffff\1\121\1\uffff\1\152\5\uffff\1\101"+
        "\1\uffff\1\u0084\1\113\4\uffff\1\u0089\1\u0095\6\uffff\1\111\1\114"+
        "\2\uffff\1\u0090\5\uffff\1\135\1\22\1\117\3\uffff\1\170\2\uffff"+
        "\1\143\1\137\1\uffff\1\52\7\uffff\1\161\2\uffff\1\104\1\uffff\1"+
        "\131\2\uffff\1\120\1\uffff\1\u008d\1\uffff\1\u0097\5\uffff\1\133"+
        "\1\uffff\1\136\1\160\3\uffff\1\u0091\1\u00a6\1\uffff\1\u008b\3\uffff"+
        "\1\102\1\uffff\1\156\1\171\1\77\6\uffff\1\157\1\162\10\uffff\1\u009d"+
        "\4\uffff\1\132\5\uffff\1\u009f\10\uffff\1\u0093\2\uffff\1\u008c"+
        "\1\uffff\1\u00a4\1\u009c\1\63\1\163\1\u00a1\1\uffff\1\u00a2\1\76"+
        "\5\uffff\1\172\14\uffff\1\u00a7\2\uffff\1\u00a8\1\u009a\1\u009b"+
        "\3\uffff\1\u00a5\1\u009e\1\u00a3\3\uffff\1\u00a9";
    static final String DFA8_specialS =
        "\u0326\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\60\1\uffff\2\60\22\uffff\1\60\1\37\3\uffff\1\25\2\uffff\1"+
            "\10\1\7\1\23\1\21\1\12\1\22\1\uffff\1\6\12\57\1\uffff\1\11\1"+
            "\35\1\34\1\36\2\uffff\2\56\1\53\1\3\2\56\1\1\1\56\1\2\3\56\1"+
            "\54\6\56\1\55\6\56\3\uffff\1\24\2\uffff\1\14\1\20\1\50\1\44"+
            "\1\45\1\5\1\40\1\13\1\15\1\52\1\46\1\42\1\32\1\31\1\16\1\41"+
            "\1\56\1\43\1\33\1\4\1\51\1\47\1\17\1\26\1\27\1\30",
            "\12\64\7\uffff\1\61\31\64\6\uffff\1\62\31\64",
            "\12\64\7\uffff\15\64\1\65\14\64\6\uffff\32\64",
            "\12\64\7\uffff\4\64\1\66\25\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\74\2\64\1\70\6\64\1\72"+
            "\2\64\1\67\2\64\1\73\3\64\1\71\1\64",
            "\12\64\7\uffff\32\64\6\uffff\1\75\7\64\1\77\5\64\1\76\2\64"+
            "\1\100\10\64",
            "\1\101",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\1\103\31\64",
            "\12\64\7\uffff\32\64\6\uffff\2\64\1\111\1\110\7\64\1\106\1"+
            "\64\1\105\4\64\1\107\1\104\6\64",
            "\12\64\7\uffff\32\64\6\uffff\1\115\4\64\1\114\7\64\1\113\4"+
            "\64\1\112\7\64",
            "\12\64\7\uffff\32\64\6\uffff\5\64\1\116\7\64\1\117\3\64\1\121"+
            "\1\64\1\120\6\64",
            "\12\64\7\uffff\32\64\6\uffff\1\123\7\64\1\122\21\64",
            "\12\64\7\uffff\32\64\6\uffff\1\127\3\64\1\124\6\64\1\125\2"+
            "\64\1\131\2\64\1\130\6\64\1\126\1\64",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\137\11\64\1\135\5\64\1"+
            "\136\5\64",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\142\3\64\1\140\5\64\1\144"+
            "\3\64\1\141\1\64\1\143\5\64",
            "\12\64\7\uffff\32\64\6\uffff\1\150\1\64\1\146\1\64\1\145\2"+
            "\64\1\154\1\152\6\64\1\153\3\64\1\147\1\151\5\64",
            "",
            "\1\155",
            "\1\157",
            "",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\162\14\64\1\161\10\64",
            "\12\64\7\uffff\32\64\6\uffff\1\164\3\64\1\167\6\64\1\163\2"+
            "\64\1\166\2\64\1\165\10\64",
            "\12\64\7\uffff\2\64\1\173\27\64\6\uffff\4\64\1\172\3\64\1\170"+
            "\5\64\1\171\13\64",
            "\12\64\7\uffff\2\64\1\u0080\27\64\6\uffff\1\174\3\64\1\u0081"+
            "\3\64\1\177\5\64\1\175\5\64\1\176\5\64",
            "\12\64\7\uffff\32\64\6\uffff\1\u0086\3\64\1\u0082\3\64\1\u0083"+
            "\5\64\1\u0085\5\64\1\u0084\5\64",
            "\12\64\7\uffff\32\64\6\uffff\5\64\1\u0088\5\64\1\u0089\1\64"+
            "\1\u0087\2\64\1\u008a\1\64\1\u008b\4\64\1\u008c\2\64",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\u008e\3\64\1\u008d\21\64",
            "\12\64\7\uffff\32\64\6\uffff\1\u0090\7\64\1\u008f\21\64",
            "\12\64\7\uffff\2\64\1\u0092\27\64\6\uffff\16\64\1\u0091\13"+
            "\64",
            "\12\64\7\uffff\32\64\6\uffff\15\64\1\u0093\1\64\1\u0094\12"+
            "\64",
            "\12\64\7\uffff\32\64\6\uffff\24\64\1\u0095\5\64",
            "\12\64\7\uffff\32\64\6\uffff\1\u0096\15\64\1\u0097\13\64",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\u0098\25\64",
            "\12\64\7\uffff\32\64\6\uffff\10\64\1\u0099\21\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009f\23\uffff\1\u009e",
            "\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\3\uffff\1\u00a9",
            "\1\u00ab\3\uffff\1\u00aa",
            "",
            "",
            "\1\u00ac",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u00ae",
            "\1\u00b0\2\uffff\1\u00af",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\20\uffff\1\u00b3",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\25\64\1\u00b6\4\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\5\64\1\u00ba\24\64",
            "\12\64\7\uffff\32\64\6\uffff\2\64\1\u00bc\27\64",
            "\1\u00be",
            "\12\64\7\uffff\32\64\6\uffff\10\64\1\u00bf\21\64",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c4\20\uffff\1\u00c3",
            "\1\u00c5",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u00c7",
            "\1\u00c8\3\uffff\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00ce\2\uffff\1\u00cd",
            "\1\u00cf",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d4\1\u00d3",
            "\1\u00d5",
            "\1\u00d7\15\uffff\1\u00d6\2\uffff\1\u00d8",
            "\1\u00da\15\uffff\1\u00d9",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f2\4\uffff\1\u00f1",
            "\1\u00f3\15\uffff\1\u00f4",
            "\1\u00f6\1\uffff\1\u00f5",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9\1\u00fa\16\uffff\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0106\1\u0105",
            "\1\u0107",
            "\1\u0108",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\64\7\uffff\32\64\6\uffff\26\64\1\u011c\3\64",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\30\64\1\u0124\1\64",
            "\1\u0126",
            "\1\u0127",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u013b",
            "\1\u013c",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140\3\uffff\1\u0141",
            "\1\u0142",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u0160\3\uffff\1\u015f",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u016a\15\uffff\1\u0169\33\uffff\1\u0168",
            "\1\u016b",
            "\1\u016c\14\uffff\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\12\64\7\uffff\32\64\6\uffff\1\64\1\u0174\30\64",
            "\1\u0176",
            "\1\u0177",
            "\1\u0179\2\uffff\1\u0178",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0184",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0186",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0188",
            "\12\64\7\uffff\6\64\1\u018a\23\64\6\uffff\22\64\1\u0189\7\64",
            "\1\u018c",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "",
            "\1\u0191",
            "\1\u0192",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0194",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "\1\u019b\3\uffff\1\u019a",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u019d",
            "\1\u019e",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\10\64\1\u01a0\21\64",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\12\64\7\uffff\32\64\6\uffff\3\64\1\u01ac\26\64",
            "\12\64\7\uffff\32\64\6\uffff\22\64\1\u01ae\7\64",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\12\64\7\uffff\32\64\6\uffff\17\64\1\u01b5\12\64",
            "\1\u01b7",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\u01be\25\64",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01d6",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e3\15\uffff\1\u01e2",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01f2\11\uffff\1\u01f1",
            "",
            "",
            "",
            "\1\u01f3",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01f6\1\u01f5\20\uffff\1\u01f7",
            "\1\u01f8",
            "",
            "\1\u01f9\3\uffff\1\u01fa",
            "",
            "\1\u01fb",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u01fd",
            "\1\u01fe",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\22\64\1\u0200\7\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0209",
            "",
            "\1\u020a",
            "",
            "\1\u020b",
            "\1\u020c",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u020e",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0210",
            "\1\u0211",
            "",
            "\1\u0212",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u0216",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u021a",
            "\1\u021b",
            "",
            "\1\u021d\15\uffff\1\u021c",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0223\15\uffff\1\u0222",
            "",
            "\12\64\7\uffff\32\64\6\uffff\3\64\1\u0224\26\64",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "",
            "",
            "",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "",
            "",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "",
            "\1\u0235",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0239",
            "\1\u023a",
            "",
            "\12\64\7\uffff\32\64\6\uffff\4\64\1\u023b\25\64",
            "\1\u023d",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u0248",
            "\1\u0249",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "",
            "",
            "\1\u024b",
            "",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0251\16\uffff\1\u0250",
            "\1\u0252",
            "\1\u0253",
            "",
            "\1\u0254",
            "\1\u0255",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0257",
            "\1\u0258",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u025a",
            "",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "",
            "\1\u025f",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "",
            "",
            "\1\u0265\20\uffff\1\u0264",
            "\1\u0266",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0268",
            "",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u026f",
            "\1\u0270",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0274",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0276",
            "\1\u0277",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0279",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "",
            "",
            "",
            "\1\u027e",
            "\12\64\7\uffff\32\64\6\uffff\3\64\1\u027f\26\64",
            "\1\u0281",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0284",
            "\1\u0285",
            "",
            "\1\u0286",
            "\1\u0287",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u028a",
            "",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0292",
            "\1\u0293",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0295",
            "",
            "\1\u0296",
            "\1\u0297",
            "",
            "\1\u0298",
            "\1\u0299",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u02a1",
            "\1\u02a2",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02a5",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02a7\11\uffff\1\u02a8",
            "",
            "",
            "",
            "\1\u02a9",
            "\1\u02aa",
            "",
            "",
            "",
            "\1\u02ab",
            "",
            "\1\u02ac",
            "\1\u02ad",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02b2",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u02b4",
            "",
            "",
            "\1\u02b5",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\22\64\1\u02b7\7\64",
            "\1\u02b9",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02c1",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02c9",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02cb",
            "",
            "",
            "\1\u02cc",
            "",
            "\12\64\7\uffff\32\64\6\uffff\3\64\1\u02cd\26\64",
            "\1\u02cf",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02d3",
            "\1\u02d4",
            "",
            "\1\u02d5",
            "\1\u02d6",
            "",
            "\1\u02d7",
            "",
            "\1\u02d8",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u02db",
            "",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "",
            "\1\u02e1",
            "",
            "",
            "\1\u02e2",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02e4",
            "",
            "",
            "\1\u02e5",
            "",
            "\1\u02e6",
            "\1\u02e7",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u02e9",
            "",
            "",
            "",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02ef",
            "",
            "",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u02f8",
            "\1\u02f9",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u02fb",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\u0301",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u030a",
            "",
            "\1\u030b",
            "",
            "",
            "",
            "",
            "",
            "\1\u030c",
            "",
            "",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0317",
            "\1\u0318",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u031c",
            "\1\u031d",
            "",
            "\1\u031e",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
            "\1\u0322",
            "",
            "",
            "",
            "\1\u0323",
            "\1\u0324",
            "\12\64\7\uffff\32\64\6\uffff\32\64",
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
            return "1:1: Tokens : ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__195 | T__196 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | GAME | GRAVITY_KW | SCORE | TYPE | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | DUPLICABLE | FIRST | THIRD | ALLY | ENEMY | NEUTRAL | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | COUNTER | TIME | VALUE | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | LETTER | FLOAT | IDENT | WS );";
        }
    }
 

}