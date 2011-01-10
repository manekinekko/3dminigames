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
   OBJ = 'OBJ';	
   OBJS = 'OBJS';
}

@header{

}
/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */




game 	: resourcesSets   entities PTVIRG PTVIRG
		->^(GAME resourcesSets entities);


/* RESOURCES */

resourcesSets : resource+

		->^(RESOURCES resource+)
		;
 		


resource : ID  initValue PTVIRG
	-> ^(RESOURCE ID initValue);





initValue : INT | FLOAT ;




/* ENTITIES */

entities : object+
		->^(OBJS object+)
	;


object : OBJECT AFF ID parameters PTVIRG 
		->^(OBJ ID parameters)
	;

parameters : FRICTIONCOEF AFF FLOAT
		->^(PARAMS FRICTIONCOEF  FLOAT)	
	;







/* *********************** */
/* ***** LEXER RULES ***** */
/* *********************** */

WS              :  (' '|'\n'|'\t'|'\r')
                   {skip();}
                ;


PTVIRG : ';' ;
AFF	: '=';



OBJECT : 'object' ;



FRICTIONCOEF  :	'frictioncoef' ;

WITH : 'with';

ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+ 
    |   ('0'..'9')+ 
    ;
    


