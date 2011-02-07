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
		return edwigs.getCode();
	};
	
	// set the new content
	M3D.Editor.setContent = function(value){
		var _old = M3D.Editor.getContent();
		_old = _old === '' ? _old : _old+"\n";
		edwigs.edit( _old + value, 'edwigs' );
		edwigs.focus();
	};	 
	
})(window.M3D);