grammar lowg;


/*
options {
    output=AST;
    ASTLabelType=CommonTree;
}*/


@header{

}
/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */




game 	: refreshLoop eventsManager resourcesSets camera entities physicsEngine ;



refreshLoop : /*SIGNALUPDATECOUNTER*/ KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE DP signalSets)*;
	

mouseCommands : (TYPEOFCLICK DP signalSets)*;

signalSets : SIGNAL (SIGNAL)*;


eventsManager : SIGNAL (AT SIGNAL)* instructions ( VIRG SIGNAL instructions)*;

instructions : RESOURCEAPPLY (applyExpression) | IF conditionnal THEN instructions (SMPLAND instructions)* (ELSE instructions (SMPLAND instructions)*)? | conceptInstructions;


conceptInstructions : GAMEOVER | PAUSE | NEWGAME | SAVEGAME;
	
conditionnal : testExpression(booleanOperator testExpression)*;

booleanOperator : AND | OR;

testExpression : expression comparisonOperator expression;

comparisonOperator : INF | SUP | EGINF | EGSUP | EG | DIFF;
 

applyExpression : arithmeticOperator (metaExpression | expression);
 

metaExpression : nameExp expression;
 
nameExp : ID;

expression : (arithmeticOperator value)+;

arithmeticOperator : PLUS | MOINS | MULT  |DIV | MOD;
 

value 	: resource | constant | RANDOM PD value VIRG value PF | RANDOM PD '0' VIRG value PF;
constant : INT | FLOAT;
 

resourcesSets : (enumResource | resource)+;
 

enumResource : name AD nameEnumResource (VIRG nameEnumResource)* AF;

nameEnumResource :  ID;

resource : ( nameEnumResource)? name (SIGNAL (AT SIGNAL)*)? (timer|initValue);

name : ID;
 
timer : step initTimer;

initValue : INT | FLOAT;

step 	: INT;
 

camera : name position;

position : vector | angle;
 
 
 
 /* **** ENTITIES **** */
 
entities : map WITH object+;
 
map : mapType texture;

object : OBJECT AFF (name object3D parameters | media);

parameters : COEFFOFFRICTION AFF FLOAT WEIGHT AFF FLOAT SPEED AFF vector POSITION  AFF vector  ISFIXED AFF boolean ISTRAVERSABLE AFF BOOLEAN;

object3D : model texture vector;//boundingbox


media : name soundLevel isMute isPlayed isStopped isPaused;

soundLevel : INT ;

isMute 	: boolean ;

isPlayed : boolean;

isStopped : boolean;

isPaused : boolean;

model : objfile;

texture : matfile;
 
//Moteur physique
physicsEngine : forces+ collision;

forces : GRAVITY DP vector| WIND DP vector;

collision : COLLISION AD  name name signalSets (VIRG name name signalSets)* AF;

//gravity : vector;
//wind : vector;
vector 	: PD INT VIRG INT VIRG INT PF;
angle	: INT;
//boundingBox: PD INT VIRG INT VIRG INT PF;
mapType : ;
initTimer : INT;


objfile	:	ID '.obj';
matfile	:	ID '.mat';
boolean	:	TRUE|FALSE;





/* *********************** */
/* ***** LEXER RULES ***** */
/* *********************** */




/* OPERATORS */

INF	:	'<' ;
SUP	:	'>';
EGINF	:	 '<=' ;
EGSUP	:	 '>=';
EG 	:	 '==';
DIFF	:	 '!=';
AFF	:	'=';

//Booleans
AND 	: '&&'	 ;
SMPLAND	: '&';
OR 	: '||'	;
AT 	: '@';


//Arithmetics
PLUS 	:	'+';
MOINS 	:	'-';
MULT    :	'*';
DIV     :	'/';
MOD    	:       '%';
SIGNAL 	:	 ;
RANDOM	:	'random';

RESOURCEAPPLY : 'resourceapply';	
IF : 'if';
THEN 	:	 'then';
ELSE 	: 'else';
WITH 	: 'with';
VIRG	: ',';
PD	: '(';
PF	: ')';
AD	: '{';
AF	: '}';
DP 	: ':';


KEYLISTENER :	'keyListener';
	
MOUSELISTENER 	:	 'mouseListener';



KEYSTROKE  : /* MEGALONG */' ';

TYPEOFCLICK 
	: 'leftClick' | 'leftDrop' | 'leftDrag' | 'rightClick' | 'rightDrop'  	;

//SIGNALUPDATECOUNTER :'' ;


OBJECT : 'object' ;
COLLISION :	'collision';	

/* **** Concept instructions */
GAMEOVER :	 'gameover'	;
PAUSE  	:	'pause';
NEWGAME :	'newgame';	
SAVEGAME 	: 'savegame';

GRAVITY  : 'gravity';
WIND 	:	'wind'; 		

/* **** ATTRIBUTS ****  */
COEFFOFFRICTION  :	'coeffOfFriction' ;
WEIGHT	:	'weight';	
SPEED	:	'speed';
POSITION	:	'position';
ISFIXED	:	'isfixed';
ISTRAVERSABLE:	'istraversable';


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

TRUE	:	'true';
FALSE	:	'false';

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    

/*
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '' {$channel=HIDDEN;}
    ;
*/
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;


