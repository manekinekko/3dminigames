/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */

if (!window["M3D"]) {
    window["M3D"] = {};
}

if (!window["M3D"].DB) {
    window["M3D"].DB = {};
}


(function(M3D){

    // pre requisites

	/**
	 * _attr : for types attributes
	 * _type : for defined types
	 * _obj : for imported 3D models
	 */
	M3D.DB.REGEX_CONTENT_PATTERN = /(_attr|_type|_obj)$/;
	
	// API
	
	// Load and store the defaults attributes (as JSON)
	M3D.DB.storeDefaultAttributes = function(){
		
		var key = '__default_attributes__';
		
		if ( ! M3D.DB.contains(key) ){
			
			$.ajax({
				url:'bin/xml_to_json.php',
				type:'POST',
				dataType:'json',
				data:{filename:'attributes.xml'},
				success:function(d){
					M3D.DB._set({name:key, value:d.attributes});
				},
				error:function(){
					alert('Could not load Models attributes! A server error has occured!');
				}
			});
			
		}
		
	}
	
	
	
	// Save data
	M3D.DB._set = function(data){
		try {
			
			if (!data.name) {
				alert("[DB] A 'name of String' key is required to store data!");
				return false;
			}
			if (!data.value) {
				alert("[DB] A 'value of Object' key is required to store data!");
				return false;
			}
			
			localStorage.setItem(data.name, JSON.stringify(data.value));
			
		} catch (e) {
			log(e);
			if (QUOTA_EXCEEDED_ERR && e == QUOTA_EXCEEDED_ERR) {
				alert('The allocated quota is exceeded! Please use more space!'); 
			}
		}
	}
	
	// Save 3D Objects (only usefull info are stored!)
	M3D.DB.setObject = function(data){
		data.name = data.name+'_obj';
		M3D.DB._set(data);
	}
	
	// Save Entities
	M3D.DB.setType = function(data){
		data.name = data.name+'_type';
		M3D.DB._set(data);
	}
	
	// Save attributes
	M3D.DB.setAttributes = function(data){
		data.name = data.name+'_attr';
		M3D.DB._set(data);
	}
	
	// Get data
	M3D.DB._get = function( objectId ){
		return JSON.parse(localStorage.getItem( objectId ));
	}
	 	
	// Get type
	M3D.DB.getType = function(t){
		return M3D.DB._get(t);
	}
	
	// Get attributes
	M3D.DB.getAttributes = function(t){
		return M3D.DB._get(t);
	}
	
	M3D.DB.getAllTypes = function(){
		return M3D.DB._getAll('type');
	}
			
	// Detect previous content
	M3D.DB.detectPreviousContent = function(){
		if ( M3D.DB.__hasContent__() ){
			M3D.GUI.showPopup('confirmation-load');
		}
	};
	
	// Load data
	M3D.DB.load = function(){
		var key = null;
		var value = null;
		for( var i=0; i<localStorage.length; i++ ){
			key = localStorage.key(i);
            
			if ( /\_obj$/.test(key) ){
				
				value = M3D.DB.getType(key);
				
				M3D.GUI.importModel({
					docUrl: value.url,
					autoAddToScene: true
				});

	            log("Importing model '"+key+"' from '"+value.url+"'");
			}

		}
	}; 

	
	// Delete data
	M3D.DB.remove = function( objectName ){
		localStorage.removeItem( objectName );
	} 
	
	// Update data
	M3D.DB.update = function(modifiedData){
		
		
		M3D.DB.SaveData(modifiedData);
	}
	
	// Get all data
	M3D.DB._getAll = function(str){
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
		
	}
	
	// Clear all data
	M3D.DB.clear = function(){
		for(var i in localStorage){
			if ( M3D.DB.REGEX_CONTENT_PATTERN.test(i) ){
				log("clearing entry '"+i+"'");
				localStorage.removeItem(i);
			}
		}
	}
	
	// Check if the DB contains the key K
	M3D.DB.contains = function(K){
		return !!localStorage.getItem(K);
	}
	
	// check if the DB contains a stored content
	M3D.DB.__hasContent__ = function(){
		var key = null;
		for (var i = 0; i < localStorage.length; i++) {
			if (M3D.DB.REGEX_CONTENT_PATTERN.test( localStorage.key(i) )) {
				return true;
			}
		}
		return false;
	}
	
})(window["M3D"]);
