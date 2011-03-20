/**
 * Moteur3d de 3DWIGS: moteur_movement.js
 * Fichier contenant l'ensemble des fonctions li�es au d�placement des objets.
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

/**
 * M�thode translate: Translate un objet d'un vecteur donn� dans un certain r�f�rentiel
 * @param: id: identifiant de l'�l�ment que l'on souhaite d�placer
 *         tabVector: vecteur de 3 coordonn�es x y z repr�sentant le d�placement
 *         testCollision: true pour tester les collisions, false pour les d�sactiver
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel au d�placement sinon r�f�rentiel absolu
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
		var modelMatrix = object.getModelMatrix();
		var newModelMatrix = GLGE.mulMat4(GLGE.translateMatrix(relTranslation),modelMatrix);
		object.setStaticMatrix(newModelMatrix);
		
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
 * M�thode setPosition: Place un objet � une certaine position dans un r�f�rentiel donn�
 * @param: id: identifiant de l'�l�ment que l'on souhaite d�placer
 *         tabPos : vecteur de 3 coordonn�es x y z repr�sentant la nouvelle position dans le nouveau r�f�rentiel
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la nouvelle position sinon r�f�rentiel absolu
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
		var currentPosition = M3D.MOTEUR.getRelativePos(object);
		var parentModelMatrix = object.parent.getModelMatrix();
		var relPosition = M3D.MOTEUR.vec4ToVec3(GLGE.mulMat4Vec4(GLGE.inverseMat4(parentModelMatrix),absolutePosition));
		var transPosition = M3D.MOTEUR.subNumVec3(relPosition,currentPosition);
		
		var modelMatrix = GLGE.mulMat4(GLGE.translateMatrix(transPosition),GLGE.getModelMatrix());
              
        object.setStaticMatrix(modelMatrix);
        
        return [];
	},


/**
 * M�thode rotate: Effectue une rotation sur l'�l�ment donn� et v�rifie la collision � l'arriv�e seulement
 * @param: id: identifiant de l'�l�ment que l'on souhaite tourner
 *         tabRot : vecteur de 3 coordonn�es repr�sentant la rotation a effectu�
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.rotate = function(id,tabRot,idRef){
		var matRot = new GLGE.rotateMatrix(tabRot);
		if(idRef == null){	
			var modelRef = GLGE.identMatrix();
			var absRot = matRot;
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
			var absRot = GLGE.mulMat4(modelRef,GLGE.mulMat4(matRot,GLGE.inverseMat4(modelRef)));
		}
		var object = M3D.MOTEUR.getObject(id);
		var parentModelMatrix = object.parent.getModelMatrix();
		var relRot = GLGE.mulMat4(GLGE.inverseMat4(parentModelMatrix),absRot);
		GLGE.setMat4(relRot,0,3,0);
		GLGE.setMat4(relRot,1,3,0);
		GLGE.setMat4(relRot,2,3,0);	
		var currentModelMatrix = object.getModelMatrix();
        var modelMatrix = GLGE.mulMat4(currentModelMatrix,relRot);
        object.setStaticMatrix(modelMatrix);
        return [];
	},


/**
 * M�thode setAngle: Effectue une rotation sur l'�l�ment donn� et v�rifie la collision � l'arriv�e seulement
 * @param: id: identifiant de l'�l�ment que l'on souhaite tourner
 *         tabRot : vecteur de 3 coordonn�es repr�sentant la rotation a effectu�
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setAngle = function(id,tabRot,idRef){
		var matRot = new GLGE.rotateMatrix(tabRot);
		if(idRef == null){	
			var modelRef = GLGE.identMatrix();
			var absRot = matRot;
		}else{
			var objectRef = M3D.MOTEUR.getObjectOrCamera(idRef);
			var modelRef = objectRef.getModelMatrix();
			var absRot = GLGE.mulMat4(modelRef,GLGE.mulMat4(matRot,GLGE.inverseMat4(modelRef)));
		}
		var object = M3D.MOTEUR.getObject(id);
		var parentModelMatrix = object.parent.getModelMatrix();
		var relRot = GLGE.mulMat4(GLGE.inverseMat4(parentModelMatrix),absRot);
		GLGE.setMat4(relRot,0,3,0);
		GLGE.setMat4(relRot,1,3,0);
		GLGE.setMat4(relRot,2,3,0);	
		var translateMatrix = GLGE.translateMatrix(M3D.MOTEUR.getRelativePos(object));
		var scaleMatrix = GLGE.scaleMatrix(M3D.MOTEUR.getRelativeScale(object));
        var modelMatrix = GLGE.mulMat4(translateMatrix,GLGE.mulMat4(relRot,scaleMatrix));
        object.setStaticMatrix(modelMatrix);
        return [];
	},

/**
 * M�thode mulSscaleObject: Multiplie l'�chelle d'un objet par les coefficients donn�s.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   coefScale : tableau de 3 coordonn�es repr�sentant les coefficients par lesquels multipli�s les coefficients actuels
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.mulScale = function (id,coefScale){
		var object = M3D.MOTEUR.getObject(id);
		var currentModelMatrix = object.getModelMatrix();
		var modelMatrix = GLGE.mulMat4(currentModelMatrix,GLGE.scaleMatrix(coefScale));	
		object.setStaticMatrix(modelMatrix);
		return [];
	},
	
/**
 * M�thode setScaleObject: D�finit une nouvelle �chelle d'un objet par les coefficients donn�s.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   coefScale : tableau de 3 coordonn�es repr�sentant la nouvelle �chelle
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setScale = function (id,coefScale){
		var object = M3D.MOTEUR.getObject(id);
		var currentScale = GLGE.scaleMatrix(M3D.MOTEUR.getRelativeScale(object));
		var currentModelMatrix = object.getModelMatrix();
		var newScale = GLGE.scaleMatrix(coefScale);
		var modelMatrix = GLGE.mulMat4(currentModelMatrix,GLGE.mulMat4(GLGE.inverseMat4(currentScale),newScale));
		object.setStaticMatrix(modelMatrix);
		return [];
	};

})(window.M3D);


/**
 * M�thode trajectory: D�place l'�l�ment avec une vitesse V dans une direction donn�e. La trajectoire est influenc�e par la gravit�.
 * @param: id: identifiant de l'�l�ment que l'on souhaite d�placer
 *		   speed: vitesse de d�placement de l'objet.
 *         direction : tableau de 3 coordonn�es x y z repr�sentant la direction ou doit aller l'objet.
 *         [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la nouvelle position sinon r�f�rentiel absolu
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
	
/** M�thode launchProjectile
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
	