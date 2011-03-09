tree grammar hightTree;

options {
    tokenVocab=hight;
    ASTLabelType=CommonTree;
} 

@header {
    package grammars;
    import code.*;
    import symbols.*;
    import lib.*;
    import attributes.*;
    import java.util.Iterator;
    import java.util.Hashtable;
}

@members {
    private int INT_DUPLICABLE=10;
    private Hashtable<String, String> aggreg = new Hashtable<String, String>();

    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);

	System.out.println(e.node);
        System.out.println(((CommonErrorNode)e.node).start.getLine());
        System.out.println(((CommonErrorNode)e.node).trappedException.token.getText());
    }

    /*public void emitErrorMessage(String msg) {
        System.err.println("plop");
    }*/
}

/*------------------------------------------------------------------
 * TREE RULES
 *------------------------------------------------------------------*/
 
game [SymbolTable st] returns [Code c]
    @init{c = new Code();}:
    ^(GAME_KW 
    {c.append(Code.genRefreshLoop());}
    gd=gameData[st]?
    newType[st]*
    in=initialization[st]
    {
	//st.print();
        //System.out.println(in.getCode());
        c.append(in);
    }
     
    (def=definition[st]
    {
	//System.out.println(def.getCode()+"\n");
        c.append(def);
    }
    )*

    com=commande[st]+ reg=reglesJeu[st]+ ia=iaBasique[st]*)
    ;
	

/*------------------------------ Information about game ---------------------------------*/

gameData [SymbolTable st] returns [Code c]:
    ^(GAME_ATTRIBUT_KW attributGame_list[st]);
	
attributGame_list [SymbolTable st] returns [Code c]:
    attributGame[st]+;
	
attributGame [SymbolTable st] returns [Code c]:
	^(GRAVITY_KW FLOAT)
	| ^(GRAVITY_KW FLOAT FLOAT FLOAT)
	| ^(TURNBASED_KW ('true'|'false'))
	| ^(WORLD_KW mapType)
	| ^(GRIDSIZE_KW FLOAT)
	| ^(NAME_KW name)
	;

mapType returns [Integer i]:
    GENERIC
    | GRID
    | RIBBON
    ;

name returns [String s]:
    i=IDENT
    {s = i.getText();}
    ;
/*-------------------------- Inheritance, creation of type -------------------------------*/	
newType [SymbolTable st]
    @init{List<Model> sub = new ArrayList<Model>();} :
    ^(TYPE i=IDENT subType[st,sub]+)
    {
	String id = i.getText();
        Symbol verif = st.get(id);
	if(verif != null) {
	    System.out.println("Type \""+id+"\" déjà déclaré.");
	    System.exit(-1);
	} else {
	    Model[] tab = (Model[])sub.toArray(new Model[0]);
	    Model t = new Model(id, tab);
	    st.add(id, t);
	}
    }
    ;

subType [SymbolTable st, List<Model> sub] :
    i=IDENT
    {
	String id = i.getText();
	Symbol verif = st.get(id);
	if(verif == null) {
	    System.out.println("Model \""+id+"\" non défini.");
	    System.exit(-1);
	} else if(!verif.getName().equals(id)) {
	    System.out.println("Gros Gros bug !!!");
	    System.exit(-1);
	} else {
	    sub.add((Model)verif);
	}
    }
    ;

initialization [SymbolTable st] returns [Code c]:
    init[st]+
    {
	Code modelCode = new Code();
	Code entitiesCode = new Code();
	Code entitiesFunCode = new Code();
	List<Entity> allEntities = st.getAllEntities();

	Iterator<Entity> it = allEntities.iterator();
	while(it.hasNext()) {
	    Entity ent = it.next();
	    Model model = null;
	    if(ent.listModels().size() > 1) {

	    } else {
	        model = ent.listModels().get(0);
	    }
	    modelCode.append(Code.genModel(model));
	    modelCode.append("\n");

	    entitiesFunCode.append(Code.genFuncEntity(ent));
	    entitiesFunCode.append("\n");

	    //entitiesCode.append(Code.genEntity(ent));
	    entitiesCode.append("\n");
	}

	c = new Code("/*Models*/\n");
	c.append("\n/*Entities*/\n");
	c.append(entitiesFunCode);
	c.append(entitiesCode);
	c.append("\n");
    }
    ;

init [SymbolTable st] returns [Code c]:
    ^(INIT_IS_KW i=IDENT d=declarationObjet[st])
    {
	String id = i.getText();
        Symbol verif = st.get(id);
	if(verif != null) {
	    System.out.println("Elément \""+id+"\" déjà déclaré.");
	    System.exit(-1);
	} else {
	    int mode = d.getSecond();
	    
	    Entity t = new Entity(id,d.getFirst());
	    d.getFirst().toGenerate();

	    if(mode == INT_DUPLICABLE)
		t.setDuplicable();

	    st.add(id,t);
	}
    }
    | ^(INIT_HAS_KW ac=accesClass[st] ao=affectationObjet_list[st])
    {
        Iterator<Symbol> it = ac.iterator();
        while(it.hasNext()) {
	    Symbol s = it.next();
	    Iterator<Pair<String,AttributeValue>> ite = ao.iterator();
	    while(ite.hasNext()) {
		Pair<String,AttributeValue> p = ite.next();
		String attributeValue = p.getFirst();
                if(p.getSecond().getType()==AttributeValue.Type.AGGR){
		    aggreg.put(attributeValue,s.getName());
                }else{
		    AttributeValue attr = s.getAttribute(attributeValue);
                    if(attr != null && attr.getType() != p.getSecond().getType()) {
			System.out.println("Erreur : Type incompatible");
                        System.exit(-1);
                    }
                    s.addAttribute(p.getFirst(),p.getSecond());
                }
	    }
	}
    }
    | ^(INSERT_KW IDENT IDENT operation[st]?)
    | ^(REMOVE_KW (IDENT|operation[st]) IDENT)
    ;

// A revoir : CAMERA : si rien n'est ajoute on fait quoi ?, MEDIA pareil
declarationObjet [SymbolTable st] returns [Pair<Model, Integer> p]
    @init{d=null;s=null;}:
    ^(DEC t=typeEntity[st] (d=dupli)?)
    {
	if(d == null)
	    d=0;

	p = new Pair<Model, Integer>(t,d);
    }
    | ^(LIST_KW list_declaration[st])
    | ^(CAMERA_KW PERSON view[st])
    | ^(CAMERA_KW FREE)
    | ^(MEDIA_KW LOOP)
    | ^(MEDIA_KW ONCE) 						 // sound, music or video played in loop or once
    | ^(IN_KW IDENT)									  // ident of a list to add an element
    | PLAYER (s=SOLO)?
    {
	p = new Pair<Model, Integer>((Model) st.get("Player"),0);
    }
    ;

list_declaration [SymbolTable st] returns [Code c]:  
    (operation[st]? IDENT)+
    ;
	
typeEntity [SymbolTable st] returns [Model t]:
    i=IDENT
    {
	String id = i.getText();
	Symbol verif = st.get(id);
	if(verif == null) {
	    System.out.println("Model \""+id+"\" non défini.");
	    System.exit(-1);
	} else if(!verif.getName().equals(id)) {
	    System.out.println("Gros Gros bug !!!");
	    System.exit(-1);
	} else {
	    t = (Model)verif;
	}
    }
    ;

dupli returns [Integer i]:
    DUPLICABLE
    {i=INT_DUPLICABLE;}
    ;
	
view [SymbolTable st] returns [Code c]:
    FIRST
    | THIRD
	;
affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c]
    @init{c = new ArrayList<Pair<String,AttributeValue>>();} :
    (a=affectationObjet[st]{c.addAll(a);} )+;

affectationObjet [SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] @init{c = new ArrayList<Pair<String,AttributeValue>>();}:
    ^( ALLOCATION_KW i=IDENT t=valAggregation[st]?)
    {
	if(t==null){
	    AttributeValue av = new AttributeValue(new Code(i.getText()),AttributeValue.Type.AGGR);
            c.add(new Pair<String,AttributeValue>(i.getText(),av));
        } else{
            c.add(new Pair<String,AttributeValue>(i.getText(),t));
        }
    }
    | ^( ALLOCATION_KW tc=typeCoordonnees[st] coo=coordinates[st])
    {
	String mode = tc.getCode();
        if(mode.equals("position")){
	    c.add(new Pair<String,AttributeValue>("posX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("posY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("posZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
        } else if(mode.equals("angle")){
            c.add(new Pair<String,AttributeValue>("orX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("orY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("orZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
        } else{
            c.add(new Pair<String,AttributeValue>("tX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("tY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("tZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
        }
    }
    | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT)
    | ^( ALLOCATION_KW att=attributTps[st] v=operation[st] u=timeUnit[st])
    {
	c.add(new Pair<String,AttributeValue>(att,new AttributeValue(new Duration(v,u))));
    }
    ;
    
	
valAggregation [SymbolTable st] returns [AttributeValue c]:
    ^(AGGREGATION_KW o=operation[st] t=timeUnit[st]?)
    {
	if(t!=null){
	    c= new AttributeValue(new Duration(o,t));
        } else{
            c=new AttributeValue(o, AttributeValue.Type.NUMBER);
        }
    }
    |^(AGGREGATION_KW i=IDENT)
    {
	String value = i.getText();
	try {
	    float tmp = Float.parseFloat(value);
	    c = new AttributeValue(tmp);
	} catch(NumberFormatException e) {
	    c = new AttributeValue(value);
	}
    }
    | 'true' {c = new AttributeValue(true);}
    | 'false' {c = new AttributeValue(false);}
    ;


/* Definition */	
definition [SymbolTable st] returns [Code c] @init{ c = new Code();}: 
    ^(DEFINITION_KW i=IDENT cons=consequences[st])
    {
	String ident = i.getText();
	if(st.get(ident)!=null) {
	    System.out.println("l'ident "+ ident + " est deja defini");
	    System.exit(-1);
	} else {
	    Definition def = new Definition(ident,cons);
	    c.append(Code.genFuncDef(def));
	    st.add(ident,def);
	}
    }
    ;

consequences [SymbolTable st] returns [Code c]
    @init{ c = new Code();} :
    ^(CONSEQUENCES_KW conslist=consequ_list[st])
    {
	c.append(conslist);
    }
    ;

consequ_list [SymbolTable st] returns [Code c]
    @init{ c = new Code();} :
    (cons=consequ[st] { c.append(cons); })+
    ;
		
consequ [SymbolTable st] returns [Code c]
    @init{ c = new Code();} :
    i=siAlors[st]
    {c=i;}
    | act=action[st]
    {c.append(act);}
    | a=affectation[st] {c=a;}
    | activCommande[st] {}
    | id=IDENT{	c.append(id.getText());c.append("\n");}
    | ^(VICTORY_KW IDENT IDENT?)
    | ^(DEFEAT_KW IDENT IDENT?)
    ;

action [SymbolTable st] returns [Code c]
    @init{ c = new Code();}:
    accesClass[st] actionObjet[st]
    |^(ENDS_KW IDENT IDENT?)
    |^(ENDS_KW GAME IDENT?)
    |^(STARTS_KW IDENT IDENT?)
    |^(STARTS_KW GAME IDENT?)
    |^(PAUSE_KW IDENT IDENT?)
    |^(PAUSE_KW GAME IDENT?)
    {
        c.append("\t");
        
       /* c.append("pause();\n");
        * equivaut à
        */ 
        c.append(Code.genFuncCall("pause",new ArrayList())); 
        
    }
    |^(MUTE_KW mode_mute[st] IDENT)
    |^(PLAY_KW IDENT)
    |^(STOP_KW IDENT)
    |^(BLOCK_KW transformation[st] accesClass[st] coordinates[st])
    |^(EFFACE_KW typeAcces[st] typeDestination[st]?)
    |^(GENERATE_KW ta=typeAcces[st] td=typeDestination[st]?)
    {
	for(Iterator<Symbol> it = ta.iterator() ; it.hasNext();) {
	    Symbol e = it.next();

	    //Erreur entité déja générée
	    if(!((Entity)e).getDuplicable() && (e.getGenerate()>=1)){
		System.out.println("L'entité " + e.getName() + " n'est pas duplicable!");
		System.exit(-1);
	    }
	    if(td!=null){
		e.getAttribute("posX").setCode(td.getX());
		e.getAttribute("posY").setCode(td.getY());
		e.getAttribute("posZ").setCode(td.getZ());
	    }
	    e.toGenerate();
	    c.append("\t");		c.append(Code.genEntity((Entity) e));
	    c.append("\t");		c.append(Code.genAddObject((Entity) e));
	}
    }
    |^(WAIT_KW op=operation[st] t=timeUnit[st] cons=consequences[st])
    {
    	c.append(Code.genSetTimeout(cons,op,t));
    }	//TO DO
    |SAVE_KW
    |^(NEXTURN_KW IDENT)
    //| ^(RELOAD_KW IDENT)
    |^(GRASPS_KW IDENT IDENT)
    |^(EXPELS_KW IDENT IDENT operation[st])
    |^(INGESTS_KW IDENT IDENT IDENT)
    ;

typeAcces [SymbolTable st] returns [ArrayList<Symbol> l]:
    ac=accesClass[st] {l=ac;}
    | operation[st] (IDENT | accesClass[st])
    ;		//TO DO

typeDestination [SymbolTable st] returns [Coordonnees coord]: 
    accesClass[st]
    | coo=coordinates[st]{coord=coo;};

actionObjet [SymbolTable st] returns [Code c]:
    DIES_KW
    | actionCommandePressee[st]
    | actionCommandeMaintenue[st]
    |^(DURING actionCommandeMaintenue[st] operation[st] timeUnit[st])
    |^(UNTIL actionCommandeMaintenue[st] conditions[st])
    |^(EQUIP accesClass[st])
    |^(EQUIP NEXT)
    |^(EQUIP PREVIOUS)
    ;

actionCommandePressee [SymbolTable st] returns [Code c]:
  ^(JUMP operation[st])
  ;

actionCommandeMaintenue [SymbolTable st] returns [Code c]:
  ^(MOVE (LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN) operation[st])
  | ^(TURN (LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE) operation[st])
  | ^(ACCELERATE operation[st])
  | ^(BRAKE operation[st])
  ;
  
transformation [SymbolTable st] returns [Code c]:
    TRANSLATION
    | ROTATION
    | SCALE
    ;
	
coordinates [SymbolTable st] returns [Coordonnees coo]:
    ^(COORDINATE_KW x=operation[st] y=operation[st] z=operation[st])
    {
	coo = new Coordonnees(x, y, z);
    }
    ;

/* Initialization of commands */

commande [SymbolTable st] returns [Code c]:
    ^(COMMAND_KW i=IDENT player_list[st] actionCommande_list[st])
    ;

player_list [SymbolTable st] returns [Code c]:
    IDENT+
    ;

actionCommande_list[SymbolTable st] returns [Code c]:
	actionCommande[st]+
	;
	
actionCommande [SymbolTable st] returns [Code c]:
    ^(MOUSE_KW souris[st] commandMode definitionId)
    |^(KEY_KW clavier[st] commandMode definitionId) // ident : that was defined with means
    ;

commandMode :
    PRESSED_KW |HELD_KW | RELEASED_KW
    ;

definitionId :
    IDENT
    ;	
 
souris [SymbolTable st] returns [Code c]:
    WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN
    ;
 
clavier [SymbolTable st] returns [Code c]:
    LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER          //CHAR : Z,Q,S,D,...
    ;
  
activCommande [SymbolTable st] returns [Code c]:
    ^(ACTIVATE_KW typeCommand[st])
    |^(DISABLE_KW typeCommand[st])
    ;

typeCommand [SymbolTable st] returns [Code c]:
    COMMANDS
    | ^(MOUSE_KW souris[st]*)
    | ^(KEY_KW clavier[st]+)
    | KEYBOARD;
 	
reglesJeu [SymbolTable st] returns [Code c]:
    ^(RULE_KW IDENT? declencheur[st] definitionId)
    ;
 
declencheur [SymbolTable st] returns [Code c]:
    accesClass[st] (MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st])
    |^(ENDS_KW type_declencheur[st])
    |^(STARTS_KW type_declencheur[st])          //ident if it is a counter
    |^(BECOMES_VAR_KW variable[st] varOuNB[st])
    |^(VICTORY_KW (PLAYER| IDENT)) //ident est le nom d'1 Team ou d'1 Player, Player la classe (global)
    |^(DEFEAT_KW (PLAYER| IDENT))
    ;
  
type_declencheur [SymbolTable st] returns [Code c]: 
    IDENT|GAME;
	
varOuNB [SymbolTable st] returns [Code c]:
    variable[st] | FLOAT;

declencheurTK [SymbolTable st] returns [Code c] :
    ^(TOUCHES_KW (OTHER)? accesClass[st])
    | ^(KILLS_KW (OTHER)? accesClass[st])
    | ^(OWNES_KW (OTHER)? accesClass[st])
    | ^(NOTOWNES_KW (OTHER)? accesClass[st])
    ;
	

	
declencheurKT [SymbolTable st] returns [Code c] :
    ^(KILLED_KW (OTHER)? accesClass[st])
    | ^(TOUCHED_KW (OTHER)? accesClass[st])
    | ^(OWNED_KW (OTHER)? accesClass[st])
    | ^(NOTOWNED_KW (OTHER)? accesClass[st])
    ;
	
/* Conditions */  
siAlors [SymbolTable st] returns [Code c]:
    ^(IF_KW cond=conditions[st] r1=consequences[st] r2=consequences[st]?)
    {c = Code.genIF(cond,r1,r2);}
    ;
//////////////////////////////////////////////////////////////////////////petit pb ici je pense
conditions [SymbolTable st] returns [Code c]
    @init{not=null;}:
    ^(CONDITION_KW (not=NOT)? cond=conditions[st])
    {
        if(not != null) {
            c = Code.genNot(cond);
        } else {
            c = cond;
        }
    }
    |^(OR cond1=conditions[st] cond2=conditions[st])
    {
        c = Code.genOr(cond1,cond2);
    }
    |^(AND cond1=conditions[st] cond2=conditions[st])
    {
        c = Code.genAnd(cond1,cond2);
    }
    |^(EQUALS cond1=operation[st] cond2=operation[st])
    {
        c = Code.genEquals(cond1,cond2);
    }
    |^(INF cond1=operation[st] cond2=operation[st])
    {
        c = Code.genInf(cond1,cond2);
    }
    |^(SUP cond1=operation[st] cond2=operation[st])
    {
        c = Code.genSup(cond1,cond2);
    }
    |^(INFEG cond1=operation[st] cond2=operation[st])
    {
        c = Code.genInfEg(cond1,cond2);
    }
    |^(SUPED cond1=operation[st] cond2=operation[st])
    {
        c = Code.genSupEg(cond1,cond2);
    }
    |^(DIFF cond1=operation[st] cond2=operation[st])
    {
        c = Code.genDiff(cond1,cond2);
    }
    | etat[st]
  ;

etat [SymbolTable st] returns [Code c]:
    ^(DEAD_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(ALIVE_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(EFFACED_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(GENERATED_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(TOUCHING_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(MOVING_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(WAITING_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(FINISHED_KW type_declencheur[st] (NOT)?)
    | ^(STARTED_KW type_declencheur[st](NOT)?)
    | ^(PAUSED_KW type_declencheur[st](NOT)?)
    | ^(MUTED_KW type_declencheur[st] (NOT)? mode_mute[st])
    | ^(PLAYED_KW type_declencheur[st] (NOT)?)
    | ^(STOPPED_KW type_declencheur[st] (NOT)?)
    //| 'true'^
    | ^(VICTORY_KW IDENT)
    | ^(DEFEAT_KW IDENT)
    ;
  
mode_mute [SymbolTable st] returns [Code c]: 
    ON|OFF;
	
affectation [SymbolTable st] returns [Code c]:
    ^(ASSIGN_KW i1=operation[st] i2=variable[st])
    {
	c = Code.genAffect(i2,i1);
    }
    |^(ADD_KW o=operation[st] v=variable[st])
    {
        c = Code.genIncr(v,o);
    }
    |^(SUB_KW op=operation[st] var=variable[st])
    {
        c = Code.genSub(var,op);
    }
    |^(INVERT_KW variable[st] variable[st])
    {
        c = Code.genInvert(var,op);
    }
    ;
  
iaBasique [SymbolTable st] returns [Code c]: 
    ^(IA_KW IDENT reglesJeu[st]+);

/* Arithmetic expression */

operation [SymbolTable st] returns [Code c]:
    ^(RANDOM_KW c1 =operation[st] c2 =operation[st])
    {c=Code.genRD(c1,c2);}
    |^(PLUS operation[st] operation[st])
    {c=Code.genPLUS(c1,c2);}
    |^(MINUS operation[st] operation[st])
    {c=Code.genMINUS(c1,c2);}
    |^(MUL operation[st] operation[st])
    {c=Code.genMUL(c1,c2);}
    |^(DIV operation[st] operation[st])
    {c=Code.genDIV(c1,c2);}
    |^(MOD operation[st] operation[st])
    {c=Code.genMOD(c1,c2);}
    |^(POW operation[st] operation[st])
    {c=Code.genPOW(c1,c2);}
    |v = variable[st]
    {c = v;}
    |f = FLOAT
    {c = new Code(f.getText());}
    ;
 

variable [SymbolTable st] returns [Code c]:
    ^(X tc=typeCoordonnees[st] sb=accesClass[st])
    {
	Symbol sy = sb.get(0);
	if(tc.equals("position")){
	    c = Code.genPosX(sy.getName());
        }else if(tc.equals("angle")){
            c = Code.genoRX(sy.getName());
        }else{
            c = Code.genTX(sy.getName());
        }
    }
    |^(Y tc =typeCoordonnees[st] sb=accesClass[st])
    {
	Symbol sy = sb.get(0);
	if(tc.equals("position")){
	    c = Code.genPosY(sy.getName());
        }else if(tc.equals("angle")){
            c = Code.genoRY(sy.getName());
        }else{
            c = Code.genTY(sy.getName());
        }
    }
    |^(Z typeCoordonnees[st] sb=accesClass[st])
    {
	Symbol sy = sb.get(0);
	if(tc.equals("position")){
	    c = Code.genPosZ(sy.getName());
        }else if(tc.equals("angle")){
            c= Code.genoRZ(sy.getName());
        }else{
            c= Code.genTZ(sy.getName());
        }
    }
    |^(VAR_I_KW i=IDENT e=accesClass[st])
    {
	Symbol si = e.get(0);String ident= i.getText(); AttributeValue a = si.getAttribute(ident);
	if(a==null){
	    System.out.println(si.getName()+"n'a pas l'attribut"+ident);
	    System.exit(-1);
	}
	else if(a.getType()!= AttributeValue.Type.NUMBER){
	    System.out.println(ident+"n'est pas un nombre.");
	    System.exit(-1);
	}else{
	    c=Code.genAccess(si.getName(),ident);
	}
    }
    |GAME_SCORE_KW
    |^(VALUE_KW at=attributTps[st] ac=accesClass[st])
    {
	Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
	if(a==null){
	    System.out.println(si.getName()+"n'a pas l'attribut"+at);
	    System.exit(-1);
	}
	else{
	    c=Code.genAccess(si.getName(),at);
	}
    }
    ;

accesClass [SymbolTable st] returns [ArrayList<Symbol> sb]
    @init{sb = new ArrayList<Symbol>();} :	//TO DO
    ^(ACCESS_KW ALL)
    {
	sb.addAll(st.getAllEntities());
    }
    | ^(ACCESS_KW i=IDENT co=operation[st]?) //acces a un tableau.
    {
	String ident = i.getText(); Symbol s = st.get(ident);
	if(s==null){
	    System.out.println("L'identifiant "+ident+" n'est pas défini.");
	    System.exit(-1);
	}else{
	    sb.add(s);
	}
    }
    | ^(ACCESS_KW PLAYER)
    {
	sb.add(Genre.player);
    }
    ;
  
typeCoordonnees [SymbolTable st] returns [Code c]:
	POSITION {c = new Code("position");}| ORIENTATION {c = new Code("angle");}| SIZE {c = new Code("taille");}
	;

timeUnit [SymbolTable st] returns [String c]:
	MIN	{c = "mn";}
	| SEC{c = "s";}
	| MS{c = "ms";}    
	| FRAME
	;

attributTps [SymbolTable st] returns [String c]:
	BOOST_INTERVAL{c ="boostInterval";}
	| SHOOT_INTERVAL {c = "shootInterval";}        //attributes of "weapon" :
	| RELOAD_TIME {c = "reloadTime";}
	;

attributListeOuObjet [SymbolTable st] returns [Code c]:
  INVENTORY
  | EQUIPED_OBJECT
  | ENTRANCES
  | EXITS
  | DAMAGE_ZONE
  | COLLECTORS
  | TYPES_COLLECTORS
  | GENERATORS
  | TYPE_GENERATORS
  | BREAKERS
  | TYPES_BREAKERS
  | TELEPORTABLES
  | TYPES_TELEPORTABLES
  ;
