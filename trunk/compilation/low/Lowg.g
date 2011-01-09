grammar Lowg;



options {
    output=AST;
    ASTLabelType=CommonTree;
}
tokens {
   IMAGINERY_TOKEN;
   RESOURCE = 'RESOURCE';
   RESOURCES = 'RESOURCES';
   GAME = 'GAME';	

}

@header{

}
/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */




game 	: /*(refreshLoop eventsManager)* */resourcesSets /*(camera entities physicsEngine)* */ PTVIRG EOF
		->^(GAME resourcesSets EOF);
/*

refreshLoop : SIGNALUPDATECOUNTER KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE DP signalSets)*;
	

mouseCommands : (TYPEOFCLICK DP signalSets)*;

signalSets : SIGNAL (SIGNAL)*;


eventsManager : SIGNAL (AT SIGNAL)* instructions ( VIRG SIGNAL instructions)*;

instructions : RESOURCEAPPLY (applyExpression) | IF conditional THEN instructions (SMPLAND instructions)* (ELSE instructions (SMPLAND instructions)*)? |
 conceptInstructions;


conceptInstructions : GAMEOVER | PAUSE | NEWGAME | SAVEGAME;
	
conditional : testExpression(booleanOperator testExpression)*;

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
 
*/
resourcesSets : /*(enumResource | */resource+

		->^(RESOURCES resource+)
		;
 		
/*
enumResource : name AD nameEnumResource (VIRG nameEnumResource)* AF;

nameEnumResource :  ID;

*/

/* RESOURCES */

resource : /*( nameEnumResource)? */ID  /*(SIGNAL (AT SIGNAL)*)? (/*timer|*/initValue//)
	-> ^(RESOURCE ID initValue);




//name : ID;
 /*
timer : step initTimer;
*/
initValue : INT | FLOAT;
/*
step 	: INT;
 /*

camera : name position;

position : vector | angle;
 
 
 
 /* **** ENTITIES **** */
 /*
entities : map WITH object+;
 
map : mapType texture;

object : OBJECT AFF (name object3D parameters | media);

parameters : COEFFOFFRICTION AFF FLOAT WEIGHT AFF FLOAT SPEED AFF vector POSITION  AFF vector  
ISFIXED AFF /*boolean ISTRAVERSABLE AFF /*boolean;
/*
object3D : model texture vector;//boundingbox


media : name soundLevel /*isMute isPlayed isStopped isPaused;*/
/*
soundLevel : INT ;
/*
isMute 	: boolean ;

isPlayed : boolean;

isStopped : boolean;

isPaused : boolean;
*//*
model : objfile;

texture : matfile;
 
//Physics engine
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
bool	:	'true'|'false';





/* *********************** */
/* ***** LEXER RULES ***** */
/* *********************** */

WS              :  (' '|'\n'|'\t'|'\r')
                   {skip();}
                ;

/* OPERATORS */
/*
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
*/PTVIRG : ';' ;/*
PD	: '(';
PF	: ')';
AD	: '{';
AF	: '}';
DP 	: ':';


KEYLISTENER :	'keylistener';
	
MOUSELISTENER 	:	 'mouselistener';



//KEYSTROKE  : /* MEGALONG ' ';*/
/*
TYPEOFCLICK 
	: 'leftclick' | 'leftdrop' | 'leftdrag' | 'rightclick' | 'rightdrop'  	;

//SIGNALUPDATECOUNTER :'' ;


OBJECT : 'object' ;
COLLISION :	'collision';	

/* **** Concept instructions 
GAMEOVER :	 'gameover'	;
PAUSE  	:	'pause';
NEWGAME :	'newgame';	
SAVEGAME 	: 'savegame';

GRAVITY  : 'gravity';
WIND 	:	'wind'; 		

/* **** ATTRIBUTS ****  
COEFFOFFRICTION  :	'coeffOfFriction' ;
WEIGHT	:	'weight';	
SPEED	:	'speed';
POSITION	:	'position';
ISFIXED	:	'isfixed';
ISTRAVERSABLE:	'istraversable';

*/
ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

INT :	'0'..'9'+
    ;
/*
TRUE	:	'true';
FALSE	:	'false';
*/
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* //EXPONENT?
    |   '.' ('0'..'9')+ //EXPONENT?
    |   ('0'..'9')+ //EXPONENT
    ;
    

/*
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '' {$channel=HIDDEN;}
    ;
*/

//EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;


