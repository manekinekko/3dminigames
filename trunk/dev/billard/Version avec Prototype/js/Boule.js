//Classe Boule
var rayonBoule = 12;

var Boule = Class.create({
	initialize: function(ident,posx,posy,couleur) {
		this.id = ident;
		this.position = new Vector(posx,posy);		
		this.npos = new Vector(posx,posy);		
		this.v = new Vector(0,0);		
		this.c = couleur;		
	},	
	
	// renvoie vrai si la boule se déplace, faux sinon	
	isStable: function() {										
		if(this.v.x<0.2 && this.v.x>-0.2 && this.v.y<0.2 && this.v.y>-0.2)
			this.v.zero();
		return this.v.is_null();
	},		
	
	// calcule la position suivante de la boule	
	nextPos: function() {											
		this.npos = this.npos.add(this.v);						
	},
	
});