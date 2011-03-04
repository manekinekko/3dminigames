/**
 * Moteur3d de 3DWIGS: moteur_collision.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des collisions.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 

(function(M3D){

/**
 * Méthode listingTarget: Retourne un tableau de nom
 * @param: idObject: élément concerné
 * @return: tableau des id d'objet à tester
 */
	M3D.MOTEUR.listingTarget = function(idObject){
		var tabR = new Array;
		var obj = tabObject[idObject];
	
		while(obj.parent.id != "mainscene") obj = obj.parent;

		var tabO = obj.parent.getChildren();
		var tabL = obj.parent.getLights();
		
		var present = false;
		var j,i;

		for(i=0 ; i<tabO.length ; i++){
			for(j=0; j<tabL.length; j++){ if(tabO[i]==tabL[j]) present = true; }
			if(!present){
				if(tabO[i] != obj && tabO[i] != null){
					tabR[tabR.length] = M3D.MOTEUR.getIdObject(tabO[i]);
				}
			} present = false;
		} return tabR;
	},

 
/**
 * Méthode collisionPointBoxSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un object O.
 * @param: idObject: identifiant de l'objet à tester.
 * 	       ptX: coordonnée X du point à tester.
 * 	       ptY: coordonnée Y du point à tester.
 * 	       ptZ: coordonnée Z du point à tester.
 * @return: s'il y a le point et dans l'objet.
 */
	M3D.MOTEUR.collisionPointBoxSimple = function(idObject, ptX, ptY, ptZ){
		var box = tabObject[idObject].getBoundingVolume();
		var pos = tabObject[idObject].getPosition();
		if(ptX >= box.limits[0]
			&& ptX < box.limits[1]
			&& ptY >= box.limits[2] 
			&& ptY < box.limits[3]
			&& ptZ >= box.limits[4] 
			&& ptZ < box.limits[5]) return true;
		return false;
	},
  

/**
 * Méthode collisionBoxBox: Test si 2 objets sont en collision.
 * @param: idObjectOne: identifiant d'un des objets à tester.
 *         idObjectTwo: identifiant du 2nd objets.
 * @return: si 2 objets sont en collision ou pas.
 */
	M3D.MOTEUR.collisionBoxBox = function(idObjectOne, idObjectTwo){
		var posTwo = tabObject[idObjectTwo].getPosition();
		if(M3D.MOTEUR.collisionPointBoxSimple(idObjectOne, posTwo.x, posTwo.y, posTwo.z)) return true;
		else {
			var boxOne = tabObject[idObjectOne].getBoundingVolume();
			var posOne = tabObject[idObjectOne].getPosition();
			var boxTwo = tabObject[idObjectTwo].getBoundingVolume();		
		
			if(boxOne.limits[0] >= boxTwo.limits[1]      
				|| boxOne.limits[1] <= boxTwo.limits[0] 
				|| boxOne.limits[2] >= boxTwo.limits[3]
				|| boxOne.limits[3] <= boxTwo.limits[2] 	
				|| boxOne.limits[4] >= boxTwo.limits[5]  
				|| boxOne.limits[5] <= boxTwo.limits[4] ) return false;
		} return true;
	},
  

/**
 * Méthode liveCollision: Test si un objet est en collision avec un élément de la scène.
 * @param: id: identifiant de l'élément à tester.
 * @return: un tableau avec les objets qui sont en collision avec l'objet cible.
 */
	M3D.MOTEUR.liveCollision = function(id){
		var tabC = new Array;
		var tab = M3D.MOTEUR.listingTarget(id);
		for(i=0; i<tab.length; i++){
			if(tab[i] !=  id && tab[i]!=null && tab[i] != undefined){
				if(M3D.MOTEUR.collisionBoxBox(tab[i], id)) tabC.push(tab[i]);
			}
		} return tabC;
	};

	
})(window.M3D);