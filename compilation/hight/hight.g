grammar hight;

options {
    output=AST;
}

tokens {
	GAME_KW='GAME_KW';
	GAME_ATTRIBUT_KW='GAME_ATTRIBUT_KW';
	INIT_IS_KW='INIT_IS_KW';
	INIT_HAS_KW;
	DEC='DEC';
	MEDIA_KW;
	CAMERA_KW;
	INTERACTION_KW;
	GAME_SCORE_KW;
	SCORE_KW;
	VALUE_KW;
	IN_KW;
	ALLOCATION_KW;
	COORDINATE_KW;
	CONSEQUENCES_KW;
	AGGREGATION_KW;
}


game :
	(gameData FIN)?
	(newType FIN)*
	(init FIN)+
	(definition (FIN)?)*
	(commande (FIN)?)*
	/*(reglesJeu (FIN)?)*
	(iaBasique (FIN)?)*
	  -> ^(GAME_KW gameData? newType* init+ definition* commande* reglesJeu* iaBasique*)*/
	;

/* Information about game */
gameData :
	GAME HAS attributGame (VIRG attributGame)*
	  -> ^(GAME_ATTRIBUT_KW attributGame+)
	;

attributGame :
	GRAVITY_KW AT (FLOAT
		  -> ^(GRAVITY_KW FLOAT)
		| FLOAT FLOAT FLOAT
		  -> ^(GRAVITY_KW FLOAT FLOAT FLOAT) )
	| SCORE AT FLOAT
	  -> ^(SCORE_KW FLOAT)
	;

/* Inheritance, creation of type */
newType :
	TYPE_KW IDENT IS subType (AND subType)*
	  -> ^(TYPE_KW IDENT subType+)
	;
  
subType :
	IDENT
	| typeObjet
	;	  
// ident | typeObjet : if it is an ident, check that it is defined before by the user and that is an inherited Object.

/* Initializations */
init :
	IDENT IS declarationObjet
	  -> ^(INIT_IS_KW IDENT declarationObjet)
	| accesClasse HAS allocationObject (VIRG allocationObject)* // check the types and its attributes
	  -> ^(INIT_HAS_KW allocationObject+)
	;

// A revoir : CAMERA : si rien n'est ajouté on fait quoi ?, MEDIA pareil
declarationObjet :
	typeEntity entityMode? 
	  -> ^(DEC typeEntity entityMode?)   // interaction is neutral by default
	| LIST_KW (OF (operation)? (IDENT) (WITH (operation)? (IDENT))* )?  //operation if the object is duplicable
	  ->^(LIST_KW (operation? IDENT)+)
	| CAMERA (view PERSON -> ^(CAMERA_KW PERSON view) | FREE -> ^(CAMERA_KW FREE))?
	| MEDIA (LOOP ->^(MEDIA_KW LOOP) | ONCE ->^(MEDIA_KW ONCE))? 						 // sound, music or video played in loop or once
	| IN IDENT -> ^(IN_KW IDENT)									  // ident of a list to add an element
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

allocationObject :
	IDENT (AT valAggregation )?       //aggregation
	  -> ^( ALLOCATION_KW IDENT valAggregation) 
	| attribut AT typeAllocation           //life at 5, name at "Gandalf Le Gris"
	  -> ^( ALLOCATION_KW attribut typeAllocation)
	| typeCoordonnees AT coordinates            //size at 20 30 40
	  -> ^( ALLOCATION_KW typeCoordonnees coordinates)
	| attributListeOuObjet AT IDENT             //inventory at listeArmesJoueur
	  -> ^( ALLOCATION_KW attributListeOuObjet IDENT)
	| attributTps AT operation timeUnit         //
	  -> ^( ALLOCATION_KW attributTps operation timeUnit)
	  ;
  
typeAllocation 
	:	(operation | STRING | BOOL);

valAggregation :
	operation (timeUnit)? 
	  -> ^(AGGREGATION_KW operation timeUnit?)
	| IDENT
	  -> ^(AGGREGATION_KW IDENT)
	; 
 
 valAffectation : 
	operation 
	| STRING 
	->^(STRING)
	| BOOL
	->^(BOOL)
	;

/* Definition */	
definition : DEFINITION_KW^ IDENT MEANS! consequences;

consequences :
	consequ (VIRG consequ)*
	  ->^(CONSEQUENCES_KW consequ+)
	;
	
consequ :
  //siAlors
  | action
  //| affectation
  //| activCommande
  | IDENT
  | VICTORY
  | DEFEAT
  ;

action :
/*	accesClasse actionObjet
	|*/ (IDENT | GAME) (ENDS_KW^ |STARTS_KW^)
	| (PAUSE_KW^ | MUTE_KW^ (ON | OFF) | PLAY_KW^ | STOP_KW^ ) IDENT
	| BLOCK_KW^ transformation OF! accesClasse coordinates
	| (EFFACE_KW^ | GENERATE_KW^) (accesLocal | operation (IDENT | accesGlobal) (IN! accesLocal | ON! accesLocal | AT! coordinates)?)
	| WAIT_KW^ operation timeUnit THEN! consequences ENDWAIT!
	| SAVE_KW^
	;

/*actionObjet :
  DIES
  | actionCommandePressee
  | actionCommandeMaintenue ('during' operation timeUnit | 'until' conditions)
  | 'equip' (accesLocal | 'next' | 'previous')   
  ;*/
  
transformation :
	TRANSLATION
	| ROTATION
	| SCALE
	;
	
coordinates :
	operation operation operation
	  -> ^(COORDINATE_KW operation operation operation)
	;

/* Initialization of commands */

commande :
  'command' (IDENT 'is' actionCommande (VIRG actionCommande)* | actionCommande)
  ;

actionCommande :
  ('mouse' souris | 'key' clavier) 'for' (IDENT | actionCommandePressee | actionCommandeMaintenue) // ident : that was defined with means
  ;
 
souris :
  'up' | 'down' | 'left' | 'right' | 'lClick' | 'cClick' | 'rClick' | 'scrollUp' | 'scrollDown'
  ;
 
clavier :
  CHAR | 'up' | 'down' | 'left' | 'right' | 'space' | 'echap' | 'enter'          //CHAR : Z,Q,S,D,...
  ;
 
actionCommandePressee :
  'jump' operation
  | 'pause'
  | 'stop'
  ;
actionCommandeMaintenue :
  'move' ('left' | 'right' | 'forward' | 'backward')
  | 'turn' ('left' | 'right')
  | 'accelerate'
  | 'brake'
  ;

/* Arithmetic expression */

operation :
	operationPlus
	| RANDOM_KW^ BETWEEN! operationPlus AND! operationPlus
	;
 
operationPlus :
	operationMul ((PLUS^ | MINUS^) operationMul)*
	;

operationMul :
	operationPow ((MUL^ | DIV^ | MOD^) operationPow)?
	;
  
operationPow :
	operationBracket (POW^ operationBracket)?
	;
  
operationBracket :
	PG! operation PD!
	| variable
	| FLOAT
	;

// A revoir
variable :
  (((X | Y | Z) OF typeCoordonnees) | IDENT | attribut) OF accesClasse
  | SCORE OF GAME
    -> ^(GAME_SCORE_KW)
  | VALUE OF attributTps OF accesClasse
    -> ^(VALUE_KW attributTps accesClasse)
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

attributListeOuObjet :
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

PD	: ')';
PG	: '(';
FIN	: ';' ; //opérateur de fin de règles
VIRG	: ',';
HAS	: 'has';
AT	: 'at';
IS	: 'is';
AND	: 'and';
OF	: 'of';
WITH	: 'with';
BETWEEN	: 'between';
PLUS	: '+';
MINUS	: '-';
MUL	: '*';
DIV	: '/';
POW	: '^';
MOD	: '%';
X	: 'x';
Y	: 'y';
Z	: 'z';
ALL	: 'all';
NOT	: 'not';
MIN	: 'min';
SEC	: 'sec';
MS	: 'ms';
THEN	: 'then';

GAME		: 'Game';
GRAVITY_KW	: 'gravity';
SCORE		: 'score';
TYPE_KW		: 'type';
PLAYER		: 'player';
LIST_KW		: 'list';
IN		: 'in';
LOOP		: 'loop';
ONCE		: 'once';
RANDOM_KW	: 'random';
DEFINITION_KW	: 'definition';
MEANS		: 'means';
VICTORY		: 'victory';
DEFEAT		: 'defeat';
PAUSE_KW	: 'pause';
MUTE_KW		: 'mute';
ON		: 'on';
OFF		: 'off';
PLAY_KW		: 'play';
STOP_KW		: 'stop';
ENDS_KW		: 'ends';
STARTS_KW	: 'starts';
DIES		: 'dies';
BLOCK_KW	: 'block';
TRANSLATION	: 'translation';
ROTATION	: 'rotation';
SCALE		: 'scale';
EFFACE_KW	: 'efface';
GENERATE_KW	: 'generate';
WAIT_KW		: 'wait';
ENDWAIT		: 'endWait';
SAVE_KW		: 'save';



DUPLICABLE	: 'duplicable';
FIRST		: 'first';
THIRD		: 'third';
ALLY		: 'ally';
ENEMY		: 'enemy';
NEUTRAL		: 'neutral';
POSITION	: 'position';
ORIENTATION	: 'orientation';
SIZE		: 'size';
PERSON		: 'person';
FREE		: 'free';
FRAME		: 'frame' | 'frames';

CAMERA	: 'Camera';
MEDIA	: 'Media';
COUNTER	: 'Counter';
TIME	: 'Time';

OBJECT		: 'Object';
CHARACTER	: 'Character';
VEHICLE		: 'Vehicle';
PLANE		: 'Plane';
SPACECRAFT	: 'SpaceCraft';
OBSTACLE	: 'Obstacle';
WEAPON		: 'Weapon';
SWORD		: 'Sword';
PROJECTILE	: 'Projectile';
ZONE		: 'Zone';
GROUND		: 'Ground';
BONUS		: 'Bonus';
CHECKPOINT	: 'CheckPoint';
BREAKABLE	: 'Breakable';
CONSTRUCTION	: 'Construction';
ROOM		: 'Room';
BALL		: 'Ball';
TELEPORTER	: 'Teleporter';

/* List of attribut */
MASS		: 'mass';
IS_FIX		: 'isFix';
IS_TRAVERSABLE	: 'isTraversable';
FOV		: 'fov';
TYPE		: 'type';
ACTIVE		: 'active';
NAME		: 'name';
DESCRIPTION	: 'description';
LIFE		: 'life';
LIFE_MAX	: 'lifeMax';
LIFE_MIN	: 'lifeMin';
NB_LIVES	: 'nbOfLives';
MAGIC		: 'magic';
MAGIC_MAX	: 'magicMax';
MAGIC_MIN	: 'magicMin';
LEVEL		: 'level';
ATTACK		: 'attack';
DEFENSE		: 'defense';
JUMP_FORCE	: 'jumpForce';
JUMP_AIR_MAX	: 'maxJumpsInTheAir';
MONEY		: 'money';
CLASS		: 'class';
RACE		: 'race';
ACCELERATION	: 'acceleration';
SPEED		: 'speed';
SPEED_MAX	: 'maxSpeed';
SPEED_MIN	: 'minSpeed';
BOOST		: 'boost';
BOOST_MAX	: 'maxBoost';
NB_MUNITIONS	: 'nbMunitions';
NB_MUNITIONS_MAX: 'nbMunitionsMax';
SHOOT_POWER	: 'shootPower';
DAMAGES		: 'damages';
VALUE		: 'value';
UNIT		: 'unit';
OBJECT_NAME	: 'objectname';
ATTRIBUT_NAME	: 'attributName';
VOLUME		: 'volume';
NUMBER		: 'number';
MOVE_WITH_CAMERA: 'moveWithCamera';

BOOST_INTERVAL	: 'boostInterval';
SHOOT_INTERVAL	: 'shootInterval';
RELOAD_TIME	: 'reloadTime';

INVENTORY	: 'inventory';
EQUIPED_OBJECT	: 'equipedObjects';
ENTRANCES	: 'entrances';
EXITS		: 'exits';
DAMAGE_ZONE	: 'damageZone';
COLLECTORS	: 'collectors';
TYPES_COLLECTORS: 'typesCollectors';
GENERATORS	: 'generators';
TYPE_GENERATORS : 'typeGenerators';
BREAKERS	: 'breakers';
TYPES_BREAKERS	: 'typesBreakers';
TELEPORTABLES	: 'teleportables';
TYPES_TELEPORTABLES 
	:	 'typesTeleportables';

DIGIT	: '0'..'9';
LETTER	: 'a'..'z'|'A'..'Z';
STRING	: LETTER+;
BOOL	: ('true' | 'false');
FLOAT	: DIGIT+ ('.' DIGIT+)?;
IDENT	: LETTER( LETTER|DIGIT )*;

