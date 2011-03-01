/**
 * Moteur3d de 3DWIGS: moteur_camera.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des caméras.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

	M3D.MOTEUR.getCamera = function(idCamera){
		var camera = tabCamera[idCamera];
		if(camera != null) return camera;
		else{ alert("The camera named "+idCamera+" doesn't exist in the scene."); return -1;}
	},

	M3D.MOTEUR.addCamera = function(idCamera, tabCoord, idParent){
		tabCamera[idCamera] = new GLGE.Camera();
		tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabCamera[idCamera].setScale(tabCoord[6]);

		if(tabObject[idParent] == undefined) gameScene.addChild(tabCamera[idCamera]);
		else{
			tabObject[idParent].addChild(tabOject[idObject]);
		}
	},

	M3D.MOTEUR.addCameraIn = function(idCamera, tabCoord, idGroup){
		tabCamera[idCamera] = new GLGE.Camera();
		tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabCamera[idCamera].setScale(tabCoord[6]);
        
		if(tabObject[idGroup] == undefined){ // Vérifier la gestion du addChild dans un Group...
			tabObject[idGroup] = new GLGE.Group();
			tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
			tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
			tabObject[idGroup].addChild(tabCamera[idCamera]);
			gameScene.addChild(tabObject[idGroup]);
		} else{ tabObject[idGroup].addChild(tabCamera[idCamera]); }
	},

	M3D.MOTEUR.addCameraGroup = function(idCamera, idGroup, tabCoord, idParent){
		tabCamera[idCamera] = new GLGE.Collada();
		tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabCamera[idCamera].setScale(tabCoord[6]);
        
		if(tabObject[idGroup] == undefined){
			tabObject[idGroup] = new GLGE.Group();
			tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
			tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
			tabObject[idGroup].addChild(tabCamera[idCamera]);
			
			if(idParent == null) gameScene.addChild(tabObject[idGroup]);
			else{ 
				 if(tabObject[idParent] != undefined) tabObject[idParent].addChild(tabCamera[idCamera]);
			}
		}
	},

	M3D.MOTEUR.addCameraGroupIn = function(idCamera, idGroup, tabCoord, idParent){
		tabCamera[idCamera] = new GLGE.Collada();
		tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabCamera[idCamera].setScale(tabCoord[6]);
			
		if(tabObject[idGroup] == undefined){
			tabObject[idGroup] = new GLGE.Group();
			tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
			tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
			tabObject[idGroup].addChild(tabCamera[idCamera]);
			
			if(idParent == null) gameScene.addChild(tabObject[idGroup]);
			else{ 
				if(tabObject[idParent] != undefined) tabObject[idParent].addChild(tabCamera[idCamera]);
			}
		}
	},

	M3D.MOTEUR.removeCamera = function(idCamera){
		if(tabCamera[idCamera] != undefined) tabCamera[idCamera].parent.removeChild(tabCamera[idCamera]);
	},

	M3D.MOTEUR.changeParentCamera = function(idCamera,idNewParent){
		if(tabCamera[idCamera] != undefined && tabObject[idNewParent] != undefined){
			tabCamera[idCamera].parent = tabObject[idNewParent]; 
			tabObject[idNewParent].addChild(tabCamera[idCamera]);
		}
	},

	M3D.MOTEUR.translateCamera = function(idCamera,tabVector,idRef){
		var Mcamera = tabCamera[idCamera].getModelMatrix();
		if(idRef == null){
			var Mref = tabCamera[idCamera].getModelMatrix();
		}else{
			var Mref = tabObject[idRef].getModelMatrix();
		}
			
		var vector = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
		var etape1 = GLGE.mulMat4Vec4(Mref,vector);
		var camera=tabCamera[idCamera];
		var actualposition = GLGE.Vec4(camera.getLocX(),camera.getLocY(),camera.getLocZ(),1);
		var etape2 = GLGE.mulMat4Vec4(Mcamera,actualposition);
		var etape3 = GLGE.addVec4(etape1,etape2);
		var D = GLGE.mulMat4Vec4(GLGE.inverseMat4(Mcamera),etape3);
		tabCamera[idCamera].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
	},

	/* 
	M3D.MOTEUR.setPositionCamera = function(idCamera,tabPos,idRef){
		if(idRef == null){
			var M = GLGE.identMatrix();
		}else{
			var M = tabCamera[idRef].getModelMatrix();
		}
		var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
		var D = GLGE.mulMat4Vec4(M,V);
		tabCamera[idCamera].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
	}, 
	*/

	M3D.MOTEUR.rotateCamera = function(idCamera,tabRot,idRef){
		if(idRef == null){
			var M = GLGE.identMatrix();
		}else{
			var M = tabCamera[idRef].getModelMatrix();
		}
		var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
		var D = GLGE.mulMat4Vec4(M,V);
		tabCamera[idCamera].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
	};
	
})(window.M3D);