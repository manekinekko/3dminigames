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
	M3D.DB._localStorage = localStorage;
	
	// API
	// Save data
	M3D.DB.set = function(data){
		try {
			localStorage.setItem(data.name, JSON.stringify(data.value)); 
		} catch (e) {
			log(e);
			if (QUOTA_EXCEEDED_ERR && e == QUOTA_EXCEEDED_ERR) {
				alert('The allocated quota is exceeded! Please use more space!'); 
			}
		}
	}
	
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
		log(JSON.parse(localStorage.getItem( objectId )));
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
	
})(window["M3D"]);
