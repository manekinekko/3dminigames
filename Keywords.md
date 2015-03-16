# Glossaire des mots-clés #

### Organisation du jeu ###
  1. _Partie **Description du jeu**_
  1. _Partie **Déclaration de nouveaux types**_
  1. _Partie **Initialisations**_
  1. _Partie **Définitions**_
  1. _Partie **Commandes**_
  1. _Partie **Règles du jeu**_
  1. _Partie **Intelligence Artificielle**_

### [A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md) ###

<br />


---

<br />

# A #
[B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## accelerates ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'accélérer avec une valeur (voir ['by'](Keywords#by.md)) :
```
definition acc1 means 
	sonic accelerates by 20; // sonic accélère de 20
```

## activate ##
_Partie **Définitions**_
  * activer une commande ou toutes les commandes (voir ['disable'](Keywords#disable.md), ['keyboard'](Keywords#keyboard.md), ['mouse'](Keywords#mouse.md) et ['commands'](Keywords#commands.md)) :
```
definition activerTout means
	activate commands;
definition activerPauseSeulement means 
	activate P; //active la touche P sur le clavier
```

## add ##
_Partie **Définitions**_
  * ajouter une valeur à un attribut numérique (voir ['to'](Keywords#to.md) et ['sub'](Keywords#sub.md)) :
```
definition donnerBonus means 
	add 30 to life of batman; // l'attribut 'life' de l'entité batman de type Character va augmenter de 30
```

## ai ##
_Partie **Intelligence Artificielle**_
  * détailler le contenu d'une ia (voir ['is'](Keywords#is.md) et ['rule'](Keywords#rule.md)) :
```
ai ia_1 is
	rule /*déclencheur*/ then /*conséquences*/;
```

## alive ##
_Partie **Définitions**_
  * dans une condition, tester si l'entité avec un attribut 'life' (ex : Character) ne l'a pas à 0 (voir ['if'](Keywords#if.md)) :
```
if (perso is alive) // (voir 'is')
then /*conséquences*/
endif;
```

## all ##
  * désigner tous les objets 3D générés hérités de Empty
```
assign 100 at life of all; // (voir 'assign') va assigner 100 à l'attribut 'life' de tous les objets 3D qui en possèdent un
if life of all = 0 then /*conséquences*/ endif; // (voir 'if') va tester si tous les objets générés qui ont un attribut 'life' l'ont à 0
rule all moves then /*actions*/; // (voir 'rule') teste si l'un des objets générés bouge
```

## and ##
_Partie **Déclaration de nouveaux types**_
  * séparer les types lors de la déclaration d'un nouveau type (voir ['type'](Keywords#type.md) et ['is'](Keywords#is.md)) :
```
type SuperPlombier is Plombier and Weapon and Vehicle; // on peut ajouter autant de type que nécessaire avec 'and' du moment que les types existent déjà et ne soient pas redondants
```
_Partie **Définitions**_
  * combiner plusieurs sous conditions à l'intérieur d'une condition (voir ['if'](Keywords#if.md), ['or'](Keywords#or.md) et ['not'](Keywords#not.md)) :
```
if (life of perso1 = 0 and life of perso2 >= 5) //les conditions doivent être toutes les deux vraies pour pouvoir accéder à la conséquence (dans le then)
then /*conséquences*/
endif;
```
  * définir les bornes d'un calcul ou d'une génération aléatoire (voir ['distance'](Keywords#distance.md), ['angle'](Keywords#angle.md), ['random'](Keywords#random.md) et ['between'](Keywords#between.md)) :
```
distance between perso1 and perso2 > 10
angle between perso1 and perso2 > 10
random between 1 and 20 
// ces valeurs peuvent être assignées ou testées dans une condition
```

## angle ##
_Parties **Initialisations** et **Définitions**_
  * retourner la valeur de l'angle (sur l'axe z) formé par l'orientation entre deux objets :
```
definition calculAngle means 
	if angle between perso1 and perso2 > 10 
	then assign (angle between perso1 and perso2) to z of orientation of perso3 // (voir 'assign')
	endif;
```

## anticlockwise ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'effectuer une rotation dans le sens anti-horaire (trigonométrique) (voir ['turns'](Keywords#turns.md), ['by'](Keywords#by.md) et ['clockwise'](Keywords#clockwise.md)) :
```
definition defL1 means 
	avion turns anticlockwise by 10; 
```

## assign ##
_Partie **Définitions**_
  * affecter une valeur à un attribut, elle doit correspondre au type de l'attribut (voir ['to'](Keywords#to.md)) :
```
definition assigner means
	assign true to active of camera1,
	assign 10 to life of perso1,
	assign "Nom" to name of perso2;
```

## at ##
_Partie **Description du jeu**_
  * assigner une valeur (numérique ou non) à un attribut de game (voir ['has'](Keywords#has.md)) :
```
game has name at "mon jeu";
```
_Partie **Initialisations**_
  * assigner une valeur (numérique ou non) à un attribut d'une classe ou d'un objet (voir ['has'](Keywords#has.md)) :
```
Character has life at 100; // tous les objets de type Character commenceront avec l'attribut life à 100
perso1 has life at 10; // la valeur fournie à l'attribut doit être de même type obligatoirement, ici, l'attribut 'life' est un nombre
perso2 has belonging at perso2; // ici, l'attribut belonging est un Object (Character hérite de Object)
```
_Partie **Définitions**_
  * générer un objet à une position bien précise (voir ['generate'](Keywords#generate.md)) :
```
generate mario at 0 0 0;
```
<br />

---

[A](Keywords#A.md)
# B #
[C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## backward ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'aller en arrière pour une translation (voir ['moves'](Keywords#moves.md), ['by'](Keywords#by.md) et ['forward'](Keywords#forward.md)) :
```
definition bougerObjet means 
	objet moves backward by 10; // l'objet va reculer de 10
definition bougerMario means 
	mario moves backward by 10; // si mario (de type Character) a son attribut 'moveWithCamera' à true, il va se déplacer vers la caméra
```

## becomes ##
_Parties **Règles du jeu**_
  * sert à déclencher des actions lorsque la valeur d'un attribut devient (ou ne devient plus) exactement une autre valeur (voir ['rule'](Keywords#rule.md)) :
```
rule value of jaugeForce becomes 10 then
	/*actions*/;
rule name of perso1 becomes "Nouveau nom" then
	/*actions*/;
```

## between ##
_Parties **Initialisations** et **Définitions**_
  * définir les bornes d'un calcul ou d'une génération aléatoire (voir ['distance'](Keywords#distance.md), ['angle'](Keywords#angle.md), ['random'](Keywords#random.md) et ['and'](Keywords#and.md)) :
```
distance between perso1 and perso2 > 10
angle between perso1 and perso2 > 10
random between 1 and 20 
// ces valeurs peuvent être assignées ou testées dans une condition
```

## brakes ##
_Partie **Définitions**_
  * ordonner à l'entité désignée de freiner d'une valeur (voir ['by'](Keywords#by.md)) :
```
definition freiner means 
	vaisseau brakes by 5; // la vitesse du vaisseau va décroître de 5
```

## by ##
_Partie **Définitions**_
  * définit la valeur associée à un changement (voir ['jumps'](Keywords#jumps.md), ['moves'](Keywords#moves.md), ['turns'](Keywords#turns.md), ['accelerates'](Keywords#accelerates.md), ['brakes'](Keywords#brakes.md) et ['expels'](Keywords#expels.md)) :
```
mario jumps by 10;
mario moves forward by 10;
jeep accelerates by 10;
jeep brakes by 10;
yoshi expels goomba by 10;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md)
# C #
[D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## clockwise ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'effectuer une rotation dans le sens horaire (voir ['turns'](Keywords#turns.md), ['by'](Keywords#by.md) et ['anticlockwise'](Keywords#anticlockwise.md)) :
```
definition defR1 means 
	avion turns clockwise by 10; 
```

## command ##
_Partie **Commandes**_
  * déclarer la liste des commandes pour chaque joueur :
```
command for joueur1, joueur2 is    // les mêmes commandes sont autorisées pour deux joueurs si le mode tour par tour est actif (attribut 'turnbased' de game)
	mouse right for viserR,
	mouse left for viserL, // (voir 'mouse') commande souris ('up', 'down', 'right', 'lClick', 'mClick', 'rClick', 'scrollUp' ou 'scrollDown')
	key enter for tirer; // (voir 'key') commande clavier (lettre de 'A' à 'Z', 'up', 'down', 'left', 'right', 'space', 'escape' ou 'enter')   
```

## commands ##
_Partie **Définitions**_
  * activer / désactiver l'ensemble des commandes pour le clavier et la souris (voir ['activate'](Keywords#activate.md), ['disable'](Keywords#disable.md), ['keyboard'](Keywords#keyboard.md) et ['mouse'](Keywords#mouse.md)) :
```
activate commands
disable commands
```

## contains ##
  * dans une condition, vérifier si un objet appartient à une liste (voir ['list'](Keywords#list.md)) :
```
if elements of inventory1 contains arme1 then  // l'attribut 'elements' de inventory1 est une liste d'objets
	/*conséquence*/
endif;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md)
# D #
[E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## dead ##
_Partie **Définitions**_
  * dans une condition, tester si l'entité ayant un attribut 'life' (ex : Character) est mort (si son attribut 'life' a atteint 0) :
```
if (perso is dead) // (voir 'is')
then /*conséquences*/
endif;
```

## defeat ##
_Partie **Définitions**_
  * déclarer l'échec d'un joueur dans la partie (voir ['victory'](Keywords#victory.md)) :
```
definition echec means 
	defeat of joueurPrincipal : "Echec du joueur pricipal !",  // il est possible d'afficher un message
	defeat of joueurAllie;
```

## definition ##
_Partie **Définitions**_
  * déclarer un ensemble d'actions réutilisables plusieurs fois dans des règles du jeu ou des commandes différentes (voir ['means'](Keywords#means.md)) :
```
definition tirer means  // le nom 'tirer' pourra être appelé tel quel dans une règle du jeu
	bazooka expels missile by 100, 
	wait 200 ms then 
		generate missile 
	endwait;

command for joueur1 is
	key space for tirer;  // appel de tirer dans la règle du jeu

rule /*déclencheur*/ then
	tirer;  // appel de tirer dans la règle du jeu
```

## dies ##
_Partie **Définitions**_
  * déclarer la mort d'un objet de type Character :
```
rule mario touches zoneDeVide then
	mario dies;
```
  * tester si l'objet de type Character vient juste de mourir :
```
rule mario dies then
	game ends;
```

## disable ##
_Partie **Définitions**_
  * désactiver une commande ou toutes les commandes (voir ['activate'](Keywords#activate.md), ['keyboard'](Keywords#keyboard.md), ['mouse'](Keywords#mouse.md) et ['commands'](Keywords#commands.md)) :
```
definition desactiverTout means
	disable commands;
definition desactiverPauseSeulement means 
	disable P; //désactive la touche P sur le clavier
```

## distance ##
_Parties **Initialisations** et **Définitions**_
  * retourner la valeur de la distance entre deux objets (voir ['between'](Keywords#between.md)) :
```
definition calculDistance means 
	if distance between perso1 and perso2 > 10 
	then perso2 dies
	endif;
```

## down ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'aller en bas pour une translation (voir ['moves'](Keywords#moves.md), ['by'](Keywords#by.md) et ['up'](Keywords#up.md)) :
```
definition bougerHelico means 
	helico moves down by 10; // l'hélicoptère va descendre verticalement de 10
```
  * ordonner à l'entité désignée d'effectuer une rotation vers le bas (voir ['turns'](Keywords#turns.md), ['by'](Keywords#by.md) et ['up'](Keywords#up.md)) :
```
definition incliner means 
	avion turns down by 10; // l'avion va s'incliner vers l'avant
```
_Partie **Commandes**_
  * indiquer une commande clavier, touche flèche du bas (voir ['key'](Keywords#key.md)) :
```
key down for /*action*/;
```
  * indiquer une commande souris, déplacement du curseur vers le bas (voir ['mouse'](Keywords#mouse.md)) :
```
mouse down for /*action*/;
```

## duplicable ##
_Partie **Initialisations**_
  * Indique que l'objet peut être copié en plusieurs exemplaires lors d'un generate (voir ['generate'](Keywords#generate.md)) :
```
lapin is Character duplicable; 

// dans les définitions ensuite :
definition genererPlusieurslapins means 
	generate lapin on zone1;
	generate lapin on zone2; // un deuxième lapin sera généré, ils sont issus du même objet mais ont leurs propres déplacement, valeurs d'attributs, etc
```

## during ##
_Partie **Définitions**_
  * poursuivre une action pendant un certain temps (voir ['until'](Keywords#until.md)) :
```
goomba moves left by 5 during 2 sec;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md)
# E #
[F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## efface ##
_Partie **Définitions**_
  * effacer un objet de la scène 3D (il reste en mémoire) (voir ['generate'](Keywords#generate.md)) :
```
definition effacerPerso means
	efface perso1;
```

## effaced ##
_Partie **Définitions**_
  * dans une condition, tester si l'entité n'a pas été générée ou n'est pas dans la scène 3D (voir ['if'](Keywords#if.md), ['generate'](Keywords#generate.md) et ['generated'](Keywords#generated.md)) :
```
if (perso is generated) // (voir 'is')
then /*conséquences*/
endif;
```

## else ##
_Partie **Définitions**_
  * le branchement conditionnel dans le cas où la condition du 'if' n'est pas respectée (voir ['if'](Keywords#if.md), ['then'](Keywords#then.md) et ['endif'](Keywords#endif.md)). Il n'est pas oligatoire s'il ne s'avère pas nécessaire :
```
if /*condition*/
then /*conséquence 1 (condition respectée)*/
else /*conséquence 2 (condition non-repectée)*/ // si la condition n'est pas repectée : la conséquence 2 est exécutée à la place de la conséquence 1
endif;
```

## endif ##
_Partie **Définitions**_
  * fermer une condition (voir ['if'](Keywords#if.md), ['then'](Keywords#then.md) et ['else'](Keywords#else.md)). Cela sert à déterminer jusqu'où la condition va faire effet :
```
if /*condition*/
then 
	if /*condition*/
	then /*conséquence 1 (condition respectée)*/ 
			// pas de else
	endif 
else /*conséquence 2 (condition non-repectée)*/  // s'il n'y avait pas eu le 'endif', il aurait été impossible de déterminer à quelle condition appartenait ce 'else'
endif; 
```

## ends ##
_Partie **Définitions**_
  * terminer le jeu :
```
definition finJeu means
	game ends;
definition finJeuMessage means
	game ends : "Fin du jeu !"; // le message à afficher est facultatif
```
  * arrêter un Chrono actif (voir ['starts'](Keywords#starts.md) et ['pause'](Keywords#pause.md)) :
```
definition arrêtChrono means
	chrono1 ends : "Time's up." // le message à afficher est facultatif
```
_Partie **Règles du jeu**_
  * tester si un chrono vient juste de se terminer (voir ['starts'](Keywords#starts.md)) :
```
rule chrono1 ends then
	/*actions*/
```

## endwait ##
_Partie **Définitions**_
  * fermer une attente (voir ['wait'](Keywords#wait.md)). Cela sert à repérer jusqu'à où l'attente va faire effet :
```
wait 5 s then
/*actions*/
endwait;

wait 5 s then
	wait 10 s then
	/*actions*/
	endwait,
	/*actions*/
endwait;
```

## enter ##
_Partie **Commandes**_
  * indiquer une commande clavier, touche Entrée (voir ['key'](Keywords#key.md)) :
```
key enter for /*action*/;
```

## equip ##
_Partie **Définitions**_
  * équiper une entité de type Character avec un objet de son inventaire (voir ['previous'](Keywords#previous.md) et ['next'](Keywords#next.md)) :
```
definition equiper means 
	perso1 equip arme1, //l'attribut 'equipedObject' de perso1 devient arme1
	perso1 equip next, //l'attribut 'equipedObject' de perso1 devient l'arme venat après arme1 dans la liste de son inventaire
	perso1 equip previous; //l'attribut 'equipedObject' de perso1 redevient arme1
```

## escape ##
_Partie **Commandes**_
  * indiquer une commande clavier, touche Echap (voir ['key'](Keywords#key.md)) :
```
key escape for /*action*/;
```

## expels ##
_Partie **Définitions**_
  * ordonner à un objet d'en lâcher un autre qui lui appartient (voir ['has'](Keywords#has.md), ['ingests'](Keywords#ingests.md) et ['grasps'](Keywords#grasps.md)) :
```
definition tirer means 
	batman expels missile by 20; // (voir 'by') l'objet est expulsé avec une force de 20
	// si le missile était n'était pas généré, il l'est avant d'être expulsé
definition lacher means 
	batman expels missile by 0; // sans force, l'objet est juste lâché
```
_Partie **Règles du jeu**_
  * tester si un objet vient juste d'en relâcher un autre (voir ['gets'](Keywords#gets.md)) :
```
rules mario expels etoile then
	/*actions*/;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md)
# F #
[G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## finished ##
_Partie **Définitions**_
  * dans une condition, tester si un Chrono est arrêté (voir ['if'](Keywords#if.md)) :
```
if (chrono1 is finished) // (voir 'is')
then /*conséquences*/
endif;
```

## first ##
_Partie **Initialisations**_
  * définir le point de vue de camera à la première personne, pour un jeu de type FPS par exemple (voir ['is'](Keywords#is.md)) :
```
cam1 is camera first person;
```
_Parties **Définitions**_
  * désigner le premier élément d'une liste (voir ['list'](Keywords#list.md)) :
```
first of list1
```

## for ##
_Parties **Commandes**_
  * désigner le (ou les joueurs dans le cas d'un jeu en tour par tour) agissant sur la liste de commandes :
```
command for player1 is // un seul joueur
	/*commandes*/;
command for player1, player2 is // deux joueurs
	/*commandes*/;
```
  * désigner l'action associée à une commande (voir ['command'](Keywords#command.md)) :
```
key space for /*action*/;
```

## forward ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'aller en avant pour une translation (voir ['moves'](Keywords#moves.md), ['by'](Keywords#by.md) et ['backward'](Keywords#backward.md)) :
```
definition bougerObjet means 
	objet moves forward by 10; // l'objet va avancer de 10
definition bougerMario means 
	mario moves forward by 10; // si mario (de type Character) a son attribut 'moveWithCamera' à true, il va s'éloigner de la caméra
```

## frame(s) ##
_Parties **Initialisations** et **Définitions**_
  * l'une des unités de temps disponibles, l'image (voir ['min'](Keywords#min.md), ['s'](Keywords#S.md) et ['ms'](Keywords#ms.md)) :
```
chrono1 has end at 100 frames //la fin du chrono est à 100 image, à 25 images par secondes, cela fait environ 4 secondes
```

## free ##
_Partie **Initialisations**_
  * définir le point de vue de camera sans contraintes sur celle-ci (voir ['is'](Keywords#is.md)) :
```
cam1 is camera free;
```

## from ##
_Parties **Initialisations** et **Définitions**_ (voir ['list'](Keywords#list.md) et ['remove'](Keywords#revove.md))
  * pour désigner le nom de la liste lorsqu'on lui retire un élément :
```
remove elt1 from liste1; // l'élément doit exister et être dans la liste désignée
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md)
# G #
[H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## game ##
_Partie **Description du jeu**_
  * le mot-clé pour définir les attributs principaux de jeu. Ses attributs sont 'gravity', 'world', 'gridsize', 'name', 'turnbased' et 'ranking' :
```
game has gravity at 10, name at "Mon Jeu"; 
```

## generate ##
_Partie **Définitions**_
  * faire apparaître un objet dans l'environnement 3D (voir ['game'](Keywords#game.md)) :
```
definition depart means
	generate sol,
	generate zoneDepart,
	generate mario;

// il est possible de générer un objet à un endroit précis
definition genMario means
	generate sol at 0 0 20, // à une position bien précise
	generate zoneDepart on sol, // au dessus d'un objet (position aléatoire ensuite)
	generate mario in zoneDepart; // à l'intérieur d'une zone (position aléatoire ensuite)

// un objet duplicable peut être généré en plusieurs exemplaires d'un coup (voir 'duplicable')
definition genGoombas means
	generate 3 goombas on sol;
```

## generated ##
_Partie **Définitions**_
  * dans une condition, tester si un objet est présent dans l'environnement 3D (voir ['generate'](Keywords#generate.md)) :
```
definition objetExiste means
	if objet1 is generated then
		/*conséquence*/
	endif;
```

## generic ##
_Partie **Description du jeu**_
  * type d'environnement (map) général sans spécification spéciale (voir ['world'](Keywords#world.md), ['grid'](Keywords#grid.md) et ['ribbon'](Keywords#ribbon.md)) :
```
game has world at generic;
```

## gets ##
_Partie **Règles du jeu**_
  * tester si un objet vient juste d'en obtenir un autre par l'intermédiaire de ingests ou grasps (voir ['ingests'](Keywords#ingests.md), ['grasps'](Keywords#grasps.md) et ['expels'](Keywords#expels.md)) :
```
rules mario gets etoile then
	/*actions*/;
```
## grasps ##
_Partie **Définitions**_
  * ordonner à un objet d'en attraper un autre pour le faire sien (voir ['has'](Keywords#has.md), ['ingests'](Keywords#ingests.md) et ['expels'](Keywords#expels.md)):
```
definition entrerDansVoiture means 
	voiture grasps perso1; // c'est la voiture qui attrape le personnage afin de le conduire quelque part
```

## gravity ##
_Partie **Description du jeu**_
  * définir la gravité de l'environnement. la gravité peut être définie par un vecteur (trois chiffre float) ou un chiffre (gravité vers bas) :
```
game has gravity at 1 1 1;
```

## grid ##
_Partie **Description du jeu**_
  * type de d'environnement (map) découpé en cases de taille fixée par l'attribut gridsize (voir ['world'](Keywords#world.md), ['generic'](Keywords#generic.md), ['ribbon'](Keywords#ribbon.md) et ['gridsize'](Keywords#gridsize.md)) :
```
game has world at grid;
```

## gridsize ##
_Partie **Description du jeu**_
  * définir la taille de chaque case dans le cas d'un jeu de type grille (voir ['world'](Keywords#world.md) et ['grid'](Keywords#grid.md)) :
```
game has gridsize at 12;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md)
# H #
[I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## happens ##
  * poursuivre une action jusqu'à ce qu'un événement se déclenche (voir ['until'](Keywords#until.md)) :
```
mario moves forward until 
	mario touches zone1 happens;
```

## has ##
_Partie **Description du jeu**_
  * spécifier les attributs de game (voir ['at'](Keywords#at.md)) :
```
game has name at "mon jeu";
```
_Partie **Initialisations**_
  * accéder à un attribut existant d'une classe ou d'un objet pour le définir (voir ['at'](Keywords#at.md)) :
```
Character has life at 100; // tous les objets de type Character commenceront avec l'attribut life à 100
perso1 has life at 10; // l'objet perso1 (de type Character commenceront avec l'attribut life à 100
perso1 has life at life of perso2; // l'attribut life de perso1 se basera sur l'attribut life de perso2
```
  * déclarer un nouvel attribut n'appartenant pas déjà à une classe (voir ['at'](Keywords#at.md)) :
```
Character has mon_attribut_1 at 100; // l'attribut nommé 'mon_attribut_1' n'existe pas dans la classe Character, tous les objets de type Character commenceront avec cet attribut initialisé à 20
perso1 has mon_attribut_2 at 20; // perso1 est de type Character, l'attribut nommé 'mon_attribut_2' n'existant pas dans cette classe, perso1 commencera avec cet attribut initialisé à 50
perso1 has mon_attribut_3 at "texte1"; // une chaîne de caractère peut être ajoutée (entre guillemets obligatoirement)
```
  * faire qu'un objet s'approprie un autre objet et lui donne des contraintes de parenté :
```
perso1 has arme1; // l'objet perso1 s'approprie l'objet arme1 (son attribut belonging devient 'true')
```
_Partie **Définitions**_
  * dans une condition, tester l'appartenance d'un objet pour un autre (voir ['if'](Keywords#if.md)) :
```
if perso1 has arme1
then /*conséquence*/
endif; // l'objet perso1 s'approprie l'objet arme1 (son attribut belonging devient 'true')
```

## held ##
_Partie **Commandes**_
  * préciser qu'une commande s'effectue lorsqu'une touche du clavier est maintenue enfoncée (voir ['key'](Keywords#key.md), ['pressed'](Keywords#pressed.md) et ['released'](Keywords#released.md)) :
```
command for player is 
	key up held for /*action*/; // 'held' n'est pas obligatoire
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md)
# I #
[J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## if ##
_Partie **Définitions**_
  * exprimer un choix avec une condition (voir ['then'](Keywords#then.md), ['else'](Keywords#else.md) et ['endif'](Keywords#endif.md)) :
```
if /*condition*/ // si la condition est repectée les actions après le 'then' seront exécutées
then /*conséquence (condition respectée)*/
endif; // fin, condition repectée ou non

if /*condition 1*/ 
then /*(condition respectée)*/
	if /*condition 2*/ // d'autre conditions peuvent être imbriquées
	then /*conséquence (condition respectée)*/
	endif; 
endif; 

if /*condition*/ // si la condition est repectée les actions après le 'then' seront exécutées sinon ce sont celles après le 'else' qui le seront
then /*conséquence 1 (condition respectée)*/
else /*conséquence 2 (condition non-repectée)*/ 
endif;
```

## in ##
_Partie **Initialisations**_
  * désigner une liste lorsqu'on y accède :
```
assign 5 to life of num 3 in list1 // la liste doit contenir au moins 3 éléments et les attributs appelés doivent exister
```
  * désigner une liste lorsqu'on y place un nouvel élément (voir ['insert'](Keywords#insert.md)) :
```
insert arme1 in list1; 
```
_Partie **Définitions**_
  * désigner une liste lorsqu'on y place un nouvel élément (voir ['insert'](Keywords#insert.md) et ['ingests'](Keywords#ingests.md)) :
```
insert arme1 in list1; 
yoshi ingests ennemi1 in inventaireEnnemis;
```
  * générer un objet à l'intérieur d'une zone (voir ['generate'](Keywords#generate.md)):
```
generate mario in zoneDepart;
```

## ingests ##
_Partie **Règles du jeu**_
  * ordonner à un objet d'en prendre un autre qui ne lui appartient pas (voir ['has'](Keywords#has.md), ['grasps'](Keywords#grasps.md) et ['expels'](Keywords#expels.md)), l'objet pris est effacé et mis dans un inventaire :
```
definition placeBook means 
	perso1 ingests book1 in inventaireLibrairie;
```

## insert ##
_Parties **Initialisations** et **Définitions**_
  * placer un objet dans une liste (voir ['list'](Keywords#list.md), ['in'](Keywords#in.md) et ['remove'](Keywords#remove.md)) :
```
insert arme1 in list1 num 2; // (voir 'num') l'objet arme1 sera placé à la deuxième place dans la liste list1 (la dernière place si le nombre d'éléments est plus petit)
insert arme1 in list1; // l'objet arme1 sera placé à la fin de la liste list1
```

## invert ##
_Partie **Définitions**_
  * intervertir les valeurs de deux attributs (voir ['with'](Keywords#with.md)) :
```
definition intervertir means 
	invert speed of mario with speed of luigi;
```

## is ##
_Partie **Déclaration de nouveaux types**_
  * déclarer un nouveau type (une nouvelle classe) (voir ['type'](Keywords#type.md)) :
```
type Plombier is Character; // le type doit déjà exister ou avoir été défini plus haut dans le code de la même manière
type SuperPlombier is Plombier and Weapon; // on peut déclarer de nouveaux types qui sont composés de plusieurs déjà existant
```
_Partie **Initialisations**_
```
mario is Plombier; // le type doit exister
```
_Partie **Définitions**_
  * tester l'état d'un objet selon son type dans une condition (voir ['if'](Keywords#if.md)) :
```
if audio1 is started then /*conséquences*/ endif; // (voir 'started') pour un objet de type Media
if perso1 is dead then /*conséquences*/ endif; // (voir 'dead') pour un objet de type Character
```
_Partie **Commandes**_
  * déclarer une commmande : se place après la déclaration (voir ['command'](Keywords#command.md) et ['for'](Keywords#for.md)) :
```
command objet1 for player1 is definition1;
```
_Partie **Intelligence Artificielle**_
  * préciser le nom d'une règle du jeu (voir ['ai'](Keywords#ai.md)) :
```
ai nom_ia is /*conséquences*/ ; 
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md)
# J #
[K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## jumps ##
_Partie **Définitions**_
  * ordonner à un personnage de sauter en indiquant la puissance (voir ['by'](Keywords#by.md)) :
```
superGoomba jumps by 5;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md)
# K #
[L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## key ##
_Partie **Commandes**_
  * déclarer une commande liée clavier (voir ['command'](Keywords#command.md) et ['mouse'](Keywords#mouse.md)), les commandes sont : lettre de 'A' à 'Z', 'up', 'down', 'left', 'right', 'space', 'escape' ou 'enter' :
```
command for joueur1 is
	key left for bougerJeepGauche,
	key right for bougerJeepDroite;
```

## keyboard ##
_Partie **Définitions**_
  * activer / désactiver l'ensemble des commandes pour le clavier seulement (voir ['activate'](Keywords#activate.md), ['disable'](Keywords#disable.md), ['mouse'](Keywords#mouse.md) et ['commands'](Keywords#commands.md)) :
```
activate keyboard
disable keyboard
```

## killed ##
_Partie **Règles du jeu**_
  * tester si une entité de type Character est tuée par une autre :
```
rule mario is killed by goomba then
	/*actions*/;
```

## kills ##
_Partie **Définitions**_
  * déclarer qu'une entité en a tuée une autre de type Character :
```
mario kills goomba;
```
_Partie **Règles du jeu**_
  * tester si une entité en tue une autre de type Character :
```
rule mario kills goomba then
	/*actions*/;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md)
# L #
[M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## last ##
_Partie **Définitions**_
  * désigner le dernier élément d'une liste (voir ['list'](Keywords#list.md)) :
```
last of list1
```


## lclick ##
_Partie **Commandes**_
  * indiquer une commande souris, clic gauche (voir ['mouse'](Keywords#mouse.md)) :
```
mouse lclick for /*action*/;
```

## left ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'aller à gauche pour une translation (voir ['moves'](Keywords#moves.md), ['by'](Keywords#by.md) et ['right'](Keywords#right.md)) :
```
definition bougerObjet means 
	objet moves left by 10; // l'objet va se décaler sur sa gauche de 10
definition bougerMario means 
	mario moves left by 10; // si mario (de type Character) a son attribut 'moveWithCamera' à true, il va se déplacer vers la gauche de l'écran
```
  * ordonner à l'entité désignée d'effectuer une rotation vers la gauche (voir ['turns'](Keywords#turns.md), ['by'](Keywords#by.md) et ['right'](Keywords#right.md)) :
```
definition tournerMario means 
	mario turns left by 10; // mario va tourner à gauche
```
_Partie **Commandes**_
  * indiquer une commande clavier, touche flèche de gauche (voir ['key'](Keywords#key.md)) :
```
key left for /*action*/;
```
  * indiquer une commande souris, déplacement du curseur vers la gauche (voir ['mouse'](Keywords#mouse.md)) :
```
mouse left for /*action*/;
```

## list ##
_Partie **Initialisations**_
  * regrouper et ordonner des éléments en créant une liste d'entités :
```
listeEnnemie is list of goomba1, goomba2, goomba3;
```

## loop ##
_Partie **Initialisations**_
  * indiquer qu'un Media est interprété en boucle (voir ['is'](Keywords#is.md) et ['once'](Keywords#once.md)) :
```
musiqueAmbiance is Media loop;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md)
# M #
[N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## mclick ##
_Partie **Commandes**_
  * indiquer une commande souris, clic du bonton central (molette) s'il y en a un (voir ['mouse'](Keywords#mouse.md)) :
```
mouse mclick for /*action*/;
```

## means ##
_Partie **Définitions**_
  * déclarer une définition : se place après la déclaration :
```
definition bougerJeep means
	jeep moves forward by 10;
```

## min ##
_Parties **Initialisations** et **Définitions**_
  * l'une des unités de temps disponibles, la minute (voir ['frame(s)'](Keywords#frame(s).md), ['s'](Keywords#S.md) et ['ms'](Keywords#ms.md))
```
chrono1 has end at 1 min
```

## mouse ##
_Partie **Définitions**_
  * activer / désactiver l'ensemble des commandes pour la souris seulement (voir ['activate'](Keywords#activate.md), ['disable'](Keywords#disable.md), ['keyboard'](Keywords#keyboard.md) et ['commands'](Keywords#commands.md)) :
```
activate mouse
disable mouse
```
_Partie **Commandes**_
  * déclarer une commande liée à la souris (voir ['command'](Keywords#command.md) et ['key'](Keywords#key.md)), les commandes sont 'up', 'down', 'right', 'lClick', 'mClick', 'rClick', 'scrollUp' ou 'scrollDown' :
```
command for joueur1 is
	mouse down for seBaisser,
	mouse rclick for tirer;
```

## moves ##
_Partie **Définitions**_
  * déclarer un déplacement (voir ['right'](Keywords#right.md), ['left'](Keywords#left.md), ['forward'](Keywords#forward.md), ['backward'](Keywords#backward.md) et ['turns'](Keywords#turns.md)) :
```
definition bougerObjet means 
	objet moves backward by 10;
```
  * tester si un objet vient juste de bouger :
```
rule mario moves then
	/*actions*/;
```

## moving ##
_Partie **Définitions**_
  * dans une condition, tester si un objet est en train de bouger :
```
if mario is moving 
then /*conséquence*/
endif;
```

## ms ##
_Parties **Initialisations** et **Définitions**_
  * l'une des unités de temps disponibles, la milliseconde (voir ['frame(s)'](Keywords#frame(s).md), ['min'](Keywords#min.md) et ['s'](Keywords#S.md))
```
chrono1 has end at 750 ms
```

## mute ##
_Partie **Définitions**_
  * désactiver le son d'un Media (voir ['on'](Keywords#on.md) et ['off'](Keywords#off.md)) :
```
definition desactiverMusique means
	mute on mediaMusique; // désactive le son du média
	mute off mediaMusique; // active le son du média
```

## muted ##
_Partie **Règles du jeu**_
  * dans une condition, tester si le son du Media a été coupé (voir ['mute'](Keywords#mute.md), ['on'](Keywords#on.md) et ['off'](Keywords#off.md)) :
```
if musiqueAmbiance is muted on // ou bien 'muted off'
then /*conséquence*/
endif;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md)
# N #
[O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## name ##
_Partie **Description du jeu**_
  * définir le nom du jeu (voir ['game'](Keywords#game.md)) :
```
game has name at "Mon jeu";
```

## next ##
_Partie **Définitions**_
  * équiper une entité de type Character avec l'objet de son inventaire venant après l'objet déjà équipé (voir ['equip'](Keywords#equip.md) et ['previous'](Keywords#previous.md)) :
```
definition equiper means 
	perso1 equip next; //l'attribut 'equipedObject' de perso1 devient l'objet suivant
```

## nexturn ##
_Partie **Définitions**_
  * déclarer le tour du joueur suivant lors d'un jeu en tour par tour (voir ['game'](Keywords#game.md) et ['turnbased'](Keywords#turnbased.md)) :
```
nexturn joueur2;
```

## not ##
_Partie **Définitions**_
  * dans une condition, exprimer la négation logique (voir ['and'](Keywords#and.md) et ['or'](Keywords#or.md)):
```
definition genererMario means
	if mario is not generated then // dans une condition
		generate mario
	endif;

definition destroyMario means
	if not (mario is not generated or mario is dead) then // équivaut à "s'il est généré et en vie", il est possible d'en mettre autant que nécessaire
		destroy mario
	endif;
```

## num ##
_Parties **Initialisations** et **Définitions**_
  * accéder à l'élément d'une liste à partir de sa position (voir ['list'](Keywords#list.md) et ['in'](Keywords#in.md)) :
```
name of num 1 in listeDesPersos; // accès à l'attribut nom du premier élément de la liste 'listeDesPersos'
insert arme1 in list1 num 2; // (voir 'insert')
remove num 1 from liste1; // (voir 'remove')
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md)
# O #
[P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## of ##
_Partie **Initialisations**_
  * énumérer le contenu d'une liste à sa création (voir ['is'](Keywords#is.md) et ['list'](Keywords#list.md)) :
```
liste1 is list of perso1, perso2, perso3;
```
_Parties **Définitions** et **Règles du jeu**_
  * accéder en cascade aux attributs d'un objet ou d'une classe :
```
life of perso1
x of position of perso1 // x est un attribut de position et position est un attribut de perso1
```
  * indiquer quelle Team ou quel Player est en condition de victoire ou de défaite (voir ['victory'](Keywords#victory.md) et ['defeat'](Keywords#defeat.md)) :
```
victory of team1; 
defeat of player1; 
```

## off ##
_Partie **Définitions**_
  * réactiver le son d'un Media (voir ['mute'](Keywords#mute.md) et ['on'](Keywords#on.md)) :
```
definition activerMusique means
	mute off mediaMusique; // réactive le son du média
```
_Partie **Règles du jeu**_
  * dans une condition, tester si le son du Media a été réactivé (voir ['muted'](Keywords#muted.md) et ['on'](Keywords#on.md)) :
```
if musiqueAmbiance is muted off
then /*conséquence*/
endif;
```

## on ##
_Partie **Définitions**_
  * désactiver le son d'un Media (voir ['mute'](Keywords#mute.md) et ['off'](Keywords#off.md)) :
```
definition desactiverMusique means
	mute on mediaMusique; // désactive le son du média
```
_Partie **Règles du jeu**_
  * dans une condition, tester si le son du Media a été coupé (voir ['muted'](Keywords#muted.md) et ['off'](Keywords#off.md)) :
```
if musiqueAmbiance is muted on
then /*conséquence*/
endif;
```

## or ##
_Partie **Définitions**_
  * combiner plusieurs sous conditions à l'intérieur d'une condition (voir ['if'](Keywords#if.md), ['and'](Keywords#and.md) et ['not'](Keywords#not.md)) :
```
if (life of perso1 = 0 or life of perso2 >= 5) //une seul des deux conditions doit être vraie pour pouvoir accéder à la conséquence (dans le then)
then /*conséquences*/
endif;
```

## orientation ##
_Parties **Initialisations** et **Définitions**_
  * l'attribut d'un objet de type Empty (ou de ses dérivés), correspondant à son orientation dans l'environnement 3D selon son référentiel (le référentiel peut être un objet) (voir ['position'](Keywords#position.md) et ['size'](Keywords#size.md)) :
```
objet1 has orientation at 90 0 180; // l'orientation de l'objet est de 90 autour de l'axe x, 0 autour de l'axe y et 180 autour de l'axe z
```

## other ##
_Partie **Règles du**_
l'a t'on gardé ?
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md)
# P #
[Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## pause ##
_Partie **Définitions**_
  * stopper le jeu temporairement :
```
definition pauseOn means
	game pause; // une fois le jeu mis en pause, il est possible de reprendre la partie avec le menu contextuel
```
  * stopper un Chrono temporairement (voir ['starts'](Keywords#starts.md) et ['ends'](Keywords#ends.md)) :
```
definition stopperChrono means
	chrono1 pause;
```
  * stopper un Media temporairement (voir ['play'](Keywords#play.md) et ['stop'](Keywords#stop.md)) :
```
definition stopperMedia means
	pause musiqueAmbiance;
```

## paused ##
_Partie **Définitions**_
  * dans une condition, tester si un Media est arrêté temporairement (voir ['if'](Keywords#if.md)) :
```
if musiqueAmbiance is paused
then /*conséquences*/
endif;
```
  * dans une condition, tester si un Chrono est arrêté temporairement (voir ['if'](Keywords#if.md)) :
```
if chrono1 is paused
then /*conséquences*/
endif;
```

## person ##
_Partie **Initialisations**_
  * définir le point de vue de la camera à la première personne ou à la troisième personne (voir ['first'](Keywords#first.md) et ['third'](Keywords#third.md)):
```
cam1 is camera first person;
cam2 is camera third person;
```

## play ##
  * lancer ou relancer un Media arrêté (voir ['pause'](Keywords#pause.md) et ['stop'](Keywords#stop.md)) :
```
definition jouerMedia means
	play musiqueAmbiance;
```

## played ##
_Partie **Définitions**_
  * dans une condition, tester si un Media est actif (voir ['if'](Keywords#if.md)) :
```
if musiqueAmbiance is played
then /*conséquences*/
endif;
```

## position ##
_Parties **Initialisations** et **Définitions**_
  * l'attribut d'un objet de type Empty (ou de ses dérivés), correspondant à sa position dans l'environnement 3D selon son référentiel (le référentiel peut être un objet) (voir ['orientation'](Keywords#orientation.md) et ['size'](Keywords#size.md)) :
```
objet1 has position at 0 10 20; // la position de l'objet est de 0 sur l'axe x, 10 sur l'axe y et 20 sur l'axe z
```

## pressed ##
_Partie **Commandes**_
  * préciser qu'une commande s'effectue lorsqu'une touche du clavier est juste pressée une fois (voir ['key'](Keywords#key.md), ['held'](Keywords#held.md) et ['released'](Keywords#released.md)) :
```
command for player is 
	key up pressed for /*action*/, // 'pressed' n'est pas obligatoire
	key up for /*action*/; // ne rien mettre équivaut à pressed
```

## previous ##
_Partie **Définitions**_
  * équiper une entité de type Character avec l'objet de son inventaire venant avant l'objet déjà équipé (voir ['equip'](Keywords#equip.md) et ['next'](Keywords#next.md)) :
```
definition equiper means 
	perso1 equip previous; //l'attribut 'equipedObject' de perso1 devient l'objet précédent
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md)
# Q #
[R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md)
# R #
[S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## random ##
_Parties **Initialisations** et **Définitions**_
  * donner une valeur aléatoire entre deux valeur numériques, ces valeurs peuvent être des attributs (voir ['between'](Keywords#between.md) et ['and'](Keywords#and.md)) :
```
random between 0 and 1 // donne soit 0 soit 1
random between life of perso1 and life of perso2 // les deux attributs doivent être numériques
```

## ranking ##
_Partie **Description du jeu**_
  * établir un classement final des joueurs sous la forme d'une liste (voir ['game'](Keywords#game.md) et ['list'](Keywords#list.md)) :
```
game has ranking at joueur1, joueur2;
```

## rclick ##
_Partie **Commandes**_
  * indiquer une commande souris, clic droit (voir ['mouse'](Keywords#mouse.md)) :
```
mouse rclick for /*action*/;
```

## released ##
_Partie **Commandes**_
  * préciser qu'une commande s'effectue lorsqu'une touche du clavier relâchée (voir ['key'](Keywords#key.md), ['pressed'](Keywords#pressed.md) et ['held'](Keywords#held.md)) :
```
command for player is 
	key up released for /*action*/; // 'released' n'est pas obligatoire
```

## remove ##
_Parties **Initialisations** et **Définitions**_
  * pour retire un élément d'une liste (voir ['list'](Keywords#list.md), ['from'](Keywords#from.md) et ['insert'](Keywords#insert.md)) :
```
remove num 1 from liste1; // l'élément doit exister et être dans la liste désignée
remove first from liste1; // (voir 'first') supprime le premier élément si la liste n'est pas vide
remove last from liste1; // (voir 'last') supprime le dernier élément si la liste n'est pas vide
```

## ribbon ##
_Partie **Description du jeu**_
  * type d'environnement (map) adapté aux jeux linéaires (voir ['world'](Keywords#world.md), ['generic'](Keywords#generic.md) et ['grid'](Keywords#grid.md)) :
```
game has world at ribbon;
```

## right ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'aller à droite pour une translation (voir ['moves'](Keywords#moves.md), ['by'](Keywords#by.md) et ['left'](Keywords#left.md)) :
```
definition bougerObjet means 
	objet moves right by 10; // l'objet va se décaler sur sa droite de 10
definition bougerMario means 
	mario moves right by 10; // si mario (de type Character) a son attribut 'moveWithCamera' à true, il va se déplacer vers la droite de l'écran
```
  * ordonner à l'entité désignée d'effectuer une rotation vers la droite (voir ['turns'](Keywords#turns.md), ['by'](Keywords#by.md) et ['left'](Keywords#left.md)) :
```
definition tournerMario means 
	mario turns right by 10; // mario va tourner à droite
```
_Partie **Commandes**_
  * indiquer une commande clavier, touche flèche de droite (voir ['key'](Keywords#key.md)) :
```
key right for /*action*/;
```
  * indiquer une commande souris, déplacement du curseur vers la droite (voir ['mouse'](Keywords#mouse.md)) :
```
mouse right for /*action*/;
```

## rule ##
_Parties **Règles du jeu**_
  * définir une règles du jeu. Chaque règle a besoin d'un déclencheur et est déclenchée en parallèle. À l'intérieur, chaque action (nom de définition) est éxécutée en série :
```
rule Game starts then
	/*action 1*/,
	/*action 2*/,
	/*action n*/;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md)
# S #
[T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## s ##
_Parties **Initialisations** et **Définitions**_
  * l'une des unités de temps disponibles, la seconde (voir ['frame(s)'](Keywords#frame(s).md), ['min'](Keywords#min.md) et ['ms'](Keywords#ms.md)) :
```
chrono1 has end at 10 s
```

## save ##
_Partie **Définitions**_
  * enregistrer le jeu :
```
definition sauverJeu means
	save;
```

## scrollDown ##
_Partie **Commandes**_
  * indiquer une commande souris, un cran de molette vers le bas (voir ['mouse'](Keywords#mouse.md)) :
```
mouse scrollDown for /*action*/;
```

## scrollUp ##
_Partie **Commandes**_
  * indiquer une commande souris, un cran de molette vers le haut (voir ['mouse'](Keywords#mouse.md)) :
```
mouse scrollUp for /*action*/;
```

## size ##
_Parties **Initialisations** et **Définitions**_
  * l'attribut d'un objet de type Empty (ou de ses dérivés), correspondant à sa taille selon son référentiel (le référentiel peut être un objet) (voir ['position'](Keywords#position.md) et ['orientation'](Keywords#orientation.md)) :
```
objet1 has size at 1 2 3; // la taille de l'objet est de 1 sur l'axe x, 2 sur l'axe y et 3 sur l'axe z
```

## solo ##
_Partie **Initialisations**_
  * déclarer que joueur n'a personne d'autre que lui dans son équipe (voir ['is'](Keywords#is.md)) :
```
player1 is Player solo; // le nom de l'équipe de 'joueur1' est 'joueur1'
```

## space ##
_Partie **Commandes**_
  * indiquer une commande clavier, touche Espace (voir ['key'](Keywords#key.md)) :
```
key space for /*action*/;
```

## started ##
  * dans une condition, tester si un Chrono est actif (voir ['if'](Keywords#if.md)) :
```
if chrono1 is started
then /*conséquences*/
endif;
```

## starts ##
_Partie **Définitions**_
  * lancer ou relancer un Chrono arrêté (voir ['pause'](Keywords#pause.md) et ['ends'](Keywords#ends.md)) :
```
definition demarrerChrono means
	chrono1 starts;
```
_Partie **Règles du jeu**_
  * tester si le jeu vient juste de démarrer :
```
rule game starts then
	/*action de début du jeu*/;
```
  * tester si un Chrono vient juste de démarrer :
```
rule chrono1 starts then
	/*action*/;
```

## stop ##
_Partie **Définitions**_
  * arrêter un Media (voir ['play'](Keywords#play.md) et ['pause'](Keywords#pause.md)) :
```
definition stopperMedia means
	stop musiqueAmbiance;
```

## stopped ##
_Partie **Définitions**_
  * dans une condition, tester si un Media n'est pas actif (voir ['if'](Keywords#if.md)) :
```
if musiqueAmbiance is stopped
then /*conséquences*/
endif;
```

## sub ##
_Partie **Définitions**_
  * soustraire une valeur à un attribut numérique (voir ['to'](Keywords#to.md) et ['add'](Keywords#add.md)) :
```
definition prendreVie means 
	sub 30 to life of batman; // l'attribut 'life' de l'entité batman de type Character va baisser de 30
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md)
# T #
[U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## then ##
_Partie **Définitions**_
  * déclarer une condition (voir ['if'](Keywords#if.md)) : se place après la déclaration :
```
if /*condition*/ then
then /*conséquences*/
endif;
```
  * déclarer une attente (voir ['wait'](Keywords#wait.md)) : se place après la déclaration :
```
wait 5 s then
/*actions*/
endwait;
```
_Partie **Règles du jeu**_
  * déclarer une règle du jeu (voir ['rule'](Keywords#rule.md)) : se place après la déclaration :
```
rule /*déclencheur*/ then
	/*actions*/;
```

## third ##
_Partie **Initialisations**_
  * définir le point de vue de camera à la troisième personne, pour un jeu de type plateforme par exemple (voir ['is'](Keywords#is.md)) :
```
cam1 is camera third person;
```

## to ##
_Parties **Initialisations** et **Définitions**_
  * désigner l'attribut d'un objet lors d'une opération mathématique ou d'une assignation (voir ['add'](Keywords#add.md), ['sub'](Keywords#sub.md) et ['assign'](Keywords#assign.md)) :
```
definition toucherLapin means
    sub 1 to life of lapin1,
	assign "Lapin n°2" to name of lapin2;
```

## touched ##
_Parties **Règles du jeu**_
  * tester si une entité entre en contact avec une autre ou avec une zone :
```
rule mario is touched by goomba then 
	/*actions*/;
```

## touches ##
_Parties **Règles du jeu**_
  * tester si une entité entre en contact avec une autre ou avec une zone :
```
rule mario touches goomba then 
	/*actions*/;
```

## touching ##
_Partie **Définitions**_
  * dans une condition, teste si une entité est en train d'en toucher une autre ou une zone (voir ['if'](Keywords#if.md) et ['is'](Keywords#is.md)) :
```
if mario is touching zoneDepart
then /*conséquence*/
endif;
```

## turns ##
_Partie **Définitions**_
  * déclarer une rotation (voir ['right'](Keywords#right.md), ['left'](Keywords#left.md), ['clockwise'](Keywords#clockwise.md), ['anticlockwise'](Keywords#anticlockwise.md) et ['moves'](Keywords#moves.md)) :
```
definition faireAvancerAiguille means 
	aiguille turns clockwise by 10;
```

## turnbased ##
_Partie **Description du jeu**_
  * définir le type de jeu : temps réel ou tour par tour (voir ['game'](Keywords#game.md)) :
```
game has turn based at true;
```

## type ##
_Partie **Déclaration de nouveaux types**_
  * créer un nouveau type d'entités issu d'un ou de plusieurs autres. Les objets ensuite créés avec ce type, auront les mêmes attributs que les types de base ont :
```
type EpeeFlingue is Sword and Weapon;  // les objets créés avec ce nouveau type auront les attributs de Sword et de Weapon
type EpeeFlingueEnnemis is EpeeFlingue and Character; // ce nouveau type aura les attributs de Sword, Weapon et Character
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md)
# U #
[V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## up ##
_Partie **Définitions**_
  * ordonner à l'entité désignée d'aller en haut pour une translation (voir ['moves'](Keywords#moves.md), ['by'](Keywords#by.md) et ['down'](Keywords#down.md)) :
```
definition bougerHelico means 
	helico moves up by 10; // l'hélicoptère va monter verticalement de 10
```
  * ordonner à l'entité désignée d'effectuer une rotation vers le haut (voir ['turns'](Keywords#turns.md), ['by'](Keywords#by.md) et ['down'](Keywords#down.md)) :
```
definition incliner means 
	avion turns up by 10; // l'avion va s'incliner vers l'arrière
```
_Partie **Commandes**_
  * indiquer une commande clavier, touche flèche du haut (voir ['key'](Keywords#key.md)) :
```
key up for /*action*/;
```
  * indiquer une commande souris, déplacement du curseur vers le haut (voir ['mouse'](Keywords#mouse.md)) :
```
mouse up for /*action*/;
```

## until ##
_Partie **Définitions**_
  * poursuivre une action jusqu'à ce qu'un événement se déclenche (voir ['happens'](Keywords#happens.md) et ['during'](Keywords#during.md)) :
```
mario moves forward until 
	mario touches zone1 happens;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md)
# V #
[W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## victory ##
_Partie **Définitions**_
  * déclarer la victoire d'un joueur dans la partie (voir ['defeat'](Keywords#defeat.md)) :
```
definition victoire means 
	victory of joueurPrincipal : "Victoire du joueur pricipal !",  // il est possible d'afficher un message
	victory of joueurAllie;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md)
# W #
[X](Keywords#X.md) - [Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

## wait ##
_Partie **Définitions**_
  * arrêter une action pour un temps défini, les actions placée à l'intérieur s'effectuent après cette attente (voir ['endwait'](Keywords#endwait.md)) :
```
wait 5 s then
/*actions*/
endwait;

wait 5 s then
	wait 10 s then
	/*actions*/
	endwait;
endwait;
```

## waiting ##
_Partie **Définitions**_
  * dans une condition, tester si une entité est fixe (sa position est la même) :
```
if mario is waiting
then /*conséquences*/
endif;
```

## with ##
_Partie **Définitions**_
  * intervertir les valeurs de deux attributs (voir ['invert'](Keywords#invert.md)) :
```
definition intervertir means 
	invert speed of mario with speed of luigi;
```

## world ##
_Partie **Description du jeu**_
  * spécifier l'environnement du jeu (voir ['game'](Keywords#game.md), ['generic'](Keywords#generic.md), ['grid'](Keywords#grid.md) et ['ribbon'](Keywords#ribbon.md)) :
```
game has world at generic; // l'attribut 'world' est 'generic' de base
game has world at grid;
game has world at ribbon;
```
<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md)
# X #
[Y](Keywords#Y.md) - [Z](Keywords#Z.md)

---

<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md)
# Y #
[Z](Keywords#Z.md)

---

<br />

---

[A](Keywords#A.md) - [B](Keywords#B.md) - [C](Keywords#C.md) - [D](Keywords#D.md) - [E](Keywords#E.md) - [F](Keywords#F.md) - [G](Keywords#G.md) - [H](Keywords#H.md) - [I](Keywords#I.md) - [J](Keywords#J.md) - [K](Keywords#K.md) - [L](Keywords#L.md) - [M](Keywords#M.md) - [N](Keywords#N.md) - [O](Keywords#O.md) - [P](Keywords#P.md) - [Q](Keywords#Q.md) - [R](Keywords#R.md) - [S](Keywords#S.md) - [T](Keywords#T.md) - [U](Keywords#U.md) - [V](Keywords#V.md) - [W](Keywords#W.md) - [X](Keywords#X.md) - [Y](Keywords#Y.md)
# Z #
<br />

---

<br />
<br />