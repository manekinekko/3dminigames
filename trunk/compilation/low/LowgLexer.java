// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-13 20:38:58

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
    public static final int PARAMS=9;
    public static final int PARAMLIST=10;
    public static final int OBJ=11;
    public static final int OBJS=12;
    public static final int PTVIRG=13;
    public static final int KEYLISTENER=14;
    public static final int AD=15;
    public static final int AF=16;
    public static final int MOUSELISTENER=17;
    public static final int KEYSTROKE=18;
    public static final int DP=19;
    public static final int ID=20;
    public static final int LEFTCLICK=21;
    public static final int LEFTDROP=22;
    public static final int LEFTDRAG=23;
    public static final int RIGHTCLICK=24;
    public static final int RIGHTDROP=25;
    public static final int INT=26;
    public static final int FLOAT=27;
    public static final int STRING=28;
    public static final int OBJECT=29;
    public static final int AFF=30;
    public static final int POSX=31;
    public static final int VIRG=32;
    public static final int POSY=33;
    public static final int POSZ=34;
    public static final int WS=35;
    public static final int WITH=36;

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

    // $ANTLR start "PARAMS"
    public final void mPARAMS() throws RecognitionException {
        try {
            int _type = PARAMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:7:8: ( 'PARAMS' )
            // Lowg.g:7:10: 'PARAMS'
            {
            match("PARAMS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAMS"

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
            // Lowg.g:98:17: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // Lowg.g:98:20: ( ' ' | '\\n' | '\\t' | '\\r' )
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
            // Lowg.g:103:8: ( ';' )
            // Lowg.g:103:10: ';'
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
            // Lowg.g:104:6: ( ',' )
            // Lowg.g:104:8: ','
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

    // $ANTLR start "AFF"
    public final void mAFF() throws RecognitionException {
        try {
            int _type = AFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:105:5: ( '=' )
            // Lowg.g:105:7: '='
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
            // Lowg.g:106:4: ( '{' )
            // Lowg.g:106:6: '{'
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
            // Lowg.g:107:4: ( '}' )
            // Lowg.g:107:6: '}'
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
            // Lowg.g:108:4: ( ':' )
            // Lowg.g:108:6: ':'
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

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:112:8: ( 'object' )
            // Lowg.g:112:10: 'object'
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
            // Lowg.g:113:13: ( 'keylistener' )
            // Lowg.g:113:15: 'keylistener'
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
            // Lowg.g:114:15: ( 'mouselistener' )
            // Lowg.g:114:17: 'mouselistener'
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

    // $ANTLR start "KEYSTROKE"
    public final void mKEYSTROKE() throws RecognitionException {
        try {
            int _type = KEYSTROKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:118:11: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\'' )
            // Lowg.g:118:13: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\''
            {
            match('\''); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 

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
            // Lowg.g:120:12: ( 'leftclick' )
            // Lowg.g:120:13: 'leftclick'
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
            // Lowg.g:121:10: ( 'leftdrop' )
            // Lowg.g:121:11: 'leftdrop'
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
            // Lowg.g:122:10: ( 'leftdrag' )
            // Lowg.g:122:11: 'leftdrag'
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
            // Lowg.g:123:12: ( 'rightclick' )
            // Lowg.g:123:13: 'rightclick'
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
            // Lowg.g:124:11: ( 'rightdrop' )
            // Lowg.g:124:12: 'rightdrop'
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

    // $ANTLR start "POSX"
    public final void mPOSX() throws RecognitionException {
        try {
            int _type = POSX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:127:7: ( 'posx' )
            // Lowg.g:127:9: 'posx'
            {
            match("posx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSX"

    // $ANTLR start "POSY"
    public final void mPOSY() throws RecognitionException {
        try {
            int _type = POSY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:128:7: ( 'posy' )
            // Lowg.g:128:9: 'posy'
            {
            match("posy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSY"

    // $ANTLR start "POSZ"
    public final void mPOSZ() throws RecognitionException {
        try {
            int _type = POSZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:129:7: ( 'posz' )
            // Lowg.g:129:9: 'posz'
            {
            match("posz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSZ"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:131:6: ( 'with' )
            // Lowg.g:131:8: 'with'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:133:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Lowg.g:133:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Lowg.g:133:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:136:5: ( ( '0' .. '9' )+ )
            // Lowg.g:136:7: ( '0' .. '9' )+
            {
            // Lowg.g:136:7: ( '0' .. '9' )+
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
            	    // Lowg.g:136:7: '0' .. '9'
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
            // Lowg.g:139:8: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\"' | '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\'' )
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
                    // Lowg.g:139:10: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\"'
                    {
                    match('\"'); 
                    // Lowg.g:139:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
                    // Lowg.g:140:4: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\''
                    {
                    match('\''); 
                    // Lowg.g:140:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // Lowg.g:144:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // Lowg.g:144:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // Lowg.g:144:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:144:10: '0' .. '9'
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
                    // Lowg.g:144:25: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Lowg.g:144:26: '0' .. '9'
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
                    // Lowg.g:145:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Lowg.g:145:13: ( '0' .. '9' )+
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
                    	    // Lowg.g:145:14: '0' .. '9'
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
                    // Lowg.g:146:9: ( '0' .. '9' )+
                    {
                    // Lowg.g:146:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:146:10: '0' .. '9'
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

    public void mTokens() throws RecognitionException {
        // Lowg.g:1:8: ( RESOURCE | RESOURCES | VAL | GAME | PARAMS | PARAMLIST | OBJ | OBJS | WS | PTVIRG | VIRG | AFF | AD | AF | DP | OBJECT | KEYLISTENER | MOUSELISTENER | KEYSTROKE | LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP | POSX | POSY | POSZ | WITH | ID | INT | STRING | FLOAT )
        int alt11=32;
        alt11 = dfa11.predict(input);
        switch (alt11) {
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
                // Lowg.g:1:38: PARAMS
                {
                mPARAMS(); 

                }
                break;
            case 6 :
                // Lowg.g:1:45: PARAMLIST
                {
                mPARAMLIST(); 

                }
                break;
            case 7 :
                // Lowg.g:1:55: OBJ
                {
                mOBJ(); 

                }
                break;
            case 8 :
                // Lowg.g:1:59: OBJS
                {
                mOBJS(); 

                }
                break;
            case 9 :
                // Lowg.g:1:64: WS
                {
                mWS(); 

                }
                break;
            case 10 :
                // Lowg.g:1:67: PTVIRG
                {
                mPTVIRG(); 

                }
                break;
            case 11 :
                // Lowg.g:1:74: VIRG
                {
                mVIRG(); 

                }
                break;
            case 12 :
                // Lowg.g:1:79: AFF
                {
                mAFF(); 

                }
                break;
            case 13 :
                // Lowg.g:1:83: AD
                {
                mAD(); 

                }
                break;
            case 14 :
                // Lowg.g:1:86: AF
                {
                mAF(); 

                }
                break;
            case 15 :
                // Lowg.g:1:89: DP
                {
                mDP(); 

                }
                break;
            case 16 :
                // Lowg.g:1:92: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 17 :
                // Lowg.g:1:99: KEYLISTENER
                {
                mKEYLISTENER(); 

                }
                break;
            case 18 :
                // Lowg.g:1:111: MOUSELISTENER
                {
                mMOUSELISTENER(); 

                }
                break;
            case 19 :
                // Lowg.g:1:125: KEYSTROKE
                {
                mKEYSTROKE(); 

                }
                break;
            case 20 :
                // Lowg.g:1:135: LEFTCLICK
                {
                mLEFTCLICK(); 

                }
                break;
            case 21 :
                // Lowg.g:1:145: LEFTDROP
                {
                mLEFTDROP(); 

                }
                break;
            case 22 :
                // Lowg.g:1:154: LEFTDRAG
                {
                mLEFTDRAG(); 

                }
                break;
            case 23 :
                // Lowg.g:1:163: RIGHTCLICK
                {
                mRIGHTCLICK(); 

                }
                break;
            case 24 :
                // Lowg.g:1:174: RIGHTDROP
                {
                mRIGHTDROP(); 

                }
                break;
            case 25 :
                // Lowg.g:1:184: POSX
                {
                mPOSX(); 

                }
                break;
            case 26 :
                // Lowg.g:1:189: POSY
                {
                mPOSY(); 

                }
                break;
            case 27 :
                // Lowg.g:1:194: POSZ
                {
                mPOSZ(); 

                }
                break;
            case 28 :
                // Lowg.g:1:199: WITH
                {
                mWITH(); 

                }
                break;
            case 29 :
                // Lowg.g:1:204: ID
                {
                mID(); 

                }
                break;
            case 30 :
                // Lowg.g:1:207: INT
                {
                mINT(); 

                }
                break;
            case 31 :
                // Lowg.g:1:211: STRING
                {
                mSTRING(); 

                }
                break;
            case 32 :
                // Lowg.g:1:218: FLOAT
                {
                mFLOAT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
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
            return "143:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\5\25\7\uffff\3\25\1\uffff\4\25\1\uffff\1\46\2\uffff\10"+
        "\25\1\uffff\4\25\1\uffff\1\25\1\65\2\25\1\71\3\25\1\uffff\5\25\1"+
        "\uffff\1\105\1\25\1\107\1\uffff\3\25\1\uffff\2\25\1\116\1\117\1"+
        "\120\1\121\1\25\1\uffff\1\25\1\uffff\6\25\4\uffff\1\25\1\135\1\25"+
        "\1\137\7\25\1\uffff\1\25\1\uffff\7\25\1\161\4\25\1\166\1\167\2\25"+
        "\1\172\1\uffff\1\173\2\25\1\176\2\uffff\1\25\1\u0080\2\uffff\2\25"+
        "\1\uffff\1\u0083\1\uffff\1\u0084\1\25\2\uffff\1\25\1\u0087\1\uffff";
    static final String DFA11_eofS =
        "\u0088\uffff";
    static final String DFA11_minS =
        "\1\11\1\105\3\101\1\102\7\uffff\1\142\1\145\1\157\1\47\1\145\1\151"+
        "\1\157\1\151\1\uffff\1\56\2\uffff\1\123\1\114\1\115\1\122\1\112"+
        "\1\152\1\171\1\165\1\47\1\146\1\147\1\163\1\164\1\uffff\1\117\1"+
        "\60\1\105\1\101\1\60\1\145\1\154\1\163\1\uffff\1\164\1\150\1\170"+
        "\1\150\1\125\1\uffff\1\60\1\115\1\60\1\uffff\1\143\1\151\1\145\1"+
        "\uffff\1\143\1\164\4\60\1\122\1\uffff\1\114\1\uffff\1\164\1\163"+
        "\2\154\1\162\1\143\4\uffff\1\103\1\60\1\111\1\60\1\164\2\151\1\141"+
        "\1\154\1\162\1\105\1\uffff\1\123\1\uffff\1\145\1\163\1\143\1\160"+
        "\1\147\1\151\1\157\1\60\1\124\1\156\1\164\1\153\2\60\1\143\1\160"+
        "\1\60\1\uffff\1\60\2\145\1\60\2\uffff\1\153\1\60\2\uffff\1\162\1"+
        "\156\1\uffff\1\60\1\uffff\1\60\1\145\2\uffff\1\162\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\105\3\101\1\102\7\uffff\1\142\1\145\1\157\1\172\1\145\1"+
        "\151\1\157\1\151\1\uffff\1\71\2\uffff\1\123\1\114\1\115\1\122\1"+
        "\112\1\152\1\171\1\165\1\172\1\146\1\147\1\163\1\164\1\uffff\1\117"+
        "\1\172\1\105\1\101\1\172\1\145\1\154\1\163\1\uffff\1\164\1\150\1"+
        "\172\1\150\1\125\1\uffff\1\172\1\115\1\172\1\uffff\1\143\1\151\1"+
        "\145\1\uffff\1\144\1\164\4\172\1\122\1\uffff\1\123\1\uffff\1\164"+
        "\1\163\2\154\1\162\1\144\4\uffff\1\103\1\172\1\111\1\172\1\164\2"+
        "\151\1\157\1\154\1\162\1\105\1\uffff\1\123\1\uffff\1\145\1\163\1"+
        "\143\1\160\1\147\1\151\1\157\1\172\1\124\1\156\1\164\1\153\2\172"+
        "\1\143\1\160\1\172\1\uffff\1\172\2\145\1\172\2\uffff\1\153\1\172"+
        "\2\uffff\1\162\1\156\1\uffff\1\172\1\uffff\1\172\1\145\2\uffff\1"+
        "\162\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\10\uffff\1\35\1\uffff"+
        "\1\37\1\40\15\uffff\1\36\10\uffff\1\23\5\uffff\1\3\3\uffff\1\7\3"+
        "\uffff\1\23\7\uffff\1\4\1\uffff\1\10\6\uffff\1\31\1\32\1\33\1\34"+
        "\13\uffff\1\5\1\uffff\1\20\21\uffff\1\1\4\uffff\1\25\1\26\2\uffff"+
        "\1\2\1\6\2\uffff\1\24\1\uffff\1\30\2\uffff\1\27\1\21\2\uffff\1\22";
    static final String DFA11_specialS =
        "\u0088\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\1\uffff\1\27\4\uffff\1\20\4\uffff"+
            "\1\10\1\uffff\1\30\1\uffff\12\26\1\14\1\7\1\uffff\1\11\3\uffff"+
            "\6\25\1\3\7\25\1\5\1\4\1\25\1\1\3\25\1\2\4\25\6\uffff\12\25"+
            "\1\16\1\21\1\17\1\25\1\15\1\23\1\25\1\22\4\25\1\24\3\25\1\12"+
            "\1\uffff\1\13",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\27\10\uffff\12\27\7\uffff\32\41\6\uffff\32\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\30\1\uffff\12\26",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\10\uffff\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\66",
            "\1\67",
            "\12\25\7\uffff\22\25\1\70\7\25\6\uffff\32\25",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\1\76",
            "\1\77",
            "\1\100\1\101\1\102",
            "\1\103",
            "\1\104",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\106",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113\1\114",
            "\1\115",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\122",
            "",
            "\1\124\6\uffff\1\123",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132\1\133",
            "",
            "",
            "",
            "",
            "\1\134",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\136",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\144\15\uffff\1\143",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\25\7\uffff\22\25\1\160\7\25\6\uffff\32\25",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\170",
            "\1\171",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\174",
            "\1\175",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "\1\177",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RESOURCE | RESOURCES | VAL | GAME | PARAMS | PARAMLIST | OBJ | OBJS | WS | PTVIRG | VIRG | AFF | AD | AF | DP | OBJECT | KEYLISTENER | MOUSELISTENER | KEYSTROKE | LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP | POSX | POSY | POSZ | WITH | ID | INT | STRING | FLOAT );";
        }
    }
 

}