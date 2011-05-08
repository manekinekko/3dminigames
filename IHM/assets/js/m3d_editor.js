/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Editor
 * @file assets/js/m3d_editor.js
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/assets/js/m3d_editor.js
 * @projectDescription This file contains all necessary functions that are used by the editor.
 */
(function(M3D){


	/**
	 * Initializes the editor. 
	 * This function is called once the document is loaded.
	 * @deprecated This function is never called anymore!
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
			var _str = [];
			_str.push(_getInitialTemplate());
			_str.push('game has name at "'+name+'" ;\n');
			M3D.Editor.setContent(_str.join(''), cb);
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
		_setAndClearContent(_getInitialTemplate(), cb);
	};
	
	/**
	 * Set the default content of the editor
	 * @param {Array} o An array of names and urls of the objects to be added
	 */
	M3D.Editor.setDefaultContent = function(o, cb){
		var _name, _url, _str = [], _old = [];
		
		if ( M3D.Editor.getContent() !== null ) 
		{
			_str.push(M3D.Editor.getContent());
			_str.push('\n');
		}
		
		for(var i=0; i<o.length; i++)
		{
			
			_name = o[i].name;
			_url = o[i].url;
			_str.push(_name+' is Object ;\n'+
						_name+' has position at 0.00 0.00 0.00 ;\n'+
						_name+' has rotation at 0.00 0.00 0.00 ;\n'+
						_name+' has scale at 1.00 1.00 1.00 ;\n'+
						_name+' has url at \n   "'+_url+'" ;\n');
			
		}
		
		M3D.Editor.setContent(_str.join(''), cb);
	};
	
	/**
	 * 
	 */
	M3D.Editor.commentLines = function(o, cb) {
		
		var NEWLINE = '\n';
		var content = M3D.Editor.getContent().split(NEWLINE);
		var _name = M3D.GUI.getObjectId(obj.uid);
		
		for(var i=0; i<content.length; i++)
		{
			
			if ( content[i] === '' ) {
				continue;
			}
			else if ( (new RegExp(_name)).test(content[i]) )
			{
				if ( /;$/.test(content[i]) ) {
					content[i] = '// ' + content[i];
				}
			}
		
		}
		
		_setAndClearContent( content.join(NEWLINE), cb );
	}
	
	/**
	 * This function append the new content to the old one.
	 * Or set the new content of the empty editor.
	 * @param {String} value The new content
	 * @param {Function} cb The callback function
	 */
	M3D.Editor.setContent = function(value, cb){
		if(indexed){
			M3D.Editor.initDB(value);
		}
		else{
			_setAndClearContent(value, cb);
		}
	};	 
	
	/**
	 * Update a given 3D model's position/rotation/scale's values inside the editor. 
	 * @param {Object} o An object containing the id string of the 3D model, its position, rotation and scale X/Y/Z values.
	 */
	M3D.Editor.updateObjectAttributes = function(o, cb){
		
		var NEWLINE = '\n';
		var content = M3D.Editor.getContent().split(NEWLINE);
		
		for(var i=0; i<content.length; i++)
		{
			
			if ( (new RegExp(o.id+' has position')).test(content[i]) )
			{
				var p = o.position;
				content[i] = content[i].replace(/position at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'position at '+p.x+' '+p.y+' '+p.z);
			}
			else if ( (new RegExp(o.id+' has scale')).test(content[i]) )
			{
				var s = o.scale;
				content[i] = content[i].replace(/scale at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'scale at '+s.x+' '+s.y+' '+s.z);
			}
			else if ( (new RegExp(o.id+' has rotation')).test(content[i]) )
			{
				var r = o.rotation;
				content[i] = content[i].replace(/rotation at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'rotation at '+r.x+' '+r.y+' '+r.z);
			}
		}
		_setAndClearContent( content.join(NEWLINE), cb );
		
	};
	
	/**
	 * This function erase the editor's content
	 * @param {Function} cb The callback function 
	 */
	M3D.Editor.empty = function(cb){
		if ( !cb ){
			var cb = function(){};
		}
		edwigs.edit( '', 'edwigs', cb );
	}
	
	/**
	 * Construct a new initial template
	 * @return The initial template
	 * @type {String}
	 * @private
	 */
	var _getInitialTemplate = function(){
		var _str = [];
		_str.push('// Game created by 3DWIGS\n');
		_str.push('// On '+(new Date()).toGMTString()+'\n\n');
		_str.push('');
		return _str.join('');
	}
	
	/**
	 * Set the editor's content. 
	 * Bear in mind this function erase the editor's content and set a new content!
	 * @param {Object} value The new content of the editor
	 * @param {Function} cb The callback function 
	 * that will be excexuted after the editor is updated
	 * @private
	 */
	var _setAndClearContent = function(val, cb){
		// wrap the callback function with a new one
		// coz' we need to update the DB content!

		M3D.DB.setEditor({
			'uid': 'edwigs', 
			'value': val	
		});
		edwigs.edit( val, 'edwigs', cb );
	};
	
})(window.M3D);