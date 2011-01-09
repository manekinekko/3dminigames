// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-09 16:39:59




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LowgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "GAME", "PTVIRG", "ID", "INT", "FLOAT", "WS"
    };
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int GAME=7;
    public static final int PTVIRG=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int FLOAT=11;
    public static final int WS=12;

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
    // Lowg.g:27:1: game : resourcesSets PTVIRG EOF -> ^( GAME resourcesSets EOF ) ;
    public final LowgParser.game_return game() throws RecognitionException {
        LowgParser.game_return retval = new LowgParser.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PTVIRG2=null;
        Token EOF3=null;
        LowgParser.resourcesSets_return resourcesSets1 = null;


        CommonTree PTVIRG2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_resourcesSets=new RewriteRuleSubtreeStream(adaptor,"rule resourcesSets");
        try {
            // Lowg.g:27:7: ( resourcesSets PTVIRG EOF -> ^( GAME resourcesSets EOF ) )
            // Lowg.g:27:42: resourcesSets PTVIRG EOF
            {
            pushFollow(FOLLOW_resourcesSets_in_game93);
            resourcesSets1=resourcesSets();

            state._fsp--;

            stream_resourcesSets.add(resourcesSets1.getTree());
            PTVIRG2=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game97);  
            stream_PTVIRG.add(PTVIRG2);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_game99);  
            stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: resourcesSets, EOF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 28:3: -> ^( GAME resourcesSets EOF )
            {
                // Lowg.g:28:5: ^( GAME resourcesSets EOF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME, "GAME"), root_1);

                adaptor.addChild(root_1, stream_resourcesSets.nextTree());
                adaptor.addChild(root_1, stream_EOF.nextNode());

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

    public static class resourcesSets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resourcesSets"
    // Lowg.g:74:1: resourcesSets : ( resource )+ -> ^( RESOURCES ( resource )+ ) ;
    public final LowgParser.resourcesSets_return resourcesSets() throws RecognitionException {
        LowgParser.resourcesSets_return retval = new LowgParser.resourcesSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.resource_return resource4 = null;


        RewriteRuleSubtreeStream stream_resource=new RewriteRuleSubtreeStream(adaptor,"rule resource");
        try {
            // Lowg.g:74:15: ( ( resource )+ -> ^( RESOURCES ( resource )+ ) )
            // Lowg.g:74:37: ( resource )+
            {
            // Lowg.g:74:37: ( resource )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lowg.g:74:37: resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets120);
            	    resource4=resource();

            	    state._fsp--;

            	    stream_resource.add(resource4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
            // 76:3: -> ^( RESOURCES ( resource )+ )
            {
                // Lowg.g:76:5: ^( RESOURCES ( resource )+ )
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
    // Lowg.g:88:1: resource : ID initValue -> ^( RESOURCE ID initValue ) ;
    public final LowgParser.resource_return resource() throws RecognitionException {
        LowgParser.resource_return retval = new LowgParser.resource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID5=null;
        LowgParser.initValue_return initValue6 = null;


        CommonTree ID5_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_initValue=new RewriteRuleSubtreeStream(adaptor,"rule initValue");
        try {
            // Lowg.g:88:10: ( ID initValue -> ^( RESOURCE ID initValue ) )
            // Lowg.g:88:37: ID initValue
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_resource153);  
            stream_ID.add(ID5);

            pushFollow(FOLLOW_initValue_in_resource157);
            initValue6=initValue();

            state._fsp--;

            stream_initValue.add(initValue6.getTree());


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
            // 89:2: -> ^( RESOURCE ID initValue )
            {
                // Lowg.g:89:5: ^( RESOURCE ID initValue )
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

    public static class initValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initValue"
    // Lowg.g:98:1: initValue : ( INT | FLOAT );
    public final LowgParser.initValue_return initValue() throws RecognitionException {
        LowgParser.initValue_return retval = new LowgParser.initValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // Lowg.g:98:11: ( INT | FLOAT )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set7=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=FLOAT) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set7));
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
    // $ANTLR end "initValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_resourcesSets_in_game93 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PTVIRG_in_game97 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_game99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_resourcesSets120 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ID_in_resource153 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_initValue_in_resource157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_initValue0 = new BitSet(new long[]{0x0000000000000002L});

}