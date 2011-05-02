/**
 * Moteur3d de 3DWIGS: moteur_physique.js
 * Fichier contenant l'ensemble des fonctions liées à la ph.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */

 if(!window["M3D"]){
	window["M3D"] = {};
}

if(!window["M3D"].MOTEUR){
	window["M3D"].MOTEUR = {};
}

(function(M3D){

/**
 * Méthode setGravite: initialise la gravité.
 * @param: newGravite: vecteur [x,y,z], [0,-9.8,0] pour la Terre par exemple.
 */
	M3D.MOTEUR.setGravite = function(newGravite){
		gravite = newGravite;
	},
	
/**
 * Méthode setCoefFrottement: initialise le coefficient de frottement.
 * @param: newCoef: entier représentant le coefficient.
 */
	M3D.MOTEUR.setCoefFrottement = function(newCoef){
		coefFrottement = newCoef;
	},
	
/**
 * Méthode applyVitesse: retourne la nouvelle vitesse d'un objet.
 * @param: gObject: objet auquel on veut appliquer la vitesse.
 * @return: nouvelle vitesse de l'objet.
 */
	M3D.MOTEUR.applyVitesse = function(gObject){
		var idObject = gObject.id;
		var acc = gObject.acceleration;
		var vit = gObject.vitesse;
		for(var i = 0; i < 3 ; i++){
			if(vit[i]>0){
				vit[i] = Math.max(0,vit[i]-coefFrottement*vit[i]);
			}else if(vit[i]<0){
				vit[i] = Math.min(0,vit[i]-coefFrottement*vit[i]);
			}
			vit[i] += acc[i];
			if(Math.abs(vit[i])<0.01){
				vit[i]=0;
			}
		}
		gObject.vitesse = vit;
		return M3D.MOTEUR.translate(gObject,vit,true,idObject);
	},
	
/**
 * Méthode applyVitesseGravity: retourne la nouvelle vitesse d'un objet en appliquant la gravité.
 * @param: gObject: objet auquel on veut appliquer la vitesse.
 * @return: nouvelle vitesse de l'objet.
 */	
	M3D.MOTEUR.applyVitesseGravity = function(gObject){
		var idObject = gObject.id;
		var acc = gObject.acceleration;
		var vit = gObject.vitesse;
		for(var i = 0; i < 3 ; i++){
			if(vit[i]>0){
				vit[i] = Math.max(0,vit[i]-coefFrottement*vit[i]);
			}else if(vit[i]<0){
				vit[i] = Math.min(0,vit[i]-coefFrottement*vit[i]);
			}
			vit[i] += acc[i] + gObject.masse*gravite[i];
			if(Math.abs(vit[i])<0.0001){
				vit[i]=0;
			}
		}
		gObject.vitesse = vit;
		return M3D.MOTEUR.translate(gObject,vit,true,idObject);
	},
	
/**
 * Méthode applyPhysique: applique la physique sur deux listes, la première sans la gravité et la seconde avec la gravité.
 * @param: gObjList: liste d'objets auxquels on veut appliquer la physique (sans la gravité).
 *		   gGObjList: liste d'objets auxquels on veut appliquer la physique (avec la gravité).
 * @return: tableau dont chaque élément est un tableau des collisions pour chaque objet.
 */
	// applique la physique sur la première liste, et la physique incluant la gravite sur la seconde
	// renvoie un tableau dont chaque élément est un tableau des collisions pour chaque objet
	M3D.MOTEUR.applyPhysique = function(gObjList,gGObjList){
		var tab = [];
		for(var i = 0 ; i < gObjList.length ; i++){
			tab.push(M3D.MOTEUR.applyVitesse(gObjList[i]));
		}
		for(var i = 0 ; i < gGObjList.length ; i++){
			tab.push(M3D.MOTEUR.applyVitesseGravity(gGObjList[i]));
		}
		return tab;
	};
	

})(M3D);