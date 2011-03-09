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
var tabObject = new Array;
var tabIdObject = new Array;
var tabCamera = new Array;
var keys=new GLGE.KeyInput();
var mouse=new GLGE.MouseInput(document.getElementById('canvas'));
var gameScene = new GLGE.Scene();
var gravity = 0.0;

// Pour le frame rate
var lasttime=0;
var frameratebuffer=60;
start=parseInt(new Date().getTime());
var now;

(function(M3D){
	// Variables du moteur
	var gameRenderer;
		
/** 
 * Méthode initialisation: permet l'initialisation du moteur.
 * @param: xmlDoc: adresse du fichier xml contenant l'état initial de la scène.
 *         idCanvas: identifiant de la fenêtre canvas ou sera affiché la gameScene.
 */
	M3D.MOTEUR.initialisation = function(xmlDoc, canvas){
        doc.onLoad = function(){			
            gameRenderer = new GLGE.Renderer(document.getElementById(canvas));
            gameScene = doc.getElement("mainscene");
            gameRenderer.setScene(gameScene);
        
			// Pour la mise en place de la heightmap
		/*	var map = doc.getElement("theMap");
						
			var map_heightmap = new GLGE.HeightMap("images/test_heightmap.jpg", 256, 256, 0, 10, 0, 10, 0, 10);
		 */	
		/*	var positionOnMap = new Array;
			var tabUV = new Array;
			var tabPosMap = new Array;
			var cpt = 0;
			for(var i=0; i<10; i++){
				for(var j=0; j<10; j++){
					positionOnMap.push(i);
					positionOnMap.push(j);
					positionOnMap.push(map_heightmap.getHeightAt(i,j));
					tabUV.push(1);
					tabPosMap.push(cpt);
					cpt++;
				}
			}
		*/		
		/*
			var map_mesh = new GLGE.Mesh();
			map_mesh.setPositions(-4.999998,5.000002,0.000000,5.000000,5.000000,0.000000,5.000002,4.999998,3.000000,-4.999998,5.000002,0.000000,5.000002,4.999998,3.000000,-5.000000,5.000000,3.000000,-5.000000,-4.999999,0.000000,-4.999998,5.000002,0.000000,-5.000000,5.000000,3.000000,-5.000000,-4.999999,0.000000,-5.000000,5.000000,3.000000,-5.000002,-4.999998,3.000000,5.000000,-5.000000,0.000000,-5.000000,-4.999999,0.000000,4.999997,-5.000003,3.000000,-5.000000,-4.999999,0.000000,-5.000002,-4.999998,3.000000,4.999997,-5.000003,3.000000,5.000000,5.000000,0.000000,5.000000,-5.000000,0.000000,5.000002,4.999998,3.000000,5.000000,-5.000000,0.000000,4.999997,-5.000003,3.000000,5.000002,4.999998,3.000000,5.000002,4.999998,3.000000,4.999997,-5.000003,3.000000,-5.000000,5.000000,3.000000,4.999997,-5.000003,3.000000,-5.000002,-4.999998,3.000000,-5.000000,5.000000,3.000000,5.000000,5.000000,0.000000,-4.999998,5.000002,0.000000,-5.000000,-4.999999,0.000000,5.000000,5.000000,0.000000,-5.000000,-4.999999,0.000000,5.000000,-5.000000,0.000000);
			//map_mesh.setFaces(tabPosMap);
			map_mesh.setUV(0.000000,0.000000,1.000000,0.000000,1.000000,1.000000,0.000000,0.000000,1.000000,1.000000,0.000000,1.000000,0.000000,0.000000,1.000000,0.000000,1.000000,1.000000,0.000000,0.000000,1.000000,1.000000,0.000000,1.000000,0.000000,0.000000,1.000000,0.000000,0.000000,1.000000,1.000000,0.000000,1.000000,1.000000,0.000000,1.000000,0.000000,0.000000,1.000000,0.000000,0.000000,1.000000,1.000000,0.000000,1.000000,1.000000,0.000000,1.000000,0.000000,0.000000,1.000000,0.000000,0.000000,1.000000,1.000000,0.000000,1.000000,1.000000,0.000000,1.000000,0.000000,0.000000,1.000000,0.000000,1.000000,1.000000,0.000000,0.000000,1.000000,1.000000,0.000000,1.000000);
			
			var texture = new GLGE.Texture();
			texture.setSrc("images/test_texture.jpg");
			
			var mapLayer = new GLGE.MaterialLayer();
			mapLayer.setTexture(texture);
			mapLayer.setMapinput("UV1");
			mapLayer.setMapto("M_COLOR");
			
			var map_mat = new GLGE.Material();
			map_mat.setSpecular(0.5);
			map_mat.addTexture("../images/test_texture.jpg");
			map_mat.addMaterialLayer(mapLayer);
			
			map.getMaterial(map_mat);
			map.getMesh(map_mesh);	
		*/
		
			// Initialisation du tableau des objects/IdObject
            M3D.MOTEUR.initTabObject([gameScene]);
        
            // Initialisation du tableau des caméras
			cam = gameScene.getCamera();
			tabCamera[cam.id] = cam;
			
        } 
		doc.load(xmlDoc);
	},


/**
 * Fonction initTabObject: permet l'initialisation du tableau d'objet et d'identification des objets.
 * @param: liste des objets à parcourir.
 */
	M3D.MOTEUR.initTabObject = function(list){
        if(list.length!=0){
            var x = list.pop();
            var tabL = x.getLights();
            var tabO = x.getChildren();
            var present = false;
            var j;
            for(var i = 0 ; i<tabO.length ; i++){
                for(j=0; j<tabL.length; j++){ if(tabO[i]==tabL[j]) present = true; }
				if(tabO[i].id == "theMap") present = true;
                if(!present){
                    if(tabO[i].id != undefined){
                        tabObject[tabO[i].id] = tabO[i];
                        tabIdObject[tabIdObject.length] = tabO[i].id;
                        list.push(tabO[i]);
                    }
                } present = false;
            } 
            M3D.MOTEUR.initTabObject(list);
        } 
	},


/**
 * Fonction initPhysicalForce: permet l'initialisation des variables physiques du moteur.
 * @param: g: valeur de la gravité.
 */
	M3D.MOTEUR.initPhysicalForce = function(g){
		this.gravity = g;
	},
 
/**
 * Méthode render: Permet l'affichage de la scène.
 */
	M3D.MOTEUR.render = function(){		
		now=parseInt(new Date().getTime());
		frameratebuffer=Math.round(((frameratebuffer*9)+1000/(now-lasttime))/10);
		document.getElementById("debug").innerHTML="Frame Rate:"+frameratebuffer;
		gameRenderer.render();
		lasttime=now;
	};
	
})(M3D);