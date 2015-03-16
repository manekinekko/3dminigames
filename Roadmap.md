# UI (avancée) (suspendue) #

## Validé ##
  * Système de fenêtre
  * Picking
  * Import collada
  * Base de données en Local Storage
  * Import des classes prédéfinies et leurs attributs en JSON
  * Possibilité de créer des règles (uniquement l'affichage)
  * Possibilité de créer et sauvegarder de nouveaux types
  * Possibilité de créer et sauvegarder de nouveaux attributs

## En cours ##
  * Génération de la description en langage 3DWIGS
  * Sauvegarde des attributs en DB
  * Sauvegarde des types crées en DB
  * Sauvegarde des modèles importés en DB
  * Génération d'un XML pour GLGE (exploitable)

## A venir ##
  * graphe de scène
  * implémentation d'une API alternative pour la base de données basée sur IndexedDB
  * meilleur gestion de la caméra
  * meilleur affichage de la bounding box
  * meilleur validation des champs de saisies
  * Possibilité d'importer des modèles **avec textures**



---

# UI (rustique) #
### A: Antoine / D: David / T: Thomas / W: Wassim ###

## Validé ##
  * Mise à jour de la position/rotation/scale des objets en IndexedDB
  * Mise à jour de la position/rotation/scale des objets en Local Storage
  * **Synchronisation de l'éditeur avec l'IHM**
  * Ajout d'un sol dans le canvas
  * Mise en place d'une UI v2 plus ergonique
  * **Import de modèles collada en HTML5 ou en AJAX**
  * Mise en place de slider permettant une mise à jour simple des valeurs
  * Ajout d'un fichier XML de configuration
  * **Génération d'un fichier scenrario exploitable par le compilation**
  * Synchronisation du contenu de l'éditeur avec l'IndexedDB
  * Synchronisation du contenu de l'éditeur avec le Local Storage
  * Gestion de la caméra (à la Sketchup)

## En cours ##
  * 

## A venir ##
### Par ordre de priorité ###
  1. Positionnement des objets sur un plan
  1. Positionnement des objets sur un terrain (collision)
  1. graphe de scène
  1. Possibilité d'importer des modèles **avec textures**
  1. proposition de modèles sous forme de vignette (??)
  1. positionnement de la camera par rapport à un objet
  1. Synchronisation de l'IHM avec l'éditeur


---

# Moteur 3D #

## Validé ##
  * ajout d'éléments
  * suppression d'éléments
  * fonctions de déplacement
## En cours ##
  * système de collision
## A venir ##
  * gestion des caméras
  * gestion des forces

---

# Compilation #

## Validé ##
  * Parser et Arpenteur d'arbre opérationnels pour le langage "de base"
  * Gestions des classes prédéfinies
  * Gestions des types des attributs des classes prédéfinies
  * Création des types hérités : le Js est généré
  * Création des entités de bases (sans graphe de scène) : le Js est généré
  * Génération du code pour les opération numériques et booléennes
  * Génération de l'affectation, incrémentation, décrémentation et inversement de variables
## En cours ##
  * Gestion des définitions
  * Notion de graphe de scène
## A venir ##
  * Gestion des commandes
  * Gestion des règles
  * Gestion et approfondissement de la partie IA

---


# Contenu #

## Validé ##
  * Modèles du jeu lapin + code
  * Modèles du Game&Watch
  * Modèles du billard
  * Modèles du 1942
  * Modèles du MarioSansAutoGen
  * Modèles du Pacman
## En cours ##
  * Code du 1942
  * Code du billard
  * code du Game&Watch
  * Code du Mario
  * Spécification d'IA paramétrable
  * Modèles du jeu de course
## A venir ##
  * Reste des codes et modèles des mini-jeux

  * Mario (Mario, bonus, 2 ennemis, plateforme) + version sans génération aléatoire (avec carte)
  * Jeu capture du drapeau en FPS
  * Contenu global de modèles

## Planning ##
### PLANNING PUR CONTENU (txt + dae) ###
légende : T(txt), D(dae), /2(fait à moitié)

SEM 5-6 (aujourd'hui):
  * Jeu du lapin < T + D >
  * Watch’N’Droid < T/2 + D >
  * Mario (plateformes générées aléatoirement) < T/2 D/2 >
  * Mario (niveau défini) < D >

SEM 6-7:
  * Pacman < D >
  * Billard < T/2 + D >
  * 1942 < T/2 D >
  * fps deathmatch sans équipe < D/2 >
  * fps deathmatch avec équipes (jusquà 3 équipes)

SEM 7-8:
  * fps capture the flag (+ ia)
  * Volley
  * Course (expérimenter le f-zero pour le fun)

SEM 8 à 10 (mercredi 9 mars):
  * mini rpg style pokémon ou FF avec phases (comment intégrer des éléments de narration ?)
  * modèles de base à fournir à l'utilisateur (selon l'idée d'Érik)
  * voir avec les autres groupes pour intégrer des médias (musiques...) ou faites vos propres musiques si vous vous sentez un peu artiste
//sachant qu'on sera 2 ou peut-être 3 à modéliser, la semaine 9 à 10 pour faire le reste de tous les modèles me semble suffisante


### PLANNING CONTENU AUTRE ###

SEM 5-6:
  * regrouper les concepts de chaque jeu pour le groupe compilation
  * formaliser précisément les concepts de ces jeux et rajouter les modifications de la classe Game dans la grammaire
  * chercher des idées pour l'IA (regrouper les idées générales entre les types d'entités, les types de jeux)

SEM 6-7:
  * IA toutes faites à coder en haut niveau ou javascript (voir avec Wassim), rajouter les mots-clés manquants dans la grammaire au besoin
  * prévoir la possibilité de paramétrer l'IA

SEM 7 à 9 (mercredi 2 mars):
  * IA à coder en haut niveau ou javascript (voir avec Wassim)



### MODELES DE BASE ###
  * Character : paladin médiéval, orc, mario, droid, robot...
  * Vehicle : jeep, voiture course, vaisseaux (course), bateau (pourquoi pas ?)
  * Plane : avions, hélicos (1942)
  * Spacecraft : quelques vaisseaux spatiaux, sous-marin (pourquoi pas ?)
  * Sword : couteaux, épées
  * Weapon : armes à feu de notre époque (9mm, fusil à pompe calibre 12, bazooka, arbalète...), armes à feu futuristes
  * Projectile : les munitions associées, missile
  * Teleporter : base pour la téléportation
  * Ball : balles de golf, de tennis / ballons de volley, de foot / boules de bowling (+quille), de billard
  * Obstacle : pierres...
  * Platform : plusieurs styles de plateformes allant de la pierre plate au nuage
  * Breakable (comment gérer les 2 modèles) : caisse, tonneau
  * Checkpoint : un du genre trackmania pour le jeu de course
  * Construction : une tour médiévale, une chaumière...

  * Ground et Bonus : là je sais pas, les possiblités sont trop nombreuses

  * décors : plusieurs types de vagatations / lapin, chien chat, souris ... / tables, chaises, lampes, lampadaire

  * autres : drapeau (ctf), table de billard, bombe, tous les modèles créés pour faire les mini-jeux, etc

//penser aux armatures pour la plupart des modèles animables



---


# Suggestions d'amélioration dans la grammaire #
  * Ajout du déplacement sur l'axe z
  * Ajout des phases de jeu
  * Ajout de la sélection d'objet
  * Ajout de liste de joueurs (humain ou IA) + nb de joueurs dans la classe Game (ex : billard à 2)
  * Ajout de l'affichage d'un texte à la fin du jeu


---

# Documentation #
à compléter
## Validé ##
  * 
## En cours ##
  * L'utilisation de l'IHM
## A venir ##
  * Détails sur le langage haut-niveau (pour édition manuelle)