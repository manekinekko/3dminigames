grammar grammaireHautNiveau;

// pour cibler du code javascript, rajouter un '/' juste avant '/*' pour activer
//*
options {
    language=JavaScript;
}
//*/

// variables and methods to be included in the java file generated
@members {
}
 
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/


game : 
	(typeCam ENDLINE_KW)? 
	(heritage ENDLINE_KW)* 
	(init ENDLINE_KW)+ 
	(commande ENDLINE_KW)* 
	(reglesJeu ENDLINE_KW)*;

//////////////////////////// ( Type de jeu )  /////////////////////////////
typeCam : 
	'camera' 'is' (('first' | 'third') 'person' | 'global')  // on est pas obligés de le mettre
	// | ...)    
	;
	
//////////////////////////// ( Héritages )  /////////////////////////////

// équivaut à la déclaration d'un type qui n'est pas générique (obligation de l'h'ériter)
heritage : 
	'type' ident 'is' typeObjet
	;        
	
// pour éviter que le "est" soit confondu avec celui des déclarations, il vaut mieux mettre un mot comme "type"
// et sinon pourquoi pas un héritage multiple juste pour la 1ere grammaire pour générer les attributs à la demande
//exemple : type mineDeFer est obstacle et bonus
//          type sonic est personnage et véhicule (pour qu'il ait de la vie et le même contrôle qu'un véhicule



//////////////////////////// ( Initialisations )  /////////////////////////////
init : 
	declarationObjet 
	| affectationObjet 
	| affectationCoord 
	| affectationAggregation
	//| affectationTemps;         //affectationTemps -> grammaire non LL(*)
	; 
	
// s'il n'est pas joueur, allié ou ennemi, il est neutre
declarationObjet : 
	variable 'is' ('list' 'of' operation)? typeObjet ('player' | 'ally' | 'enemy')? 
	;       
//j'ai mis 'liste' mais il va falloir en plus trouver un format d'appel d'éléments dans la liste et le rajouter dans cette grammaire
// perso1 est personnage
// fusil est arme
// perso1 possède fusil
// x de position de perso

// à compléter
typeObjet : 
	ident                                	// un type hérité (de objet) défini au début du code client
	| 'counter'                         	// un compteur, n'hérite pas de objet
	| 'object'                              // concept de base -> position(x,y,z), orientation(x,y,z), taille(x,y,z)  //pour la rotation, elle s'effectue autour de l'axe choisi
	| 'character'                       	// -> vie, vieMax, magie, magieMax , level, experience, attaque, défense
	| 'vehicle'                         	// -> accélération, vitesseMax, 
	| 'obstacle'                         	// génèrera une entité fixe servant aux collisions
	| 'weapen' ( 	
		'firearm'           	// -> nbMunitions, nbMaxMunitions intervalleTirs, tpsRecharge
		| 'knife'		// -> dégâts, level(pourquoi pas)
		)
	| 'projectile'                       	// -> vitesse, dégâts, level(pourquoi pas)
	| 'zone'                             	// génèrera une entité invisible et traversable 
	| 'ground'                          	// -> type //idée pour préciser le type de sol : eau (génèrera une entité traversable), neige/glace (min de frottement) ...
	| 'bonus'                              	// un objet qui disparait lorsqu'il est touché par un objet spécifique-> valeur(entier), nomObjet(type),listeObjets,
											// listeAttributs (le ou les objets/types de touché(s) par le bonus et le ou les attributs touchés )  
//  | ...
;

affectationObjet : 
	ident 'has' attribut 'at' operation (SEPERATOR_KW attribut 'at' operation )*
	;             
//le client n'est pas obligé de déclarer tous les attribut dont il a besoin
// s'ils sont génériques comme vie, vieMax ... ils sont générés lorsqu'ils sont appelés pour la première fois
// ça veut veut dire que si il la déclare ici, il veut l'initialiser
// de plus s'il déclare un nouvel attribut, il est obligé de l'initialiser (du moins c'est très recommandé)
// donc il est nécessaire d'avoir le "'à' operation" (pas de '?')


// à compléter
//là clairement, on reprend tous les attributs qu'on a défini pour chaque objet

affectationCoord : 
	ident 'has' transformation 'at' coordonnees (SEPERATOR_KW transformation 'at' coordonnees)*
	;

// a quoi ca sert cette regle ?
attribut : 
	ident                 // dans le cas d'une déclaration d'un nouvel attribut
	| variable            // exemple : ""
	| 'life'               // attributs de "personnage" :
	| 'lifeMax'
	| 'lifeMin'        
	| 'magic'
	| 'magicMax'
	| 'magicMin'
	| 'level'
	| 'attack'
	| 'defense'
	| 'acceleration'      // attributs de "véhicule" :
	| 'speed'
	| 'speedMax'
	| 'speedMin'
	| 'nbMunitions'       // attributs de "arme" :
	| 'nbMunitionsMax'
	| 'nbMunitionsMin' 
	| 'reloadTime'
	| 'damage'
	| 'type'              // attributs de "sol" :
	| 'value'            // attributs de "bonus" :
	| 'objectname'
	| 'attributName'
	//  | ...
	;

// A quoi ca sert ?
affectationAggregation : 
	ident 'has'
	; 

/*
affectationTemps : ident 'a' attributTps 'à' temps  (SEPERATOR_KW attributTps 'à' temps )*;

attributTps : 
	ident 
	| 'intervalleTirs'    // attributs de "arme" :
	| 'tpsRecharge'
//  | ...
;
*/

//////////////////////////// ( Initialisations des commandes )  /////////////////////////////
commande : 
	declarationCommande | assignationTouche 
	;
	
declarationCommande : 
	ident 'means' consequences 'done'
	;

//méthodes des objets
assignationTouche : 
	'commande' STRING 'of' actionCommande
	;

actionCommande : 
	ident 
	| 'left' 
	| 'right' 
	| 'move forward' 
	| 'move backword' 
	| 'accelerate' 
	| 'slow down' 
	| 'pause'
	| 'stop'
	| 'nop'
	//  | ...)
	;
// ici, pour chaque commande, il faut prévoir le fait d'agir sur le joueur ou les alliés ou les ennemis (pourquoi pas) ou sur une liste
// d'objets ou un objet d'une liste ou un objet en particulier


//////////////////////////// ( Règles de jeu + conditions victoire / défaite à l'intérieur )  /////////////////////////////
reglesJeu : 
	'rule' STRING 'is' corpsRegleJeu (SEPERATOR_KW corpsRegleJeu)+
	;
	
corpsRegleJeu :	
	conditions 'then' consequences
	;

conditions : 
	conditionEt ('or' conditionEt)*  //ajouter le moyen de mettre des parenthèses pour les priorités
	;

conditionEt : 
	cond ('and' cond)* 
	;
	
cond 	: etat 
	| operation comparaison operation 
	| declencheur 
	//| '(' conditions ')' //si parenthèses alors grammaire non LL(*) à cause de "operation comparaison operation" -> "comparaison operation operation "
	// | ...
	;
	
etat : 
	ident 'is' choixEtat
	;

choixEtat : 
	('dead' | 'alife' | 'destroyed' | 'generated')  	// pour un perso / pour tous les objets
	| (ident | 'game') 'is' ('finished' |'started')       // jeu ou compteur
	| 'true'                                                // pour 'faux' je crois pas que c'est nécessaire
	| 'victory' 
	| 'shutout' 
	//  | ...
	;

declencheur : 
	ident ( 
		('dies' | 'hits' ident | 'generated' | ('destroyed' | 'touched') ('by' ident)? ) 
		| (ident | 'game') ('finished' |'started')
	)
	// | ...     //ident si c'est un compteur
	;
	
siAlors : 
	'if' conditions 'then' consequences ('else' consequences)? 'end'
	;
	
consequences : 
	consequ (ENDLINE_KW consequ)* 
	;
	
consequ : 
	siAlors 
	| action 
	| affectation 
	| 'victory' 
	| 'shutout'
	;// | ... 

action : 
	'block' transformation 'of' ident coordonnees 
	| ('destroy' | 'generated') ident 
	| 'wait' temps
	;// | ...

// on peut changer pour mettre des affectations à la Java
affectation : 
	'assigne' (operation | ('add' | 'remove') operation) 'for' variable | 'invert' operation 'by' operation
	;

coordonnees : 
	operation operation operation
	;

// =, <=, >=, <, >
comparaison : 
	'is' 
	| ('is' ( (comp 'or')? 'equlas' | comp) 'to') 
	;           

comp : 
	'greater than' 
	| 'less than'
	;

transformation : 
	'translation' 
	| 'rotation' 
	| 'scale'
	;

temps : 
	operation ('mn' | 'sec' | 'ms') 
	;

// pris sur le dm de comp
operation : 
	operationMul (operateurPlus operationMul)*
	;
operationMul : 
	operationPuiss (operateurMul operationPuiss)*
	;
	 
operationPuiss : 
	operationparentheses ('^' operationparentheses)*
	;
	
operationparentheses : 
	'(' operation ')' 
	| varOuNb
	;

varOuNb : 
	variable 
	| NUMBER 
	;

variable : 
	ident ('of' ident)+
	;// | ...

operateur : 
	operateurMul 
	| operateurPlus
	;
	
operateurMul : 
	'*' 
	| '/' 
	| '%'
	;
	
operateurPlus : 
	'+' 
	| '-'
	;

ident : 
	STRING
	;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
ENDLINE_KW : ';';
SEPERATOR_KW : ',';
STRING	:  ('a'..'z' | 'A'..'Z')+;
NUMBER : ('0'..'9')+ (',' ('0'..'9')+ )? ;
WS  :   ( ' '  
         | '\t'  
         | '\r'  
         | '\n'  
         ) {$channel=HIDDEN;}  
     ;  

