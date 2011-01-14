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
   PARAMS = 'PARAMS';
   PARAMLIST = 'PARAMLIST';   
	
   OBJ = 'OBJ';	
   OBJS = 'OBJS';
}

@header{

}
/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */




game 	: refreshLoop resourcesSets entities PTVIRG PTVIRG
		->^(GAME resourcesSets entities);

/* REFRESH LOOP */ 

refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE DP signalSets)*;
	

mouseCommands : (typeofclick DP signalSets)*;

signalSets : signal+;

signal : ID;

typeofclick : LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP 	;

/* RESOURCES */

resourcesSets : resource+

		->^(RESOURCES resource+)
		;
 		


resource : ID  initValue PTVIRG
	-> ^(RESOURCE ID initValue);





initNumValue : INT | FLOAT ;

initValue : initNumValue | STRING ;


/* ENTITIES */

entities : object+
		->^(OBJS object+)
	;


object : OBJECT ID AFF  parameters PTVIRG 
		->^(OBJ ID parameters)
	;

parameters : POSX AFF initNumValue VIRG POSY AFF initNumValue VIRG POSZ AFF initNumValue paramlist
		->^(PARAMS POSX initNumValue POSY initNumValue POSZ initNumValue paramlist)	
	;


paramlist : (VIRG ID AFF initValue)* 
		->^(PARAMLIST (ID initValue)*)
	;




/* *********************** */
/* ***** LEXER RULES ***** */
/* *********************** */

WS              :  (' '|'\n'|'\t'|'\r')
                   {skip();}
                ;


PTVIRG : ';' ;
VIRG : ',' ;
AFF	: '=';
AD	: '{';
AF	: '}';
DP	: ':';



OBJECT : 'object' ;
KEYLISTENER :	'keylistener';
MOUSELISTENER : 'mouselistener';



KEYSTROKE : '\'' ('a'..'z'| 'A'..'Z') '\'';

LEFTCLICK 	:'leftclick';
LEFTDROP	:'leftdrop';
LEFTDRAG	:'leftdrag';
RIGHTCLICK	:'rightclick';
RIGHTDROP	:'rightdrop';


POSX  :	'posx' ;
POSY  :	'posy' ;
POSZ  :	'posz' ;

WITH : 'with';

ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

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
    


