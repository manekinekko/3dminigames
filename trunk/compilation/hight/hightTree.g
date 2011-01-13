tree grammar hightTree;

options {
    tokenVocab=hight;
    ASTLabelType=CommonTree;
}

//@header {}

//@members {}

/*------------------------------------------------------------------
 * TREE RULES
 *------------------------------------------------------------------*/
 
game [SymbolTable st] returns [Code c]:
	^(GAME_KW gameData[st]? newType[st]* init[st]+ definition[st]* commande[st]* reglesJeu[st]* iaBasique[st]*);
	

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
newType [SymbolTable st] returns [Code c]:
	^(TYPE_KW IDENT subType_list[st])
	;

subType_list [SymbolTable st] returns [Code c]: 
	subType[st]+;
  
subType [SymbolTable st] returns [Code c]:
	IDENT
	| typeObjet[st]
	;	
	
init [SymbolTable st] returns [Code c]:
	^(INIT_IS_KW IDENT declarationObjet[st])
	|^(INIT_HAS_KW affectationObjet[st])
	;

// A revoir : CAMERA : si rien n'est ajouté on fait quoi ?, MEDIA pareil
declarationObjet [SymbolTable st] returns [Code c]:
	^(DEC typeEntity[st] entityMode[st]?)   // interaction is neutral by default
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
	
typeEntity [SymbolTable st] returns [Code c]:
	IDENT
	| typeObjet3D[st]
	;

entityMode [SymbolTable st] returns [Code c]:
	PLAYER
	| ^(INTERACTION_KW interaction[st] dupli[st]?)
	| dupli[st]
	;
	
interaction [SymbolTable st] returns [Code c]:
	ALLY
	| ENEMY
	| NEUTRAL
	;

dupli [SymbolTable st] returns [Code c]:
	DUPLICABLE	
	;
	
view [SymbolTable st] returns [Code c]:
	FIRST
	| THIRD
	;

affectationObjet [SymbolTable st] returns [Code c]:
	^( ALLOCATION_KW IDENT valAggregation[st]) 
	^( ALLOCATION_KW attribut[st] typeAllocation[st])
	^( ALLOCATION_KW typeCoordonnees[st] coordinates[st])
	^( ALLOCATION_KW attributListeOuObjet[st] IDENT)
	^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st]);
  ;
typeAllocation [SymbolTable st] returns [Code c]:	
	(operation[st] | IDENT | 'true' | 'false')
	;
	
valAggregation [SymbolTable st] returns [Code c]:
	^(AGGREGATION_KW operation[st] timeUnit[st]?)
	|^(AGGREGATION_KW IDENT)
	; 
 
 valAffectation [SymbolTable st] returns [Code c]: 
	operation[st] 
	|IDENT
	|'true' | 'false'
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
	accesClasse[st] actionObjet[st]
	|^(ENDS_KW IDENT) 
	|^(ENDS_KW GAME) 
	|^(STARTS_KW IDENT)
	|^(STARTS_KW GAME)
	|^(PAUSE_KW IDENT)
	|^(MUTE_KW ON IDENT)
	|^(MUTE_KW OFF IDENT) 
	|^(PLAY_KW IDENT)
	|^(STOP_KW IDENT)
	|^(BLOCK_KW transformation[st] accesClasse[st] coordinates[st])
	|^(EFFACE_KW typeAcces[st] typeDestination[st]?)
	|^(GENERATE_KW typeAcces[st] typeDestination[st]?)
	|^(WAIT_KW operation[st] timeUnit[st] consequences[st])
	|^(SAVE_KW)
	;

typeAcces [SymbolTable st] returns [Code c]:
	accesLocal[st] | operation[st] (IDENT | accesGlobal[st]);

typeDestination [SymbolTable st] returns [Code c]: 
	accesLocal[st] | accesLocal[st] | coordinates[st];

actionObjet [SymbolTable st] returns [Code c]:
  ^(DIES_KW)
  | actionCommandePressee[st]
  |^(DURING actionCommandeMaintenue[st] operation[st] timeUnit[st])
  |^(UNTIL actionCommandeMaintenue[st] conditions[st])
  |^(EQUIP accesLocal[st]) 
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
  UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN
  ;
 
clavier [SymbolTable st] returns [Code c]:
  LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER          //CHAR : Z,Q,S,D,...
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
  ^(ACTIVATE_KW type_Command[st]) 
  |^(DISABLE_KW type_Command[st])
	;

type_Command [SymbolTable st] returns [Code c]:
	COMMANDS 
	| MOUSE_KW (souris[st] (VIRG! souris)*)? 
	| KEY_KW clavier[st] (VIRG! clavier[st])* 
	| KEYBOARD;
 	
reglesJeu [SymbolTable st] returns [Code c]:
  ^(RULE_KW IDENT? declencheur[st] consequences[st])
  ;
 
declencheur [SymbolTable st] returns [Code c]:
  accesClasse[st] (MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st]) 
  |^(ENDS_KW type_declencheur[st]) |
  ^(STARTS_KW type_declencheur[st])          //ident if it is a counter
  |^(BECOMES_VAR_KW variable[st] varOuNB[st])
  |^(BECOMES_ID_KW IDENT playerOuInteraction[st])
  |^VICTORY_KW 
  |^DEFEAT_KW^
  ;
  
type_declencheur [SymbolTable st] returns [Code c]: 
	IDENT|GAME;
	
varOuNB [SymbolTable st] returns [Code c]:	variable[st] | FLOAT;

playerOuInteraction [SymbolTable st] returns [Code c]
	:	(PLAYER| interaction[st]);

declencheurTK [SymbolTable st] returns [Code c]
	:	^(TOUCHES_KW declencheur_O[st])
	| ^(KILLS_KW declencheur_O[st]);
	

	
declencheurKT [SymbolTable st] returns [Code c]
	:	^(KILLED_KW declencheur_O[st]) 
	| ^(TOUCHED_KW declencheur_O[st]);

declencheur_O [SymbolTable st] returns [Code c]:
	(OTHER)? accesGlobal[st] | accesLocal[st];
	
/* Conditions */  
siAlors [SymbolTable st] returns [Code c]:
  ^(IF_KW conditions[st] consequences[st] consequences[st]?)
  ;
//////////////////////////////////////////////////////////////////////////petit pb ici je pense
conditions [SymbolTable st] returns [Code c]:
  ^(CONDITION_KW NOT? condition[st])
  |^(OR condition NOT? condition[st])
  |^(AND condition NOT? condition[st])
  |^(EQUALS operation[st] operation[st])
  |^(INF operation[st]operation[st])
  |^(SUP operation[st] operation[st])
  |^(INFEG operation[st] operation[st])
  |^(SUPED operation[st] operation[st])
  |^(DIFF operation[st] operation[st])
  ;

etat [SymbolTable st] returns [Code c]:
	^(DEAD_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(ALIVE_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(EFFACED_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(GENERATED_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(TOUCHING_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(MOVING_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(WAITING_KW accesClasse[st] (NOT)? declencheur_O[st])
	| ^(FINISHED_KW type_declencheur[st] (NOT)?)
	| ^(STARTED_KW type_declencheur[st](NOT)?)
	| ^(PAUSED_KW type_declencheur[st](NOT)?)
	| ^(MUTED_KW type_declencheur[st] (NOT)? mode_mute[st])
	| ^(PLAYED_KW type_declencheur[st] (NOT)?)
	| ^(STOPPED_KW type_declencheur[st] (NOT)?)
  //| 'true'^                                                   
  |^(VICTORY_KW)
  |^(DEFEAT_KW)
  ;
  
mode_mute [SymbolTable st] returns [Code c]: 
	ON|OFF;
	
affectation [SymbolTable st] returns [Code c]:
  ^(ASSIGN_KW operation[st] variable[st])
  |^(ADD_KW operation[st] variable[st]) 
  |^(SUB_KW operation[st] variable[st]) 
  |^(INVERT_KW variable[st] variable[st])
  ;
  
iaBasique [SymbolTable st] returns [Code c]: ^(IA_KW accesClasse[st] actionObjet_List[st]);

actionObjet_list [SymbolTable st] returns [Code c]: actionObjet[st]+;


	
	
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
  ^(X typeCoordonnees[st] accesClasse[st])
  |^(Y typeCoordonnees[st] accesClasse[st])
  |^(Z typeCoordonnees[st] accesClasse[st])
  |^(VAR_I_KW IDENT accesClasse[st])
  |^(VAR_A_KW attribut[st] accesClasse[st])
  |^(GAME_SCORE_KW)
  |^(VALUE_KW attributTps[st] accesClasse[st])
  ;

accesClasse [SymbolTable st] returns [Code c]: 
  ALL 
  | accesLocal[st]
  | accesGlobal[st]
  ;

accesGlobal [SymbolTable st] returns [Code c]:
  typeObjet[st]
  | interaction[st]
  | PG NOT (typeObjet[st] | interaction[st] | PLAYER) PD
  ;

accesLocal [SymbolTable st] returns [Code c]:
  IDENT
  | NUM operation[st] IN IDENT
  | PLAYER
  ;
  
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
typeObjet [SymbolTable st] returns [Code c]:
	CAMERA
	| MEDIA
	| COUNTER
	| TIME
	| typeObjet3D[st]
  ;
 
// every predefined classe

typeObjet3D [SymbolTable st] returns [Code c]:
	OBJECT                      // -> position(x,y,z), orientation(x,y,z), size(x,y,z)
	| CHARACTER                 // -> life, lifeMax, magic, magicMax , level, experience, attack, defense
	| VEHICLE                   // -> acceleration, speedMax,
	| PLANE | SPACECRAFT
	| OBSTACLE                  // a fixed entity, used for collisions
	| WEAPON                    // -> nbMunitions, nbMaxMunitions, intervalleTirs, timeRecharge
	| SWORD                     // -> damages, level
	| PROJECTILE                // -> vitesse, damages, level(pourquoi pas)
	| ZONE                      // an invisible and traversable entity
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