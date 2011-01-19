tree grammar hightTree;

options {
    tokenVocab=hight;
    ASTLabelType=CommonTree;
}

@header {
    package grammars;
    import code.*;
    import types.*;
    import lib.*;
}

//@members {}

/*------------------------------------------------------------------
 * TREE RULES
 *------------------------------------------------------------------*/
 
game [SymbolTable st] returns [Code c]
	@init{c = new Code();		Type.init();}:
	^(GAME_KW gd=gameData[st]? newType[st]* in=init[st]+ def=definition[st]* com=commande[st]+ reg=reglesJeu[st]+ ia=iaBasique[st]*)
	{st.print();}
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
	@init{List<Type> sub = new ArrayList<Type>();}:
	^(TYPE i=IDENT subType[st,sub]+)
	{   String id = i.getText();
	    Type verif = st.get(id);
	    if(verif != null) {
		System.out.println("Type \""+id+"\" déjà déclaré.");
		System.exit(-1);
	    } else {
		Type[] tab = (Type[])sub.toArray(new Type[0]);
		Type t = new Type(id, tab);
		st.add(id, t);
	    }
	}
	;

subType [SymbolTable st, List<Type> sub] :
	i=IDENT
	{   String id = i.getText();
	    Type verif = st.get(id);
	    if(verif == null) {
		System.out.println("Type \""+id+"\" non défini.");
		System.exit(-1);
	    } else if(verif.getName() != id) {
		System.out.println("Gros Gros bug !!!");
		System.exit(-1);
	    } else {
		sub.add(verif);
	    }
	}
	| t=typeObjet{sub.add(t);}
	;	
	
init [SymbolTable st] returns [Code c]:
	^(INIT_IS_KW i=IDENT d=declarationObjet[st])
	{   String id = i.getText();
	    Type verif = st.get(id);
	    if(verif != null) {
		System.out.println("Elément \""+id+"\" déjà déclaré.");
		System.exit(-1);
	    } else {
		Type t = new Type(d.getFirst().getName(),d.getFirst());
		st.add(id,t);
	    }
	}
	|^(INIT_HAS_KW affectationObjet[st])
	;

// A revoir : CAMERA : si rien n'est ajoute on fait quoi ?, MEDIA pareil
declarationObjet [SymbolTable st] returns [Pair<Type, Integer> p]
	@init{em=null;}:
	^(DEC te=typeEntity[st] (em=entityMode)?)
	{
	    if(em == null)
		em=4;

	    p = new Pair<Type, Integer>(te,em);
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
	
typeEntity [SymbolTable st] returns [Type t]:
	i=IDENT
	{   String id = i.getText();
	    Type verif = st.get(id);
	    if(verif == null) {
		System.out.println("Type \""+id+"\" non défini.");
		System.exit(-1);
	    } else if(verif.getName() != id) {
		System.out.println("Gros Gros bug !!!");
		System.exit(-1);
	    } else {
		t = verif;
	    }
	}
	| to=typeObjet3D{t = to;}
	;

entityMode returns [Integer i]
    @init{d=null;}:
	PLAYER
	{i=1;}
	| ^(INTERACTION_KW in=interaction d=dupli?) {if(d!=null){i=in+d;}else{i=in;}}
	| d=dupli {i=d;}
	;
	
interaction returns [Integer i]:
	ALLY
	{i=2;}
	| ENEMY
	{i=3;}
	| NEUTRAL
	{i=4;}
	;

dupli returns [Integer i]:
	DUPLICABLE
	{i=10;}
	;
	
view [SymbolTable st] returns [Code c]:
	FIRST
	| THIRD
	;

affectationObjet [SymbolTable st] returns [Code c]:
	^( ALLOCATION_KW IDENT valAggregation[st]?)
	| ^( ALLOCATION_KW attribut[st] typeAllocation[st])
	| ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st])
	| ^( ALLOCATION_KW attributListeOuObjet[st] IDENT)
	| ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st])
    ;
    
typeAllocation [SymbolTable st] returns [Code c]:	
	(operation[st] | IDENT | 'true' | 'false')
	;
	
valAggregation [SymbolTable st] returns [Code c]:
	^(AGGREGATION_KW operation[st] timeUnit[st]?)
	|^(AGGREGATION_KW IDENT)
	; 

/* Definition */	
definition [SymbolTable st] returns [Code c]: 
	^(DEFINITION_KW IDENT consequences[st])
		;

consequences [SymbolTable st] returns [Code c]:
	^(CONSEQUENCES_KW consequ_list[st])
	;

consequ_list [SymbolTable st] returns [Code c]:
		consequ[st]+;
		
consequ [SymbolTable st] returns [Code c]:
  siAlors[st]
  | action[st]
  | affectation[st]
  | activCommande[st]
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
	
coordinates [SymbolTable st] returns [Code c]:
	^(COORDINATE_KW operation[st] operation[st] operation[st])
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
  ^(IF_KW conditions[st] consequences[st] consequences[st]?)
  ;
//////////////////////////////////////////////////////////////////////////petit pb ici je pense
conditions [SymbolTable st] returns [Code c]:
  ^(CONDITION_KW NOT? conditions[st])
  |^(OR conditions[st] NOT? conditions[st])
  |^(AND conditions[st] NOT? conditions[st])
  |^(EQUALS operation[st] operation[st])
  |^(INF operation[st]operation[st])
  |^(SUP operation[st] operation[st])
  |^(INFEG operation[st] operation[st])
  |^(SUPED operation[st] operation[st])
  |^(DIFF operation[st] operation[st])
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
  ^(ASSIGN_KW operation[st] variable[st])
  |^(ADD_KW operation[st] variable[st]) 
  |^(SUB_KW operation[st] variable[st]) 
  |^(INVERT_KW variable[st] variable[st])
  ;
  
iaBasique [SymbolTable st] returns [Code c]: ^(IA_KW accesClass[st] actionObjetList[st]);

actionObjetList [SymbolTable st] returns [Code c]: actionObjet[st]+;


	
	
/* Arithmetic expression */

operation [SymbolTable st] returns [Code c]:
	^(RANDOM_KW operation[st] operation[st])
	|^(PLUS operation[st] operation[st])
	|^(MINUS operation[st] operation[st])
	|^(MUL operation[st] operation[st])
	|^(DIV operation[st] operation[st])
	|^(MOD operation[st] operation[st])
	|^(POW operation[st] operation[st])
	|variable[st]
	|FLOAT
	;
 

variable [SymbolTable st] returns [Code c]:
  ^(X typeCoordonnees[st] accesClass[st])
  |^(Y typeCoordonnees[st] accesClass[st])
  |^(Z typeCoordonnees[st] accesClass[st])
  |^(VAR_I_KW IDENT accesClass[st])
  |^(VAR_A_KW attribut[st] accesClass[st])
  |GAME_SCORE_KW
  |^(VALUE_KW attributTps[st] accesClass[st])
  ;

accesClass [SymbolTable st] returns [Code c] :
    ^(ACCESS_KW ALL)
  | ^(ACCESS_KW typeObjet)
  | ^(ACCESS_KW interaction)
  | ^(ACCESS_KW NOT notAccess[st])
  | ^(ACCESS_KW IDENT operation[st]?)
  | ^(ACCESS_KW PLAYER)
  ;

notAccess [SymbolTable st] returns [Code c] :
typeObjet | interaction | PLAYER;
  
typeCoordonnees [SymbolTable st] returns [Code c]:
	POSITION | ORIENTATION | SIZE
	;

timeUnit [SymbolTable st] returns [Code c]:
	MIN
	| SEC
	| MS
	| FRAME
	;

/*  */
typeObjet returns [Type t]:
	CAMERA
	| MEDIA
	| COUNTER
	| TIME
	| to=typeObjet3D {t = to;}
  ;
 
// every predefined classe

typeObjet3D returns [Type t]:
	OBJECT {t = Type.object;}
	| CHARACTER {t = Type.character;}
	| VEHICLE                   // -> acceleration, speedMax,
	| PLANE | SPACECRAFT
	| OBSTACLE {t = Type.obstacle;}
	| WEAPON {t = Type.weapon;}
	| SWORD                     // -> damages, level
	| PROJECTILE {t = Type.projectile;}
	| ZONE {t = Type.zone;}
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
attribut [SymbolTable st] returns [Code c]: 
	MASS                  // attributes of object :
	| IS_FIX
	| IS_TRAVERSABLE
	| FOV                    // attributes of "camera"
	| TYPE
	| ACTIVE
	| NAME                   // attributes of "character" :
	| DESCRIPTION
	| LIFE
	| LIFE_MAX
	| LIFE_MIN
	| NB_LIVES
	| MAGIC
	| MAGIC_MAX
	| MAGIC_MIN
	| LEVEL
	| ATTACK
	| DEFENSE
	| JUMP_FORCE
	| JUMP_AIR_MAX
	| MONEY
	| CLASS
	| RACE
	| ACCELERATION
	| SPEED                // attributes of "vehicle" :
	| SPEED_MAX
	| SPEED_MIN
	| BOOST
	| BOOST_MAX
	| NB_MUNITIONS           // attributes of"weapon" :
	| NB_MUNITIONS_MAX
	| SHOOT_POWER
	| DAMAGES               //attributes of "projectile"
	| VALUE                // attributes of "bonus" :
	| UNIT
	| OBJECT_NAME
	| ATTRIBUT_NAME
	| VOLUME                 //attributes of "media"
	| NUMBER              //attributes of "ball"
	| MOVE_WITH_CAMERA
	;
	
attributTps [SymbolTable st] returns [Code c]:
	BOOST_INTERVAL
	| SHOOT_INTERVAL        //attributes of "weapon" :
	| RELOAD_TIME
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