// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-10 20:30:15




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LowgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PTVIRG", "ID", "INT", "FLOAT", "OBJECT", "AFF", "FRICTIONCOEF", "WS", "WITH"
    };
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
    // Lowg.g:28:1: game : resourcesSets entities PTVIRG PTVIRG -> ^( GAME resourcesSets entities ) ;
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
            // Lowg.g:28:7: ( resourcesSets entities PTVIRG PTVIRG -> ^( GAME resourcesSets entities ) )
            // Lowg.g:28:9: resourcesSets entities PTVIRG PTVIRG
            {
            pushFollow(FOLLOW_resourcesSets_in_game102);
            resourcesSets1=resourcesSets();

            state._fsp--;

            stream_resourcesSets.add(resourcesSets1.getTree());
            pushFollow(FOLLOW_entities_in_game106);
            entities2=entities();

            state._fsp--;

            stream_entities.add(entities2.getTree());
            PTVIRG3=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game108);  
            stream_PTVIRG.add(PTVIRG3);

            PTVIRG4=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game110);  
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
            // 29:3: -> ^( GAME resourcesSets entities )
            {
                // Lowg.g:29:5: ^( GAME resourcesSets entities )
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
    // Lowg.g:34:1: resourcesSets : ( resource )+ -> ^( RESOURCES ( resource )+ ) ;
    public final LowgParser.resourcesSets_return resourcesSets() throws RecognitionException {
        LowgParser.resourcesSets_return retval = new LowgParser.resourcesSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.resource_return resource5 = null;


        RewriteRuleSubtreeStream stream_resource=new RewriteRuleSubtreeStream(adaptor,"rule resource");
        try {
            // Lowg.g:34:15: ( ( resource )+ -> ^( RESOURCES ( resource )+ ) )
            // Lowg.g:34:17: ( resource )+
            {
            // Lowg.g:34:17: ( resource )+
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
            	    // Lowg.g:34:17: resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets133);
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
            // 36:3: -> ^( RESOURCES ( resource )+ )
            {
                // Lowg.g:36:5: ^( RESOURCES ( resource )+ )
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
    // Lowg.g:41:1: resource : ID initValue PTVIRG -> ^( RESOURCE ID initValue ) ;
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
            // Lowg.g:41:10: ( ID initValue PTVIRG -> ^( RESOURCE ID initValue ) )
            // Lowg.g:41:12: ID initValue PTVIRG
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_resource161);  
            stream_ID.add(ID6);

            pushFollow(FOLLOW_initValue_in_resource164);
            initValue7=initValue();

            state._fsp--;

            stream_initValue.add(initValue7.getTree());
            PTVIRG8=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_resource166);  
            stream_PTVIRG.add(PTVIRG8);



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
            // 42:2: -> ^( RESOURCE ID initValue )
            {
                // Lowg.g:42:5: ^( RESOURCE ID initValue )
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
    // Lowg.g:48:1: initValue : ( INT -> ^( VAL INT ) | FLOAT -> ^( VAL FLOAT ) );
    public final LowgParser.initValue_return initValue() throws RecognitionException {
        LowgParser.initValue_return retval = new LowgParser.initValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT9=null;
        Token FLOAT10=null;

        CommonTree INT9_tree=null;
        CommonTree FLOAT10_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // Lowg.g:48:11: ( INT -> ^( VAL INT ) | FLOAT -> ^( VAL FLOAT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==FLOAT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Lowg.g:48:13: INT
                    {
                    INT9=(Token)match(input,INT,FOLLOW_INT_in_initValue189);  
                    stream_INT.add(INT9);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 48:17: -> ^( VAL INT )
                    {
                        // Lowg.g:48:20: ^( VAL INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Lowg.g:48:33: FLOAT
                    {
                    FLOAT10=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_initValue201);  
                    stream_FLOAT.add(FLOAT10);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 48:39: -> ^( VAL FLOAT )
                    {
                        // Lowg.g:48:42: ^( VAL FLOAT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
    // Lowg.g:55:1: entities : ( object )+ ;
    public final LowgParser.entities_return entities() throws RecognitionException {
        LowgParser.entities_return retval = new LowgParser.entities_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.object_return object11 = null;



        try {
            // Lowg.g:55:10: ( ( object )+ )
            // Lowg.g:55:12: ( object )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:55:12: ( object )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==OBJECT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Lowg.g:55:12: object
            	    {
            	    pushFollow(FOLLOW_object_in_entities223);
            	    object11=object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, object11.getTree());

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
    // $ANTLR end "entities"

    public static class object_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // Lowg.g:58:1: object : OBJECT AFF ID parameters PTVIRG ;
    public final LowgParser.object_return object() throws RecognitionException {
        LowgParser.object_return retval = new LowgParser.object_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OBJECT12=null;
        Token AFF13=null;
        Token ID14=null;
        Token PTVIRG16=null;
        LowgParser.parameters_return parameters15 = null;


        CommonTree OBJECT12_tree=null;
        CommonTree AFF13_tree=null;
        CommonTree ID14_tree=null;
        CommonTree PTVIRG16_tree=null;

        try {
            // Lowg.g:58:8: ( OBJECT AFF ID parameters PTVIRG )
            // Lowg.g:58:10: OBJECT AFF ID parameters PTVIRG
            {
            root_0 = (CommonTree)adaptor.nil();

            OBJECT12=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_object233); 
            OBJECT12_tree = (CommonTree)adaptor.create(OBJECT12);
            adaptor.addChild(root_0, OBJECT12_tree);

            AFF13=(Token)match(input,AFF,FOLLOW_AFF_in_object235); 
            AFF13_tree = (CommonTree)adaptor.create(AFF13);
            adaptor.addChild(root_0, AFF13_tree);

            ID14=(Token)match(input,ID,FOLLOW_ID_in_object237); 
            ID14_tree = (CommonTree)adaptor.create(ID14);
            adaptor.addChild(root_0, ID14_tree);

            pushFollow(FOLLOW_parameters_in_object239);
            parameters15=parameters();

            state._fsp--;

            adaptor.addChild(root_0, parameters15.getTree());
            PTVIRG16=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_object241); 
            PTVIRG16_tree = (CommonTree)adaptor.create(PTVIRG16);
            adaptor.addChild(root_0, PTVIRG16_tree);


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
    // Lowg.g:60:1: parameters : FRICTIONCOEF AFF FLOAT ;
    public final LowgParser.parameters_return parameters() throws RecognitionException {
        LowgParser.parameters_return retval = new LowgParser.parameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FRICTIONCOEF17=null;
        Token AFF18=null;
        Token FLOAT19=null;

        CommonTree FRICTIONCOEF17_tree=null;
        CommonTree AFF18_tree=null;
        CommonTree FLOAT19_tree=null;

        try {
            // Lowg.g:60:12: ( FRICTIONCOEF AFF FLOAT )
            // Lowg.g:60:14: FRICTIONCOEF AFF FLOAT
            {
            root_0 = (CommonTree)adaptor.nil();

            FRICTIONCOEF17=(Token)match(input,FRICTIONCOEF,FOLLOW_FRICTIONCOEF_in_parameters250); 
            FRICTIONCOEF17_tree = (CommonTree)adaptor.create(FRICTIONCOEF17);
            adaptor.addChild(root_0, FRICTIONCOEF17_tree);

            AFF18=(Token)match(input,AFF,FOLLOW_AFF_in_parameters252); 
            AFF18_tree = (CommonTree)adaptor.create(AFF18);
            adaptor.addChild(root_0, AFF18_tree);

            FLOAT19=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parameters254); 
            FLOAT19_tree = (CommonTree)adaptor.create(FLOAT19);
            adaptor.addChild(root_0, FLOAT19_tree);


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


 

    public static final BitSet FOLLOW_resourcesSets_in_game102 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_entities_in_game106 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PTVIRG_in_game108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PTVIRG_in_game110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_resourcesSets133 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_resource161 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_initValue_in_resource164 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PTVIRG_in_resource166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_initValue189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_initValue201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_entities223 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_OBJECT_in_object233 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_AFF_in_object235 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_object237 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_parameters_in_object239 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PTVIRG_in_object241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRICTIONCOEF_in_parameters250 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_AFF_in_parameters252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_FLOAT_in_parameters254 = new BitSet(new long[]{0x0000000000000002L});

}