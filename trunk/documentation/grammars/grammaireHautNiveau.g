grammar grammaireHautNiveau;
 
tokens {                                                                            // variables and methods to be included in the java file generated
AAAA;
}
/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/
 
 
game :
  (infosJeu '.')?
  (nouveauType '.')*
  (init '.')+
  (definition '.')*
  (commande '.')*
  (reglesJeu '.')*
  (iaBasique '.')*;
 
///////////////////////////// ( infos sur le jeu )  //////////////////////////////////
infosJeu :
  'game' 'has' ('gravity' | 'score'/*| ...*/) 'at' (NUMBER | NUMBER NUMBER NUMBER)
  ;
 
 
//////////////////////////// ( Héritages )  /////////////////////////////
 
// équivaut à la déclaration d'un type qui n'est pas générique (obligation de l'hériter)
nouveauType :
  'type' ident 'is' (ident | typeObjet) ('and' ident | typeObjet)*        //vérifier que ce ne sont pas les mêmes et que l'ident n'existe pas déjà
  ;            
  
// ident | typeObjet : un type hérité (de objet) défini au début du code client
// pour éviter que le "is" soit confondu avec celui des déclarations, il vaut mieux mettre un mot comme "type"
// et sinon pourquoi pas un héritage multiple juste pour la 1ere grammaire pour générer les attributs à la demande
//exemple : type mineDeFer is obstacle and bonus
 
 
 
//////////////////////////// ( Initialisations )  /////////////////////////////
init :
  ident 'is' declarationObjet
  | accesClasse 'has' affectationObjet (',' affectationObjet)*
  ;//à chaque fois, vérifications si les types concordent bien avec les attributs
 
 
// s'il n'est pas joueur, allié ou ennemi, il est neutre
declarationObjet :
  (ident | typeObjet3D) ('player' | interaction ('multiple')? )?             //neutral par défaut, utilisateur pas obligé de le mettre
  | 'list' ('of' (operation)? (ident) ('with' (operation)? (ident))* )?        //operation s'il est multiple 
  | 'camera' (('first' | 'third') 'person' | 'free')
  | 'media' ('loop' | 'once')? //sons joués en boucle ou une seule fois
  | 'in' ident //ident de la liste pour rajouter l'élément dans la liste
// | ...)
;           
 
//ident is ident : un type hérité (de objet) défini au début du code client
// list of ident : un type hérité (de objet) défini au début du code client ou un objet ou une autre liste
//type magicien is character
//gandalf is magicien
//list1 is list of magicien          //liste qui contiendra tous les magiciens
//list2 is list of gandalf           //1 seul élément
 
interaction :
  'ally' | 'enemy' | 'neutral'
  ;
 
 
//multiple est le fait de pouvoir le générer plusieurs fois en même temps, duplicable
 
 
//ex : ferrari is vehicle
//perso1 is character
//ferrari has perso1
 
affectationObjet :
  ident ('at' (operation (uniteTps)? | ident) )?         //aggrégation + 4 lignes suivantes
  | attribut 'at' (operation | STRING | BOOL)          //life at 5, name at "Gandalf Le Gris"
  | typeCoordonnees 'at' coordonnees            //size at 20 30 40
  | attributListeOuObjet 'at' ident             //inventory at listeArmesJoueur
  | attributTps 'at' operation uniteTps         //
  ;
 
 
// has ident at ... : dans le cas d'une déclaration d'un nouvel attribut
//le client n'est pas obligé de déclarer tous les attribut dont il a besoin
// s'ils sont génériques comme vie, vieMax ... ils sont générés lorsqu'ils sont appelés pour la première fois avec une initialisation en dur
// ça veut veut dire que s'il la déclare ici, il veut l'initialiser
// de plus s'il déclare un nouvel attribut, il est obligé de l'initialiser (du moins c'est vraiment recommandé)
// donc il est nécessaire d'avoir le "'at' operation" (pas de '?')
 
 
// à compléter
typeObjet :
  'camera'
  | 'media'
  | 'counter'                                 // un compteur, n'hérite pas de objet
  | typeObjet3D
  ;
 
typeObjet3D:
  'object'                                  // concept de base -> position(x,y,z), orientation(x,y,z), taille(x,y,z)  //pour la rotation, elle s'effectue autour de l'axe choisi
  | 'character'                               // -> vie, vieMax, magie, magieMax , level, experience, attaque, défense
  | 'vehicle'                                 // -> accélération, vitesseMax,
  | 'plane' | 'spaceCraft'
  | 'obstacle'                                 // génèrera une entité fixe servant aux collisions
  | 'weapon'                                  // -> nbMunitions, nbMaxMunitions intervalleTirs, tpsRecharge
  | 'sword'                                     // -> dégâts, level(pourquoi pas)
  | 'projectile'                               // -> vitesse, dégâts, level(pourquoi pas)
  | 'zone'                                     // génèrera une entité invisible et traversable
  | 'ground'                                  // -> type //idée pour préciser le type de sol : eau (génèrera une entité traversable), neige/glace (min de frottement) ...
  | 'bonus'                                      // un objet qui disparait lorsqu'il est touché par un objet spécifique-> valeur(entier), nomObjet(type),listeObjets,
                                              // listeAttributs (le ou les objets/types de touché(s) par le bonus et le ou les attributs touchés )  
  | 'checkPoint'
  | 'breakable'
  | 'construction'
  | 'room'
  | 'ball'
  | 'teleporter'
// | ...
  ;
 
 
// à compléter
//là clairement, on reprend tous les attributs qu'on a défini pour chaque objet
 
attribut :
  'mass'                  // attributs d un objet :
  | 'isFix'
  | 'isTraversable'
  | 'fov'                    // attributs de "camera"
  | 'type'
  | 'active'
  | 'name'                   // attributs de "personnage" :
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
  | 'speed'                // attributs de "vehicle" :
  | 'maxSpeed'
  | 'minSpeed'
  | 'boost'
  | 'maxBoost'
  | 'nbMunitions'           // attributs de "weapon" :
  | 'nbMunitionsMax'          //nbMunitionsMin = 0
  | 'shootPower'
  | 'damages'               //"projectile"
  | 'value'                // attributs de "bonus" :
  | 'unit'
  | 'objectname'
  | 'attributName'               
  | 'volume'                 //attributs de "media"
  | 'number'              //"ball"
  | 'moveWithCamera'
// | ...
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
  | 'shootInterval'        // attributs de "arme" :
  | 'reloadTime'
// | ...
  ;
 
//////////////////////////// ( nouvelles définitons des actions ) ///////////////////
 
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
// | ...
  ;
 
appelDef :
  ident           //l'ident d'une définition d'action (means)
  ;
 
activCommande :
  ('activate' | 'disable') ('commands' | 'mouse' (souris (',' souris)*)? | 'key' clavier (',' clavier)* | 'keyboard' )
  ;
//disable commands              // commands représente toutes les commandes
//disable key                   // toutes les commandes du clavier
//disable mouse up, down        //seulement aller en haut et en bas avec la souris
 
//////////////////////////// ( Initialisations des commandes )  /////////////////////////////
commande :
  'command' (ident 'is' actionCommande (',' actionCommande)* | actionCommande)
  ;

actionCommande :
  ('mouse' souris | 'key' clavier) 'for' (ident | actionCommandePressee | actionCommandeMaintenue)
  ;
//est-ce utile de prévoir l'appui sur plusieurs commandes en même tps
// ident : ce qu'on a défini avec means
 
souris :
        'up' | 'down' | 'left' | 'right' | 'lClick' | 'cClick' | 'rClick' | 'scrollUp' | 'scrollDown'
        ;
 
clavier :
        CHAR | 'up' | 'down' | 'left' | 'right' | 'space' | 'echap' | 'enter'          //CHAR : Z,Q,S,D
        ;
 
 
actionCommandePressee :
  'jump'
  | 'pause'
  | 'stop'
// | ...
  ;
actionCommandeMaintenue :
  'move left'
  | 'move right'
  | 'move forward'
  | 'move backword'
  | 'accelerate'
  | 'brake'  //freiner
  ;
 
// ici, pour chaque commande, il faut prévoir le fait d agir sur le joueur ou les alliés ou les ennemis (pourquoi pas) ou sur une liste
// d objets ou un objet d une liste ou un objet en particulier
 
 
//////////////////////////// ( Règles de jeu + conditions victoire / défaite à l intérieur )  /////////////////////////////
reglesJeu :
  'rule' (ident 'is')? declencheur 'then' consequences ','
  ;
conditions :
  conditionEt ('or' conditionEt)*  //ajouter le moyen de mettre des parenthèses pour les priorités
  ;
 
conditionEt :
  cond ('and' cond)*
  ;
  
cond         :
  etat
  | operation comparaison operation
  //| '(' conditions ')' //si parenthèses alors grammaire non LL(*) à cause de
                             //"operation comparaison operation" -> "comparaison operation operation "
  // | ...
  ;
  
etat :
  accesClasse 'is' ('not')? ('dead' | 'alive' | 'effaced' | 'generated' | 'touching' (('other')? accesGlobal | accesLocal))        // pour un perso / pour tous les objets
  | (ident | 'game') 'is' ('not')? ('finished' |'started' | 'paused' | 'muted' ('on' | 'off') | 'playd' | 'stopped' )  // jeu , compteur , media
  | 'true'                                                    // pour 'faux' je crois pas que ce soit nécessaire
  | 'victory'
  | 'defeat'
  //  | ...
  ;
 
declencheur :
  accesClasse ('dies' | ('touches' | 'kills') (('other')? accesGlobal | accesLocal) | ('killed' | 'touched') ('by' (('other')? accesGlobal | accesLocal))? )
  | (ident | 'game') ('ends' |'starts')
  | variable 'becomes' varOuNb
  | ident 'becomes' ('player' | interaction)
// | ...         //ident si c'est un compteur
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
// | ...
  ;
 
actionObjet :
  'dies'
  | actionCommandePressee
  | actionCommandeMaintenue ('during' operation uniteTps | 'until' conditions)
  | 'equip' (accesLocal | 'next' | 'previous')   //pour l'inventaire du perso, change l'arme, efface la première et generate la 2eme
// | ...
  ;
 
affectation :
  (('assign' | 'add' | 'sub') operation) 'for' variable | 'invert' variable 'with' variable
  ;
/*
add : a += b, remove : a -= b, assign : a = b, invert : tmp=a; a=b; b=tmp;
*/
coordonnees :
  operation operation operation
  ;
 
comparaison :
  '=' | '<' | '>' | '<=' | '>='
  ;              //ici le = correspond à notre ==
//plus simple à implémenter et de toute façon, l utilisateur est censé avoir un minimum de niveau en maths
 
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
 
// pris sur le dm de comp
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
// | ...
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