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
	var tabCamera = new Array;
	var gameScene;
 
 
/* M�thode initialisation.
 * Param: gScene.
 * Return: un tableau contenant le tableau des objets, le tableau des identifiants d'objets et le tableau des cam�ras
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
	
	// Initialisation du tableau des cam�ras
	tabCamera = gameScene.getCamera();
	
	return [tabObject,tabIdObject,tabCamera];
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


/* Fonction init: permet l'initialisation du tableau d'objet et d'identification des objets.
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


/* M�thode getIdOnject.
 * Param: object: object dont on cherche � connaitre le nom.
 * Return: l'identifiant de l'objet en question sinon -1.
 */
M3D.MOTEUR.getIdObject = function(object){
	if(object != null){
		var i;
		for(i=0; i<tabIdObject.length; i++){
			if(object == tabObject[tabIdObject[i]]) return tabIdObject[i];
		}
	}
	alert("The object named "+idObject+" doesn't exist in the scene."); 
	return -1; 
},
 
 
/***************************************************************
 * Liste de fonctions de gestion des objets dans le graphe
 ***************************************************************/

/* M�thode addObject: Ajoute un objet � la sc�ne ou � un object[optionnel].
 * Param: idObject: identifiant de l'objet � ajouter.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets
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
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets
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
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets
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
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets
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
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets.
 * WARNING: les fils de l'objet seront supprim�s
 */
M3D.MOTEUR.removeObject = function(idObject){
	if(tabObject[idObject] != undefined){ 
		tabObject[idObject].parent.removeChild(tabObject[idObject]);
		var tabE = new Array;
		M3D.MOTEUR.removeSearch([tabObject[idObject]], tabE);
		M3D.MOTEUR.removeSuppr(tabE);
		delete tabObject[idObject];
		var tabR = new Array;
		for(var i=0; i<tabIdObject.length; i++){
			if(tabIdObject[i] != undefined && tabIdObject[i] != idObject) tabR[tabR.length] = tabIdObject[i];
		}
	}
	return [tabObject,tabR];
},


/* M�thode removeSearch: r�cup�re tous les fils des �l�ments de la liste qui sont dans la sc�ne.
 * Param: list: liste des �l�ments � retirer de la sc�ne.
 *	      tabE: ensemble des �l�ments qui devront �tre supprim�.
 */
M3D.MOTEUR.removeSearch = function(list, tabE){
	if(list.length!=0){
		var x = list.pop();
		var tabO = x.getChildren();
	
		for(var i=0; i<tabIdObject.length; i++){
			for(var j=0; j<tabO.length; j++){
				if(tabObject[tabIdObject[i]] != undefined && tabObject[tabIdObject[i]] == tabO[j]){
					tabE.push(tabO[j]);
					list.push(tabO[j]);
				}
			}
		} M3D.MOTEUR.removeSearch(list, tabE);
	}
},


/* M�thode removeSuppr: enl�ve tout les �l�ments se trouvant dans le tableau en param�tre des tableaux tabObject et tabIdObject.
 * Param: tabE: ensemble des �l�ments qui devront �tre supprim�.
 */
M3D.MOTEUR.removeSuppr = function(tabE){
	if(tabE.length != 0){
		var obj = tabE.pop();
		for(var i=0; i<tabIdObject.length; i++){
			if(tabObject[tabIdObject[i]] == obj){ delete tabObject[tabIdObject[i]]; delete tabIdObject[i]; break }
		} M3D.MOTEUR.removeSuppr(tabE);
	}
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


/* M�thode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de sc�ne.
 * Param: idObject: identifiant de l'objet dont on veut changer le parent
 *		  idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet
 * Return: un tableau contenant le tableau des objets et le tableau des identifiants d'objets.
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
	var vectorTranslate = GLGE.Vec4(tabVector[0],tabVector[1],tabVector[2],1);
	var absoluteTranslation = GLGE.mulMat4Vec4(matrixRef,vectorTranslate);
	var matrixObject = tabObject[id].getModelMatrix();
	var currentRelativePosition = GLGE.Vec4(tabObject[id].getLocX(),tabObject[id].getLocY(),tabObject[id].getLocZ(),1);
	var currentAbsolutePosition = GLGE.mulMat4Vec4(matrixObject,currentRelativePosition);
	var newAbsolutePosition = GLGE.addMat4(currentAbsolutePosition,absoluteTranslation);
	var newRelativePosition = GLGE.mulMat4Vec4(GLGE.inverseMat4(matrixObject),newAbsolutePosition);
	// COLLISION trajectoire
	tabObject[id].setLoc(GLGE.get1basedVec4(newRelativePosition,1),GLGE.get1basedVec4(newRelativePosition,2),GLGE.get1basedVec4(newRelativePosition,3));
	return tabObject[id];
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
	return tabObject[id];
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
	tabObject[id].setRot(GLGE.get1basedVec4(newRelativeRotation,1),GLGE.get1basedVec4(newRelativeRotation,2),GLGE.get1basedVec4(newRelativeRotation,3));
	return tabObject[id];
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
	tabObject[id].setRot(GLGE.get1basedVec4(newRelativeRotation,1),GLGE.get1basedVec4(newRelativeRotation,2),GLGE.get1basedVec4(newRelativeRotation,3));
	return tabObject[id];
},


/* M�thode rescale: Multiplie l'�chelle d'un objet par le coefficient donn�.
 * Param: id: identifiant de l'objet que l'on souhaite redimensionner
 *		  tabRot : coefficient par lequel multipli� la taille de l'objet
 */
M3D.MOTEUR.rescaleObject = function (id,coefScale){
	var scale = tabObject[id].getScale()
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
	var tabR = new Array;
	var obj = tabObject[idObject];
	
	while(obj.parent != undefined) obj = obj.parent;
	
	var tabO = obj.getChildren();
	var tabL = obj.getLights();
		
	var present = false;
	var j,i;

	for(var i = 0 ; i<tabO.length ; i++){
		for(j=0; j<tabL.length; j++){ if(tabO[i]==tabL[j]) present = true; }
		if(!present){
			if(tabO[i] != tabObject[idObject]){
				tabR[tabR.length] = M3D.MOTEUR.getIdObject(tabO[i]);
			}
		} present = false;
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
		var boxOne = tabObject[idObjectOne].getBoundingVolume();
		var posOne = tabObject[idObjectOne].getPosition();
		var boxTwo = tabObject[idObjectTwo].getBoundingVolume();
		
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
    var tabC = new Array;
	var tab = M3D.MOTEUR.listingTarget(id);
	for(i=0; i<tab.length; i++){
		if(tab[i] !=  id){
			if(M3D.MOTEUR.collisionBoxBox(tab[i], id)) tabC.push(tab[i]);
		}
	} return tabC;
}
 
/***************************************************************
 * Partie de la gestion des forces
 ***************************************************************/

// Ne sera pas impl�ment� dans cette version du moteur


/***************************************************************
 * Partie de la gestion de la cam�ra
 ***************************************************************/

M3D.MOTEUR.getCamera = function(idCamera){
    var camera = tabCamera[idCamera];
    if(camera != null) return camera;
    else{ alert("The camera named "+idCamera+" doesn't exist in the scene."); return -1;}
},

M3D.MOTEUR.addCamera = function(idCamera, tabCoord, idParent){
    tabCamera[idCamera] = new GLGE.Camera();
    tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
    tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
    tabCamera[idCamera].setScale(tabCoord[6]);

    if(tabObject[idParent] == undefined) gameScene.addChild(tabCamera[idCamera]);
    else{
        tabObject[idParent].addChild(tabOject[idObject]);
    }
},

M3D.MOTEUR.addCameraIn = function(idCamera, tabCoord, idGroup){
    tabCamera[idCamera] = new GLGE.Camera();
    tabCamera[idCamera].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
    tabCamera[idCamera].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
    tabCamera[idCamera].setScale(tabCoord[6]);
        
    if(tabObject[idGroup] == undefined){ // V�rifier la gestion du addChild dans un Group...
        tabObject[idGroup] = new GLGE.Group();
        tabObject[idGroup].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
        tabObject[idGroup].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
        tabObject[idGroup].addChild(tabCamera[idCamera]);
        gameScene.addChild(tabObject[idGroup]);
    } else{ tabObject[idGroup].addChild(tabCamera[idCamera]); }
},

M3D.MOTEUR.addCameraGroup = function(idCamera, idGroup, tabCoord, idParent){
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

M3D.MOTEUR.addCameraGroupIn = function(idCamera, idGroup, tabCoord, idParent){
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

M3D.MOTEUR.removeCamera = function(idCamera){
    if(tabCamera[idCamera] != undefined) tabCamera[idCamera].parent.removeChild(tabCamera[idCamera]);
},

M3D.MOTEUR.changeParentCamera = function(idCamera,idNewParent){
    if(tabCamera[idCamera] != undefined && tabObject[idNewParent] != undefined){
        tabCamera[idCamera].parent = tabObject[idNewParent]; 
        tabObject[idNewParent].addChild(tabCamera[idCamera]);
    }
},

M3D.MOTEUR.translateCamera = function(idCamera,tabVector,idRef){
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
M3D.MOTEUR.setPositionCamera = function(idCamera,tabPos,idRef){
    if(idRef == null){
        var M = GLGE.identMatrix();
    }else{
        var M = tabCamera[idRef].getModelMatrix();
    }
    var V = GLGE.Vec4(tabPos[0],tabPos[1],tabPos[2],1);
    var D = GLGE.mulMat4Vec4(M,V);
    tabCamera[idCamera].setLoc(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
}, 
*/

M3D.MOTEUR.rotateCamera = function(idCamera,tabRot,idRef){
    if(idRef == null){
        var M = GLGE.identMatrix();
    }else{
        var M = tabCamera[idRef].getModelMatrix();
    }
    var V = GLGE.Vec4(tabRot[0],tabRot[1],tabRot[2],1);
    var D = GLGE.mulMat4Vec4(M,V);
    tabCamera[idCamera].setRot(GLGE.get1basedVec4(D,1),GLGE.get1basedVec4(D,2),GLGE.get1basedVec4(D,3));
}

})(M3D);