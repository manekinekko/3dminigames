/**
 * Moteur3d de 3DWIGS: moteur_tools.js
 * Fichier contenant l'ensemble des fonctions outils (utilis� que par le moteur).
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){

/////// FONCTIONS POUR LES TABLEAUX

/**
 * M�thode getObject: Retourne l'objet associ� � l'identifiant donn� (-1 s'il n'existe pas).
 * @param: idObject: identifiant de l'objet que l'on veut r�cup�rer.
 * @return: l'objet s'il existe, -1 sinon.
 */
	M3D.MOTEUR.getObject = function(idObject){
		var object = tabObject[idObject];
		if(object != null ) return object;
		else{ return -1; }
	},

/**
 * M�thode getCamera: Retourne la cam�ra associ� � l'identifiant donn� (-1 s'il n'existe pas).
 * @param: idCamera: identifiant de la cam�ra que l'on veut r�cup�rer.
 * @return: la cam�ra si elle existe, -1 sinon.
 */
	M3D.MOTEUR.getCamera = function(idCamera){
		var camera = tabCamera[idCamera];
		if(camera != null) return camera;
		else{ return -1;}
	},
	
/**
 * M�thode getObjectOrCamera: Retourne l'objet ou la cam�ra associ� � l'identifiant donn� (-1 s'il existe pas).
 * @param: idCamera: identifiant de l'objet ou de la cam�ra que l'on veut r�cup�rer.
 * @return: l'objet ou la cam�ra s'il existe, -1 sinon.
 */
	M3D.MOTEUR.getObjectOrCamera = function(id){
		var object = M3D.MOTEUR.getObject(id);
		if(object==-1){
			object = M3D.MOTEUR.getCamera(id);
		}
		return object;
	},

/**
* M�thode getIndexOfCollada: Retourne la position du collada ayant l'identifiant donn� dans le tableau des colladas.
* @param: idObject: identifiant de l'objet dont on souhaite r�cup�rer la position.
* @return: la position dans le tableau des colladas de l'identifiant donn�.
*/
	M3D.MOTEUR.getIndexOfCollada = function(idObject){
		for(var i = 0 ; i<tabIdObject.length ; i++){
			if(tabIdObject[i] == idObject) return i
		}
		return -1;
	},
		
	/////// FONCTIONS POUR LA GESTION DU GRAPHE 
	
/**
* M�thode getChildren: Retourne les enfants d'un objet ayant l'identifiant donn�, tri�s selon leurs types.
* @param: idObject: identifiant de l'objet dont on veut r�cup�rer les fils.
* @return: un tableau � 4 �l�ments, dont chacun est un tableau repr�sentant la liste des groupes, des colladas, des cam�ras et des lumi�res.
*/
	M3D.MOTEUR.getChildren = function(idObject){
		return M3D.MOTEUR.getChildrenAux(idObject,[[],[],[],[]]);
	},

/**
* M�thode getChildrenAux: Fonction auxiliaire de getChildren : prend en plus un tableau � 4 �l�ments en arguments pour y ajouter directement les fils.
* @param: idObject: identifiant de l'objet dont on veut r�cup�rer les fils.
*         list: tableau provisoire o� ajouter les �l�ments.
* @return: un tableau � 4 �l�ments, dont chacun est un tableau repr�sentant la liste des groupes, des colladas, des cam�ras et des lumi�res.
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
* M�thode getAllChildren: Retourne tous les descendants d'un objet ayant l'identifiant donn�, tri�s selon leurs types.
* @param: idObject: identifiant de l'objet dont on veut r�cup�rer les descendants.
* @return: un tableau � 4 �l�ments, dont chacun est un tableau repr�sentant la liste des groupes, des colladas, des cam�ras et des lumi�res.
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
* M�thode getAllChildrenAux: Fonction auxiliaire de getAllChildren : prend en argument le tableau pr�visoire et l'indice du groupe � traiter dans list[0].
* @param: list: tableau provisoire o� ajouter les �l�ments.
*         indice: prochain groupe � traiter dans la descendance.
* @return: un tableau � 4 �l�ments, dont chacun est un tableau repr�sentant la liste des groupes, des colladas, des cam�ras et des lumi�res.
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
 * M�thode getFatherBranch: Retourne l'anc�tre d'un objet qui est fils de la sc�ne.
 * @param: object: �l�ment dont on veut r�cup�rer l'anc�tre.
 * @return: anc�tre de l'objet qui est fils de la sc�ne.
 */
	M3D.MOTEUR.getFatherBranch = function(object){
		var obj = object;
		while(obj.parent != gameScene) obj = obj.parent;
		return obj;
	},
	
	
	/////// FONCTIONS AJOUTES A GLGE

/**
 * M�thode vec4ToVec3: convertit un GLGE.Vec4 en GLGE.Vec3 en supprimant le 4e �l�ment.
 * @param: vec: le vecteur GLGE.Vec4 ou un tableau � convertir.
 * @return: le vecteur GLGE.Vec3 obtenu.
 */
	M3D.MOTEUR.vec4ToVec3 = function(vec){
		return (GLGE.Vec3(vec[0],vec[1],vec[2]));
	},
	
/**
 * M�thode vec3ToVec4: convertit un GLGE.Vec3 en GLGE.Vec4 en ajoutant une nouvelle valeur.
 * @param:  vec: le vecteur GLGE.Vec3 ou un tableau � convertir.
			newValue: nouvelle valeur pour compl�ter le vecteur.
 * @return: le vecteur GLGE.Vec3 obtenu.
 */
	M3D.MOTEUR.vec3ToVec4 = function(vec,newValue){
		return (GLGE.Vec4(vec[0],vec[1],vec[2],newValue));
	},

/**
 * M�thode addNumVec3: additionne deux GLGE.vec3.
 * @param: vec1: premier vecteur.
 *         vec2: second vecteur.
 * @return: nouveau GLGE.vec3 somme des deux arguments.
 */
	M3D.MOTEUR.addNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])+parseFloat(vec2[0]),parseFloat(vec1[1])+parseFloat(vec2[1]),parseFloat(vec1[2])+parseFloat(vec2[2])));
	},
	
/**
 * M�thode subNumVec3: soustrait deux GLGE.vec3.
 * @param: vec1: premier vecteur.
 *         vec2: vecteur � soustraire au premier.
 * @return: nouveau GLGE.vec3 soustraction des deux arguments.
 */
	M3D.MOTEUR.subNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])-parseFloat(vec2[0]),parseFloat(vec1[1])-parseFloat(vec2[1]),parseFloat(vec1[2])-parseFloat(vec2[2])));
	},

/**
 * M�thode divNumVec3: divise deux GLGE.vec3 (point � point).
 * @param: vec1: vecteur dividende.
 *         vec2: vecteur diviseur.
 * @return: nouveau GLGE.vec3 division des deux arguments.
 */	
	M3D.MOTEUR.divNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])/parseFloat(vec2[0]),parseFloat(vec1[1])/parseFloat(vec2[1]),parseFloat(vec1[2])/parseFloat(vec2[2])));
	},

/**
 * M�thode mulNumVec3: multiplie deux GLGE.vec3 (point � point).
 * @param: vec1: premier vecteur.
 *         vec2: second vecteur.
 * @return: nouveau GLGE.vec3 produit des deux arguments.
 */
	M3D.MOTEUR.mulNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])*parseFloat(vec2[0]),parseFloat(vec1[1])*parseFloat(vec2[1]),parseFloat(vec1[2])*parseFloat(vec2[2])));
	},
	
	//////// FONCTIONS POUR LA POSITION D'UN OBJET PLACEABLE
	
/**
 * M�thode getScaleFromMatrix: extrait d'une GLGE.Mat4 repr�sentant une modelMatrix les coefficients de la matrice d'�chelle.
 * @param: matrix: matrce d'o� calculer les coefficients de la matrice d'�chelle.
 * @return: un tableau de 3 �l�ments repr�sentant le facteur d'�chelle en x,y et z.
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
 * M�thode getRelativePos: retourne un GLGE.Vec3 comportant la position relativement au p�re de l'objet donn�.
 * @param: object: objet dont il faut calculer la position relative.
 * @return: position relative par rapport � son p�re.
 */
	M3D.MOTEUR.getRelativePos = function(object){
		var modMat = object.getLocalMatrix();
		var norVec = GLGE.Vec4(0,0,0,1);
		var pos = GLGE.mulMat4Vec4(modMat,norVec);
		return (M3D.MOTEUR.vec4ToVec3(pos));	
	},
		
/**
 * M�thode getAbsolutePos: retourne un GLGE.Vec3 comportant la position absolue d'un objet donn�.
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
 * M�thode getRelativeScale: retourne un GLGE.Vec3 comportant l'�chelle relativement au p�re de l'objet donn�.
 * @param: object: objet dont il faut calculer l'�chelle relative.
 * @return: �chelle relative par rapport � son p�re.
 */	
	M3D.MOTEUR.getRelativeScale = function(object){
		var modMat = GLGE.Mat4(object.getLocalMatrix());
		return M3D.MOTEUR.getScaleFromMatrix(modMat);
	},

/**
 * M�thode getAbsoluteScale: retourne un GLGE.Vec3 comportant l'�chelle absolue d'un objet donn�.
 * @param: object: objet dont il faut calculer l'�chelle absolue.
 * @return: �chelle absolue.
 */
	M3D.MOTEUR.getAbsoluteScale = function(object){
		var modMat = GLGE.Mat4(object.getModelMatrix());
		return M3D.MOTEUR.getScaleFromMatrix(modMat);
	},
	
	////////////// AUTRES

/**
 * M�thode idColladaToIdGroup: convertit le nom d'un collada en son groupe p�re (retire le premier caract�re).
 * @param: str: cha�ne de caract�res repr�sentant l'identifiant du collada.
 * @return: cha�ne de caract�res repr�sent l'identifiant du groupe p�re.
 */
	M3D.MOTEUR.idColladaToIdGroup = function(str){
		return str.substring(1,str.length);
	},
 
 /**
 * M�thode getIndexArray: renvoie la position d'un �l�ment dans un tableau, -1 sinon.
 * @param: array: tableau o� chercher l'�l�ment.
 *         element: �l�ment � chercher dans le tableau
 * @return: la position de l'�l�ment dans le tableau s'il est dedans, -1 sinon.
 */
	M3D.MOTEUR.getIndexArray = function(array,element){
		for(var i = 0 ; i<array.length ; i++){
			if(array[i] == element) return i
		}
		return -1;
	};
 
})(window.M3D);