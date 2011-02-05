grammar hight;

options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
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
    VAR_I_KW;
    VAR_A_KW;
    BECOMES_VAR_KW;
    BECOMES_ID_KW;
    CONDITION_KW;
    ACCESS_KW;
    KEY_KW;
    MOUSE_KW;
}

@header {
    package grammars;
}

@lexer::header {
    package grammars;
}

game :
	(gameData FIN)?
	(newType FIN)*
	(init FIN)+
	(definition (FIN)?)*
	(commande (FIN)?)+
	(reglesJeu (FIN)?)+
	(iaBasique (FIN)?)*
	  -> ^(GAME_KW gameData? newType* init+ definition* commande+ reglesJeu+ iaBasique*)
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
	TYPE IDENT IS subType (AND subType)*
	  -> ^(TYPE IDENT subType subType*)
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
	  -> ^(INIT_HAS_KW accesClasse allocationObject+)
	;

// A revoir : CAMERA : si rien n'est ajout� on fait quoi ?, MEDIA pareil
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
	  -> ^( ALLOCATION_KW IDENT valAggregation?)
	| typeCoordonnees AT coordinates            //size at 20 30 40
	  -> ^( ALLOCATION_KW typeCoordonnees coordinates)
	| attributListeOuObjet AT IDENT             //inventory at listeArmesJoueur
	  -> ^( ALLOCATION_KW attributListeOuObjet IDENT)
	| attributTps AT operation timeUnit         //
	  -> ^( ALLOCATION_KW attributTps operation timeUnit)
	  ;

valAggregation :
	operation (timeUnit)? 
	  -> ^(AGGREGATION_KW operation timeUnit?)
	| IDENT
	  -> ^(AGGREGATION_KW IDENT)
	| 'true'
	| 'false'
	;

/* Definition */	
definition : DEFINITION_KW^ IDENT MEANS! consequences;

consequences :
	consequ (VIRG consequ)*
	  ->^(CONSEQUENCES_KW consequ+)
	;
	
consequ :
  siAlors
  | action
  | affectation
  | activCommande
  | IDENT
  | VICTORY_KW
  | DEFEAT_KW
  ;

action :
	accesClasse actionObjet
	| (IDENT | GAME) (ENDS_KW^ |STARTS_KW^)
	| (PAUSE_KW^ | MUTE_KW^ (ON | OFF) | PLAY_KW^ | STOP_KW^ ) IDENT
	| BLOCK_KW^ transformation OF! accesClasse coordinates
	| (EFFACE_KW^ | GENERATE_KW^) (accesLocal | operation (IDENT | accesGlobal)) ((IN!|ON!) accesLocal | AT! coordinates)?
	| WAIT_KW^ operation timeUnit THEN! consequences ENDWAIT!
	| SAVE_KW
	;

actionObjet :
  DIES_KW
  | actionCommandePressee
  | actionCommandeMaintenue (DURING^ operation timeUnit | UNTIL^ conditions)
  | EQUIP^ (accesLocal | NEXT | PREVIOUS)   
  ;
  
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
	COMMAND_KW^ (IDENT IS!)? actionCommande (VIRG! actionCommande)*
	;

actionCommande :
	MOUSE souris FOR actionCommandeType
	  -> ^(MOUSE_KW souris actionCommandeType)
	| KEY clavier FOR actionCommandeType // ident : that was defined with means
	  -> ^(KEY_KW clavier actionCommandeType)
	;

actionCommandeType :
	IDENT | actionCommandePressee | actionCommandeMaintenue
	;	
 
souris :
  WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN
  ;
 
clavier :
  LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER          //CHAR : Z,Q,S,D,...
  ;
 
actionCommandePressee :
  JUMP operation
  | PAUSE_KW
  | STOP_KW
  ;
  
actionCommandeMaintenue :
  MOVE (LEFT | RIGHT | FORWARD | BACKWARD)
  | TURN (LEFT | RIGHT)
  | ACCELERATE
  | BRAKE
  ;
  
activCommande :
  (ACTIVATE_KW^ | DISABLE_KW^) typeCommand
	;

typeCommand :
    COMMANDS
    | MOUSE (souris (VIRG souris)*)?
      -> ^(MOUSE_KW souris*)
    | KEY clavier (VIRG clavier)*
      -> ^(KEY_KW clavier+)
    | KEYBOARD;

reglesJeu :
  RULE_KW^ (IDENT IS!)?  declencheur THEN! consequences
  ;
 
declencheur :
  accesClasse (MOVES_KW | DIES_KW | declencheurTK | declencheurKT) 
  | (IDENT | GAME) (ENDS_KW^ |STARTS_KW^)          //ident if it is a counter
  | variable BECOMES varOuNB
    -> ^(BECOMES_VAR_KW variable varOuNB)
  | IDENT BECOMES playerOuInteraction
    -> ^(BECOMES_ID_KW IDENT playerOuInteraction)
  | VICTORY_KW
  | DEFEAT_KW
  ;

varOuNB :	variable | FLOAT;

playerOuInteraction
	:	(PLAYER| interaction);

declencheurTK 
	:	(TOUCHES_KW^ | KILLS_KW^) ((OTHER)? accesGlobal | accesLocal);
	
declencheurKT
	:	(KILLED_KW^ | TOUCHED_KW^) (BY! ((OTHER)? accesGlobal | accesLocal))?;

/* Conditions */  
siAlors :
  IF_KW^ conditions THEN! consequences (ELSE! consequences)? ENDIF!
  ;

conditions :
  (NOT)? conditionOu
  -> ^(CONDITION_KW NOT? conditionOu)
  ;

conditionOu :
  conditionEt (OR^ conditionEt)*
  ;

conditionEt :
  cond (AND^ cond)*
  ;

cond :
  etat
  | COMP! operation (EQUALS^ | INF^ | SUP^ | INFEG^ | SUPED^ | DIFF^) operation           // -> grammaire non LL(*)   � cause des parenth�ses qu'on retrouve dans operation
  | PG conditions PD 
  ;

etat :
  accesClasse IS! (NOT)? (DEAD_KW^ | ALIVE_KW^ | EFFACED_KW^ | GENERATED_KW^ | TOUCHING_KW^ ((OTHER)? accesGlobal | accesLocal) | MOVING_KW^ | WAITING_KW^)  // for an object
  | (IDENT | GAME) IS! (NOT)? (FINISHED_KW^ |STARTED_KW^ | PAUSED_KW^ | MUTED_KW^ (ON | OFF) | PLAYED_KW^ | STOPPED_KW^ )  // game,counter,media
  //| 'true'^                                                   
  | VICTORY_KW
  | DEFEAT_KW
  ;
  
affectation :
  ((ASSIGN_KW^ | ADD_KW^ | SUB_KW^) operation) FOR! variable 
  | INVERT_KW^ variable WITH! variable
  ;
  
iaBasique : IA_KW^ accesClasse IS! actionObjet (VIRG! actionObjet)*;

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

variable :
  (X^ | Y^ | Z^) OF! typeCoordonnees OF! accesLocal
  | IDENT OF accesLocal
    -> ^(VAR_I_KW IDENT accesLocal)
  | SCORE OF GAME
    -> GAME_SCORE_KW
  | VALUE OF attributTps OF accesLocal
    -> ^(VALUE_KW attributTps accesLocal)
  ;

accesClasse : 
  ALL
    -> ^(ACCESS_KW ALL)
  | accesLocal
  | accesGlobal
  ;

accesGlobal :
  typeObjet
    -> ^(ACCESS_KW typeObjet)
  | interaction
    -> ^(ACCESS_KW interaction)
  | PG NOT notAccess PD
    -> ^(ACCESS_KW NOT notAccess)
  ;

notAccess :
typeObjet | interaction | PLAYER;

accesLocal :
  IDENT
    -> ^(ACCESS_KW IDENT)
  | NUM operation IN IDENT
    -> ^(ACCESS_KW IDENT operation)
  | PLAYER
    -> ^(ACCESS_KW PLAYER)
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


COMMENT     : '//'(~'\n')* {skip();}
   ;
PD	: ')';
PG	: '(';
FIN	: ';' ; //op�rateur de fin de r�gles
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
FOR	: 'for';
EQUALS : '=';
INF :  '<';
SUP :  '>';
INFEG : '<=';
SUPED : '>=';
DIFF : '!=';

GAME		: 'Game';
GRAVITY_KW	: 'gravity';
SCORE		: 'score';
TYPE		: 'type';
PLAYER		: 'player';
LIST_KW		: 'list';
IN		: 'in';
LOOP		: 'loop';
ONCE		: 'once';
RANDOM_KW	: 'random';
DEFINITION_KW	: 'definition';
MEANS		: 'means';
PAUSE_KW	: 'pause';
MUTE_KW		: 'mute';
ON		: 'on';
OFF		: 'off';
PLAY_KW		: 'play';
STOP_KW		: 'stop';
ENDS_KW		: 'ends';
STARTS_KW	: 'starts';
BLOCK_KW	: 'block';
TRANSLATION	: 'translation';
ROTATION	: 'rotation';
SCALE		: 'scale';
EFFACE_KW	: 'efface';
GENERATE_KW	: 'generate';
WAIT_KW		: 'wait';
ENDWAIT		: 'endWait';
SAVE_KW		: 'save';
RULE_KW		: 'rule';
MOVES_KW : 'moves'; 
DIES_KW : 'dies';
TOUCHES_KW : 'touches';
KILLS_KW : 'kills';
KILLED_KW : 'killed';
TOUCHED_KW : 'touched';
BY : 'by';
OTHER : 'other';
BECOMES : 'becomes';
VICTORY_KW : 'victory';
DEFEAT_KW : 'defeat';
IF_KW : 'if';
ELSE : 'else';
ENDIF : 'endIf';
OR : 'or';
COMP : 'comp'; 
DEAD_KW : 'dead';
ALIVE_KW : 'alive';
EFFACED_KW :'effaced';
GENERATED_KW : 'generated';
TOUCHING_KW : 'touching';
MOVING_KW : 'moving';
WAITING_KW : 'waiting';
FINISHED_KW : 'finished';
STARTED_KW : 'started'; 
PAUSED_KW : 'paused';  
MUTED_KW : 'muted';
PLAYED_KW : 'played';  
STOPPED_KW : 'stopped';
ASSIGN_KW : 'assign';
ADD_KW : 'add';
SUB_KW : 'sub';
INVERT_KW : 'invert';
NUM 		: 'num';
IA_KW 	:	 'ia';
DURING : 'during';
UNTIL : 'until';
EQUIP : 'equip';
NEXT : 'next';
PREVIOUS : 'previous';
KEYBOARD : 'keyboard';
ACTIVATE_KW : 'activate';
DISABLE_KW:'disable';
COMMANDS:'commands';

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

/* Control */
WUP	: 'up';
WDOWN	: 'down';
LEFT	: 'left';
RIGHT	: 'right';
SPACE	: 'space';
ESCAPE	: 'escape';
ENTER	: 'enter';
MOUSE	: 'mouse';
KEY	: 'key';
CLICK_LEFT	: 'lClick';
CLICK_CENTER	: 'cClick';
CLICK_RIGHT	: 'rClick';
SCROLL_UP	: 'scrollUp';
SCROLL_DOWN	: 'scrollDown';

COMMAND_KW	: 'command';
JUMP : 'jump';
MOVE : 'move';
FORWARD : 'forward';
BACKWARD : 'backward';
TURN : 'turn';
ACCELERATE : 'accelerate';
BRAKE : 'brake';


CAMERA	: 'Camera';
MEDIA	: 'Media';
COUNTER	: 'Counter';
TIME	: 'Time';

VALUE		: 'value';

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
	

LETTER	: 'a'..'z'|'A'..'Z';
FLOAT	: ('0'..'9')+ ('.' ('0'..'9')+)?;
IDENT	: LETTER( LETTER|'0'..'9' )*;
WS  :   ( ' '  
           | '\t'  
           | '\r'  
           | '\n'  
           | '\u000C'
           )+ {$channel=HIDDEN;}  
        ;

