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

}

@header{

}
/* *************************** */
/* ***** PARSER RULES ***** */
/* ************************** */




game 	: resourcesSets   entities PTVIRG PTVIRG
		->^(GAME resourcesSets );


/* RESOURCES */

resourcesSets : resource+

		->^(RESOURCES resource+)
		;
 		


resource : ID  initValue PTVIRG
	-> ^(RESOURCE ID initValue);





initValue : INT -> ^(VAL INT) | FLOAT -> ^(VAL FLOAT);




/* ENTITIES */

entities : object+;


object : OBJECT AFF ID parameters PTVIRG ;

parameters : FRICTIONCOEF AFF FLOAT;







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
    


