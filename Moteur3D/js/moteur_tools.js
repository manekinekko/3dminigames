/**
 * Moteur3d de 3DWIGS: moteur_tools.js
 * Fichier contenant l'ensemble des fonctions outils(utilis� que par le moteur).
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){

/////// FONCTIONS POUR LES TABLEAUX

/**
 * M�thode getObject: Retourne l'objet associ� � l'identifiant donn� (-1 s'il existe pas)
 * @param: idObject: identifiant de l'objet que l'on veut r�cup�rer
 * @return: l'objet sinon -1
 */
	M3D.MOTEUR.getObject = function(idObject){
		var object = tabObject[idObject];
		if(object != null ) return object;
		else{ return -1; }
	},

/**
 * M�thode getCamera: Retourne la camera associ� � l'identifiant donn� (-1 s'il existe pas)
 * @param: idCamera: identifiant de la camera que l'on veut r�cup�rer
 * @return: la camera sinon -1
 */
	M3D.MOTEUR.getCamera = function(idCamera){
		var camera = tabCamera[idCamera];
		if(camera != null) return camera;
		else{ return -1;}
	},
	
/**
 * M�thode getCamera: Retourne la camera associ� � l'identifiant donn� (-1 s'il existe pas)
 * @param: idCamera: identifiant de la camera que l'on veut r�cup�rer
 * @return: la camera sinon -1
 */
	M3D.MOTEUR.getObjectOrCamera = function(id){
		var object = M3D.MOTEUR.getObject(id);
		if(object==-1){
			object = M3D.MOTEUR.getCamera(id);
		}
		return object;
	},


	M3D.MOTEUR.getIndexOfCollada = function(idObject){
		for(var i = 0 ; i<tabIdObject.length ; i++){
			if(tabIdObject[i] == idObject) return i
		}
		return -1;
	},
		
	/////// FONCTIONS POUR LA GESTION DU GRAPHE 
	
	
	M3D.MOTEUR.getChildren = function(idObject){
		return M3D.MOTEUR.getChildrenAux(idObject,[[],[],[],[]]);
	},
	
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
	
	M3D.MOTEUR.getAllChildren = function(idObject){
		if(M3D.MOTEUR.getObject(idObject) instanceof GLGE.Collada){
			var tab = [[],[idObject],[],[]];
		}else{
			var tab = M3D.MOTEUR.getAllChildrenAux([[idObject],[],[],[]],0);
		}
		return tab;
	},
	
	M3D.MOTEUR.getAllChildrenAux = function(list,indice){
		if(indice != list[0].length){
			var idObject = list[0][indice];
			list = M3D.MOTEUR.getChildrenAux(idObject,list);
			return M3D.MOTEUR.getAllChildrenAux(list,indice+1);
		}else{
			return list;
		}
	},
	
	
	M3D.MOTEUR.getFatherBranch = function(object){
		var obj = object;
		while(obj.parent != gameScene) obj = obj.parent;
		return obj;
	},
	
	
	/////// FONCTIONS AJOUTES A GLGE

/**
 * M�thode vec4ToVec3: convertit un GLGE.Vec4 en GLGE.Vec3 en oubliant le 4e �l�ment
 * @param: vec: le vecteur GLGE.Vec4 ou un tableau � convertir
 * @return le vecteur GLGE.Vec3 obtenu
 */
	M3D.MOTEUR.vec4ToVec3 = function(vec){
		return (GLGE.Vec3(vec[0],vec[1],vec[2]));
	},
	
/**
 * M�thode vec3ToVec4: convertit un GLGE.Vec3 en GLGE.Vec4 en ajoutant une nouvelle valeur
 * @param:  vec: le vecteur GLGE.Vec3 ou un tableau � convertir
			newValue: nouvelle valeur pour compl�ter le vecteur
 * @return le vecteur GLGE.Vec3 obtenu
 */
	M3D.MOTEUR.vec3ToVec4 = function(vec,newValue){
		return (GLGE.Vec4(vec[0],vec[1],vec[2],newValue));
	},

	M3D.MOTEUR.addNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])+parseFloat(vec2[0]),parseFloat(vec1[1])+parseFloat(vec2[1]),parseFloat(vec1[2])+parseFloat(vec2[2])));
	},
	
	M3D.MOTEUR.subNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])-parseFloat(vec2[0]),parseFloat(vec1[1])-parseFloat(vec2[1]),parseFloat(vec1[2])-parseFloat(vec2[2])));
	},
	
	M3D.MOTEUR.divNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])/parseFloat(vec2[0]),parseFloat(vec1[1])/parseFloat(vec2[1]),parseFloat(vec1[2])/parseFloat(vec2[2])));
	},
	
	M3D.MOTEUR.mulNumVec3 = function(vec1,vec2){
		return (GLGE.Vec3(parseFloat(vec1[0])*parseFloat(vec2[0]),parseFloat(vec1[1])*parseFloat(vec2[1]),parseFloat(vec1[2])*parseFloat(vec2[2])));
	},
	
	//////// FONCTIONS POUR LA POSITION D'UN OBJET PLACEABLE
	
	
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
 * M�thode getRelativePos: retourne un GLGE.Vec3 comportant la position relativement au p�re de l'objet donn�
 * @param: object: objet dont il faut calculer la position relative
 * @return position relative par rapport � son p�re
 */
	M3D.MOTEUR.getRelativePos = function(object){
		var modMat = object.getLocalMatrix();
		var norVec = GLGE.Vec4(0,0,0,1);
		var pos = GLGE.mulMat4Vec4(modMat,norVec);
		return (M3D.MOTEUR.vec4ToVec3(pos));	
	},
		
/**
 * M�thode getAbsolutePos: retourne un GLGE.Vec3 comportant la position absolue d'un objet donn�
 * @param: object: objet dont il faut calculer la position absolute
 * @return position absolue
 */
	M3D.MOTEUR.getAbsolutePos = function(object){
		var modMat = object.getModelMatrix();
		var norVec = GLGE.Vec4(0,0,0,1);
		var pos = GLGE.mulMat4Vec4(modMat,norVec);
		return (M3D.MOTEUR.vec4ToVec3(pos));	
	},
	

/**
 * M�thode getRelativeScale: retourne un GLGE.Vec3 comportant l'�chelle relativement au p�re de l'objet donn�
 * @param: object: objet dont il faut calculer l'�chelle relative
 * @return �chelle relative par rapport � son p�re
 */	
	M3D.MOTEUR.getRelativeScale = function(object){
		var modMat = GLGE.Mat4(object.getLocalMatrix());
		return M3D.MOTEUR.getScaleFromMatrix(modMat);
	},

/**
 * M�thode getAbsoluteScale: retourne un GLGE.Vec3 comportant l'�chelle absolue d'un objet donn�
 * @param: object: objet dont il faut calculer l'�chelle absolute
 * @return �chelle absolue
 */
	M3D.MOTEUR.getAbsoluteScale = function(object){
		var modMat = GLGE.Mat4(object.getModelMatrix());
		return M3D.MOTEUR.getScaleFromMatrix(modMat);
	},
	
	////////////// AUTRES
	
	M3D.MOTEUR.idColladaToIdGroup = function(str){
		return str.substring(1,str.length);
	},
 
	M3D.MOTEUR.getIndexArray = function(array,element){
		for(var i = 0 ; i<array.length ; i++){
			if(array[i] == element) return i
		}
		return -1;
	};
 
})(window.M3D);

/**
 * M�thode searchTarget: permet de savoir si l'identifiant de l'objet se trouve dans le tableau pass� en param�tre.
 * @param: tab: tableau d'identifiant d'objet.
 * 		   idObj: l'identifiant que l'on cherche � savoir s'il est pr�sent dans la tableau.
 * @return true si l'objet est pr�sent sinon false.
 *
	M3D.MOTEUR.searchTarget = function(tab, idObj){
		for(var i=0; i<tab.length; i++){
			if(tab[i] == idObj) return true;
		} return false;
	},*/
	
	/**
 * M�thode getFatherBranch: permet de connaitre l'ancetre d'un objet correspondant � l'identifiant donn� qui est un fils direct de la sc�ne.
 * @param: id: identifiant de l'objet dont on veut connaitre le p�re de la branche.
 * @return: l'identifiant du p�re de la branche.
 *
	M3D.MOTEUR.getFatherBranch = function(object){
		var obj = object;
		while(obj.parent.id != "mainscene") obj = obj.parent;
		return obj.id;
	},*/