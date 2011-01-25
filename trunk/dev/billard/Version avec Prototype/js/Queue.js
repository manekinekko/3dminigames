//Classe Queue
var dv = 0.3;
var vitesse = 0; var anim = -40;
var ranger_Queue = false;

var Queue = Class.create({
	initialize: function(posx,posy) {		
		this.position = new Vector(posx,posy);		
		this.vitesse = 0;		
		this.direction = new Vector(0,0);	
			
	},		
	
	//renvoie vrai si la queue a touché la boule blanche
	tir: function(boule_blanche) {		
		canvas.addEventListener( "mousedown", function(){down = true;} , false );		
		canvas.addEventListener( "mouseup", function(){down = false;}, false );		
		if(down) {
			anim = Math.cos(Math.PI*(1-this.vitesse/20))*40;
			if(this.vitesse<=20 && dv>0)			
				this.vitesse += dv;
			else {
				if(dv>0)
					dv = -dv;
				if(this.vitesse>0)
					this.vitesse +=dv;
				else
					dv = -dv;
			}			
		}
		else {	
			if(this.vitesse>4)
				anim -= (1+Math.cos(Math.PI*(1-this.vitesse/20)))*(1+Math.cos(Math.PI*(1-this.vitesse/20)))*10;
			else 
				anim -=1;
			if(anim <= -40)	{				
				anim = -40;						
				boule_blanche.v = new Vector(this.vitesse*this.vitesse/15*Math.cos(this.direction.angle()),this.vitesse*this.vitesse/15*Math.sin(this.direction.angle()));
				this.vitesse = 0;
			}
		}				
	},


	//Dessine la queue.
	draw: function(table){
		if(table.isStable(nbBoules)) {
			if(!down && (table.boules[0].position.x-mousePos.x)*(table.boules[0].position.x-mousePos.x)+(table.boules[0].position.y-mousePos.y)*(table.boules[0].position.y-mousePos.y)>=(2*rayonBoule+170)*(2*rayonBoule+170)) {
				this.position = (new Vector(tableminx,tableminy)).add(mousePos);
			}
			else {
				this.position = (new Vector(tableminx,tableminy)).add(table.boules[0].position).sub(this.direction.unit().scale(2*rayonBoule+195+anim));
			}	
			drawTarget(this.direction, table);	
		}
		else {
			if(ranger_Queue) {
				this.position.x = tableminx-20;
				this.position.y = tableminy+200;
				this.direction.x = 0;
				this.direction.y = -10;
				ranger_Queue = false;
			}			
		}
		drawImg('queue',this.direction.angle()+Math.PI/2,this.position.x,this.position.y);
		
	}		
	
});



//DESSIN ET ROTATION D'UNE IMAGE
function drawImg(id,radian,x,y){
	// initialise xpos et ypos (translation du canvas)	
	var xpos=x;var ypos=y;

	// récupère le rayon de l'image
	var width = $(id).width;	
	var height = $(id).height;
	
		//Push Canvas
		ctx.save();		

		// Effectue une translation du positionnement des origines du canvas
		ctx.translate(xpos,ypos);
		
		// Effectue une rotation du canvas
		ctx.rotate(radian);		
		
		// Insère l'image, en dessinant son centre au centre du canvas
		ctx.drawImage($(id),-width/3,-height/3,width/1.5,height/1.5);

		// Pop Canvas
		ctx.restore();

		// enregistre l'état du canvas
		ctx.save();
	}


//DESSIN DE LA LIGNE DE VISEE
function drawTarget(queue_dir, table) {
	pos = new Vector(table.boules[0].position.x,table.boules[0].position.y);
	var posx = table.boules[0].position.x+720*queue_dir.x/queue_dir.magnitude();
	var posy = table.boules[0].position.y+720*queue_dir.y/queue_dir.magnitude();
	var pos_Virtual = new Vector(-1000,0);
	var post_Collide = new Vector(0,0);
	var dist = 1000000;

	//Visée sur les boules
	for (e=1;e<nbBoules;e++) {
		vec = new Vector(posx-table.boules[0].position.x, posy-table.boules[0].position.y);		
		vec_normal = vec.normal().unit().scale(2*rayonBoule);
		c = new Vector(table.boules[e].position.x+vec_normal.x,table.boules[e].position.y+vec_normal.y);
		d = new Vector(table.boules[e].position.x-vec_normal.x,table.boules[e].position.y-vec_normal.y);
		inter_boule = intersectionPoint(pos.x,pos.y,posx,posy,c.x,c.y,d.x,d.y);	
		if(!inter_boule.is_null()) {			
			inter_boule.sub(queue_dir.unit().scale(Math.sqrt(4*rayonBoule*rayonBoule-inter_boule.difference(table.boules[e].position).squared())));
			if(table.boules[0].position.difference(pos_Virtual).squared()>table.boules[0].position.difference(inter_boule).squared()) {
				pos_Virtual = inter_boule;				
				
				post_Collide.x = pos_Virtual.x+(table.boules[e].position.x-pos_Virtual.x)*2;
				post_Collide.y = pos_Virtual.y+(table.boules[e].position.y-pos_Virtual.y)*2;
				tmpx = table.boules[e].position.x;tmpy = table.boules[e].position.y;

			}
		}
		delete c, d, vec, inter_boule;
	}
	//Visée sur les rebords si une boule n'est pas visée	
	for (k=0;k<nbRebords;k++) {
		p = table.rebords[k];	
		inter_bord = intersectionPoint(table.boules[0].position.x,table.boules[0].position.y,posx, posy, p.x1, p.y1, p.x2, p.y2);		
		if((!inter_bord.is_null() && pos_Virtual.x<0) || (!inter_bord.is_null() && inter_bord.difference(table.boules[0].position).squared()<=pos_Virtual.difference(table.boules[0].position).squared())) {			
			seg_rebord = new Vector(p.x2-p.x1,p.y2-p.y1);
			seg_dir = new Vector(0,0).add(inter_bord).sub(table.boules[0].position);
			var length = seg_dir.magnitude();
			seg_dir = seg_dir.unit();
			seg_rebord = seg_rebord.unit();					
			var dot = seg_rebord.dot(seg_dir);					
			pos = pos.add(seg_rebord.scale(2*dot*length));
			pos_Virtual = inter_bord;
			post_Collide = 	inter_bord.clone().add(pos.difference(inter_bord).unit().scale(40));
			tmpx = pos_Virtual.x; tmpy = pos_Virtual.y;	
			delete seg_rebord, seg_dir, inter_bord;			
		}		
	}
		
	//Visée dans un trou si aucun autre n'est visé
	if(pos_Virtual.x<0) {
		for(k=0;k<6;k++) {
			p = table.pockets[k];
			vec = new Vector(posx-table.boules[0].position.x, posy-table.boules[0].position.y);		
			vec_normal = vec.normal().unit().scale(rayonBoule);
			c = new Vector(table.pockets[k].position.x+vec_normal.x,table.pockets[k].position.y+vec_normal.y);
			d = new Vector(table.pockets[k].position.x-vec_normal.x,table.pockets[k].position.y-vec_normal.y);
			inter_boule = intersectionPoint(pos.x,pos.y,posx,posy,c.x,c.y,d.x,d.y);	
			if(!inter_boule.is_null()) {
				pos_Virtual = p.position;
				post_Collide = pos_Virtual;
				tmpx = pos_Virtual.x; tmpy = pos_Virtual.y;
			}
		}
		delete c, d, vec, inter_boule;
	}

	//Dessin de la ligne de visée
	ctx.strokeStyle = "rgba(0,0,255,0.5)";	
	ctx.beginPath();
	ctx.moveTo(table.boules[0].position.x+tableminx, table.boules[0].position.y+tableminy);	
	ctx.lineTo(pos_Virtual.x+tableminx, pos_Virtual.y+tableminy);
	ctx.stroke();
	ctx.closePath();	
	ctx.beginPath();
	ctx.moveTo(tmpx+tableminx, tmpy+tableminy);
	ctx.lineTo(post_Collide.x+tableminx, post_Collide.y+tableminy);
	ctx.stroke();
	ctx.closePath();
	ctx.beginPath();
	ctx.fillStyle = "rgba(255,255,255,0.5)";
	ctx.arc(pos_Virtual.x+tableminx,pos_Virtual.y+tableminy,rayonBoule,0,2*Math.PI, true);	
	ctx.closePath();
	ctx.fill();		
}