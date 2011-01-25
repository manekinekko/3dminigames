//Class Vector
var rad2deg=180/Math.PI; 
var deg2rad=Math.PI/180; 

var Vector = Class.create({
	initialize: function(x,y) {	
		this.x = x;
		this.y = y;
	},
	clone: function () {
		return new Vector( this.x, this.y );
	},
	
	dot: function ( vec ) {
		return this.x*vec.x + this.y*vec.y;
	},

	squared: function () {
		return this.dot(this);
	},

	magnitude: function () {
		return Math.sqrt( this.squared() );
	},

	angle: function () {
		return Math.atan2(this.y, this.x);
	},

	is_null: function () {
		return this.x == 0 && this.y == 0;
	},

	zero: function () {
		this.x = 0;
		this.y = 0;
		return this;
	},

	add: function ( vec ) {
		this.x += vec.x;
		this.y += vec.y;
		return this;
	},
	
	sub: function ( vec ) {
		this.x -= vec.x;
		this.y -= vec.y;
		return this;
	},

	scale: function ( scale ) {
		this.x *= scale;
		this.y *= scale;
		return this;
	},	

	unit: function () {
		return this.clone().scale( 1/this.magnitude() );
	},
	
	equal: function (vec) {
		return this.x == vec.x && this.y == vec.y;
	},
	
	normal: function () {
		return new Vector( this.y, -this.x );
	},

	difference: function(vec) {
		return this.clone().sub( vec );
	},

	distance: function(vec) {
		return this.difference(vec).magnitude();
	}
});