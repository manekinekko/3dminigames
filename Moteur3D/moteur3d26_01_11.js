// version 26/01/11

attributs : scene,renderer

/* Méthode initialisation.
 * Param: xmlDoc: fichier xml contenant la scène à charger à l'initialisation.
 */
initialisation = function(xmlDoc){
	var doc = new GLGE.Document();
	doc.onLoad = function(){
		var gameRenderer = new GLGE.Renderer(document.getElementById('canvas'));
		gameScene = new GLGE.Scene();
		gameScene = doc.getElement("mainscene");
		gameRenderer.setScene(gameScene);
	}
	doc.load(xmlDoc);
}

***************** autres fonctions

/* Méthode getObject.
 * Param: idObject: identifiant de l'objet que l'on veut récupérer
 * Return: l'objet sinon -1
 */
getObject = function(idObject){
    var objects = scene.getObjects();
    for (var i = 0; !found && i < objects.length; i++) {
		if (objects[i].uid == idObject) return objects[i];
	}  alert("The object named "+idObject+" doesn't exist in the scene."); return -1;
}

***************** OBJETS DANS LE GRAPHE

/* Méthode addObject.
 * Param: idObject: identifiant de l'objet à ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
addObject = function(idObject,urlObject,tabCoord, idParent){
		var newGroup = new GLGE.Group(idObject);
		newGroup.setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		newGroup.setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		newGroup.setScale(tabCoord[6]);
		var newObject = new GLGE.Collada();
		newObject.setDocument(colladaFile);
		newGroup.addChild(newObject);
		if(idParent == null) gameScene.addChild(newGroup);
		else{ 
			var obj = this.getObject(idParent);
			if(obj != -1) obj.addChild(newGroup); 
		}
		// verifie la collision !
},

/* Méthode removeObject.
 * Param: idObject: identifiant de l'objet à supprimer de la scène.
 * WARNING: les fils de l'objet seront supprimés
 */
removeObject = function(idObject){
	var obj = this.getObject(idObject);
	if(obj != -1) obj.parent.removeChild(obj);
},

/* Méthode changeParentObject.
 * Param: idObject: identifiant de l'objet dont on veut changer le parent
 *		  idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet
 * WARNING: les fils de l'objet changeront aussi de parent
 */
changeParentObject = function(idObject,idNewParent){
	var obj = this.getObject(idObject);
	var newParent = this.getObject(idNewParent);
	obj.parent = newParent;
}

######## dans le futur .... ou pas
removeObject en rattachant ces fils au dessus
changeParent en rattachant ces fils au dessus

***************** DEPLACEMENT DES OBJETS
// a verifie si c'est bien model matrix ou son inverse ...


/* Méthode translateObject. Vérifie la collision sur tout le vecteur de déplacement.
 * Param: idObject: identifiant de l'objet que l'on souhaite déplacer
 *		  tabVector: vecteur de 3 coordornées x y z représentant le déplacement
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu
 */
// NON TESTE
translateObject = function(idObject,tabVector,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = this.getObject(idRef).getModelMatrix();
	}
	var V = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision sur toute la trajectoire
	this.getObject(idObject).setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,1));
}

/* Méthode setPositionObject. Déplace l'objet à la position donnée et vérifie la collision à l'arrivée seulement
 * Param: idObject: identifiant de l'objet que l'on souhaite déplacer
 *		  tabPos : vecteur de 3 coordornées x y z représentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 */
// NON TESTE
setPositionObject = function(idObject,tabPos,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = this.getObject(idRef).getModelMatrix();
	}
	var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision à l'arrivée
	this.getObject(idObject).setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,1));
}

/* Méthode rotateObject. Effectue une rotation sur l'objet donné et vérifie la collision à l'arrivée seulement
 * Param: idObject: identifiant de l'objet que l'on souhaite déplacer
 *		  tabRot : vecteur de 3 coordornées représentant la rotation a effectué
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu
 */
// NON TESTE
rotateObject = function(idObject,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = this.getObject(idRef).getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision à l'arrivée
	this.getObject(idObject).setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,1));
}


/* Méthode rescaleObject. Multiplie l'échelle d'un objet par le coefficient donné.
 * Param: idObject: identifiant de l'objet que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multiplié la taille de l'objet
 */
 // NON TESTE
rescaleObject = function (idObject,coefScale){
// vérifié la collision
	this.getObject(idObject).setScale(this.getObject(idObject).getScale*coefScale);
}


######## dans le futur .... ou pas
combiner tout ca

***************** COLLISION


// MERCI JEROME

***************** FORCE


// A VENIR


***************** CAMERA

