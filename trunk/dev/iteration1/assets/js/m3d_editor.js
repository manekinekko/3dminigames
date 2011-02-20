/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Editor
 * @file assets/js/m3d_editor.js
 * @projectDescription This file contains all necessary functions that are used by the editor.
 */
(function(M3D){
	
	/**
	 * Initializes the editor. This function is called once the document is loaded.
	 */
	M3D.Editor.init = function(){
		// TODO: get previous content
		var _c = ''; 
		if ( _c === '' ){
			_setContent('/* Game created on '+(new Date()).toGMTString()+' */\n\n');
		}
	};
	
	/**
	 * Get the current content of the editor.
	 * @return The current content of the editor
	 * @type {String}
	 */
	M3D.Editor.getContent = function(){
		return edwigs.getCode();
	};
	
	/**
	 * Set the new content of the editor.
	 * @param {String} value The new content
	 */
	M3D.Editor.setContent = function(value){
		var _old = M3D.Editor.getContent();
		_old = _old === '' ? _old : _old+"\n";
		_setContent(_old+value);
	};	 
	
	// update the selected object's properties
	/**
	 * Update a given 3D model's position/rotation/scale's values inside the editor. 
	 * @param {Object} o An object containing the id string of the 3D model, its position, rotation and scale X/Y/Z values.
	 */
	M3D.Editor.updateObjectAttributes = function(o){
		var NEWLINE = '\n';
		var content = M3D.Editor.getContent().split(NEWLINE);
		for(var i=0; i<content.length; i++){
			
			if ( (new RegExp(o.id+' has position')).test(content[i]) ){
				var p = o.position;
				content[i] = content[i].replace(/position at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'position at '+p.x+' '+p.y+' '+p.z);
			}
			else if ( (new RegExp(o.id+' has scale')).test(content[i]) ){
				var s = o.scale;
				content[i] = content[i].replace(/scale at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'scale at '+s.x+' '+s.y+' '+s.z);
			}
			else if ( (new RegExp(o.id+' has rotation')).test(content[i]) ){
				var r = o.rotation;
				content[i] = content[i].replace(/rotation at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'rotation at '+r.x+' '+r.y+' '+r.z);
			}
		}
		_setContent( content.join(NEWLINE) );
		
	};
	
	// set the editor's content
	/**
	 * Set the editor's content
	 * @param {Object} value The new content of the editor
	 * @private
	 */
	var _setContent = function(value){
		edwigs.edit( value, 'edwigs' );
	};
	
})(window.M3D);