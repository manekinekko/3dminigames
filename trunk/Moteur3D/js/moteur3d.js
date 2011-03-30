/**
 * Moteur3d de 3DWIGS
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.23
 */

 
 if(!window["M3D"]){
	window["M3D"] = {};
}

if(!window["M3D"].MOTEUR){
	window["M3D"].MOTEUR = {};
}

// Variables partagées

var doc = new GLGE.Document();
var tabObject = new Array; // tableau contenant tous les objets, indexés par leurs identifiants
var tabIdObject = new Array; // tableau contenant l'identifiant des objets 3D (uniquement les colladas)
var tabCamera = new Array; // tableau contenant les caméras, indexés pas leurs identifiants
var keys=new GLGE.KeyInput();
var mouse=new GLGE.MouseInput(document.getElementById('canvas'));
var gameScene = new GLGE.Scene();

// Pour le frame rate
var lasttime=0;
var frameratebuffer=60;
start=parseInt(new Date().getTime());
var now;


// PHYSIQUE
var coefFrottement = 1;

(function(M3D){

	var gameRenderer;
		
/** 
 * Méthode initialisation: initialise le moteur.
 * @param: xmlDoc: adresse du fichier xml contenant l'état initial de la scène.
 *         idCanvas: identifiant de la fenêtre canvas où est affiché la scene.
 */
	M3D.MOTEUR.initialisation = function(xmlDoc, canvas){
        doc.onLoad = function(){
            gameRenderer = new GLGE.Renderer(document.getElementById(canvas));
            gameScene = doc.getElement("mainscene");
            gameRenderer.setScene(gameScene);
		
            // Initialisation des tableaux
			gameScene.id = "mainscene";
			tabObject["mainscene"] = gameScene;
			//tabCamera["maincamera"] = gameScene.getCamera();
        } 
		doc.load(xmlDoc);
	},
	
	// uniquement pour les tests
	M3D.MOTEUR.test = function(){
		alert(tabObject["voiture1"].getBoundingVolume());
	},
 
/**
 * Méthode render: Permet l'affichage de la scène et met à jour le frame rate.
 */
	M3D.MOTEUR.render = function(){
		if(gameRenderer){
			now=parseInt(new Date().getTime());
			frameratebuffer=Math.round(((frameratebuffer*9)+1000/(now-lasttime))/10);
			document.getElementById("debug").innerHTML="Frame Rate:"+frameratebuffer;
			gameRenderer.render();
			lasttime=now;
		}
	};
	
})(M3D);