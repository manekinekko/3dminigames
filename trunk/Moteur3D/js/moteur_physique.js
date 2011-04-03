 if(!window["M3D"]){
	window["M3D"] = {};
}

if(!window["M3D"].MOTEUR){
	window["M3D"].MOTEUR = {};
}

(function(M3D){

	// gravite [0,-9.8,0]
	M3D.MOTEUR.setGravite = function(newGravite){
		gravite = newGravite;
	},
	
	// juste un entier
	M3D.MOTEUR.setCoefFrottement = function(newCoef){
		coefFrottement = newCoef;
	},
	
	M3D.MOTEUR.applyVitesse = function(idObject,gObject){
		var acc = gObject.acceleration;
		var vit = gObject.vitesse;
		for(var i = 0; i < 3 ; i++){
			if(vit[i]>0){
				vit[i] = Math.max(0,vit[i]-coefFrottement*vit[i]);
			}else if(vit[i]<0){
				vit[i] = Math.min(0,vit[i]-coefFrottement*vit[i]);
			}
			vit[i] += acc[i];
			if(Math.abs(vit[i]<0.01)){
				vit[i]=0;
			}
		}
		gObject.vitesse = vit;
		M3D.MOTEUR.translate(idObject,vit,false,idObject);
	},
	
	M3D.MOTEUR.applyVitesseGravity = function(idObject,gObject){
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
		M3D.MOTEUR.translate(idObject,vit,false,idObject);
	},
	
	M3D.MOTEUR.applyPhysique = function(idList,gObjList,gIdList,gGObjList){
		for(var i = 0 ; i < gObjList.length ; i++){
			M3D.MOTEUR.applyVitesse(idList[i],gObjList[i]);
		}
		for(var i = 0 ; i < gGObjList.length ; i++){
			M3D.MOTEUR.applyVitesseGravity(gIdList[i],gGObjList[i]);
		}	
	};
	

})(M3D);