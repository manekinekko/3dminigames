grammar grammaireHautNiveau;
 
tokens {                                                                            // variables and methods to be included in the java file generated
AAAA;
}
/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/
 
jeu :
  (infosJeu '.')?
  (nouveauType '.')*
  (init '.')+
  (definition '.')*
  (commande '.')*
  (reglesJeu '.')*
  (iaBasique '.')*;
 

///////////////////////////// ( informations about the game)  //////////////////////////////////

infosJeu :
  'Game' 'has' ('gravity' | 'score' /*| ...*/ ) 'at' (NUMBER | NUMBER NUMBER NUMBER)
  ;

 
//////////////////////////// ( Inheritance )  /////////////////////////////
 
nouveauType :
  'type' ident 'is' (ident | typeObjet) ('and' ident | typeObjet)* // to declare a new type
  ;            
  
// ident | typeObjet : if it is an ident, check that it is defined before by the user and that is an inherited Object.

 
//////////////////////////// ( Initializations )  /////////////////////////////

init :
  ident 'is' declarationObjet
  | accesClasse 'has' affectationObjet (',' affectationObjet)* // check the types and its attributes
  ;
 
declarationObjet :
  (ident | typeObjet3D) ('player' | interaction ('duplicable')? )?         // interaction is neutral by default
  | 'list' ('of' (operation)? (ident) ('with' (operation)? (ident))* )?  //operation if the object is duplicable
  | 'Camera' (('first' | 'third') 'person' | 'free')?
  | 'Media' ('loop' | 'once')? 						 // sound, music or video played in loop or once
  | 'in' ident 				                         // ident of a list to add an element
;           
 
interaction :
  'ally' | 'enemy' | 'neutral'
  ;
 
affectationObjet :
  ident ('at' (operation (uniteTps)? | ident) )?       //aggregation
  | attribut 'at' (operation | STRING | BOOL)          //life at 5, name at "Gandalf Le Gris"
  | typeCoordonnees 'at' coordonnees            //size at 20 30 40
  | attributListeOuObjet 'at' ident             //inventory at listeArmesJoueur
  | attributTps 'at' operation uniteTps         //
  ;
 
// has ident at ... : to declare a new attribute
// Attributes of predefined class have default initialized
// it is not necessary to initialize not used attribute
  
typeObjet :
  'Camera'
  | 'Media'
  | 'Counter'
  | 'Time'
  | typeObjet3D
  ;
 
// every predefined classes
typeObjet3D:
  'Object'                      // -> position(x,y,z), orientation(x,y,z), size(x,y,z)
  | 'Character'                 // -> life, lifeMax, magic, magicMax , level, experience, attack, defense
  | 'Vehicle'                   // -> acceleration, speedMax,
  | 'Plane' | 'SpaceCraft'
  | 'Obstacle'                  // a fixed entity, used for collisions
  | 'Weapon'                    // -> nbMunitions, nbMaxMunitions, intervalleTirs, timeRecharge
  | 'Sword'                     // -> damages, level
  | 'Projectile'                // -> vitesse, damages, level(pourquoi pas)
  | 'Zone'                      // an invisible and traversable entity
  | 'Ground'                    // -> type of ground (water, snow ...)
  | 'Bonus'                     // an object which disappears when something touches it-> valeur(entier), nomObjet(type),listeObjets 
  | 'CheckPoint'
  | 'Breakable'
  | 'Construction'
  | 'Room'
  | 'Ball'
  | 'Teleporter'
  ;
 
// every attributes of predefined classes
attribut : 
  'mass'                  // attributes of object :
  | 'isFix'
  | 'isTraversable'
  | 'fov'                    // attributes of "camera"
  | 'type'
  | 'active'
  | 'name'                   // attributes of "character" :
  | 'description'
  | 'life'
  | 'lifeMax'
  | 'lifeMin'   
  | 'nbOfLives'   
  | 'magic'
  | 'magicMax'
  | 'magicMin'
  | 'level'
  | 'attack'
  | 'defense'
  | 'jumpForce'
  | 'maxJumpsInTheAir'
  | 'money'
  | 'class'
  | 'race'
  | 'acceleration'    
  | 'speed'                // attributes of "vehicle" :
  | 'maxSpeed'
  | 'minSpeed'
  | 'boost'
  | 'maxBoost'
  | 'nbMunitions'           // attributes of"weapon" :
  | 'nbMunitionsMax'        
  | 'shootPower'
  | 'damages'               //attributes of "projectile"
  | 'value'                // attributes of "bonus" :
  | 'unit'
  | 'objectname'
  | 'attributName'               
  | 'volume'                 //attributes of "media"
  | 'number'              //attributes of "ball"
  | 'moveWithCamera'
  ;
 
attributListeOuObjet :
  'inventory'
  | 'equipedObjects'
  | 'entrances'
  | 'exits'
  | 'damageZone'
  | 'collectors'
  | 'typesCollectors'
  | 'generators'
  | 'typeGenerators'
  | 'breakers'
  | 'typesBreakers'
  | 'teleportables'
  | 'typesTeleportables'
  ;
 
attributTps :
  'boostInterval'
  | 'shootInterval'        //attributes of "weapon" :
  | 'reloadTime'
  ;
 

//////////////////////////// ( new definitions of actions ) ///////////////////
 
definition : 'definition' ident 'means' consequences;
 
consequences :
  consequ (',' consequ)*
  ;
  
consequ :
  siAlors
  | action
  | affectation
  | activCommande
  | appelDef
  | 'victory'
  | 'defeat'
  ;
 
appelDef :
  ident           //ident of a definition of an action (means)
  ;
 
activCommande :
  ('activate' | 'disable') ('commands' | 'mouse' (souris (',' souris)*)? | 'key' clavier (',' clavier)* | 'keyboard' )
  ;
//disable commands              // all the commands
//disable key                   // all the key commands
//disable mouse up, down        // only move up or down with the mouse
 

//////////////////////////// ( Initialization of commands )  /////////////////////////////

commande :
  'command' (ident 'is' actionCommande (',' actionCommande)* | actionCommande)
  ;

actionCommande :
  ('mouse' souris | 'key' clavier) 'for' (ident | actionCommandePressee | actionCommandeMaintenue) // ident : what is defined with means
  ;
 
souris :
        'up' | 'down' | 'left' | 'right' | 'lClick' | 'cClick' | 'rClick' | 'scrollUp' | 'scrollDown'
        ;
 
clavier :
        CHAR | 'up' | 'down' | 'left' | 'right' | 'space' | 'echap' | 'enter'          //CHAR : Z,Q,S,D,...
        ;
 
actionCommandePressee :
  'jump' operation
  | 'pause'
  | 'stop'
  ;
actionCommandeMaintenue :
  'move' ('left' | 'right' | 'forward' | 'backward')
  | 'turn' ('left' | 'right')
  | 'accelerate'
  | 'brake'
  ;
 
 
//////////////////////////// ( Rules of the game + conditions of victory / defeat )  /////////////////////////////

reglesJeu :
  'rule' (ident 'is')? declencheur 'then' consequences ','
  ;
conditions :
  conditionEt ('or' conditionEt)*
  ;
 
conditionEt :
  conditionsNot ('and' conditionsNot)*
  ;
  
conditionsNot :
  'not' cond
  ;

cond :
  '(' conditions ')'
  | etat
  | operation comparaison operation
  ;

etat :
  accesClasse 'is' ('not')? ('dead' | 'alive' | 'effaced' | 'generated' | 'touching' (('other')? accesGlobal | accesLocal))  // for an object
  | (ident | 'game') 'is' ('not')? ('finished' |'started' | 'paused' | 'muted' ('on' | 'off') | 'played' | 'stopped' )  // game,counter,media
  | 'true'                                                   
  | 'victory'
  | 'defeat'
  ;
 
declencheur :
  accesClasse ('dies' | ('touches' | 'kills') (('other')? accesGlobal | accesLocal) | ('killed' | 'touched') ('by' (('other')? accesGlobal | accesLocal))? )
  | (ident | 'game') ('ends' |'starts')          //ident if it is a counter
  | variable 'becomes' varOuNb
  | ident 'becomes' ('player' | interaction)
  ;
  
siAlors :
  'if' conditions 'then' consequences ('else' consequences)? 'end'
  ;
  
 
action :
  accesClasse actionObjet
  | (ident | 'game') ('ends' |'starts')
  | ('pause' | 'mute' ('on' | 'off') | 'play' | 'stop' ) ident
  | 'block' transformation 'of' accesClasse coordonnees
  | ('efface' | 'generate') (accesClasse | operation accesClasse ('in' accesLocal | 'on' accesLocal | 'at' coordonnees)?)
  | 'wait' operation uniteTps 'then' consequences 'endWait'
  | 'save'
  ;
 
actionObjet :
  'dies'
  | actionCommandePressee
  | actionCommandeMaintenue ('during' operation uniteTps | 'until' conditions)
  | 'equip' (accesLocal | 'next' | 'previous')   
  ;
 
affectation :
  (('assign' | 'add' | 'sub') operation) 'for' variable | 'invert' variable 'with' variable
  ;

//add : a += b, remove : a -= b, assign : a = b, invert : tmp=a; a=b; b=tmp;

coordonnees :
  operation operation operation
  ;
 
comparaison :
  '=' | '<' | '>' | '<=' | '>='
  ; 
 
transformation :
  'translation'
  | 'rotation'
  | 'scale'
  ;
 
uniteTps :
  'mn'
  | 'sec'
  | 'ms'
  | 'frames'
  ;
 
operation :
  ('random' 'between' operationPlus 'and')? operationPlus
  ;
 
operationPlus :
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
  (('x' | 'y' | 'z') 'of' (typeCoordonnees | ident | attribut)) 'of' accesClasse
                      //x of size of num 10 in listeWeapon
  ;
 
accesClasse : accesLocal | accesGlobal;
 
accesGlobal :
  typeObjet
  | interaction
  | 'not' (typeObjet | interaction | 'player')
  | 'all'
  ;
 
accesLocal :
  ident
  | 'num' operation 'in' ident
  | 'player'
  ;
 
 
typeCoordonnees :
  'positition' | 'rotation' | 'scale'
  ;
 
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
 
//////////////////////////// ia //////////////////////////
 
iaBasique : 'ia' accesClasse 'is' actionObjet (',' actionObjet)*;
 

/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/
BOOL        : ('true' | 'false');
STRING        :  ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')+ ;
CHAR   : 'a'..'z' | 'A'..'Z';
NUMBER : ('0'..'9')+ (',' ('0'..'9')+ )? ;
WS  :   ( ' '  
           | '\t'  
           | '\r'  
           | '\n'  
           | '\u000C'
           )+ {$channel=HIDDEN;}  
        ;