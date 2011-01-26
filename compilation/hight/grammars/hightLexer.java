// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g 2011-01-26 20:03:01

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class hightLexer extends Lexer {
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

    public hightLexer() {;} 
    public hightLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public hightLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g"; }

    // $ANTLR start "GAME_KW"
    public final void mGAME_KW() throws RecognitionException {
        try {
            int _type = GAME_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:7:9: ( 'GAME_KW' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:7:11: 'GAME_KW'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:8:18: ( 'GAME_ATTRIBUT_KW' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:8:20: 'GAME_ATTRIBUT_KW'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:9:12: ( 'INIT_IS_KW' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:9:14: 'INIT_IS_KW'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:10:5: ( 'DEC' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:10:7: 'DEC'
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

    // $ANTLR start "T__251"
    public final void mT__251() throws RecognitionException {
        try {
            int _type = T__251;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:11:8: ( 'true' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:11:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__251"

    // $ANTLR start "T__252"
    public final void mT__252() throws RecognitionException {
        try {
            int _type = T__252;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:12:8: ( 'false' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:12:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__252"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:485:13: ( '//' (~ '\\n' )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:485:15: '//' (~ '\\n' )*
            {
            match("//"); 

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:485:19: (~ '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:485:20: ~ '\\n'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:487:4: ( ')' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:487:6: ')'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:488:4: ( '(' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:488:6: '('
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:489:5: ( ';' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:489:7: ';'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:490:6: ( ',' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:490:8: ','
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:491:5: ( 'has' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:491:7: 'has'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:492:4: ( 'at' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:492:6: 'at'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:493:4: ( 'is' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:493:6: 'is'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:494:5: ( 'and' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:494:7: 'and'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:495:4: ( 'of' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:495:6: 'of'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:496:6: ( 'with' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:496:8: 'with'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:497:9: ( 'between' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:497:11: 'between'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:498:6: ( '+' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:498:8: '+'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:499:7: ( '-' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:499:9: '-'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:500:5: ( '*' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:500:7: '*'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:501:5: ( '/' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:501:7: '/'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:502:5: ( '^' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:502:7: '^'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:503:5: ( '%' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:503:7: '%'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:504:3: ( 'x' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:504:5: 'x'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:505:3: ( 'y' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:505:5: 'y'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:506:3: ( 'z' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:506:5: 'z'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:507:5: ( 'all' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:507:7: 'all'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:508:5: ( 'not' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:508:7: 'not'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:509:5: ( 'min' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:509:7: 'min'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:510:5: ( 'sec' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:510:7: 'sec'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:511:4: ( 'ms' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:511:6: 'ms'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:512:6: ( 'then' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:512:8: 'then'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:513:5: ( 'for' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:513:7: 'for'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:514:8: ( '=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:514:10: '='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:515:5: ( '<' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:515:8: '<'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:516:5: ( '>' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:516:8: '>'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:517:7: ( '<=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:517:9: '<='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:518:7: ( '>=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:518:9: '>='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:519:6: ( '!=' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:519:8: '!='
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:521:7: ( 'Game' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:521:9: 'Game'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:522:12: ( 'gravity' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:522:14: 'gravity'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:523:8: ( 'score' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:523:10: 'score'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:524:7: ( 'type' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:524:9: 'type'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:525:9: ( 'player' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:525:11: 'player'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:526:10: ( 'list' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:526:12: 'list'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:527:5: ( 'in' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:527:7: 'in'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:528:7: ( 'loop' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:528:9: 'loop'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:529:7: ( 'once' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:529:9: 'once'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:530:11: ( 'random' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:530:13: 'random'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:531:15: ( 'definition' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:531:17: 'definition'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:532:8: ( 'means' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:532:10: 'means'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:533:10: ( 'pause' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:533:12: 'pause'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:534:10: ( 'mute' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:534:12: 'mute'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:535:5: ( 'on' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:535:7: 'on'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:536:6: ( 'off' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:536:8: 'off'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:537:10: ( 'play' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:537:12: 'play'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:538:10: ( 'stop' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:538:12: 'stop'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:539:10: ( 'ends' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:539:12: 'ends'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:540:11: ( 'starts' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:540:13: 'starts'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:541:10: ( 'block' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:541:12: 'block'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:542:13: ( 'translation' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:542:15: 'translation'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:543:10: ( 'rotation' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:543:12: 'rotation'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:544:8: ( 'scale' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:544:10: 'scale'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:545:11: ( 'efface' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:545:13: 'efface'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:546:13: ( 'generate' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:546:15: 'generate'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:547:10: ( 'wait' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:547:12: 'wait'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:548:10: ( 'endWait' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:548:12: 'endWait'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:549:10: ( 'save' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:549:12: 'save'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:550:10: ( 'rule' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:550:12: 'rule'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:551:10: ( 'moves' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:551:12: 'moves'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:552:9: ( 'dies' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:552:11: 'dies'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:553:12: ( 'touches' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:553:14: 'touches'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:554:10: ( 'kills' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:554:12: 'kills'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:555:11: ( 'killed' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:555:13: 'killed'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:556:12: ( 'touched' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:556:14: 'touched'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:557:4: ( 'by' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:557:6: 'by'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:558:7: ( 'other' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:558:9: 'other'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:559:9: ( 'becomes' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:559:11: 'becomes'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:560:12: ( 'victory' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:560:14: 'victory'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:561:11: ( 'defeat' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:561:13: 'defeat'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:562:7: ( 'if' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:562:9: 'if'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:563:6: ( 'else' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:563:8: 'else'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:564:7: ( 'endIf' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:564:9: 'endIf'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:565:4: ( 'or' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:565:6: 'or'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:566:6: ( 'comp' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:566:8: 'comp'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:567:9: ( 'dead' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:567:11: 'dead'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:568:10: ( 'alive' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:568:12: 'alive'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:569:12: ( 'effaced' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:569:13: 'effaced'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:570:14: ( 'generated' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:570:16: 'generated'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:571:13: ( 'touching' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:571:15: 'touching'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:572:11: ( 'moving' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:572:13: 'moving'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:573:12: ( 'waiting' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:573:14: 'waiting'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:574:13: ( 'finished' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:574:15: 'finished'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:575:12: ( 'started' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:575:14: 'started'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:576:11: ( 'paused' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:576:13: 'paused'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:577:10: ( 'muted' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:577:12: 'muted'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:578:11: ( 'played' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:578:13: 'played'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:579:12: ( 'stopped' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:579:14: 'stopped'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:580:11: ( 'assign' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:580:13: 'assign'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:581:8: ( 'add' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:581:10: 'add'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:582:8: ( 'sub' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:582:10: 'sub'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:583:11: ( 'invert' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:583:13: 'invert'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:584:7: ( 'num' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:584:9: 'num'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:585:8: ( 'ia' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:585:11: 'ia'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:586:8: ( 'during' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:586:10: 'during'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:587:7: ( 'until' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:587:9: 'until'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:588:7: ( 'equip' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:588:9: 'equip'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:589:6: ( 'next' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:589:8: 'next'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:590:10: ( 'previous' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:590:12: 'previous'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:591:10: ( 'keyboard' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:591:12: 'keyboard'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:592:13: ( 'activate' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:592:15: 'activate'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:593:11: ( 'disable' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:593:12: 'disable'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:594:9: ( 'commands' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:594:10: 'commands'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:596:12: ( 'duplicable' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:596:14: 'duplicable'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:597:8: ( 'first' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:597:10: 'first'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:598:8: ( 'third' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:598:10: 'third'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:599:7: ( 'ally' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:599:9: 'ally'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:600:8: ( 'enemy' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:600:10: 'enemy'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:601:10: ( 'neutral' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:601:12: 'neutral'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:602:10: ( 'position' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:602:12: 'position'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:603:13: ( 'orientation' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:603:15: 'orientation'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:604:7: ( 'size' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:604:9: 'size'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:605:9: ( 'person' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:605:11: 'person'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:606:7: ( 'free' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:606:9: 'free'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:607:8: ( 'frame' | 'frames' )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:607:10: 'frame'
                    {
                    match("frame"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:607:20: 'frames'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:610:5: ( 'up' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:610:7: 'up'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:611:7: ( 'down' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:611:9: 'down'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:612:6: ( 'left' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:612:8: 'left'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:613:7: ( 'right' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:613:9: 'right'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:614:7: ( 'space' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:614:9: 'space'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:615:8: ( 'escape' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:615:10: 'escape'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:616:7: ( 'enter' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:616:9: 'enter'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:617:7: ( 'mouse' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:617:9: 'mouse'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:618:5: ( 'key' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:618:7: 'key'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:619:12: ( 'lClick' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:619:14: 'lClick'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:620:14: ( 'cClick' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:620:16: 'cClick'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:621:13: ( 'rClick' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:621:15: 'rClick'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:622:11: ( 'scrollUp' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:622:13: 'scrollUp'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:623:13: ( 'scrollDown' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:623:15: 'scrollDown'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:625:12: ( 'command' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:625:14: 'command'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:626:6: ( 'jump' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:626:8: 'jump'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:627:6: ( 'move' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:627:8: 'move'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:628:9: ( 'forward' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:628:11: 'forward'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:629:10: ( 'backward' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:629:12: 'backward'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:630:6: ( 'turn' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:630:8: 'turn'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:631:12: ( 'accelerate' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:631:14: 'accelerate'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:632:7: ( 'brake' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:632:9: 'brake'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:635:8: ( 'Camera' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:635:10: 'Camera'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:636:7: ( 'Media' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:636:9: 'Media'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:637:9: ( 'Counter' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:637:11: 'Counter'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:638:6: ( 'Time' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:638:8: 'Time'
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

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:640:9: ( 'Object' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:640:11: 'Object'
            {
            match("Object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:641:11: ( 'Character' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:641:13: 'Character'
            {
            match("Character"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "VEHICLE"
    public final void mVEHICLE() throws RecognitionException {
        try {
            int _type = VEHICLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:642:10: ( 'Vehicle' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:642:12: 'Vehicle'
            {
            match("Vehicle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VEHICLE"

    // $ANTLR start "PLANE"
    public final void mPLANE() throws RecognitionException {
        try {
            int _type = PLANE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:643:8: ( 'Plane' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:643:10: 'Plane'
            {
            match("Plane"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLANE"

    // $ANTLR start "SPACECRAFT"
    public final void mSPACECRAFT() throws RecognitionException {
        try {
            int _type = SPACECRAFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:644:12: ( 'SpaceCraft' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:644:14: 'SpaceCraft'
            {
            match("SpaceCraft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACECRAFT"

    // $ANTLR start "OBSTACLE"
    public final void mOBSTACLE() throws RecognitionException {
        try {
            int _type = OBSTACLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:645:10: ( 'Obstacle' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:645:12: 'Obstacle'
            {
            match("Obstacle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBSTACLE"

    // $ANTLR start "WEAPON"
    public final void mWEAPON() throws RecognitionException {
        try {
            int _type = WEAPON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:646:9: ( 'Weapon' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:646:11: 'Weapon'
            {
            match("Weapon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEAPON"

    // $ANTLR start "SWORD"
    public final void mSWORD() throws RecognitionException {
        try {
            int _type = SWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:647:8: ( 'Sword' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:647:10: 'Sword'
            {
            match("Sword"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SWORD"

    // $ANTLR start "PROJECTILE"
    public final void mPROJECTILE() throws RecognitionException {
        try {
            int _type = PROJECTILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:648:12: ( 'Projectile' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:648:14: 'Projectile'
            {
            match("Projectile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROJECTILE"

    // $ANTLR start "ZONE"
    public final void mZONE() throws RecognitionException {
        try {
            int _type = ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:649:7: ( 'Zone' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:649:9: 'Zone'
            {
            match("Zone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZONE"

    // $ANTLR start "GROUND"
    public final void mGROUND() throws RecognitionException {
        try {
            int _type = GROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:650:9: ( 'Ground' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:650:11: 'Ground'
            {
            match("Ground"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUND"

    // $ANTLR start "BONUS"
    public final void mBONUS() throws RecognitionException {
        try {
            int _type = BONUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:651:8: ( 'Bonus' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:651:10: 'Bonus'
            {
            match("Bonus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BONUS"

    // $ANTLR start "CHECKPOINT"
    public final void mCHECKPOINT() throws RecognitionException {
        try {
            int _type = CHECKPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:652:12: ( 'CheckPoint' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:652:14: 'CheckPoint'
            {
            match("CheckPoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHECKPOINT"

    // $ANTLR start "BREAKABLE"
    public final void mBREAKABLE() throws RecognitionException {
        try {
            int _type = BREAKABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:653:11: ( 'Breakable' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:653:13: 'Breakable'
            {
            match("Breakable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAKABLE"

    // $ANTLR start "CONSTRUCTION"
    public final void mCONSTRUCTION() throws RecognitionException {
        try {
            int _type = CONSTRUCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:654:14: ( 'Construction' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:654:16: 'Construction'
            {
            match("Construction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRUCTION"

    // $ANTLR start "ROOM"
    public final void mROOM() throws RecognitionException {
        try {
            int _type = ROOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:655:7: ( 'Room' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:655:9: 'Room'
            {
            match("Room"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROOM"

    // $ANTLR start "BALL"
    public final void mBALL() throws RecognitionException {
        try {
            int _type = BALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:656:7: ( 'Ball' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:656:9: 'Ball'
            {
            match("Ball"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BALL"

    // $ANTLR start "TELEPORTER"
    public final void mTELEPORTER() throws RecognitionException {
        try {
            int _type = TELEPORTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:657:12: ( 'Teleporter' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:657:14: 'Teleporter'
            {
            match("Teleporter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TELEPORTER"

    // $ANTLR start "MASS"
    public final void mMASS() throws RecognitionException {
        try {
            int _type = MASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:660:7: ( 'mass' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:660:9: 'mass'
            {
            match("mass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MASS"

    // $ANTLR start "IS_FIX"
    public final void mIS_FIX() throws RecognitionException {
        try {
            int _type = IS_FIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:661:9: ( 'isFix' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:661:11: 'isFix'
            {
            match("isFix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS_FIX"

    // $ANTLR start "IS_TRAVERSABLE"
    public final void mIS_TRAVERSABLE() throws RecognitionException {
        try {
            int _type = IS_TRAVERSABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:662:16: ( 'isTraversable' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:662:18: 'isTraversable'
            {
            match("isTraversable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS_TRAVERSABLE"

    // $ANTLR start "FOV"
    public final void mFOV() throws RecognitionException {
        try {
            int _type = FOV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:663:6: ( 'fov' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:663:8: 'fov'
            {
            match("fov"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOV"

    // $ANTLR start "ACTIVE"
    public final void mACTIVE() throws RecognitionException {
        try {
            int _type = ACTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:664:9: ( 'active' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:664:11: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTIVE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:665:7: ( 'name' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:665:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "DESCRIPTION"
    public final void mDESCRIPTION() throws RecognitionException {
        try {
            int _type = DESCRIPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:666:13: ( 'description' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:666:15: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIPTION"

    // $ANTLR start "LIFE"
    public final void mLIFE() throws RecognitionException {
        try {
            int _type = LIFE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:667:7: ( 'life' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:667:9: 'life'
            {
            match("life"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIFE"

    // $ANTLR start "LIFE_MAX"
    public final void mLIFE_MAX() throws RecognitionException {
        try {
            int _type = LIFE_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:668:10: ( 'lifeMax' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:668:12: 'lifeMax'
            {
            match("lifeMax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIFE_MAX"

    // $ANTLR start "LIFE_MIN"
    public final void mLIFE_MIN() throws RecognitionException {
        try {
            int _type = LIFE_MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:669:10: ( 'lifeMin' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:669:12: 'lifeMin'
            {
            match("lifeMin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIFE_MIN"

    // $ANTLR start "NB_LIVES"
    public final void mNB_LIVES() throws RecognitionException {
        try {
            int _type = NB_LIVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:670:10: ( 'nbOfLives' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:670:12: 'nbOfLives'
            {
            match("nbOfLives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NB_LIVES"

    // $ANTLR start "MAGIC"
    public final void mMAGIC() throws RecognitionException {
        try {
            int _type = MAGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:671:8: ( 'magic' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:671:10: 'magic'
            {
            match("magic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAGIC"

    // $ANTLR start "MAGIC_MAX"
    public final void mMAGIC_MAX() throws RecognitionException {
        try {
            int _type = MAGIC_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:672:11: ( 'magicMax' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:672:13: 'magicMax'
            {
            match("magicMax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAGIC_MAX"

    // $ANTLR start "MAGIC_MIN"
    public final void mMAGIC_MIN() throws RecognitionException {
        try {
            int _type = MAGIC_MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:673:11: ( 'magicMin' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:673:13: 'magicMin'
            {
            match("magicMin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAGIC_MIN"

    // $ANTLR start "LEVEL"
    public final void mLEVEL() throws RecognitionException {
        try {
            int _type = LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:674:8: ( 'level' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:674:10: 'level'
            {
            match("level"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEVEL"

    // $ANTLR start "ATTACK"
    public final void mATTACK() throws RecognitionException {
        try {
            int _type = ATTACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:675:9: ( 'attack' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:675:11: 'attack'
            {
            match("attack"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTACK"

    // $ANTLR start "DEFENSE"
    public final void mDEFENSE() throws RecognitionException {
        try {
            int _type = DEFENSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:676:10: ( 'defense' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:676:12: 'defense'
            {
            match("defense"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFENSE"

    // $ANTLR start "JUMP_FORCE"
    public final void mJUMP_FORCE() throws RecognitionException {
        try {
            int _type = JUMP_FORCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:677:12: ( 'jumpForce' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:677:14: 'jumpForce'
            {
            match("jumpForce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUMP_FORCE"

    // $ANTLR start "JUMP_AIR_MAX"
    public final void mJUMP_AIR_MAX() throws RecognitionException {
        try {
            int _type = JUMP_AIR_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:678:14: ( 'maxJumpsInTheAir' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:678:16: 'maxJumpsInTheAir'
            {
            match("maxJumpsInTheAir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUMP_AIR_MAX"

    // $ANTLR start "MONEY"
    public final void mMONEY() throws RecognitionException {
        try {
            int _type = MONEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:679:8: ( 'money' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:679:10: 'money'
            {
            match("money"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONEY"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:680:8: ( 'class' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:680:10: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "RACE"
    public final void mRACE() throws RecognitionException {
        try {
            int _type = RACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:681:7: ( 'race' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:681:9: 'race'
            {
            match("race"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RACE"

    // $ANTLR start "ACCELERATION"
    public final void mACCELERATION() throws RecognitionException {
        try {
            int _type = ACCELERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:682:14: ( 'acceleration' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:682:16: 'acceleration'
            {
            match("acceleration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCELERATION"

    // $ANTLR start "SPEED"
    public final void mSPEED() throws RecognitionException {
        try {
            int _type = SPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:683:8: ( 'speed' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:683:10: 'speed'
            {
            match("speed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPEED"

    // $ANTLR start "SPEED_MAX"
    public final void mSPEED_MAX() throws RecognitionException {
        try {
            int _type = SPEED_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:684:11: ( 'maxSpeed' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:684:13: 'maxSpeed'
            {
            match("maxSpeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPEED_MAX"

    // $ANTLR start "SPEED_MIN"
    public final void mSPEED_MIN() throws RecognitionException {
        try {
            int _type = SPEED_MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:685:11: ( 'minSpeed' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:685:13: 'minSpeed'
            {
            match("minSpeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPEED_MIN"

    // $ANTLR start "BOOST"
    public final void mBOOST() throws RecognitionException {
        try {
            int _type = BOOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:686:8: ( 'boost' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:686:10: 'boost'
            {
            match("boost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOST"

    // $ANTLR start "BOOST_MAX"
    public final void mBOOST_MAX() throws RecognitionException {
        try {
            int _type = BOOST_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:687:11: ( 'maxBoost' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:687:13: 'maxBoost'
            {
            match("maxBoost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOST_MAX"

    // $ANTLR start "NB_MUNITIONS"
    public final void mNB_MUNITIONS() throws RecognitionException {
        try {
            int _type = NB_MUNITIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:688:14: ( 'nbMunitions' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:688:16: 'nbMunitions'
            {
            match("nbMunitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NB_MUNITIONS"

    // $ANTLR start "NB_MUNITIONS_MAX"
    public final void mNB_MUNITIONS_MAX() throws RecognitionException {
        try {
            int _type = NB_MUNITIONS_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:689:17: ( 'nbMunitionsMax' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:689:19: 'nbMunitionsMax'
            {
            match("nbMunitionsMax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NB_MUNITIONS_MAX"

    // $ANTLR start "SHOOT_POWER"
    public final void mSHOOT_POWER() throws RecognitionException {
        try {
            int _type = SHOOT_POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:690:13: ( 'shootPower' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:690:15: 'shootPower'
            {
            match("shootPower"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHOOT_POWER"

    // $ANTLR start "DAMAGES"
    public final void mDAMAGES() throws RecognitionException {
        try {
            int _type = DAMAGES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:691:10: ( 'damages' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:691:12: 'damages'
            {
            match("damages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAMAGES"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:692:8: ( 'value' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:692:10: 'value'
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

    // $ANTLR start "UNIT"
    public final void mUNIT() throws RecognitionException {
        try {
            int _type = UNIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:693:7: ( 'unit' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:693:9: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIT"

    // $ANTLR start "OBJECT_NAME"
    public final void mOBJECT_NAME() throws RecognitionException {
        try {
            int _type = OBJECT_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:694:13: ( 'objectname' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:694:15: 'objectname'
            {
            match("objectname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT_NAME"

    // $ANTLR start "ATTRIBUT_NAME"
    public final void mATTRIBUT_NAME() throws RecognitionException {
        try {
            int _type = ATTRIBUT_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:695:15: ( 'attributName' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:695:17: 'attributName'
            {
            match("attributName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTRIBUT_NAME"

    // $ANTLR start "VOLUME"
    public final void mVOLUME() throws RecognitionException {
        try {
            int _type = VOLUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:696:9: ( 'volume' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:696:11: 'volume'
            {
            match("volume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOLUME"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:697:9: ( 'number' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:697:11: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "MOVE_WITH_CAMERA"
    public final void mMOVE_WITH_CAMERA() throws RecognitionException {
        try {
            int _type = MOVE_WITH_CAMERA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:698:17: ( 'moveWithCamera' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:698:19: 'moveWithCamera'
            {
            match("moveWithCamera"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVE_WITH_CAMERA"

    // $ANTLR start "BOOST_INTERVAL"
    public final void mBOOST_INTERVAL() throws RecognitionException {
        try {
            int _type = BOOST_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:700:16: ( 'boostInterval' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:700:18: 'boostInterval'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:701:16: ( 'shootInterval' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:701:18: 'shootInterval'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:702:13: ( 'reloadTime' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:702:15: 'reloadTime'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:704:11: ( 'inventory' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:704:13: 'inventory'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:705:16: ( 'equipedObjects' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:705:18: 'equipedObjects'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:706:11: ( 'entrances' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:706:13: 'entrances'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:707:8: ( 'exits' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:707:10: 'exits'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:708:13: ( 'damageZone' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:708:15: 'damageZone'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:709:12: ( 'collectors' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:709:14: 'collectors'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:710:17: ( 'typesCollectors' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:710:19: 'typesCollectors'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:711:12: ( 'generators' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:711:14: 'generators'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:712:17: ( 'typeGenerators' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:712:19: 'typeGenerators'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:713:10: ( 'breakers' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:713:12: 'breakers'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:714:16: ( 'typesBreakers' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:714:18: 'typesBreakers'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:715:15: ( 'teleportables' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:715:17: 'teleportables'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:717:2: ( 'typesTeleportables' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:717:5: 'typesTeleportables'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:720:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:9: ( '0' .. '9' )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:10: '0' .. '9'
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:21: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:22: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:26: ( '0' .. '9' )+
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
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:721:27: '0' .. '9'
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:722:7: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:722:9: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:722:15: ( LETTER | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:723:5: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:723:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:723:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:8: ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__251 | T__252 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | GAME | GRAVITY_KW | SCORE | TYPE | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | DUPLICABLE | FIRST | THIRD | ALLY | ENEMY | NEUTRAL | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | COUNTER | TIME | OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER | MASS | IS_FIX | IS_TRAVERSABLE | FOV | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | LETTER | FLOAT | IDENT | WS )
        int alt8=229;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:10: GAME_KW
                {
                mGAME_KW(); 

                }
                break;
            case 2 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:18: GAME_ATTRIBUT_KW
                {
                mGAME_ATTRIBUT_KW(); 

                }
                break;
            case 3 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:35: INIT_IS_KW
                {
                mINIT_IS_KW(); 

                }
                break;
            case 4 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:46: DEC
                {
                mDEC(); 

                }
                break;
            case 5 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:50: T__251
                {
                mT__251(); 

                }
                break;
            case 6 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:57: T__252
                {
                mT__252(); 

                }
                break;
            case 7 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:64: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 8 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:72: PD
                {
                mPD(); 

                }
                break;
            case 9 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:75: PG
                {
                mPG(); 

                }
                break;
            case 10 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:78: FIN
                {
                mFIN(); 

                }
                break;
            case 11 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:82: VIRG
                {
                mVIRG(); 

                }
                break;
            case 12 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:87: HAS
                {
                mHAS(); 

                }
                break;
            case 13 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:91: AT
                {
                mAT(); 

                }
                break;
            case 14 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:94: IS
                {
                mIS(); 

                }
                break;
            case 15 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:97: AND
                {
                mAND(); 

                }
                break;
            case 16 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:101: OF
                {
                mOF(); 

                }
                break;
            case 17 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:104: WITH
                {
                mWITH(); 

                }
                break;
            case 18 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:109: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 19 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:117: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:122: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:128: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:132: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:136: POW
                {
                mPOW(); 

                }
                break;
            case 24 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:140: MOD
                {
                mMOD(); 

                }
                break;
            case 25 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:144: X
                {
                mX(); 

                }
                break;
            case 26 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:146: Y
                {
                mY(); 

                }
                break;
            case 27 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:148: Z
                {
                mZ(); 

                }
                break;
            case 28 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:150: ALL
                {
                mALL(); 

                }
                break;
            case 29 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:154: NOT
                {
                mNOT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:158: MIN
                {
                mMIN(); 

                }
                break;
            case 31 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:162: SEC
                {
                mSEC(); 

                }
                break;
            case 32 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:166: MS
                {
                mMS(); 

                }
                break;
            case 33 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:169: THEN
                {
                mTHEN(); 

                }
                break;
            case 34 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:174: FOR
                {
                mFOR(); 

                }
                break;
            case 35 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:178: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 36 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:185: INF
                {
                mINF(); 

                }
                break;
            case 37 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:189: SUP
                {
                mSUP(); 

                }
                break;
            case 38 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:193: INFEG
                {
                mINFEG(); 

                }
                break;
            case 39 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:199: SUPED
                {
                mSUPED(); 

                }
                break;
            case 40 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:205: DIFF
                {
                mDIFF(); 

                }
                break;
            case 41 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:210: GAME
                {
                mGAME(); 

                }
                break;
            case 42 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:215: GRAVITY_KW
                {
                mGRAVITY_KW(); 

                }
                break;
            case 43 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:226: SCORE
                {
                mSCORE(); 

                }
                break;
            case 44 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:232: TYPE
                {
                mTYPE(); 

                }
                break;
            case 45 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:237: PLAYER
                {
                mPLAYER(); 

                }
                break;
            case 46 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:244: LIST_KW
                {
                mLIST_KW(); 

                }
                break;
            case 47 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:252: IN
                {
                mIN(); 

                }
                break;
            case 48 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:255: LOOP
                {
                mLOOP(); 

                }
                break;
            case 49 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:260: ONCE
                {
                mONCE(); 

                }
                break;
            case 50 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:265: RANDOM_KW
                {
                mRANDOM_KW(); 

                }
                break;
            case 51 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:275: DEFINITION_KW
                {
                mDEFINITION_KW(); 

                }
                break;
            case 52 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:289: MEANS
                {
                mMEANS(); 

                }
                break;
            case 53 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:295: PAUSE_KW
                {
                mPAUSE_KW(); 

                }
                break;
            case 54 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:304: MUTE_KW
                {
                mMUTE_KW(); 

                }
                break;
            case 55 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:312: ON
                {
                mON(); 

                }
                break;
            case 56 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:315: OFF
                {
                mOFF(); 

                }
                break;
            case 57 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:319: PLAY_KW
                {
                mPLAY_KW(); 

                }
                break;
            case 58 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:327: STOP_KW
                {
                mSTOP_KW(); 

                }
                break;
            case 59 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:335: ENDS_KW
                {
                mENDS_KW(); 

                }
                break;
            case 60 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:343: STARTS_KW
                {
                mSTARTS_KW(); 

                }
                break;
            case 61 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:353: BLOCK_KW
                {
                mBLOCK_KW(); 

                }
                break;
            case 62 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:362: TRANSLATION
                {
                mTRANSLATION(); 

                }
                break;
            case 63 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:374: ROTATION
                {
                mROTATION(); 

                }
                break;
            case 64 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:383: SCALE
                {
                mSCALE(); 

                }
                break;
            case 65 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:389: EFFACE_KW
                {
                mEFFACE_KW(); 

                }
                break;
            case 66 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:399: GENERATE_KW
                {
                mGENERATE_KW(); 

                }
                break;
            case 67 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:411: WAIT_KW
                {
                mWAIT_KW(); 

                }
                break;
            case 68 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:419: ENDWAIT
                {
                mENDWAIT(); 

                }
                break;
            case 69 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:427: SAVE_KW
                {
                mSAVE_KW(); 

                }
                break;
            case 70 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:435: RULE_KW
                {
                mRULE_KW(); 

                }
                break;
            case 71 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:443: MOVES_KW
                {
                mMOVES_KW(); 

                }
                break;
            case 72 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:452: DIES_KW
                {
                mDIES_KW(); 

                }
                break;
            case 73 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:460: TOUCHES_KW
                {
                mTOUCHES_KW(); 

                }
                break;
            case 74 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:471: KILLS_KW
                {
                mKILLS_KW(); 

                }
                break;
            case 75 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:480: KILLED_KW
                {
                mKILLED_KW(); 

                }
                break;
            case 76 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:490: TOUCHED_KW
                {
                mTOUCHED_KW(); 

                }
                break;
            case 77 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:501: BY
                {
                mBY(); 

                }
                break;
            case 78 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:504: OTHER
                {
                mOTHER(); 

                }
                break;
            case 79 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:510: BECOMES
                {
                mBECOMES(); 

                }
                break;
            case 80 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:518: VICTORY_KW
                {
                mVICTORY_KW(); 

                }
                break;
            case 81 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:529: DEFEAT_KW
                {
                mDEFEAT_KW(); 

                }
                break;
            case 82 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:539: IF_KW
                {
                mIF_KW(); 

                }
                break;
            case 83 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:545: ELSE
                {
                mELSE(); 

                }
                break;
            case 84 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:550: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 85 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:556: OR
                {
                mOR(); 

                }
                break;
            case 86 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:559: COMP
                {
                mCOMP(); 

                }
                break;
            case 87 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:564: DEAD_KW
                {
                mDEAD_KW(); 

                }
                break;
            case 88 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:572: ALIVE_KW
                {
                mALIVE_KW(); 

                }
                break;
            case 89 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:581: EFFACED_KW
                {
                mEFFACED_KW(); 

                }
                break;
            case 90 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:592: GENERATED_KW
                {
                mGENERATED_KW(); 

                }
                break;
            case 91 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:605: TOUCHING_KW
                {
                mTOUCHING_KW(); 

                }
                break;
            case 92 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:617: MOVING_KW
                {
                mMOVING_KW(); 

                }
                break;
            case 93 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:627: WAITING_KW
                {
                mWAITING_KW(); 

                }
                break;
            case 94 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:638: FINISHED_KW
                {
                mFINISHED_KW(); 

                }
                break;
            case 95 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:650: STARTED_KW
                {
                mSTARTED_KW(); 

                }
                break;
            case 96 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:661: PAUSED_KW
                {
                mPAUSED_KW(); 

                }
                break;
            case 97 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:671: MUTED_KW
                {
                mMUTED_KW(); 

                }
                break;
            case 98 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:680: PLAYED_KW
                {
                mPLAYED_KW(); 

                }
                break;
            case 99 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:690: STOPPED_KW
                {
                mSTOPPED_KW(); 

                }
                break;
            case 100 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:701: ASSIGN_KW
                {
                mASSIGN_KW(); 

                }
                break;
            case 101 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:711: ADD_KW
                {
                mADD_KW(); 

                }
                break;
            case 102 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:718: SUB_KW
                {
                mSUB_KW(); 

                }
                break;
            case 103 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:725: INVERT_KW
                {
                mINVERT_KW(); 

                }
                break;
            case 104 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:735: NUM
                {
                mNUM(); 

                }
                break;
            case 105 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:739: IA_KW
                {
                mIA_KW(); 

                }
                break;
            case 106 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:745: DURING
                {
                mDURING(); 

                }
                break;
            case 107 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:752: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 108 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:758: EQUIP
                {
                mEQUIP(); 

                }
                break;
            case 109 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:764: NEXT
                {
                mNEXT(); 

                }
                break;
            case 110 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:769: PREVIOUS
                {
                mPREVIOUS(); 

                }
                break;
            case 111 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:778: KEYBOARD
                {
                mKEYBOARD(); 

                }
                break;
            case 112 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:787: ACTIVATE_KW
                {
                mACTIVATE_KW(); 

                }
                break;
            case 113 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:799: DISABLE_KW
                {
                mDISABLE_KW(); 

                }
                break;
            case 114 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:810: COMMANDS
                {
                mCOMMANDS(); 

                }
                break;
            case 115 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:819: DUPLICABLE
                {
                mDUPLICABLE(); 

                }
                break;
            case 116 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:830: FIRST
                {
                mFIRST(); 

                }
                break;
            case 117 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:836: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 118 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:842: ALLY
                {
                mALLY(); 

                }
                break;
            case 119 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:847: ENEMY
                {
                mENEMY(); 

                }
                break;
            case 120 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:853: NEUTRAL
                {
                mNEUTRAL(); 

                }
                break;
            case 121 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:861: POSITION
                {
                mPOSITION(); 

                }
                break;
            case 122 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:870: ORIENTATION
                {
                mORIENTATION(); 

                }
                break;
            case 123 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:882: SIZE
                {
                mSIZE(); 

                }
                break;
            case 124 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:887: PERSON
                {
                mPERSON(); 

                }
                break;
            case 125 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:894: FREE
                {
                mFREE(); 

                }
                break;
            case 126 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:899: FRAME
                {
                mFRAME(); 

                }
                break;
            case 127 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:905: WUP
                {
                mWUP(); 

                }
                break;
            case 128 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:909: WDOWN
                {
                mWDOWN(); 

                }
                break;
            case 129 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:915: LEFT
                {
                mLEFT(); 

                }
                break;
            case 130 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:920: RIGHT
                {
                mRIGHT(); 

                }
                break;
            case 131 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:926: SPACE
                {
                mSPACE(); 

                }
                break;
            case 132 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:932: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 133 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:939: ENTER
                {
                mENTER(); 

                }
                break;
            case 134 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:945: MOUSE
                {
                mMOUSE(); 

                }
                break;
            case 135 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:951: KEY
                {
                mKEY(); 

                }
                break;
            case 136 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:955: CLICK_LEFT
                {
                mCLICK_LEFT(); 

                }
                break;
            case 137 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:966: CLICK_CENTER
                {
                mCLICK_CENTER(); 

                }
                break;
            case 138 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:979: CLICK_RIGHT
                {
                mCLICK_RIGHT(); 

                }
                break;
            case 139 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:991: SCROLL_UP
                {
                mSCROLL_UP(); 

                }
                break;
            case 140 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1001: SCROLL_DOWN
                {
                mSCROLL_DOWN(); 

                }
                break;
            case 141 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1013: COMMAND_KW
                {
                mCOMMAND_KW(); 

                }
                break;
            case 142 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1024: JUMP
                {
                mJUMP(); 

                }
                break;
            case 143 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1029: MOVE
                {
                mMOVE(); 

                }
                break;
            case 144 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1034: FORWARD
                {
                mFORWARD(); 

                }
                break;
            case 145 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1042: BACKWARD
                {
                mBACKWARD(); 

                }
                break;
            case 146 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1051: TURN
                {
                mTURN(); 

                }
                break;
            case 147 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1056: ACCELERATE
                {
                mACCELERATE(); 

                }
                break;
            case 148 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1067: BRAKE
                {
                mBRAKE(); 

                }
                break;
            case 149 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1073: CAMERA
                {
                mCAMERA(); 

                }
                break;
            case 150 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1080: MEDIA
                {
                mMEDIA(); 

                }
                break;
            case 151 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1086: COUNTER
                {
                mCOUNTER(); 

                }
                break;
            case 152 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1094: TIME
                {
                mTIME(); 

                }
                break;
            case 153 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1099: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 154 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1106: CHARACTER
                {
                mCHARACTER(); 

                }
                break;
            case 155 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1116: VEHICLE
                {
                mVEHICLE(); 

                }
                break;
            case 156 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1124: PLANE
                {
                mPLANE(); 

                }
                break;
            case 157 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1130: SPACECRAFT
                {
                mSPACECRAFT(); 

                }
                break;
            case 158 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1141: OBSTACLE
                {
                mOBSTACLE(); 

                }
                break;
            case 159 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1150: WEAPON
                {
                mWEAPON(); 

                }
                break;
            case 160 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1157: SWORD
                {
                mSWORD(); 

                }
                break;
            case 161 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1163: PROJECTILE
                {
                mPROJECTILE(); 

                }
                break;
            case 162 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1174: ZONE
                {
                mZONE(); 

                }
                break;
            case 163 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1179: GROUND
                {
                mGROUND(); 

                }
                break;
            case 164 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1186: BONUS
                {
                mBONUS(); 

                }
                break;
            case 165 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1192: CHECKPOINT
                {
                mCHECKPOINT(); 

                }
                break;
            case 166 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1203: BREAKABLE
                {
                mBREAKABLE(); 

                }
                break;
            case 167 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1213: CONSTRUCTION
                {
                mCONSTRUCTION(); 

                }
                break;
            case 168 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1226: ROOM
                {
                mROOM(); 

                }
                break;
            case 169 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1231: BALL
                {
                mBALL(); 

                }
                break;
            case 170 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1236: TELEPORTER
                {
                mTELEPORTER(); 

                }
                break;
            case 171 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1247: MASS
                {
                mMASS(); 

                }
                break;
            case 172 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1252: IS_FIX
                {
                mIS_FIX(); 

                }
                break;
            case 173 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1259: IS_TRAVERSABLE
                {
                mIS_TRAVERSABLE(); 

                }
                break;
            case 174 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1274: FOV
                {
                mFOV(); 

                }
                break;
            case 175 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1278: ACTIVE
                {
                mACTIVE(); 

                }
                break;
            case 176 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1285: NAME
                {
                mNAME(); 

                }
                break;
            case 177 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1290: DESCRIPTION
                {
                mDESCRIPTION(); 

                }
                break;
            case 178 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1302: LIFE
                {
                mLIFE(); 

                }
                break;
            case 179 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1307: LIFE_MAX
                {
                mLIFE_MAX(); 

                }
                break;
            case 180 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1316: LIFE_MIN
                {
                mLIFE_MIN(); 

                }
                break;
            case 181 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1325: NB_LIVES
                {
                mNB_LIVES(); 

                }
                break;
            case 182 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1334: MAGIC
                {
                mMAGIC(); 

                }
                break;
            case 183 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1340: MAGIC_MAX
                {
                mMAGIC_MAX(); 

                }
                break;
            case 184 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1350: MAGIC_MIN
                {
                mMAGIC_MIN(); 

                }
                break;
            case 185 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1360: LEVEL
                {
                mLEVEL(); 

                }
                break;
            case 186 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1366: ATTACK
                {
                mATTACK(); 

                }
                break;
            case 187 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1373: DEFENSE
                {
                mDEFENSE(); 

                }
                break;
            case 188 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1381: JUMP_FORCE
                {
                mJUMP_FORCE(); 

                }
                break;
            case 189 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1392: JUMP_AIR_MAX
                {
                mJUMP_AIR_MAX(); 

                }
                break;
            case 190 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1405: MONEY
                {
                mMONEY(); 

                }
                break;
            case 191 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1411: CLASS
                {
                mCLASS(); 

                }
                break;
            case 192 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1417: RACE
                {
                mRACE(); 

                }
                break;
            case 193 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1422: ACCELERATION
                {
                mACCELERATION(); 

                }
                break;
            case 194 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1435: SPEED
                {
                mSPEED(); 

                }
                break;
            case 195 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1441: SPEED_MAX
                {
                mSPEED_MAX(); 

                }
                break;
            case 196 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1451: SPEED_MIN
                {
                mSPEED_MIN(); 

                }
                break;
            case 197 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1461: BOOST
                {
                mBOOST(); 

                }
                break;
            case 198 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1467: BOOST_MAX
                {
                mBOOST_MAX(); 

                }
                break;
            case 199 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1477: NB_MUNITIONS
                {
                mNB_MUNITIONS(); 

                }
                break;
            case 200 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1490: NB_MUNITIONS_MAX
                {
                mNB_MUNITIONS_MAX(); 

                }
                break;
            case 201 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1507: SHOOT_POWER
                {
                mSHOOT_POWER(); 

                }
                break;
            case 202 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1519: DAMAGES
                {
                mDAMAGES(); 

                }
                break;
            case 203 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1527: VALUE
                {
                mVALUE(); 

                }
                break;
            case 204 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1533: UNIT
                {
                mUNIT(); 

                }
                break;
            case 205 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1538: OBJECT_NAME
                {
                mOBJECT_NAME(); 

                }
                break;
            case 206 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1550: ATTRIBUT_NAME
                {
                mATTRIBUT_NAME(); 

                }
                break;
            case 207 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1564: VOLUME
                {
                mVOLUME(); 

                }
                break;
            case 208 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1571: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 209 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1578: MOVE_WITH_CAMERA
                {
                mMOVE_WITH_CAMERA(); 

                }
                break;
            case 210 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1595: BOOST_INTERVAL
                {
                mBOOST_INTERVAL(); 

                }
                break;
            case 211 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1610: SHOOT_INTERVAL
                {
                mSHOOT_INTERVAL(); 

                }
                break;
            case 212 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1625: RELOAD_TIME
                {
                mRELOAD_TIME(); 

                }
                break;
            case 213 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1637: INVENTORY
                {
                mINVENTORY(); 

                }
                break;
            case 214 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1647: EQUIPED_OBJECT
                {
                mEQUIPED_OBJECT(); 

                }
                break;
            case 215 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1662: ENTRANCES
                {
                mENTRANCES(); 

                }
                break;
            case 216 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1672: EXITS
                {
                mEXITS(); 

                }
                break;
            case 217 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1678: DAMAGE_ZONE
                {
                mDAMAGE_ZONE(); 

                }
                break;
            case 218 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1690: COLLECTORS
                {
                mCOLLECTORS(); 

                }
                break;
            case 219 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1701: TYPES_COLLECTORS
                {
                mTYPES_COLLECTORS(); 

                }
                break;
            case 220 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1718: GENERATORS
                {
                mGENERATORS(); 

                }
                break;
            case 221 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1729: TYPE_GENERATORS
                {
                mTYPE_GENERATORS(); 

                }
                break;
            case 222 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1745: BREAKERS
                {
                mBREAKERS(); 

                }
                break;
            case 223 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1754: TYPES_BREAKERS
                {
                mTYPES_BREAKERS(); 

                }
                break;
            case 224 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1769: TELEPORTABLES
                {
                mTELEPORTABLES(); 

                }
                break;
            case 225 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1783: TYPES_TELEPORTABLES
                {
                mTYPES_TELEPORTABLES(); 

                }
                break;
            case 226 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1803: LETTER
                {
                mLETTER(); 

                }
                break;
            case 227 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1810: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 228 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1816: IDENT
                {
                mIDENT(); 

                }
                break;
            case 229 :
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:1:1822: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\5\74\1\113\4\uffff\6\74\5\uffff\1\144\1\145\1\146\3\74"+
        "\1\uffff\1\173\1\175\1\uffff\27\74\2\uffff\3\75\2\uffff\14\75\2"+
        "\uffff\1\75\1\u00cd\5\75\1\u00d7\1\u00d9\1\u00da\1\u00db\1\u00dd"+
        "\1\u00df\1\75\1\u00e2\5\75\1\u00e9\3\75\3\uffff\6\75\1\u00f6\14"+
        "\75\4\uffff\45\75\1\u013b\27\75\1\u0156\11\75\1\u0161\1\u0162\4"+
        "\75\1\u0167\1\75\1\uffff\1\u016a\1\u016c\2\75\1\u016f\4\75\1\uffff"+
        "\1\75\3\uffff\1\u0175\1\uffff\1\75\1\uffff\2\75\1\uffff\6\75\1\uffff"+
        "\4\75\1\u0183\1\u0185\5\75\1\u018c\1\uffff\10\75\1\u0198\6\75\1"+
        "\u019f\52\75\1\u01cf\11\75\1\uffff\27\75\1\u01f1\2\75\1\uffff\1"+
        "\u01f4\1\75\1\u01f6\1\75\1\u01fa\1\75\1\u01fc\3\75\2\uffff\2\75"+
        "\1\u0202\1\75\1\uffff\2\75\1\uffff\1\u0206\1\uffff\2\75\1\uffff"+
        "\5\75\1\uffff\1\u020f\3\75\1\u0213\1\u0215\7\75\1\uffff\1\75\1\uffff"+
        "\1\u021e\1\75\1\u0220\3\75\1\uffff\1\75\1\u0226\1\u0229\3\75\1\u022d"+
        "\4\75\1\uffff\3\75\1\u0236\1\75\1\u0238\1\uffff\1\u0239\5\75\1\u0240"+
        "\4\75\1\u0245\1\u0247\1\u0248\1\u0249\3\75\1\u024d\1\75\1\u024f"+
        "\5\75\1\u0256\1\75\1\u0258\3\75\1\u025c\1\75\1\u025e\6\75\1\u0265"+
        "\5\75\1\uffff\3\75\1\u026f\5\75\1\u0275\1\u0277\6\75\1\u027e\11"+
        "\75\1\u0288\2\75\1\u028b\1\u028c\2\uffff\1\75\2\uffff\1\75\1\uffff"+
        "\1\u0291\2\75\1\uffff\1\75\1\uffff\1\75\1\u0299\2\75\1\u029c\1\uffff"+
        "\1\u029e\2\75\1\uffff\1\u02a1\3\75\1\u02a6\3\75\1\uffff\1\u02aa"+
        "\2\75\1\uffff\1\75\1\uffff\2\75\1\u02b0\1\75\1\u02b2\1\75\1\u02b5"+
        "\1\75\1\uffff\1\75\1\uffff\3\75\1\u02bb\1\u02bc\1\uffff\1\u02bd"+
        "\1\75\1\uffff\1\75\1\u02c0\1\u02c1\1\uffff\1\u02c3\3\75\1\u02c7"+
        "\1\u02c8\2\75\1\uffff\1\75\2\uffff\1\u02cd\1\u02ce\4\75\1\uffff"+
        "\1\u02d6\3\75\1\uffff\1\75\3\uffff\1\u02dc\2\75\1\uffff\1\75\1\uffff"+
        "\1\u02e0\5\75\1\uffff\1\75\1\uffff\3\75\1\uffff\1\75\1\uffff\1\75"+
        "\1\u02ec\1\u02ed\1\u02ee\2\75\1\uffff\1\u02f2\1\75\1\u02f4\1\u02f5"+
        "\3\75\1\u02f9\1\75\1\uffff\3\75\1\u02fe\1\u02ff\1\uffff\1\75\1\uffff"+
        "\5\75\1\u0306\1\uffff\4\75\1\u030b\2\75\1\u030e\1\75\1\uffff\1\u0310"+
        "\1\75\4\uffff\1\u0312\1\75\1\uffff\7\75\1\uffff\2\75\1\uffff\1\u029e"+
        "\1\uffff\1\u031e\1\75\1\uffff\1\u0320\1\75\1\u0322\1\75\1\uffff"+
        "\1\75\1\u0325\1\75\1\uffff\5\75\1\uffff\1\75\1\uffff\2\75\1\uffff"+
        "\1\u032f\4\75\3\uffff\1\75\1\u0335\2\uffff\1\75\1\uffff\3\75\2\uffff"+
        "\2\75\1\u033e\1\75\2\uffff\4\75\1\u0344\1\u0345\1\u0346\1\uffff"+
        "\2\75\1\u0349\2\75\1\uffff\1\u034c\1\u034d\1\75\1\uffff\1\u034f"+
        "\2\75\1\u0352\3\75\1\u0356\3\75\3\uffff\1\75\1\u035d\1\75\1\uffff"+
        "\1\u035f\2\uffff\1\u0360\2\75\1\uffff\1\u0363\2\75\1\u0366\2\uffff"+
        "\1\75\1\u0368\4\75\1\uffff\1\75\1\u036e\2\75\1\uffff\2\75\1\uffff"+
        "\1\u0373\1\uffff\1\75\1\uffff\5\75\1\u037a\1\u037b\2\75\1\u037e"+
        "\1\75\1\uffff\1\75\1\uffff\1\75\1\uffff\2\75\1\uffff\3\75\1\u0387"+
        "\1\u0388\1\u0389\3\75\1\uffff\1\u038d\4\75\1\uffff\7\75\1\u0399"+
        "\1\uffff\1\u039a\2\75\1\u039d\1\75\3\uffff\2\75\1\uffff\1\u03a2"+
        "\1\u03a3\2\uffff\1\75\1\uffff\2\75\1\uffff\1\u03a7\1\75\1\u03a9"+
        "\1\uffff\1\75\1\u03ab\1\75\1\u03ad\1\75\1\u03af\1\uffff\1\75\2\uffff"+
        "\1\75\1\u03b2\1\uffff\1\u03b4\1\75\1\uffff\1\75\1\uffff\1\u03b7"+
        "\4\75\1\uffff\1\75\1\u03bd\2\75\1\uffff\6\75\2\uffff\1\u03c6\1\75"+
        "\1\uffff\1\u03c8\1\75\1\u03ca\5\75\3\uffff\1\u03d0\1\u03d1\1\75"+
        "\1\uffff\2\75\1\u03d5\1\75\1\u03d7\1\u03d8\1\75\1\u03da\1\u03db"+
        "\1\u03dc\1\75\2\uffff\2\75\1\uffff\1\u03e1\1\75\1\u03e3\1\u03e4"+
        "\2\uffff\1\u03e5\2\75\1\uffff\1\75\1\uffff\1\75\1\uffff\1\75\1\uffff"+
        "\1\75\1\uffff\1\75\1\u03ed\1\uffff\1\u03ee\1\uffff\2\75\1\uffff"+
        "\4\75\1\u03f5\1\uffff\10\75\1\uffff\1\75\1\uffff\1\75\1\uffff\2"+
        "\75\1\u0403\2\75\2\uffff\1\75\1\u0407\1\75\1\uffff\1\75\2\uffff"+
        "\1\75\3\uffff\3\75\1\u040e\1\uffff\1\75\3\uffff\5\75\1\u0415\1\75"+
        "\2\uffff\1\75\1\u0418\1\75\1\u041a\2\75\1\uffff\2\75\1\u041f\7\75"+
        "\1\u0427\2\75\1\uffff\1\75\1\u042b\1\75\1\uffff\3\75\1\u0430\1\u0431"+
        "\1\75\1\uffff\1\u0433\1\u0434\1\u0435\1\75\1\u0437\1\u0438\1\uffff"+
        "\1\75\1\u043a\1\uffff\1\75\1\uffff\1\u043c\1\u043d\1\u043e\1\u043f"+
        "\1\uffff\1\u0440\6\75\1\uffff\2\75\1\u0449\1\uffff\1\75\1\u044c"+
        "\2\75\2\uffff\1\75\3\uffff\1\u0450\2\uffff\1\75\1\uffff\1\75\5\uffff"+
        "\5\75\1\u0458\1\u0459\1\75\1\uffff\2\75\1\uffff\3\75\1\uffff\1\75"+
        "\1\u0461\1\75\1\u0463\2\75\1\u0466\2\uffff\1\u0467\1\u0468\3\75"+
        "\1\u046c\1\75\1\uffff\1\75\1\uffff\1\75\1\u0470\3\uffff\1\u0471"+
        "\1\u0472\1\75\1\uffff\1\u0474\1\u0475\1\75\3\uffff\1\75\2\uffff"+
        "\1\75\1\u0479\1\75\1\uffff\1\u047b\1\uffff";
    static final String DFA8_eofS =
        "\u047c\uffff";
    static final String DFA8_minS =
        "\1\11\5\60\1\57\4\uffff\6\60\5\uffff\6\60\1\uffff\2\75\1\uffff"+
        "\27\60\2\uffff\1\115\1\155\1\157\2\uffff\1\111\1\103\1\141\1\145"+
        "\1\160\1\165\1\162\2\154\1\162\1\156\1\141\2\uffff\1\163\1\60\1"+
        "\144\1\151\1\163\1\144\1\143\6\60\1\150\1\60\1\152\1\164\1\151\1"+
        "\143\1\157\1\60\1\143\1\141\1\157\3\uffff\1\164\1\155\1\165\1\155"+
        "\1\115\1\156\1\60\1\141\1\164\1\156\1\147\1\143\2\141\1\166\1\142"+
        "\1\172\1\141\1\157\4\uffff\1\141\1\156\1\141\1\165\1\145\1\163\1"+
        "\162\1\146\1\157\1\146\1\154\1\143\1\164\1\154\1\147\2\154\1\141"+
        "\1\145\1\160\1\167\1\155\1\144\1\146\1\163\1\165\1\143\1\151\1\154"+
        "\1\171\1\143\4\154\1\141\1\151\1\60\2\155\1\156\1\141\1\144\1\155"+
        "\1\154\1\152\1\150\1\141\1\157\1\141\1\157\1\141\2\156\1\145\1\154"+
        "\1\157\1\105\1\145\1\165\1\124\1\60\1\145\2\156\1\162\1\145\1\143"+
        "\1\156\1\145\1\163\2\60\1\151\1\163\1\145\1\155\1\60\1\141\1\uffff"+
        "\2\60\1\166\1\151\1\60\1\151\1\145\1\151\1\162\1\uffff\1\145\3\uffff"+
        "\1\60\1\uffff\1\145\1\uffff\2\145\1\uffff\1\145\1\150\1\164\1\167"+
        "\1\157\1\143\1\uffff\2\153\1\141\1\163\2\60\2\164\1\145\1\146\1"+
        "\165\1\60\1\uffff\1\156\2\145\1\163\1\145\1\163\1\151\1\102\1\60"+
        "\1\162\1\154\1\157\1\160\1\162\1\145\1\60\1\145\1\143\1\145\1\157"+
        "\1\166\1\145\1\171\1\163\1\166\1\151\1\163\1\164\1\145\1\160\1\164"+
        "\1\145\1\151\1\144\1\145\1\141\1\145\1\150\1\151\1\157\1\145\1\144"+
        "\1\143\1\163\1\141\1\151\1\154\1\156\1\141\1\111\1\155\1\145\1\141"+
        "\1\145\1\151\1\141\1\164\1\154\1\60\1\164\2\165\1\155\1\154\1\151"+
        "\1\163\1\151\1\164\1\uffff\1\160\1\145\1\156\1\163\1\162\1\143\1"+
        "\151\3\145\1\164\1\151\1\156\1\152\1\143\1\162\1\160\1\145\1\165"+
        "\1\141\1\154\1\155\1\137\1\60\1\156\1\137\1\uffff\1\60\1\163\1\60"+
        "\1\144\1\60\1\150\1\60\1\160\1\145\1\141\2\uffff\1\163\1\164\1\60"+
        "\1\145\1\uffff\1\143\1\151\1\uffff\1\60\1\uffff\1\145\1\147\1\uffff"+
        "\1\166\1\154\1\170\1\141\1\156\1\uffff\1\60\1\162\1\156\1\143\2"+
        "\60\1\145\1\155\1\153\1\167\1\145\1\153\1\164\1\uffff\1\145\1\uffff"+
        "\1\60\1\162\1\60\1\114\1\156\1\160\1\uffff\1\163\2\60\1\156\1\145"+
        "\1\171\1\60\1\143\1\165\1\160\1\157\1\uffff\2\145\1\154\1\60\1\164"+
        "\1\60\1\uffff\1\60\1\145\1\144\1\164\1\151\1\162\1\60\1\145\1\151"+
        "\1\164\1\157\4\60\1\154\1\143\1\157\1\60\1\164\1\60\1\164\1\143"+
        "\1\141\1\156\1\141\1\60\1\162\1\60\1\142\1\156\1\151\1\60\1\147"+
        "\1\60\1\141\1\146\1\171\1\162\1\141\1\143\1\60\2\160\1\163\1\145"+
        "\1\157\1\uffff\1\157\1\145\1\155\1\60\1\141\1\145\1\143\1\163\1"+
        "\154\2\60\1\162\2\164\1\141\1\153\1\141\1\60\1\160\1\143\1\141\1"+
        "\143\3\145\1\144\1\157\1\60\1\163\1\153\2\60\1\101\1\uffff\1\144"+
        "\2\uffff\1\154\1\uffff\1\60\1\102\1\145\1\uffff\1\145\1\uffff\1"+
        "\157\1\60\1\162\1\150\1\60\1\uffff\1\60\1\153\1\142\1\uffff\1\60"+
        "\1\156\1\141\1\145\1\60\1\166\2\164\1\uffff\1\60\2\164\1\uffff\1"+
        "\156\1\uffff\2\145\1\60\1\141\1\60\1\145\1\60\1\162\1\uffff\1\141"+
        "\1\uffff\2\151\1\145\2\60\1\uffff\1\60\1\151\1\uffff\1\147\2\60"+
        "\1\uffff\1\60\1\155\1\145\1\157\2\60\1\154\1\145\1\uffff\1\145\2"+
        "\uffff\2\60\1\111\1\164\1\141\1\144\1\uffff\1\60\1\157\1\151\1\156"+
        "\1\uffff\1\141\3\uffff\1\60\1\153\1\155\1\uffff\1\151\1\uffff\1"+
        "\60\1\153\1\144\1\151\1\164\1\163\1\uffff\1\151\1\uffff\1\154\1"+
        "\147\1\143\1\uffff\1\145\1\uffff\1\151\3\60\1\156\1\145\1\uffff"+
        "\1\60\1\145\2\60\1\144\1\141\1\162\1\60\1\145\1\uffff\1\156\1\143"+
        "\1\153\2\60\1\uffff\1\157\1\uffff\1\141\1\145\1\162\1\143\1\120"+
        "\1\60\1\uffff\1\157\1\164\1\143\1\154\1\60\1\143\1\103\1\60\1\156"+
        "\1\uffff\1\60\1\141\4\uffff\1\60\1\141\1\uffff\1\157\1\162\1\145"+
        "\1\156\1\144\1\156\1\162\1\uffff\1\144\1\145\1\uffff\1\60\1\uffff"+
        "\1\60\1\165\1\uffff\1\60\1\164\1\60\1\162\1\uffff\1\145\1\60\1\157"+
        "\1\uffff\1\141\1\156\1\147\1\156\1\163\1\uffff\1\162\1\uffff\1\162"+
        "\1\156\1\uffff\1\60\1\154\1\166\1\164\1\145\3\uffff\1\164\1\60\2"+
        "\uffff\1\141\1\uffff\1\160\1\145\1\163\2\uffff\1\104\1\144\1\60"+
        "\1\144\2\uffff\1\157\1\156\1\171\1\164\3\60\1\uffff\1\165\1\157"+
        "\1\60\1\170\1\156\1\uffff\2\60\1\157\1\uffff\1\60\1\124\1\164\1"+
        "\60\1\145\1\160\1\145\1\60\1\141\1\132\1\164\3\uffff\1\143\1\60"+
        "\1\144\1\uffff\1\60\2\uffff\1\60\1\162\1\171\1\uffff\1\60\1\144"+
        "\1\164\1\60\2\uffff\1\162\1\60\1\162\1\165\1\164\1\157\1\uffff\1"+
        "\162\1\60\1\154\1\145\1\uffff\1\164\1\162\1\uffff\1\60\1\uffff\1"+
        "\142\1\uffff\1\164\1\154\1\145\1\154\1\145\2\60\1\147\1\164\1\60"+
        "\1\144\1\uffff\1\164\1\uffff\1\145\1\uffff\1\141\1\162\1\uffff\1"+
        "\162\1\164\1\141\3\60\1\144\1\163\1\164\1\uffff\1\60\1\145\1\151"+
        "\1\144\1\150\1\uffff\1\170\1\156\1\163\1\144\1\164\1\160\1\157\1"+
        "\60\1\uffff\1\60\1\167\1\164\1\60\1\145\3\uffff\1\163\1\156\1\uffff"+
        "\2\60\2\uffff\1\156\1\uffff\2\151\1\uffff\1\60\1\164\1\60\1\uffff"+
        "\1\142\1\60\1\157\1\60\1\145\1\60\1\uffff\1\117\2\uffff\1\144\1"+
        "\60\1\uffff\1\60\1\157\1\uffff\1\143\1\uffff\1\60\1\143\1\145\1"+
        "\151\1\164\1\uffff\1\145\1\60\1\151\1\141\1\uffff\1\154\1\151\1"+
        "\154\1\141\1\145\1\162\2\uffff\1\60\1\141\1\uffff\1\60\1\116\1\60"+
        "\1\164\1\163\1\171\1\151\1\155\3\uffff\2\60\1\145\1\uffff\1\163"+
        "\1\157\1\60\1\103\2\60\1\111\3\60\1\167\2\uffff\2\145\1\uffff\1"+
        "\60\1\162\2\60\2\uffff\1\60\1\155\1\157\1\uffff\1\151\1\uffff\1"+
        "\154\1\uffff\1\156\1\uffff\1\163\1\uffff\1\142\1\60\1\uffff\1\60"+
        "\1\uffff\1\162\1\145\1\uffff\1\164\1\162\1\156\1\145\1\60\1\uffff"+
        "\1\154\1\146\1\145\1\157\1\145\1\153\1\160\1\141\1\uffff\1\142\1"+
        "\uffff\1\141\1\uffff\1\145\1\141\1\60\1\157\1\145\2\uffff\1\162"+
        "\1\60\1\156\1\uffff\1\141\2\uffff\1\156\3\uffff\1\156\2\162\1\60"+
        "\1\uffff\1\163\3\uffff\1\145\1\156\1\157\2\145\1\60\1\152\2\uffff"+
        "\1\163\1\60\1\151\1\60\1\164\1\162\1\uffff\1\145\1\164\1\60\1\156"+
        "\1\143\1\145\1\157\1\164\1\154\1\155\1\60\1\157\1\142\1\uffff\1"+
        "\156\1\60\1\166\1\uffff\1\163\1\155\1\124\2\60\1\166\1\uffff\3\60"+
        "\1\156\2\60\1\uffff\1\145\1\60\1\uffff\1\157\1\uffff\4\60\1\uffff"+
        "\1\60\1\164\2\162\1\157\2\145\1\uffff\1\156\1\154\1\60\1\uffff\1"+
        "\141\1\60\1\145\1\150\2\uffff\1\141\3\uffff\1\60\2\uffff\1\143\1"+
        "\uffff\1\156\5\uffff\1\157\1\163\1\164\1\162\1\163\2\60\1\145\1"+
        "\uffff\1\154\1\141\1\uffff\1\162\1\145\1\154\1\uffff\1\164\1\60"+
        "\1\162\1\60\1\141\1\163\1\60\2\uffff\2\60\1\170\1\141\1\101\1\60"+
        "\1\163\1\uffff\1\163\1\uffff\1\142\1\60\3\uffff\2\60\1\151\1\uffff"+
        "\2\60\1\154\3\uffff\1\162\2\uffff\1\145\1\60\1\163\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA8_maxS =
        "\6\172\1\57\4\uffff\6\172\5\uffff\6\172\1\uffff\2\75\1\uffff\27"+
        "\172\2\uffff\1\115\1\155\1\157\2\uffff\1\111\1\103\1\165\1\151\1"+
        "\160\1\165\1\162\2\154\1\166\1\162\1\145\2\uffff\1\163\1\172\1\144"+
        "\1\154\1\163\1\144\1\164\6\172\1\150\1\172\1\152\1\164\1\151\1\164"+
        "\1\157\1\172\1\143\1\145\1\157\3\uffff\1\164\1\155\1\170\1\155\1"+
        "\117\1\156\1\172\1\141\1\164\1\166\1\170\1\143\1\162\1\157\1\166"+
        "\1\142\1\172\1\145\1\157\4\uffff\1\141\1\156\1\141\1\165\1\145\1"+
        "\163\1\162\1\163\1\157\1\166\1\154\1\156\1\164\1\154\1\147\2\154"+
        "\2\163\1\162\1\167\1\155\1\164\1\146\1\163\1\165\1\143\1\151\1\154"+
        "\1\171\1\143\2\154\1\155\1\154\1\141\1\164\1\172\2\155\1\165\1\145"+
        "\1\144\1\155\1\154\1\163\1\150\1\141\1\157\1\141\1\157\1\141\2\156"+
        "\1\145\1\154\1\157\1\105\1\145\1\165\1\124\1\172\1\145\2\156\1\162"+
        "\1\145\1\143\1\156\1\145\1\163\2\172\1\151\1\163\1\145\1\155\1\172"+
        "\1\162\1\uffff\2\172\1\166\1\151\1\172\1\151\1\145\1\151\1\162\1"+
        "\uffff\1\145\3\uffff\1\172\1\uffff\1\145\1\uffff\2\145\1\uffff\1"+
        "\145\1\150\1\164\1\167\1\157\1\143\1\uffff\2\153\1\141\1\163\2\172"+
        "\2\164\1\145\1\146\1\165\1\172\1\uffff\1\156\1\145\1\151\1\163\1"+
        "\145\1\163\1\151\1\123\1\172\1\162\1\154\1\157\1\160\1\162\1\145"+
        "\1\172\1\145\1\143\1\145\1\157\1\166\1\145\1\171\1\163\1\166\1\151"+
        "\1\163\1\164\1\145\1\160\1\164\1\145\1\151\1\144\1\145\1\141\1\145"+
        "\1\150\1\151\1\157\1\151\1\144\1\143\1\163\1\141\1\151\1\154\1\156"+
        "\1\141\1\163\1\155\1\162\1\141\1\145\1\151\1\141\1\164\1\154\1\172"+
        "\1\164\2\165\1\160\1\154\1\151\1\163\1\151\1\164\1\uffff\1\160\1"+
        "\145\1\156\1\163\1\162\1\143\1\151\3\145\1\164\1\151\1\156\1\152"+
        "\1\143\1\162\1\160\1\145\1\165\1\141\1\154\1\155\1\137\1\172\1\156"+
        "\1\137\1\uffff\1\172\1\163\1\172\1\144\1\172\1\150\1\172\1\160\1"+
        "\145\1\141\2\uffff\1\163\1\164\1\172\1\145\1\uffff\1\143\1\151\1"+
        "\uffff\1\172\1\uffff\1\145\1\147\1\uffff\1\166\1\154\1\170\1\141"+
        "\1\162\1\uffff\1\172\1\162\1\156\1\143\2\172\1\145\1\155\1\153\1"+
        "\167\1\145\1\153\1\164\1\uffff\1\145\1\uffff\1\172\1\162\1\172\1"+
        "\114\1\156\1\160\1\uffff\1\163\2\172\1\156\1\145\1\171\1\172\1\143"+
        "\1\165\1\160\1\157\1\uffff\2\145\1\154\1\172\1\164\1\172\1\uffff"+
        "\1\172\1\145\1\144\1\164\1\151\1\162\1\172\1\145\1\151\1\164\1\157"+
        "\4\172\1\154\1\143\1\157\1\172\1\164\1\172\1\164\1\143\1\141\2\156"+
        "\1\172\1\162\1\172\1\142\1\156\1\151\1\172\1\147\1\172\1\141\1\146"+
        "\1\171\1\162\1\141\1\143\1\172\2\160\2\163\1\157\1\uffff\1\157\1"+
        "\145\1\155\1\172\1\141\1\145\1\143\1\163\1\154\2\172\1\162\2\164"+
        "\1\141\1\153\1\141\1\172\1\160\1\143\1\141\1\143\3\145\1\144\1\157"+
        "\1\172\1\163\1\153\2\172\1\113\1\uffff\1\144\2\uffff\1\154\1\uffff"+
        "\1\172\1\124\1\145\1\uffff\1\151\1\uffff\1\157\1\172\1\162\1\150"+
        "\1\172\1\uffff\1\172\1\153\1\142\1\uffff\1\172\1\156\2\145\1\172"+
        "\1\166\2\164\1\uffff\1\172\2\164\1\uffff\1\156\1\uffff\2\145\1\172"+
        "\1\141\1\172\1\145\1\172\1\162\1\uffff\1\141\1\uffff\2\151\1\145"+
        "\2\172\1\uffff\1\172\1\151\1\uffff\1\147\2\172\1\uffff\1\172\1\155"+
        "\1\145\1\157\2\172\1\154\1\145\1\uffff\1\163\2\uffff\2\172\1\120"+
        "\1\164\1\141\1\162\1\uffff\1\172\1\157\1\151\1\156\1\uffff\1\151"+
        "\3\uffff\1\172\1\153\1\155\1\uffff\1\151\1\uffff\1\172\1\153\1\144"+
        "\1\151\1\164\1\163\1\uffff\1\151\1\uffff\1\154\1\147\1\143\1\uffff"+
        "\1\145\1\uffff\1\151\3\172\1\156\1\145\1\uffff\1\172\1\145\2\172"+
        "\1\144\1\141\1\162\1\172\1\145\1\uffff\1\156\1\143\1\153\2\172\1"+
        "\uffff\1\157\1\uffff\1\141\1\145\1\162\1\143\1\120\1\172\1\uffff"+
        "\1\157\1\164\1\143\1\154\1\172\1\143\1\103\1\172\1\156\1\uffff\1"+
        "\172\1\141\4\uffff\1\172\1\141\1\uffff\1\157\1\162\1\145\1\156\1"+
        "\163\1\156\1\162\1\uffff\1\144\1\145\1\uffff\1\172\1\uffff\1\172"+
        "\1\165\1\uffff\1\172\1\164\1\172\1\162\1\uffff\1\145\1\172\1\157"+
        "\1\uffff\1\141\1\156\1\147\1\156\1\163\1\uffff\1\162\1\uffff\1\162"+
        "\1\156\1\uffff\1\172\1\154\1\166\1\164\1\145\3\uffff\1\164\1\172"+
        "\2\uffff\1\151\1\uffff\1\160\1\145\1\163\2\uffff\1\125\1\144\1\172"+
        "\1\144\2\uffff\1\157\1\156\1\171\1\164\3\172\1\uffff\1\165\1\157"+
        "\1\172\1\170\1\156\1\uffff\2\172\1\157\1\uffff\1\172\1\124\1\164"+
        "\1\172\1\145\1\160\1\145\1\172\1\141\1\163\1\164\3\uffff\1\143\1"+
        "\172\1\144\1\uffff\1\172\2\uffff\1\172\1\162\1\171\1\uffff\1\172"+
        "\1\144\1\164\1\172\2\uffff\1\162\1\172\1\162\1\165\1\164\1\157\1"+
        "\uffff\1\162\1\172\1\154\1\145\1\uffff\1\164\1\162\1\uffff\1\172"+
        "\1\uffff\1\142\1\uffff\1\164\1\154\1\145\1\154\1\145\2\172\1\147"+
        "\1\164\1\172\1\144\1\uffff\1\164\1\uffff\1\145\1\uffff\1\141\1\162"+
        "\1\uffff\1\162\1\164\1\141\3\172\1\144\1\163\1\164\1\uffff\1\172"+
        "\1\145\1\151\1\144\1\150\1\uffff\1\170\1\156\1\163\1\144\1\164\1"+
        "\160\1\157\1\172\1\uffff\1\172\1\167\1\164\1\172\1\157\3\uffff\1"+
        "\163\1\156\1\uffff\2\172\2\uffff\1\156\1\uffff\2\151\1\uffff\1\172"+
        "\1\164\1\172\1\uffff\1\142\1\172\1\157\1\172\1\145\1\172\1\uffff"+
        "\1\117\2\uffff\1\144\1\172\1\uffff\1\172\1\157\1\uffff\1\143\1\uffff"+
        "\1\172\1\143\1\145\1\151\1\164\1\uffff\1\145\1\172\1\151\1\141\1"+
        "\uffff\1\154\1\151\1\154\1\141\1\145\1\162\2\uffff\1\172\1\141\1"+
        "\uffff\1\172\1\116\1\172\1\164\1\163\1\171\1\151\1\155\3\uffff\2"+
        "\172\1\145\1\uffff\1\163\1\157\1\172\1\103\2\172\1\111\3\172\1\167"+
        "\2\uffff\2\145\1\uffff\1\172\1\162\2\172\2\uffff\1\172\1\155\1\157"+
        "\1\uffff\1\151\1\uffff\1\154\1\uffff\1\156\1\uffff\1\163\1\uffff"+
        "\1\142\1\172\1\uffff\1\172\1\uffff\1\162\1\145\1\uffff\1\164\1\162"+
        "\1\156\1\145\1\172\1\uffff\1\154\1\146\1\145\1\157\1\145\1\153\1"+
        "\160\1\141\1\uffff\1\142\1\uffff\1\141\1\uffff\1\151\1\141\1\172"+
        "\1\157\1\145\2\uffff\1\162\1\172\1\156\1\uffff\1\141\2\uffff\1\156"+
        "\3\uffff\1\156\2\162\1\172\1\uffff\1\163\3\uffff\1\145\1\156\1\157"+
        "\2\145\1\172\1\152\2\uffff\1\163\1\172\1\151\1\172\1\164\1\162\1"+
        "\uffff\1\145\1\164\1\172\1\156\1\143\1\145\1\157\1\164\1\154\1\155"+
        "\1\172\1\157\1\142\1\uffff\1\156\1\172\1\166\1\uffff\1\163\1\155"+
        "\1\124\2\172\1\166\1\uffff\3\172\1\156\2\172\1\uffff\1\145\1\172"+
        "\1\uffff\1\157\1\uffff\4\172\1\uffff\1\172\1\164\2\162\1\157\2\145"+
        "\1\uffff\1\156\1\154\1\172\1\uffff\1\141\1\172\1\145\1\150\2\uffff"+
        "\1\141\3\uffff\1\172\2\uffff\1\143\1\uffff\1\156\5\uffff\1\157\1"+
        "\163\1\164\1\162\1\163\2\172\1\145\1\uffff\1\154\1\141\1\uffff\1"+
        "\162\1\145\1\154\1\uffff\1\164\1\172\1\162\1\172\1\141\1\163\1\172"+
        "\2\uffff\2\172\1\170\1\141\1\101\1\172\1\163\1\uffff\1\163\1\uffff"+
        "\1\142\1\172\3\uffff\2\172\1\151\1\uffff\2\172\1\154\3\uffff\1\162"+
        "\2\uffff\1\145\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\10\1\11\1\12\1\13\6\uffff\1\23\1\24\1\25\1\27\1\30\6"+
        "\uffff\1\43\2\uffff\1\50\27\uffff\1\u00e3\1\u00e5\3\uffff\1\u00e2"+
        "\1\u00e4\14\uffff\1\7\1\26\30\uffff\1\31\1\32\1\33\23\uffff\1\46"+
        "\1\44\1\47\1\45\117\uffff\1\15\11\uffff\1\16\1\uffff\1\57\1\122"+
        "\1\151\1\uffff\1\20\1\uffff\1\67\2\uffff\1\125\6\uffff\1\115\14"+
        "\uffff\1\40\104\uffff\1\177\32\uffff\1\4\12\uffff\1\42\1\u00ae\4"+
        "\uffff\1\14\2\uffff\1\17\1\uffff\1\34\2\uffff\1\145\5\uffff\1\70"+
        "\15\uffff\1\35\1\uffff\1\150\6\uffff\1\36\13\uffff\1\37\6\uffff"+
        "\1\146\57\uffff\1\u0087\41\uffff\1\51\1\uffff\1\3\1\5\1\uffff\1"+
        "\41\3\uffff\1\54\1\uffff\1\u0092\5\uffff\1\175\3\uffff\1\166\10"+
        "\uffff\1\61\3\uffff\1\21\1\uffff\1\103\10\uffff\1\155\1\uffff\1"+
        "\u00b0\5\uffff\1\66\2\uffff\1\u008f\3\uffff\1\u00ab\10\uffff\1\72"+
        "\1\uffff\1\105\1\173\6\uffff\1\71\4\uffff\1\56\1\uffff\1\u00b2\1"+
        "\60\1\u0081\3\uffff\1\u00c0\1\uffff\1\106\6\uffff\1\127\1\uffff"+
        "\1\110\3\uffff\1\u0080\1\uffff\1\73\6\uffff\1\123\11\uffff\1\126"+
        "\5\uffff\1\u00cc\1\uffff\1\u008e\6\uffff\1\u0098\11\uffff\1\u00a2"+
        "\2\uffff\1\u00a9\1\u00a8\1\1\1\2\2\uffff\1\165\7\uffff\1\6\2\uffff"+
        "\1\164\1\uffff\1\176\2\uffff\1\130\4\uffff\1\u00ac\3\uffff\1\116"+
        "\5\uffff\1\75\1\uffff\1\u0094\2\uffff\1\u00c5\5\uffff\1\64\1\141"+
        "\1\107\2\uffff\1\u0086\1\u00be\1\uffff\1\u00b6\3\uffff\1\53\1\100"+
        "\4\uffff\1\u0083\1\u00c2\7\uffff\1\65\5\uffff\1\u00b9\3\uffff\1"+
        "\u0082\13\uffff\1\124\1\167\1\u0085\3\uffff\1\154\1\uffff\1\u00d8"+
        "\1\112\3\uffff\1\u00cb\4\uffff\1\u00bf\1\153\6\uffff\1\u0096\4\uffff"+
        "\1\u009c\2\uffff\1\u00a0\1\uffff\1\u00a4\1\uffff\1\u00a3\13\uffff"+
        "\1\u00ba\1\uffff\1\144\1\uffff\1\u00af\2\uffff\1\147\11\uffff\1"+
        "\u00d0\5\uffff\1\134\10\uffff\1\74\5\uffff\1\55\1\142\1\140\2\uffff"+
        "\1\174\2\uffff\1\u0088\1\62\1\uffff\1\u008a\2\uffff\1\121\3\uffff"+
        "\1\152\6\uffff\1\101\1\uffff\1\u0084\1\113\2\uffff\1\u00cf\2\uffff"+
        "\1\u0089\1\uffff\1\u0095\5\uffff\1\u0099\4\uffff\1\u009f\6\uffff"+
        "\1\111\1\114\2\uffff\1\u0090\10\uffff\1\135\1\22\1\117\3\uffff\1"+
        "\170\13\uffff\1\143\1\137\2\uffff\1\52\4\uffff\1\u00b3\1\u00b4\3"+
        "\uffff\1\u00bb\1\uffff\1\161\1\uffff\1\u00ca\1\uffff\1\104\1\uffff"+
        "\1\131\2\uffff\1\120\1\uffff\1\u008d\2\uffff\1\u0097\5\uffff\1\u009b"+
        "\10\uffff\1\133\1\uffff\1\136\1\uffff\1\160\5\uffff\1\u0091\1\u00de"+
        "\3\uffff\1\u00c4\1\uffff\1\u00b7\1\u00b8\1\uffff\1\u00c3\1\u00c6"+
        "\1\u008b\4\uffff\1\102\1\uffff\1\156\1\171\1\77\7\uffff\1\157\1"+
        "\162\6\uffff\1\u009e\15\uffff\1\u00d5\3\uffff\1\u00b5\6\uffff\1"+
        "\132\6\uffff\1\u00d7\2\uffff\1\u00bc\1\uffff\1\u009a\4\uffff\1\u00a6"+
        "\7\uffff\1\u0093\3\uffff\1\u00cd\4\uffff\1\u008c\1\u00c9\1\uffff"+
        "\1\u00dc\1\u00d4\1\63\1\uffff\1\163\1\u00d9\1\uffff\1\u00da\1\uffff"+
        "\1\u00a5\1\u00aa\1\u00a1\1\u009d\1\76\10\uffff\1\172\2\uffff\1\u00c7"+
        "\3\uffff\1\u00b1\7\uffff\1\u00ce\1\u00c1\7\uffff\1\u00a7\1\uffff"+
        "\1\u00df\2\uffff\1\u00e0\1\u00ad\1\u00d2\3\uffff\1\u00d3\3\uffff"+
        "\1\u00dd\1\u00c8\1\u00d1\1\uffff\1\u00d6\1\u00db\3\uffff\1\u00bd"+
        "\1\uffff\1\u00e1";
    static final String DFA8_specialS =
        "\u047c\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\70\1\uffff\2\70\22\uffff\1\70\1\37\3\uffff\1\25\2\uffff"+
            "\1\10\1\7\1\23\1\21\1\12\1\22\1\uffff\1\6\12\67\1\uffff\1\11"+
            "\1\35\1\34\1\36\2\uffff\1\66\1\64\1\53\1\3\2\66\1\1\1\66\1\2"+
            "\3\66\1\54\1\66\1\56\1\60\1\66\1\65\1\61\1\55\1\66\1\57\1\62"+
            "\2\66\1\63\3\uffff\1\24\2\uffff\1\14\1\20\1\50\1\44\1\45\1\5"+
            "\1\40\1\13\1\15\1\52\1\46\1\42\1\32\1\31\1\16\1\41\1\66\1\43"+
            "\1\33\1\4\1\51\1\47\1\17\1\26\1\27\1\30",
            "\12\75\7\uffff\1\71\31\75\6\uffff\1\72\20\75\1\73\10\75",
            "\12\75\7\uffff\15\75\1\76\14\75\6\uffff\32\75",
            "\12\75\7\uffff\4\75\1\77\25\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\105\2\75\1\101\6\75\1"+
            "\103\2\75\1\100\2\75\1\104\3\75\1\102\1\75",
            "\12\75\7\uffff\32\75\6\uffff\1\106\7\75\1\110\5\75\1\107\2"+
            "\75\1\111\10\75",
            "\1\112",
            "",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\1\114\31\75",
            "\12\75\7\uffff\32\75\6\uffff\2\75\1\122\1\121\7\75\1\117\1"+
            "\75\1\116\4\75\1\120\1\115\6\75",
            "\12\75\7\uffff\32\75\6\uffff\1\126\4\75\1\125\7\75\1\124\4"+
            "\75\1\123\7\75",
            "\12\75\7\uffff\32\75\6\uffff\1\75\1\133\3\75\1\127\7\75\1"+
            "\130\3\75\1\132\1\75\1\131\6\75",
            "\12\75\7\uffff\32\75\6\uffff\1\135\7\75\1\134\21\75",
            "\12\75\7\uffff\32\75\6\uffff\1\141\3\75\1\136\6\75\1\137\2"+
            "\75\1\143\2\75\1\142\6\75\1\140\1\75",
            "",
            "",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\1\152\1\153\2\75\1\151\11\75"+
            "\1\147\5\75\1\150\5\75",
            "\12\75\7\uffff\32\75\6\uffff\1\161\3\75\1\156\3\75\1\154\5"+
            "\75\1\160\3\75\1\155\1\75\1\157\5\75",
            "\12\75\7\uffff\32\75\6\uffff\1\165\1\75\1\163\1\75\1\162\2"+
            "\75\1\171\1\167\6\75\1\170\3\75\1\164\1\166\5\75",
            "",
            "\1\172",
            "\1\174",
            "",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\177\14\75\1\176\10\75",
            "\12\75\7\uffff\32\75\6\uffff\1\u0081\3\75\1\u0084\6\75\1\u0080"+
            "\2\75\1\u0083\2\75\1\u0082\10\75",
            "\12\75\7\uffff\2\75\1\u0088\27\75\6\uffff\4\75\1\u0087\3\75"+
            "\1\u0085\5\75\1\u0086\13\75",
            "\12\75\7\uffff\2\75\1\u008d\27\75\6\uffff\1\u0089\3\75\1\u008e"+
            "\3\75\1\u008c\5\75\1\u008a\5\75\1\u008b\5\75",
            "\12\75\7\uffff\32\75\6\uffff\1\u0093\3\75\1\u008f\3\75\1\u0090"+
            "\5\75\1\u0092\5\75\1\u0091\5\75",
            "\12\75\7\uffff\32\75\6\uffff\5\75\1\u0095\5\75\1\u0096\1\75"+
            "\1\u0094\2\75\1\u0097\1\75\1\u0098\4\75\1\u0099\2\75",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u009b\3\75\1\u009a\21"+
            "\75",
            "\12\75\7\uffff\32\75\6\uffff\1\u009d\7\75\1\u009c\5\75\1\u009e"+
            "\13\75",
            "\12\75\7\uffff\2\75\1\u00a0\27\75\6\uffff\13\75\1\u00a1\2"+
            "\75\1\u009f\13\75",
            "\12\75\7\uffff\32\75\6\uffff\15\75\1\u00a2\1\75\1\u00a3\12"+
            "\75",
            "\12\75\7\uffff\32\75\6\uffff\24\75\1\u00a4\5\75",
            "\12\75\7\uffff\32\75\6\uffff\1\u00a5\6\75\1\u00a7\6\75\1\u00a6"+
            "\13\75",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u00a8\25\75",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u00aa\3\75\1\u00a9\21"+
            "\75",
            "\12\75\7\uffff\32\75\6\uffff\1\75\1\u00ab\30\75",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u00ac\25\75",
            "\12\75\7\uffff\32\75\6\uffff\13\75\1\u00ad\5\75\1\u00ae\10"+
            "\75",
            "\12\75\7\uffff\32\75\6\uffff\17\75\1\u00af\6\75\1\u00b0\3"+
            "\75",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u00b1\25\75",
            "\12\75\7\uffff\32\75\6\uffff\16\75\1\u00b2\13\75",
            "\12\75\7\uffff\32\75\6\uffff\1\u00b5\15\75\1\u00b3\2\75\1"+
            "\u00b4\10\75",
            "\12\75\7\uffff\32\75\6\uffff\16\75\1\u00b6\13\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bd\23\uffff\1\u00bc",
            "\1\u00be\3\uffff\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\3\uffff\1\u00c6",
            "\1\u00c7\3\uffff\1\u00c8",
            "\1\u00ca\3\uffff\1\u00c9",
            "",
            "",
            "\1\u00cb",
            "\12\75\7\uffff\32\75\6\uffff\23\75\1\u00cc\6\75",
            "\1\u00ce",
            "\1\u00d0\2\uffff\1\u00cf",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d4\20\uffff\1\u00d3",
            "\12\75\7\uffff\5\75\1\u00d5\15\75\1\u00d6\6\75\6\uffff\32"+
            "\75",
            "\12\75\7\uffff\32\75\6\uffff\25\75\1\u00d8\4\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\5\75\1\u00dc\24\75",
            "\12\75\7\uffff\32\75\6\uffff\2\75\1\u00de\27\75",
            "\1\u00e0",
            "\12\75\7\uffff\32\75\6\uffff\10\75\1\u00e1\21\75",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e7\20\uffff\1\u00e6",
            "\1\u00e8",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u00ea",
            "\1\u00eb\3\uffff\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f1\2\uffff\1\u00f0",
            "\1\u00f2",
            "\1\u00f4\1\uffff\1\u00f3",
            "\1\u00f5",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00fb\6\uffff\1\u00fa\1\u00f9",
            "\1\u00fd\13\uffff\1\u00fc\4\uffff\1\u00fe",
            "\1\u00ff",
            "\1\u0101\15\uffff\1\u0100\2\uffff\1\u0102",
            "\1\u0104\15\uffff\1\u0103",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108\3\uffff\1\u0109",
            "\1\u010a",
            "",
            "",
            "",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0113\14\uffff\1\u0112",
            "\1\u0114",
            "\1\u0115\17\uffff\1\u0116",
            "\1\u0117",
            "\1\u0119\12\uffff\1\u0118",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u0120\4\uffff\1\u011f\14\uffff\1\u0121",
            "\1\u0122\15\uffff\1\u0123",
            "\1\u0125\1\uffff\1\u0124",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128\1\u0129\16\uffff\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0136\1\u0135",
            "\1\u0137",
            "\1\u0138",
            "\1\u013a\12\uffff\1\u0139",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u013c",
            "\1\u013d",
            "\1\u013f\6\uffff\1\u013e",
            "\1\u0140\3\uffff\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145\10\uffff\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
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
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\12\75\7\uffff\32\75\6\uffff\26\75\1\u0160\3\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0168\20\uffff\1\u0169",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\30\75\1\u016b\1\75",
            "\1\u016d",
            "\1\u016e",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\1\75\1\u0184\30\75",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\75\7\uffff\22\75\1\u018b\7\75\6\uffff\32\75",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f\3\uffff\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0197\7\uffff\1\u0195\10\uffff\1\u0196",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b9\3\uffff\1\u01b8",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c4\15\uffff\1\u01c3\33\uffff\1\u01c2",
            "\1\u01c5",
            "\1\u01c6\14\uffff\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\12\75\7\uffff\32\75\6\uffff\1\75\1\u01ce\30\75",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d4\2\uffff\1\u01d3",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u01f2",
            "\1\u01f3",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u01f5",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u01f7",
            "\12\75\7\uffff\6\75\1\u01f9\23\75\6\uffff\22\75\1\u01f8\7"+
            "\75",
            "\1\u01fb",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "",
            "",
            "\1\u0200",
            "\1\u0201",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0203",
            "",
            "\1\u0204",
            "\1\u0205",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020e\3\uffff\1\u020d",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\10\75\1\u0214\21\75",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "",
            "\1\u021d",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u021f",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "",
            "\1\u0224",
            "\12\75\7\uffff\32\75\6\uffff\3\75\1\u0225\26\75",
            "\12\75\7\uffff\26\75\1\u0228\3\75\6\uffff\22\75\1\u0227\7"+
            "\75",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\12\75\7\uffff\32\75\6\uffff\17\75\1\u0235\12\75",
            "\1\u0237",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u023f\25\75",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\14\75\1\u0246\15\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u024e",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254\14\uffff\1\u0255",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0257",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u025d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u026a\15\uffff\1\u0269",
            "\1\u026b",
            "",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\5\75\1\u0276\24\75\6\uffff\32\75",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0289",
            "\1\u028a",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u028e\11\uffff\1\u028d",
            "",
            "\1\u028f",
            "",
            "",
            "\1\u0290",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0293\1\u0292\20\uffff\1\u0294",
            "\1\u0295",
            "",
            "\1\u0296\3\uffff\1\u0297",
            "",
            "\1\u0298",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u029a",
            "\1\u029b",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\22\75\1\u029d\7\75",
            "\1\u029f",
            "\1\u02a0",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02a2",
            "\1\u02a3\3\uffff\1\u02a4",
            "\1\u02a5",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "\1\u02af",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02b1",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02b3",
            "\12\75\7\uffff\10\75\1\u02b4\21\75\6\uffff\32\75",
            "\1\u02b6",
            "",
            "\1\u02b7",
            "",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02be",
            "",
            "\1\u02bf",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\14\75\1\u02c2\15\75\6\uffff\32\75",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02c9",
            "\1\u02ca",
            "",
            "\1\u02cc\15\uffff\1\u02cb",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02d0\6\uffff\1\u02cf",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d4\15\uffff\1\u02d3",
            "",
            "\12\75\7\uffff\32\75\6\uffff\3\75\1\u02d5\26\75",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "",
            "\1\u02da\7\uffff\1\u02db",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02dd",
            "\1\u02de",
            "",
            "\1\u02df",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "",
            "\1\u02e6",
            "",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "",
            "\1\u02ea",
            "",
            "\1\u02eb",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02ef",
            "\1\u02f0",
            "",
            "\12\75\7\uffff\32\75\6\uffff\4\75\1\u02f1\25\75",
            "\1\u02f3",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u02fa",
            "",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0300",
            "",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u030c",
            "\1\u030d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u030f",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0311",
            "",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0313",
            "",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0319\16\uffff\1\u0318",
            "\1\u031a",
            "\1\u031b",
            "",
            "\1\u031c",
            "\1\u031d",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u031f",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0321",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0323",
            "",
            "\1\u0324",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0326",
            "",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "",
            "\1\u032c",
            "",
            "\1\u032d",
            "\1\u032e",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "",
            "",
            "",
            "\1\u0334",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\1\u0336\7\uffff\1\u0337",
            "",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "",
            "",
            "\1\u033c\20\uffff\1\u033b",
            "\1\u033d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u033f",
            "",
            "",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0347",
            "\1\u0348",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u034a",
            "\1\u034b",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u034e",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0350",
            "\1\u0351",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0357",
            "\1\u0359\30\uffff\1\u0358",
            "\1\u035a",
            "",
            "",
            "",
            "\1\u035b",
            "\12\75\7\uffff\32\75\6\uffff\3\75\1\u035c\26\75",
            "\1\u035e",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0361",
            "\1\u0362",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0364",
            "\1\u0365",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\1\u0367",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "",
            "\1\u036d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u036f",
            "\1\u0370",
            "",
            "\1\u0371",
            "\1\u0372",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0374",
            "",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u037c",
            "\1\u037d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u037f",
            "",
            "\1\u0380",
            "",
            "\1\u0381",
            "",
            "\1\u0382",
            "\1\u0383",
            "",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u039b",
            "\1\u039c",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u039e\11\uffff\1\u039f",
            "",
            "",
            "",
            "\1\u03a0",
            "\1\u03a1",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\1\u03a4",
            "",
            "\1\u03a5",
            "\1\u03a6",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03a8",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u03aa",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03ac",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03ae",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u03b0",
            "",
            "",
            "\1\u03b1",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\22\75\1\u03b3\7\75",
            "\1\u03b5",
            "",
            "\1\u03b6",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "",
            "\1\u03bc",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03be",
            "\1\u03bf",
            "",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03c7",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03c9",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03d2",
            "",
            "\1\u03d3",
            "\1\u03d4",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03d6",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03d9",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03dd",
            "",
            "",
            "\1\u03de",
            "\1\u03df",
            "",
            "\12\75\7\uffff\32\75\6\uffff\3\75\1\u03e0\26\75",
            "\1\u03e2",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u03e6",
            "\1\u03e7",
            "",
            "\1\u03e8",
            "",
            "\1\u03e9",
            "",
            "\1\u03ea",
            "",
            "\1\u03eb",
            "",
            "\1\u03ec",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u03ef",
            "\1\u03f0",
            "",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\1\u03fd",
            "",
            "\1\u03fe",
            "",
            "\1\u03ff",
            "",
            "\1\u0400\3\uffff\1\u0401",
            "\1\u0402",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0404",
            "\1\u0405",
            "",
            "",
            "\1\u0406",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0408",
            "",
            "\1\u0409",
            "",
            "",
            "\1\u040a",
            "",
            "",
            "",
            "\1\u040b",
            "\1\u040c",
            "\1\u040d",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u040f",
            "",
            "",
            "",
            "\1\u0410",
            "\1\u0411",
            "\1\u0412",
            "\1\u0413",
            "\1\u0414",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0416",
            "",
            "",
            "\1\u0417",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0419",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u041b",
            "\1\u041c",
            "",
            "\1\u041d",
            "\1\u041e",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0420",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0428",
            "\1\u0429",
            "",
            "\1\u042a",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u042c",
            "",
            "\1\u042d",
            "\1\u042e",
            "\1\u042f",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0432",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0436",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u0439",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u043b",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0441",
            "\1\u0442",
            "\1\u0443",
            "\1\u0444",
            "\1\u0445",
            "\1\u0446",
            "",
            "\1\u0447",
            "\1\u0448",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "\1\u044a",
            "\12\75\7\uffff\14\75\1\u044b\15\75\6\uffff\32\75",
            "\1\u044d",
            "\1\u044e",
            "",
            "",
            "\1\u044f",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\1\u0451",
            "",
            "\1\u0452",
            "",
            "",
            "",
            "",
            "",
            "\1\u0453",
            "\1\u0454",
            "\1\u0455",
            "\1\u0456",
            "\1\u0457",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u045a",
            "",
            "\1\u045b",
            "\1\u045c",
            "",
            "\1\u045d",
            "\1\u045e",
            "\1\u045f",
            "",
            "\1\u0460",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0462",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0464",
            "\1\u0465",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0469",
            "\1\u046a",
            "\1\u046b",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u046d",
            "",
            "\1\u046e",
            "",
            "\1\u046f",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0473",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u0476",
            "",
            "",
            "",
            "\1\u0477",
            "",
            "",
            "\1\u0478",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
            "\1\u047a",
            "",
            "\12\75\7\uffff\32\75\6\uffff\32\75",
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
            return "1:1: Tokens : ( GAME_KW | GAME_ATTRIBUT_KW | INIT_IS_KW | DEC | T__251 | T__252 | COMMENT | PD | PG | FIN | VIRG | HAS | AT | IS | AND | OF | WITH | BETWEEN | PLUS | MINUS | MUL | DIV | POW | MOD | X | Y | Z | ALL | NOT | MIN | SEC | MS | THEN | FOR | EQUALS | INF | SUP | INFEG | SUPED | DIFF | GAME | GRAVITY_KW | SCORE | TYPE | PLAYER | LIST_KW | IN | LOOP | ONCE | RANDOM_KW | DEFINITION_KW | MEANS | PAUSE_KW | MUTE_KW | ON | OFF | PLAY_KW | STOP_KW | ENDS_KW | STARTS_KW | BLOCK_KW | TRANSLATION | ROTATION | SCALE | EFFACE_KW | GENERATE_KW | WAIT_KW | ENDWAIT | SAVE_KW | RULE_KW | MOVES_KW | DIES_KW | TOUCHES_KW | KILLS_KW | KILLED_KW | TOUCHED_KW | BY | OTHER | BECOMES | VICTORY_KW | DEFEAT_KW | IF_KW | ELSE | ENDIF | OR | COMP | DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW | MOVING_KW | WAITING_KW | FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW | PLAYED_KW | STOPPED_KW | ASSIGN_KW | ADD_KW | SUB_KW | INVERT_KW | NUM | IA_KW | DURING | UNTIL | EQUIP | NEXT | PREVIOUS | KEYBOARD | ACTIVATE_KW | DISABLE_KW | COMMANDS | DUPLICABLE | FIRST | THIRD | ALLY | ENEMY | NEUTRAL | POSITION | ORIENTATION | SIZE | PERSON | FREE | FRAME | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER | MOUSE | KEY | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN | COMMAND_KW | JUMP | MOVE | FORWARD | BACKWARD | TURN | ACCELERATE | BRAKE | CAMERA | MEDIA | COUNTER | TIME | OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER | MASS | IS_FIX | IS_TRAVERSABLE | FOV | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA | BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME | INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES | LETTER | FLOAT | IDENT | WS );";
        }
    }
 

}