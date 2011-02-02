/*
 * Squellette du moteur3d
 * version 1.02
 */
 
 
/**
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 */


 if(!window["MOTEUR3D"]){
	/**
	* @namespace Holds the functionality of the library
	*/
	window["MOTEUR3D"]={};
}

(function(MOTEUR3D){
 
/* Méthode initialisation.
 * Param: xmlDoc: fichier xml contenant la scène à charger à l'initialisation.
 */
 // INITIALISER LES TABLEAUX
MOTEUR3D.initialisation = function(xmlDoc){
	var tabObject = new Array;
	var tabGroup = new Array;
	var tabIdObject = new Array;
	var tabIdGroup = new Array;
	
	var doc = new GLGE.Document();
	doc.onLoad = function(){
		var gameRenderer = new GLGE.Renderer(document.getElementById('canvas'));
		gameScene = new GLGE.Scene();
		gameScene = doc.getElement("mainscene");
		gameRenderer.setScene(gameScene);
	}
	doc.load(xmlDoc);
},


/***************************************************************
 * Liste de fonctions outils
 ***************************************************************/

/* Méthode getObject.
 * Param: idObject: identifiant de l'objet que l'on veut récupérer
 * Return: l'objet sinon -1
 */
MOTEUR3D.getObject = function(idObject){
  	var object = tabObject[idObject];
	if(object != null ) return object;
	else{ alert("The object named "+idObject+" doesn't exist in the scene."); return -1; }
},

 
/***************************************************************
 * Liste de fonctions de gestion des objets dans le graphe
 ***************************************************************/

/* Méthode addObject: Ajoute un objet à la scène ou à un object[optionnel].
 * Param: idObject: identifiant de l'objet à ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
MOTEUR3D.addObject = function(idObject,urlObject, tabCoord, idParent){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	
	if(tabObject[idParent] == undefined) gameScene.addChild(tabObject[idObject]);
	else{ 
		tabObject[idParent].addChild(tabObject[idObject]);
	}
},


/* Méthode addObjectIn: Ajoute un objet à un groupe prédéfini.
 * Param: idObject: identifiant de l'objet à ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  idGroup: identifiant du group auquel on rattache l'objet, s'il n'existe pas, il est créé.
 */
MOTEUR3D.addObjectIn = function(idObject,urlObject, tabCoord, idGroup){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	
	if(tabGroup[idGroup] == undefined){
		tabGroup[idGroup] = new GLGE.Group();
		tabGroup[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabGroup[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabGroup[idGroup].addChild(tabObject[idObject]);
		gameScene.addChild(tabGroup[idGroup]);
	} else{	tabGroup[idGroup].addChild(tabObject[idObject]); }
},


/* Méthode addObjectGroup: Ajoute un objet dans un groupe puis à la scène ou à un autre élément de la scène.
 * Param: idObject: identifiant de l'objet à ajouter.
 *        idGroup: identifiant du groupe, s'il existe déjà, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
MOTEUR3D.addObjectGroup = function(idObject, idGroup, urlObject, tabCoord, idParent){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	
	if(tabGroup[idGroup] == undefined){
		tabGroup[idGroup] = new GLGE.Group();
		tabGroup[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabGroup[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabGroup[idGroup].addChild(tabObject[idObject]);
	
		if(idParent == null) gameScene.addChild(tabGroup[idGroup]);
		else{ 
			if(tabObject[idParent] != undefined) tabObject[idParent].addChild(tabObject[idObject]);
		}
	}
},


/* Méthode addObjectGroupIn: Ajoute un objet dans un groupe puis à la scène ou à un autre groupe de la scène.
 * Param: idObject: identifiant de l'objet à ajouter.
 *        idGroup: identifiant du groupe, s'il existe déjà, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
MOTEUR3D.addObjectGroupIn = function(idObject, idGroup, urlObject, tabCoord, idParent){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	
	if(tabGroup[idGroup] == undefined){
		tabGroup[idGroup] = new GLGE.Group();
		tabGroup[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabGroup[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabGroup[idGroup].addChild(tabObject[idObject]);
	
		if(idParent == null) gameScene.addChild(tabGroup[idGroup]);
		else{ 
			if(tabGroup[idParent] != undefined) tabGroup[idParent].addChild(tabObject[idObject]);
		}
	}
},


/* Méthode removeObject: retire l'objet de la scène.
 * Param: idObject: identifiant de l'objet à supprimer de la scène.
 * WARNING: les fils de l'objet seront supprimés
 */
MOTEUR3D.removeObject = function(idObject){
	if(tabObject[idObject] != undefined) tabObject[idObject].parent.removeChild(tabObject[idObject]);
},

/*
// MARCHE PAS POUR L'INSTANT  =>  A VOIR PLUS TARD A LA LIMITE
/* Méthode removeObjectOnly: retire l'objet de la scène et rattache ses fils à l'objet père.
 * Param: idObject: identifiant de l'objet à supprimer de la scène.
 */
 /*
MOTEUR3D.removeObjectOnly = function(idObject){
	if(tabObject[idObject] != null){ 
		var fils = tabObject[idObject].getChildren();
		for(int i = 0; i<fils.length; i++){
			tabObject[idObject].parent.addChild(fils[i]);
		}
		tabObject[idObject].parent.removeChild(tabObject[idObject]);
	}
},
*/

/* Méthode removeGroup: Supprime le groupe et ses fils.
 * Param: idGroup: identifiant du groupe à supprimer de la scène.
 * WARNING: les fils du groupe seront supprimés
 */
MOTEUR3D.removeGroup = function(idGroup){
	if(tabGroup[idGroup] != undefined) tabGroup[idGroup].parent.removeChild(tabGroup[idGroup]);
},


// MARCHE PAS POUR L'INSTANT =>  A VOIR PLUS TARD A LA LIMITE
/* Méthode removeGroupOnly: Supprime que le groupe, ses fils sont rattachés à l'objet/groupe parent de celui ci.
 * Param: idGroup: identifiant du groupe à supprimer de la scène.
 */
 /*
MOTEUR3D.removeGroupOnly = function(idGroup){
	if(tabGroup[idGroup] != undefined){
		var fils = tabGroup[idGroup].getChildren();
		for(int i = 0; i<fils.length; i++){
			tabGroup[idGroup].parent.addChild(fils[i]);
		}
		tabGroup[idGroup].parent.removeChild(tabGroup[idGroup]);
	}
},
*/

/* Méthode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de scène.
 * Param: idObject: identifiant de l'objet dont on veut changer le parent
 *		  idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet
 * WARNING: les fils de l'objet changeront aussi de parent
 */
MOTEUR3D.changeParentObject = function(idObject,idNewParent){
	if(tabObject[idObject] != undefined && tabObject[idNewParent] != undefined){
		tabObject[idObject].parent = tabObject[idNewParent]; 
		tabObject[idNewParent].addChild(tabObject[idObject]);
	}
},


/***************************************************************
 * Liste de fonctions de gestion du déplacement
 ***************************************************************/

/* Méthode translateObject: Vérifie la collision sur tout le vecteur de déplacement.
 * Param: idObject: identifiant de l'objet que l'on souhaite déplacer
 *		  tabVector: vecteur de 3 coordornées x y z représentant le déplacement
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu
 */
MOTEUR3D.translateObject = function(idObject,tabVector,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision sur toute la trajectoire
	tabObject[idObject].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode translateGroup: Vérifie la collision sur tout le vecteur de déplacement.
 * Param: idGroup: identifiant du groupe que l'on souhaite déplacer
 *		  tabVector: vecteur de 3 coordornées x y z représentant le déplacement
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu
 */
MOTEUR3D.translateGroup = function(idGroup,tabVector,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision sur toute la trajectoire
	tabGroup[idGroup].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode setPositionObject: Déplace l'objet à la position donnée et vérifie la collision à l'arrivée seulement
 * Param: idObject: identifiant de l'objet que l'on souhaite déplacer
 *		  tabPos : vecteur de 3 coordornées x y z représentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 */
MOTEUR3D.setPositionObject = function(idObject,tabPos,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	if(!liveCollision(idObject)) tabObject[idObject].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode setPositionGroup: Déplace le groupe à la position donnée et vérifie la collision à l'arrivée seulement
 * Param: idGroup: identifiant du groupe que l'on souhaite déplacer
 *		  tabPos : vecteur de 3 coordornées x y z représentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 */
MOTEUR3D.setPositionGroup = function(idGroup,tabPos,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	if(!liveCollision(idGroup)) tabGroup[idGroup].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode rotateObject: Effectue une rotation sur l'objet donné et vérifie la collision à l'arrivée seulement
 * Param: idObject: identifiant de l'objet que l'on souhaite déplacer
 *		  tabRot : vecteur de 3 coordornées représentant la rotation a effectué
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu
 */
MOTEUR3D.rotateObject = function(idObject,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision à l'arrivée
	tabObject[idObject].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode rotateGroup: Effectue une rotation sur le groupe donné et vérifie la collision à l'arrivée seulement
 * Param: idGroup: identifiant de l'objet que l'on souhaite déplacer
 *		  tabRot : vecteur de 3 coordornées représentant la rotation a effectué
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu
 */
MOTEUR3D.rotateGroup = function(idGroup,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision à l'arrivée
	tabGroup[idGroup].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode rescaleObject: Multiplie l'échelle d'un objet par le coefficient donné.
 * Param: idObject: identifiant de l'objet que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multiplié la taille de l'objet
 */
MOTEUR3D.rescaleObject = function (idObject,coefScale){
	var scale = tabObject[idObject].getScale()
	tabObject[idObject].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
},


/* Méthode rescaleGroup: Multiplie l'échelle du groupe par le coefficient donné.
 * Param: idGroup: identifiant du groupe que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multiplié la taille de l'objet
 */
MOTEUR3D.rescaleGroup = function (idGroup,coefScale){
	var scale = tabGroup[idGroup].getScale()
	tabGroup[idGroup].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
},


/***************************************************************
 * Partie de la gestion de la collision
 ***************************************************************/

/* Méthode collisionPointBoxSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un object O.
 * Param: idObject: identifiant de l'objet à tester.
 * 	   ptX: coordonnée X du point à tester.
 * 	   ptY: coordonnée Y du point à tester.
 * 	   ptZ: coordonnée Z du point à tester.
 */
MOTEUR3D.collisionPointBoxSimple = function(idObject, ptX, ptY, ptZ){
	var box = tabObject[idObject].getBoundingVolume().dims;
	var pos = tabObject[idObject].getPosition();
	if(ptX >= pos.x 
		&& ptX < pos.x + box[0]
		&& ptY >= pos.y 
		&& ptY < pos.y + box[1]
		&& ptZ >= pos.z 
		&& ptZ < pos.z + box[2]) return true;
	return false;
},
  

/* Méthode collisionBoxBox: Test si 2 objets sont en collision.
 * Param: idObjectOne: identifiant d'un des objets à tester.
 *        idObjectTwo: identifiant du 2nd objets.
 */
MOTEUR3D.collisionBoxBox = function(idObjectOne, idObjectTwo){
	var posTwo = tabObject[idObjectTwo].getPosition();
	if(this.collisionPointBoxSimple(idObjectOne, posTwo.x, posTwo.y, posTwo.z)) return true;
	else {
		var boxOne = tabObject[idObjectOne].getBoundingVolume().dims;
		var posOne = tabObject[idObjectOne].getPosition();
		var boxTwo = tabObject[idObjectTwo].getBoundingVolume().dims;
		
		var xminOne = posOne.x+boxOne.center[0]-boxOne.dims[0]/2;
		var xmaxOne = posOne.x+boxOne.center[0]+boxOne.dims[0]/2;
		var yminOne = posOne.y+boxOne.center[1]-boxOne.dims[1]/2;
		var ymaxOne = posOne.y+boxOne.center[1]+boxOne.dims[1]/2;
		var zminOne = posOne.z+boxOne.center[2]-boxOne.dims[2]/2;
		var zmaxOne = posOne.z+boxOne.center[2]+boxOne.dims[2]/2;
		var xminTwo = posTwo.x+boxTwo.center[0]-boxTwo.dims[0]/2;
		var xmaxTwo = posTwo.x+boxTwo.center[0]+boxTwo.dims[0]/2;
		var yminTwo = posTwo.y+boxTwo.center[1]-boxTwo.dims[1]/2;
		var ymaxTwo = posTwo.y+boxTwo.center[1]+boxTwo.dims[1]/2;
		var zminTwo = posTwo.z+boxTwo.center[2]-boxTwo.dims[2]/2;
		var zmaxTwo = posTwo.z+boxTwo.center[2]+boxTwo.dims[2]/2;
		
		if(xminOne >= xmaxTwo      
			|| xmaxOne <= xminTwo 
			|| yminOne >= ymaxTwo 
			|| ymaxOne <= yminTwo 	
			|| zminOne >= zmaxTwo  
			|| zmaxOne <= zminTwo ) return false;
	} 
	return true;
},
  

/* Méthode collisionPointGroupSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un groupe G.
 * Param: idGroup: identifiant du groupe à tester.
 * 	   ptX: coordonnée X du point à tester.
 * 	   ptY: coordonnée Y du point à tester.
 * 	   ptZ: coordonnée Z du point à tester.
 */
MOTEUR3D.collisionPointGroupSimple = function(idGroup, ptX, ptY, ptZ){
	var box = tabGroup[idGroup].getBoundingVolume().dims;
	var pos = tabGroup[idGroup].getPosition();
	if(ptX >= pos.x 
		&& ptX < pos.x + box[0]
		&& ptY >= pos.y 
		&& ptY < pos.y + box[1]
		&& ptZ >= pos.z 
		&& ptZ < pos.z + box[2]) return true;
	return false;
},


/* Méthode collisionBoxGroup: Test si un objet et un groupe sont en collision.
 * Param: idGroup: identifiant du groupe.
 *	      idObject: identifiant de l'objet à tester.       
 */
MOTEUR3D.collisionBoxGroup = function(idGroup, idObject){
	var posObject = tabObject[idObject].getPosition();
	if(this.collisionPointGroupSimple(idGroup, posObject.x, posObject.y, posObject.z)) return true;
	else {
		var boxGroup = tabGroup[idGroup].getBoundingVolume();
		var posGroup = tabGroup[idGroup].getPosition();
		var boxObject = tabObject[idObject].getBoundingVolume();
		
		var xminGroup = posGroup.x+boxGroup.center[0]-boxGroup.dims[0]/2;
		var xmaxGroup = posGroup.x+boxGroup.center[0]+boxGroup.dims[0]/2;
		var yminGroup = posGroup.y+boxGroup.center[1]-boxGroup.dims[1]/2;
		var ymaxGroup = posGroup.y+boxGroup.center[1]+boxGroup.dims[1]/2;
		var zminGroup = posGroup.z+boxGroup.center[2]-boxGroup.dims[2]/2;
		var zmaxGroup = posGroup.z+boxGroup.center[2]+boxGroup.dims[2]/2;
		var xminObject = posObject.x+boxObject.center[0]-boxObject.dims[0]/2;
		var xmaxObject = posObject.x+boxObject.center[0]+boxObject.dims[0]/2;
		var yminObject = posObject.y+boxObject.center[1]-boxObject.dims[1]/2;
		var ymaxObject = posObject.y+boxObject.center[1]+boxObject.dims[1]/2;
		var zminObject = posObject.z+boxObject.center[2]-boxObject.dims[2]/2;
		var zmaxObject = posObject.z+boxObject.center[2]+boxObject.dims[2]/2;
		
		if(  xminGroup >= xmaxObject      
		||   xmaxGroup <= xminObject
		||   yminGroup >= ymaxObject
		||   ymaxGroup <= yminObject
		||   zminGroup >= zmaxObject
		||   zmaxGroup <= zminObject) return false;
	} 
	return true;
},


/* Méthode collisionGroupGroup: Test si 2 groupes sont en collision.
 * Param: idGroupOne: identifiant du 1er groupe.
 *	      idGroupTwo: identifiant du 2nd groupe.       
 */
MOTEUR3D.collisionGroupGroup = function(idGroupOne, idGroupTwo){
	var posGroupTwo = tabGroup[idGroupTwo].getPosition();
	if(this.collisionPointGroupSimple(idGroupOne, posGroupTwo.x, posGroupTwo.y, posGroupTwo.z)) return true;
	else {
		var boxGroupOne = tabGroup[idGroupOne].getBoundingVolume();
		var posGroupOne = tabGroup[idGroupOne].getPosition();
		var boxGroupTwo = tabGroup[idGroupTwo].getBoundingVolume();
		
		var xminGroupOne = posGroupOne.x+boxGroupOne.center[0]-boxGroupOne.dims[0]/2;
		var xmaxGroupOne = posGroupOne.x+boxGroupOne.center[0]+boxGroupOne.dims[0]/2;
		var yminGroupOne = posGroupOne.y+boxGroupOne.center[1]-boxGroupOne.dims[1]/2;
		var ymaxGroupOne = posGroupOne.y+boxGroupOne.center[1]+boxGroupOne.dims[1]/2;
		var zminGroupOne = posGroupOne.z+boxGroupOne.center[2]-boxGroupOne.dims[2]/2;
		var zmaxGroupOne = posGroupOne.z+boxGroupOne.center[2]+boxGroupOne.dims[2]/2;
		var xminGroupTwo = posGroupTwo.x+boxGroupTwo.center[0]-boxGroupTwo.dims[0]/2;
		var xmaxGroupTwo = posGroupTwo.x+boxGroupTwo.center[0]+boxGroupTwo.dims[0]/2;
		var yminGroupTwo = posGroupTwo.y+boxGroupTwo.center[1]-boxGroupTwo.dims[1]/2;
		var ymaxGroupTwo = posGroupTwo.y+boxGroupTwo.center[1]+boxGroupTwo.dims[1]/2;
		var zminGroupTwo = posGroupTwo.z+boxGroupTwo.center[2]-boxGroupTwo.dims[2]/2;
		var zmaxGroupTwo = posGroupTwo.z+boxGroupTwo.center[2]+boxGroupTwo.dims[2]/2;
		
		if(  xminGroupOne >= xmaxGroupTwo      
		||   xmaxGroupOne <= xminGroupTwo
		||   yminGroupOne >= ymaxGroupTwo
		||   ymaxGroupOne <= yminGroupTwo
		||   zminGroupOne >= zmaxGroupTwo
		||   zmaxGroupOne <= zminGroupTwo) return false;
	} 
	return true;
},


/* Méthode liveCollision: Test si un object est en collision avec un element de la scène.
 * Param: id: identifiant de l'élément à tester.
 */
MOTEUR3D.liveCollision = function(id){
	if(tabObject[id] != undefined){
		for(i=0; i<tabIdObject.length; i++){
			if(tabIdObject[i] !=  id){
				if(collisionBoxBox(tabIdObject[i], id)) return true;
			}
		}
	} else {
		for(i=0; i<tabIdObject.length; i++){
			if(collisionBoxGroup(id, tabIdObject[i])) return true;
		}
		for(i=0; i<tabIdGroup.length; i++){
			if(collisionGroupGroup(id, tabIdGroup[i])) return true;
		}
	} return false;
},
 
/***************************************************************
 * Partie de la gestion des forces
 ***************************************************************/

// Ne sera pas implémenté dans cette version du moteur


/***************************************************************
 * Partie de la gestion de la caméra
 ***************************************************************/

 function (){
	var camera=gameScene.camera;
	camerapos=camera.getPosition();
	camerarot=camera.getRotation();
	var cam = camera.getRotMatrix();
	cam = GLGE.inverseMat4(cam);	

	if(keys.isKeyPressed(GLGE.KI_G))
		camLookAt = true; 
	
	if(keys.isKeyPressed(GLGE.KI_F))
		camLookAt = false; 
			
	if(camLookAt){
		var objpos={x:0,y:0,z:0};		
		var coord=[camerapos.x-objpos.x,camerapos.y-objpos.y,camerapos.z-objpos.z];
		var zvec=GLGE.toUnitVec3(coord);
		var xvec=GLGE.toUnitVec3(GLGE.crossVec3([cam[4],cam[5],cam[6]],zvec));
		var yvec=GLGE.toUnitVec3(GLGE.crossVec3(zvec,xvec));		
		camera.setRotMatrix(GLGE.Mat4([xvec[0], yvec[0], zvec[0], 0,
						xvec[1], yvec[1], zvec[1], 0,
						xvec[2], yvec[2], zvec[2], 0,
						0, 0, 0, 1]));
	}

	if(keys.isKeyPressed(GLGE.KI_Z)) {camera.setLocX(camerapos.x-cam[8]*0.05*(now-lasttime));camera.setLocY(camerapos.y-cam[9]*0.05*(now-lasttime));camera.setLocZ(camerapos.z-cam[10]*0.05*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_S)) {camera.setLocX(camerapos.x+cam[8]*0.05*(now-lasttime));camera.setLocY(camerapos.y+cam[9]*0.05*(now-lasttime));camera.setLocZ(camerapos.z+cam[10]*0.05*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_Q)) {camera.setLocX(camerapos.x-cam[0]*0.05*(now-lasttime));camera.setLocY(camerapos.y-cam[1]*0.05*(now-lasttime));camera.setLocZ(camerapos.z-cam[2]*0.05*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_D)) {camera.setLocX(camerapos.x+cam[0]*0.05*(now-lasttime));camera.setLocY(camerapos.y+cam[1]*0.05*(now-lasttime));camera.setLocZ(camerapos.z+cam[2]*0.05*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_DOWN_ARROW)) {camera.setLocX(camerapos.x-cam[4]*0.05*(now-lasttime));camera.setLocY(camerapos.y-cam[5]*0.05*(now-lasttime));camera.setLocZ(camerapos.z-cam[6]*0.05*(now-lasttime));}		
		
	if(keys.isKeyPressed(GLGE.KI_UP_ARROW)) {camera.setLocX(camerapos.x+cam[4]*0.05*(now-lasttime));camera.setLocY(camerapos.y+cam[5]*0.05*(now-lasttime));camera.setLocZ(camerapos.z+cam[6]*0.05*(now-lasttime));}		

}

}