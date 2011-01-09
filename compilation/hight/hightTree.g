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
 
game :
	^(GAME_KW gameData? newType* init+ definition* commande* reglesJeu* iaBasique*);
	

/*------------------------------ Information about game ---------------------------------*/

gameData :
	^(GAME_ATTRIBUT_KW attributGame+);

attributGame :
	^(GRAVITY_KW FLOAT)
	|^(GRAVITY_KW FLOAT FLOAT FLOAT)
	|^(SCORE_KW FLOAT)
	;
/*-------------------------- Inheritance, creation of type -------------------------------*/	
newType :
	^(TYPE_KW IDENT subType+)
	;
  
subType :
	IDENT
	| typeObjet
	;	
	
init :
	^(INIT_IS_KW IDENT declarationObjet)
	|^(INIT_HAS_KW affectationObjet)
	;

// A revoir : CAMERA : si rien n'est ajouté on fait quoi ?, MEDIA pareil
declarationObjet :
	^(DEC typeEntity entityMode?)   // interaction is neutral by default
	|^(LIST_KW (operation? IDENT)+)
	|^(CAMERA_KW PERSON view) 
	|^(CAMERA_KW FREE))?
	|^(MEDIA_KW LOOP) 
	|^(MEDIA_KW ONCE))? 						 // sound, music or video played in loop or once
	|^(IN_KW IDENT)									  // ident of a list to add an element
  ;

typeEntity :
	IDENT
	| typeObjet3D
	;

entityMode:
	PLAYER
	| interaction dupli? ->^(INTERACTION_KW interaction dupli?)
	| dupli
	;
	
interaction :
	ALLY
	| ENEMY
	| NEUTRAL
	;

dupli :
	DUPLICABLE	
	;
	
view :
	FIRST
	| THIRD
	;

affectationObjet :
	^( ALLOCATION_KW IDENT valAggregation) 
	^( ALLOCATION_KW attribut valAffectation)
	^( ALLOCATION_KW typeCoordonnees coordonnees)
	^( ALLOCATION_KW attributListeOuObjet IDENT)
	^( ALLOCATION_KW attributTps operation timeUnit);
  ;

valAggregation :
	^(operation timeUnit?)
	| IDENT
	; 
 
 valAffectation : 
	operation 
	|^(STRING)
	|^(BOOL)
	;

/* Arithmetic expression */

operation :
	^(RANDOM_KW operation operation)
	|^(PLUS operation operation)
	|^(MINUS operation operation)
	|^(MUL operation operation)
	|^(DIV operation operation)
	|^(MOD operation operation)
	|^(POW operation operation)
	|variable
	|FLOAT
	;
 

// A revoir
variable :
  (((X | Y | Z) OF typeCoordonnees) | IDENT | attribut) OF accesClasse
  |^(GAME_SCORE_KW)
  |^(VALUE_KW attributTps accesClasse)
  ;

// A revoir
accesClasse : 
  ALL 
  | accesLocal
  | accesGlobal
  ;

// A revoir
accesGlobal :
  typeObjet
  | interaction
  | PG NOT (typeObjet | interaction | 'player') PD
  ;

// A revoir : Attention il existe un IN_KW donc à voir s'il faut changer ou pas.
accesLocal :
  IDENT
  | 'num' operation 'in' IDENT
  | 'player'
  ;
  
typeCoordonnees :
	POSITION | ORIENTATION | SIZE
	;

timeUnit :
	MIN
	| SEC
	| MS
	| FRAME
	;

/*  */
typeObjet :
	CAMERA
	| MEDIA
	| COUNTER
	| TIME
	| typeObjet3D
  ;
 
// every predefined classe

typeObjet3D:
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
attribut : 
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
	
attributTps :
	BOOST_INTERVAL
	| SHOOT_INTERVAL        //attributes of "weapon" :
	| RELOAD_TIME
  ;