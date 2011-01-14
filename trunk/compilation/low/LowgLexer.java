// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-14 21:06:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LowgLexer extends Lexer {
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int VAL=7;
    public static final int GAME=8;
    public static final int PARAM=9;
    public static final int PARAMLIST=10;
    public static final int OBJ=11;
    public static final int OBJS=12;
    public static final int PTVIRG=13;
    public static final int OBJECT=14;
    public static final int ID=15;
    public static final int AFF=16;
    public static final int VIRG=17;
    public static final int CAMERA=18;
    public static final int AD=19;
    public static final int AF=20;
    public static final int POSITION=21;
    public static final int DP=22;
    public static final int ANGLE=23;
    public static final int KEYLISTENER=24;
    public static final int MOUSELISTENER=25;
    public static final int KEYSTROKE=26;
    public static final int LEFTCLICK=27;
    public static final int LEFTDROP=28;
    public static final int LEFTDRAG=29;
    public static final int RIGHTCLICK=30;
    public static final int RIGHTDROP=31;
    public static final int ARROW=32;
    public static final int APPLY=33;
    public static final int PG=34;
    public static final int PD=35;
    public static final int PT=36;
    public static final int PLUS=37;
    public static final int MOINS=38;
    public static final int MULT=39;
    public static final int DIV=40;
    public static final int MOD=41;
    public static final int GAMEOVER=42;
    public static final int PAUSE=43;
    public static final int NEWGAME=44;
    public static final int SAVEGAME=45;
    public static final int INT=46;
    public static final int FLOAT=47;
    public static final int STRING=48;
    public static final int WS=49;
    public static final int PIPE=50;
    public static final int WITH=51;

    // delegates
    // delegators

    public LowgLexer() {;} 
    public LowgLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LowgLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Lowg.g"; }

    // $ANTLR start "RESOURCE"
    public final void mRESOURCE() throws RecognitionException {
        try {
            int _type = RESOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:3:10: ( 'RESOURCE' )
            // Lowg.g:3:12: 'RESOURCE'
            {
            match("RESOURCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESOURCE"

    // $ANTLR start "RESOURCES"
    public final void mRESOURCES() throws RecognitionException {
        try {
            int _type = RESOURCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:4:11: ( 'RESOURCES' )
            // Lowg.g:4:13: 'RESOURCES'
            {
            match("RESOURCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESOURCES"

    // $ANTLR start "VAL"
    public final void mVAL() throws RecognitionException {
        try {
            int _type = VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:5:5: ( 'VAL' )
            // Lowg.g:5:7: 'VAL'
            {
            match("VAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAL"

    // $ANTLR start "GAME"
    public final void mGAME() throws RecognitionException {
        try {
            int _type = GAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:6:6: ( 'GAME' )
            // Lowg.g:6:8: 'GAME'
            {
            match("GAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAME"

    // $ANTLR start "PARAM"
    public final void mPARAM() throws RecognitionException {
        try {
            int _type = PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:7:7: ( 'PARAM' )
            // Lowg.g:7:9: 'PARAM'
            {
            match("PARAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAM"

    // $ANTLR start "PARAMLIST"
    public final void mPARAMLIST() throws RecognitionException {
        try {
            int _type = PARAMLIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:8:11: ( 'PARAMLIST' )
            // Lowg.g:8:13: 'PARAMLIST'
            {
            match("PARAMLIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAMLIST"

    // $ANTLR start "OBJ"
    public final void mOBJ() throws RecognitionException {
        try {
            int _type = OBJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:9:5: ( 'OBJ' )
            // Lowg.g:9:7: 'OBJ'
            {
            match("OBJ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJ"

    // $ANTLR start "OBJS"
    public final void mOBJS() throws RecognitionException {
        try {
            int _type = OBJS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:10:6: ( 'OBJS' )
            // Lowg.g:10:8: 'OBJS'
            {
            match("OBJS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:149:17: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // Lowg.g:149:20: ( ' ' | '\\n' | '\\t' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "PTVIRG"
    public final void mPTVIRG() throws RecognitionException {
        try {
            int _type = PTVIRG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:154:8: ( ';' )
            // Lowg.g:154:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PTVIRG"

    // $ANTLR start "VIRG"
    public final void mVIRG() throws RecognitionException {
        try {
            int _type = VIRG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:155:6: ( ',' )
            // Lowg.g:155:8: ','
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

    // $ANTLR start "PT"
    public final void mPT() throws RecognitionException {
        try {
            int _type = PT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:156:4: ( '.' )
            // Lowg.g:156:6: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PT"

    // $ANTLR start "AFF"
    public final void mAFF() throws RecognitionException {
        try {
            int _type = AFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:157:5: ( '=' )
            // Lowg.g:157:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFF"

    // $ANTLR start "AD"
    public final void mAD() throws RecognitionException {
        try {
            int _type = AD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:158:4: ( '{' )
            // Lowg.g:158:6: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AD"

    // $ANTLR start "AF"
    public final void mAF() throws RecognitionException {
        try {
            int _type = AF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:159:4: ( '}' )
            // Lowg.g:159:6: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AF"

    // $ANTLR start "DP"
    public final void mDP() throws RecognitionException {
        try {
            int _type = DP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:160:4: ( ':' )
            // Lowg.g:160:6: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DP"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:161:7: ( '->' )
            // Lowg.g:161:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:162:6: ( '|' )
            // Lowg.g:162:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "PG"
    public final void mPG() throws RecognitionException {
        try {
            int _type = PG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:163:4: ( '(' )
            // Lowg.g:163:6: '('
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

    // $ANTLR start "PD"
    public final void mPD() throws RecognitionException {
        try {
            int _type = PD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:164:4: ( ')' )
            // Lowg.g:164:6: ')'
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

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:167:7: ( '+' )
            // Lowg.g:167:9: '+'
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

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:168:8: ( '-' )
            // Lowg.g:168:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:169:9: ( '*' )
            // Lowg.g:169:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:170:9: ( '/' )
            // Lowg.g:170:11: '/'
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

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:171:9: ( '%' )
            // Lowg.g:171:17: '%'
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

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:173:8: ( 'object' )
            // Lowg.g:173:10: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "KEYLISTENER"
    public final void mKEYLISTENER() throws RecognitionException {
        try {
            int _type = KEYLISTENER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:174:13: ( 'keylistener' )
            // Lowg.g:174:15: 'keylistener'
            {
            match("keylistener"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYLISTENER"

    // $ANTLR start "MOUSELISTENER"
    public final void mMOUSELISTENER() throws RecognitionException {
        try {
            int _type = MOUSELISTENER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:175:15: ( 'mouselistener' )
            // Lowg.g:175:17: 'mouselistener'
            {
            match("mouselistener"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOUSELISTENER"

    // $ANTLR start "CAMERA"
    public final void mCAMERA() throws RecognitionException {
        try {
            int _type = CAMERA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:177:8: ( 'camera' )
            // Lowg.g:177:10: 'camera'
            {
            match("camera"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAMERA"

    // $ANTLR start "POSITION"
    public final void mPOSITION() throws RecognitionException {
        try {
            int _type = POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:178:10: ( 'position' )
            // Lowg.g:178:12: 'position'
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

    // $ANTLR start "ANGLE"
    public final void mANGLE() throws RecognitionException {
        try {
            int _type = ANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:179:7: ( 'angle' )
            // Lowg.g:179:9: 'angle'
            {
            match("angle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGLE"

    // $ANTLR start "KEYSTROKE"
    public final void mKEYSTROKE() throws RecognitionException {
        try {
            int _type = KEYSTROKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:183:11: ( ( 'A' .. 'Z' ) | 'SPACE' | 'LEFT' | 'RIGHT' | 'UP' | 'DOWN' )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // Lowg.g:183:14: ( 'A' .. 'Z' )
                    {
                    // Lowg.g:183:14: ( 'A' .. 'Z' )
                    // Lowg.g:183:15: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // Lowg.g:183:27: 'SPACE'
                    {
                    match("SPACE"); 


                    }
                    break;
                case 3 :
                    // Lowg.g:183:37: 'LEFT'
                    {
                    match("LEFT"); 


                    }
                    break;
                case 4 :
                    // Lowg.g:183:46: 'RIGHT'
                    {
                    match("RIGHT"); 


                    }
                    break;
                case 5 :
                    // Lowg.g:183:56: 'UP'
                    {
                    match("UP"); 


                    }
                    break;
                case 6 :
                    // Lowg.g:183:63: 'DOWN'
                    {
                    match("DOWN"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSTROKE"

    // $ANTLR start "LEFTCLICK"
    public final void mLEFTCLICK() throws RecognitionException {
        try {
            int _type = LEFTCLICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:185:12: ( 'leftclick' )
            // Lowg.g:185:14: 'leftclick'
            {
            match("leftclick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTCLICK"

    // $ANTLR start "LEFTDROP"
    public final void mLEFTDROP() throws RecognitionException {
        try {
            int _type = LEFTDROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:186:10: ( 'leftdrop' )
            // Lowg.g:186:12: 'leftdrop'
            {
            match("leftdrop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTDROP"

    // $ANTLR start "LEFTDRAG"
    public final void mLEFTDRAG() throws RecognitionException {
        try {
            int _type = LEFTDRAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:187:10: ( 'leftdrag' )
            // Lowg.g:187:12: 'leftdrag'
            {
            match("leftdrag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTDRAG"

    // $ANTLR start "RIGHTCLICK"
    public final void mRIGHTCLICK() throws RecognitionException {
        try {
            int _type = RIGHTCLICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:188:12: ( 'rightclick' )
            // Lowg.g:188:14: 'rightclick'
            {
            match("rightclick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTCLICK"

    // $ANTLR start "RIGHTDROP"
    public final void mRIGHTDROP() throws RecognitionException {
        try {
            int _type = RIGHTDROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:189:11: ( 'rightdrop' )
            // Lowg.g:189:13: 'rightdrop'
            {
            match("rightdrop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTDROP"

    // $ANTLR start "APPLY"
    public final void mAPPLY() throws RecognitionException {
        try {
            int _type = APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:191:7: ( 'apply' )
            // Lowg.g:191:9: 'apply'
            {
            match("apply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APPLY"

    // $ANTLR start "GAMEOVER"
    public final void mGAMEOVER() throws RecognitionException {
        try {
            int _type = GAMEOVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:194:11: ( 'gameover' )
            // Lowg.g:194:13: 'gameover'
            {
            match("gameover"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAMEOVER"

    // $ANTLR start "PAUSE"
    public final void mPAUSE() throws RecognitionException {
        try {
            int _type = PAUSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:195:10: ( 'pause' )
            // Lowg.g:195:12: 'pause'
            {
            match("pause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAUSE"

    // $ANTLR start "NEWGAME"
    public final void mNEWGAME() throws RecognitionException {
        try {
            int _type = NEWGAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:196:10: ( 'newgame' )
            // Lowg.g:196:12: 'newgame'
            {
            match("newgame"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWGAME"

    // $ANTLR start "SAVEGAME"
    public final void mSAVEGAME() throws RecognitionException {
        try {
            int _type = SAVEGAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:197:11: ( 'savegame' )
            // Lowg.g:197:13: 'savegame'
            {
            match("savegame"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVEGAME"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:199:6: ( 'with' )
            // Lowg.g:199:8: 'with'
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:204:5: ( ( '0' .. '9' )+ )
            // Lowg.g:204:7: ( '0' .. '9' )+
            {
            // Lowg.g:204:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lowg.g:204:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:207:8: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\"' | '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Lowg.g:207:10: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\"'
                    {
                    match('\"'); 
                    // Lowg.g:207:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Lowg.g:
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
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // Lowg.g:208:4: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\''
                    {
                    match('\''); 
                    // Lowg.g:208:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Lowg.g:
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:212:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // Lowg.g:212:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // Lowg.g:212:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:212:10: '0' .. '9'
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

                    match('.'); 
                    // Lowg.g:212:25: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Lowg.g:212:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Lowg.g:213:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Lowg.g:213:13: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Lowg.g:213:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // Lowg.g:214:9: ( '0' .. '9' )+
                    {
                    // Lowg.g:214:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Lowg.g:214:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:217:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Lowg.g:217:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Lowg.g:217:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Lowg.g:
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
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    public void mTokens() throws RecognitionException {
        // Lowg.g:1:8: ( RESOURCE | RESOURCES | VAL | GAME | PARAM | PARAMLIST | OBJ | OBJS | WS | PTVIRG | VIRG | PT | AFF | AD | AF | DP | ARROW | PIPE | PG | PD | PLUS | MOINS | MULT | DIV | MOD | OBJECT | KEYLISTENER | MOUSELISTENER | CAMERA | POSITION | ANGLE | KEYSTROKE | LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP | APPLY | GAMEOVER | PAUSE | NEWGAME | SAVEGAME | WITH | INT | STRING | FLOAT | ID )
        int alt12=47;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // Lowg.g:1:10: RESOURCE
                {
                mRESOURCE(); 

                }
                break;
            case 2 :
                // Lowg.g:1:19: RESOURCES
                {
                mRESOURCES(); 

                }
                break;
            case 3 :
                // Lowg.g:1:29: VAL
                {
                mVAL(); 

                }
                break;
            case 4 :
                // Lowg.g:1:33: GAME
                {
                mGAME(); 

                }
                break;
            case 5 :
                // Lowg.g:1:38: PARAM
                {
                mPARAM(); 

                }
                break;
            case 6 :
                // Lowg.g:1:44: PARAMLIST
                {
                mPARAMLIST(); 

                }
                break;
            case 7 :
                // Lowg.g:1:54: OBJ
                {
                mOBJ(); 

                }
                break;
            case 8 :
                // Lowg.g:1:58: OBJS
                {
                mOBJS(); 

                }
                break;
            case 9 :
                // Lowg.g:1:63: WS
                {
                mWS(); 

                }
                break;
            case 10 :
                // Lowg.g:1:66: PTVIRG
                {
                mPTVIRG(); 

                }
                break;
            case 11 :
                // Lowg.g:1:73: VIRG
                {
                mVIRG(); 

                }
                break;
            case 12 :
                // Lowg.g:1:78: PT
                {
                mPT(); 

                }
                break;
            case 13 :
                // Lowg.g:1:81: AFF
                {
                mAFF(); 

                }
                break;
            case 14 :
                // Lowg.g:1:85: AD
                {
                mAD(); 

                }
                break;
            case 15 :
                // Lowg.g:1:88: AF
                {
                mAF(); 

                }
                break;
            case 16 :
                // Lowg.g:1:91: DP
                {
                mDP(); 

                }
                break;
            case 17 :
                // Lowg.g:1:94: ARROW
                {
                mARROW(); 

                }
                break;
            case 18 :
                // Lowg.g:1:100: PIPE
                {
                mPIPE(); 

                }
                break;
            case 19 :
                // Lowg.g:1:105: PG
                {
                mPG(); 

                }
                break;
            case 20 :
                // Lowg.g:1:108: PD
                {
                mPD(); 

                }
                break;
            case 21 :
                // Lowg.g:1:111: PLUS
                {
                mPLUS(); 

                }
                break;
            case 22 :
                // Lowg.g:1:116: MOINS
                {
                mMOINS(); 

                }
                break;
            case 23 :
                // Lowg.g:1:122: MULT
                {
                mMULT(); 

                }
                break;
            case 24 :
                // Lowg.g:1:127: DIV
                {
                mDIV(); 

                }
                break;
            case 25 :
                // Lowg.g:1:131: MOD
                {
                mMOD(); 

                }
                break;
            case 26 :
                // Lowg.g:1:135: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 27 :
                // Lowg.g:1:142: KEYLISTENER
                {
                mKEYLISTENER(); 

                }
                break;
            case 28 :
                // Lowg.g:1:154: MOUSELISTENER
                {
                mMOUSELISTENER(); 

                }
                break;
            case 29 :
                // Lowg.g:1:168: CAMERA
                {
                mCAMERA(); 

                }
                break;
            case 30 :
                // Lowg.g:1:175: POSITION
                {
                mPOSITION(); 

                }
                break;
            case 31 :
                // Lowg.g:1:184: ANGLE
                {
                mANGLE(); 

                }
                break;
            case 32 :
                // Lowg.g:1:190: KEYSTROKE
                {
                mKEYSTROKE(); 

                }
                break;
            case 33 :
                // Lowg.g:1:200: LEFTCLICK
                {
                mLEFTCLICK(); 

                }
                break;
            case 34 :
                // Lowg.g:1:210: LEFTDROP
                {
                mLEFTDROP(); 

                }
                break;
            case 35 :
                // Lowg.g:1:219: LEFTDRAG
                {
                mLEFTDRAG(); 

                }
                break;
            case 36 :
                // Lowg.g:1:228: RIGHTCLICK
                {
                mRIGHTCLICK(); 

                }
                break;
            case 37 :
                // Lowg.g:1:239: RIGHTDROP
                {
                mRIGHTDROP(); 

                }
                break;
            case 38 :
                // Lowg.g:1:249: APPLY
                {
                mAPPLY(); 

                }
                break;
            case 39 :
                // Lowg.g:1:255: GAMEOVER
                {
                mGAMEOVER(); 

                }
                break;
            case 40 :
                // Lowg.g:1:264: PAUSE
                {
                mPAUSE(); 

                }
                break;
            case 41 :
                // Lowg.g:1:270: NEWGAME
                {
                mNEWGAME(); 

                }
                break;
            case 42 :
                // Lowg.g:1:278: SAVEGAME
                {
                mSAVEGAME(); 

                }
                break;
            case 43 :
                // Lowg.g:1:287: WITH
                {
                mWITH(); 

                }
                break;
            case 44 :
                // Lowg.g:1:292: INT
                {
                mINT(); 

                }
                break;
            case 45 :
                // Lowg.g:1:296: STRING
                {
                mSTRING(); 

                }
                break;
            case 46 :
                // Lowg.g:1:303: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 47 :
                // Lowg.g:1:309: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA1_eotS =
        "\1\uffff\5\6\6\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\101\1\120\1\105\1\111\1\120\1\117\6\uffff";
    static final String DFA1_maxS =
        "\1\132\1\120\1\105\1\111\1\120\1\117\6\uffff";
    static final String DFA1_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\3\6\1\5\7\6\1\2\5\6\1\3\1\1\1\6\1\4\5\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "183:1: KEYSTROKE : ( ( 'A' .. 'Z' ) | 'SPACE' | 'LEFT' | 'RIGHT' | 'UP' | 'DOWN' );";
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\2\71\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
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
            return "211:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\5\54\3\uffff\1\61\4\uffff\1\64\7\uffff\6\51\5\54\6\51\1"+
        "\107\2\uffff\2\51\1\uffff\4\51\4\uffff\12\51\1\54\7\51\1\uffff\2"+
        "\51\1\141\2\51\1\145\23\51\1\uffff\1\171\1\51\1\173\1\uffff\11\51"+
        "\2\54\5\51\1\u008b\1\51\1\54\1\uffff\1\u008e\1\uffff\5\51\1\u0094"+
        "\1\u0095\1\u0096\1\54\6\51\1\uffff\2\51\1\uffff\1\u00a0\2\51\1\u00a3"+
        "\1\51\3\uffff\11\51\1\uffff\2\51\1\uffff\7\51\1\u00b8\1\51\1\u00bb"+
        "\3\51\1\u00bf\1\51\1\u00c1\1\u00c2\2\51\1\u00c5\1\uffff\1\u00c6"+
        "\1\u00c7\1\uffff\1\u00c8\2\51\1\uffff\1\u00cb\2\uffff\1\51\1\u00cd"+
        "\4\uffff\2\51\1\uffff\1\u00d0\1\uffff\1\u00d1\1\51\2\uffff\1\51"+
        "\1\u00d4\1\uffff";
    static final String DFA12_eofS =
        "\u00d5\uffff";
    static final String DFA12_minS =
        "\1\11\5\60\3\uffff\1\60\4\uffff\1\76\7\uffff\1\142\1\145\1\157\2"+
        "\141\1\156\5\60\1\145\1\151\1\141\1\145\1\141\1\151\1\56\2\uffff"+
        "\1\123\1\107\1\uffff\1\114\1\115\1\122\1\112\4\uffff\1\152\1\171"+
        "\1\165\1\155\1\163\1\165\1\147\1\160\1\101\1\106\1\60\1\127\1\146"+
        "\1\147\1\155\1\167\1\166\1\164\1\uffff\1\117\1\110\1\60\1\105\1"+
        "\101\1\60\1\145\1\154\1\163\1\145\1\151\1\163\2\154\1\103\1\124"+
        "\1\116\1\164\1\150\1\145\1\147\1\145\1\150\1\125\1\124\1\uffff\1"+
        "\60\1\115\1\60\1\uffff\1\143\1\151\1\145\1\162\1\164\2\145\1\171"+
        "\1\105\2\60\1\143\1\164\1\157\1\141\1\147\1\60\1\122\1\60\1\uffff"+
        "\1\60\1\uffff\1\164\1\163\1\154\1\141\1\151\4\60\1\154\1\162\1\143"+
        "\1\166\1\155\1\141\1\uffff\1\103\1\111\1\uffff\1\60\1\164\1\151"+
        "\1\60\1\157\3\uffff\1\151\1\141\1\154\1\162\2\145\1\155\1\105\1"+
        "\123\1\uffff\1\145\1\163\1\uffff\1\156\1\143\1\160\1\147\1\151\1"+
        "\157\1\162\1\60\1\145\1\60\1\124\1\156\1\164\1\60\1\153\2\60\1\143"+
        "\1\160\1\60\1\uffff\2\60\1\uffff\1\60\2\145\1\uffff\1\60\2\uffff"+
        "\1\153\1\60\4\uffff\1\162\1\156\1\uffff\1\60\1\uffff\1\60\1\145"+
        "\2\uffff\1\162\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\175\5\172\3\uffff\1\71\4\uffff\1\76\7\uffff\1\142\1\145\1\157"+
        "\1\141\1\157\1\160\5\172\1\145\1\151\1\141\1\145\1\141\1\151\1\71"+
        "\2\uffff\1\123\1\107\1\uffff\1\114\1\115\1\122\1\112\4\uffff\1\152"+
        "\1\171\1\165\1\155\1\163\1\165\1\147\1\160\1\101\1\106\1\172\1\127"+
        "\1\146\1\147\1\155\1\167\1\166\1\164\1\uffff\1\117\1\110\1\172\1"+
        "\105\1\101\1\172\1\145\1\154\1\163\1\145\1\151\1\163\2\154\1\103"+
        "\1\124\1\116\1\164\1\150\1\145\1\147\1\145\1\150\1\125\1\124\1\uffff"+
        "\1\172\1\115\1\172\1\uffff\1\143\1\151\1\145\1\162\1\164\2\145\1"+
        "\171\1\105\2\172\1\144\1\164\1\157\1\141\1\147\1\172\1\122\1\172"+
        "\1\uffff\1\172\1\uffff\1\164\1\163\1\154\1\141\1\151\4\172\1\154"+
        "\1\162\1\144\1\166\1\155\1\141\1\uffff\1\103\1\111\1\uffff\1\172"+
        "\1\164\1\151\1\172\1\157\3\uffff\1\151\1\157\1\154\1\162\2\145\1"+
        "\155\1\105\1\123\1\uffff\1\145\1\163\1\uffff\1\156\1\143\1\160\1"+
        "\147\1\151\1\157\1\162\1\172\1\145\1\172\1\124\1\156\1\164\1\172"+
        "\1\153\2\172\1\143\1\160\1\172\1\uffff\2\172\1\uffff\1\172\2\145"+
        "\1\uffff\1\172\2\uffff\1\153\1\172\4\uffff\1\162\1\156\1\uffff\1"+
        "\172\1\uffff\1\172\1\145\2\uffff\1\162\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\11\1\12\1\13\1\uffff\1\15\1\16\1\17\1\20\1\uffff\1\22"+
        "\1\23\1\24\1\25\1\27\1\30\1\31\22\uffff\1\55\1\57\2\uffff\1\40\4"+
        "\uffff\1\14\1\56\1\21\1\26\22\uffff\1\54\31\uffff\1\3\3\uffff\1"+
        "\7\23\uffff\1\4\1\uffff\1\10\17\uffff\1\53\2\uffff\1\5\5\uffff\1"+
        "\50\1\37\1\46\11\uffff\1\32\2\uffff\1\35\24\uffff\1\51\2\uffff\1"+
        "\1\3\uffff\1\36\1\uffff\1\42\1\43\2\uffff\1\47\1\52\1\2\1\6\2\uffff"+
        "\1\41\1\uffff\1\45\2\uffff\1\44\1\33\2\uffff\1\34";
    static final String DFA12_specialS =
        "\u00d5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\1\uffff\1\50\2\uffff\1\25\1\uffff"+
            "\1\50\1\20\1\21\1\23\1\22\1\10\1\16\1\11\1\24\12\47\1\15\1\7"+
            "\1\uffff\1\12\3\uffff\3\40\1\37\2\40\1\3\4\40\1\35\2\40\1\5"+
            "\1\4\1\40\1\1\1\34\1\40\1\36\1\2\4\40\6\uffff\1\33\1\51\1\31"+
            "\3\51\1\43\3\51\1\27\1\41\1\30\1\44\1\26\1\32\1\51\1\42\1\45"+
            "\3\51\1\46\3\51\1\13\1\17\1\14",
            "\12\51\7\uffff\4\51\1\52\3\51\1\53\21\51\6\uffff\32\51",
            "\12\51\7\uffff\1\55\31\51\6\uffff\32\51",
            "\12\51\7\uffff\1\56\31\51\6\uffff\32\51",
            "\12\51\7\uffff\1\57\31\51\6\uffff\32\51",
            "\12\51\7\uffff\1\51\1\60\30\51\6\uffff\32\51",
            "",
            "",
            "",
            "\12\62",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\15\uffff\1\71",
            "\1\73\1\uffff\1\74",
            "\12\51\7\uffff\17\51\1\75\12\51\6\uffff\32\51",
            "\12\51\7\uffff\4\51\1\76\25\51\6\uffff\32\51",
            "\12\51\7\uffff\17\51\1\77\12\51\6\uffff\32\51",
            "\12\51\7\uffff\16\51\1\100\13\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\62\1\uffff\12\47",
            "",
            "",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\142",
            "\1\143",
            "\12\51\7\uffff\22\51\1\144\7\51\6\uffff\32\51",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\172",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u0085\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u008c",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\12\51\7\uffff\13\51\1\u008d\16\51\6\uffff\32\51",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00a1",
            "\1\u00a2",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00a4",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a7\15\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00b9",
            "\12\51\7\uffff\22\51\1\u00ba\7\51\6\uffff\32\51",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00c0",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00c3",
            "\1\u00c4",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "\1\u00cc",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RESOURCE | RESOURCES | VAL | GAME | PARAM | PARAMLIST | OBJ | OBJS | WS | PTVIRG | VIRG | PT | AFF | AD | AF | DP | ARROW | PIPE | PG | PD | PLUS | MOINS | MULT | DIV | MOD | OBJECT | KEYLISTENER | MOUSELISTENER | CAMERA | POSITION | ANGLE | KEYSTROKE | LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP | APPLY | GAMEOVER | PAUSE | NEWGAME | SAVEGAME | WITH | INT | STRING | FLOAT | ID );";
        }
    }
 

}