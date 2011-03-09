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
    import java.util.LinkedList;
}

@lexer::header {
    package grammars;
}

@members {
    private List<String> errors = new LinkedList<String>();
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg);
    }
    public List<String> getErrors() {
        return errors;
    }
     public void emitErrorMessage(String msg) {
        System.err.println("plop");
    }
}


game :
    (gameData FIN)?
    (newType FIN)*
    (init FIN)+
    (definition FIN)*
    (commande FIN)+
    (reglesJeu FIN)+
    (iaBasique FIN)*
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
    | TURNBASED_KW^ AT! ('true'|'false')
    | WORLD_KW^ AT! mapType
    | GRIDSIZE_KW^ AT! FLOAT
    | NAME_KW^  AT! name
    ;

mapType : GENERIC | GRID | RIBBON;

name : IDENT;

/* Inheritance, creation of type */
newType :
    TYPE IDENT IS subType (AND subType)*
      -> ^(TYPE IDENT subType subType*)
    ;
  
subType :
    IDENT
    //| typeObjet
    ;
// ident | typeObjet : if it is an ident, check that it is defined before by the user and that is an inherited Object.

/* Initializations */
init :
    IDENT IS declarationObjet
      -> ^(INIT_IS_KW IDENT declarationObjet)
    | accesClasse HAS allocationObject (VIRG allocationObject)* // check the types and its attributes
      -> ^(INIT_HAS_KW accesClasse allocationObject+)
    | INSERT_KW^ IDENT IN! IDENT (NUM! operation)?  //Cast entier | si pas NUM operation -> fin de liste.
    | REMOVE_KW^ (IDENT|NUM! operation) FROM! IDENT
    ;

// A revoir : CAMERA : si rien n'est ajoute on fait quoi ?, MEDIA pareil
declarationObjet :
    IDENT dupli?
      -> ^(DEC IDENT dupli?)   // interaction is neutral by default
    | LIST_KW (OF (operation)? (IDENT) (',' (operation)? (IDENT))* )?  //operation if the object is duplicable
      ->^(LIST_KW (operation? IDENT)+)
    | CAMERA (view PERSON -> ^(CAMERA_KW PERSON view) | FREE -> ^(CAMERA_KW FREE))?
    | MEDIA (LOOP ->^(MEDIA_KW LOOP) | ONCE ->^(MEDIA_KW ONCE))? 						 // sound, music or video played in loop or once
    | IN IDENT -> ^(IN_KW IDENT)
    | PLAYER SOLO?								  // ident of a list to add an element
    ;

typeEntity :
    IDENT
    ;

dupli :
    DUPLICABLE
    ;
	
view :
    FIRST
    | THIRD
    ;

allocationObject :
    (IDENT | 'value') (AT valAggregation )?       //aggregation
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
    | VICTORY_KW^ OF! IDENT (DBP IDENT)?
    | DEFEAT_KW^ OF! IDENT (DBP IDENT)? // ident est un Player ou une Team
    ;

action :
    accesClasse actionObjet
    | (IDENT | GAME) (ENDS_KW^ | STARTS_KW^ | PAUSE_KW^) (':' IDENT)?  //IDENT est un compteur
    | (PAUSE_KW^ | MUTE_KW^ (ON | OFF) | PLAY_KW^ | STOP_KW^ ) IDENT
    | BLOCK_KW^ transformation OF! accesClasse coordinates
    | (EFFACE_KW^ | GENERATE_KW^) (operation? accesLocal) ((IN!|ON!) accesLocal | AT! coordinates)? // /!\ a voir
    | WAIT_KW^ operation timeUnit THEN! consequences ENDWAIT!
    | SAVE_KW
    | NEXTURN_KW^ IDENT                                           //IDENT = joueur qui devient actif                                          //ajout lexical a faire
    //| RELOAD_KW^ IDENT WITH // ... // action à rajouter (mise en suspend)
    | IDENT GRASPS_KW^ IDENT
    | IDENT EXPELS_KW^ IDENT BY! operation
    | IDENT INGESTS_KW^ IDENT IN! IDENT                        // IDENT1: perso qui ingest| INDENT2 : ce qui est ingéré|IDENT3: là ou l'objet sera ranger
    ;
	

actionObjet :
    DIES_KW
    | actionCommandePressee
    | actionCommandeMaintenue (DURING^ operation timeUnit | UNTIL^ conditions HAPPENS!)?
    | EQUIP^ (accesLocal | NEXT | PREVIOUS)
    ;
  
actionCommandePressee :
    JUMP^ operation
    ;
  
actionCommandeMaintenue :
  MOVE^ (LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN) BY! operation
  | TURN^ (LEFT | RIGHT |WUP|WDOWN|CLOCKWISE |ANTICLOCKWISE)BY! operation
  | ACCELERATE^ BY! operation
  | BRAKE^ BY! operation
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
    COMMAND_KW^ FOR! player_list IS! actionCommande (VIRG! actionCommande)*
    ;

player_list: 
    IDENT (VIRG! IDENT)*
    ;

actionCommande :
    MOUSE souris (commandMode)? FOR definitionId
      -> ^(MOUSE_KW souris (commandMode)? definitionId)
    | KEY clavier (commandMode)? FOR definitionId // ident : that was defined with means
      -> ^(KEY_KW clavier (commandMode)? definitionId)
    ;

commandMode :
    PRESSED_KW |HELD_KW | RELEASED_KW
    ;

definitionId :
    IDENT
    ;

souris :
    WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN  // modif analyseur lexical pour MIDDLE
    ;
 
clavier :
    LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER          //CHAR : Z,Q,S,D,...
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
    RULE_KW^ declencheur THEN! definitionId
    ;
 
declencheur :
    accesClasse (MOVES_KW | DIES_KW | declencheurTK | declencheurKT)
    | (IDENT | GAME) (ENDS_KW^ |STARTS_KW^)          //ident if it is a counter
    | variable BECOMES varOuNB
      -> ^(BECOMES_VAR_KW variable varOuNB)
    | VICTORY_KW^ OF! (PLAYER| IDENT) //ident est le nom d'1 Team ou d'1 Player, Player la classe (global)
    | DEFEAT_KW^ OF! (PLAYER| IDENT)
    ;

varOuNB :
    variable | FLOAT;

declencheurTK :
    (TOUCHES_KW^ | KILLS_KW^ | OWNES_KW^ | NOTOWNES_KW^) ((OTHER)? accesLocal);// ajout dans le lexical dans OWNES,...
	
declencheurKT :
    (KILLED_KW^ | TOUCHED_KW^ | OWNED_KW^ | NOTOWNED_KW^) (BY! ((OTHER)? accesLocal))?;

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
    | COMP! operation (EQUALS^ | INF^ | SUP^ | INFEG^ | SUPED^ | DIFF^) operation           // -> grammaire non LL(*)   a cause des parentheses qu'on retrouve dans operation
    | PG conditions PD
    | IDENT CONTAINS_KW^ IDENT //liste, objet contenu dans la liste
    ;

etat :
    accesClasse IS! (NOT)? (DEAD_KW^ | ALIVE_KW^ | EFFACED_KW^ | GENERATED_KW^ | TOUCHING_KW^ ((OTHER)? accesLocal) | MOVING_KW^ | WAITING_KW^)  // for an object
    | (IDENT | GAME) IS! (NOT)? (FINISHED_KW^ |STARTED_KW^ | PAUSED_KW^ | MUTED_KW^ (ON | OFF) | PLAYED_KW^ | STOPPED_KW^ )  // game,counter,media
    //| 'true'^
    | VICTORY_KW^ OF! IDENT
    | DEFEAT_KW^ OF! IDENT  // ident est un Player ou une Team
  ;
  
affectation :
  ((ASSIGN_KW^ | ADD_KW^ | SUB_KW^) operation) FOR! variable 
  | INVERT_KW^ variable WITH! variable
  ;

/*IA*/
  //Changer en AI
iaBasique :
    IA_KW^ IDENT IS! reglesJeu (VIRG! reglesJeu)*; //verif session

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
    | (DISTANCE_KW^| ANGLE_KW^) BETWEEN! IDENT AND! IDENT //les IDENT sont des entités.
    ;

variable :
    (X^ | Y^ | Z^) OF! typeCoordonnees OF! accesLocal
    | IDENT OF accesLocal                    //size, first, last of list (Ne pas Zapper)
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
  ;

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
FIN	: ';' ; //operateur de fin de regles
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
SEC	: 's';
MS	: 'ms';
THEN	: 'then';
FOR	: 'for';
EQUALS : '=';
INF :  '<';
SUP :  '>';
INFEG : '<=';
SUPED : '>=';
DIFF : '!=';
FROM 	:'from';
DBP     : ':';

GAME		: 'game';
GRAVITY_KW	: 'gravity';
SCORE		: 'score';
TURNBASED_KW    : 'turnbased';
WORLD_KW        : 'world';
GRIDSIZE_KW     : 'gridsize';	
GENERIC         : 'generic';
GRID 	        : 'grid';	
RIBBON          : 'ribbon';
NAME_KW         : 'name';
TYPE		: 'type';
INSERT_KW :	 'insert';
REMOVE_KW :	'remove';
SOLO 	:	'solo';
PLAYER		: 'Player';
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
IA_KW 	:	 'ai';
DURING : 'during';
UNTIL : 'until';
EQUIP : 'equip';
NEXT : 'next';
PREVIOUS : 'previous';
KEYBOARD : 'keyboard';
ACTIVATE_KW : 'activate';
DISABLE_KW:'disable';
COMMANDS:'commands';
CLOCKWISE     :	'clockwise';
ANTICLOCKWISE :	'anticlockwise';
NEXTURN_KW :	'nexturn';
RELOAD_KW :	'reload';
GRASPS_KW:'grasps';
EXPELS_KW:	'expels';
INGESTS_KW:	'ingests';
DUPLICABLE	: 'duplicable';
FIRST		: 'first';
THIRD		: 'third';
POSITION	: 'position';
ORIENTATION	: 'orientation';
SIZE		: 'size';
PERSON		: 'person';
FREE		: 'free';
FRAME		: 'frame' | 'frames';
PRESSED_KW : 'pressed';
HELD_KW : 'held';
RELEASED_KW : 'released';
OWNES_KW :	'ownes';
NOTOWNES_KW :	 'notOwnes';
OWNED_KW:'owned';
NOTOWNED_KW:'notOwned';
HAPPENS :	 'happens';
CONTAINS_KW 	:	 'contains';
DISTANCE_KW :	'distance';
ANGLE_KW : 'angle';

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
CLICK_MIDDLE	: 'mClick';
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

