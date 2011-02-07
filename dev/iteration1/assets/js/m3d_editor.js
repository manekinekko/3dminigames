/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */
	 
if(!window.M3D){
	window.M3D={};	
}

if (!window.M3D.Editor){
		window.M3D.Editor={};
}

(function(M3D){
	
	// get the current content
	M3D.Editor.getContent = function(){
		return $('#editor textarea').val();
	}
	
	// set the new content
	M3D.Editor.setContent = function(value){
		var _old = M3D.Editor.getContent();
		_old = _old === '' ? _old : _old+"\n";
		$('#editor textarea').val( _old + value );
	}	 
	
})(window.M3D);