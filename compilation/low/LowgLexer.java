// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-10 23:24:44

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
    public static final int OBJ=10;
    public static final int OBJS=11;
    public static final int PTVIRG=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int FLOAT=15;
    public static final int OBJECT=16;
    public static final int AFF=17;
    public static final int FRICTIONCOEF=18;
    public static final int WS=19;
    public static final int WITH=20;

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

    // $ANTLR start "OBJ"
    public final void mOBJ() throws RecognitionException {
        try {
            int _type = OBJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:8:5: ( 'OBJ' )
            // Lowg.g:8:7: 'OBJ'
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
            // Lowg.g:9:6: ( 'OBJS' )
            // Lowg.g:9:8: 'OBJS'
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
            // Lowg.g:80:17: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // Lowg.g:80:20: ( ' ' | '\\n' | '\\t' | '\\r' )
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
            // Lowg.g:85:8: ( ';' )
            // Lowg.g:85:10: ';'
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

    // $ANTLR start "AFF"
    public final void mAFF() throws RecognitionException {
        try {
            int _type = AFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:86:5: ( '=' )
            // Lowg.g:86:7: '='
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

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:90:8: ( 'object' )
            // Lowg.g:90:10: 'object'
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

    // $ANTLR start "FRICTIONCOEF"
    public final void mFRICTIONCOEF() throws RecognitionException {
        try {
            int _type = FRICTIONCOEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:94:15: ( 'frictioncoef' )
            // Lowg.g:94:17: 'frictioncoef'
            {
            match("frictioncoef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FRICTIONCOEF"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:96:6: ( 'with' )
            // Lowg.g:96:8: 'with'
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
            // Lowg.g:98:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Lowg.g:98:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Lowg.g:98:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // Lowg.g:101:5: ( ( '0' .. '9' )+ )
            // Lowg.g:101:7: ( '0' .. '9' )+
            {
            // Lowg.g:101:7: ( '0' .. '9' )+
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
            	    // Lowg.g:101:7: '0' .. '9'
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:105:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // Lowg.g:105:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // Lowg.g:105:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:105:10: '0' .. '9'
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

                    match('.'); 
                    // Lowg.g:105:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Lowg.g:105:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Lowg.g:106:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Lowg.g:106:13: ( '0' .. '9' )+
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
                    	    // Lowg.g:106:14: '0' .. '9'
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


                    }
                    break;
                case 3 :
                    // Lowg.g:107:9: ( '0' .. '9' )+
                    {
                    // Lowg.g:107:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:107:10: '0' .. '9'
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
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    public void mTokens() throws RecognitionException {
        // Lowg.g:1:8: ( RESOURCE | RESOURCES | VAL | GAME | PARAMS | OBJ | OBJS | WS | PTVIRG | AFF | OBJECT | FRICTIONCOEF | WITH | ID | INT | FLOAT )
        int alt8=16;
        alt8 = dfa8.predict(input);
        switch (alt8) {
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
                // Lowg.g:1:45: OBJ
                {
                mOBJ(); 

                }
                break;
            case 7 :
                // Lowg.g:1:49: OBJS
                {
                mOBJS(); 

                }
                break;
            case 8 :
                // Lowg.g:1:54: WS
                {
                mWS(); 

                }
                break;
            case 9 :
                // Lowg.g:1:57: PTVIRG
                {
                mPTVIRG(); 

                }
                break;
            case 10 :
                // Lowg.g:1:64: AFF
                {
                mAFF(); 

                }
                break;
            case 11 :
                // Lowg.g:1:68: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 12 :
                // Lowg.g:1:75: FRICTIONCOEF
                {
                mFRICTIONCOEF(); 

                }
                break;
            case 13 :
                // Lowg.g:1:88: WITH
                {
                mWITH(); 

                }
                break;
            case 14 :
                // Lowg.g:1:93: ID
                {
                mID(); 

                }
                break;
            case 15 :
                // Lowg.g:1:96: INT
                {
                mINT(); 

                }
                break;
            case 16 :
                // Lowg.g:1:100: FLOAT
                {
                mFLOAT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA7_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\2\56\3\uffff";
    static final String DFA7_maxS =
        "\2\71\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA7_specialS =
        "\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "104:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA8_eotS =
        "\1\uffff\5\14\3\uffff\3\14\1\uffff\1\27\1\uffff\10\14\1\uffff\1"+
        "\14\1\41\2\14\1\45\4\14\1\uffff\1\52\1\14\1\54\1\uffff\2\14\1\57"+
        "\1\14\1\uffff\1\14\1\uffff\2\14\1\uffff\1\14\1\65\1\66\2\14\2\uffff"+
        "\1\14\1\73\1\14\1\75\1\uffff\1\14\1\uffff\2\14\1\101\1\uffff";
    static final String DFA8_eofS =
        "\102\uffff";
    static final String DFA8_minS =
        "\1\11\1\105\3\101\1\102\3\uffff\1\142\1\162\1\151\1\uffff\1\56\1"+
        "\uffff\1\123\1\114\1\115\1\122\1\112\1\152\1\151\1\164\1\uffff\1"+
        "\117\1\60\1\105\1\101\1\60\1\145\1\143\1\150\1\125\1\uffff\1\60"+
        "\1\115\1\60\1\uffff\1\143\1\164\1\60\1\122\1\uffff\1\123\1\uffff"+
        "\1\164\1\151\1\uffff\1\103\2\60\1\157\1\105\2\uffff\1\156\1\60\1"+
        "\143\1\60\1\uffff\1\157\1\uffff\1\145\1\146\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\172\1\105\3\101\1\102\3\uffff\1\142\1\162\1\151\1\uffff\1\71"+
        "\1\uffff\1\123\1\114\1\115\1\122\1\112\1\152\1\151\1\164\1\uffff"+
        "\1\117\1\172\1\105\1\101\1\172\1\145\1\143\1\150\1\125\1\uffff\1"+
        "\172\1\115\1\172\1\uffff\1\143\1\164\1\172\1\122\1\uffff\1\123\1"+
        "\uffff\1\164\1\151\1\uffff\1\103\2\172\1\157\1\105\2\uffff\1\156"+
        "\1\172\1\143\1\172\1\uffff\1\157\1\uffff\1\145\1\146\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\10\1\11\1\12\3\uffff\1\16\1\uffff\1\20\10\uffff\1\17"+
        "\11\uffff\1\3\3\uffff\1\6\4\uffff\1\4\1\uffff\1\7\2\uffff\1\15\5"+
        "\uffff\1\5\1\13\4\uffff\1\1\1\uffff\1\2\3\uffff\1\14";
    static final String DFA8_specialS =
        "\102\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\15\uffff\1\16\1\uffff\12\15\1"+
            "\uffff\1\7\1\uffff\1\10\3\uffff\6\14\1\3\7\14\1\5\1\4\1\14\1"+
            "\1\3\14\1\2\4\14\6\uffff\5\14\1\12\10\14\1\11\7\14\1\13\3\14",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "\1\16\1\uffff\12\15",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "\1\40",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\42",
            "\1\43",
            "\12\14\7\uffff\22\14\1\44\7\14\6\uffff\32\14",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\53",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "",
            "\1\55",
            "\1\56",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\60",
            "",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\12\14\7\uffff\22\14\1\72\7\14\6\uffff\32\14",
            "\1\74",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
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
            return "1:1: Tokens : ( RESOURCE | RESOURCES | VAL | GAME | PARAMS | OBJ | OBJS | WS | PTVIRG | AFF | OBJECT | FRICTIONCOEF | WITH | ID | INT | FLOAT );";
        }
    }
 

}