/**
 * Moteur3d de 3DWIGS: moteur_camera.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des caméras.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

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
	

	M3D.MOTEUR.addCamera = function(idCamera, tabCoord, idParent){
		var cam = new GLGE.Camera();
		cam.setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		cam.setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		cam.setScale(tabCoord[6]);

		if(idParent == null){
			var parent = gameScene
		}else{
			var parent = M3D.MOTEUR.getObject(idParent);
		}
		parent.addChild(cam);
		tabCamera[idCamera] = cam;
	},

	M3D.MOTEUR.removeCamera = function(idCamera){
		var cam = M3D.MOTEUR.getCamera(idCamera);
		delete tabCamera[idCamera];
		cam.parent.removeChild(cam);
	},
	
	M3D.MOTEUR.translateCamera = function(idCamera,tabVector,idRef){
		var refTranslation = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],0);
		if(idRef == null){
			var modelRef = GLGE.identMatrix();
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
		}
		var object = M3D.MOTEUR.getCamera(idCamera);
		if(object.parent != undefined){
			var modelParent = object.parent.getModelMatrix();
			var relRotRefSurParent = GLGE.mulMat4(GLGE.inverseMat4(modelParent),modelRef);
		}else{
			var relRotRefSurParent = modelRef;
		}
		var relTranslation = GLGE.mulMat4Vec4(relRotRefSurParent,refTranslation);
		var currentRelPosition = M3D.MOTEUR.getRelativePos(object);
		var newRelPosition = M3D.MOTEUR.addNumVec3(currentRelPosition,relTranslation);	
              
        object.setLoc(newRelPosition[0],newRelPosition[1],newRelPosition[2]);
	},

	
	M3D.MOTEUR.setPositionCamera = function(idCamera,tabPos,idRef){
		var relRefPosition = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
		if(idRef == null){
			var modelRef = GLGE.identMatrix();
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
		}
		var absolutePosition = M3D.MOTEUR.vec4ToVec3(GLGE.mulMat4Vec4(modelRef,relRefPosition));
		var object = M3D.MOTEUR.getCamera(idCamera);
		if(object.parent == undefined){
			var parentPosition = GLGE.Vec3(0,0,0);
			var absRotParent = GLGE.identMatrix();
		}else{
			var parentPosition = M3D.MOTEUR.getAbsolutePos(object.parent);
			var absRotParent = object.parent.getModelMatrix();
		}
		var newRelativeNorotPosition = M3D.MOTEUR.subNumVec3(absolutePosition,parentPosition);
		var newRelPosition = M3D.MOTEUR.vec4ToVec3(GLGE.mulMat4Vec4(GLGE.inverseMat4(absRotParent),M3D.MOTEUR.vec3ToVec4(newRelativeNorotPosition,0)));
		
        object.setLoc(newRelPosition[0],newRelPosition[1],newRelPosition[2]);
	}, 
	

	M3D.MOTEUR.rotateCamera = function(idCamera,tabRot){
		var object = M3D.MOTEUR.getCamera(idCamera);
		var currentRelRot = M3D.MOTEUR.getRelativeRot(object);
		var vecRot = new GLGE.Vec3(tabRot[0],tabRot[1],tabRot[2]);
		var newRelRot = M3D.MOTEUR.addNumVec3(currentRelRot,vecRot);      
        object.setRot(newRelRot[0],newRelRot[1],newRelRot[2]);
	}
	
	M3D.MOTEUR.setAngleCamera = function(idCamera,tabRot){
		var object = M3D.MOTEUR.getCamera(idCamera);
        object.setRot(tabRot[0],tabRot[1],tabRot[2]);
	};

})(window.M3D);