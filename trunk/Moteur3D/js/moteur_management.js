/**
 * Moteur3d de 3DWIGS: moteur_management.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des objets.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){
 
/**
 * Méthode addObject: Ajoute un objet dans la scène.
 * @param: gObject: object de la grammaire à ajouter
 *         tabCoord: tableau de taille 9, avec les coord positions, rotations et taille de l'objet par rapport à son éventuel père !
 *		   testCollision: test des collisions activé ou désactivé
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon l'objet est rattaché à la scène.
 */
	M3D.MOTEUR.addObject = function(gObject, testCollision, idParent){
		var idObject = gObject.id;
		var urlObject = gObject.url
		var group = new GLGE.Group();
		group.id = idObject;
		var object = new GLGE.Collada();
		var idCollada = "#"+idObject;
		object.id = idCollada;
		object.setDocument(urlObject);
		group.addChild(object);
		group.childCam = [];
		var transMat = GLGE.translateMatrix(gObject.posX, gObject.posY, gObject.posZ);
		var rotMat = GLGE.rotateMatrix(gObject.orX, gObject.orY, gObject.orZ);
		var scaleMat = GLGE.scaleMatrix(gObject.sizeX, gObject.sizeY, gObject.sizeZ);
		var localMatrix = GLGE.mulMat4(transMat,GLGE.mulMat4(rotMat,scaleMat));
		if(idParent == null){
			var parent = gameScene;
		} else {
			var parent = M3D.MOTEUR.getObject(idParent);
		}
		parent.addChild(group);
		group.setStaticMatrix(localMatrix);
		var tab = [];
		if(testCollision){
			tab = M3D.MOTEUR.testCollision(object);
		}
		if(tab.length == 0){
			tabObject[idObject] = group;
			tabObject[idCollada] = object;
			tabIdObject.push(idCollada);
		}else{
			parent.removeChild(group);
		}
		if(tab.length == 0){
			M3D.MOTEUR.updatePosition(gObject);
			M3D.MOTEUR.updateOrientation(gObject);
			M3D.MOTEUR.updateScale(gObject);
		}
        return tab;
	},
	
/**
 * Méthode addGroup: Ajoute un groupe dans la scène.
 * @param: idObject: identifiant du groupe à ajouter.
 *         tabCoord: tableau de taille 9, avec les coord positions, rotations et taille du groupe par rapport à son éventuel père !
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache le groupe sinon il est rattaché à la scène.
 */
	M3D.MOTEUR.addGroup = function(idGroup, tabCoord, idParent){
		var group = new GLGE.Group();
		group.id = idGroup;
		group.childCam = [];
		var transMat = GLGE.translateMatrix(tabCoord[0], tabCoord[1], tabCoord[2]);
		var rotMat = GLGE.rotateMatrix(tabCoord[3], tabCoord[4], tabCoord[5]);
		var scaleMat = GLGE.scaleMatrix(tabCoord[6], tabCoord[7], tabCoord[8]);
		var localMatrix = GLGE.mulMat4(transMat,GLGE.mulMat4(rotMat,scaleMat));
		group.setStaticMatrix(localMatrix);
		if(idParent == null){
			var parent = gameScene;
		} else {
			var parent = M3D.MOTEUR.getObject(idParent);
		}
		parent.addChild(group);
		tabObject[idGroup] = group;
	},

/**
 * Méthode removeObject: supprime un élément (collada ou groupe) dans la scène ainsi que tous ces descendants.
 * @param: idObject: identifiant de l'objet à supprimer.
 */
	M3D.MOTEUR.removeObject = function(idObject){
		var object = M3D.MOTEUR.getObject(idObject);
		var allChild = M3D.MOTEUR.getAllChildren(idObject);
		for(var i = 0 ; i<allChild[0].length ; i++){
			delete tabObject[allChild[0][i]];
		}
		for(var i = 0 ; i<allChild[1].length ; i++){
			tabIdObject.splice(M3D.MOTEUR.getIndexOfCollada(allChild[1][i]),1);
			delete tabObject[allChild[1][i]];
		}		
		for(var i = 0 ; i<allChild[2].length ; i++){
			delete tabCamera[allChild[2][i]];
		}
		object.parent.removeChild(object);
	},

/**
 * Méthode changeParent: change le père d'un élément (groupe, caméra ou collada).
 * @param: gObject: objet de la grammaire dont changer le père.
 *         idNewParent: identifiant de l'élément (groupe ou collada) nouveau père.
 */
	M3D.MOTEUR.changeParent = function(gObject,idNewParent){
		var idObject = gObject.id;
		var object = M3D.MOTEUR.getObjectOrCamera(idObject);
		var modelMatrix = object.getModelMatrix();
		if(idNewParent == null){
			var newParent = gameScene;
		}else{
			var newParent = M3D.MOTEUR.getObject(idNewParent);
		}
		var newParentModelMatrix = newParent.getModelMatrix();
		var newLocalMatrix = GLGE.mulMat4(GLGE.inverseMat4(newParentModelMatrix),modelMatrix);
		if(this.parent)	object.parent.removeChild(object);
		newParent.addChild(object);
		object.setStaticMatrix(newLocalMatrix);
		object.getModelMatrix();
		M3D.MOTEUR.updatePosition(gObject);
		M3D.MOTEUR.updateOrientation(gObject);
		M3D.MOTEUR.updateScale(gObject);
	};
	
})(window.M3D);
