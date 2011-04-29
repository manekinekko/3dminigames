/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Editor
 * @file assets/js/m3d_editor.js
 * @projectDescription This file contains all necessary functions that are used by the editor.
 */
(function(M3D){
	
	/**
	 * Initializes the editor. 
	 * This function is called once the document is loaded.
	 */
	var indexed=false;	//Permet de differencier localStorage et IndexedDB
	M3D.Editor.init = function(){	
		
		log('initializating the editor ...');	
		if(indexed){
			//M3D.Editor.clear();
		}
		else{
			var c = M3D.DB.getEditor('edwigs');
			if ( !c || c ===  null || c === ""){
				M3D.Editor.clear();
			} else {
				M3D.Editor.setContent(c);
			}
		}
	};
	
	/**
	 * Insert the game name
	 * @param {String} name The game name
	 * @param {Function} cb The callback function
	 */
	M3D.Editor.setGameInfo = function(name, cb){
		if ( !cb ){
			var cb = function(){};
		}
		if(indexed){
			M3D.DB.start(name);
			cb();
		}else{
			M3D.Editor.setContent('game has name at "'+name+'" ;\n', cb);
		}
	};
	
	/**
	 * Init for indexedDB the editor's content
	 * @private
	 */
	M3D.Editor.initDB = function(value){
		edwigs.edit( value, 'edwigs');
	};
	
	
	/**
	 * Check if the editor contains a given string 
	 * @param {Object} str The string to find
	 * @return True if str was found, False otherwise
	 * @type {Boolean}
	 */
	M3D.Editor.findString = function(str){
		return new RegExp(str).test(edwigs.getCode());
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
	 * Clear the editor content
	 * @param {Function} cb The function to be executed after the editor is cleared
	 */
	M3D.Editor.clear = function(cb){
		if ( !cb ){
			var cb = function(){};
		}
		var _str = [];
		_str.push('/* Game created by 3DWIGS */\n');
		_str.push('/* On '+(new Date()).toGMTString()+' */\n\n');
		_str.push('');
		_setAndClearContent(_str.join(''), cb);
	};
	
	/**
	 * Set the default content of the editor
	 * @param {string} names The name of the objects to be added
	 */
	M3D.Editor.setDefaultContent = function(names){
		var _name, _str = "";
		for(var i=0; i<names.length; i++){
			
			_name = names[i];
			_str += 'type '+_name+' is Object;\n'+
								_name+' has position at 0.00 0.00 0.00;\n'+
								_name+' has rotation at 0.00 0.00 0.00;\n'+
								_name+' has scale at 0.00 0.00 0.00;\n';
			
		}
		
		if ( M3D.Editor.getContent() !== null ) {
			_str = M3D.Editor.getContent() + _str;		
		}
		M3D.Editor.setContent(_str);
	};
	
	/**
	 * This function append the new content to the old one.
	 * Or set the new content of the editor.
	 * @param {String} value The new content
	 * @param {Function} cb The callback function
	 */
	M3D.Editor.setContent = function(value, cb){
		if(indexed){
			M3D.Editor.initDB(value);
		}
		else{
			var _old = M3D.Editor.getContent();
			_old = _old === '' ? _old : _old+"\n";
			_setAndClearContent(_old+value, cb);
		}
	};	 
	
	/**
	 * Update a given 3D model's position/rotation/scale's values inside the editor. 
	 * @param {Object} o An object containing the id string of the 3D model, its position, rotation and scale X/Y/Z values.
	 */
	M3D.Editor.updateObjectAttributes = function(o, cb){
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
		_setAndClearContent( content.join(NEWLINE), cb );
		
	};
	
	/**
	 * Set the editor's content. 
	 * Bear in mind this function erase the editor's content and set a new content!
	 * @param {Object} value The new content of the editor
	 * @param {Function} cb The callback function 
	 * that will be excexuted after the editor is updated
	 * @private
	 */
	var _setAndClearContent = function(val, cb){
		// create a new callback function
		var _cb = function(){
			M3D.DB.setEditor({
				'uid': 'edwigs', 
				'value': val	
			});
			
			if ( cb ){
				cb();
			}
		}
		edwigs.edit( val, 'edwigs', _cb );
	};
	
})(window.M3D);