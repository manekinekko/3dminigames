/**
 * Moteur3d de 3DWIGS: moteur_movement.js
 * Fichier contenant l'ensemble des fonctions liées au déplacement des objets.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

/**
 * Méthode translate: Translate un objet d'un vecteur donné dans un certain référentiel si il n'y a pas de collision (pour l'instant, teste de la collision uniquement à l'arrivée).
 * @param: id: identifiant de l'élément que l'on souhaite déplacer.
 *         tabVector: vecteur de 3 coordonnées x y z représentant le déplacement.
 *         testCollision: true pour tester les collisions, false pour les désactiver.
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu.
 * @return: Un tableau contenant des tableaux à 2 éléments des colladas en collision.
 */
	M3D.MOTEUR.translate = function(gObject,tabVector,testCollision,idRef){
		var id = gObject.id;
		var refTranslation = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],0);
		if(idRef == undefined){
			var modelRef = GLGE.identMatrix();
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
		}
		var object = M3D.MOTEUR.getObjectOrCamera(id);
		var modelParent = object.parent.getModelMatrix();
		var relRotRefSurParent = GLGE.mulMat4(GLGE.inverseMat4(modelParent),modelRef);
		var relTranslation = GLGE.mulMat4Vec4(relRotRefSurParent,refTranslation);	
		var modelMatrix = object.getLocalMatrix();
		var newModelMatrix = GLGE.mulMat4(GLGE.translateMatrix(relTranslation),modelMatrix);
		object.setStaticMatrix(newModelMatrix);
		M3D.MOTEUR.corrigeCamBug(object.childCam);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setStaticMatrix(modelMatrix);
			}
		}
		if(tab.length == 0){
			M3D.MOTEUR.updatePosition(gObject);
		}
        return tab;
	},


/**
 * Méthode setPosition: Place un objet à une certaine position dans un référentiel donné s'il n'y a pas de collision.
 * @param: id: identifiant de l'élément que l'on souhaite déplacer.
 *         tabPos : vecteur de 3 coordonnées x y z représentant la nouvelle position dans le nouveau référentiel.
 *         testCollision: true pour tester les collisions, false pour les désactiver.
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu.
 * @return: Un tableau contenant des tableaux à 2 éléments des colladas en collision.
 */
	M3D.MOTEUR.setPosition = function(gObject,tabPos,testCollision,idRef){
		var id = gObject.id;
		var relRefPosition = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
		if(idRef == undefined){
			var modelRef = GLGE.identMatrix();
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
		}
		var absolutePosition = GLGE.mulMat4Vec4(modelRef,relRefPosition);
		var object = M3D.MOTEUR.getObjectOrCamera(id);
		var currentPosition = M3D.MOTEUR.getRelativePos(object);
		var parentModelMatrix = object.parent.getModelMatrix();
		var relPosition = M3D.MOTEUR.vec4ToVec3(GLGE.mulMat4Vec4(GLGE.inverseMat4(parentModelMatrix),absolutePosition));
		var transPosition = M3D.MOTEUR.subNumVec3(relPosition,currentPosition);
		var modelMatrix = object.getLocalMatrix();
		var newModelMatrix = GLGE.mulMat4(GLGE.translateMatrix(transPosition),modelMatrix);          
        object.setStaticMatrix(newModelMatrix);
        M3D.MOTEUR.corrigeCamBug(object.childCam);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setStaticMatrix(modelMatrix);
			}
		}
		if(tab.length == 0){
			M3D.MOTEUR.updatePosition(gObject);
		}
        return tab;
	},


/**
 * Méthode rotate: Effectue une rotation dans un repère donné sur l'élément donné et vérifie la collision à l'arrivée seulement.
 * @param: id: identifiant de l'élément que l'on souhaite tourner.
 *         tabRot : vecteur de 3 coordonnées représentant la rotation a effectué.
 *         testCollision: true pour tester les collisions, false pour les désactiver.
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu.
 * @return: Un tableau contenant des tableaux à 2 éléments des colladas en collision.
 */
	M3D.MOTEUR.rotate = function(gObject,tabRot,testCollision,idRef){
		var id = gObject.id;
		var matRot = new GLGE.rotateMatrix(tabRot);
		if(idRef == undefined){	
			var modelRef = GLGE.identMatrix();
			var absRot = matRot;
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
			var absRot = GLGE.mulMat4(modelRef,GLGE.mulMat4(matRot,GLGE.inverseMat4(modelRef)));
		}
		var object = M3D.MOTEUR.getObjectOrCamera(id);
		var parentModelMatrix = object.parent.getModelMatrix();
		var relRot = GLGE.mulMat4(GLGE.inverseMat4(parentModelMatrix),absRot);
		GLGE.setMat4(relRot,0,3,0);
		GLGE.setMat4(relRot,1,3,0);
		GLGE.setMat4(relRot,2,3,0);	
		var currentModelMatrix = object.getLocalMatrix();
        var newModelMatrix = GLGE.mulMat4(currentModelMatrix,relRot);
        object.setStaticMatrix(newModelMatrix);
        M3D.MOTEUR.corrigeCamBug(object.childCam);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setStaticMatrix(currentModelMatrix);
			}
		}
		if(tab.length == 0){
			M3D.MOTEUR.updateOrientation(gObject);
		}
        return tab;
	},


/**
 * Méthode setAngle: Fixe les angles d'un élément donné par rapport au repère d'un référentiel et vérifie la collision à l'arrivée seulement
 * @param: id: identifiant de l'élément que l'on souhaite tourner
 *         tabRot : vecteur de 3 coordonnées représentant la rotation a effectué
 *         testCollision: true pour tester les collisions, false pour les désactiver.
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la donnée des angles sinon référentiel absolu.
 * @return: Un tableau contenant des tableaux à 2 éléments des colladas en collision.
 */
	M3D.MOTEUR.setAngle = function(gObject,tabRot,testCollision,idRef){
		var id = gObject.id;
		var matRot = new GLGE.rotateMatrix(tabRot);
		if(idRef == undefined){	
			var modelRef = GLGE.identMatrix();
			var absRot = matRot;
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
			var absRot = GLGE.mulMat4(modelRef,GLGE.mulMat4(matRot,GLGE.inverseMat4(modelRef)));
		}
		var object = M3D.MOTEUR.getObjectOrCamera(id);
		var currentModelMatrix = object.getLocalMatrix();
		var parentModelMatrix = object.parent.getModelMatrix();
		var relRot = GLGE.mulMat4(GLGE.inverseMat4(parentModelMatrix),absRot);
		GLGE.setMat4(relRot,0,3,0);
		GLGE.setMat4(relRot,1,3,0);
		GLGE.setMat4(relRot,2,3,0);	
		var translateMatrix = GLGE.translateMatrix(M3D.MOTEUR.getRelativePos(object));
		var scaleMatrix = GLGE.scaleMatrix(M3D.MOTEUR.getRelativeScale(object));
        var newModelMatrix = GLGE.mulMat4(translateMatrix,GLGE.mulMat4(relRot,scaleMatrix));
        object.setStaticMatrix(newModelMatrix);
        M3D.MOTEUR.corrigeCamBug(object.childCam);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setStaticMatrix(currentModelMatrix);
			}
		}
		if(tab.length == 0){
			M3D.MOTEUR.updateOrientation(gObject);
		}
        return tab;
	},

/**
 * Méthode mulSscale: Multiplie l'échelle d'un objet par les coefficients donnés.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   coefScale : tableau de 3 coordonnées représentant les coefficients par lesquels multipliés les coefficients actuels
 *         testCollision: true pour tester les collisions, false pour les désactiver.
 * @return: Un tableau contenant des tableaux à 2 éléments des colladas en collision.
 */
	M3D.MOTEUR.mulScale = function (gObject,coefScale,testCollision){
		var id = gObject.id;
		var object = M3D.MOTEUR.getObjectOrCamera(id);
		var currentModelMatrix = object.getLocalMatrix();
		var modelMatrix = GLGE.mulMat4(currentModelMatrix,GLGE.scaleMatrix(coefScale));	
		object.setStaticMatrix(modelMatrix);
		M3D.MOTEUR.corrigeCamBug(object.childCam);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setStaticMatrix(currentModelMatrix);
			}
		}
		if(tab.length == 0){
			M3D.MOTEUR.updateScale(gObject);
		}
        return tab;
	},
	
/**
 * Méthode setScale: Définit une nouvelle échelle d'un objet par les coefficients donnés.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   coefScale : tableau de 3 coordonnées représentant la nouvelle échelle
 *         testCollision: true pour tester les collisions, false pour les désactiver.
 * @return: Un tableau contenant des tableaux à 2 éléments des colladas en collision.
 */
	M3D.MOTEUR.setScale = function (gObject,coefScale,testCollision){
		var id = gObject.id;
		var object = M3D.MOTEUR.getObjectOrCamera(id);
		var currentScale = GLGE.scaleMatrix(M3D.MOTEUR.getRelativeScale(object));
		var currentModelMatrix = object.getLocalMatrix();
		var newScale = GLGE.scaleMatrix(coefScale);
		var modelMatrix = GLGE.mulMat4(currentModelMatrix,GLGE.mulMat4(GLGE.inverseMat4(currentScale),newScale));
		object.setStaticMatrix(modelMatrix);
		M3D.MOTEUR.corrigeCamBug(object.childCam);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setStaticMatrix(currentModelMatrix);
			}
		}
		if(tab.length == 0){
			M3D.MOTEUR.updateScale(gObject);
		}
        return tab;
	};

})(window.M3D);