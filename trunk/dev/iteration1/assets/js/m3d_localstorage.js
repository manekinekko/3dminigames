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
	
	// API
	// Load and store the defaults attributes (as JSON)
	M3D.DB.loadDefaultAttributes = function(){
		
		var key = 'default_attributes';
		
		if ( ! M3D.DB.contains(key) ){
			
			$.ajax({
				url:'bin/xml_to_json.php',
				type:'POST',
				dataType:'json',
				data:{filename:'attributes.xml'},
				success:function(d){
					M3D.DB.set({name:key, value:d.attributes});
				},
				error:function(){
					alert('Could not load Models attributes! A server error has occured!');
				}
			});
			
		}
		
	}
	
	
	
	// Save data
	M3D.DB.set = function(data){
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
	
	// Save attributes
	M3D.DB.setAttributes = function(data){
		data.name = data.name+"_attr";
		
		if ( !data.attr_type ){
			alert("[DB] An 'attr_type of Integer' key is required to store attributes!");
			return false;
		} 
		
		M3D.DB.set(data);
	}
	
	// Detect previous content
	M3D.DB.detectPreviousContent = function(){
		var len = localStorage.length;
		if ( len>0 ){
			M3D.GUI.showPopup('confirmation-load');
		}
	};
	
	// Load data
	M3D.DB.load = function(){
		var len = localStorage.length;
		if ( len > 0){
			
			var key = null;
			var value = null;
			for( var i=0; i<len; i++ ){
				key = localStorage.key(i);
	            value= JSON.parse(localStorage.getItem(key));
				M3D.GUI.importModel({
					docUrl: value.url,
					autoAddToScene: true
				});

	            log("Importing model '"+key+"' from '"+value.url+"'");

			}
		
		}
	}; 
	
	// Get data
	M3D.DB.get = function( objectId ){
		return JSON.parse(localStorage.getItem( objectId ));
	}
	 
	
	// Delete data
	M3D.DB.remove = function( objectName ){
		localStorage.removeItem( objectName );
	} 
	
	// Update data
	M3D.DB.update = function(modifiedData){
		
		
		M3D.DB.SaveData(modifiedData);
	}
	
	// Get all data
	M3D.DB.getAll = function(){
		log(localStorage);
	}
	
	// Clear all data
	M3D.DB.clear = function(){
		for(var i in localStorage){
			localStorage.removeItem(i);
		}
	}
	
	// Check if the DB contains the key K
	M3D.DB.contains = function(K){
		return !!localStorage.getItem(K);
	}
	
})(window["M3D"]);
