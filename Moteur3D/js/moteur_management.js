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
 * @param: idObject: identifiant de l'objet à ajouter.
 *   	   urlObject: adresse du fichier collada de l'objet à ajouter.
 *         tabCoord: tableau de taille 9, avec les coord positions, rotations et taille de l'objet par rapport à son éventuel père !
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
	M3D.MOTEUR.addObject = function(idObject,urlObject, tabCoord, idParent){
		var group = new GLGE.Group();
		group.id = idObject;
		var object = new GLGE.Collada();
		var idCollada = "#"+idObject;
		object.id = idCollada;
		object.setDocument(urlObject);
		group.addChild(object);
		var transMat = GLGE.translateMatrix(tabCoord[0], tabCoord[1], tabCoord[2]);
		var rotMat = GLGE.rotateMatrix(tabCoord[3], tabCoord[4], tabCoord[5]);
		var scaleMat = GLGE.scaleMatrix(tabCoord[6], tabCoord[7], tabCoord[8]);
		var localMatrix = GLGE.mulMat4(transMat,GLGE.mulMat4(rotMat,scaleMat));
		group.setStaticMatrix(localMatrix);
		//group.setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		//group.setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		//group.setScale(tabCoord[6], tabCoord[7], tabCoord[8]);
		if(idParent == null){
			var parent = gameScene;
		} else {
			var parent = M3D.MOTEUR.getObject(idParent);
		}
		parent.addChild(group);
		tabObject[idObject] = group;
		tabObject[idCollada] = object;
		tabIdObject.push(idCollada);
		// COLLISION
	},
	
/**
 * Méthode addObject: Ajoute un groupe dans la scène.
 * @param: idGroup: identifiant du groupe à ajouter.
 *         tabCoord: tableau de taille 9, avec les coord positions, rotations et taille du groupe par rapport à son éventuel père !
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache le groupe sinon rattaché à la scène.
 */
	M3D.MOTEUR.addGroup = function(idGroup, tabCoord, idParent){
		var group = new GLGE.Group();
		group.id = idGroup;
		var transMat = GLGE.translateMatrix(tabCoord[0], tabCoord[1], tabCoord[2]);
		var rotMat = GLGE.rotateMatrix(tabCoord[3], tabCoord[4], tabCoord[5]);
		var scaleMat = GLGE.scaleMatrix(tabCoord[6], tabCoord[7], tabCoord[8]);
		var localMatrix = GLGE.mulMat4(transMat,GLGE.mulMat4(rotMat,scaleMat));
		group.setStaticMatrix(localMatrix);
		//group.setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
		//group.setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
		//group.setScale(tabCoord[6], tabCoord[7], tabCoord[8]);
		if(idParent == null){
			var parent = gameScene;
		} else {
			var parent = M3D.MOTEUR.getObject(idParent);
		}
		parent.addChild(group);
		tabObject[idGroup] = group;
		// COLLISION
	},

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
	
	M3D.MOTEUR.changeParent = function(idObject,idNewParent){
		var object = M3D.MOTEUR.getObjectOrCamera(idObject);
		var currentParent = object.parent;
		var modelMatrix = object.getModelMatrix();
		if(idNewParent == null){
			var newParent = gameScene;
		}else{
			var newParent = M3D.MOTEUR.getObject(idNewParent);
		}
		var newParentModelMatrix = newParent.getModelMatrix();
		var newLocalMatrix = GLGE.mulMat4(GLGE.inverseMat4(newParentModelMatrix),modelMatrix);
		
		currentParent.removeChild(object);
		newParent.addChild(object);
		object.setStaticMatrix(newLocalMatrix);
		
	};
	
})(window.M3D);


/**
 * Méthode removeSearch: récupère tous les fils des éléments de la liste qui sont dans la scène.
 * @param: list: liste des éléments à retirer de la scène.
 *	       tabE: ensemble des éléments qui devront être supprimé.
 *
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
	},*/

/**
 * Méthode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de scène.
 * WARNING: les fils de l'objet changeront aussi de parent
 * @param: idObject: identifiant de l'objet dont on veut changer le parent
 *		   [Optionnel]idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet si pas présent, l'objet sera rattaché à la scène.
 *
	M3D.MOTEUR.changeParentObject = function(idObject,idNewParent){
		if(idNewParent!=null){
			if(tabObject[idObject] != undefined && tabObject[idNewParent] != undefined){
				tabObject[idObject].parent = tabObject[idNewParent]; 
				tabObject[idNewParent].addChild(tabObject[idObject]);
			}
		} else {
			if(tabObject[idObject] != undefined){
				tabObject[idObject].parent = gameScene; 
				gameScene.addChild(tabObject[idObject]);
			}
		}
	},	*/
	
/**
 * Méthode randomAddObject: Ajoute un élément aléatoirement sur la map, s'il est pressé, rien ne se passe.
 * @param: idObject: identifiant de l'objet que l'on veut ajouter.
 *		   urlObject: adresse du fichier collada à ajouter.
 *
	M3D.MOTEUR.randomAddObject = function(idObject, urlObject){
		var ok = false;
		if(tabObject[idObject] == undefined){
			tabObject[idObject] = new GLGLE.Collada();
			tabObject[idObject].setDocument(urlObject);
			gameScene.addChild(tabObject[idObject]);
			tabIdObject[tabIdObject.length] = idObject;
			
			var coordMap = M3D.MOTEUR.getEnvironnement();
			var coordAl = [Math.random()*10, Math.random()*10, Math.random()*10];
			var coord = [coordMap[0]/coordAl[0],coordMap[1]/coordAl[1],coordMap[2]/coordAl[2]];
			
			while(!ok){
				if(M3D.MOTEUR.testPlacement(tabObject[idObject])){
					tab = M3D.MOTEUR.liveCollision(idObject);
					if(tab.length != 0){
						coordAl = [Math.random()*10, Math.random()*10, Math.random()*10];
						coord = [coordMap[0]/coordAl[0],coordMap[1]/coordAl[1],coordMap[2]/coordAl[2]];
					} else {ok = true;}
				} else {
					coordAl = [Math.random()*10, Math.random()*10, Math.random()*10];
					coord = [coordMap[0]/coordAl[0],coordMap[1]/coordAl[1],coordMap[2]/coordAl[2]];
				}
			}
		}
	},*/
	
/**
 * Méthode testPlacement: Test si l'objet en paramètre se situe correctement sur la map.
 * @return true si l'objet est placé correctement sinon false.
 *
	M3D.MOTEUR.testPlacement = function(idObject){},*/
	
	
	
/**
 * Méthode removeSuppr: enlève tout les éléments se trouvant dans le tableau en paramètre des tableaux tabObject et tabIdObject.
 * @param: tabE: ensemble des éléments qui devront être supprimé.
 *
	M3D.MOTEUR.removeSuppr = function(tabE){
		if(tabE.length != 0){
			var obj = tabE.pop();
			for(var i=0; i<tabIdObject.length; i++){
				if(tabObject[tabIdObject[i]] == obj){ delete tabObject[tabIdObject[i]]; delete tabIdObject[i]; break }
			} M3D.MOTEUR.removeSuppr(tabE);
		}
	},*/


/**
 * Méthode removeObject: retire l'objet de la scène.
 * WARNING: les fils de l'objet seront supprimés
 * @param: idObject: identifiant de l'objet à supprimer de la scène.
 *
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
	};*/
