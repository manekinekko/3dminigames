//FONCTIONS DE COLLISIONS
var premiereBouleTouche=-1;
//calcule les coordonnées du point d'intersection de 2 segments
function intersectionPoint(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y) {
	ip = new Vector(0,0);
	position = new Vector(p1x, p1y);
	j = new Vector(p4x-p3x,p4y-p3y);
	i = new Vector(p2x-p1x,p2y-p1y);
	var denom = (i.x*j.y-i.y*j.x);
	if(denom!=0){
		var m = -(-i.x*p1y+i.x*p3y+i.y*p1x-i.y*p3x)/denom;
		var n = -(p1x*j.y-p3x*j.y-j.x*p1y+j.x*p3y)/denom;
		if(m>=0 && m<=1 && n>=0 && n<=1){
			ip.x = p1x;
			ip.y = p1y;		
			ip = ip.add(i.scale(n*0.99));	
		}			
	}
	if(ip.equal(position))
		ip=ip.zero();
	delete i,j, position;	
	return ip;
}

//test l'eventuelle collision de 2 boules et changent les propriétés post collisions des 2 boules
function collisionBoule(b,bk) {	
	
	//distance entre 2 boules < sommes des 2 rayons 
	distn=(b.npos.x-bk.npos.x)*(b.npos.x-bk.npos.x)+(b.npos.y-bk.npos.y)*(b.npos.y-bk.npos.y);	
	if ((distn<4*rayonBoule*rayonBoule)) {		
		if(b.id == 1) ranger_Queue = true;
		if(premiereBouleTouche==-1){
			premiereBouleTouche=bk.c;
		}
		//recalement des positions des boules au point de contact
		bbk = new Vector(bk.npos.x-b.npos.x,bk.npos.y-b.npos.y);
		bbk = bbk.scale(rayonBoule/Math.sqrt(distn)-0.5);
		bk.npos = bk.npos.add(bbk);
		b.npos = b.npos.sub(bbk);				
			
		// Calcul de la base orthonormée (n,g)
		// n est perpendiculaire au plan de collision, g est tangent
		var nx = (bk.npos.x - b.npos.x)/(2*rayonBoule);
		var ny = (bk.npos.y - b.npos.y)/(2*rayonBoule);
		var gx = -ny;
		var gy = nx;
		
		// Calcul des vitesses dans cette base
		var v1n = nx*b.v.x + ny*b.v.y;
		var v1g = gx*b.v.x + gy*b.v.y;
		var v2n = nx*bk.v.x + ny*bk.v.y;
		var v2g = gx*bk.v.x + gy*bk.v.y;
		
		// Permute les coordonnées n et conserve la vitesse tangentielle
		// recalcule les coordonnées dans le repere général.
		b.v.x = nx*v2n +  gx*v1g;
		b.v.y = ny*v2n +  gy*v1g;
		bk.v.x = nx*v1n +  gx*v2g;
		bk.v.y = ny*v1n +  gy*v2g;	
		
		delete bbk;
	}
}
