/**
 * Moteur3d de 3DWIGS: moteur_movement.js
 * Fichier contenant l'ensemble des fonctions liées au déplacement des objets.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

/**
 * Méthode translate: Translate un objet d'un vecteur donné dans un certain référentiel
 * @param: id: identifiant de l'élément que l'on souhaite déplacer
 *         tabVector: vecteur de 3 coordonnées x y z représentant le déplacement
 *         testCollision: true pour tester les collisions, false pour les désactiver
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.translate = function(id,tabVector,testCollision,idRef){
		var refTranslation = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],0);
		if(idRef == null){
			var modelRef = GLGE.identMatrix();
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
		}
		var object = M3D.MOTEUR.getObject(id);
		var modelParent = object.parent.getModelMatrix();
		var relRotRefSurParent = GLGE.mulMat4(GLGE.inverseMat4(modelParent),modelRef);
		var relTranslation = GLGE.mulMat4Vec4(relRotRefSurParent,refTranslation);
		var currentRelPosition = M3D.MOTEUR.getRelativePos(object);
		var newRelPosition = M3D.MOTEUR.addNumVec3(currentRelPosition,relTranslation);	

        object.setLoc(newRelPosition[0],newRelPosition[1],newRelPosition[2]);

		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
			if(tab.length > 0){
				object.setLoc(currentRelPosition[0],currentRelPosition[1],currentRelPosition[2]);
			}
		}
		
        return tab;
	},


/**
 * Méthode setPosition: Place un objet à une certaine position dans un référentiel donné
 * @param: id: identifiant de l'élément que l'on souhaite déplacer
 *         tabPos : vecteur de 3 coordonnées x y z représentant la nouvelle position dans le nouveau référentiel
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setPosition = function(id,tabPos,idRef){
		var relRefPosition = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
		if(idRef == null){
			var modelRef = GLGE.identMatrix();
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
		}
		var absolutePosition = M3D.MOTEUR.vec4ToVec3(GLGE.mulMat4Vec4(modelRef,relRefPosition));
		var object = M3D.MOTEUR.getObject(id);
		var parentPosition = M3D.MOTEUR.getAbsolutePos(object.parent);
		var newRelativeNorotPosition = M3D.MOTEUR.subNumVec3(absolutePosition,parentPosition);
		var absRotParent = object.parent.getModelMatrix();
		var newRelPosition = M3D.MOTEUR.vec4ToVec3(GLGE.mulMat4Vec4(GLGE.inverseMat4(absRotParent),M3D.MOTEUR.vec3ToVec4(newRelativeNorotPosition,0)));
		
		//tab = M3D.MOTEUR.liveCollision(id);
        //if(tab.length != 0) return tab;
              
        object.setLoc(newRelPosition[0],newRelPosition[1],newRelPosition[2]);
        
        return [];
	},


/**
 * Méthode rotate: Effectue une rotation sur l'élément donné et vérifie la collision à l'arrivée seulement
 * @param: id: identifiant de l'élément que l'on souhaite tourner
 *         tabRot : vecteur de 3 coordonnées représentant la rotation a effectué
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.rotate = function(id,tabRot){
		var object = M3D.MOTEUR.getObject(id);
		var currentRelRot = M3D.MOTEUR.getRelativeRot(object);
		var vecRot = new GLGE.Vec3(tabRot[0],tabRot[1],tabRot[2]);
		var newRelRot = M3D.MOTEUR.addNumVec3(currentRelRot,vecRot);
		
        //tab = M3D.MOTEUR.liveCollision(id);
        //if(tab.length != 0) return tab;
              
        object.setRot(newRelRot[0],newRelRot[1],newRelRot[2]);
        
        return [];
	},


/**
 * Méthode setAngle: Effectue une rotation sur l'élément donné et vérifie la collision à l'arrivée seulement
 * @param: id: identifiant de l'élément que l'on souhaite tourner
 *         tabRot : vecteur de 3 coordonnées représentant la rotation a effectué
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setAngle = function(id,tabRot){
		var object = M3D.MOTEUR.getObject(id);
		
        //tab = M3D.MOTEUR.liveCollision(id);
        //if(tab.length != 0) return tab;
              
        object.setRot(tabRot[0],tabRot[1],tabRot[2]);
        
        return [];
	},

/**
 * Méthode mulSscaleObject: Multiplie l'échelle d'un objet par les coefficients donnés.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   coefScale : tableau de 3 coordonnées représentant les coefficients par lesquels multipliés les coefficients actuels
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.mulScale = function (id,coefScale){
		var object = M3D.MOTEUR.getObject(id);
		var currentScale = M3D.MOTEUR.getRelativeScale(object);
		var vecScale = GLGE.Vec3(coefScale[0],coefScale[1],coefScale[2]);
		var newScale = M3D.MOTEUR.mulNumVec3(currentScale,vecScale);
	
		//tab = M3D.MOTEUR.liveCollision(id);
		//if(tab.length != 0) return tab;
	
		object.setScale(newScale[0],newScale[1],newScale[2]);
		return [];
	},
	
/**
 * Méthode setScaleObject: Définit une nouvelle échelle d'un objet par les coefficients donnés.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   coefScale : tableau de 3 coordonnées représentant la nouvelle échelle
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setScale = function (id,coefScale){
		var object = M3D.MOTEUR.getObject(id);
		
		//tab = M3D.MOTEUR.liveCollision(id);
		//if(tab.length != 0) return tab;
	
		object.setScale(coefScale[0],coefScale[1],coefScale[2]);
		return [];
	};

})(window.M3D);


/**
 * Méthode trajectory: Déplace l'élément avec une vitesse V dans une direction donnée. La trajectoire est influencée par la gravité.
 * @param: id: identifiant de l'élément que l'on souhaite déplacer
 *		   speed: vitesse de déplacement de l'objet.
 *         direction : tableau de 3 coordonnées x y z représentant la direction ou doit aller l'objet.
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 *
	M3D.MOTEUR.trajectory = function(id,speed,directory,idRef){
        if(idRef == null){
                var matrixRef = GLGE.identMatrix();
        }else{
                var matrixRef = tabObject[idRef].getModelMatrix();
        }
		
		posX = directory[0]*speed;
		posY = directory[1]*speed + gravity;
		posZ = directory[2]*speed;
				
        var vectorPos = GLGE.Vec4(posX,posY,posZ,1);
        var newAbsolutePosition = GLGE.mulMat4Vec4(matrixRef,vectorPos);
                
        var matrixObject = tabObject[id].getModelMatrix();
        var absolutePosition = GLGE.mulMat4Vec4(matrixObject,GLGE.Vec4(tabObject[id].getLocX(),tabObject[id].getLocY(),tabObject[id].getLocZ(),0));
                
        var translation = GLGE.subVec4(newAbsolutePosition,absolutePosition);
        
        tab = M3D.MOTEUR.liveCollision(id);
        if(tab.length != 0) return tab;

        //alert('model'+tabObject[id].getModelMatrix()+'translation'+tabObject[id].getTranslateMatrix()+'rotation'+tabObject[id].getRotMatrix())
                
        tabObject[id].setLoc(translation[0]+parseFloat(tabObject[id].getLocX()),
                                translation[1]+parseFloat(tabObject[id].getLocY()),
                                translation[2]+parseFloat(tabObject[id].getLocZ()));
                
        return [];
	},*/
	
/** Méthode launchProjectile
 *
	M3D.MOTEUR.launchProjectile = function(id, idObj, tabVector, idRef){
		if(idRef == null){
			var matrixRef = GLGE.identMatrix();
		}else{
			var matrixRef = tabObject[idRef].getModelMatrix();
		}
		var vectorTranslate = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
		var absoluteTranslation = GLGE.mulMat4Vec4(matrixRef,vectorTranslate);          
    
		var obj = M3D.MOTEUR.getObject(id);	
		var col = M3D.MOTEUR.collisionBoxBox(id, idObj);

		if(col && obj.parent.id != "mainscene"){
			var pos = tabObject[id].parent.getPosition();
			var rot = tabObject[id].parent.getRotation();
		//	var scale = tabObject[id].getScale();
			newTab = M3D.MOTEUR.changeParentObject(id);
			tabObject = newTab[0];
			tabIdObejct = newTab[1];
			tabObject[id].setLoc(pos.x, pos.y, pos.z);
			tabObject[id].setRot(rot.x, rot.y, rot.z);
		//	tabObject[id].setScale(scale.x, scale.y, scale.z);
		} else if(col && obj.parent.id == "mainscene") { 
		} else {
			var tab = M3D.MOTEUR.liveCollision(id); 
			if( tab.length != 0 ) return [true, tab];
		}

		tabObject[id].setLoc(absoluteTranslation[0]+parseFloat(tabObject[id].getLocX()),
								absoluteTranslation[1]+parseFloat(tabObject[id].getLocY()),
								absoluteTranslation[2]+parseFloat(tabObject[id].getLocZ()));
	
		return [false, tabObject[id], tabObject, tabIdObject];
	};*/
	