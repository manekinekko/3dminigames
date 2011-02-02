/*
 * Squellette du moteur3d
 * version 1.02
 */
 
 
/**
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 */


 if(!window["MOTEUR3D"]){
	/**
	* @namespace Holds the functionality of the library
	*/
	window["MOTEUR3D"]={};
}

(function(MOTEUR3D){
 
/* M�thode initialisation.
 * Param: xmlDoc: fichier xml contenant la sc�ne � charger � l'initialisation.
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

/* M�thode getObject.
 * Param: idObject: identifiant de l'objet que l'on veut r�cup�rer
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

/* M�thode addObject: Ajoute un objet � la sc�ne ou � un object[optionnel].
 * Param: idObject: identifiant de l'objet � ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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


/* M�thode addObjectIn: Ajoute un objet � un groupe pr�d�fini.
 * Param: idObject: identifiant de l'objet � ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  idGroup: identifiant du group auquel on rattache l'objet, s'il n'existe pas, il est cr��.
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


/* M�thode addObjectGroup: Ajoute un objet dans un groupe puis � la sc�ne ou � un autre �l�ment de la sc�ne.
 * Param: idObject: identifiant de l'objet � ajouter.
 *        idGroup: identifiant du groupe, s'il existe d�j�, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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


/* M�thode addObjectGroupIn: Ajoute un objet dans un groupe puis � la sc�ne ou � un autre groupe de la sc�ne.
 * Param: idObject: identifiant de l'objet � ajouter.
 *        idGroup: identifiant du groupe, s'il existe d�j�, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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


/* M�thode removeObject: retire l'objet de la sc�ne.
 * Param: idObject: identifiant de l'objet � supprimer de la sc�ne.
 * WARNING: les fils de l'objet seront supprim�s
 */
MOTEUR3D.removeObject = function(idObject){
	if(tabObject[idObject] != undefined) tabObject[idObject].parent.removeChild(tabObject[idObject]);
},

/*
// MARCHE PAS POUR L'INSTANT  =>  A VOIR PLUS TARD A LA LIMITE
/* M�thode removeObjectOnly: retire l'objet de la sc�ne et rattache ses fils � l'objet p�re.
 * Param: idObject: identifiant de l'objet � supprimer de la sc�ne.
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

/* M�thode removeGroup: Supprime le groupe et ses fils.
 * Param: idGroup: identifiant du groupe � supprimer de la sc�ne.
 * WARNING: les fils du groupe seront supprim�s
 */
MOTEUR3D.removeGroup = function(idGroup){
	if(tabGroup[idGroup] != undefined) tabGroup[idGroup].parent.removeChild(tabGroup[idGroup]);
},


// MARCHE PAS POUR L'INSTANT =>  A VOIR PLUS TARD A LA LIMITE
/* M�thode removeGroupOnly: Supprime que le groupe, ses fils sont rattach�s � l'objet/groupe parent de celui ci.
 * Param: idGroup: identifiant du groupe � supprimer de la sc�ne.
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

/* M�thode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de sc�ne.
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
 * Liste de fonctions de gestion du d�placement
 ***************************************************************/

/* M�thode translateObject: V�rifie la collision sur tout le vecteur de d�placement.
 * Param: idObject: identifiant de l'objet que l'on souhaite d�placer
 *		  tabVector: vecteur de 3 coordorn�es x y z repr�sentant le d�placement
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel au d�placement sinon r�f�rentiel absolu
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


/* M�thode translateGroup: V�rifie la collision sur tout le vecteur de d�placement.
 * Param: idGroup: identifiant du groupe que l'on souhaite d�placer
 *		  tabVector: vecteur de 3 coordorn�es x y z repr�sentant le d�placement
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel au d�placement sinon r�f�rentiel absolu
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


/* M�thode setPositionObject: D�place l'objet � la position donn�e et v�rifie la collision � l'arriv�e seulement
 * Param: idObject: identifiant de l'objet que l'on souhaite d�placer
 *		  tabPos : vecteur de 3 coordorn�es x y z repr�sentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la nouvelle position sinon r�f�rentiel absolu
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


/* M�thode setPositionGroup: D�place le groupe � la position donn�e et v�rifie la collision � l'arriv�e seulement
 * Param: idGroup: identifiant du groupe que l'on souhaite d�placer
 *		  tabPos : vecteur de 3 coordorn�es x y z repr�sentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la nouvelle position sinon r�f�rentiel absolu
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


/* M�thode rotateObject: Effectue une rotation sur l'objet donn� et v�rifie la collision � l'arriv�e seulement
 * Param: idObject: identifiant de l'objet que l'on souhaite d�placer
 *		  tabRot : vecteur de 3 coordorn�es repr�sentant la rotation a effectu�
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la rotation sinon r�f�rentiel absolu
 */
MOTEUR3D.rotateObject = function(idObject,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision � l'arriv�e
	tabObject[idObject].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* M�thode rotateGroup: Effectue une rotation sur le groupe donn� et v�rifie la collision � l'arriv�e seulement
 * Param: idGroup: identifiant de l'objet que l'on souhaite d�placer
 *		  tabRot : vecteur de 3 coordorn�es repr�sentant la rotation a effectu�
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la rotation sinon r�f�rentiel absolu
 */
MOTEUR3D.rotateGroup = function(idGroup,tabRot,idRef){
	if(idRef == null){
		var M = GLGE.identMatrix();
	}else{
		var M = tabObject[idRef].getModelMatrix();
	}
	var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
	var D = GLGE.mulMat4Vec4(M,V);
	// verifie la collision � l'arriv�e
	tabGroup[idGroup].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
},


/* M�thode rescaleObject: Multiplie l'�chelle d'un objet par le coefficient donn�.
 * Param: idObject: identifiant de l'objet que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multipli� la taille de l'objet
 */
MOTEUR3D.rescaleObject = function (idObject,coefScale){
	var scale = tabObject[idObject].getScale()
	tabObject[idObject].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
},


/* M�thode rescaleGroup: Multiplie l'�chelle du groupe par le coefficient donn�.
 * Param: idGroup: identifiant du groupe que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multipli� la taille de l'objet
 */
MOTEUR3D.rescaleGroup = function (idGroup,coefScale){
	var scale = tabGroup[idGroup].getScale()
	tabGroup[idGroup].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
},


/***************************************************************
 * Partie de la gestion de la collision
 ***************************************************************/

/* M�thode collisionPointBoxSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un object O.
 * Param: idObject: identifiant de l'objet � tester.
 * 	   ptX: coordonn�e X du point � tester.
 * 	   ptY: coordonn�e Y du point � tester.
 * 	   ptZ: coordonn�e Z du point � tester.
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
  

/* M�thode collisionBoxBox: Test si 2 objets sont en collision.
 * Param: idObjectOne: identifiant d'un des objets � tester.
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
  

/* M�thode collisionPointGroupSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un groupe G.
 * Param: idGroup: identifiant du groupe � tester.
 * 	   ptX: coordonn�e X du point � tester.
 * 	   ptY: coordonn�e Y du point � tester.
 * 	   ptZ: coordonn�e Z du point � tester.
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


/* M�thode collisionBoxGroup: Test si un objet et un groupe sont en collision.
 * Param: idGroup: identifiant du groupe.
 *	      idObject: identifiant de l'objet � tester.       
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


/* M�thode collisionGroupGroup: Test si 2 groupes sont en collision.
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


/* M�thode liveCollision: Test si un object est en collision avec un element de la sc�ne.
 * Param: id: identifiant de l'�l�ment � tester.
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

// Ne sera pas impl�ment� dans cette version du moteur


/***************************************************************
 * Partie de la gestion de la cam�ra
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