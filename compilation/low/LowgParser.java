// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-13 20:38:57




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LowgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PARAMS", "PARAMLIST", "OBJ", "OBJS", "PTVIRG", "KEYLISTENER", "AD", "AF", "MOUSELISTENER", "KEYSTROKE", "DP", "ID", "LEFTCLICK", "LEFTDROP", "LEFTDRAG", "RIGHTCLICK", "RIGHTDROP", "INT", "FLOAT", "STRING", "OBJECT", "AFF", "POSX", "VIRG", "POSY", "POSZ", "WS", "WITH"
    };
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


        public LowgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LowgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LowgParser.tokenNames; }
    public String getGrammarFileName() { return "Lowg.g"; }


    public static class game_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // Lowg.g:32:1: game : refreshLoop resourcesSets entities PTVIRG PTVIRG -> ^( GAME resourcesSets entities ) ;
    public final LowgParser.game_return game() throws RecognitionException {
        LowgParser.game_return retval = new LowgParser.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PTVIRG4=null;
        Token PTVIRG5=null;
        LowgParser.refreshLoop_return refreshLoop1 = null;

        LowgParser.resourcesSets_return resourcesSets2 = null;

        LowgParser.entities_return entities3 = null;


        CommonTree PTVIRG4_tree=null;
        CommonTree PTVIRG5_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleSubtreeStream stream_resourcesSets=new RewriteRuleSubtreeStream(adaptor,"rule resourcesSets");
        RewriteRuleSubtreeStream stream_entities=new RewriteRuleSubtreeStream(adaptor,"rule entities");
        RewriteRuleSubtreeStream stream_refreshLoop=new RewriteRuleSubtreeStream(adaptor,"rule refreshLoop");
        try {
            // Lowg.g:32:7: ( refreshLoop resourcesSets entities PTVIRG PTVIRG -> ^( GAME resourcesSets entities ) )
            // Lowg.g:32:9: refreshLoop resourcesSets entities PTVIRG PTVIRG
            {
            pushFollow(FOLLOW_refreshLoop_in_game146);
            refreshLoop1=refreshLoop();

            state._fsp--;

            stream_refreshLoop.add(refreshLoop1.getTree());
            pushFollow(FOLLOW_resourcesSets_in_game148);
            resourcesSets2=resourcesSets();

            state._fsp--;

            stream_resourcesSets.add(resourcesSets2.getTree());
            pushFollow(FOLLOW_entities_in_game152);
            entities3=entities();

            state._fsp--;

            stream_entities.add(entities3.getTree());
            PTVIRG4=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game154);  
            stream_PTVIRG.add(PTVIRG4);

            PTVIRG5=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game156);  
            stream_PTVIRG.add(PTVIRG5);



            // AST REWRITE
            // elements: resourcesSets, entities
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 33:3: -> ^( GAME resourcesSets entities )
            {
                // Lowg.g:33:5: ^( GAME resourcesSets entities )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME, "GAME"), root_1);

                adaptor.addChild(root_1, stream_resourcesSets.nextTree());
                adaptor.addChild(root_1, stream_entities.nextTree());

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

    public static class refreshLoop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "refreshLoop"
    // Lowg.g:37:1: refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF ;
    public final LowgParser.refreshLoop_return refreshLoop() throws RecognitionException {
        LowgParser.refreshLoop_return retval = new LowgParser.refreshLoop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KEYLISTENER6=null;
        Token AD7=null;
        Token AF9=null;
        Token MOUSELISTENER10=null;
        Token AD11=null;
        Token AF13=null;
        LowgParser.keyboardCommands_return keyboardCommands8 = null;

        LowgParser.mouseCommands_return mouseCommands12 = null;


        CommonTree KEYLISTENER6_tree=null;
        CommonTree AD7_tree=null;
        CommonTree AF9_tree=null;
        CommonTree MOUSELISTENER10_tree=null;
        CommonTree AD11_tree=null;
        CommonTree AF13_tree=null;

        try {
            // Lowg.g:37:13: ( KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF )
            // Lowg.g:37:15: KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF
            {
            root_0 = (CommonTree)adaptor.nil();

            KEYLISTENER6=(Token)match(input,KEYLISTENER,FOLLOW_KEYLISTENER_in_refreshLoop179); 
            KEYLISTENER6_tree = (CommonTree)adaptor.create(KEYLISTENER6);
            adaptor.addChild(root_0, KEYLISTENER6_tree);

            AD7=(Token)match(input,AD,FOLLOW_AD_in_refreshLoop181); 
            AD7_tree = (CommonTree)adaptor.create(AD7);
            adaptor.addChild(root_0, AD7_tree);

            pushFollow(FOLLOW_keyboardCommands_in_refreshLoop183);
            keyboardCommands8=keyboardCommands();

            state._fsp--;

            adaptor.addChild(root_0, keyboardCommands8.getTree());
            AF9=(Token)match(input,AF,FOLLOW_AF_in_refreshLoop185); 
            AF9_tree = (CommonTree)adaptor.create(AF9);
            adaptor.addChild(root_0, AF9_tree);

            MOUSELISTENER10=(Token)match(input,MOUSELISTENER,FOLLOW_MOUSELISTENER_in_refreshLoop187); 
            MOUSELISTENER10_tree = (CommonTree)adaptor.create(MOUSELISTENER10);
            adaptor.addChild(root_0, MOUSELISTENER10_tree);

            AD11=(Token)match(input,AD,FOLLOW_AD_in_refreshLoop189); 
            AD11_tree = (CommonTree)adaptor.create(AD11);
            adaptor.addChild(root_0, AD11_tree);

            pushFollow(FOLLOW_mouseCommands_in_refreshLoop191);
            mouseCommands12=mouseCommands();

            state._fsp--;

            adaptor.addChild(root_0, mouseCommands12.getTree());
            AF13=(Token)match(input,AF,FOLLOW_AF_in_refreshLoop193); 
            AF13_tree = (CommonTree)adaptor.create(AF13);
            adaptor.addChild(root_0, AF13_tree);


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
    // $ANTLR end "refreshLoop"

    public static class keyboardCommands_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyboardCommands"
    // Lowg.g:39:1: keyboardCommands : ( KEYSTROKE DP signalSets )* ;
    public final LowgParser.keyboardCommands_return keyboardCommands() throws RecognitionException {
        LowgParser.keyboardCommands_return retval = new LowgParser.keyboardCommands_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KEYSTROKE14=null;
        Token DP15=null;
        LowgParser.signalSets_return signalSets16 = null;


        CommonTree KEYSTROKE14_tree=null;
        CommonTree DP15_tree=null;

        try {
            // Lowg.g:39:18: ( ( KEYSTROKE DP signalSets )* )
            // Lowg.g:39:20: ( KEYSTROKE DP signalSets )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:39:20: ( KEYSTROKE DP signalSets )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYSTROKE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lowg.g:39:21: KEYSTROKE DP signalSets
            	    {
            	    KEYSTROKE14=(Token)match(input,KEYSTROKE,FOLLOW_KEYSTROKE_in_keyboardCommands202); 
            	    KEYSTROKE14_tree = (CommonTree)adaptor.create(KEYSTROKE14);
            	    adaptor.addChild(root_0, KEYSTROKE14_tree);

            	    DP15=(Token)match(input,DP,FOLLOW_DP_in_keyboardCommands204); 
            	    DP15_tree = (CommonTree)adaptor.create(DP15);
            	    adaptor.addChild(root_0, DP15_tree);

            	    pushFollow(FOLLOW_signalSets_in_keyboardCommands206);
            	    signalSets16=signalSets();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signalSets16.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "keyboardCommands"

    public static class mouseCommands_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mouseCommands"
    // Lowg.g:42:1: mouseCommands : ( typeofclick DP signalSets )* ;
    public final LowgParser.mouseCommands_return mouseCommands() throws RecognitionException {
        LowgParser.mouseCommands_return retval = new LowgParser.mouseCommands_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DP18=null;
        LowgParser.typeofclick_return typeofclick17 = null;

        LowgParser.signalSets_return signalSets19 = null;


        CommonTree DP18_tree=null;

        try {
            // Lowg.g:42:15: ( ( typeofclick DP signalSets )* )
            // Lowg.g:42:17: ( typeofclick DP signalSets )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:42:17: ( typeofclick DP signalSets )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=LEFTCLICK && LA2_0<=RIGHTDROP)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lowg.g:42:18: typeofclick DP signalSets
            	    {
            	    pushFollow(FOLLOW_typeofclick_in_mouseCommands219);
            	    typeofclick17=typeofclick();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeofclick17.getTree());
            	    DP18=(Token)match(input,DP,FOLLOW_DP_in_mouseCommands221); 
            	    DP18_tree = (CommonTree)adaptor.create(DP18);
            	    adaptor.addChild(root_0, DP18_tree);

            	    pushFollow(FOLLOW_signalSets_in_mouseCommands223);
            	    signalSets19=signalSets();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signalSets19.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "mouseCommands"

    public static class signalSets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signalSets"
    // Lowg.g:44:1: signalSets : ( signal )+ ;
    public final LowgParser.signalSets_return signalSets() throws RecognitionException {
        LowgParser.signalSets_return retval = new LowgParser.signalSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.signal_return signal20 = null;



        try {
            // Lowg.g:44:12: ( ( signal )+ )
            // Lowg.g:44:14: ( signal )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:44:14: ( signal )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Lowg.g:44:14: signal
            	    {
            	    pushFollow(FOLLOW_signal_in_signalSets233);
            	    signal20=signal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signal20.getTree());

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
    // $ANTLR end "signalSets"

    public static class signal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signal"
    // Lowg.g:46:1: signal : ID ;
    public final LowgParser.signal_return signal() throws RecognitionException {
        LowgParser.signal_return retval = new LowgParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID21=null;

        CommonTree ID21_tree=null;

        try {
            // Lowg.g:46:8: ( ID )
            // Lowg.g:46:10: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID21=(Token)match(input,ID,FOLLOW_ID_in_signal242); 
            ID21_tree = (CommonTree)adaptor.create(ID21);
            adaptor.addChild(root_0, ID21_tree);


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
    // $ANTLR end "signal"

    public static class typeofclick_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeofclick"
    // Lowg.g:48:1: typeofclick : ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP );
    public final LowgParser.typeofclick_return typeofclick() throws RecognitionException {
        LowgParser.typeofclick_return retval = new LowgParser.typeofclick_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set22=null;

        CommonTree set22_tree=null;

        try {
            // Lowg.g:48:13: ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set22=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFTCLICK && input.LA(1)<=RIGHTDROP) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set22));
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
    // $ANTLR end "typeofclick"

    public static class resourcesSets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resourcesSets"
    // Lowg.g:52:1: resourcesSets : ( resource )+ -> ^( RESOURCES ( resource )+ ) ;
    public final LowgParser.resourcesSets_return resourcesSets() throws RecognitionException {
        LowgParser.resourcesSets_return retval = new LowgParser.resourcesSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.resource_return resource23 = null;


        RewriteRuleSubtreeStream stream_resource=new RewriteRuleSubtreeStream(adaptor,"rule resource");
        try {
            // Lowg.g:52:15: ( ( resource )+ -> ^( RESOURCES ( resource )+ ) )
            // Lowg.g:52:17: ( resource )+
            {
            // Lowg.g:52:17: ( resource )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Lowg.g:52:17: resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets279);
            	    resource23=resource();

            	    state._fsp--;

            	    stream_resource.add(resource23.getTree());

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



            // AST REWRITE
            // elements: resource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:3: -> ^( RESOURCES ( resource )+ )
            {
                // Lowg.g:54:5: ^( RESOURCES ( resource )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RESOURCES, "RESOURCES"), root_1);

                if ( !(stream_resource.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_resource.hasNext() ) {
                    adaptor.addChild(root_1, stream_resource.nextTree());

                }
                stream_resource.reset();

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
    // $ANTLR end "resourcesSets"

    public static class resource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resource"
    // Lowg.g:59:1: resource : ID initValue PTVIRG -> ^( RESOURCE ID initValue ) ;
    public final LowgParser.resource_return resource() throws RecognitionException {
        LowgParser.resource_return retval = new LowgParser.resource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID24=null;
        Token PTVIRG26=null;
        LowgParser.initValue_return initValue25 = null;


        CommonTree ID24_tree=null;
        CommonTree PTVIRG26_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_initValue=new RewriteRuleSubtreeStream(adaptor,"rule initValue");
        try {
            // Lowg.g:59:10: ( ID initValue PTVIRG -> ^( RESOURCE ID initValue ) )
            // Lowg.g:59:12: ID initValue PTVIRG
            {
            ID24=(Token)match(input,ID,FOLLOW_ID_in_resource307);  
            stream_ID.add(ID24);

            pushFollow(FOLLOW_initValue_in_resource310);
            initValue25=initValue();

            state._fsp--;

            stream_initValue.add(initValue25.getTree());
            PTVIRG26=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_resource312);  
            stream_PTVIRG.add(PTVIRG26);



            // AST REWRITE
            // elements: ID, initValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:2: -> ^( RESOURCE ID initValue )
            {
                // Lowg.g:60:5: ^( RESOURCE ID initValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RESOURCE, "RESOURCE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_initValue.nextTree());

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
    // $ANTLR end "resource"

    public static class initNumValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initNumValue"
    // Lowg.g:66:1: initNumValue : ( INT | FLOAT );
    public final LowgParser.initNumValue_return initNumValue() throws RecognitionException {
        LowgParser.initNumValue_return retval = new LowgParser.initNumValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set27=null;

        CommonTree set27_tree=null;

        try {
            // Lowg.g:66:14: ( INT | FLOAT )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set27=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=FLOAT) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set27));
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
    // $ANTLR end "initNumValue"

    public static class initValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initValue"
    // Lowg.g:68:1: initValue : ( initNumValue | STRING );
    public final LowgParser.initValue_return initValue() throws RecognitionException {
        LowgParser.initValue_return retval = new LowgParser.initValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING29=null;
        LowgParser.initNumValue_return initNumValue28 = null;


        CommonTree STRING29_tree=null;

        try {
            // Lowg.g:68:11: ( initNumValue | STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=INT && LA5_0<=FLOAT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Lowg.g:68:13: initNumValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_initNumValue_in_initValue348);
                    initNumValue28=initNumValue();

                    state._fsp--;

                    adaptor.addChild(root_0, initNumValue28.getTree());

                    }
                    break;
                case 2 :
                    // Lowg.g:68:28: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING29=(Token)match(input,STRING,FOLLOW_STRING_in_initValue352); 
                    STRING29_tree = (CommonTree)adaptor.create(STRING29);
                    adaptor.addChild(root_0, STRING29_tree);


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
    // $ANTLR end "initValue"

    public static class entities_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entities"
    // Lowg.g:73:1: entities : ( object )+ -> ^( OBJS ( object )+ ) ;
    public final LowgParser.entities_return entities() throws RecognitionException {
        LowgParser.entities_return retval = new LowgParser.entities_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.object_return object30 = null;


        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // Lowg.g:73:10: ( ( object )+ -> ^( OBJS ( object )+ ) )
            // Lowg.g:73:12: ( object )+
            {
            // Lowg.g:73:12: ( object )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==OBJECT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Lowg.g:73:12: object
            	    {
            	    pushFollow(FOLLOW_object_in_entities365);
            	    object30=object();

            	    state._fsp--;

            	    stream_object.add(object30.getTree());

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



            // AST REWRITE
            // elements: object
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 74:3: -> ^( OBJS ( object )+ )
            {
                // Lowg.g:74:5: ^( OBJS ( object )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJS, "OBJS"), root_1);

                if ( !(stream_object.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_object.hasNext() ) {
                    adaptor.addChild(root_1, stream_object.nextTree());

                }
                stream_object.reset();

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
    // $ANTLR end "entities"

    public static class object_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // Lowg.g:78:1: object : OBJECT ID AFF parameters PTVIRG -> ^( OBJ ID parameters ) ;
    public final LowgParser.object_return object() throws RecognitionException {
        LowgParser.object_return retval = new LowgParser.object_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OBJECT31=null;
        Token ID32=null;
        Token AFF33=null;
        Token PTVIRG35=null;
        LowgParser.parameters_return parameters34 = null;


        CommonTree OBJECT31_tree=null;
        CommonTree ID32_tree=null;
        CommonTree AFF33_tree=null;
        CommonTree PTVIRG35_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_OBJECT=new RewriteRuleTokenStream(adaptor,"token OBJECT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // Lowg.g:78:8: ( OBJECT ID AFF parameters PTVIRG -> ^( OBJ ID parameters ) )
            // Lowg.g:78:10: OBJECT ID AFF parameters PTVIRG
            {
            OBJECT31=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_object387);  
            stream_OBJECT.add(OBJECT31);

            ID32=(Token)match(input,ID,FOLLOW_ID_in_object389);  
            stream_ID.add(ID32);

            AFF33=(Token)match(input,AFF,FOLLOW_AFF_in_object391);  
            stream_AFF.add(AFF33);

            pushFollow(FOLLOW_parameters_in_object394);
            parameters34=parameters();

            state._fsp--;

            stream_parameters.add(parameters34.getTree());
            PTVIRG35=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_object396);  
            stream_PTVIRG.add(PTVIRG35);



            // AST REWRITE
            // elements: ID, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:3: -> ^( OBJ ID parameters )
            {
                // Lowg.g:79:5: ^( OBJ ID parameters )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_parameters.nextTree());

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
    // $ANTLR end "object"

    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // Lowg.g:82:1: parameters : POSX AFF initNumValue VIRG POSY AFF initNumValue VIRG POSZ AFF initNumValue paramlist -> ^( PARAMS POSX initNumValue POSY initNumValue POSZ initNumValue paramlist ) ;
    public final LowgParser.parameters_return parameters() throws RecognitionException {
        LowgParser.parameters_return retval = new LowgParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POSX36=null;
        Token AFF37=null;
        Token VIRG39=null;
        Token POSY40=null;
        Token AFF41=null;
        Token VIRG43=null;
        Token POSZ44=null;
        Token AFF45=null;
        LowgParser.initNumValue_return initNumValue38 = null;

        LowgParser.initNumValue_return initNumValue42 = null;

        LowgParser.initNumValue_return initNumValue46 = null;

        LowgParser.paramlist_return paramlist47 = null;


        CommonTree POSX36_tree=null;
        CommonTree AFF37_tree=null;
        CommonTree VIRG39_tree=null;
        CommonTree POSY40_tree=null;
        CommonTree AFF41_tree=null;
        CommonTree VIRG43_tree=null;
        CommonTree POSZ44_tree=null;
        CommonTree AFF45_tree=null;
        RewriteRuleTokenStream stream_POSY=new RewriteRuleTokenStream(adaptor,"token POSY");
        RewriteRuleTokenStream stream_POSX=new RewriteRuleTokenStream(adaptor,"token POSX");
        RewriteRuleTokenStream stream_POSZ=new RewriteRuleTokenStream(adaptor,"token POSZ");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        RewriteRuleSubtreeStream stream_initNumValue=new RewriteRuleSubtreeStream(adaptor,"rule initNumValue");
        try {
            // Lowg.g:82:12: ( POSX AFF initNumValue VIRG POSY AFF initNumValue VIRG POSZ AFF initNumValue paramlist -> ^( PARAMS POSX initNumValue POSY initNumValue POSZ initNumValue paramlist ) )
            // Lowg.g:82:14: POSX AFF initNumValue VIRG POSY AFF initNumValue VIRG POSZ AFF initNumValue paramlist
            {
            POSX36=(Token)match(input,POSX,FOLLOW_POSX_in_parameters418);  
            stream_POSX.add(POSX36);

            AFF37=(Token)match(input,AFF,FOLLOW_AFF_in_parameters420);  
            stream_AFF.add(AFF37);

            pushFollow(FOLLOW_initNumValue_in_parameters422);
            initNumValue38=initNumValue();

            state._fsp--;

            stream_initNumValue.add(initNumValue38.getTree());
            VIRG39=(Token)match(input,VIRG,FOLLOW_VIRG_in_parameters424);  
            stream_VIRG.add(VIRG39);

            POSY40=(Token)match(input,POSY,FOLLOW_POSY_in_parameters426);  
            stream_POSY.add(POSY40);

            AFF41=(Token)match(input,AFF,FOLLOW_AFF_in_parameters428);  
            stream_AFF.add(AFF41);

            pushFollow(FOLLOW_initNumValue_in_parameters430);
            initNumValue42=initNumValue();

            state._fsp--;

            stream_initNumValue.add(initNumValue42.getTree());
            VIRG43=(Token)match(input,VIRG,FOLLOW_VIRG_in_parameters432);  
            stream_VIRG.add(VIRG43);

            POSZ44=(Token)match(input,POSZ,FOLLOW_POSZ_in_parameters434);  
            stream_POSZ.add(POSZ44);

            AFF45=(Token)match(input,AFF,FOLLOW_AFF_in_parameters436);  
            stream_AFF.add(AFF45);

            pushFollow(FOLLOW_initNumValue_in_parameters438);
            initNumValue46=initNumValue();

            state._fsp--;

            stream_initNumValue.add(initNumValue46.getTree());
            pushFollow(FOLLOW_paramlist_in_parameters440);
            paramlist47=paramlist();

            state._fsp--;

            stream_paramlist.add(paramlist47.getTree());


            // AST REWRITE
            // elements: POSY, initNumValue, POSZ, paramlist, initNumValue, initNumValue, POSX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 83:3: -> ^( PARAMS POSX initNumValue POSY initNumValue POSZ initNumValue paramlist )
            {
                // Lowg.g:83:5: ^( PARAMS POSX initNumValue POSY initNumValue POSZ initNumValue paramlist )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_1);

                adaptor.addChild(root_1, stream_POSX.nextNode());
                adaptor.addChild(root_1, stream_initNumValue.nextTree());
                adaptor.addChild(root_1, stream_POSY.nextNode());
                adaptor.addChild(root_1, stream_initNumValue.nextTree());
                adaptor.addChild(root_1, stream_POSZ.nextNode());
                adaptor.addChild(root_1, stream_initNumValue.nextTree());
                adaptor.addChild(root_1, stream_paramlist.nextTree());

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
    // $ANTLR end "parameters"

    public static class paramlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramlist"
    // Lowg.g:87:1: paramlist : ( VIRG ID AFF initValue )* -> ^( PARAMLIST ( ID initValue )* ) ;
    public final LowgParser.paramlist_return paramlist() throws RecognitionException {
        LowgParser.paramlist_return retval = new LowgParser.paramlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG48=null;
        Token ID49=null;
        Token AFF50=null;
        LowgParser.initValue_return initValue51 = null;


        CommonTree VIRG48_tree=null;
        CommonTree ID49_tree=null;
        CommonTree AFF50_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_initValue=new RewriteRuleSubtreeStream(adaptor,"rule initValue");
        try {
            // Lowg.g:87:11: ( ( VIRG ID AFF initValue )* -> ^( PARAMLIST ( ID initValue )* ) )
            // Lowg.g:87:13: ( VIRG ID AFF initValue )*
            {
            // Lowg.g:87:13: ( VIRG ID AFF initValue )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VIRG) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Lowg.g:87:14: VIRG ID AFF initValue
            	    {
            	    VIRG48=(Token)match(input,VIRG,FOLLOW_VIRG_in_paramlist474);  
            	    stream_VIRG.add(VIRG48);

            	    ID49=(Token)match(input,ID,FOLLOW_ID_in_paramlist476);  
            	    stream_ID.add(ID49);

            	    AFF50=(Token)match(input,AFF,FOLLOW_AFF_in_paramlist478);  
            	    stream_AFF.add(AFF50);

            	    pushFollow(FOLLOW_initValue_in_paramlist480);
            	    initValue51=initValue();

            	    state._fsp--;

            	    stream_initValue.add(initValue51.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: initValue, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:3: -> ^( PARAMLIST ( ID initValue )* )
            {
                // Lowg.g:88:5: ^( PARAMLIST ( ID initValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMLIST, "PARAMLIST"), root_1);

                // Lowg.g:88:17: ( ID initValue )*
                while ( stream_initValue.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());
                    adaptor.addChild(root_1, stream_initValue.nextTree());

                }
                stream_initValue.reset();
                stream_ID.reset();

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
    // $ANTLR end "paramlist"

    // Delegated rules


 

    public static final BitSet FOLLOW_refreshLoop_in_game146 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_resourcesSets_in_game148 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_entities_in_game152 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_game154 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_game156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYLISTENER_in_refreshLoop179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop181 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_keyboardCommands_in_refreshLoop183 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop185 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MOUSELISTENER_in_refreshLoop187 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop189 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_mouseCommands_in_refreshLoop191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYSTROKE_in_keyboardCommands202 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DP_in_keyboardCommands204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_signalSets_in_keyboardCommands206 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_typeofclick_in_mouseCommands219 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DP_in_mouseCommands221 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_signalSets_in_mouseCommands223 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_signal_in_signalSets233 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_signal242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeofclick0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_resourcesSets279 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_resource307 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_initValue_in_resource310 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_resource312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_initNumValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initNumValue_in_initValue348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_initValue352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_entities365 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_OBJECT_in_object387 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_object389 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AFF_in_object391 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_parameters_in_object394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_object396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSX_in_parameters418 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AFF_in_parameters420 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_parameters422 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VIRG_in_parameters424 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_POSY_in_parameters426 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AFF_in_parameters428 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_parameters430 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VIRG_in_parameters432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_POSZ_in_parameters434 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AFF_in_parameters436 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_parameters438 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_paramlist_in_parameters440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VIRG_in_paramlist474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_paramlist476 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AFF_in_paramlist478 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_initValue_in_paramlist480 = new BitSet(new long[]{0x0000000100000002L});

}