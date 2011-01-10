// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-10 23:24:44




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LowgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PARAMS", "OBJ", "OBJS", "PTVIRG", "ID", "INT", "FLOAT", "OBJECT", "AFF", "FRICTIONCOEF", "WS", "WITH"
    };
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
    // Lowg.g:30:1: game : resourcesSets entities PTVIRG PTVIRG -> ^( GAME resourcesSets entities ) ;
    public final LowgParser.game_return game() throws RecognitionException {
        LowgParser.game_return retval = new LowgParser.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PTVIRG3=null;
        Token PTVIRG4=null;
        LowgParser.resourcesSets_return resourcesSets1 = null;

        LowgParser.entities_return entities2 = null;


        CommonTree PTVIRG3_tree=null;
        CommonTree PTVIRG4_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleSubtreeStream stream_resourcesSets=new RewriteRuleSubtreeStream(adaptor,"rule resourcesSets");
        RewriteRuleSubtreeStream stream_entities=new RewriteRuleSubtreeStream(adaptor,"rule entities");
        try {
            // Lowg.g:30:7: ( resourcesSets entities PTVIRG PTVIRG -> ^( GAME resourcesSets entities ) )
            // Lowg.g:30:9: resourcesSets entities PTVIRG PTVIRG
            {
            pushFollow(FOLLOW_resourcesSets_in_game132);
            resourcesSets1=resourcesSets();

            state._fsp--;

            stream_resourcesSets.add(resourcesSets1.getTree());
            pushFollow(FOLLOW_entities_in_game136);
            entities2=entities();

            state._fsp--;

            stream_entities.add(entities2.getTree());
            PTVIRG3=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game138);  
            stream_PTVIRG.add(PTVIRG3);

            PTVIRG4=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game140);  
            stream_PTVIRG.add(PTVIRG4);



            // AST REWRITE
            // elements: entities, resourcesSets
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:3: -> ^( GAME resourcesSets entities )
            {
                // Lowg.g:31:5: ^( GAME resourcesSets entities )
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

    public static class resourcesSets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resourcesSets"
    // Lowg.g:36:1: resourcesSets : ( resource )+ -> ^( RESOURCES ( resource )+ ) ;
    public final LowgParser.resourcesSets_return resourcesSets() throws RecognitionException {
        LowgParser.resourcesSets_return retval = new LowgParser.resourcesSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.resource_return resource5 = null;


        RewriteRuleSubtreeStream stream_resource=new RewriteRuleSubtreeStream(adaptor,"rule resource");
        try {
            // Lowg.g:36:15: ( ( resource )+ -> ^( RESOURCES ( resource )+ ) )
            // Lowg.g:36:17: ( resource )+
            {
            // Lowg.g:36:17: ( resource )+
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
            	    // Lowg.g:36:17: resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets163);
            	    resource5=resource();

            	    state._fsp--;

            	    stream_resource.add(resource5.getTree());

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
            // 38:3: -> ^( RESOURCES ( resource )+ )
            {
                // Lowg.g:38:5: ^( RESOURCES ( resource )+ )
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
    // Lowg.g:43:1: resource : ID initValue PTVIRG -> ^( RESOURCE ID initValue ) ;
    public final LowgParser.resource_return resource() throws RecognitionException {
        LowgParser.resource_return retval = new LowgParser.resource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID6=null;
        Token PTVIRG8=null;
        LowgParser.initValue_return initValue7 = null;


        CommonTree ID6_tree=null;
        CommonTree PTVIRG8_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_initValue=new RewriteRuleSubtreeStream(adaptor,"rule initValue");
        try {
            // Lowg.g:43:10: ( ID initValue PTVIRG -> ^( RESOURCE ID initValue ) )
            // Lowg.g:43:12: ID initValue PTVIRG
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_resource191);  
            stream_ID.add(ID6);

            pushFollow(FOLLOW_initValue_in_resource194);
            initValue7=initValue();

            state._fsp--;

            stream_initValue.add(initValue7.getTree());
            PTVIRG8=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_resource196);  
            stream_PTVIRG.add(PTVIRG8);



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
            // 44:2: -> ^( RESOURCE ID initValue )
            {
                // Lowg.g:44:5: ^( RESOURCE ID initValue )
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
    // Lowg.g:50:1: initValue : ( INT | FLOAT );
    public final LowgParser.initValue_return initValue() throws RecognitionException {
        LowgParser.initValue_return retval = new LowgParser.initValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // Lowg.g:50:11: ( INT | FLOAT )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=FLOAT) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set9));
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

    public static class entities_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entities"
    // Lowg.g:57:1: entities : ( object )+ -> ^( OBJS ( object )+ ) ;
    public final LowgParser.entities_return entities() throws RecognitionException {
        LowgParser.entities_return retval = new LowgParser.entities_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.object_return object10 = null;


        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // Lowg.g:57:10: ( ( object )+ -> ^( OBJS ( object )+ ) )
            // Lowg.g:57:12: ( object )+
            {
            // Lowg.g:57:12: ( object )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OBJECT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lowg.g:57:12: object
            	    {
            	    pushFollow(FOLLOW_object_in_entities238);
            	    object10=object();

            	    state._fsp--;

            	    stream_object.add(object10.getTree());

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
            // 58:3: -> ^( OBJS ( object )+ )
            {
                // Lowg.g:58:5: ^( OBJS ( object )+ )
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
    // Lowg.g:62:1: object : OBJECT AFF ID parameters PTVIRG -> ^( OBJ ID parameters ) ;
    public final LowgParser.object_return object() throws RecognitionException {
        LowgParser.object_return retval = new LowgParser.object_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OBJECT11=null;
        Token AFF12=null;
        Token ID13=null;
        Token PTVIRG15=null;
        LowgParser.parameters_return parameters14 = null;


        CommonTree OBJECT11_tree=null;
        CommonTree AFF12_tree=null;
        CommonTree ID13_tree=null;
        CommonTree PTVIRG15_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_OBJECT=new RewriteRuleTokenStream(adaptor,"token OBJECT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // Lowg.g:62:8: ( OBJECT AFF ID parameters PTVIRG -> ^( OBJ ID parameters ) )
            // Lowg.g:62:10: OBJECT AFF ID parameters PTVIRG
            {
            OBJECT11=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_object260);  
            stream_OBJECT.add(OBJECT11);

            AFF12=(Token)match(input,AFF,FOLLOW_AFF_in_object262);  
            stream_AFF.add(AFF12);

            ID13=(Token)match(input,ID,FOLLOW_ID_in_object264);  
            stream_ID.add(ID13);

            pushFollow(FOLLOW_parameters_in_object266);
            parameters14=parameters();

            state._fsp--;

            stream_parameters.add(parameters14.getTree());
            PTVIRG15=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_object268);  
            stream_PTVIRG.add(PTVIRG15);



            // AST REWRITE
            // elements: parameters, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:3: -> ^( OBJ ID parameters )
            {
                // Lowg.g:63:5: ^( OBJ ID parameters )
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
    // Lowg.g:66:1: parameters : FRICTIONCOEF AFF FLOAT -> ^( PARAMS FRICTIONCOEF FLOAT ) ;
    public final LowgParser.parameters_return parameters() throws RecognitionException {
        LowgParser.parameters_return retval = new LowgParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FRICTIONCOEF16=null;
        Token AFF17=null;
        Token FLOAT18=null;

        CommonTree FRICTIONCOEF16_tree=null;
        CommonTree AFF17_tree=null;
        CommonTree FLOAT18_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_FRICTIONCOEF=new RewriteRuleTokenStream(adaptor,"token FRICTIONCOEF");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");

        try {
            // Lowg.g:66:12: ( FRICTIONCOEF AFF FLOAT -> ^( PARAMS FRICTIONCOEF FLOAT ) )
            // Lowg.g:66:14: FRICTIONCOEF AFF FLOAT
            {
            FRICTIONCOEF16=(Token)match(input,FRICTIONCOEF,FOLLOW_FRICTIONCOEF_in_parameters290);  
            stream_FRICTIONCOEF.add(FRICTIONCOEF16);

            AFF17=(Token)match(input,AFF,FOLLOW_AFF_in_parameters292);  
            stream_AFF.add(AFF17);

            FLOAT18=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parameters294);  
            stream_FLOAT.add(FLOAT18);



            // AST REWRITE
            // elements: FRICTIONCOEF, FLOAT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:3: -> ^( PARAMS FRICTIONCOEF FLOAT )
            {
                // Lowg.g:67:5: ^( PARAMS FRICTIONCOEF FLOAT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_1);

                adaptor.addChild(root_1, stream_FRICTIONCOEF.nextNode());
                adaptor.addChild(root_1, stream_FLOAT.nextNode());

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

    // Delegated rules


 

    public static final BitSet FOLLOW_resourcesSets_in_game132 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_entities_in_game136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PTVIRG_in_game138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PTVIRG_in_game140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_resourcesSets163 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ID_in_resource191 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_initValue_in_resource194 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PTVIRG_in_resource196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_initValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_entities238 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OBJECT_in_object260 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_AFF_in_object262 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_object264 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameters_in_object266 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PTVIRG_in_object268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRICTIONCOEF_in_parameters290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_AFF_in_parameters292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FLOAT_in_parameters294 = new BitSet(new long[]{0x0000000000000002L});

}