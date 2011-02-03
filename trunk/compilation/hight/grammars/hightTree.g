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
    private int INT_PLAYER=1, INT_ALLY=2, INT_ENEMY=3, INT_NEUTRAL=4, INT_DUPLICABLE=10;
    private Hashtable<String, String> aggreg = new Hashtable<String, String>();
}

/*------------------------------------------------------------------
 * TREE RULES
 *------------------------------------------------------------------*/
 
game [SymbolTable st] returns [Code c]
    @init{c = new Code();}:
    ^(GAME_KW gd=gameData[st]? newType[st]* 
	
	in=initialization[st]

    {
	st.print();
	System.out.println(in.getCode());
    }
     
	(def=definition[st]
 
    {
	System.out.println(def.getCode()+"\n");
    })*

     com=commande[st]+ reg=reglesJeu[st]+ ia=iaBasique[st]*)

	;
	

/*------------------------------ Information about game ---------------------------------*/

gameData [SymbolTable st] returns [Code c]:
	^(GAME_ATTRIBUT_KW attributGame_list[st]);
	
attributGame_list [SymbolTable st] returns [Code c]:
	attributGame[st]+;
	
attributGame [SymbolTable st] returns [Code c]:
	^(GRAVITY_KW FLOAT)
	|^(GRAVITY_KW FLOAT FLOAT FLOAT)
	|^(SCORE_KW FLOAT)
	;
/*-------------------------- Inheritance, creation of type -------------------------------*/	
newType [SymbolTable st]
	@init{List<Model> sub = new ArrayList<Model>();}:
	^(TYPE i=IDENT subType[st,sub]+)
	{   String id = i.getText();
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
	{   String id = i.getText();
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
	| t=typeObjet{sub.add(t);}
	;	

initialization [SymbolTable st] returns [Code c]:
    init[st]+
    {
	Code modelCode = new Code();
	Code entitiesCode = new Code();
	Code entitiesFunCode = new Code();
	List<Entity> lPlayer = new ArrayList<Entity>();
	lPlayer.add(Genre.player);
	List<List<Entity>> list = new ArrayList<List<Entity>>();
	list.add(lPlayer);
	list.add(Genre.allies);
	list.add(Genre.enemies);
	list.add(Genre.neutral);

	Iterator<List<Entity>> genre = list.iterator();
	while(genre.hasNext()) {
	    Iterator<Entity> it = genre.next().iterator();
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
	}

	c = new Code("/*Models*/\n");
	c.append(modelCode);
	c.append("\n/*Entities*/\n");
	c.append(entitiesFunCode);
	c.append(entitiesCode);
	c.append("\n");
    }
    ;

init [SymbolTable st] returns [Code c]:
	^(INIT_IS_KW i=IDENT d=declarationObjet[st])
	{   String id = i.getText();
	    Symbol verif = st.get(id);
	    if(verif != null) {
		System.out.println("Elément \""+id+"\" déjà déclaré.");
		System.exit(-1);
	    } else {
		int mode = d.getSecond();
		int duplicable = (mode/INT_DUPLICABLE);
		mode = mode - (duplicable*INT_DUPLICABLE);
	    
		Entity t = new Entity(id,d.getFirst());
		d.getFirst().toGenerate();

                if(duplicable==1){
                    t.setDuplicable();
                }

		if(mode == INT_PLAYER)
		    Genre.player = t;
		else if(mode == INT_ENEMY)
		    Genre.enemies.add(t);
		else if(mode == INT_ALLY)
		    Genre.allies.add(t);
		else
		    Genre.neutral.add(t);

		st.add(id,t);
	    }
	}
	|^(INIT_HAS_KW ac=accesClass[st] ao=affectationObjet_list[st])
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
	;





// A revoir : CAMERA : si rien n'est ajoute on fait quoi ?, MEDIA pareil
declarationObjet [SymbolTable st] returns [Pair<Model, Integer> p]
	@init{em=null;}:
	^(DEC te=typeEntity[st] (em=entityMode)?)
	{
	    if(em == null)
		em=4;

	    p = new Pair<Model, Integer>(te,em);
	}
	|^(LIST_KW list_declaration[st])
	|^(CAMERA_KW PERSON view[st]) 
	|^(CAMERA_KW FREE)
	|^(MEDIA_KW LOOP) 
	|^(MEDIA_KW ONCE) 						 // sound, music or video played in loop or once
	|^(IN_KW IDENT)									  // ident of a list to add an element
  ;

list_declaration [SymbolTable st] returns [Code c]:  
	(operation[st]? IDENT)+
	;
	
typeEntity [SymbolTable st] returns [Model t]:
	i=IDENT
	{   String id = i.getText();
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

entityMode returns [Integer i]
    @init{d=null;}:
	PLAYER
	{i=INT_PLAYER;}
	| ^(INTERACTION_KW in=interaction d=dupli?) {if(d!=null){i=in+d;}else{i=in;}}
	| d=dupli {i=d;}
	;
	
interaction returns [Integer i]:
	ALLY
	{i=INT_ALLY;}
	| ENEMY
	{i=INT_ENEMY;}
	| NEUTRAL
	{i=INT_NEUTRAL;}
	;

dupli returns [Integer i]:
	DUPLICABLE
	{i=INT_DUPLICABLE;}
	;
	
view [SymbolTable st] returns [Code c]:
	FIRST
	| THIRD
	;
affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] @init{c = new ArrayList();}:
        (a=affectationObjet[st]{c.addAll(a);} )+;

affectationObjet [SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] @init{c = new ArrayList();}:
	^( ALLOCATION_KW i=IDENT t=valAggregation[st]?)
        {if(t==null){
            AttributeValue av = new AttributeValue(new Code(i.getText()),AttributeValue.Type.AGGR);
            c.add(new Pair(i.getText(),av));
        }else{
            c.add(new Pair(i.getText(),t));
        }}
	| ^( ALLOCATION_KW tc=typeCoordonnees[st] coo=coordinates[st])
        {String mode = tc.getCode();
        if(mode.equals("position")){
                c.add(new Pair("posX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                c.add(new Pair("posY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                c.add(new Pair("posZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
            }else if(mode.equals("angle")){
                c.add(new Pair("orX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                c.add(new Pair("orY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                c.add(new Pair("orZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
            }else{
                c.add(new Pair("tX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                c.add(new Pair("tY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                c.add(new Pair("tZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
            }
        }
	| ^( ALLOCATION_KW attributListeOuObjet[st] IDENT)
	| ^( ALLOCATION_KW att=attributTps[st] v=operation[st] u=timeUnit[st])
        {c.add(new Pair(att,new AttributeValue(new Duration(v,u))));}
    ;
    
	
valAggregation [SymbolTable st] returns [AttributeValue c]:
	^(AGGREGATION_KW o=operation[st] t=timeUnit[st]?)
        {if(t!=null){
            c= new AttributeValue(new Duration(o,t));
        }else{
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
	| 'true' {c = new AttributeValue(true,"true");}
	| 'false' {c = new AttributeValue(false,"false");}
	; 


/* Definition */	
definition [SymbolTable st] returns [Code c] @init{ c = new Code();}: 
	^(DEFINITION_KW i=IDENT cons=consequences[st])
	{String ident = i.getText();
	if(st.get(ident)!=null){System.out.println("l'ident "+ ident + " est deja defini");System.exit(-1);}
		else{
			Definition def = new Definition(ident,cons);			
			c.append(Code.genFuncDef(def));
			st.add(ident,def);
			
		}
	}
		;

consequences [SymbolTable st] returns [Code c]:
	^(CONSEQUENCES_KW consequ_list[st])
	{}
	;

consequ_list [SymbolTable st] returns [Code c]:
		consequ[st]+
		{};
		
consequ [SymbolTable st] returns [Code c]:
  i=siAlors[st] //{i=st.c;}
  | action[st] {}
  | affectation[st] {}
  | activCommande[st] {}
  | IDENT
  | VICTORY_KW
  | DEFEAT_KW
  ;

action [SymbolTable st] returns [Code c]:
	accesClass[st] actionObjet[st]
	|^(ENDS_KW IDENT) 
	|^(ENDS_KW GAME) 
	|^(STARTS_KW IDENT)
	|^(STARTS_KW GAME)
	|^(PAUSE_KW IDENT)
	|^(MUTE_KW mode_mute[st] IDENT)
	|^(PLAY_KW IDENT)
	|^(STOP_KW IDENT)
	|^(BLOCK_KW transformation[st] accesClass[st] coordinates[st])
	|^(EFFACE_KW typeAcces[st] typeDestination[st]?)
	|^(GENERATE_KW typeAcces[st] typeDestination[st]?)
	|^(WAIT_KW operation[st] timeUnit[st] consequences[st])
	|SAVE_KW
	;

typeAcces [SymbolTable st] returns [Code c]:
	accesClass[st] | operation[st] (IDENT | accesClass[st]);

typeDestination [SymbolTable st] returns [Code c]: 
	accesClass[st] | coordinates[st];

actionObjet [SymbolTable st] returns [Code c]:
  DIES_KW
  | actionCommandePressee[st]
  |^(DURING actionCommandeMaintenue[st] operation[st] timeUnit[st])
  |^(UNTIL actionCommandeMaintenue[st] conditions[st])
  |^(EQUIP accesClass[st])
  |^(EQUIP NEXT) 
  |^(EQUIP PREVIOUS)   
  ;
  
transformation [SymbolTable st] returns [Code c]:
	TRANSLATION
	| ROTATION
	| SCALE
	;
	
coordinates [SymbolTable st] returns [Coordonnees coo]:
	^(COORDINATE_KW x=operation[st] y=operation[st] z=operation[st])
        {coo = new Coordonnees(x, y, z);}
	;

/* Initialization of commands */

commande [SymbolTable st] returns [Code c]:
	^(COMMAND_KW IDENT? actionCommande_list[st])
	;
	
actionCommande_list[SymbolTable st] returns [Code c]:
	actionCommande[st]+
	;
	
actionCommande [SymbolTable st] returns [Code c]:
	^(MOUSE_KW souris[st] actionCommandeType[st]) 
	|^(KEY_KW clavier[st] actionCommandeType[st]) // ident : that was defined with means
	;

actionCommandeType [SymbolTable st] returns [Code c]:
	IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st]
	;	
 
souris [SymbolTable st] returns [Code c]:
  WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN
  ;
 
clavier [SymbolTable st] returns [Code c]:
  LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER          //CHAR : Z,Q,S,D,...
  ;
 
actionCommandePressee [SymbolTable st] returns [Code c]:
  JUMP operation[st]
  | PAUSE_KW
  | STOP_KW
  ;
  
actionCommandeMaintenue [SymbolTable st] returns [Code c]:
  MOVE (LEFT | RIGHT | FORWARD | BACKWARD)
  | TURN (LEFT | RIGHT)
  | ACCELERATE
  | BRAKE
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
  ^(RULE_KW IDENT? declencheur[st] consequences[st])
  ;
 
declencheur [SymbolTable st] returns [Code c]:
  accesClass[st] (MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st])
  |^(ENDS_KW type_declencheur[st])
  |^(STARTS_KW type_declencheur[st])          //ident if it is a counter
  |^(BECOMES_VAR_KW variable[st] varOuNB[st])
  |^(BECOMES_ID_KW IDENT playerOuInteraction[st])
  |VICTORY_KW 
  |DEFEAT_KW
  ;
  
type_declencheur [SymbolTable st] returns [Code c]: 
	IDENT|GAME;
	
varOuNB [SymbolTable st] returns [Code c]:	variable[st] | FLOAT;

playerOuInteraction [SymbolTable st] returns [Code c]
	:	(PLAYER| interaction);

declencheurTK [SymbolTable st] returns [Code c]
	:	^(TOUCHES_KW (OTHER)? accesClass[st])
	| ^(KILLS_KW (OTHER)? accesClass[st]);
	

	
declencheurKT [SymbolTable st] returns [Code c]
	:	^(KILLED_KW (OTHER)? accesClass[st])
	| ^(TOUCHED_KW (OTHER)? accesClass[st]);
	
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
  |VICTORY_KW
  |DEFEAT_KW
  ;
  
mode_mute [SymbolTable st] returns [Code c]: 
	ON|OFF;
	
affectation [SymbolTable st] returns [Code c]:
  ^(ASSIGN_KW i1=operation[st] i2=variable[st]){//verifier attribute = attributeNum
	/*if(i2.getSecond().getClass() != attributeNum.class){System.out.println("la variable "+ i2 + " n'est pas de type entier");System.exit(-1);}
	c = genAffect(i1,i2);*/}
  |^(ADD_KW operation[st] variable[st]) 
  |^(SUB_KW operation[st] variable[st]) 
  |^(INVERT_KW variable[st] variable[st])
  ;
  
iaBasique [SymbolTable st] returns [Code c]: ^(IA_KW accesClass[st] actionObjetList[st]);

actionObjetList [SymbolTable st] returns [Code c]: actionObjet[st]+;


	
	
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
	|variable[st]
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
                c= Code.genoRX(sy.getName());
        }else{
                c= Code.genTX(sy.getName());
            }
  }
  |^(Y tc =typeCoordonnees[st] sb=accesClass[st])
  {
            Symbol sy = sb.get(0);
      if(tc.equals("position")){
                c = Code.genPosY(sy.getName());
        }else if(tc.equals("angle")){
                c= Code.genoRY(sy.getName());
        }else{
                c= Code.genTY(sy.getName());
            }
  }
  |^(Z typeCoordonnees[st] sb=accesClass[st])
    {      Symbol sy = sb.get(0);
      if(tc.equals("position")){
                c = Code.genPosZ(sy.getName());
        }else if(tc.equals("angle")){
                c= Code.genoRZ(sy.getName());
        }else{
                c= Code.genTZ(sy.getName());
            }
        }
  |^(VAR_I_KW i=IDENT e=accesClass[st])
  {Symbol si = e.get(0);String ident= i.getText(); AttributeValue a = si.getAttribute(ident);
    if(a==null){
        System.out.println(si.getName()+"n'a pas l'attribut"+ident);
        System.exit(-1);}
    else if(a.getType()!= AttributeValue.Type.NUMBER){
        System.out.println(ident+"n'est pas un nombre.");
        System.exit(-1);
   }else{
        c=Code.genAccess(si.getName(),ident);
    }}
  |GAME_SCORE_KW
  |^(VALUE_KW at=attributTps[st] ac=accesClass[st])
  {Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
    if(a==null){
    System.out.println(si.getName()+"n'a pas l'attribut"+at);
    System.exit(-1);}
    else{
        c=Code.genAccess(si.getName(),at);
    }}
  ;

accesClass [SymbolTable st] returns [ArrayList<Symbol> sb] @init{sb = new ArrayList();}:
    ^(ACCESS_KW ALL)
    {sb.add(Genre.player);sb.addAll(Genre.allies);sb.addAll(Genre.enemies);sb.addAll(Genre.neutral);}
  | ^(ACCESS_KW mo=typeObjet)
    {sb.add(mo);}
  | ^(ACCESS_KW val=interaction)
    {if(val == 2 ){
        sb.addAll(Genre.allies);
    }else if (val == 3){
        sb.addAll(Genre.enemies);
    }else{
        sb.addAll(Genre.neutral);
    }
    }
  | ^(ACCESS_KW NOT notAccess[st])
    {}
  | ^(ACCESS_KW i=IDENT co=operation[st]?) //acces a un tableau.
    {String ident = i.getText(); Symbol s = st.get(ident);
    if(s==null){
        System.out.println("L'identifiant "+ident+" n'est pas défini.");
        System.exit(-1);
    }else{
        sb.add(s);
    }
    }
  | ^(ACCESS_KW PLAYER)
    {sb.add(Genre.player);}
  ;

notAccess [SymbolTable st] returns [Code c] :
typeObjet | interaction | PLAYER;
  
typeCoordonnees [SymbolTable st] returns [Code c]:
	POSITION {c = new Code("position");}| ORIENTATION {c = new Code("angle");}| SIZE {c = new Code("taille");}
	;

timeUnit [SymbolTable st] returns [String c]:
	MIN
	| SEC
	| MS
        {c = "ms";}
	| FRAME
	;

/*  */
typeObjet returns [Model t]:
	CAMERA
	| MEDIA
	| COUNTER
	| TIME
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
