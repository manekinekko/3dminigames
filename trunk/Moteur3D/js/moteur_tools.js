/**
 * Moteur3d de 3DWIGS: moteur_tools.js
 * Fichier contenant l'ensemble des fonctions outils (utilisé que par le moteur).
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){

/////// FONCTIONS POUR LES TABLEAUX

/**
 * Méthode getObject: Retourne l'objet associé à l'identifiant donné (-1 s'il n'existe pas).
 * @param: idObject: identifiant de l'objet que l'on veut récupérer.
 * @return: l'objet s'il existe, -1 sinon.
 */
	M3D.MOTEUR.getObject = function(idObject){
		var object = tabObject[idObject];
		if(object != null ) return object;
		else{ return -1; }
	},

/**
 * Méthode getCamera: Retourne la caméra associé à l'identifiant donné (-1 s'il n'existe pas).
 * @param: idCamera: identifiant de la caméra que l'on veut récupérer.
 * @return: la caméra si elle existe, -1 sinon.
 */
	M3D.MOTEUR.getCamera = function(idCamera){
		var camera = tabCamera[idCamera];
		if(camera != null) return camera;
		else{ return -1;}
	},
	
/**
 * Méthode getObjectOrCamera: Retourne l'objet ou la caméra associé à l'identifiant donné (-1 s'il existe pas).
 * @param: idCamera: identifiant de l'objet ou de la caméra que l'on veut récupérer.
 * @return: l'objet ou la caméra s'il existe, -1 sinon.
 */
	M3D.MOTEUR.getObjectOrCamera = function(id){
		var object = M3D.MOTEUR.getObject(id);
		if(object==-1){
			object = M3D.MOTEUR.getCamera(id);
		}
		return object;
	},

/**
* Méthode getIndexOfCollada: Retourne la position du collada ayant l'identifiant donné dans le tableau des colladas.
* @param: idObject: identifiant de l'objet dont on souhaite récupérer la position.
* @return: la position dans le tableau des colladas de l'identifiant donné.
*/
	M3D.MOTEUR.getIndexOfCollada = function(idObject){
		for(var i = 0 ; i<tabIdObject.length ; i++){
			if(tabIdObject[i] == idObject) return i
		}
		return -1;
	},
		
	/////// FONCTIONS POUR LA GESTION DU GRAPHE 
	
/**
* Méthode getChildren: Retourne les enfants d'un objet ayant l'identifiant donné, triés selon leurs types.
* @param: idObject: identifiant de l'objet dont on veut récupérer les fils.
* @return: un tableau à 4 éléments, dont chacun est un tableau représentant la liste des groupes, des colladas, des caméras et des lumières.
*/
	M3D.MOTEUR.getChildren = function(idObject){
		return M3D.MOTEUR.getChildrenAux(idObject,[[],[],[],[]]);
	},

/**
* Méthode getChildrenAux: Fonction auxiliaire de getChildren : prend en plus un tableau à 4 éléments en arguments pour y ajouter directement les fils.
* @param: idObject: identifiant de l'objet dont on veut récupérer les fils.
*         list: tableau provisoire où ajouter les éléments.
* @return: un tableau à 4 éléments, dont chacun est un tableau représentant la liste des groupes, des colladas, des caméras et des lumières.
*/	
	M3D.MOTEUR.getChildrenAux = function(idObject,list){
		var object = M3D.MOTEUR.getObject(idObject);
		var child = object.getChildren();
		for(var i = 0 ; i<child.length ; i++){
			var s = child[i].id;
			if(s != undefined){
				if(child[i] instanceof GLGE.Group)
					list[0].push(s);
				if(child[i] instanceof GLGE.Collada)
					list[1].push(s);
				if(child[i] instanceof GLGE.Camera)
					list[2].push(s);
				if(child[i] instanceof GLGE.Light)
					list[3].push(s)
			}
		}
		return list;
	},
	
/**
* Méthode getAllChildren: Retourne tous les descendants d'un objet ayant l'identifiant donné, triés selon leurs types.
* @param: idObject: identifiant de l'objet dont on veut récupérer les descendants.
* @return: un tableau à 4 éléments, dont chacun est un tableau représentant la liste des groupes, des colladas, des caméras et des lumières.
*/
	M3D.MOTEUR.getAllChildren = function(idObject){
		if(M3D.MOTEUR.getObject(idObject) instanceof GLGE.Collada){
			var tab = [[],[idObject],[],[]];
		}else{
			var tab = M3D.MOTEUR.getAllChildrenAux([[idObject],[],[],[]],0);
		}
		return tab;
	},

/**
* Méthode getAllChildrenAux: Fonction auxiliaire de getAllChildren : prend en argument le tableau prévisoire et l'indice du groupe à traiter dans list[0].
* @param: list: tableau provisoire où ajouter les éléments.
*         indice: prochain groupe à traiter dans la descendance.
* @return: un tableau à 4 éléments, dont chacun est un tableau représentant la liste des groupes, des colladas, des caméras et des lumières.
*/
	M3D.MOTEUR.getAllChildrenAux = function(list,indice){
		if(indice != list[0].length){
			var idObject = list[0][indice];
			list = M3D.MOTEUR.getChildrenAux(idObject,list);
			return M3D.MOTEUR.getAllChildrenAux(list,indice+1);
		}else{
			return list;
		}
	},
	
/**
 * Méthode getFatherBranch: Retourne l'ancêtre d'un objet qui est fils de la scène.
 * @param: object: élément dont on veut récupérer l'ancêtre.
 * @return: ancêtre de l'objet qui est fils de la scène.
 */
	M3D.MOTEUR.getFatherBranch = function(object){
		var obj = object;
		while(obj.parent != gameScene) obj = obj.parent;
		return obj;
	},
	
	
	/////// FONCTIONS AJOUTES A GLGE

/**
 * Méthode vec4ToVec3: convertit un GLGE.Vec4 en GLGE.Vec3 en supprimant le 4e élément.
 * @param: vec: le vecteur GLGE.Vec4 ou un tableau à convertir.
 * @return: le vecteur GLGE.Vec3 obtenu.
 */
	M3D.MOTEUR.vec4ToVec3 = function(vec){
		return (GLGE.Vec3(vec[0],vec[1],vec[2]));
	},
	
/**
 * Méthode vec3ToVec4: convertit un GLGE.Vec3 en GLGE.Vec4 en ajoutant une nouvelle valeur.
 * @param:  vec: le vecteur GLGE.Vec3 ou un tableau à convertir.
			newValue: nouvelle valeur pour compléter le vecteur.
 * @return: le vecteur GLGE.Vec3 obtenu.
 */
	M3D.MOTEUR.vec3ToVec4 = function(vec,newValue){
		return (GLGE.Vec4(vec[0],vec[1],vec[2],newValue));
	},

/**
 * Méthode addNumVec3: additionne deux GLGE.vec3.
 * @param: vec1: premier vecteur.
 *         vec2: second vecteur.
 * @return: nouveau GLGE.vec3 somme des deux arguments.
 */
	M3D.MOTEUR.addNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])+parseFloat(vec2[0]),parseFloat(vec1[1])+parseFloat(vec2[1]),parseFloat(vec1[2])+parseFloat(vec2[2])));
	},
	
/**
 * Méthode subNumVec3: soustrait deux GLGE.vec3.
 * @param: vec1: premier vecteur.
 *         vec2: vecteur à soustraire au premier.
 * @return: nouveau GLGE.vec3 soustraction des deux arguments.
 */
	M3D.MOTEUR.subNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])-parseFloat(vec2[0]),parseFloat(vec1[1])-parseFloat(vec2[1]),parseFloat(vec1[2])-parseFloat(vec2[2])));
	},

/**
 * Méthode divNumVec3: divise deux GLGE.vec3 (point à point).
 * @param: vec1: vecteur dividende.
 *         vec2: vecteur diviseur.
 * @return: nouveau GLGE.vec3 division des deux arguments.
 */	
	M3D.MOTEUR.divNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])/parseFloat(vec2[0]),parseFloat(vec1[1])/parseFloat(vec2[1]),parseFloat(vec1[2])/parseFloat(vec2[2])));
	},

/**
 * Méthode mulNumVec3: multiplie deux GLGE.vec3 (point à point).
 * @param: vec1: premier vecteur.
 *         vec2: second vecteur.
 * @return: nouveau GLGE.vec3 produit des deux arguments.
 */
	M3D.MOTEUR.mulNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])*parseFloat(vec2[0]),parseFloat(vec1[1])*parseFloat(vec2[1]),parseFloat(vec1[2])*parseFloat(vec2[2])));
	},
	
	//////// FONCTIONS POUR LA POSITION D'UN OBJET PLACEABLE
	
/**
 * Méthode getScaleFromMatrix: extrait d'une GLGE.Mat4 représentant une modelMatrix les coefficients de la matrice d'échelle.
 * @param: matrix: matrce d'où calculer les coefficients de la matrice d'échelle.
 * @return: un tableau de 3 éléments représentant le facteur d'échelle en x,y et z.
 */
	M3D.MOTEUR.getScaleFromMatrix = function(matrix){
		GLGE.setMat4(matrix,0,3,0);
		GLGE.setMat4(matrix,1,3,0);
		GLGE.setMat4(matrix,2,3,0);
		var matrixMT = GLGE.mulMat4(matrix,GLGE.transposeMat4(matrix));
		var scale = new Array();
		for(var i = 0 ; i < 3 ; i++){
			scale.push(Math.sqrt(matrixMT[i+4*i]));
		}
		return scale;
	},
	
/**
 * Méthode getAngleFromTanCos: retourne l'angle entre -pi et pi ayant une tangente et un cosinus donné
 * @param: t: tangente de l'angle cherché
 * @param: c: cosinus de l'angle cherché
 * @return: angle compris entre -pi et pi
 */
 
	M3D.MOTEUR.getAngleFromTanCos = function(t,c){
		var a = Math.atan(t);
		a = a-(t>0)*(c<0)*Math.PI+(t<0)*(c<0)*Math.PI;
		return a;
	},
	
/**
 * Méthode getRotFromRotMatrix: retourne les 3 angles (sous forme d'un tableau) qui permettent de 
 * retrouver la matrice donnée avec les mêmes rotations (valable uniquement pour des rotations dans l'ordre x y z
 * @param: mat: matrice de rotation dont on veut récupérer les angles qui ont permis de la créer
 * @return: un tableau ayant 3 éléments : les angles selon les axes x,y et z
 */
	M3D.MOTEUR.getRotFromRotMatrix = function(mat){
		var mat02 = GLGE.getMat4(mat,0,2);
		if(Math.abs(mat02)==1){ // cas où b = pi/2
			var mat21 = GLGE.getMat4(mat,2,1);
			var mat11 = GLGE.getMat4(mat,1,1);
			var b = mat02*Math.PI/2;
			var c = 0;
			var a = M3D.MOTEUR.getAngleFromTanCos(mat21/mat11,mat11);
		} else {
			var mat01 = GLGE.getMat4(mat,0,1);
			var mat00 = GLGE.getMat4(mat,0,0);
			var mat12 = GLGE.getMat4(mat,1,2);
			var mat22 = GLGE.getMat4(mat,2,2);
			var b = Math.atan(mat02/Math.sqrt(mat00*mat00+mat01*mat01));
			var a = M3D.MOTEUR.getAngleFromTanCos(-mat12/mat22,mat22);
			var c = M3D.MOTEUR.getAngleFromTanCos(-mat01/mat00,mat00);
		}
		return [a,b,c]
	},
	
	
/**
 * Méthode getRotFromMatrix: Retourne les 3 orientations à partir d'une matrice de model
 * @param: mat: modelmatrix
 * @return: les 3 orientations dans un tableau
 */
	M3D.MOTEUR.getRotFromMatrix = function(mat){
		var norVec = GLGE.Vec4(0,0,0,1);
		GLGE.setMat4(mat,0,3,0);
		GLGE.setMat4(mat,1,3,0);
		GLGE.setMat4(mat,2,3,0);
		var matrixMT = GLGE.mulMat4(mat,GLGE.transposeMat4(mat));
		var mat = GLGE.mulMat4(mat,GLGE.translateMatrix(1/GLGE.getMat4(matrixMT,0,0),1/GLGE.getMat4(matrixMT,1,1),1/GLGE.getMat4(matrixMT,2,2)));
		return M3D.MOTEUR.getRotFromRotMatrix(mat);
	},
	
	
/**
 * Méthode getRelativePos: retourne un GLGE.Vec3 comportant la position relativement au père de l'objet donné.
 * @param: object: objet dont il faut calculer la position relative.
 * @return: position relative par rapport à son père.
 */
	M3D.MOTEUR.getRelativePos = function(object){
		var modMat = object.getLocalMatrix();
		var norVec = GLGE.Vec4(0,0,0,1);
		var pos = GLGE.mulMat4Vec4(modMat,norVec);
		return (M3D.MOTEUR.vec4ToVec3(pos));	
	},
		
/**
 * Méthode getAbsolutePos: retourne un GLGE.Vec3 comportant la position absolue d'un objet donné.
 * @param: object: objet dont il faut calculer la position absolute.
 * @return: position absolue.
 */
	M3D.MOTEUR.getAbsolutePos = function(object){
		var modMat = object.getModelMatrix();
		var norVec = GLGE.Vec4(0,0,0,1);
		var pos = GLGE.mulMat4Vec4(modMat,norVec);
		return (M3D.MOTEUR.vec4ToVec3(pos));	
	},
	

/**
 * Méthode getRelativeScale: retourne un GLGE.Vec3 comportant l'échelle relativement au père de l'objet donné.
 * @param: object: objet dont il faut calculer l'échelle relative.
 * @return: échelle relative par rapport à son père.
 */	
	M3D.MOTEUR.getRelativeScale = function(object){
		var modMat = GLGE.Mat4(object.getLocalMatrix());
		return M3D.MOTEUR.getScaleFromMatrix(modMat);
	},

/**
 * Méthode getAbsoluteScale: retourne un GLGE.Vec3 comportant l'échelle absolue d'un objet donné.
 * @param: object: objet dont il faut calculer l'échelle absolue.
 * @return: échelle absolue.
 */
	M3D.MOTEUR.getAbsoluteScale = function(object){
		var modMat = GLGE.Mat4(object.getModelMatrix());
		return M3D.MOTEUR.getScaleFromMatrix(modMat);
	},
		
/**
 * Méthode getRelativeAngle: retourne un GLGE.Vec3 comportant les orientations relativement au père de l'objet donné.
 * @param: object: objet dont il faut calculer l'échelle relative.
 * @return: angles relatifs par rapport à son père.
 */	
	M3D.MOTEUR.getRelativeAngle = function(object){
		var modMat = GLGE.Mat4(object.getLocalMatrix());
		return M3D.MOTEUR.getRotFromMatrix(modMat);
	},

/**
 * Méthode getAbsoluteAngle: retourne un GLGE.Vec3 comportant les orientations absolues d'un objet donné.
 * @param: object: objet dont il faut calculer l'orientation absolue.
 * @return: orientations absolues.
 */
	M3D.MOTEUR.getAbsoluteAngle = function(object){
		var modMat = GLGE.Mat4(object.getModelMatrix());
		return M3D.MOTEUR.getRotFromMatrix(modMat);
	},
	////////////// MISE A JOUR DES DONNEES LOCALES
	
	M3D.MOTEUR.updatePosition = function(gObject){
		var idObject = gObject.id;
		var object = M3D.MOTEUR.getObject(idObject);
		var pos = M3D.MOTEUR.getRelativePos(object);
		gObject.posX = pos[0];
		gObject.posY = pos[1];
		gObject.posZ = pos[2];
	},
	
	M3D.MOTEUR.updateOrientation = function(gObject){
		var idObject = gObject.id;
		var object = M3D.MOTEUR.getObject(idObject);
		var rot = M3D.MOTEUR.getRelativeAngle(object);
		gObject.orX = rot[0];
		gObject.orY = rot[1];
		gObject.orZ = rot[2];	
	},
	
	M3D.MOTEUR.updateScale = function(gObject){
		var idObject = gObject.id;
		var object = M3D.MOTEUR.getObject(idObject);
		var size = M3D.MOTEUR.getRelativeScale(object);
		gObject.sizeX = size[0];
		gObject.sizeY = size[1];
		gObject.sizeZ = size[2];	
	},	
	
	////////////// AUTRES

/**
 * Méthode idColladaToIdGroup: convertit le nom d'un collada en son groupe père (retire le premier caractère).
 * @param: str: chaîne de caractères représentant l'identifiant du collada.
 * @return: chaîne de caractères représent l'identifiant du groupe père.
 */
	M3D.MOTEUR.idColladaToIdGroup = function(str){
		return str.substring(1,str.length);
	},
 
 /**
 * Méthode getIndexArray: renvoie la position d'un élément dans un tableau, -1 sinon.
 * @param: array: tableau où chercher l'élément.
 *         element: élément à chercher dans le tableau
 * @return: la position de l'élément dans le tableau s'il est dedans, -1 sinon.
 */
	M3D.MOTEUR.getIndexArray = function(array,element){
		for(var i = 0 ; i<array.length ; i++){
			if(array[i] == element) return i
		}
		return -1;
	},
	
	
	// ecart entre deux box, l'inférieur de la 1 et le supérieur de la 2 selon la dimension dim.
	M3D.MOTEUR.ecart = function(idObject1,idObject2,dimension){
		var obj1 = M3D.MOTEUR.getObject(idObject1);
		var obj2 = M3D.MOTEUR.getObject(idObject2);
		var box1 = obj1.getBoundingVolume(false);
		var box2 = obj2.getBoundingVolume(false);
		return (box1.limits[2*dimension] - box2.limits[2*dimension+1]);

	};
 
})(window.M3D);