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

TranslateObject(idObject,tabVector,ref)
ref : argument optionnel


SetPositionObject(idObject,tabPos,ref)
// teleportation pshhhhhhhhh


RotateObject(idObject,tabRot,ref)


RescaleObject(idObject,newScale)



######## dans le futur .... ou pas
combiner tout ca

***************** COLLISION


// MERCI JEROME

***************** FORCE


// A VENIR


***************** CAMERA

