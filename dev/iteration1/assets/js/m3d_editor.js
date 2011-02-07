/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_editor.js
 */
(function(M3D){
	
	// Init the editor
	M3D.Editor.init = function(){
		// TODO: get previous content
		var _c = ''; 
		if ( _c === '' ){
			_setContent('/* Game created on '+(new Date()).toGMTString()+' */\n\n');
		}
	}
	
	// get the current content
	M3D.Editor.getContent = function(){
		return edwigs.getCode();
	};
	
	// set the new content
	M3D.Editor.setContent = function(value){
		var _old = M3D.Editor.getContent();
		_old = _old === '' ? _old : _old+"\n";
		_setContent(_old+value);
	};	 
	
	// set the editor's content
	var _setContent = function(value){
		edwigs.edit( value, 'edwigs' );
		edwigs.focus();
	}
	
})(window.M3D);