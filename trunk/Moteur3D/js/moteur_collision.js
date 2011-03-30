/**
 * Moteur3d de 3DWIGS: moteur_collision.js
 * Fichier contenant l'ensemble des fonctions liées à la gestion des collisions.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */
 

(function(M3D){

/**
 * Méthode collisionBoxBox: teste la collision entre 2 volumes englobants.
 * @param: boxOne: premier volume englobant.
 * 		   boxTwo: seconde volume englobant.
 * @return: true si les volumes englobants sont en collision, false sinon.
 */
	M3D.MOTEUR.collisionBoxBox = function(boxOne,boxTwo){
		var test = new Array;
		for(var i = 0 ; i < 3 ; i++ ){
			test[i] = ((boxOne.limits[1+2*i]<boxTwo.limits[0+2*i]) || (boxOne.limits[0+2*i]>boxTwo.limits[1+2*i]));
		}
		return (!(test[0] || test[1] || test[2]));
	},

/**
 * Méthode preciseCollision: teste la collision entre tous les colladas de deux groupes.
 * @param: object1: premier groupe.
 * 		   object2: seconde groupe.
 * @return: un tableau dont les éléments sont des tableaux à 2 éléments, noms des colladas en collision.
 */
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

/**
 * Méthode collisionBranch: teste la collision entre tous les colladas de deux groupes dont l'un est descendant d'un autre.
 * @param: objectBranch: premier groupe.
 * 		   object: seconde groupe descendant du premier.
 * @return: un tableau dont les éléments sont des tableaux à 2 éléments, noms des colladas en collision.
 */
	M3D.MOTEUR.collisionBranch = function(objectBranch,object){
		var listPre = [];
		var childrenBranch = M3D.MOTEUR.getAllChildren(objectBranch.id);
		var children = M3D.MOTEUR.getAllChildren(object.id);
		for(var j = 0 ; j < childrenBranch[1].length ; j++){
			for(var k = 0 ; k < children[1].length ; k++){
				if(M3D.MOTEUR.getIndexArray(children[1],childrenBranch[1][j]) == -1){
					var obj1 = M3D.MOTEUR.getObject(childrenBranch[1][j]);
					var obj2 = M3D.MOTEUR.getObject(children[1][k]);
					if(M3D.MOTEUR.collisionBoxBox(obj1.getBoundingVolume(false),obj2.getBoundingVolume(false)))
						listPre.push([M3D.MOTEUR.idColladaToIdGroup(obj1.id),M3D.MOTEUR.idColladaToIdGroup(obj2.id)]);
				}
			}
		}
		return listPre;
	},

/**
 * Méthode testCollision: teste la collision entre tous les colladas d'un groupe et les autres objets de la scène.
 * @param: objectBranch: groupe.
 * @return: un tableau dont les éléments sont des tableaux à 2 éléments, noms des colladas en collision.
 */
	M3D.MOTEUR.testCollision = function(object){
		var sceneAllSon = M3D.MOTEUR.getChildren("mainscene");
		var sceneObjectSon = sceneAllSon[0];
		var boxObject = object.getBoundingVolume(false);
		var fatherBranch = M3D.MOTEUR.getFatherBranch(object);
		var list = [];
		for(var i = 0 ; i<sceneObjectSon.length ; i++){
			var objectI = M3D.MOTEUR.getObject(sceneObjectSon[i]);
			if(objectI == fatherBranch){
				var collisionList = M3D.MOTEUR.collisionBranch(objectI,object);
				list = list.concat(collisionList);
			}else{
				if(M3D.MOTEUR.collisionBoxBox(boxObject,objectI.getBoundingVolume(false))){
					var collisionList = M3D.MOTEUR.preciseCollision(object,objectI);
					list = list.concat(collisionList);
				}
			}
			 
		}
		return list;
	},
	
	// test uniquement entre des objets descendants de fils différents de la scène
	M3D.MOTEUR.testAllCollision = function(){
		var sceneAllSon = M3D.MOTEUR.getChildren("mainscene");
		var sceneObjectSon = sceneAllSon[0];	
		var list = [];
		for(var i = 0 ; i < sceneObjectSon.length ; i++){
			for(var j = i+1 ; j < sceneObjectSon.length ; j++){
				var obj1 = M3D.MOTEUR.getObject(sceneObjectSon[i]);
				var obj2 = M3D.MOTEUR.getObject(sceneObjectSon[j]);
				if(M3D.MOTEUR.collisionBoxBox(obj1.getBoundingVolume(false),obj2.getBoundingVolume(false))){
					var collisionList = M3D.MOTEUR.preciseCollision(obj1,obj2);
					list = list.concat(collisionList);
				}
			}
		}
		return list;
	};
	
})(window.M3D);