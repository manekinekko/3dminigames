// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-10 19:55:38

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
    public static final int PTVIRG=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int FLOAT=12;
    public static final int OBJECT=13;
    public static final int AFF=14;
    public static final int FRICTIONCOEF=15;
    public static final int WS=16;
    public static final int WITH=17;

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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lowg.g:72:17: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // Lowg.g:72:20: ( ' ' | '\\n' | '\\t' | '\\r' )
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
            // Lowg.g:77:8: ( ';' )
            // Lowg.g:77:10: ';'
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
            // Lowg.g:78:5: ( '=' )
            // Lowg.g:78:7: '='
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
            // Lowg.g:82:8: ( 'object' )
            // Lowg.g:82:10: 'object'
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
            // Lowg.g:86:15: ( 'frictioncoef' )
            // Lowg.g:86:17: 'frictioncoef'
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
            // Lowg.g:88:6: ( 'with' )
            // Lowg.g:88:8: 'with'
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
            // Lowg.g:90:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Lowg.g:90:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Lowg.g:90:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // Lowg.g:93:5: ( ( '0' .. '9' )+ )
            // Lowg.g:93:7: ( '0' .. '9' )+
            {
            // Lowg.g:93:7: ( '0' .. '9' )+
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
            	    // Lowg.g:93:7: '0' .. '9'
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
            // Lowg.g:97:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // Lowg.g:97:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // Lowg.g:97:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:97:10: '0' .. '9'
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
                    // Lowg.g:97:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Lowg.g:97:26: '0' .. '9'
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
                    // Lowg.g:98:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Lowg.g:98:13: ( '0' .. '9' )+
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
                    	    // Lowg.g:98:14: '0' .. '9'
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
                    // Lowg.g:99:9: ( '0' .. '9' )+
                    {
                    // Lowg.g:99:9: ( '0' .. '9' )+
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
                    	    // Lowg.g:99:10: '0' .. '9'
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
        // Lowg.g:1:8: ( RESOURCE | RESOURCES | VAL | GAME | WS | PTVIRG | AFF | OBJECT | FRICTIONCOEF | WITH | ID | INT | FLOAT )
        int alt8=13;
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
                // Lowg.g:1:38: WS
                {
                mWS(); 

                }
                break;
            case 6 :
                // Lowg.g:1:41: PTVIRG
                {
                mPTVIRG(); 

                }
                break;
            case 7 :
                // Lowg.g:1:48: AFF
                {
                mAFF(); 

                }
                break;
            case 8 :
                // Lowg.g:1:52: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 9 :
                // Lowg.g:1:59: FRICTIONCOEF
                {
                mFRICTIONCOEF(); 

                }
                break;
            case 10 :
                // Lowg.g:1:72: WITH
                {
                mWITH(); 

                }
                break;
            case 11 :
                // Lowg.g:1:77: ID
                {
                mID(); 

                }
                break;
            case 12 :
                // Lowg.g:1:80: INT
                {
                mINT(); 

                }
                break;
            case 13 :
                // Lowg.g:1:84: FLOAT
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
            return "96:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA8_eotS =
        "\1\uffff\3\12\3\uffff\3\12\1\uffff\1\23\1\uffff\6\12\1\uffff\1\12"+
        "\1\33\5\12\1\uffff\1\41\2\12\1\44\1\12\1\uffff\2\12\1\uffff\1\12"+
        "\1\51\2\12\1\uffff\1\12\1\56\1\12\1\60\1\uffff\1\12\1\uffff\2\12"+
        "\1\64\1\uffff";
    static final String DFA8_eofS =
        "\65\uffff";
    static final String DFA8_minS =
        "\1\11\1\105\2\101\3\uffff\1\142\1\162\1\151\1\uffff\1\56\1\uffff"+
        "\1\123\1\114\1\115\1\152\1\151\1\164\1\uffff\1\117\1\60\1\105\1"+
        "\145\1\143\1\150\1\125\1\uffff\1\60\1\143\1\164\1\60\1\122\1\uffff"+
        "\1\164\1\151\1\uffff\1\103\1\60\1\157\1\105\1\uffff\1\156\1\60\1"+
        "\143\1\60\1\uffff\1\157\1\uffff\1\145\1\146\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\172\1\105\2\101\3\uffff\1\142\1\162\1\151\1\uffff\1\71\1\uffff"+
        "\1\123\1\114\1\115\1\152\1\151\1\164\1\uffff\1\117\1\172\1\105\1"+
        "\145\1\143\1\150\1\125\1\uffff\1\172\1\143\1\164\1\172\1\122\1\uffff"+
        "\1\164\1\151\1\uffff\1\103\1\172\1\157\1\105\1\uffff\1\156\1\172"+
        "\1\143\1\172\1\uffff\1\157\1\uffff\1\145\1\146\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\4\uffff\1\5\1\6\1\7\3\uffff\1\13\1\uffff\1\15\6\uffff\1\14\7\uffff"+
        "\1\3\5\uffff\1\4\2\uffff\1\12\4\uffff\1\10\4\uffff\1\1\1\uffff\1"+
        "\2\3\uffff\1\11";
    static final String DFA8_specialS =
        "\65\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\4\2\uffff\1\4\22\uffff\1\4\15\uffff\1\14\1\uffff\12\13\1"+
            "\uffff\1\5\1\uffff\1\6\3\uffff\6\12\1\3\12\12\1\1\3\12\1\2\4"+
            "\12\6\uffff\5\12\1\10\10\12\1\7\7\12\1\11\3\12",
            "\1\15",
            "\1\16",
            "\1\17",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            "\1\14\1\uffff\12\13",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\42",
            "\1\43",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\52",
            "\1\53",
            "",
            "\1\54",
            "\12\12\7\uffff\22\12\1\55\7\12\6\uffff\32\12",
            "\1\57",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
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
            return "1:1: Tokens : ( RESOURCE | RESOURCES | VAL | GAME | WS | PTVIRG | AFF | OBJECT | FRICTIONCOEF | WITH | ID | INT | FLOAT );";
        }
    }
 

}