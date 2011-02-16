/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.DB
 * @file assets/js/m3d_localstorage.js
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
	 * Entries name
	 */
	M3D.DB.REGEX_CONTENT_PATTERN = new RegExp('('+
											DB_PATTERN_ATTR+
										'|'+DB_PATTERN_TYPE+
										'|'+DB_PATTERN_OBJ+
										')$');
	
	/**
	 * The local storage initialization process.
	 * @see Object.storeDefaultAttributes
	 * @see Object.detectPreviousContent
	 */
	M3D.DB.init = function(){
		M3D.DB.storeDefaultAttributes();
		M3D.DB.detectPreviousContent();
	};
	
	/**
	 * Get the default attributes catalog from the server and store it into the local storage.
	 * @see Object.contains
	 * @see Object._set
	 */
	M3D.DB.storeDefaultAttributes = function(){
		
		var key = '__default_attributes__';
		
		if ( ! M3D.DB.contains(key) ){
			
			$.ajax({
				url:'bin/xml_to_json.php',
				type:'POST',
				dataType:'json',
				data:{filename:'attributes.xml'},
				success:function(d){
					_set({name:key, value:d.attributes});
				},
				error:function(){
					alert('Could not load Models attributes! A server error has occured!');
				}
			});
			
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
	 * Get a stored type's info from the local storage.
	 * @param {String} t The type name
	 * @return {Object} (see _get)
	 * @see Object._get
	 */
	M3D.DB.getType = function(t){
		return _get(t+DB_PATTERN_TYPE);
	};
	
	/**
	 * Get a stored type's attributes from the local storage.
	 * @param {String} t The type name
	 * @return {Object} (see _get)
	 * @see Object._get
	 */
	M3D.DB.getAttributes = function(t){
		return _get(t+DB_PATTERN_ATTR);
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
	 * Check if there was a previous content that was stored.
	 * @see Object._hasContent
	 * @see Object.M3D.GUI.showPopup
	 */
	M3D.DB.detectPreviousContent = function(){
		if ( _hasContent() ){
			M3D.GUI.showPopup('confirmation-load');
		}
	};
	
	/**
	 * Load and add stored 3D models into canvas.
	 * @see Object.getType
	 * @see Object.M3D.GUI.importModel
	 */
	M3D.DB.load = function(){
		var key = null;
		var value = null;
		for( var i=0; i<localStorage.length; i++ ){
			key = localStorage.key(i);
            
			var Exp = new RegExp('/\\'+M3D.DB.PATTERN_OBJ+'$/');
			if ( Exp.test(key) ){
				
				value = M3D.DB.getType(key);
				
				M3D.GUI.importModel({
					docUrl: value.url,
					autoAddToScene: true
				});

	            log("Importing model '"+key+"' from '"+value.url+"' at position '("+value.position.X+","+value.position.Y+","+value.position.Z+")'");
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
	
	M3D.DB.updateSelectedEntry = function(object){
	
		var uid = object.uid;
		var updateobj = JSON.parse(localStorage.getItem(uid+DB_PATTERN_OBJ));
		updateobj.position.X = object.getLocX();
		updateobj.position.Y = object.getLocY();
		updateobj.position.Z = object.getLocZ();
		updateobj.scale.X = object.getScaleX();
		updateobj.scale.Y = object.getScaleY();
		updateobj.scale.Z = object.getScaleZ();
		updateobj.rotation.X = object.getRotX();
		updateobj.rotation.Y = object.getRotY();
		updateobj.rotation.Z = object.getRotZ();
		localStorage.setItem(uid+DB_PATTERN_OBJ, JSON.stringify(updateobj));
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
				log("clearing entry '"+i+"'");
				localStorage.removeItem(i);
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
		log(v+M3D.DB.PATTERN_OBJ);
		return M3D.DB.contains(v+M3D.DB.PATTERN_OBJ);
	};
	
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
				alert("[DB] A 'value of ObjectUID' key is required to store data!");
				return false;
			}
			if (!data.value) {
				alert("[DB] A 'value of Object' key is required to store data!");
				return false;
			}
			
			localStorage.setItem(data.uid, JSON.stringify(data.value));
			return true;
			
		} catch (e) {
			log(e);
			if (QUOTA_EXCEEDED_ERR && e == QUOTA_EXCEEDED_ERR) {
				alert('The allocated quota has exceeded! Please allow 3DWIGS to use more space!'); 
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
	
	// Get all data
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
					'name':i.replace('_'+str, ''), // get rid off of "_str"
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
		var key = null;
		for (var i = 0; i < localStorage.length; i++) {
			if (M3D.DB.REGEX_CONTENT_PATTERN.test( localStorage.key(i) )) {
				return true;
			}
		}
		return false;
	}
	
})(window.M3D);