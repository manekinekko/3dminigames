/**
 * Moteur3d de 3DWIGS: moteur_camera.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des caméras.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
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
 * Méthode activeCamera: permet l'activation de la caméra placée en paramètre.
 * (si la caméra n'existe pas, aucun changement s'effectue)
 * @param: idCamera: identifiant de la caméra que l'on souhaite activer.
 */
	M3D.MOTEUR.activeCamera = function(idCamera){
		var newCam = M3D.MOTEUR.getCamera(idCamera);
		if(newCam != -1)
			gameScene.setCamera(newCam);
	},
	
	
// CA MARCHE PAS AVEC DES PARENTS
/**
 * Méthode addCamera: Ajoute une caméra dans la scène.
 * @param: idObject: identifiant de la caméra à ajouter.
 *         tabCoord: tableau de taille 6, avec les coord positions et rotations de la caméra par rapport à son éventuel père !
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache la caméra sinon elle est rattaché à la scène.
 */
	M3D.MOTEUR.addCamera = function(idCamera, tabCoord, idParent){
		var cam = new GLGE.Camera();
		var transMat = GLGE.inverseMat4(GLGE.translateMatrix(tabCoord[0], tabCoord[1], tabCoord[2]));
		var rotMat = GLGE.rotateMatrix(tabCoord[3], tabCoord[4], tabCoord[5]);
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
 * Méthode removeCamera: supprime une caméra de la scène.
 * @param: idObject: identifiant de la caméra à supprimer.
 */
	M3D.MOTEUR.removeCamera = function(idCamera){
		var cam = M3D.MOTEUR.getCamera(idCamera);
		delete tabCamera[idCamera];
		cam.parent.removeChild(cam);
	},


	M3D.MOTEUR.translateCamera = function(idCamera,tabVector,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.translate(idCamera,tabVector,false);
		}else{
			M3D.MOTEUR.translate(idCamera,tabVector,false,idRef);
		}
	},

	
	M3D.MOTEUR.setPositionCamera = function(idCamera,tabPos,idRef){
		M3D.MOTEUR.setPosition(idCamera,tabPos,false,idRef);
	}, 

	M3D.MOTEUR.rotateCamera = function(idCamera,tabRot,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.rotate(idCamera,[-tabRot[0],-tabRot[1],-tabRot[2]],false);
		}else{
			M3D.MOTEUR.rotate(idCamera,tabRot,false,idRef);
		}
	},
	
	M3D.MOTEUR.setAngleCamera = function(idCamera,tabRot,idRef){
		M3D.MOTEUR.rotate(idCamera,tabRot,false,idRef);
	};

})(window.M3D);