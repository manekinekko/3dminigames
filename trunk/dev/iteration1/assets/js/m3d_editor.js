/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */
	 
if(!window["M3D"]){
	window["M3D"]={};	
}

if (!window["M3D"].EDITOR){
		window["M3D"].EDITOR={};
}

(function(M3D){
	
	// get the current content
	var getContent = function(){
		return $('#editor textarea').val();
	}
	
	// set the new content
	var setContent = function(value){
		var _old = M3D.EDITOR.getContent();
		$('#editor textarea').val( _old + value );
	}	 
	
})(window["M3D"]);