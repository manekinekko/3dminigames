/**
 * Moteur3d de 3DWIGS: moteur_management.js
 * Fichier contenant l'ensemble des fonctions li�es � la gestion des objets.
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){
 
/**
 * M�thode addObject: Ajoute un objet dans la sc�ne.
 * @param: idObject: identifiant de l'objet � ajouter.
 *   	   urlObject: adresse du fichier collada de l'objet � ajouter.
 *         tabCoord: tableau de taille 9, avec les coord positions, rotations et taille de l'objet par rapport � son �ventuel p�re !
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
 * M�thode addObject: Ajoute un groupe dans la sc�ne.
 * @param: idGroup: identifiant du groupe � ajouter.
 *         tabCoord: tableau de taille 9, avec les coord positions, rotations et taille du groupe par rapport � son �ventuel p�re !
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache le groupe sinon rattach� � la sc�ne.
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
 * M�thode removeSearch: r�cup�re tous les fils des �l�ments de la liste qui sont dans la sc�ne.
 * @param: list: liste des �l�ments � retirer de la sc�ne.
 *	       tabE: ensemble des �l�ments qui devront �tre supprim�.
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
 * M�thode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de sc�ne.
 * WARNING: les fils de l'objet changeront aussi de parent
 * @param: idObject: identifiant de l'objet dont on veut changer le parent
 *		   [Optionnel]idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet si pas pr�sent, l'objet sera rattach� � la sc�ne.
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
 * M�thode randomAddObject: Ajoute un �l�ment al�atoirement sur la map, s'il est press�, rien ne se passe.
 * @param: idObject: identifiant de l'objet que l'on veut ajouter.
 *		   urlObject: adresse du fichier collada � ajouter.
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
 * M�thode testPlacement: Test si l'objet en param�tre se situe correctement sur la map.
 * @return true si l'objet est plac� correctement sinon false.
 *
	M3D.MOTEUR.testPlacement = function(idObject){},*/
	
	
	
/**
 * M�thode removeSuppr: enl�ve tout les �l�ments se trouvant dans le tableau en param�tre des tableaux tabObject et tabIdObject.
 * @param: tabE: ensemble des �l�ments qui devront �tre supprim�.
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
 * M�thode removeObject: retire l'objet de la sc�ne.
 * WARNING: les fils de l'objet seront supprim�s
 * @param: idObject: identifiant de l'objet � supprimer de la sc�ne.
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
