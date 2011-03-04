/**
 * Moteur3d de 3DWIGS: moteur_management.js
 * Fichier contenant l'ensemble des fonctions li�es � la gestion des objets.
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){
 
/**
 * M�thode addObject: Ajoute un objet � la sc�ne ou � un objet[optionnel].
 * @param: idObject: identifiant de l'objet � ajouter.
 *   	   urlObject: adresse du fichier collada de l'objet � ajouter.
 *         tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
 * M�thode addObjectIn: Ajoute un objet � un groupe pr�d�fini.
 * @param: idObject: identifiant de l'objet � ajouter.
 *     	   urlObject: adresse du fichier collada de l'objet � ajouter.
 *         tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		   idGroup: identifiant du groupe auquel on rattache l'objet, s'il n'existe pas, il est cr��.
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
 * M�thode addObjectGroup: Ajoute un objet dans un groupe puis � la sc�ne ou � un autre �l�ment de la sc�ne.
 * @param: idObject: identifiant de l'objet � ajouter.
 *         idGroup: identifiant du groupe, s'il existe d�j�, rien ne se passe.
 *   	   urlObject: adresse du fichier collada de l'objet � ajouter.
 *         tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		   [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
 * M�thode addObjectGroupIn: Ajoute un objet dans un groupe puis � la sc�ne ou � un autre groupe de la sc�ne.
 * @param: idObject: identifiant de l'objet � ajouter.
 *        idGroup: identifiant du groupe, s'il existe d�j�, rien ne se passe.
 *   	  urlObject: adresse du fichier collada de l'objet � ajouter.
 *        tabCoord: tableau de taille 7, avec les coord positions, rotations et taille de l'objet.
 *		  [Optionnel]idParent: identifiant du parent auquel on rattache l'objet sinon objet rattach� � la sc�ne.
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
 * M�thode removeSearch: r�cup�re tous les fils des �l�ments de la liste qui sont dans la sc�ne.
 * @param: list: liste des �l�ments � retirer de la sc�ne.
 *	       tabE: ensemble des �l�ments qui devront �tre supprim�.
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
 * M�thode removeSuppr: enl�ve tout les �l�ments se trouvant dans le tableau en param�tre des tableaux tabObject et tabIdObject.
 * @param: tabE: ensemble des �l�ments qui devront �tre supprim�.
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
 * M�thode removeObject: retire l'objet de la sc�ne.
 * WARNING: les fils de l'objet seront supprim�s
 * @param: idObject: identifiant de l'objet � supprimer de la sc�ne.
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


/**
 * M�thode changeParentObject: Change l'attachement d'un objet et de ses fils dans le graphe de sc�ne.
 * WARNING: les fils de l'objet changeront aussi de parent
 * @param: idObject: identifiant de l'objet dont on veut changer le parent
 *		   [Optionnel]idNewParent: identifiant du nouveau parent auquel on veut rattacher l'objet si pas pr�sent, l'objet sera rattach� � la sc�ne.
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
