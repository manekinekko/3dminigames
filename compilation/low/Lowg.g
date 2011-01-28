grammar Lowg;



options {
    output=AST;
    ASTLabelType=CommonTree;
}
tokens {
   IMAGINERY_TOKEN;
   RESOURCE = 'RESOURCE';
   RESOURCES = 'RESOURCES';
   VAL = 'VAL';
   GAME = 'GAME';
   PARAM = 'PARAM';
   PARAMLIST = 'PARAMLIST';   
	
   OBJ = 'OBJ';	
   OBJS = 'OBJS';
}

@header{
	
}

/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */



game 	: entities camera refreshLoop eventManager resourcesSets PTVIRG PTVIRG
		->^(GAME entities camera refreshLoop eventManager resourcesSets);


/* ENTITIES */

entities : object+
		->^(OBJS object+)
	;


object : OBJECT ID AFF  paramlist PTVIRG 
		->^(OBJ ID paramlist)
	;

paramlist : param (VIRG param)* 
		->^(PARAMLIST param+)
	;
param :	ID AFF initValue
		->^(PARAM ID initValue)
	;




/* CAMERA */

camera : CAMERA ID AD position AF;

position : POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG;

triplet : initNumValue initNumValue initNumValue;
 


/* REFRESH LOOP */ 

refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE DP signalSets)(VIRG KEYSTROKE DP signalSets)*;
	

mouseCommands : (typeofclick DP signalSets)*;

signalSets : signal+;

signal : ID;

typeofclick : LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP 	;


/* EVENT MANAGER */


eventManager : signal (VIRG signal)* ARROW instructions  ( signal(VIRG signal)* ARROW instructions  )* ;
	
instructions : resourcePath APPLY PG applyExpression PD PTVIRG| conceptInstruction PTVIRG;

resourcePath : (ID | ID PT ID);

applyExpression : arithmeticOperator initNumValue;

arithmeticOperator : PLUS | MOINS | MULT  |DIV | MOD;

conceptInstruction : GAMEOVER | PAUSE | NEWGAME | SAVEGAME;
	
	/* 	if conditonnal then instructions (& instructions)
		* (else instructions (& instructions)*)? | conceptsInstructions 
	*/
/*
	
	conditionnal ::= testExpression (booleanOperator testExpression)*

	booleanOperator ::= and | or

	testExpression ::= expression comparisonOperator expression

	comparisonOperator ::= < | > | <= | >= | == | !=


*/









/* RESOURCES */

resourcesSets : (resource)*

		->^(RESOURCES resource*)
		;
 		


resource : ID  initValue PTVIRG
	-> ^(RESOURCE ID initValue);





initNumValue : INT | FLOAT ;

initValue : initNumValue | STRING ;





/* *********************** */
/* ***** LEXER RULES ***** */
/* *********************** */

WS              :  (' '|'\n'|'\t'|'\r')
                   {skip();}
                ;


PTVIRG : ';' ;
VIRG : ',' ;
PT	: '.';
AFF	: '=';
AD	: '{';
AF	: '}';
DP	: ':';
ARROW	: '->';
PIPE	: '|' ;
PG	: '(' ;
PD	: ')' ;


PLUS 	:	'+';
MOINS 	:	'-';
MULT    :	'*';
DIV     :	'/';
MOD    	:       '%';

OBJECT : 'object' ;
KEYLISTENER :	'keylistener';
MOUSELISTENER : 'mouselistener';

CAMERA : 'camera' ;
POSITION : 'position' ;
ANGLE : 'angle' ;



KEYSTROKE :  ('A'..'Z') | 'SPACE' | 'LEFT' | 'RIGHT' | 'UP' | 'DOWN';

LEFTCLICK 	: 'leftclick';
LEFTDROP	: 'leftdrop';
LEFTDRAG	: 'leftdrag';
RIGHTCLICK	: 'rightclick';
RIGHTDROP	: 'rightdrop';

APPLY	: 'apply';


GAMEOVER 	: 'gameover';
PAUSE  		: 'pause';
NEWGAME 	: 'newgame';	
SAVEGAME 	: 'savegame';

WITH : 'with';




INT :	'0'..'9'+
    ;

STRING : '"' ('a'..'z'|'A'..'Z'|'0'..'9')* '"' 
	| '\'' ('a'..'z'|'A'..'Z'|'0'..'9')* '\'' 
	;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+ 
    |   ('0'..'9')+ 
    ;
    
ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

