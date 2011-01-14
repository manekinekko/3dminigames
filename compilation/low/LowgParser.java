// $ANTLR 3.3 Nov 30, 2010 12:50:56 Lowg.g 2011-01-14 21:06:57




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LowgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PARAM", "PARAMLIST", "OBJ", "OBJS", "PTVIRG", "OBJECT", "ID", "AFF", "VIRG", "CAMERA", "AD", "AF", "POSITION", "DP", "ANGLE", "KEYLISTENER", "MOUSELISTENER", "KEYSTROKE", "LEFTCLICK", "LEFTDROP", "LEFTDRAG", "RIGHTCLICK", "RIGHTDROP", "ARROW", "APPLY", "PG", "PD", "PT", "PLUS", "MOINS", "MULT", "DIV", "MOD", "GAMEOVER", "PAUSE", "NEWGAME", "SAVEGAME", "INT", "FLOAT", "STRING", "WS", "PIPE", "WITH"
    };
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
    // Lowg.g:31:1: game : entities camera refreshLoop eventManager resourcesSets PTVIRG PTVIRG -> ^( GAME entities camera refreshLoop eventManager resourcesSets ) ;
    public final LowgParser.game_return game() throws RecognitionException {
        LowgParser.game_return retval = new LowgParser.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PTVIRG6=null;
        Token PTVIRG7=null;
        LowgParser.entities_return entities1 = null;

        LowgParser.camera_return camera2 = null;

        LowgParser.refreshLoop_return refreshLoop3 = null;

        LowgParser.eventManager_return eventManager4 = null;

        LowgParser.resourcesSets_return resourcesSets5 = null;


        CommonTree PTVIRG6_tree=null;
        CommonTree PTVIRG7_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleSubtreeStream stream_eventManager=new RewriteRuleSubtreeStream(adaptor,"rule eventManager");
        RewriteRuleSubtreeStream stream_camera=new RewriteRuleSubtreeStream(adaptor,"rule camera");
        RewriteRuleSubtreeStream stream_resourcesSets=new RewriteRuleSubtreeStream(adaptor,"rule resourcesSets");
        RewriteRuleSubtreeStream stream_entities=new RewriteRuleSubtreeStream(adaptor,"rule entities");
        RewriteRuleSubtreeStream stream_refreshLoop=new RewriteRuleSubtreeStream(adaptor,"rule refreshLoop");
        try {
            // Lowg.g:31:7: ( entities camera refreshLoop eventManager resourcesSets PTVIRG PTVIRG -> ^( GAME entities camera refreshLoop eventManager resourcesSets ) )
            // Lowg.g:31:9: entities camera refreshLoop eventManager resourcesSets PTVIRG PTVIRG
            {
            pushFollow(FOLLOW_entities_in_game145);
            entities1=entities();

            state._fsp--;

            stream_entities.add(entities1.getTree());
            pushFollow(FOLLOW_camera_in_game147);
            camera2=camera();

            state._fsp--;

            stream_camera.add(camera2.getTree());
            pushFollow(FOLLOW_refreshLoop_in_game149);
            refreshLoop3=refreshLoop();

            state._fsp--;

            stream_refreshLoop.add(refreshLoop3.getTree());
            pushFollow(FOLLOW_eventManager_in_game151);
            eventManager4=eventManager();

            state._fsp--;

            stream_eventManager.add(eventManager4.getTree());
            pushFollow(FOLLOW_resourcesSets_in_game153);
            resourcesSets5=resourcesSets();

            state._fsp--;

            stream_resourcesSets.add(resourcesSets5.getTree());
            PTVIRG6=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game155);  
            stream_PTVIRG.add(PTVIRG6);

            PTVIRG7=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_game157);  
            stream_PTVIRG.add(PTVIRG7);



            // AST REWRITE
            // elements: camera, refreshLoop, resourcesSets, entities, eventManager
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:3: -> ^( GAME entities camera refreshLoop eventManager resourcesSets )
            {
                // Lowg.g:32:5: ^( GAME entities camera refreshLoop eventManager resourcesSets )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME, "GAME"), root_1);

                adaptor.addChild(root_1, stream_entities.nextTree());
                adaptor.addChild(root_1, stream_camera.nextTree());
                adaptor.addChild(root_1, stream_refreshLoop.nextTree());
                adaptor.addChild(root_1, stream_eventManager.nextTree());
                adaptor.addChild(root_1, stream_resourcesSets.nextTree());

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

    public static class entities_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entities"
    // Lowg.g:37:1: entities : ( object )+ -> ^( OBJS ( object )+ ) ;
    public final LowgParser.entities_return entities() throws RecognitionException {
        LowgParser.entities_return retval = new LowgParser.entities_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.object_return object8 = null;


        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // Lowg.g:37:10: ( ( object )+ -> ^( OBJS ( object )+ ) )
            // Lowg.g:37:12: ( object )+
            {
            // Lowg.g:37:12: ( object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==OBJECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lowg.g:37:12: object
            	    {
            	    pushFollow(FOLLOW_object_in_entities186);
            	    object8=object();

            	    state._fsp--;

            	    stream_object.add(object8.getTree());

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
            // elements: object
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:3: -> ^( OBJS ( object )+ )
            {
                // Lowg.g:38:5: ^( OBJS ( object )+ )
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
    // Lowg.g:42:1: object : OBJECT ID AFF paramlist PTVIRG -> ^( OBJ ID paramlist ) ;
    public final LowgParser.object_return object() throws RecognitionException {
        LowgParser.object_return retval = new LowgParser.object_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OBJECT9=null;
        Token ID10=null;
        Token AFF11=null;
        Token PTVIRG13=null;
        LowgParser.paramlist_return paramlist12 = null;


        CommonTree OBJECT9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree AFF11_tree=null;
        CommonTree PTVIRG13_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_OBJECT=new RewriteRuleTokenStream(adaptor,"token OBJECT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // Lowg.g:42:8: ( OBJECT ID AFF paramlist PTVIRG -> ^( OBJ ID paramlist ) )
            // Lowg.g:42:10: OBJECT ID AFF paramlist PTVIRG
            {
            OBJECT9=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_object208);  
            stream_OBJECT.add(OBJECT9);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_object210);  
            stream_ID.add(ID10);

            AFF11=(Token)match(input,AFF,FOLLOW_AFF_in_object212);  
            stream_AFF.add(AFF11);

            pushFollow(FOLLOW_paramlist_in_object215);
            paramlist12=paramlist();

            state._fsp--;

            stream_paramlist.add(paramlist12.getTree());
            PTVIRG13=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_object217);  
            stream_PTVIRG.add(PTVIRG13);



            // AST REWRITE
            // elements: ID, paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:3: -> ^( OBJ ID paramlist )
            {
                // Lowg.g:43:5: ^( OBJ ID paramlist )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
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
    // $ANTLR end "object"

    public static class paramlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramlist"
    // Lowg.g:46:1: paramlist : param ( VIRG param )* -> ^( PARAMLIST ( param )+ ) ;
    public final LowgParser.paramlist_return paramlist() throws RecognitionException {
        LowgParser.paramlist_return retval = new LowgParser.paramlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG15=null;
        LowgParser.param_return param14 = null;

        LowgParser.param_return param16 = null;


        CommonTree VIRG15_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // Lowg.g:46:11: ( param ( VIRG param )* -> ^( PARAMLIST ( param )+ ) )
            // Lowg.g:46:13: param ( VIRG param )*
            {
            pushFollow(FOLLOW_param_in_paramlist239);
            param14=param();

            state._fsp--;

            stream_param.add(param14.getTree());
            // Lowg.g:46:19: ( VIRG param )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VIRG) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lowg.g:46:20: VIRG param
            	    {
            	    VIRG15=(Token)match(input,VIRG,FOLLOW_VIRG_in_paramlist242);  
            	    stream_VIRG.add(VIRG15);

            	    pushFollow(FOLLOW_param_in_paramlist244);
            	    param16=param();

            	    state._fsp--;

            	    stream_param.add(param16.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 47:3: -> ^( PARAMLIST ( param )+ )
            {
                // Lowg.g:47:5: ^( PARAMLIST ( param )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMLIST, "PARAMLIST"), root_1);

                if ( !(stream_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();

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

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // Lowg.g:49:1: param : ID AFF initValue -> ^( PARAM ID initValue ) ;
    public final LowgParser.param_return param() throws RecognitionException {
        LowgParser.param_return retval = new LowgParser.param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID17=null;
        Token AFF18=null;
        LowgParser.initValue_return initValue19 = null;


        CommonTree ID17_tree=null;
        CommonTree AFF18_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_AFF=new RewriteRuleTokenStream(adaptor,"token AFF");
        RewriteRuleSubtreeStream stream_initValue=new RewriteRuleSubtreeStream(adaptor,"rule initValue");
        try {
            // Lowg.g:49:7: ( ID AFF initValue -> ^( PARAM ID initValue ) )
            // Lowg.g:49:9: ID AFF initValue
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_param266);  
            stream_ID.add(ID17);

            AFF18=(Token)match(input,AFF,FOLLOW_AFF_in_param268);  
            stream_AFF.add(AFF18);

            pushFollow(FOLLOW_initValue_in_param270);
            initValue19=initValue();

            state._fsp--;

            stream_initValue.add(initValue19.getTree());


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
            // 50:3: -> ^( PARAM ID initValue )
            {
                // Lowg.g:50:5: ^( PARAM ID initValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

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
    // $ANTLR end "param"

    public static class camera_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "camera"
    // Lowg.g:58:1: camera : CAMERA ID AD position AF ;
    public final LowgParser.camera_return camera() throws RecognitionException {
        LowgParser.camera_return retval = new LowgParser.camera_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CAMERA20=null;
        Token ID21=null;
        Token AD22=null;
        Token AF24=null;
        LowgParser.position_return position23 = null;


        CommonTree CAMERA20_tree=null;
        CommonTree ID21_tree=null;
        CommonTree AD22_tree=null;
        CommonTree AF24_tree=null;

        try {
            // Lowg.g:58:8: ( CAMERA ID AD position AF )
            // Lowg.g:58:10: CAMERA ID AD position AF
            {
            root_0 = (CommonTree)adaptor.nil();

            CAMERA20=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_camera297); 
            CAMERA20_tree = (CommonTree)adaptor.create(CAMERA20);
            adaptor.addChild(root_0, CAMERA20_tree);

            ID21=(Token)match(input,ID,FOLLOW_ID_in_camera299); 
            ID21_tree = (CommonTree)adaptor.create(ID21);
            adaptor.addChild(root_0, ID21_tree);

            AD22=(Token)match(input,AD,FOLLOW_AD_in_camera301); 
            AD22_tree = (CommonTree)adaptor.create(AD22);
            adaptor.addChild(root_0, AD22_tree);

            pushFollow(FOLLOW_position_in_camera303);
            position23=position();

            state._fsp--;

            adaptor.addChild(root_0, position23.getTree());
            AF24=(Token)match(input,AF,FOLLOW_AF_in_camera305); 
            AF24_tree = (CommonTree)adaptor.create(AF24);
            adaptor.addChild(root_0, AF24_tree);


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
    // $ANTLR end "camera"

    public static class position_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "position"
    // Lowg.g:60:1: position : POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG ;
    public final LowgParser.position_return position() throws RecognitionException {
        LowgParser.position_return retval = new LowgParser.position_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POSITION25=null;
        Token DP26=null;
        Token PTVIRG28=null;
        Token ANGLE29=null;
        Token DP30=null;
        Token PTVIRG32=null;
        LowgParser.triplet_return triplet27 = null;

        LowgParser.triplet_return triplet31 = null;


        CommonTree POSITION25_tree=null;
        CommonTree DP26_tree=null;
        CommonTree PTVIRG28_tree=null;
        CommonTree ANGLE29_tree=null;
        CommonTree DP30_tree=null;
        CommonTree PTVIRG32_tree=null;

        try {
            // Lowg.g:60:10: ( POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG )
            // Lowg.g:60:12: POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG
            {
            root_0 = (CommonTree)adaptor.nil();

            POSITION25=(Token)match(input,POSITION,FOLLOW_POSITION_in_position313); 
            POSITION25_tree = (CommonTree)adaptor.create(POSITION25);
            adaptor.addChild(root_0, POSITION25_tree);

            DP26=(Token)match(input,DP,FOLLOW_DP_in_position315); 
            DP26_tree = (CommonTree)adaptor.create(DP26);
            adaptor.addChild(root_0, DP26_tree);

            pushFollow(FOLLOW_triplet_in_position317);
            triplet27=triplet();

            state._fsp--;

            adaptor.addChild(root_0, triplet27.getTree());
            PTVIRG28=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_position319); 
            PTVIRG28_tree = (CommonTree)adaptor.create(PTVIRG28);
            adaptor.addChild(root_0, PTVIRG28_tree);

            ANGLE29=(Token)match(input,ANGLE,FOLLOW_ANGLE_in_position321); 
            ANGLE29_tree = (CommonTree)adaptor.create(ANGLE29);
            adaptor.addChild(root_0, ANGLE29_tree);

            DP30=(Token)match(input,DP,FOLLOW_DP_in_position323); 
            DP30_tree = (CommonTree)adaptor.create(DP30);
            adaptor.addChild(root_0, DP30_tree);

            pushFollow(FOLLOW_triplet_in_position325);
            triplet31=triplet();

            state._fsp--;

            adaptor.addChild(root_0, triplet31.getTree());
            PTVIRG32=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_position327); 
            PTVIRG32_tree = (CommonTree)adaptor.create(PTVIRG32);
            adaptor.addChild(root_0, PTVIRG32_tree);


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
    // $ANTLR end "position"

    public static class triplet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplet"
    // Lowg.g:62:1: triplet : initNumValue initNumValue initNumValue ;
    public final LowgParser.triplet_return triplet() throws RecognitionException {
        LowgParser.triplet_return retval = new LowgParser.triplet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.initNumValue_return initNumValue33 = null;

        LowgParser.initNumValue_return initNumValue34 = null;

        LowgParser.initNumValue_return initNumValue35 = null;



        try {
            // Lowg.g:62:9: ( initNumValue initNumValue initNumValue )
            // Lowg.g:62:11: initNumValue initNumValue initNumValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_initNumValue_in_triplet335);
            initNumValue33=initNumValue();

            state._fsp--;

            adaptor.addChild(root_0, initNumValue33.getTree());
            pushFollow(FOLLOW_initNumValue_in_triplet337);
            initNumValue34=initNumValue();

            state._fsp--;

            adaptor.addChild(root_0, initNumValue34.getTree());
            pushFollow(FOLLOW_initNumValue_in_triplet339);
            initNumValue35=initNumValue();

            state._fsp--;

            adaptor.addChild(root_0, initNumValue35.getTree());

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
    // $ANTLR end "triplet"

    public static class refreshLoop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "refreshLoop"
    // Lowg.g:68:1: refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF ;
    public final LowgParser.refreshLoop_return refreshLoop() throws RecognitionException {
        LowgParser.refreshLoop_return retval = new LowgParser.refreshLoop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KEYLISTENER36=null;
        Token AD37=null;
        Token AF39=null;
        Token MOUSELISTENER40=null;
        Token AD41=null;
        Token AF43=null;
        LowgParser.keyboardCommands_return keyboardCommands38 = null;

        LowgParser.mouseCommands_return mouseCommands42 = null;


        CommonTree KEYLISTENER36_tree=null;
        CommonTree AD37_tree=null;
        CommonTree AF39_tree=null;
        CommonTree MOUSELISTENER40_tree=null;
        CommonTree AD41_tree=null;
        CommonTree AF43_tree=null;

        try {
            // Lowg.g:68:13: ( KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF )
            // Lowg.g:68:15: KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF
            {
            root_0 = (CommonTree)adaptor.nil();

            KEYLISTENER36=(Token)match(input,KEYLISTENER,FOLLOW_KEYLISTENER_in_refreshLoop354); 
            KEYLISTENER36_tree = (CommonTree)adaptor.create(KEYLISTENER36);
            adaptor.addChild(root_0, KEYLISTENER36_tree);

            AD37=(Token)match(input,AD,FOLLOW_AD_in_refreshLoop356); 
            AD37_tree = (CommonTree)adaptor.create(AD37);
            adaptor.addChild(root_0, AD37_tree);

            pushFollow(FOLLOW_keyboardCommands_in_refreshLoop358);
            keyboardCommands38=keyboardCommands();

            state._fsp--;

            adaptor.addChild(root_0, keyboardCommands38.getTree());
            AF39=(Token)match(input,AF,FOLLOW_AF_in_refreshLoop360); 
            AF39_tree = (CommonTree)adaptor.create(AF39);
            adaptor.addChild(root_0, AF39_tree);

            MOUSELISTENER40=(Token)match(input,MOUSELISTENER,FOLLOW_MOUSELISTENER_in_refreshLoop362); 
            MOUSELISTENER40_tree = (CommonTree)adaptor.create(MOUSELISTENER40);
            adaptor.addChild(root_0, MOUSELISTENER40_tree);

            AD41=(Token)match(input,AD,FOLLOW_AD_in_refreshLoop364); 
            AD41_tree = (CommonTree)adaptor.create(AD41);
            adaptor.addChild(root_0, AD41_tree);

            pushFollow(FOLLOW_mouseCommands_in_refreshLoop366);
            mouseCommands42=mouseCommands();

            state._fsp--;

            adaptor.addChild(root_0, mouseCommands42.getTree());
            AF43=(Token)match(input,AF,FOLLOW_AF_in_refreshLoop368); 
            AF43_tree = (CommonTree)adaptor.create(AF43);
            adaptor.addChild(root_0, AF43_tree);


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
    // Lowg.g:70:1: keyboardCommands : ( KEYSTROKE DP signalSets ) ( VIRG KEYSTROKE DP signalSets )* ;
    public final LowgParser.keyboardCommands_return keyboardCommands() throws RecognitionException {
        LowgParser.keyboardCommands_return retval = new LowgParser.keyboardCommands_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KEYSTROKE44=null;
        Token DP45=null;
        Token VIRG47=null;
        Token KEYSTROKE48=null;
        Token DP49=null;
        LowgParser.signalSets_return signalSets46 = null;

        LowgParser.signalSets_return signalSets50 = null;


        CommonTree KEYSTROKE44_tree=null;
        CommonTree DP45_tree=null;
        CommonTree VIRG47_tree=null;
        CommonTree KEYSTROKE48_tree=null;
        CommonTree DP49_tree=null;

        try {
            // Lowg.g:70:18: ( ( KEYSTROKE DP signalSets ) ( VIRG KEYSTROKE DP signalSets )* )
            // Lowg.g:70:20: ( KEYSTROKE DP signalSets ) ( VIRG KEYSTROKE DP signalSets )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:70:20: ( KEYSTROKE DP signalSets )
            // Lowg.g:70:21: KEYSTROKE DP signalSets
            {
            KEYSTROKE44=(Token)match(input,KEYSTROKE,FOLLOW_KEYSTROKE_in_keyboardCommands377); 
            KEYSTROKE44_tree = (CommonTree)adaptor.create(KEYSTROKE44);
            adaptor.addChild(root_0, KEYSTROKE44_tree);

            DP45=(Token)match(input,DP,FOLLOW_DP_in_keyboardCommands379); 
            DP45_tree = (CommonTree)adaptor.create(DP45);
            adaptor.addChild(root_0, DP45_tree);

            pushFollow(FOLLOW_signalSets_in_keyboardCommands381);
            signalSets46=signalSets();

            state._fsp--;

            adaptor.addChild(root_0, signalSets46.getTree());

            }

            // Lowg.g:70:45: ( VIRG KEYSTROKE DP signalSets )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VIRG) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Lowg.g:70:46: VIRG KEYSTROKE DP signalSets
            	    {
            	    VIRG47=(Token)match(input,VIRG,FOLLOW_VIRG_in_keyboardCommands384); 
            	    VIRG47_tree = (CommonTree)adaptor.create(VIRG47);
            	    adaptor.addChild(root_0, VIRG47_tree);

            	    KEYSTROKE48=(Token)match(input,KEYSTROKE,FOLLOW_KEYSTROKE_in_keyboardCommands386); 
            	    KEYSTROKE48_tree = (CommonTree)adaptor.create(KEYSTROKE48);
            	    adaptor.addChild(root_0, KEYSTROKE48_tree);

            	    DP49=(Token)match(input,DP,FOLLOW_DP_in_keyboardCommands388); 
            	    DP49_tree = (CommonTree)adaptor.create(DP49);
            	    adaptor.addChild(root_0, DP49_tree);

            	    pushFollow(FOLLOW_signalSets_in_keyboardCommands390);
            	    signalSets50=signalSets();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signalSets50.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // Lowg.g:73:1: mouseCommands : ( typeofclick DP signalSets )* ;
    public final LowgParser.mouseCommands_return mouseCommands() throws RecognitionException {
        LowgParser.mouseCommands_return retval = new LowgParser.mouseCommands_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DP52=null;
        LowgParser.typeofclick_return typeofclick51 = null;

        LowgParser.signalSets_return signalSets53 = null;


        CommonTree DP52_tree=null;

        try {
            // Lowg.g:73:15: ( ( typeofclick DP signalSets )* )
            // Lowg.g:73:17: ( typeofclick DP signalSets )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:73:17: ( typeofclick DP signalSets )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=LEFTCLICK && LA4_0<=RIGHTDROP)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Lowg.g:73:18: typeofclick DP signalSets
            	    {
            	    pushFollow(FOLLOW_typeofclick_in_mouseCommands403);
            	    typeofclick51=typeofclick();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeofclick51.getTree());
            	    DP52=(Token)match(input,DP,FOLLOW_DP_in_mouseCommands405); 
            	    DP52_tree = (CommonTree)adaptor.create(DP52);
            	    adaptor.addChild(root_0, DP52_tree);

            	    pushFollow(FOLLOW_signalSets_in_mouseCommands407);
            	    signalSets53=signalSets();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signalSets53.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // Lowg.g:75:1: signalSets : ( signal )+ ;
    public final LowgParser.signalSets_return signalSets() throws RecognitionException {
        LowgParser.signalSets_return retval = new LowgParser.signalSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.signal_return signal54 = null;



        try {
            // Lowg.g:75:12: ( ( signal )+ )
            // Lowg.g:75:14: ( signal )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:75:14: ( signal )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Lowg.g:75:14: signal
            	    {
            	    pushFollow(FOLLOW_signal_in_signalSets417);
            	    signal54=signal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signal54.getTree());

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
    // Lowg.g:77:1: signal : ID ;
    public final LowgParser.signal_return signal() throws RecognitionException {
        LowgParser.signal_return retval = new LowgParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID55=null;

        CommonTree ID55_tree=null;

        try {
            // Lowg.g:77:8: ( ID )
            // Lowg.g:77:10: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID55=(Token)match(input,ID,FOLLOW_ID_in_signal426); 
            ID55_tree = (CommonTree)adaptor.create(ID55);
            adaptor.addChild(root_0, ID55_tree);


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
    // Lowg.g:79:1: typeofclick : ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP );
    public final LowgParser.typeofclick_return typeofclick() throws RecognitionException {
        LowgParser.typeofclick_return retval = new LowgParser.typeofclick_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set56=null;

        CommonTree set56_tree=null;

        try {
            // Lowg.g:79:13: ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set56=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFTCLICK && input.LA(1)<=RIGHTDROP) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set56));
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

    public static class eventManager_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventManager"
    // Lowg.g:85:1: eventManager : signal ( VIRG signal )* ARROW instructions ( signal ( VIRG signal )* ARROW instructions )* ;
    public final LowgParser.eventManager_return eventManager() throws RecognitionException {
        LowgParser.eventManager_return retval = new LowgParser.eventManager_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG58=null;
        Token ARROW60=null;
        Token VIRG63=null;
        Token ARROW65=null;
        LowgParser.signal_return signal57 = null;

        LowgParser.signal_return signal59 = null;

        LowgParser.instructions_return instructions61 = null;

        LowgParser.signal_return signal62 = null;

        LowgParser.signal_return signal64 = null;

        LowgParser.instructions_return instructions66 = null;


        CommonTree VIRG58_tree=null;
        CommonTree ARROW60_tree=null;
        CommonTree VIRG63_tree=null;
        CommonTree ARROW65_tree=null;

        try {
            // Lowg.g:85:14: ( signal ( VIRG signal )* ARROW instructions ( signal ( VIRG signal )* ARROW instructions )* )
            // Lowg.g:85:16: signal ( VIRG signal )* ARROW instructions ( signal ( VIRG signal )* ARROW instructions )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_signal_in_eventManager465);
            signal57=signal();

            state._fsp--;

            adaptor.addChild(root_0, signal57.getTree());
            // Lowg.g:85:23: ( VIRG signal )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VIRG) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Lowg.g:85:24: VIRG signal
            	    {
            	    VIRG58=(Token)match(input,VIRG,FOLLOW_VIRG_in_eventManager468); 
            	    VIRG58_tree = (CommonTree)adaptor.create(VIRG58);
            	    adaptor.addChild(root_0, VIRG58_tree);

            	    pushFollow(FOLLOW_signal_in_eventManager470);
            	    signal59=signal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signal59.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            ARROW60=(Token)match(input,ARROW,FOLLOW_ARROW_in_eventManager474); 
            ARROW60_tree = (CommonTree)adaptor.create(ARROW60);
            adaptor.addChild(root_0, ARROW60_tree);

            pushFollow(FOLLOW_instructions_in_eventManager476);
            instructions61=instructions();

            state._fsp--;

            adaptor.addChild(root_0, instructions61.getTree());
            // Lowg.g:85:58: ( signal ( VIRG signal )* ARROW instructions )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==VIRG||LA8_1==ARROW) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // Lowg.g:85:60: signal ( VIRG signal )* ARROW instructions
            	    {
            	    pushFollow(FOLLOW_signal_in_eventManager481);
            	    signal62=signal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signal62.getTree());
            	    // Lowg.g:85:66: ( VIRG signal )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==VIRG) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // Lowg.g:85:67: VIRG signal
            	    	    {
            	    	    VIRG63=(Token)match(input,VIRG,FOLLOW_VIRG_in_eventManager483); 
            	    	    VIRG63_tree = (CommonTree)adaptor.create(VIRG63);
            	    	    adaptor.addChild(root_0, VIRG63_tree);

            	    	    pushFollow(FOLLOW_signal_in_eventManager485);
            	    	    signal64=signal();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, signal64.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    ARROW65=(Token)match(input,ARROW,FOLLOW_ARROW_in_eventManager489); 
            	    ARROW65_tree = (CommonTree)adaptor.create(ARROW65);
            	    adaptor.addChild(root_0, ARROW65_tree);

            	    pushFollow(FOLLOW_instructions_in_eventManager491);
            	    instructions66=instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instructions66.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "eventManager"

    public static class instructions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instructions"
    // Lowg.g:87:1: instructions : ( resourcePath APPLY PG applyExpression PD PTVIRG | conceptInstruction PTVIRG );
    public final LowgParser.instructions_return instructions() throws RecognitionException {
        LowgParser.instructions_return retval = new LowgParser.instructions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token APPLY68=null;
        Token PG69=null;
        Token PD71=null;
        Token PTVIRG72=null;
        Token PTVIRG74=null;
        LowgParser.resourcePath_return resourcePath67 = null;

        LowgParser.applyExpression_return applyExpression70 = null;

        LowgParser.conceptInstruction_return conceptInstruction73 = null;


        CommonTree APPLY68_tree=null;
        CommonTree PG69_tree=null;
        CommonTree PD71_tree=null;
        CommonTree PTVIRG72_tree=null;
        CommonTree PTVIRG74_tree=null;

        try {
            // Lowg.g:87:14: ( resourcePath APPLY PG applyExpression PD PTVIRG | conceptInstruction PTVIRG )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=GAMEOVER && LA9_0<=SAVEGAME)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Lowg.g:87:16: resourcePath APPLY PG applyExpression PD PTVIRG
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_resourcePath_in_instructions505);
                    resourcePath67=resourcePath();

                    state._fsp--;

                    adaptor.addChild(root_0, resourcePath67.getTree());
                    APPLY68=(Token)match(input,APPLY,FOLLOW_APPLY_in_instructions507); 
                    APPLY68_tree = (CommonTree)adaptor.create(APPLY68);
                    adaptor.addChild(root_0, APPLY68_tree);

                    PG69=(Token)match(input,PG,FOLLOW_PG_in_instructions509); 
                    PG69_tree = (CommonTree)adaptor.create(PG69);
                    adaptor.addChild(root_0, PG69_tree);

                    pushFollow(FOLLOW_applyExpression_in_instructions511);
                    applyExpression70=applyExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, applyExpression70.getTree());
                    PD71=(Token)match(input,PD,FOLLOW_PD_in_instructions513); 
                    PD71_tree = (CommonTree)adaptor.create(PD71);
                    adaptor.addChild(root_0, PD71_tree);

                    PTVIRG72=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_instructions515); 
                    PTVIRG72_tree = (CommonTree)adaptor.create(PTVIRG72);
                    adaptor.addChild(root_0, PTVIRG72_tree);


                    }
                    break;
                case 2 :
                    // Lowg.g:87:65: conceptInstruction PTVIRG
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conceptInstruction_in_instructions518);
                    conceptInstruction73=conceptInstruction();

                    state._fsp--;

                    adaptor.addChild(root_0, conceptInstruction73.getTree());
                    PTVIRG74=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_instructions520); 
                    PTVIRG74_tree = (CommonTree)adaptor.create(PTVIRG74);
                    adaptor.addChild(root_0, PTVIRG74_tree);


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
    // $ANTLR end "instructions"

    public static class resourcePath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resourcePath"
    // Lowg.g:89:1: resourcePath : ( ID | ID PT ID ) ;
    public final LowgParser.resourcePath_return resourcePath() throws RecognitionException {
        LowgParser.resourcePath_return retval = new LowgParser.resourcePath_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID75=null;
        Token ID76=null;
        Token PT77=null;
        Token ID78=null;

        CommonTree ID75_tree=null;
        CommonTree ID76_tree=null;
        CommonTree PT77_tree=null;
        CommonTree ID78_tree=null;

        try {
            // Lowg.g:89:14: ( ( ID | ID PT ID ) )
            // Lowg.g:89:16: ( ID | ID PT ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            // Lowg.g:89:16: ( ID | ID PT ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==PT) ) {
                    alt10=2;
                }
                else if ( (LA10_1==APPLY) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Lowg.g:89:17: ID
                    {
                    ID75=(Token)match(input,ID,FOLLOW_ID_in_resourcePath529); 
                    ID75_tree = (CommonTree)adaptor.create(ID75);
                    adaptor.addChild(root_0, ID75_tree);


                    }
                    break;
                case 2 :
                    // Lowg.g:89:22: ID PT ID
                    {
                    ID76=(Token)match(input,ID,FOLLOW_ID_in_resourcePath533); 
                    ID76_tree = (CommonTree)adaptor.create(ID76);
                    adaptor.addChild(root_0, ID76_tree);

                    PT77=(Token)match(input,PT,FOLLOW_PT_in_resourcePath535); 
                    PT77_tree = (CommonTree)adaptor.create(PT77);
                    adaptor.addChild(root_0, PT77_tree);

                    ID78=(Token)match(input,ID,FOLLOW_ID_in_resourcePath537); 
                    ID78_tree = (CommonTree)adaptor.create(ID78);
                    adaptor.addChild(root_0, ID78_tree);


                    }
                    break;

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
    // $ANTLR end "resourcePath"

    public static class applyExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "applyExpression"
    // Lowg.g:91:1: applyExpression : arithmeticOperator initNumValue ;
    public final LowgParser.applyExpression_return applyExpression() throws RecognitionException {
        LowgParser.applyExpression_return retval = new LowgParser.applyExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.arithmeticOperator_return arithmeticOperator79 = null;

        LowgParser.initNumValue_return initNumValue80 = null;



        try {
            // Lowg.g:91:17: ( arithmeticOperator initNumValue )
            // Lowg.g:91:19: arithmeticOperator initNumValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arithmeticOperator_in_applyExpression546);
            arithmeticOperator79=arithmeticOperator();

            state._fsp--;

            adaptor.addChild(root_0, arithmeticOperator79.getTree());
            pushFollow(FOLLOW_initNumValue_in_applyExpression548);
            initNumValue80=initNumValue();

            state._fsp--;

            adaptor.addChild(root_0, initNumValue80.getTree());

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
    // $ANTLR end "applyExpression"

    public static class arithmeticOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arithmeticOperator"
    // Lowg.g:93:1: arithmeticOperator : ( PLUS | MOINS | MULT | DIV | MOD );
    public final LowgParser.arithmeticOperator_return arithmeticOperator() throws RecognitionException {
        LowgParser.arithmeticOperator_return retval = new LowgParser.arithmeticOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set81=null;

        CommonTree set81_tree=null;

        try {
            // Lowg.g:93:20: ( PLUS | MOINS | MULT | DIV | MOD )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set81=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MOD) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set81));
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
    // $ANTLR end "arithmeticOperator"

    public static class conceptInstruction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conceptInstruction"
    // Lowg.g:95:1: conceptInstruction : ( GAMEOVER | PAUSE | NEWGAME | SAVEGAME );
    public final LowgParser.conceptInstruction_return conceptInstruction() throws RecognitionException {
        LowgParser.conceptInstruction_return retval = new LowgParser.conceptInstruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set82=null;

        CommonTree set82_tree=null;

        try {
            // Lowg.g:95:20: ( GAMEOVER | PAUSE | NEWGAME | SAVEGAME )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set82=(Token)input.LT(1);
            if ( (input.LA(1)>=GAMEOVER && input.LA(1)<=SAVEGAME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set82));
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
    // $ANTLR end "conceptInstruction"

    public static class resourcesSets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resourcesSets"
    // Lowg.g:123:1: resourcesSets : ( resource )* -> ^( RESOURCES ( resource )* ) ;
    public final LowgParser.resourcesSets_return resourcesSets() throws RecognitionException {
        LowgParser.resourcesSets_return retval = new LowgParser.resourcesSets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LowgParser.resource_return resource83 = null;


        RewriteRuleSubtreeStream stream_resource=new RewriteRuleSubtreeStream(adaptor,"rule resource");
        try {
            // Lowg.g:123:15: ( ( resource )* -> ^( RESOURCES ( resource )* ) )
            // Lowg.g:123:17: ( resource )*
            {
            // Lowg.g:123:17: ( resource )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Lowg.g:123:18: resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets619);
            	    resource83=resource();

            	    state._fsp--;

            	    stream_resource.add(resource83.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
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
            // 125:3: -> ^( RESOURCES ( resource )* )
            {
                // Lowg.g:125:5: ^( RESOURCES ( resource )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RESOURCES, "RESOURCES"), root_1);

                // Lowg.g:125:17: ( resource )*
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
    // Lowg.g:130:1: resource : ID initValue PTVIRG -> ^( RESOURCE ID initValue ) ;
    public final LowgParser.resource_return resource() throws RecognitionException {
        LowgParser.resource_return retval = new LowgParser.resource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID84=null;
        Token PTVIRG86=null;
        LowgParser.initValue_return initValue85 = null;


        CommonTree ID84_tree=null;
        CommonTree PTVIRG86_tree=null;
        RewriteRuleTokenStream stream_PTVIRG=new RewriteRuleTokenStream(adaptor,"token PTVIRG");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_initValue=new RewriteRuleSubtreeStream(adaptor,"rule initValue");
        try {
            // Lowg.g:130:10: ( ID initValue PTVIRG -> ^( RESOURCE ID initValue ) )
            // Lowg.g:130:12: ID initValue PTVIRG
            {
            ID84=(Token)match(input,ID,FOLLOW_ID_in_resource648);  
            stream_ID.add(ID84);

            pushFollow(FOLLOW_initValue_in_resource651);
            initValue85=initValue();

            state._fsp--;

            stream_initValue.add(initValue85.getTree());
            PTVIRG86=(Token)match(input,PTVIRG,FOLLOW_PTVIRG_in_resource653);  
            stream_PTVIRG.add(PTVIRG86);



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
            // 131:2: -> ^( RESOURCE ID initValue )
            {
                // Lowg.g:131:5: ^( RESOURCE ID initValue )
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
    // Lowg.g:137:1: initNumValue : ( INT | FLOAT );
    public final LowgParser.initNumValue_return initNumValue() throws RecognitionException {
        LowgParser.initNumValue_return retval = new LowgParser.initNumValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set87=null;

        CommonTree set87_tree=null;

        try {
            // Lowg.g:137:14: ( INT | FLOAT )
            // Lowg.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=FLOAT) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set87));
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
    // Lowg.g:139:1: initValue : ( initNumValue | STRING );
    public final LowgParser.initValue_return initValue() throws RecognitionException {
        LowgParser.initValue_return retval = new LowgParser.initValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING89=null;
        LowgParser.initNumValue_return initNumValue88 = null;


        CommonTree STRING89_tree=null;

        try {
            // Lowg.g:139:11: ( initNumValue | STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=INT && LA12_0<=FLOAT)) ) {
                alt12=1;
            }
            else if ( (LA12_0==STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Lowg.g:139:13: initNumValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_initNumValue_in_initValue689);
                    initNumValue88=initNumValue();

                    state._fsp--;

                    adaptor.addChild(root_0, initNumValue88.getTree());

                    }
                    break;
                case 2 :
                    // Lowg.g:139:28: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_initValue693); 
                    STRING89_tree = (CommonTree)adaptor.create(STRING89);
                    adaptor.addChild(root_0, STRING89_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_entities_in_game145 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_camera_in_game147 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_refreshLoop_in_game149 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_eventManager_in_game151 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_resourcesSets_in_game153 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_game155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_game157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_entities186 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_OBJECT_in_object208 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_object210 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_AFF_in_object212 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_paramlist_in_object215 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_object217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist239 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_VIRG_in_paramlist242 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_param_in_paramlist244 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_param266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_AFF_in_param268 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_initValue_in_param270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_camera297 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_camera299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AD_in_camera301 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_position_in_camera303 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AF_in_camera305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITION_in_position313 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_position315 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_triplet_in_position317 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_position319 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ANGLE_in_position321 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_position323 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_triplet_in_position325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_position327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initNumValue_in_triplet335 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_triplet337 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_triplet339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYLISTENER_in_refreshLoop354 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_keyboardCommands_in_refreshLoop358 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop360 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_MOUSELISTENER_in_refreshLoop362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop364 = new BitSet(new long[]{0x00000000F8100000L});
    public static final BitSet FOLLOW_mouseCommands_in_refreshLoop366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYSTROKE_in_keyboardCommands377 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_keyboardCommands379 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signalSets_in_keyboardCommands381 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_VIRG_in_keyboardCommands384 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYSTROKE_in_keyboardCommands386 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_keyboardCommands388 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signalSets_in_keyboardCommands390 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_typeofclick_in_mouseCommands403 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_mouseCommands405 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signalSets_in_mouseCommands407 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_signal_in_signalSets417 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_signal426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeofclick0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signal_in_eventManager465 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_VIRG_in_eventManager468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signal_in_eventManager470 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_ARROW_in_eventManager474 = new BitSet(new long[]{0x00003C0000008000L});
    public static final BitSet FOLLOW_instructions_in_eventManager476 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_signal_in_eventManager481 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_VIRG_in_eventManager483 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signal_in_eventManager485 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_ARROW_in_eventManager489 = new BitSet(new long[]{0x00003C0000008000L});
    public static final BitSet FOLLOW_instructions_in_eventManager491 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_resourcePath_in_instructions505 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_APPLY_in_instructions507 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PG_in_instructions509 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_applyExpression_in_instructions511 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_PD_in_instructions513 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_instructions515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conceptInstruction_in_instructions518 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_instructions520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_resourcePath529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_resourcePath533 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_PT_in_resourcePath535 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_resourcePath537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticOperator_in_applyExpression546 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_applyExpression548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_arithmeticOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_conceptInstruction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_resourcesSets619 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_resource648 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_initValue_in_resource651 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_resource653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_initNumValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initNumValue_in_initValue689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_initValue693 = new BitSet(new long[]{0x0000000000000002L});

}