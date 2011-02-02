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
}

@members {
    private int INT_PLAYER=1, INT_ALLY=2, INT_ENEMY=3, INT_NEUTRAL=4, INT_DUPLICABLE=10;
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
	System.out.println(def.getCode());
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
	    } else if(verif.getName() != id) {
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
		Iterator<Pair<String,Attributes>> ite = ao.iterator();
		while(ite.hasNext()) {
		    Pair<String,Attributes> p = ite.next();
		    s.addAttribute(p.getFirst(),p.getSecond());
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
	| to=typeObjet3D{t = to;}
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
affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,Attributes>> c] @init{c = new ArrayList();}:
        (a=affectationObjet[st]{c.addAll(a);} )+;

affectationObjet [SymbolTable st] returns [ArrayList<Pair<String,Attributes>> c] @init{c = new ArrayList();}:
	^( ALLOCATION_KW i=IDENT t=valAggregation[st]?)
        {c.add(new Pair(i.getText(),t));}
	| ^( ALLOCATION_KW a=attribut[st] ta=typeAllocation[st]) //Controle de type a voir, c'est moche !!!
            {
		if(!a.getSecond().equals(ta.getFirst())) {
		    System.out.println("Erreur : Erreur de type");
		    System.exit(-1);
		}

		try {
		    Attributes attr = ta.getFirst().getConstructor(Code.class).newInstance(ta.getSecond());
		    c.add(new Pair(a.getFirst(), attr));
		} catch(Exception e) {
		    System.out.println("Erreur Critique !!!");
		    System.exit(-1);
		}
	    }
	| ^( ALLOCATION_KW tc=typeCoordonnees[st] coo=coordinates[st])
        {String mode = tc.getCode();
        if(mode.equals("position")){
                c.add(new Pair("posX", new AttributeNum(coo.x)));
                c.add(new Pair("posY", new AttributeNum(coo.y)));
                c.add(new Pair("posZ", new AttributeNum(coo.z)));
            }else if(mode.equals("angle")){
                c.add(new Pair("orX", new AttributeNum(coo.x)));
                c.add(new Pair("orY", new AttributeNum(coo.y)));
                c.add(new Pair("orZ", new AttributeNum(coo.z)));
            }else{
                c.add(new Pair("tX", new AttributeNum(coo.x)));
                c.add(new Pair("tY", new AttributeNum(coo.y)));
                c.add(new Pair("tZ", new AttributeNum(coo.z)));
            }
        }
	| ^( ALLOCATION_KW attributListeOuObjet[st] IDENT)
	| ^( ALLOCATION_KW att=attributTps[st] v=operation[st] u=timeUnit[st])
        {c.add(new Pair(att,new AttributeTime(v.getCode(),u)));}
    ;
    
typeAllocation [SymbolTable st] returns [Pair<Class<Attributes>, Code> p]:
	co = operation[st] {p = new Pair(AttributeNum.class,co);}
	| i=IDENT {p = new Pair(AttributeString.class,new Code(i.getText()));}
	| 'true' {p = new Pair(AttributeBoolean.class, new Code ("true"));}
	| 'false' {p = new Pair(AttributeBoolean.class, new Code ("false"));}
	;
	
valAggregation [SymbolTable st] returns [Attributes c]:
	^(AGGREGATION_KW o=operation[st] t=timeUnit[st]?)
        {if(t!=null){
            c= new AttributeTime(o.getCode(),t);
        }else{
                c=new AttributeNum(o);
            }
        }
	|^(AGGREGATION_KW i=IDENT)
        {c = new AttributeString(i.getText());}
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
  {Symbol si = e.get(0);String ident= i.getText(); Attributes a = si.getAttribute(ident);
    if(a==null){
        System.out.println(si.getName()+"n'a pas l'attribut"+ident);
        System.exit(-1);}
    else if(a.getClass()!= AttributeNum.class){
        System.out.println(ident+"n'est pas un nombre.");
        System.exit(-1);
   }else{
        c=Code.genAccess(si.getName(),ident);
    }}
  |^(VAR_A_KW att=attribut[st] en=accesClass[st])
  {Symbol si = en.get(0); Attributes a = si.getAttribute(att.getFirst());
    if(a==null){
        System.out.println(si.getName()+"n'a pas l'attribut"+att.getFirst());
        System.exit(-1);}
    else if(a.getClass()!= AttributeNum.class){
        System.out.println(att.getFirst()+"n'est pas un nombre.");
        System.exit(-1);
   }else{
        c=Code.genAccess(si.getName(),att.getFirst());
    }}
  |GAME_SCORE_KW
  |^(VALUE_KW at=attributTps[st] ac=accesClass[st])
  {Symbol si = ac.get(0); Attributes a = si.getAttribute(at);
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
        System.out.println("L'identifiant"+ident+"n'est pas défini.");
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
	| to=typeObjet3D {t = to;}
  ;
 
// every predefined classe

typeObjet3D returns [Model t]:
	OBJECT {t = Model.object;}
	| CHARACTER {t = Model.character;}
	| VEHICLE                   // -> acceleration, speedMax,
	| PLANE | SPACECRAFT
	| OBSTACLE {t = Model.obstacle;}
	| WEAPON {t = Model.weapon;}
	| SWORD                     // -> damages, level
	| PROJECTILE {t = Model.projectile;}
	| ZONE {t = Model.zone;}
	| GROUND                    // -> type of ground (water, snow ...)
	| BONUS                     // an object which disappears when something touches it-> valeur(entier), nomObjet(type),listeObjets 
	| CHECKPOINT
	| BREAKABLE
	| CONSTRUCTION
	| ROOM
	| BALL
	| TELEPORTER
	;
	
// every attributes of predefined classes
attribut [SymbolTable st] returns [Pair<String,Class<Attributes>> c]:
	MASS {c =new Pair("mass", AttributeNum.class);}                 // attributes of object :
	| IS_FIX {c =new Pair("isFix", AttributeBoolean.class);}
	| IS_TRAVERSABLE {c =new Pair("isTraversable", AttributeBoolean.class);}
	| FOV //{c ="fov";}                    // attributes of "camera"
	| TYPE //{c ="type";}
	| ACTIVE //{c ="active";}
	| NAME {c =new Pair("name", AttributeString.class);}                   // attributes of "character" :
	| DESCRIPTION {c =new Pair("description", AttributeString.class);}
	| LIFE {c =new Pair("life", AttributeNum.class);}
	| LIFE_MAX {c =new Pair("lifeMax", AttributeNum.class);}
	| LIFE_MIN {c =new Pair("lifeMin", AttributeNum.class);}
	| NB_LIVES {c =new Pair("nbOfLives", AttributeNum.class);}
	| MAGIC {c =new Pair("magic", AttributeNum.class);}
	| MAGIC_MAX {c =new Pair("magicMax", AttributeNum.class);}
	| MAGIC_MIN {c =new Pair("magicMin", AttributeNum.class);}
	| LEVEL {c =new Pair("level", AttributeNum.class);}
	| ATTACK {c =new Pair("attack", AttributeNum.class);}
	| DEFENSE {c =new Pair("defense", AttributeNum.class);}
	| JUMP_FORCE {c =new Pair("jumpForce", AttributeNum.class);}
	| JUMP_AIR_MAX {c =new Pair("maxJumpsInTheAir", AttributeNum.class);}
	| MONEY {c =new Pair("money", AttributeNum.class);}
	| CLASS {c =new Pair("classification",new AttributeString(""));}
	| RACE {c =new Pair("race",new AttributeString(""));}
	| ACCELERATION {c =new Pair("acceleration", AttributeNum.class);}
	| SPEED {c =new Pair("speed", AttributeNum.class);}                // attributes of "vehicle" :
	| SPEED_MAX //{c ="maxSpeed";}
	| SPEED_MIN //{c ="minSpeed";}
	| BOOST //{c ="boost";}
	| BOOST_MAX //{c ="maxBoost";}
	| NB_MUNITIONS {c =new Pair("nbMunitions", AttributeNum.class);}           // attributes of"weapon" :
	| NB_MUNITIONS_MAX {c =new Pair("nbMunitionsMax", AttributeNum.class);}
	| SHOOT_POWER {c =new Pair("boostInterval", AttributeNum.class);}
	| DAMAGES {c =new Pair("damages", AttributeNum.class);}               //attributes of "projectile"
	| VALUE //{c ="value";}                // attributes of "bonus" :
	| UNIT //{c ="unit";}
	| OBJECT_NAME //{c ="objectname";}
	| ATTRIBUT_NAME //{c ="attributName";}
	| VOLUME  //{c ="volume";}                //attributes of "media"
	| NUMBER //{c ="number";}           //attributes of "ball"
	| MOVE_WITH_CAMERA {c =new Pair("moveWithCamera", AttributeBoolean.class);}
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