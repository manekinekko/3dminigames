
/**
 * @name m3d_utils.js
 * @author chegham wassim
 */


if(!window["M3D"]){
	window["M3D"]={};	
}

if (!window["M3D"].Common){
		window["M3D"].Common={};
}

(function(M3D){

// -- print selected option for select input
M3D.Common.printSelected = function(a, b){ 
	var ret=""; 
	if (a == b) {
		ret = "selected='true'";
	} 
	return ret; 
};


// -- check if it's a valid type
M3D.Common.isValidType = function(t){ 
	var i; 
	var arr = ['string', 'number', 'boolean'];
	for(i in arr){ 
		if ( typeof(t) == arr[i] ) 
			return true; 
	}; 
	return false; 
};

})(window["M3D"]);
