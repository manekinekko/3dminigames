//Classe Table
var nbBoules;var couleurBoule=['blanche','jaune','rouge','noire'];
var nbRebords=18;var rebord_elasticite = 0.7;var tapis_frottement = 1.008;
var tableminx=212,tableminy=172; // placement du billard sur la page


var Table = Class.create({
	initialize: function() {		
		this.rebords = new Array();
		this.pockets = new Array();
		this.boules = new Array();
		this.Jaune=0;
		this.Rouge=0;
		this.JauneAvant=0; 
		this.RougeAvant=0;//nb de couleur entré
		this.Noir=false;//si noir entré
		this.blancheTrou=false;//indique si la blanche est entré dans un trou
	
	},
	
	//Initialise la position des trous du billard
	initTable: function() {
		initRebords(this.rebords);		
		this.pockets.push(new Pocket(360,30));	//haut centre
		this.pockets.push(new Pocket(680,40));	//haut droite
		this.pockets.push(new Pocket(680,360));	//bas droite
		this.pockets.push(new Pocket(360,370));	//bas centre
		this.pockets.push(new Pocket(40,360));	//bas gauche
		this.pockets.push(new Pocket(40,40));	//haut gauche

	},	
	
	update: function() {
		if(!this.isStable(nbBoules)){		
			//Calcul des positions suivantes des boules sur la table
			for (e=0;e<nbBoules;e++) {		
				this.boules[e].nextPos();
				if(this.pottedBoule(e)) {
					switch(this.boules[e].c)
					{
						case 0: this.blancheTrou=true;break;
						case 1:	this.Jaune++;break;
						case 2:	this.Rouge++;break;
						case 3:	this.Noir=true;break;		
					}
				this.removeBoule(e);
				}
							
			}	
		
			//Gestion des collisions des boules.
			for(e=0;e<nbBoules;e++) 
				for(k=e+1;k<nbBoules;k++) 
					collisionBoule(this.boules[e],this.boules[k]);
		
			for (e=0;e<nbBoules;e++)
				this.collisionRebord(this.boules[e]);		
		
		
			//Assignation des nouvelles positions aux boules et mise à jour de la table.	
			for (e=0;e<nbBoules;e++){				
				this.updateBoulePos(this.boules[e],this.boules[e].npos.x,this.boules[e].npos.y);
				this.boules[e].v.scale(1/tapis_frottement);
			}	
		}
			// Redessine les boules sur la table.
			for (e=0;e<nbBoules;++e)
			{
				b=this.boules[e];
				ctx.drawImage($(couleurBoule[b.c]), b.position.x-rayonBoule+tableminx, b.position.y-rayonBoule+tableminy, 2*rayonBoule, 2*rayonBoule);		
			}	
			if(AuTourDe==1){//permet d'afficher à qui le tour
				ctx.drawImage($(AQuiLeTour), 750+tableminx,tableminy+40, 20,20);
			}else if(AuTourDe==2){
				ctx.drawImage($(AQuiLeTour), 750+tableminx,tableminy+151, 20,20);
			}
	},	
	
	isStable: function(i) {
		var tmp = false;
		if (this.boules[i-1].isStable())
			if(i>1)
				tmp = this.isStable(i-1);
			else tmp = true;
		return tmp;
	},

	// renvoie vraie si la boule est rentrée dans un trou
	pottedBoule: function(i) {										
		var bool = false;		
		for(j=0;j<6;++j) {			
			if(this.boules[i].position.distance(this.pockets[j].position)<=this.pockets[j].rayonTrou){						
				bool = true;
			}
		}		
		return bool;
	},
	
	// supprime une boule à l'indice i de la table.
	removeBoule: function(i) {									
		this.boules.splice(i,1);		
		--nbBoules;
	},
	
	// place la boule à la position x,y du billard
	updateBoulePos: function(boule,x,y) {						
		boule.position.x = x;
		boule.position.y = y;
	},
	
	// gère la collision contre un rebord	de la table
	collisionRebord: function(b) {											
		for (k=0;k<nbRebords;k++)
		{
			p=this.rebords[k];													
			var tmp = intersectionPoint(b.position.x,b.position.y,b.npos.x,b.npos.y,p.x1,p.y1,p.x2,p.y2);
			if(!tmp.is_null()){
				if(b.id == 1) ranger_Queue = true;
				pos = new Vector(b.position.x,b.position.y);				
				b.npos = tmp;
				seg_rebord = new Vector(p.x2-p.x1,p.y2-p.y1);
				seg_vitesse = new Vector(0,0).add(b.npos).sub(b.position);
				var length = seg_vitesse.magnitude();
				seg_vitesse = seg_vitesse.unit();
				seg_rebord = seg_rebord.unit();					
				var dot = seg_rebord.dot(seg_vitesse);					
				pos = pos.add(seg_rebord.scale(2*dot*length));
				b.v = pos.sub(b.npos).unit().scale(b.v.magnitude());
				b.v = b.v.scale(rebord_elasticite);
				
				delete seg_rebord,seg_vitesse, pos;
			}				
		}			
	}
});


//Création des rebords et des trous de la table
function initRebords(rebord) {

	rebord.push({x1:54+rayonBoule/2,y1:70,x2:34,y2:45});								//haut gauche gauche
	
	rebord.push({x1:46,y1:31,x2:70,y2:54+rayonBoule/2});								//haut gauche droite
	rebord.push({x1:70,y1:54+rayonBoule/2,x2:336+rayonBoule/2,y2:54+rayonBoule/2});		//longueur haut gauche
	rebord.push({x1:336+rayonBoule/2,y1:54+rayonBoule/2,x2:346+rayonBoule/2,y2:34});	//haut centre gauche
	
	rebord.push({x1:375-rayonBoule/2,y1:34,x2:385-rayonBoule/2,y2:54+rayonBoule/2});	//haut centre droite
	rebord.push({x1:385-rayonBoule/2,y1:54+rayonBoule/2,x2:650,y2:54+rayonBoule/2});	//longueur haut droite
	rebord.push({x1:650,y1:54+rayonBoule/2,x2:670+rayonBoule/2,y2:30});					//haut droite gauche
	
	rebord.push({x1:690-rayonBoule/2,y1:46,x2:667-rayonBoule/2,y2:70});				//haut droite droite
	rebord.push({x1:667-rayonBoule/2,y1:70,x2:667-rayonBoule/2,y2:335});				//longueur droite	
	rebord.push({x1:667-rayonBoule/2,y1:335,x2:692-rayonBoule/2-5,y2:350+rayonBoule/2});//bas droite droite
	
	rebord.push({x1:665+rayonBoule/2,y1:365,x2:647,y2:348-rayonBoule/2});				//bas droite gauche
	rebord.push({x1:647,y1:348-rayonBoule/2,x2:385-rayonBoule/2,y2:348-rayonBoule/2});	//longueur bas droite
	rebord.push({x1:385-rayonBoule/2,y1:348-rayonBoule/2,x2:375-rayonBoule/2,y2:365});	//bas centre droite
	
	rebord.push({x1:350,y1:365,x2:340,y2:348-rayonBoule/2});							//bas centre gauche
	rebord.push({x1:340,y1:348-rayonBoule/2,x2:70,y2:348-rayonBoule/2});				//longueur bas gauche	
	rebord.push({x1:70,y1:348-rayonBoule/2,x2:50,y2:360,anglex:45,angley:-1});			//bas gauche droite
	
	rebord.push({x1:35+rayonBoule/2,y1:345+rayonBoule/2,x2:54+rayonBoule/2,y2:334});	//bas gauche gauche
	rebord.push({x1:54+rayonBoule/2,y1:334,x2:54+rayonBoule/2,y2:70});					//longueur  gauche	
	
} 

// Objet Pockets (les trous de la table)
var rayonTrou = 12;

var Pocket = Class.create({
	initialize: function(x,y) {	
		this.position = new Vector(x,y);
		this.rayonTrou = rayonTrou;
	}
});