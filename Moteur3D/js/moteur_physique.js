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

	// gravite [0,-9.8,0] * temps de refresh en seconde au carré
	M3D.MOTEUR.setGravite = function(newGravite){
		gravite = newGravite;
	},
	
	// juste un entier
	M3D.MOTEUR.setCoefFrottement = function(newCoef){
		coefFrottement = newCoef;
	},
	
	// calcule la nouvelle vitesse
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
	
	// calcule la nouvelle vitesse en appliquant la gravite
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