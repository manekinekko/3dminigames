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
 * (si la cam�ra n'existe pas, aucun changement ne s'effectue).
 * @param: idCamera: identifiant de la cam�ra que l'on souhaite activer.
 */
	M3D.MOTEUR.activeCamera = function(idCamera){
		var newCam = M3D.MOTEUR.getCamera(idCamera);
		if(newCam != -1)
			gameScene.setCamera(newCam);
	},
	
	
// CA NE MARCHE PAS BIEN AVEC DES PARENTS !
/**
 * M�thode addCamera: ajoute une cam�ra dans la sc�ne.
 * @param: gCamera: cam�ra de la grammaire (avec l'attribut id comme identfiant et posX, posY, posZ, orX, orY et orZ comme attributs de positions et orientations).
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache la cam�ra sinon elle est rattach�e � la sc�ne.
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
		M3D.MOTEUR.resetChildren(M3D.MOTEUR.getCamera(idCamera));
	},

/**
 * M�thode removeCamera: supprime une cam�ra de la sc�ne si elle n'est pas active.
 * @param: idCamera: identifiant de la cam�ra � supprimer.
 * @return: true si la cam�ra a �t� supprim�e, false sinon.
 */
	M3D.MOTEUR.removeCamera = function(idCamera){
		var bool = (gameScene.getCamera().id != idCamera);
		if(bool){
			var cam = M3D.MOTEUR.getCamera(idCamera);
			delete tabCamera[idCamera];
			cam.parent.removeChild(cam);
			M3D.MOTEUR.resetchildren(cam);
		}
		return bool;
	},

/**
 * M�thode translateCamera: translate une cam�ra d'un vecteur donn� dans un certain r�f�rentiel.
 * @param: gCamera: cam�ra de la grammaire que l'on souhaite d�placer.
 *         tabVector: vecteur de 3 coordonn�es x, y et z repr�sentant le d�placement.
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel au d�placement sinon r�f�rentiel absolu.
 */
	M3D.MOTEUR.translateCamera = function(gCamera,tabVector,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.translate(gCamera,tabVector,false);
		}else{
			M3D.MOTEUR.translate(gCamera,tabVector,false,idRef);
		}
	},

/**
 * M�thode setPositionCamera: place une cam�ra � une certaine position dans un r�f�rentiel donn�.
 * @param: gCamera: cam�ra de la grammaire que l'on souhaite d�placer.
 *         tabPos : vecteur de 3 coordonn�es x, y et z repr�sentant la nouvelle position dans le nouveau r�f�rentiel.
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la nouvelle position sinon r�f�rentiel absolu.
 */
	M3D.MOTEUR.setPositionCamera = function(gCamera,tabPos,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.setPosition(gCamera,tabPos,false);
		}else{
			M3D.MOTEUR.setPosition(gCamera,tabPos,false,idRef);
		}
	}, 

/**
 * M�thode rotateCamera: effectue une rotation dans un rep�re donn� sur la cam�ra donn�e.
 * @param: gCamera: cam�ra de la grammaire que l'on souhaite tourner.
 *         tabRot : vecteur de 3 coordonn�es repr�sentant la rotation � effectuer.
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la rotation sinon r�f�rentiel absolu.
 */
	M3D.MOTEUR.rotateCamera = function(gCamera,tabRot,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.rotate(gCamera,tabRot,false);
		}else{
			M3D.MOTEUR.rotate(gCamera,tabRot,false,idRef);
		}
	},
	
/**
 * M�thode setAngleCamera: fixe les angles d'une cam�ra donn�e par rapport au rep�re d'un r�f�rentiel.
 * @param: gCamera: cam�ra de la grammaire que l'on souhaite tourner.
 *         tabRot : vecteur de 3 coordonn�es repr�sentant la rotation � effectuer.
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la donn�e des angles sinon r�f�rentiel absolu.
 */
	// idem setAngle pour une cam�ra
	M3D.MOTEUR.setAngleCamera = function(gCamera,tabRot,idRef){
		if(idRef==undefined){
			M3D.MOTEUR.setAngle(gCamera,tabRot,false);
		}else{
			M3D.MOTEUR.setAngle(gCamera,tabRot,false,idRef);
		}
	},

	
	M3D.MOTEUR.fps = function(camera, object, dist, rot){
		cam = M3D.MOTEUR.getCamera(camera.id);
		cam.setLoc(object.posX+dist[0], object.posY+dist[1], object.posZ+dist[2]);
		// MARCHE PAS, getPosition() merde compl�tement je pense.
	/*	cam = M3D.MOTEUR.getCamera(camera.id);
		camPos = cam.getPosition();
		objet = M3D.MOTEUR.getObject(object.id);
		objPosX = objet.getLocX();
		objPosY = objet.getLocY();
		objPosZ = objet.getLocZ();
		obj = objet.getRotMatrix(); //(matrice 16 valeurs 4*4)
	
		posX = object.posX - obj[2];
		posY = object.posY - 20*obj[6];
		posZ = object.posZ - obj[10];
		
		cam.setLocX(posX);
		cam.setLocY(posY);
		cam.setLocZ(posZ);
		
		cam.setLookat([object.posX, object.posY, object.posZ]);		
		
		camera.posX = cam.getLocX();
		camera.posY = cam.getLocY();
		camera.posZ = cam.getLocZ();*/
	};
})(window.M3D);