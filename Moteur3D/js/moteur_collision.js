/**
 * Moteur3d de 3DWIGS: moteur_collision.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des collisions.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 

(function(M3D){

	M3D.MOTEUR.collisionBoxBox = function(boxOne,boxTwo){
		var test = new Array;
		for(var i = 0 ; i < 3 ; i++ ){
			test[i] = ((boxOne.limits[1+2*i]<boxTwo.limits[0+2*i]) || (boxOne.limits[0+2*i]>boxTwo.limits[1+2*i]));
		}
		return (!(test[0] || test[1] || test[2]));
	},
	
	M3D.MOTEUR.preciseCollision = function(object1,object2){
		var listPre = [];
		var children1 = M3D.MOTEUR.getAllChildren(object1.id);
		var children2 = M3D.MOTEUR.getAllChildren(object2.id);
		for(var j = 0 ; j < children1[1].length ; j++){
			for(var k = 0 ; k < children2[1].length ; k++){
				var obj1 = M3D.MOTEUR.getObject(children1[1][j]);
				var obj2 = M3D.MOTEUR.getObject(children2[1][k]);
				if(obj1 != obj2 && M3D.MOTEUR.collisionBoxBox(obj1.getBoundingVolume(false),obj2.getBoundingVolume(false)))
					listPre.push([M3D.MOTEUR.idColladaToIdGroup(obj1.id),M3D.MOTEUR.idColladaToIdGroup(obj2.id)]);
			}
		}
		return listPre;
	},
	
	M3D.MOTEUR.collisionBranch = function(object){
		var listPre = [];
		var children = M3D.MOTEUR.getAllChildren(object.id);
		for(var j = 0 ; j < children[1].length ; j++){
			for(var k = j+1 ; k < children[1].length ; k++){
				var obj1 = M3D.MOTEUR.getObject(children[1][j]);
				var obj2 = M3D.MOTEUR.getObject(children[1][k]);
				if(M3D.MOTEUR.collisionBoxBox(obj1.getBoundingVolume(false),obj2.getBoundingVolume(false)))
					listPre.push([M3D.MOTEUR.idColladaToIdGroup(obj1.id),M3D.MOTEUR.idColladaToIdGroup(obj2.id)]);
			}
		}
		return listPre;
	},
	
	M3D.MOTEUR.testCollision = function(object){
		var sceneAllSon = M3D.MOTEUR.getChildren("mainscene");
		var sceneObjectSon = sceneAllSon[0];
		var boxObject = object.getBoundingVolume(false);
		var fatherBranch = M3D.MOTEUR.getFatherBranch(object);
		var list = [];
		for(var i = 0 ; i<sceneObjectSon.length ; i++){
			var objectI = M3D.MOTEUR.getObject(sceneObjectSon[i]);
			if(objectI == fatherBranch){
				var collisionList = M3D.MOTEUR.collisionBranch(object);
				list = list.concat(collisionList);
			}else{
				if(M3D.MOTEUR.collisionBoxBox(boxObject,objectI.getBoundingVolume(false))){
					var collisionList = M3D.MOTEUR.preciseCollision(object,objectI);
					list = list.concat(collisionList);
				}
			}
			 
		}
		return list;
	};

	
})(window.M3D);

/**
 * Méthode listingTarget: Retourne un tableau de nom
 * @param: idObject: élément concerné
 * @return: tableau des id d'objet à tester
 *
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
	},*/

 
/**
 * Méthode collisionPointBoxSimple: Test si un pointX (ptX,ptY,ptZ) est en collision avec un object O.
 * @param: idObject: identifiant de l'objet à tester.
 * 	       ptX: coordonnée X du point à tester.
 * 	       ptY: coordonnée Y du point à tester.
 * 	       ptZ: coordonnée Z du point à tester.
 * @return: s'il y a le point et dans l'objet.
 *
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
	},*/
  

/**
 * Méthode collisionBoxBox: Test si 2 objets sont en collision.
 * @param: idObjectOne: identifiant d'un des objets à tester.
 *         idObjectTwo: identifiant du 2nd objets.
 * @return: si 2 objets sont en collision ou pas.
 *
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
	},*/
  

/**
 * Méthode liveCollision: Test si un objet est en collision avec un élément de la scène.
 * @param: id: identifiant de l'élément à tester.
 * @return: un tableau avec les objets qui sont en collision avec l'objet cible.
 *
	M3D.MOTEUR.liveCollision = function(id){
		var tabC = new Array;
		var tab = M3D.MOTEUR.listingTarget(id);
		for(i=0; i<tab.length; i++){
			if(tab[i] !=  id && tab[i]!=null && tab[i] != undefined){
				if(M3D.MOTEUR.collisionBoxBox(tab[i], id)) tabC.push(tab[i]);
			}
		} return tabC;
	};*/