/**
 * Moteur3d de 3DWIGS: moteur_camera.js
 * Fichier contenant l'ensemble des fonctions li�es � la gestion des cam�ras.
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

	M3D.MOTEUR.corrigeCamBug = function(camTab){
		var camera;
		for(var i = 0; i < camTab.length ; i++){
			camera = tabCamera[camTab[i]]
			camera.matrix = null;
			camera.getModelMatrix();
		}
	},
	
/**
 * M�thode activeCamera: permet l'activation de la cam�ra plac�e en param�tre.
 * (si la cam�ra n'existe pas, aucun changement s'effectue)
 * @param: idCamera: identifiant de la cam�ra que l'on souhaite activer.
 */
	M3D.MOTEUR.activeCamera = function(idCamera){
		var newCam = M3D.MOTEUR.getCamera(idCamera);
		if(newCam != -1)
			gameScene.setCamera(newCam);
	},
	
	
// CA MARCHE PAS AVEC DES PARENTS
/**
 * M�thode addCamera: Ajoute une cam�ra dans la sc�ne.
 * @param: gCamera: cam�ra de la grammaire (avec l'attribut id comme identfiant et posX posY posZ orX orY orZ comme attributs de positions et orientations)
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache la cam�ra sinon elle est rattach� � la sc�ne.
 */
	M3D.MOTEUR.addCamera = function(gCamera, idParent){
		var idCamera = gCamera.id;
		var cam = new GLGE.Camera();
		var transMat = GLGE.inverseMat4(GLGE.translateMatrix(gCamera.posX, gCamera.posY, gCamera.posZ));
		var rotMat = GLGE.rotateMatrix(gCamera.orX, gCamera.orY, gCamera.orZ);
		var localMatrix = GLGE.mulMat4(transMat,rotMat);
		cam.setType(GLGE.C_PERSPECTIVE);
		cam.setFovY(35);
		cam.setAspect(1.8);
		if(idParent == null){
			var parent = gameScene
		}else{
			var parent = M3D.MOTEUR.getObject(idParent);
		}				
		cam.id = idCamera;
		parent.addChild(cam);
		tabCamera[idCamera] = cam;
		cam.setStaticMatrix(localMatrix);
		cam.childCam = [idCamera];
		while(parent.id != "mainscene"){
			parent.childCam.push(idCamera);
			parent = parent.parent;
		}
		M3D.MOTEUR.corrigeCamBug([idCamera]);
	},

/**
 * M�thode removeCamera: supprime une cam�ra de la sc�ne si elle n'est pas active.
 * @param: idCamera: identifiant de la cam�ra � supprimer.
 * @return: true si la cam�ra a �t� supprim�e, false sinon
 */
	M3D.MOTEUR.removeCamera = function(idCamera){
		var bool = (gameScene.getCamera().id != idCamera);
		if(bool){
			var cam = M3D.MOTEUR.getCamera(idCamera);
			delete tabCamera[idCamera];
			cam.parent.removeChild(cam);
		}
		return bool;
	},

	// idem Translate pour une cam�ra
	M3D.MOTEUR.translateCamera = function(gCamera,tabVector,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.translate(gCamera,tabVector,false);
		}else{
			M3D.MOTEUR.translate(gCamera,tabVector,false,idRef);
		}
	},

	// idem setPosition pour une cam�ra
	M3D.MOTEUR.setPositionCamera = function(gCamera,tabPos,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.setPosition(gCamera,tabPos,false);
		}else{
			M3D.MOTEUR.setPosition(gCamera,tabPos,false,idRef);
		}
	}, 

	// idem rotate pour une cam�ra
	M3D.MOTEUR.rotateCamera = function(gCamera,tabRot,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.rotate(gCamera,tabRot,false);
		}else{
			M3D.MOTEUR.rotate(gCamera,tabRot,false,idRef);
		}
	},
	
	// idem setAngle pour une cam�ra
	M3D.MOTEUR.setAngleCamera = function(gCamera,tabRot,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.setAngle(gCamera,tabRot,false);
		}else{
			M3D.MOTEUR.setAngle(gCamera,tabRot,false,idRef);
		}
	};

})(window.M3D);