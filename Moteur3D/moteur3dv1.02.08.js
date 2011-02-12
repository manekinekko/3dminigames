/*
 * Squellette du moteur3d de 3DWIGS
 * version 1.02.08
 */
 
 
/**
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
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
	var gameScene;
 
/* M�thode initialisation.
 * Param: gScene.
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets
 */
M3D.MOTEUR.initialisation = function(gScene){
/*	var doc = new GLGE.Document();
	doc.onLoad = function(){
		gameRenderer = new GLGE.Renderer(document.getElementById(canvas));
		gameScene = new GLGE.Scene();
		gameScene = doc.getElement("mainscene");
		gameRenderer.setScene(gameScene);
 */		
	gameScene = gScene;
	// Initialisation du tableau des objects/IdObject
	M3D.MOTEUR.init([gameScene]);
	return [tabObject,tabIdObject];
/*
		var lasttime=0;
		var frameratebuffer=60;
		start=parseInt(new Date().getTime());
		var now;
		function render(){
			now=parseInt(new Date().getTime());
			frameratebuffer=Math.round(((frameratebuffer*9)+1000/(now-lasttime))/10);
			document.getElementById("debug").innerHTML="Frame Rate:"+frameratebuffer;
			
			gameRenderer.render();
			lasttime=now;
		}
		setInterval(render,1);
	}
	doc.load(xmlDoc);
 */	
},


/* Fonction init: permet l'initialisation du tableau d'objet.
 * Param: liste des objets � parcourir.
 */
M3D.MOTEUR.init = function(list){
	if(list.length!=0){
		var x = list.pop();
		var tabL = x.getLights();
		var tabO = x.getChildren();
		var present = false;
		var j;
		for(var i = 0 ; i<tabO.length ; i++){
			for(j=0; j<tabL.length; j++){ if(tabO[i]==tabL[j]) present = true; }
			if(!present){
				if(tabO[i].id != undefined){
					tabObject[tabO[i].id] = tabO[i];
					tabIdObject[tabIdObject.length] = tabO[i].id;
					list.push(tabO[i]);
				}
			} present = false;
		} 
		M3D.MOTEUR.init(list);
	} 
},


/***************************************************************
 * Liste de fonctions outils
 ***************************************************************/
 
/* M�thode getObject.
 * Param: idObject: identifiant de l'objet que l'on veut r�cup�rer
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

/* M�thode addObject: Ajoute un objet � la sc�ne ou � un object[optionnel].
 * Param: idObject: identifiant de l'objet � ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
	return [tabObject,tabIdObject];
},


/* M�thode addObjectIn: Ajoute un objet � un groupe pr�d�fini.
 * Param: idObject: identifiant de l'objet � ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  idGroup: identifiant du group auquel on rattache l'objet, s'il n'existe pas, il est cr��.
 */
M3D.MOTEUR.addObjectIn = function(idObject,urlObject, tabCoord, idGroup){
	tabObject[idObject] = new GLGE.Collada();
	tabObject[idObject].setDocument(urlObject);
	tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
	tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
	tabObject[idObject].setScale(tabCoord[6]);
	tabIdObject[tabIdObject.length] = idObject;
	
	if(tabGroup[idGroup] == undefined){
		tabObject[idGroup] = new GLGE.Group();
		tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		tabObject[idGroup].addChild(tabObject[idObject]);
		gameScene.addChild(tabGroup[idGroup]);
		tabIdObject[tabIdObject.length] = idGroup;
	} else { tabObject[idGroup].addChild(tabObject[idObject]); }
	return [tabObject,tabIdObject];
},


/* M�thode addObjectGroup: Ajoute un objet dans un groupe puis � la sc�ne ou � un autre �l�ment de la sc�ne.
 * Param: idObject: identifiant de l'objet � ajouter.
 *        idGroup: identifiant du groupe, s'il existe d�j�, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
	return [tabObject,tabIdObject];
},


/* M�thode addObjectGroupIn: Ajoute un objet dans un groupe puis � la sc�ne ou � un autre groupe de la sc�ne.
 * Param: idObject: identifiant de l'objet � ajouter.
 *        idGroup: identifiant du groupe, s'il existe d�j�, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
	return [tabObject,tabIdObject];
},


/* M�thode removeObject: retire l'objet de la sc�ne.
 * Param: idObject: identifiant de l'objet � supprimer de la sc�ne.
 * WARNING: les fils de l'objet seront supprim�s
 */
M3D.MOTEUR.removeObject = function(idObject){
	if(tabObject[idObject] != undefined) tabObject[idObject].parent.removeChild(tabObject[idObject]);
	return [tabObject,tabIdObject];
},

/*
// MARCHE PAS POUR L'INSTANT  =>  A VOIR PLUS TARD A LA LIMITE
/* M�thode removeObjectOnly: retire l'objet de la sc�ne et rattache ses fils � l'objet p�re.
 * Param: idObject: identifiant de l'objet � supprimer de la sc�ne.
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

/* M�thode removeGroup: Supprime le groupe et ses fils.
 * Param: idGroup: identifiant du groupe � supprimer de la sc�ne.
 * WARNING: les fils du groupe seront supprim�s
 */
M3D.MOTEUR.removeGroup = function(idGroup){
	if(tabObject[idGroup] != undefined) tabObject[idGroup].parent.removeChild(tabObject[idGroup]);
	return [tabObject,tabIdObject];
},


// MARCHE PAS POUR L'INSTANT =>  A VOIR PLUS TARD A LA LIMITE
/* M�thode removeGroupOnly: Supprime que le groupe, ses fils sont rattach�s � l'objet/groupe parent de celui ci.
 * Param: idGroup: identifiant du groupe � supprimer de la sc�ne.
 */
 /*
M3D.MOTEUR.removeGroupOnly = function(idGroup){
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
M3D.MOTEUR.changeParentObject = function(idObject,idNewParent){
	if(tabObject[idObject] != undefined && tabObject[idNewParent] != undefined){
		tabObject[idObject].parent = tabObject[idNewParent]; 
		tabObject[idNewParent].addChild(tabObject[idObject]);
	}
	return [tabObject,tabIdObject];
},


/***************************************************************
 * Liste de fonctions de gestion du d�placement
 ***************************************************************/

/* M�thode translate: V�rifie la collision sur tout le vecteur de d�placement.
 * Param: id: identifiant de l'�lement que l'on souhaite d�placer
 *		  tabVector: vecteur de 3 coordorn�es x y z repr�sentant le d�placement
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel au d�placement sinon r�f�rentiel absolu
 */
M3D.MOTEUR.translate = function(id,tabVector,idRef){
	if(idRef == null){
		var matrixRef = GLGE.identMatrix();
	}else{
		var matrixRef = tabObject[idRef].getModelMatrix();
	}
	var vectorTranslate = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
	var absoluteTranslation = GLGE.mulMat4Vec4(matrixRef,vectorTranslate);
	var matrixObject = tabObject[id].getModelMatrix();
	var currentRelativePosition = GLGE.Vec4(tabObject[id].getLocX(),tabObject[id].getLocY(),tabObject[id].getLocZ(),1);
	var currentAbsolutePosition = GLGE.mulMat4Vec4(matrixObject,currentRelativePosition);
	var newAbsolutePosition = GLGE.addMat4(currentAbsolutePosition,absoluteTranslation);
	var newRelativePosition = GLGE.mulMat4Vec4(GLGE.inverseMat4(matrixObject),newAbsolutePosition);
	// COLLISION trajectoire
	tabObject[id].setLoc(GLGE.get1basedVec4(newRelativePosition,1),GLGE.get1basedVec4(newRelativePosition,2),GLGE.get1basedVec4(newRelativePosition,3));
//	return tabObject[id];
},


/* M�thode setPosition: D�place l'�l�ment � la position donn�e et v�rifie la collision � l'arriv�e seulement
 * Param: id: identifiant de l'�l�ment que l'on souhaite d�placer
 *		  tabPos : vecteur de 3 coordorn�es x y z repr�sentant la nouvelle position
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la nouvelle position sinon r�f�rentiel absolu
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
	var newRelativePosition = GLGE.mulMat4Vec4(GLGE.inverseMat4(matrixObject),newAbsolutePosition);
	// COLLISION
	tabObject[id].setLoc(GLGE.get1basedVec4(newRelativePosition,1),GLGE.get1basedVec4(newRelativePosition,2),GLGE.get1basedVec4(newRelativePosition,3));
//	return tabObject[id];
},


/* M�thode rotate: Effectue une rotation sur l'�l�ment donn� et v�rifie la collision � l'arriv�e seulement
 * Param: id: identifiant de l'�l�ment que l'on souhaite d�placer
 *		  tabRot : vecteur de 3 coordorn�es repr�sentant la rotation a effectu�
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la rotation sinon r�f�rentiel absolu
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
	// COLLISION
	tabObject[id].setLoc(GLGE.get1basedVec4(newRelativeRotation,1),GLGE.get1basedVec4(newRelativeRotation,2),GLGE.get1basedVec4(newRelativeRotation,3));
//	return tabObject[id];
},


/* M�thode rotate: Change la rotation d'un objet par rapport � un r�f�rentiel
 * Param: id: identifiant de l'�l�ment que l'on souhaite d�placer
 *		  tabRot : vecteur de 3 coordorn�es repr�sentant la rotation a effectu�
 *		  [Optionnel]idRef: identifiant de l'objet servant de r�f�rentiel � la rotation sinon r�f�rentiel absolu
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
	// COLLISION
	tabObject[id].setLoc(GLGE.get1basedVec4(newRelativeRotation,1),GLGE.get1basedVec4(newRelativeRotation,2),GLGE.get1basedVec4(newRelativeRotation,3));
//	return tabObject[id];
},


/* M�thode rescale: Multiplie l'�chelle d'un objet par le coefficient donn�.
 * Param: id: identifiant de l'objet que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multipli� la taille de l'objet
 */
M3D.MOTEUR.rescaleObject = function (id,coefScale){
	var scale = tabObject[id].getScale();
	tabObject[id].setScale(scale.x*coefScale, scale.y*coefScale, scale.z*coefScale);
	return tabObject[id];
},


/***************************************************************
 * Partie de la gestion de la collision
 ***************************************************************/
 
/* M�thode listingTarget: Retourne un tableau de nom
 * Param: idObject: �l�ment concern�
 * Return: tableau des id d'objet � tester
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
},
 
 
/* M�thode collisionPointBoxSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un object O.
 * Param: idObject: identifiant de l'objet � tester.
 * 	   ptX: coordonn�e X du point � tester.
 * 	   ptY: coordonn�e Y du point � tester.
 * 	   ptZ: coordonn�e Z du point � tester.
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
  

/* M�thode collisionBoxBox: Test si 2 objets sont en collision.
 * Param: idObjectOne: identifiant d'un des objets � tester.
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
  

/* M�thode liveCollision: Test si un object est en collision avec un element de la sc�ne.
 * Param: id: identifiant de l'�l�ment � tester.
 * Return: un tableau avec les objets qui sont en collision avec l'objet cible.
 */
M3D.MOTEUR.liveCollision = function(id){
    var objectCol = new Array;
	var tab = M3D.MOTEUR.listingTarget(id);
	for(i=0; i<tab.length; i++){
		if(tab[i] !=  id){
			if(M3D.MOTEUR.collisionBoxBox(tab[i], id)) objectCol.push(tab[i]);
		}
	} return objectCol;
}
 
/***************************************************************
 * Partie de la gestion des forces
 ***************************************************************/

// Ne sera pas impl�ment� dans cette version du moteur


/***************************************************************
 * Partie de la gestion de la cam�ra
 ***************************************************************/

})(M3D);