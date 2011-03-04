/**
 * Moteur3d de 3DWIGS: moteur_tools.js
 * Fichier contenant l'ensemble des fonctions outils(utilis� que par le moteur).
 *
 * @author: J�r�me BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */


(function(M3D){

/**
 * M�thode getObject: permet de connaitre l'identifiant qui est associ� � un objet.
 * @param: idObject: identifiant de l'objet que l'on veut r�cup�rer
 * @return: l'objet sinon -1
 */
	M3D.MOTEUR.getObject = function(idObject){
		var object = tabObject[idObject];
		if(object != null ) return object;
		else{ return -1; }
	},


/**
 * M�thode getIdObject: permet de connaitre l'objet qui est associ� � un identifiant.
 * @param: object: object dont on cherche � connaitre le nom.
 * @return: l'identifiant de l'objet en question sinon -1.
 */
	M3D.MOTEUR.getIdObject = function(object){
		if(object != null){
			var i;
			for(i=0; i<tabIdObject.length; i++){
				if(object == tabObject[tabIdObject[i]]) return tabIdObject[i];
			}
		} return null; 
	},
 

/**
 * M�thode getFatherBranch: permet de connaitre le p�re de la branche qui est un fils de la gameScene.
 * @param: id: identifiant de l'objet dont on veut connaitre le p�re de la branche.
 * @return: l'identifiant du p�re de la branche.
 */
	M3D.MOTEUR.getFatherBranch = function(id){
		var obj = tabObject[id];
		while(obj.parent.id != "mainscene") obj = obj.parent;
		return M3D.MOTEUR.getIdObject(obj);
	},


/**
 * M�thode searchTarget: permet de savoir si l'identifiant de l'objet se trouve dans le tableau pass� en param�tre.
 * @param: tab: tableau d'identifiant d'objet.
 * 		   idObj: l'identifiant que l'on cherche � savoir s'il est pr�sent dans la tableau.
 * @return true si l'objet est pr�sent sinon false.
 */
	M3D.MOTEUR.searchTarget = function(tab, idObj){
		for(var i=0; i<tab.length; i++){
			if(tab[i] == idObj) return true;
		} return false;
	};
 
})(window.M3D);