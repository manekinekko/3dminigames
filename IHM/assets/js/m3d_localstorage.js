/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.DB
 * @file assets/js/m3d_localstorage.js
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/assets/js/m3d_localstorage.js
 * @projectDescription This file contains all the necessary Local Storage functions.
 */
(function(M3D){

	/**
	 * _obj : for imported 3D models
	 */
	DB_PATTERN_OBJ = '_obj';
	
	/**
	 * _type : for defined types
	 */
	DB_PATTERN_TYPE = '_type';

	/**
	 * _attr : for types attributes
	 */
	DB_PATTERN_ATTR = '_attr';
	
	/**
	 * _editor : for editor content
	 */
	DB_PATTERN_EDITOR = '_editor';
	
	/**
	 * Entries name
	 */
	M3D.DB.REGEX_CONTENT_PATTERN = new RegExp('('+
											DB_PATTERN_ATTR+
											'|'+DB_PATTERN_TYPE+
											'|'+DB_PATTERN_OBJ+
											'|'+DB_PATTERN_EDITOR+
										')$');
	
	/**
	 * The local storage initialization process.
	 * @see Object.storeDefaultAttributes
	 * @see Object.detectPreviousContent
	 */
	M3D.DB.init = function(){
		log('initializating the database ...');
		M3D.DB.storeDefaultAttributes(function(){
			M3D.GUI.initAttributPanel();
		});
		M3D.DB.detectPreviousContent();
	};
	
	/**
	 * Get the default attributes catalog from the server and store it into the local storage.
	 * @see Object.contains
	 * @see Object._set
	 */
	M3D.DB.storeDefaultAttributes = function(cb){
		
		var key = 'default'+DB_PATTERN_ATTR;
		
		if ( ! M3D.DB.contains(key) ){
			
			$.ajax({
				url:'bin/xml_to_json.php?_='+(new Date()).getTime(),
				type:'POST',
				dataType:'json',
				data:{filename:'attributes.xml'},
				success:function(d){
					_set({uid:key, value:d.attributes});
					if(cb){cb();}
				},
				error:function(){
					alert('Could not load the default models attributes! A server error may has occured!');
				}
			});
			
		}
		else {
			if(cb){cb();}
		}
		
	};
	
	/**
	 * Store a 3D object's position/rotation/scale and id into the local storage.
	 * @param {Object} data The object containing the 3D objet info
	 * @return {Boolean} (see _set)
	 * @see Object._set
	 */
	M3D.DB.setObject = function(data){
		data.uid += DB_PATTERN_OBJ;
		return _set(data);
	};
	
	/**
	 * Store a new type's info into the local storage.
	 * @param {Object} data The object containing the type info
	 * @return {Boolean} (see _set)
	 * @see Object._set
	 */
	M3D.DB.setType = function(data){
		data.uid += DB_PATTERN_TYPE;
		return _set(data);
	};
	
	/**
	 * Store a given type's attributes into the local storage.
	 * @param {Object} data The object containing the type's attributes
	 * @return {Boolean} (see _set)
	 * @see Object._set
	 */
	M3D.DB.setAttributes = function(data){
		data.uid += DB_PATTERN_ATTR;
		return _set(data);
	};
	
	/**
	 * Store a given editor's content into the local storage.
	 * @param {Object} data The object containing the editor's content
	 * @return {Boolean} (see _set)
	 * @see Object._set
	 */
	M3D.DB.setEditor = function(data){
		data.uid += DB_PATTERN_EDITOR;
		return _set(data);
	};
	 	
	/**
	 * Get a stored object's info from the local storage.
	 * @param {String} t The type name
	 * @return {Object} (see _get)
	 * @see Object._get
	 */
	M3D.DB.getObject = function(t){
		t = _regex(DB_PATTERN_OBJ).test(t) ? t : t+DB_PATTERN_OBJ;
		return _get(t);
	};
	
	/**
	 * Get a stored type's attributes from the local storage.
	 * @param {String} t The type name
	 * @return {Object} (see _get)
	 * @see Object._get
	 */
	M3D.DB.getAttributes = function(t){
		t = _regex(DB_PATTERN_ATTR).test(t) ? t : t+DB_PATTERN_ATTR;
		return _get(t);
	};
	
	M3D.DB.getEditor = function(ed){
		ed = _regex(DB_PATTERN_EDITOR).test(ed) ? ed : ed+DB_PATTERN_EDITOR;
		return _get(ed);
	};
	
	/**
	 * Get all stored types info from the local storage.
	 * @return {Object} (see _getAll)
	 * @see Object._getAll
	 */
	M3D.DB.getAllTypes = function(){
		return _getAll('type');
	};

	/**
	 * Check if there was a previous content that was stored and 
	 * open up the rigth window.
	 * @see Object._hasContent
	 * @see Object.M3D.GUI.showPopup
	 */
	M3D.DB.detectPreviousContent = function(){
		if ( _hasContent() ){
			/**
			* Firefox bug fix #???
			*/
			edwigs.edit('', 'edwigs');
			/**/
			
			M3D.GUI.showPopup('confirmation-load');
		}
		else {
			M3D.GUI.showPopup('game-info');
		}
	};
	
	/**
	 * Load and add stored 3D models into canvas.
	 * @param {Function} cb A callback function
	 * @see Object.getObject
	 * @see Object.M3D.GUI.importModel
	 */
	M3D.DB.load = function(cb){
		var key = null;
		var value = null;
		var _editor_loaded = false;
		
		for( var i=0; i<localStorage.length; i++ ){
			
			key = localStorage.key(i);

			var o = _regex(DB_PATTERN_OBJ);
			var e = _regex(DB_PATTERN_EDITOR);
			
			// load the models
			if ( o.test(key) ){
				
				value = M3D.DB.getObject(key);
				
				M3D.GUI.importModel({
					'uid': key.replace(DB_PATTERN_OBJ, ''),
					'name': value.name,
					'scaleX': value.scale.X,
					'scaleY': value.scale.Y,
					'scaleZ': value.scale.Z,
					'locX': value.position.X,
					'locY': value.position.Y,
					'locZ': value.position.Z,
					'rotX': value.rotation.X,
					'rotY': value.rotation.Y,
					'rotZ': value.rotation.Z,
					'docUrl': value.url,
					'autoAddToScene': true
				});
				
			}
			
			// load the editor
			else if ( !_editor_loaded && e.test(key) ) {
				editor = M3D.DB.getEditor(key);
				M3D.Editor.setContent(editor, cb);
				_editor_loaded = true;
			}
			
		}
	};
	
	/**
	 * Remove an entry from the Local Storage.
	 * @param {String} objectName The given key's name of the entry to be removed
	 */
	M3D.DB.remove = function( objectName ){
		localStorage.removeItem( objectName );
	};
	
	/**
	 * Update Datas as we move one object
	 * @param {Object} object The given key of the entry that needs to be updated
	 * @deprecated This function is not yet implemented
	 */
	M3D.DB.updateSelectedObject = function(){
		
		if ( obj ){
			
			var uid = obj.uid;
			var _obj = obj.parent;
			var uid = _obj.uid;
			
			var updateobj = M3D.DB.getObject(uid);
			if (updateobj){
				updateobj.position.X = _obj.getLocX();
				updateobj.position.Y = _obj.getLocY();
				updateobj.position.Z = _obj.getLocZ();
				updateobj.scale.X = _obj.getScaleX();
				updateobj.scale.Y = _obj.getScaleY();
				updateobj.scale.Z = _obj.getScaleZ();
				updateobj.rotation.X = _obj.getRotX();
				updateobj.rotation.Y = _obj.getRotY();
				updateobj.rotation.Z = _obj.getRotZ();
				M3D.DB.setObject({
					'uid': uid, 
					'value': updateobj
				});
			}
		}
	};
		
	/**
	 * 
	 */
	M3D.DB.saveEditor = function(data){
		M3D.DB.setEditor(data);
	}
	
	/**
	 * Update data ... ??? 
	 * @param {Object} modifiedData ???
	 * @deprecated This function is not yet implemented
	 */
	M3D.DB.update = function(modifiedData){
		M3D.DB.SaveData(modifiedData);
	};
	
	/**
	 * Clear all the valid content from the Local Storage.
	 */
	M3D.DB.clear = function(){
		for(var i in localStorage){
			if ( M3D.DB.REGEX_CONTENT_PATTERN.test(i) ){
				
				// if editor entry, clear its content
				if (  _regex(DB_PATTERN_EDITOR).test(i)  ) {
					
					log('clearing the editor entry ...');
					
					// remove the old editor entry
					M3D.DB.remove(i);
					// set a new one
					M3D.DB.setEditor({
						'uid': 'edwigs', 
						'value': '#'	
					});
					
				}
				// if attributes entry, continue
				else if ( _regex(DB_PATTERN_ATTR).test(i) ){
					continue;
				}
				// if OBJs entry, remove them
				else if ( _regex(DB_PATTERN_OBJ).test(i) ) {
					M3D.DB.remove(i);
				}
				
			}
		}
	};
	
	/**
	 * Check if the Local Storage contains an entry whose key matched a given key K.
	 * @param {Object} K The given key
	 * @return True if the entry was found, False if not
	 * @type {Boolean}
	 */
	M3D.DB.contains = function(K){
		return !!localStorage.getItem(K);
	};
	
	/**
	 * Check if the Local Storage contains an entry of a 3D model.
	 * @param {Object} v the 3D model name
	 * @return (see M3D.DB.contains)
	 * @see Object.contains
	 */
	 
	M3D.DB.containsObj = function(v){
		return M3D.DB.contains(v+DB_PATTERN_OBJ);
	};
	
	/**
	 * Check if the stored editor's content is a valid
	 * content.
	 * return True if so, False if not
	 */
	M3D.DB.checkEditorContentFromDB = function(){
		return /game has name at/.test(M3D.DB.getEditor('edwigs'));
	}
	
	/**
	 * Store a given content into the local storage.
	 * @param {Object} data The object that contains the 'name' and 'value' of the content to be stored.
	 * @return True if the content was stored successfully, False if not
	 * @type {Boolean}
	 * @private
	 */
	_set = function(data){
		try {
			
			if (typeof(data) !== "object") {
				alert("[DB] An object is required to store data!");
				return false;				
			}
			if (!data.uid) {
				alert("[DB] A 'uid' key is required to store data!");
				return false;
			}
			if (!data.value) {
				alert("[DB] A 'value' key is required to store data!");
				return false;
			}
			
			localStorage.setItem(data.uid, JSON.stringify(data.value));
			return true;
			
		} catch (e) {
			log(e);
			if (QUOTA_EXCEEDED_ERR && e === QUOTA_EXCEEDED_ERR) {
				alert('The allocated quota has exceeded!'); 
			}
		}
	};
		
	/**
	 * Get a value of a given key.
	 * @param {Object} objectId The key name
	 * @return The value of the given key
	 * @type {Object}
	 * @private
	 */
	_get = function( objectId ){
		return JSON.parse(localStorage.getItem( objectId ));
	};
	
	/**
	 * Get all the values of a given type
	 * @param {String} str The type that must be used to get its content
	 * @return An array of objects of name/value of all found elements that matched to given type
	 * @type {Array}
	 * @private
	 */
	_getAll = function(str){
		var t = [];
		var Exp = new RegExp('\_'+str+'$');
		
		for(var i in localStorage){
			if ( Exp.test(i) ){
				t.push({
					'uid':i.replace('_'+str, ''), // get rid off of "_<str>"
					'value':localStorage.getItem(i)
				});
			}
		}
		
		return t;
		
	};
	
	/**
	 * Check if the DB contains a stored content
	 * @return True if the Local Storage has a stored and valid content, False if not
	 * @type {Boolean}
	 * @private 
	 */
	_hasContent = function(){
		for (var i = 0; i < localStorage.length; i++) {
			if (M3D.DB.REGEX_CONTENT_PATTERN.test( localStorage.key(i) ) 
			&& M3D.DB.checkEditorContentFromDB()
		) {
				return true;
			}
		}
		return false;
	};
	
	/**
	 * Create a new RegExp object with an ending pattern v
	 * @param {Object} v The pattern used to create the regexp
	 * @return The RegExp object
	 * @type {RegExp}
	 */
	_regex = function(v){
		return new RegExp(v+'$');
	};
	
})(window.M3D);