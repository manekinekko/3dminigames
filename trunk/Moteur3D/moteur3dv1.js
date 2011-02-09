/*
 * Squellette du moteur3d de 3DWIGS
 * version 1.02.08
 */
 
 
/**
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 */

 if(!window["M3D"]){
	window["M3D"] = {};
}

if(!window["M3D"].MOTEUR){
	window["M3D"].MOTEUR = {};
}

(function(M3D){
// Variables du moteur
	var tabObject = new Array;
	var tabIdObject = new Array;
 
/* Méthode initialisation.
 * Param: xmlDoc: fichier xml contenant la scène à charger à l'initialisation.
 */
M3D.MOTEUR.initialisation = function(xmlDoc){
	var doc = new GLGE.Document();
	doc.onLoad = function(){
		var gameRenderer = new GLGE.Renderer(document.getElementById('canvas'));
		gameScene = new GLGE.Scene();
		gameScene = doc.getElement("mainscene");
		gameRenderer.setScene(gameScene);
		
		// Initialisation du tableau des objects/IdObject
		var indice1 = 0;
		init(gameScene);
		
	}
	doc.load(xmlDoc);
},


/***************************************************************
 * Liste de fonctions outils
 ***************************************************************/
/* Fonction récursive init.
 * Param: racine: object.
 */
M3D.MOTEUR.init = function(racine){
	var tabO = racine.getChildren();
	var tabL = racine.getLights();
	var present = false;
	var indice2 = 0;
	var j;
	while(indice1<tabO.length-1){
		while(indice2<tabO.length-1){
			for(j=0; j<tabL.length-1; j++){	if(tabO[indice2]==tabL[j]) present = true; }
			if(!present){
				if(tabO[indice2].id != undefined){
					tabObject[tabO[indice2].id] = tabO[indice2];
					tabIdObject[tabIdObject.length] = tabO[indice2].id;
					init(tabO[indice2]);
				}
			} present = false;
			indice2++;
		}
		indice1++;
	}
},
 
/* Méthode getObject.
 * Param: idObject: identifiant de l'objet que l'on veut récupérer
 * Return: l'objet sinon -1
 */
M3D.MOTEUR.getObject = function(idObject){
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
M3D.MOTEUR.addObject = function(idObject,urlObject, tabCoord, idParent){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	tabIdObject[tabIdObject.length] = idObject;
	
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
M3D.MOTEUR.addObjectIn = function(idObject,urlObject, tabCoord, idGroup){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	tabIdObject[tabIdObject.length] = idObject;
	
	if(tabObject[idGroup] == undefined){
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabObject[idObject]);
		gameScene.addChild(tabObject[idGroup]);
		tabIdObject[tabIdObject.length] = idGroup;
	} else {	tabObject[idGroup].addChild(tabObject[idObject]); }
},


/* Méthode addObjectGroup: Ajoute un objet dans un groupe puis à la scène ou à un autre élément de la scène.
 * Param: idObject: identifiant de l'objet à ajouter.
 *        idGroup: identifiant du groupe, s'il existe déjà, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
M3D.MOTEUR.addObjectGroup = function(idObject, idGroup, urlObject, tabCoord, idParent){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	tabIdObject[tabIdObject.length] = idObject;
	
	if(tabObject[idGroup] == undefined){
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabObject[idObject]);
		tabIdObject[tabIdObject.length] = idGroup;
		
		if(idParent == null) gameScene.addChild(tabObject[idGroup]);
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
M3D.MOTEUR.addObjectGroupIn = function(idObject, idGroup, urlObject, tabCoord, idParent){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	tabIdObject[tabIdObject.length] = idObject;
	
	if(tabObject[idGroup] == undefined){
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabObject[idObject]);
		tabIdObject[tabIdObject.length] = idGroup;
		
		if(idParent == null) gameScene.addChild(tabObject[idGroup]);
		else{ 
			if(tabObject[idParent] != undefined) tabObject[idParent].addChild(tabObject[idObject]);
		}
	}
},


/* Méthode removeObject: retire l'objet de la scène.
 * Param: idObject: identifiant de l'objet à supprimer de la scène.
 * WARNING: les fils de l'objet seront supprimés
 */
M3D.MOTEUR.removeObject = function(idObject){
	if(tabObject[idObject] != undefined) tabObject[idObject].parent.removeChild(tabObject[idObject]);
},

/*
// MARCHE PAS POUR L'INSTANT  =>  A VOIR PLUS TARD A LA LIMITE
/* Méthode removeObjectOnly: retire l'objet de la scène et rattache ses fils à l'objet père.
 * Param: idObject: identifiant de l'objet à supprimer de la scène.
 */
 /*
M3D.MOTEUR.removeObjectOnly = function(idObject){
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
M3D.MOTEUR.removeGroup = function(idGroup){
	if(tabObject[idGroup] != undefined) tabObject[idGroup].parent.removeChild(tabObject[idGroup]);
},


// MARCHE PAS POUR L'INSTANT =>  A VOIR PLUS TARD A LA LIMITE
/* Méthode removeGroupOnly: Supprime que le groupe, ses fils sont rattachés à l'objet/groupe parent de celui ci.
 * Param: idGroup: identifiant du groupe à supprimer de la scène.
 */
 /*
M3D.MOTEUR.removeGroupOnly = function(idGroup){
	if(tabObject[idGroup] != undefined){
		var fils = tabObject[idGroup].getChildren();
		for(int i = 0; i<fils.length; i++){
			tabObject[idGroup].parent.addChild(fils[i]);
		}
		tabObject[idGroup].parent.removeChild(tabObject[idGroup]);
	}
},
*/

/* Méthode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de scène.
 * Param: idObject: identifiant de l'objet dont on veut changer le parent
 *		  idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet
 * WARNING: les fils de l'objet changeront aussi de parent
 */
M3D.MOTEUR.changeParentObject = function(idObject,idNewParent){
	if(tabObject[idObject] != undefined && tabObject[idNewParent] != undefined){
		tabObject[idObject].parent = tabObject[idNewParent]; 
		tabObject[idNewParent].addChild(tabObject[idObject]);
	}
},


/***************************************************************
 * Liste de fonctions de gestion du déplacement
 ***************************************************************/

/* Méthode translate: Vérifie la collision sur tout le vecteur de déplacement.
 * Param: id: identifiant de l'élement que l'on souhaite déplacer
 *		  tabVector: vecteur de 3 coordornées x y z représentant le déplacement
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel au déplacement sinon référentiel absolu
 */
M3D.MOTEUR.translate = function(id,tabVector,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision sur toute la trajectoire
	tabObject[id].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode setPosition: Déplace l'élément à la position donnée et vérifie la collision à l'arrivée seulement
 * Param: id: identifiant de l'élément que l'on souhaite déplacer
 *		  tabPos : vecteur de 3 coordornées x y z représentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la nouvelle position sinon référentiel absolu
 */
M3D.MOTEUR.setPosition = function(id,tabPos,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	if(!M3D.MOTEUR.liveCollision(id)) tabObject[id].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode rotate: Effectue une rotation sur l'élément donné et vérifie la collision à l'arrivée seulement
 * Param: id: identifiant de l'élément que l'on souhaite déplacer
 *		  tabRot : vecteur de 3 coordornées représentant la rotation a effectué
 *		  [Optionnel]idRef: identifiant de l'objet servant de référentiel à la rotation sinon référentiel absolu
 */
M3D.MOTEUR.rotate = function(id,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision à l'arrivée
	tabObject[id].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* Méthode rescale: Multiplie l'échelle d'un objet par le coefficient donné.
 * Param: id: identifiant de l'objet que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multiplié la taille de l'objet
 */
M3D.MOTEUR.rescaleObject = function (id,coefScale){
	var scale = tabObject[id].getScale()
	tabObject[id].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
},


/***************************************************************
 * Partie de la gestion de la collision
 ***************************************************************/
/* Méthode listingTarget: Retourne un tableau de nom
 * Param: idObject: élément concerné
 * Return: tableau des id d'objet à tester
 */
M3D.MOTEUR.listingTarget = function(idObject){
	tabR = new Array;
	tabO = tabObject[idObject].getChildren();
	present = false;
	
	for(i=0; i<tabIdObject.length; i++){
		for(j=0; j<tabO.length; j++){ if(tabO[j] == tabObject[tabIdObject[i]]) present = true; }
		if(!present && tabIdObject[i] != idObject) tabR[tabR.length] = tabIdObject[i];
		present = false;
	} return tabR;
}
 
/* Méthode collisionPointBoxSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un object O.
 * Param: idObject: identifiant de l'objet à tester.
 * 	   ptX: coordonnée X du point à tester.
 * 	   ptY: coordonnée Y du point à tester.
 * 	   ptZ: coordonnée Z du point à tester.
 */
M3D.MOTEUR.collisionPointBoxSimple = function(idObject, ptX, ptY, ptZ){
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
M3D.MOTEUR.collisionBoxBox = function(idObjectOne, idObjectTwo){
	var posTwo = tabObject[idObjectTwo].getPosition();
	if(M3D.MOTEUR.collisionPointBoxSimple(idObjectOne, posTwo.x, posTwo.y, posTwo.z)) return true;
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
M3D.MOTEUR.collisionPointGroupSimple = function(idGroup, ptX, ptY, ptZ){
	var box = tabObject[idGroup].getBoundingVolume().dims;
	var pos = tabObject[idGroup].getPosition();
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
M3D.MOTEUR.collisionBoxGroup = function(idGroup, idObject){
	var posObject = tabObject[idObject].getPosition();
	if(M3D.MOTEUR.collisionPointGroupSimple(idGroup, posObject.x, posObject.y, posObject.z)) return true;
	else {
		var boxGroup = tabObject[idGroup].getBoundingVolume();
		var posGroup = tabObject[idGroup].getPosition();
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
M3D.MOTEUR.collisionGroupGroup = function(idGroupOne, idGroupTwo){
	var posGroupTwo = tabObject[idGroupTwo].getPosition();
	if(M3D.MOTEUR.collisionPointGroupSimple(idGroupOne, posGroupTwo.x, posGroupTwo.y, posGroupTwo.z)) return true;
	else {
		var boxGroupOne = tabObject[idGroupOne].getBoundingVolume();
		var posGroupOne = tabObject[idGroupOne].getPosition();
		var boxGroupTwo = tabObject[idGroupTwo].getBoundingVolume();
		
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
M3D.MOTEUR.liveCollision = function(id){
	tab = listingTarget(id);
	for(i=0; i<tab.length; i++){
		if(tab[i] !=  id){
			if(collisionBoxBox(tab[i], id)) return true;
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
 
 MOTEUR3D.getCamera = function(idCamera){
    var camera = tabCamera[idCamera];
    if(camera != null) return camera;
    else{ alert("The camera named "+idCamera+" doesn't exist in the scene."); return -1;}
},

    MOTEUR3D.addCamera = function(idCamera, tabCoord, idParent){
	tabCamera[idCamera] = new GLGE.Camera();
	tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabCamera[idCamera].setScale(tabCoord[6]);

	if(tabObject[idParent] == undefined) gameScene.addChild(tabCamera[idCamera]);
	else{
	    tabObject[idParent].addChild(tabOject[idObject]);
	}
},

	MOTEUR3D.addCameraIn = function(idCamera, tabCoord, idGroup){
	tabCamera[idCamera] = new GLGE.Camera();
	tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabCamera[idCamera].setScale(tabCoord[6]);
	
	if(tabObject[idGroup] == undefined){ // Vérifier la gestion du addChild dans un Group...
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabCamera[idCamera]);
		gameScene.addChild(tabObject[idGroup]);
	} else{	tabObject[idGroup].addChild(tabCamera[idCamera]); }
},

MOTEUR3D.addCameraGroup = function(idCamera, idGroup, tabCoord, idParent){
	tabCamera[idCamera] = new GLGE.Collada();
	tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabCamera[idCamera].setScale(tabCoord[6]);
	
	if(tabObject[idGroup] == undefined){
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabCamera[idCamera]);
	
		if(idParent == null) gameScene.addChild(tabObject[idGroup]);
		else{ 
			if(tabObject[idParent] != undefined) tabObject[idParent].addChild(tabCamera[idCamera]);
		}
	}
},

MOTEUR3D.addCameraGroupIn = function(idCamera, idGroup, tabCoord, idParent){
	tabCamera[idCamera] = new GLGE.Collada();
	tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabCamera[idCamera].setScale(tabCoord[6]);
	
	if(tabObject[idGroup] == undefined){
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabCamera[idCamera]);
	
		if(idParent == null) gameScene.addChild(tabObject[idGroup]);
		else{ 
			if(tabObject[idParent] != undefined) tabObject[idParent].addChild(tabCamera[idCamera]);
		}
	}
},

MOTEUR3D.removeCamera = function(idCamera){
	if(tabCamera[idCamera] != undefined) tabCamera[idCamera].parent.removeChild(tabCamera[idCamera]);
},

MOTEUR3D.changeParentCamera = function(idCamera,idNewParent){
	if(tabCamera[idCamera] != undefined && tabObject[idNewParent] != undefined){
		tabCamera[idCamera].parent = tabObject[idNewParent]; 
		tabObject[idNewParent].addChild(tabCamera[idCamera]);
	}
},

translateCamera = function(idCamera,tabVector,idRef){
	var Mcamera = tabCamera[idCamera].getModelMatrix();
	if(idRef == null){
		var Mref = tabCamera[idCamera].getModelMatrix();
	}else{
		var Mref = tabObject[idRef].getModelMatrix();
	}
	
	var vector = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
	var etape1 = GLGE.mulMat4Vec4(Mref,vector);
	var camera=tabCamera[idCamera];
	var actualposition = GLGE.Vec4(camera.getLocX(),camera.getLocY(),camera.getLocZ(),1);
	var etape2 = GLGE.mulMat4Vec4(Mcamera,actualposition);
	var etape3 = GLGE.addVec4(etape1,etape2);
	var D = GLGE.mulMat4Vec4(GLGE.inverseMat4(Mcamera),etape3);
	tabCamera[idCamera].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},

    /* 
      MOTEUR3D.setPositionCamera = function(idCamera,tabPos,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabCamera[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	tabCamera[idCamera].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
	}, */

MOTEUR3D.rotateCamera = function(idCamera,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabCamera[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	tabCamera[idCamera].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},
 
/*
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

}*/

}