/**
 * Moteur3d de 3DWIGS
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.23
 */

 
 if(!window["M3D"]){
	window["M3D"] = {};
}

if(!window["M3D"].MOTEUR){
	window["M3D"].MOTEUR = {};
}

// Variables partag�es
var doc = new GLGE.Document();
var tabObject = new Array;
var tabIdObject = new Array;
var tabCamera = new Array;
var keys=new GLGE.KeyInput();
var mouse=new GLGE.MouseInput(document.getElementById('canvas'));

(function(M3D){
	// Variables du moteur
	var gameScene;
	var gameRenderer;
	
	// Pour le frame rate
	var lasttime=0;
	var frameratebuffer=60;
	start=parseInt(new Date().getTime());
	var now;
	
	
/** 
 * M�thode initialisation.
 * @param: xmlDoc: fichier xml contenant l'�tat initial de la sc�ne.
 *         idCanvas: identifiant de la f�netre canvas ou sera affich� la gameScene.
 * @return: un tableau contenant le tableau des objets, le tableau des identifiants d'objets et le tableau des cam�ras
 */
	M3D.MOTEUR.initialisation = function(xmlDoc, canvas){
        doc.onLoad = function(){
            gameRenderer = new GLGE.Renderer(document.getElementById(canvas));
            gameScene = new GLGE.Scene();
            gameScene = doc.getElement("mainscene");
            gameRenderer.setScene(gameScene);
             
            // Initialisation du tableau des objects/IdObject
            M3D.MOTEUR.init([gameScene]);
        
            // Initialisation du tableau des cam�ras 
			// A MODIFIER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            tabCamera[gameScene.getCamera().id] = gameScene.getCamera();
                
			setInterval(M3D.MOTEUR.render,1);
        } 
		doc.load(xmlDoc);
	},


/**
 * Fonction init: permet l'initialisation du tableau d'objet et d'identification des objets.
 * @param: liste des objets � parcourir.
 */
	M3D.MOTEUR.init = function(list){
        if(list.length!=0){
                var x = list.pop();
                var tabL = x.getLights();
                var tabO = x.getChildren();
                var present = false;
                var j;
                for(var i = 0 ; i<tabO.length ; i++){
                        for(j=0; j<tabL.length; j++){ if(tabO[i]==tabL[j]) present = true; }
                        if(!present){
                                if(tabO[i].id != undefined){
                                        tabObject[tabO[i].id] = tabO[i];
                                        tabIdObject[tabIdObject.length] = tabO[i].id;
                                        list.push(tabO[i]);
                                }
                        } present = false;
                } 
                M3D.MOTEUR.init(list);
        } 
	},


/**
 * M�thode render: Permet l'affichage de la sc�ne.
 */
	M3D.MOTEUR.render = function(){		
		now=parseInt(new Date().getTime());
		frameratebuffer=Math.round(((frameratebuffer*9)+1000/(now-lasttime))/10);
		document.getElementById("debug").innerHTML="Frame Rate:"+frameratebuffer;
		
		gameRenderer.render();
		lasttime=now;
	};
	
})(M3D);