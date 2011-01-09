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
}


game :
	(gameData FIN)?
	(newType FIN)*
	(init FIN)+
	/*(definition (FIN)?)*
	(commande (FIN)?)*
	(reglesJeu (FIN)?)*
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
	| accesClasse HAS affectationObjet (VIRG affectationObjet)* // check the types and its attributes
	  -> ^(INIT_HAS_KW affectationObjet)
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

affectationObjet :
  IDENT (AT valAggregation )?       //aggregation
  -> ^( ALLOCATION_KW IDENT valAggregation) 
  | attribut AT typeAffectation          //life at 5, name at "Gandalf Le Gris"
  -> ^( ALLOCATION_KW attribut valAffectation)
  | typeCoordonnees AT coordonnees            //size at 20 30 40
  -> ^( ALLOCATION_KW typeCoordonnees coordonnees)
  | attributListeOuObjet AT IDENT             //inventory at listeArmesJoueur
  -> ^( ALLOCATION_KW attributListeOuObjet IDENT)
  | attributTps AT operation timeUnit         //
  -> ^( ALLOCATION_KW attributTps operation timeUnit);
  ;

valAggregation :
	operation (timeUnit)? 
	  ->^(operation timeUnit?)
	| IDENT
	; 
 
 valAffectation : 
	operation 
	| STRING 
	->^(STRING)
	| BOOL
	->^(BOOL)
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


DIGIT	: '0'..'9';
LETTER	: 'a'..'z'|'A'..'Z';
STRING	: LETTER+;
BOOL	: ('true' | 'false');
FLOAT	: DIGIT+ ('.' DIGIT+)?;
IDENT	: LETTER( LETTER|DIGIT )*;

