/**
 * Moteur3d de 3DWIGS: moteur_movement.js
 * Fichier contenant l'ensemble des fonctions liées au déplacement des objets.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 
 
(function(M3D){

/**
 * Méthode translate: Vérifie la collision sur tout le vecteur de déplacement.
 * @param: id: identifiant de l'élement que l'on souhaite déplacer
 *         tabVector: vecteur de 3 coordornées x y z représentant le déplacement
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.translate = function(id,tabVector,idRef){
        if(idRef == null){
                var matrixRef = GLGE.identMatrix();
        }else{
                var matrixRef = tabObject[idRef].getRotMatrix();
        }
        var vectorTranslate = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
        var absoluteTranslation = GLGE.mulMat4Vec4(matrixRef,vectorTranslate);          
        
        tab = M3D.MOTEUR.liveCollision(id);
        if(tab.length != 0) return tab;
                
        tabObject[id].setLoc(absoluteTranslation[0]+parseFloat(tabObject[id].getLocX()),
                                absoluteTranslation[1]+parseFloat(tabObject[id].getLocY()),
                                absoluteTranslation[2]+parseFloat(tabObject[id].getLocZ()));
        
        return [];
	},


/**
 * Méthode setPosition: Déplace l'élément à la position donnée et vérifie la collision à l'arrivée seulement
 * @param: id: identifiant de l'élément que l'on souhaite déplacer
 *         tabPos : vecteur de 3 coordornées x y z représentant la nouvelle position
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setPosition = function(id,tabPos,idRef){
        if(idRef == null){
                var matrixRef = GLGE.identMatrix();
        }else{
                var matrixRef = tabObject[idRef].getModelMatrix();
        }
        var vectorPos = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
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
	},


/**
 * Méthode rotate: Effectue une rotation sur l'élément donné et vérifie la collision à l'arrivée seulement
 * @param: id: identifiant de l'élément que l'on souhaite déplacer
 *         tabRot : vecteur de 3 coordornées représentant la rotation a effectué
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.rotate = function(id,tabRot,idRef){
        if(idRef == null){
                var matrixRef = GLGE.identMatrix();
        }else{
                var matrixRef = tabObject[idRef].getModelMatrix();
        }
        var vectorRot = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
        var absoluteRotation = GLGE.mulMat4Vec4(matrixRef,vectorRot);
        var matrixObject = tabObject[id].getModelMatrix();
        var currentRelativeRotation = GLGE.Vec4(tabObject[id].getRotX(),tabObject[id].getRotY(),tabObject[id].getRotZ(),1);
        var currentAbsoluteRotation = GLGE.mulMat4Vec4(matrixObject,currentRelativeRotation);
        var newAbsoluteRotation = GLGE.addMat4(currentAbsoluteRotation,absoluteRotation);
        var newRelativeRotation = GLGE.mulMat4Vec4(GLGE.inverseMat4(matrixObject),newAbsoluteRotation);
        
        tab = M3D.MOTEUR.liveCollision(id);
        if(tab.length != 0) return tab;
                
        tabObject[id].setRot(GLGE.get1basedVec4(newRelativeRotation,1),
                                GLGE.get1basedVec4(newRelativeRotation,2),
                                GLGE.get1basedVec4(newRelativeRotation,3));
                                                                
        return [];
	},


/**
 * Méthode setAngle: Change la rotation d'un objet par rapport à un référentiel
 * @param: id: identifiant de l'élément que l'on souhaite déplacer
 *         tabRot : vecteur de 3 coordornées représentant la rotation a effectué
 *         [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.setAngle = function(id,tabRot,idRef){
        if(idRef == null){
                var matrixRef = GLGE.identMatrix();
        }else{
                var matrixRef = tabObject[idRef].getModelMatrix();
        }
        var vectorRot = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
        var newAbsoluteRotation = GLGE.mulMat4Vec4(matrixRef,vectorRot);
        var matrixObject = tabObject[id].getModelMatrix();
        var newRelativeRotation = GLGE.mulMat4Vec4(GLGE.inverseMat4(matrixObject),newAbsoluteRotation);
     
        tab = M3D.MOTEUR.liveCollision(id);
        if(tab.length != 0) return tab;
                
        tabObject[id].setRot(GLGE.get1basedVec4(newRelativeRotation,1),
                                GLGE.get1basedVec4(newRelativeRotation,2),
                                GLGE.get1basedVec4(newRelativeRotation,3));
                                                                
        return [];
	},


/**
 * Méthode rescaleObject: Multiplie l'échelle d'un objet par le coefficient donné.
 * @param: id: identifiant de l'objet que l'on souhaite redimensionner
 *	 	   tabRot : coefficient par lequel multiplié la taille de l'objet
 * @return: Un tableau contenant les identifiants des objets en collision avec l'objet id sinon un tableau vide.
 */
	M3D.MOTEUR.rescaleObject = function (id,coefScale){
		var scale = tabObject[id].getScale();
	
		tab = M3D.MOTEUR.liveCollision(id);
		if(tab.length != 0) return tab;
	
		tabObject[id].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
		return [];
	};


/**
 * BEUGGER
 *//*
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
	

})(window.M3D);