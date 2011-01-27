// version 26/01/11

attributs : scene,renderer

/* M�thode initialisation.
 * Param: xmlDoc: fichier xml contenant la sc�ne � charger � l'initialisation.
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

/* M�thode getObject.
 * Param: idObject: identifiant de l'objet que l'on veut r�cup�rer
 * Return: l'objet sinon -1
 */
getObject = function(idObject){
    var objects = scene.getObjects();
    for (var i = 0; !found && i < objects.length; i++) {
		if (objects[i].uid == idObject) return objects[i];
	}  alert("The object named "+idObject+" doesn't exist in the scene."); return -1;
}

***************** OBJETS DANS LE GRAPHE

/* M�thode addObject.
 * Param: idObject: identifiant de l'objet � ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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

/* M�thode removeObject.
 * Param: idObject: identifiant de l'objet � supprimer de la sc�ne.
 * WARNING: les fils de l'objet seront supprim�s
 */
removeObject = function(idObject){
	var obj = this.getObject(idObject);
	if(obj != -1) obj.parent.removeChild(obj);
},

/* M�thode changeParentObject.
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

