/**
 * Moteur3d de 3DWIGS: moteur_management.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des objets.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){
 
/**
 * Méthode addObject: Ajoute un objet à la scène ou à un objet[optionnel].
 * @param: idObject: identifiant de l'objet à ajouter.
 *   	   urlObject: adresse du fichier collada de l'objet à ajouter.
 *         tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
	M3D.MOTEUR.addObject = function(idObject,urlObject, tabCoord, idParent){
		if(tabObject[idObject] == undefined){
			tabObject[idObject]= new GLGE.Collada();
			tabObject[idObject].setDocument(urlObject);
			tabObject[idObject].setLoc(tabCoord[0], tabCoord[1], tabCoord[2]);
			tabObject[idObject].setRot(tabCoord[3], tabCoord[4], tabCoord[5]);
			tabObject[idObject].setScale(tabCoord[6]);
			tabIdObject[tabIdObject.length] = idObject;
		
			if(tabObject[idParent] == undefined){
				gameScene.addChild(tabObject[idObject]);
				tab = M3D.MOTEUR.liveCollision(idObject);
				if(tab.length != 0){ 
					gameScene.removeChild(tabObject[idObject]);
					delete tabObject[idObject];
				}
			} else { 
				tabObject[idParent].addChild(tabObject[idObject]);
				tab = M3D.MOTEUR.liveCollision(idObject);
				if(tab.length != 0){ 
					tabObject[idParent].removeChild(tabObject[idObject]);
					delete tabObject[idObject];
				}
			}
		}
	},


/**
 * Méthode addObjectIn: Ajoute un objet à un groupe prédéfini.
 * @param: idObject: identifiant de l'objet à ajouter.
 *     	   urlObject: adresse du fichier collada de l'objet à ajouter.
 *         tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		   idGroup: identifiant du groupe auquel on rattache l'objet, s'il n'existe pas, il est créé.
 */
	M3D.MOTEUR.addObjectIn = function(idObject,urlObject, tabCoord, idGroup){
		if(tabObject[idObject] == undefined){
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
				
				tab = M3D.MOTEUR.liveCollision(idObject);
				if(tab.length != 0){ 
					gameScene.removeChild(tabObject[idGroup]);
					delete tabObject[idObject];
					delete tabObject[idGroup];
				}				
			} else { 
				tabObject[idGroup].addChild(tabObject[idObject]); 

				tab = M3D.MOTEUR.liveCollision(idObject);
				if(tab.length != 0){ 
					gameScene.removeChild(tabObject[idObject]);
					delete tabObject[idObject];
				}
			}
		}
	},


/**
 * Méthode addObjectGroup: Ajoute un objet dans un groupe puis à la scène ou à un autre élément de la scène.
 * @param: idObject: identifiant de l'objet à ajouter.
 *         idGroup: identifiant du groupe, s'il existe déjà, rien ne se passe.
 *   	   urlObject: adresse du fichier collada de l'objet à ajouter.
 *         tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
	M3D.MOTEUR.addObjectGroup = function(idObject, idGroup, urlObject, tabCoord, idParent){
		if(tabObject[idObject] == undefined){
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
			
				if(idParent == null){ 
					gameScene.addChild(tabObject[idGroup]);
					
					tab = M3D.MOTEUR.liveCollision(idObject);
					if(tab.length != 0){ 
						gameScene.removeChild(tabObject[idGroup]);
						delete tabObject[idObject];
						delete tabObject[idGroup];
					}
				} else { 
					if(tabObject[idParent] != undefined){ 
						tabObject[idParent].addChild(tabObject[idObject]);
						
						tab = M3D.MOTEUR.liveCollision(idObject);
						if(tab.length != 0){ 
							tabObject[idParent].removeChild(tabObject[idGroup]);
							delete tabObject[idObject];
							delete tabObject[idGroup];
						}
					}
				}
			}
		}
	},


/**
 * Méthode addObjectGroupIn: Ajoute un objet dans un groupe puis à la scène ou à un autre groupe de la scène.
 * @param: idObject: identifiant de l'objet à ajouter.
 *        idGroup: identifiant du groupe, s'il existe déjà, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet à ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattaché à la scène.
 */
	M3D.MOTEUR.addObjectGroupIn = function(idObject, idGroup, urlObject, tabCoord, idParent){
		if(tabObject[idObject] == undefined){
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
			
				if(idParent == null){ 
					gameScene.addChild(tabObject[idGroup]);
					
					tab = M3D.MOTEUR.liveCollision(idObject);
					if(tab.length != 0){ 
						gameScene.removeChild(tabObject[idGroup]);
						delete tabObject[idObject];
						delete tabObject[idGroup];
					}
				} else { 
					if(tabObject[idParent] != undefined){
						tabObject[idParent].addChild(tabObject[idObject]);
						
						tab = M3D.MOTEUR.liveCollision(idObject);
						if(tab.length != 0){ 
							tabObject[idParent].removeChild(tabObject[idGroup]);
							delete tabObject[idObject];
							delete tabObject[idGroup];
						}
					}
				}
			}
		}
	},
	
	
/**
 * Méthode removeSearch: récupère tous les fils des éléments de la liste qui sont dans la scène.
 * @param: list: liste des éléments à retirer de la scène.
 *	       tabE: ensemble des éléments qui devront être supprimé.
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


/**
 * Méthode removeSuppr: enlève tout les éléments se trouvant dans le tableau en paramètre des tableaux tabObject et tabIdObject.
 * @param: tabE: ensemble des éléments qui devront être supprimé.
 */
	M3D.MOTEUR.removeSuppr = function(tabE){
		if(tabE.length != 0){
			var obj = tabE.pop();
			for(var i=0; i<tabIdObject.length; i++){
				if(tabObject[tabIdObject[i]] == obj){ delete tabObject[tabIdObject[i]]; delete tabIdObject[i]; break }
			} M3D.MOTEUR.removeSuppr(tabE);
		}
	},


/**
 * Méthode removeObject: retire l'objet de la scène.
 * WARNING: les fils de l'objet seront supprimés
 * @param: idObject: identifiant de l'objet à supprimer de la scène.
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


/**
 * Méthode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de scène.
 * WARNING: les fils de l'objet changeront aussi de parent
 * @param: idObject: identifiant de l'objet dont on veut changer le parent
 *		   [Optionnel]idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet si pas présent, l'objet sera rattaché à la scène.
 */
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
	};
	
})(window.M3D);
