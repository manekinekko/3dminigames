tree grammar LowgTree;

options {
    tokenVocab = Lowg;
    ASTLabelType = CommonTree;
}

game 	returns[Code c] @init{ c = new CodeResources();}: /*(refreshLoop eventsManager)* */^(GAME rs = resourcesSets { c.append(rs); } EOF);
	   /*(camera entities physicsEngine)* */ 

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
resourcesSets returns [Code c] @init{ c =new CodeResources();}: /*(enumResource | */^(RESOURCES (r = resource{ c.append(r);})+);
 		
/*
enumResource : name AD nameEnumResource (VIRG nameEnumResource)* AF;

nameEnumResource :  ID;

*/

/* RESOURCES */

resource returns [InstJS ijs]
	@init{ijs = null; }
		:^(RESOURCE 
			n = ID 
			i = initValue
		{
			ijs = new DecafJS(n.getText() , i);	   

		}

	);




name : ID;
 /*
timer : step initTimer;
*/
initValue returns[String s]
	@init{s = null;}		: n = INT {
		s = new String(n.getText());
	  }
	| 

           f = FLOAT
	{
		s = new String(f.getText());


	}


	;
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
*/


