/**
 * @name m3d_db.js
 * @author marginier david
 */

if(!window["M3D"]){
	window["M3D"]={};	
}

if (!window["M3D"].DB){
		window["M3D"].DB={};
}
var db;
var navigator;
	
if ('webkitIndexedDB' in window) {
	window.indexedDB = window.webkitIndexedDB;
	window.IDBTransaction = window.webkitIDBTransaction;
	/*window.IDBCursor = window.webkitIDBCursor;
	window.IDBKeyRange = window.webkitIDBKeyRange;*/
	navigator="chrome";
} else {
	window.indexedDB = window.mozIndexedDB;
	/*window.IDBTransaction = window.mozIDBTransaction;
	window.IDBCursor = window.mozIDBCursor;
	window.IDBKeyRange = window.mozIDBKeyRange;*/
}

  //--------------------------------------------------
  //------------	Open indexedDB	------------------
  //--------------------------------------------------
	
/**
 * The IndexedDB initialization process.
 * @see Object.idbCreate_entity
 * @see Object.idbCreate_grammar
 * @see Object.idbCreate_attributes
 */
M3D.DB.init = function(){
	if (window.indexedDB) {	// Open our IndexedDB if the browser supports it.
		var idbRequest = window.indexedDB.open("m3d95","3DWIGS project");
		log(idbRequest);
		idbRequest.onsuccess = function(event) {
			if(navigator=="chrome"){
				db = event.result;
				var e= event;
			}else{
				db = idbRequest.result;
				var e= idbRequest;
			}
			if(e.result.version != "1"){
				idbCreate_entity();
				idbCreate_grammar();
				/*idbCreate_attributes();*/				
			}else{
				M3D.GUI.showPopup('confirmation-load');
			}
		};
		idbRequest.onerror = function(e){log("Error: IndexedDB init");};
	}else{
		log("Error: IndexedDB incompatible browser.");
	}
}

  //--------------------------------------------------
  //----------------	Reload	----------------------
  //--------------------------------------------------
/**
 * Load and add stored 3D models into canvas.
 * @see Object.M3D.Editor.setContent
 * @see Object.M3D.GUI.importModel
 */
M3D.DB.load = function(){
	if (!db.objectStoreNames.contains('entity')||!db.objectStoreNames.contains('grammar')) {
	  log("Object store not yet created.");
	  return;
	}
	var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("grammar");
	var request_grammar = objectStore.get("gram");
	log(request_grammar);
	request_grammar.onsuccess=function(e){
		if(navigator=="chrome"){
				M3D.Editor.setContent(e.result.grammar);
		}else{
				M3D.Editor.setContent(request_grammar.result.grammar);
		}
	};
	request_grammar.onerror = function(e){log("Error: IndexedDB grammar load");};	
	
	var request = db.transaction([], IDBTransaction.READ_ONLY).objectStore("entity").openCursor(); // Get all results.
	var tmpArr = [];
	log(request);
	request.onsuccess = function(e) {
		if(navigator=="chrome"){
			var cursor = e.result;
		}else{
			var cursor = request.result;
		}
		if (!cursor) {
			var len = tmpArr.length;
			for(var i=0; i<len; i++){
				M3D.GUI.importModel({uid: tmpArr[i].id, docUrl: tmpArr[i].url, autoAddToScene: true, name: tmpArr[i].name,
									locX: tmpArr[i].position.X, locY: tmpArr[i].position.Y, locZ: tmpArr[i].position.Z, 
									scaleX: tmpArr[i].scale.X, scaleY: tmpArr[i].scale.Y, scaleZ: tmpArr[i].scale.Z, 
									rotX: tmpArr[i].rotation.X, rotY: tmpArr[i].rotation.Y, rotZ: tmpArr[i].rotation.Z});
		}
			return;
		}
		tmpArr.push(cursor.value);
		cursor.continue();
	}
	request.onerror = function(e){log("Error: IndexedDB entity load");};	
}

  //--------------------------------------------------
  //---------	Create ObjectStore	------------------
  //--------------------------------------------------
/**
 * Create ObjectStore of entity.
 * @private
 */  
function idbCreate_entity() {	// name, url, position of entity 
	var request = db.setVersion('1');
	log(request);
	request.onerror = function(e){log("Error: IndexedDB create entity");};
	request.onsuccess = function(e) {
		if (!db.objectStoreNames.contains('entity')) {
			try {
				if(navigator=="chrome"){
					db.createObjectStore('entity', 'id', true);
				}else{
					db.createObjectStore('entity', {keyPath: 'id'});
				}
				log("Object store entity created");
			} catch (err) {	
				log("Error: IndexedDB create entity");
			}
		} else {
			log("Object store entity already exists");
		}
	}
}

/**
 * Create ObjectStore of grammar.
 * @private
 */ 
function idbCreate_grammar() {	// grammar 
	var request = db.setVersion('1');
	log(request);
	request.onerror = function(e){log("Error: IndexedDB create grammar");};
	request.onsuccess = function(e) {
		if (!db.objectStoreNames.contains('grammar')) {
			try {
				if(navigator=="chrome"){
					db.createObjectStore('grammar', 'id', true);
				}else{
					db.createObjectStore('grammar', {keyPath: 'id'});
				}
				log("Object store grammar created");
				var ini='\n/* Game created by 3DWIGS */\n/* On '+(new Date()).toGMTString()+' */\n\n';
				M3D.DB.setGrammar(ini);
				M3D.Editor.initDB(ini);
				
			} catch (err) {
				log("Error: IndexedDB create grammar");
			}
		} else {
			log("Object store grammar already exists");
		}
	}
}

/**
 * Create ObjectStore of attributes with contain of bin/attributes.xml.
 * @see Object.M3D.DB.setAttributes
 * @private
 */ 
function idbCreate_attributes(){
	var request = db.setVersion('1');
	log(request);
	request.onerror = function(e){log("Error: IndexedDB create attributes");};
	request.onsuccess = function(e) {
		if (!db.objectStoreNames.contains('attributes')) {
			try {
				if(navigator=="chrome"){
					db.createObjectStore('attributes', 'id', true);
				}else{
					db.createObjectStore('attributes', {keyPath: 'id'});
				}
				var key = '__default_attributes__';
				$.ajax({
					url:'bin/xml_to_json.php',
					type:'POST',
					dataType:'json',
					data:{filename:'attributes.xml'},
					success:function(d){
						M3D.DB.setAttributes({name:key, value:d.attributes});
					},
					error:function(){
						alert('Could not load Models attributes! A server error has occured!');
					}
				});
				log("Object store attributes created");
			} catch (err) {
				log("Error: IndexedDB create attributes");
			}
		} else {
			log("Object store attributes already exists");
		}
	}
}

  //--------------------------------------------------
  //--------	Add element in ObjectStore	----------
  //--------------------------------------------------
  
/**
 * Store a 3D object's position/rotation/scale and id into IndexedDB.
 * @param {Object} element The object containing the 3D objet info
 */
M3D.DB.setObject = function(element) {
	var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("entity");
	if(navigator=="chrome"){
		var request = objectStore.put({name: element.value.name, url: element.value.url, id: element.uid,
			position: {	X: element.value.position.X, Y: element.value.position.Y, Z: element.value.position.Z },
			scale: { X: element.value.scale.X, Y: element.value.scale.Y, Z: element.value.scale.Z }, 
			rotation: {	X: element.value.rotation.X, Y: element.value.rotation.Y, Z: element.value.rotation.Z
						}}, element.uid);
	}else{
		var request = objectStore.add({name: element.value.name, url: element.value.url, 
			position: {	X: element.value.position.X, Y: element.value.position.Y, Z: element.value.position.Z },
			scale: { X: element.value.scale.X, Y: element.value.scale.Y, Z: element.value.scale.Z }, 
			rotation: {	X: element.value.rotation.X, Y: element.value.rotation.Y, Z: element.value.rotation.Z
						}, id: element.uid});
	}
	request.onerror = function(e){log("Error: IndexedDB setObject");};
	request.onsuccess = function(event) {log("Add entity k");};
}

/**
 * Store the grammar into IndexedDB.
 * @param {Object} grammar The object containing the grammar.
 */
M3D.DB.setGrammar = function(grammar) {
	var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("grammar");
	if(navigator=="chrome"){
		var request = objectStore.put({grammar: grammar}, "gram");
	}else{
		var request = objectStore.add({grammar: grammar, id:"gram"});
	}
	request.onerror = function(e){log("Error: IndexedDB setGrammar");};
	request.onsuccess = function(event) {log("Add grammar k");};
}

/**
 * Store the attributes into IndexedDB.
 * @param {Object} attributes The object containing the attributes.
 */
M3D.DB.setAttributes = function(attributes) {
	var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("attributes");
	if(navigator=="chrome"){
		var request = objectStore.put({value: attributes}, "attributes_default");
	}else{
		var request = objectStore.add({value: attributes, id:"attributes_default"});
	}
	request.onerror = function(e){log("Error: IndexedDB setAttributes");};
	request.onsuccess = function(event) {log("Add attributes_default k");};
}

  //--------------------------------------------------
  //-------	Get element in ObjectStore	----------
  //--------------------------------------------------


/**
 * Check if entity contains an entry whose key matched a given key K.
 * @param {Object} name The given key
 * @return True if the entry was found, False if not
 * @type {Boolean}
 */
M3D.DB.containsObj = function(name){
	//ConsoleHelper.waitFor("db", function(){});
	var i=1;
	var select = document.getElementById("select-model");
	
	while(typeof(select.options[i])!="undefined"){
		var str = select.options[i].toString();// a modif ! faut gére une astuce pour récupe l'affichagedu nom.
		log(str);
		str = str.substring(0,str.length-9);
		var tab=str.split("\">");
		if(tab[1]==name){
			return true;
		}
		i++;
	}
	return false;
}





  //--------------------------------------------------
  //-------	Update element in ObjectStore	----------
  //--------------------------------------------------

/**
 * Update Datas as we move one object.
 * @param {Object} element The object containing the 3D objet info
 */
M3D.DB.updateSelectedObject = function() {
	if ( obj ){
		var _obj = obj.parent;
		var uid = _obj.uid;
		var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("entity");
		var request_entity = objectStore.get(obj.uid);
		log(request_entity);
		request_entity.onsuccess=function(e){
			var element;
			if(navigator=="chrome"){
				element=e.result;
				var request = objectStore.put({name: element.name, url: element.url, id: element.id,
												position: {	X: _obj.getLocX(), Y: _obj.getLocY(), Z: _obj.getLocZ() },
												scale: { X: _obj.getScaleX(), Y: _obj.getScaleY(), Z: _obj.getScaleZ() }, 
												rotation: {	X: _obj.getRotX(), Y: _obj.getRotY(), Z: _obj.getRotZ()
												}}, element.id);
			}else{
				element=request_entity.result;
				objectStore.delete(element.uid);
				var request = objectStore.add({name: element.name, url: element.url, 
												position: {	X: _obj.getLocX(), Y: _obj.getLocY(), Z: _obj.getLocZ() },
												scale: { X: _obj.getScaleX(), Y: _obj.getScaleY(), Z: _obj.getScaleZ() }, 
												rotation: {	X: _obj.getRotX(), Y: _obj.getRotY(), Z: _obj.getRotZ()
												}, id: element.id});
			}
			
			log(element.position.X);
			request.onerror = function(e){log("Error: IndexedDB update_entity");};
			request.onsuccess = function(event) {log("Update entity k");};			
		};
		request_entity.onerror = function(e){log("Error: IndexedDB update_entity");};	
	}
}

M3D.DB.saveEditor = function(data){
	M3D.DB.setEditor({value: data.content});
}

/**
 * Update grammar when the modified.
 * @param {Object} data New grammar.
 */
M3D.DB.setEditor = function(data) {
	var grammar = data.value;	
	var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("grammar");
	if(navigator=="chrome"){
		var request = objectStore.put({grammar: grammar+""}, "gram");
	}else{
		objectStore.delete("gram");
		var request = objectStore.add({grammar: grammar+"", id: "gram"});
	}
	request.onerror = function(e){log("Error: IndexedDB update_grammar");};
	request.onsuccess = function(event) {log("Update grammar k");};	
}


  //--------------------------------------------------
  //-------	Delete element in ObjectStore	----------
  //--------------------------------------------------
  
/**
 * Remove an entity from IndexedDB.
 * @param {String} key The given key's name of the entry to be removed.
 */
M3D.DB.remove = function(key) { 
	var objectStore = db.transaction([], IDBTransaction.READ_WRITE).objectStore("entity");
	if (objectStore.delete) {
	  var request = objectStore.delete(key);
	} else {
	  var request = objectStore.remove(key);
	}
}

  //--------------------------------------------------
  //------------	Restart indexedDB	--------------
  //--------------------------------------------------

/**
 * Clear all the valid content from IndexedDB.
 * @see Object.idbCreate_entity
 * @see Object.idbCreate_grammar
 * @see Object.idbCreate_attributes
 */
M3D.DB.clear = function(){
	var request = db.setVersion("1");
	request.onerror = function(e){log("Error: IndexedDB clear");};
	request.onsuccess = function(event) {
		if (db.objectStoreNames.contains('entity') && db.objectStoreNames.contains('grammar')) {
		try {
		  // Spec has been updated to deleteObjectStore.
		  if (db.deleteObjectStore) {
			db.deleteObjectStore('entity');
			db.deleteObjectStore('grammar');
			/*db.deleteObjectStore('attributes');*/
		  } else {
			db.removeObjectStore('entity');
			db.removeObjectStore('grammar');	
			/*db.removeObjectStore('attributes');	*/		
		  }
		  
		  idbCreate_entity();
		  idbCreate_grammar();
		  /*idbCreate_attributes();*/
		  //$('#select-model option:not(:first-child)').remove();
		  $('#select-model option').not(':first-child').remove();
		  log("Removed k");
		} catch (err) {
		  log("Error: IndexedDB clear");
		}
		} else {
			log("Error: IndexedDB clear");
		}
	}
}

