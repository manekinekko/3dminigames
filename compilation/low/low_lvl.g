grammar low_lvl;


/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */




game 	: refreshLoop eventsManager resourcesSets camera entities physicsEngine ;

refreshLoop : SIGNALUPDATECOUNTER KEYLISTENER AD keyboardCommandsAF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE : signalSets)*;
	
mouseCommands : (TYPEOFCLICK : signalSets)*;
	
signalSets : SIGNAL (SIGNAL)*;

eventsManager : SIGNAL (AT SIGNAL)* instructions (|SIGNAL instructions)*;

instructions : resourceApply(applyExpression) | IF conditionnal THEN instructions (& instructions)* (ELSE instructions (& instructions)*)?|conceptInstructions;

conceptsInstructions : gamOver | pause | newGame |saveGame;
	
conditionnal : testExpression(booleanOperator testExpression)*;

booleanOperator : AND | OR;

testExpression : expression comparisonOperator expression;

comparisonOperator : INF | SUP | EGINF | EGSUP | EG | DIFF;
 
//Le premier op�rateur d�finie la nature de la modification sur la ressource (ref (1))
applyExpression : arithmeticOperator (metaExpression | expression);
 
//A des fins de r�utilisation, on peut d�finir des m�ta expressions identifi�es par un nom
metaExpression : nameExp expression;
 
nameExp : ID;
expression : (arithmeticOperator value)+;
arithmeticOperator : PLUS | MOINS | MULT  |DIV | MOD;
 
//Les ressources sont directement utilisables dans les r�gles de calculs, il s�agit bien entendu //
//d�une r�f�rence � leur valeur respective.
//random(int, int) correspond � l'appel d'un g�n�rateur al�atoire born� par (int, int),
//g�n�ration d'un random pr�d�fini via la grammaire haut niveau random(0, int).
value 	: resource | constant | RANDOM PD value VIRG value PF | RANDOM PD ZERO VIRG value PF;
constant : INT | FLOAT;
 
 //Gestion des ressources
//Un signal est �mis � chaque modification de la ressource (= � chaque utilisation de //
//resourceApply(expression)
resourcesSets : (enumResource | resource)+;
 
//Les ressources �num�r�es sont g�r�es dans une table des symboles.
enumResource : name { nameEnumResource (, nameEnumResource)*};
nameEnumResource :  ID;
//On v�rifie l'existence des nameResource dans la table des symboles pour savoir si la //
//ressource �num�r�e est valide.
resource : (# nameEnumResource)? name (SIGNAL (AT SIGNAL)*)? (timer|initValue);
//G�r� par une table des symboles, un name est unique et peut �ventuellement avoir �t� g�n�r� 
//lors de la compilation de la premi�re grammaire pour des attributs pr�d�finis h�rit�s
name : ID;
 
timer : step initTimer;
initValue : INT | FLOAT;
step 	: INT;
 
//Gestion des cam�ras et des entit�s
//Le �name� est le m�me que celui des ressources
camera : name position;
//On s�abstrait de la repr�sentation de la position po
position : vector | ANGLE;
 
entities : map WITH object+;
 
//En faisant abstraction de la repr�sentation machin
map : mapType texture;

object : object = (name object3D parameters | media);

parameters : coeffOfFriction = FLOAT weight = FLOAT speed = vector position = vector  isFixed = BOOLEAN isTraversable = BOOLEAN;

object3D : model texture boundingBox;


media : name soundLevel isMute isPlayed isStopped isPaused;

soundLevel : INT ;

isMute 	: BOOLEAN ;

isPlayed : BOOLEAN;

isStopped : BOOLEAN;

isPaused : BOOLEAN;

model : objfile;

texture : matfile;
 
//Moteur physique
physicsEngine : forces+ collision;

forces : gravity | wind;
//En consid�rant que les volumes englobants sont donn�s par l�utilisateur
collision : collision{ name name signalSets (, name name signalSets)*};

gravity : vector;
wind : vector;
vector 	: PD INT VIRG INT VIRG INT PF;
boundingBox	: PD INT VIRG INT VIRG INT PF;
mapType : ;
initTimer : INT;
gamOver	:	;
pause	:	;
newGame	:	;
saveGame:	;

objfile	:	ID '.obj';
matfile	:	ID '.mat';






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

//Booleans
AND 	: 'and'	 ;
OR 	: 'or'	;
AT 	: '@';


//Arithmetics
PLUS 	:	'+';
MOINS 	:	'-';
MULT    :	'*';
DIV     :	'/';
MOD    	:       '%';
SIGNAL 	:	 ;
RANDOM	:	'random';


ANGLE 	:	 ;
IF : 'if';
THEN 	:	 'then';
ELSE 	: 'else';
WITH 	: 'with';
VIRG	: ',';
PD	: '(';
PF	: ')';
AD	: '{';
AF	: '}';


KEYLISTENER :	'keyListener';
	
MOUSELISTENER 	:	 'mouseListener';



KEYSTROKE  : /* MEGALONG */	;

TYPEOFCLICK 
	: 'leftClick' | 'leftDrop' | 'leftDrag' | 'rightClick' | 'rightDrop'  	;

SIGNALUPDATECOUNTER 
	:	 ;






ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

ZERO	:	'0';
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
BOOLEAN :	 'true'|'false';
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

