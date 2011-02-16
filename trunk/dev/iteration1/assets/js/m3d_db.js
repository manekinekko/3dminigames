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

var navigator;
var name_database="m3d267";
	
	
  // IndexedDB spec is still evolving, various browsers keep it
  // behind various flags and implementation varies.
  if ('webkitIndexedDB' in window) {
	window.indexedDB = window.webkitIndexedDB;
	window.IDBTransaction = window.webkitIDBTransaction;
	navigator="chrome";
  } else{
	window.indexedDB = window.mozIndexedDB;
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
		var idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
		idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.init");};
		idbRequest_.onsuccess = function(event) {
			if(navigator=="chrome"){
				var idb_ = event.result;
				var e= event;
			}else{
				var idb_ = idbRequest_.result;
				var e= idbRequest_;
			}
			if(e.result.version != "1"){
				idbCreate_entity(idb_);
				idbCreate_grammar(idb_);
				idbCreate_attributes(idb_);
			}else{
				M3D.GUI.showPopup('confirmation-load');
			}
			idb_.close();
		};
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
	var idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.load");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		if (!idb_.objectStoreNames.contains('entity')||!idb_.objectStoreNames.contains('grammar')) {
		  log("Object store not yet created.");
		  return;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("load is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("load is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("load is timeout");
				idb_.close();
			}
			var objectStore = txn.objectStore("grammar");
			var request_grammar = objectStore.get("gram");
			if(navigator=="chrome"){
				request_grammar.onsuccess=function(e){
					//M3D.Editor.setContent(e.result.grammar);
				};
			}else{
				request_grammar.onsuccess=function(e){
								log(request_grammar.result);
					//M3D.Editor.setContent(request_grammar.result.grammar);
				};
			}
			request_grammar.onerror = function(e){log("Error: IndexedDB transaction");};	
			
			var transaction = idb_.transaction([], IDBTransaction.READ_ONLY); // Ready is default.
			var request = transaction.objectStore("entity").openCursor(); // Get all results.
			// This callback will continue to be called until we have no more results.
			var tmpArr = [];
			request.onsuccess = function(e) {
				if(navigator=="chrome"){
					var cursor = e.result;
				}else{
					var cursor = request.result;
				}
				if (!cursor) {
					var len = tmpArr.length;
					for(var i=0; i<len; i++){
						M3D.GUI.importModel({docUrl: tmpArr[i].url, autoAddToScene: true});
						$('#select-model').append('<option value="'+tmpArr[i].id+'">'+tmpArr[i].name+'</option>');
				}
					return;
				}
				tmpArr.push(cursor.value);
				cursor.continue();
				
			}
			request.onerror = function(e){log("Error: IndexedDB transaction");};	
		}
	}
}

  //--------------------------------------------------
  //---------	Create ObjectStore	------------------
  //--------------------------------------------------
/**
 * Create ObjectStore of entity.
 * @param {Object} idb_ The database.
 * @private
 */  
function idbCreate_entity(idb_) {	// name, url, position of entity 
	var request = idb_.setVersion('1');
	request.onerror = function(e){log("Error: IndexedDB transaction");};
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('entity')) {
			try {
				if(navigator=="chrome"){
					idb_.createObjectStore('entity', 'id', true);
				}else{
					idb_.createObjectStore('entity', {keyPath: 'id'});
				}
				log("Object store entity created");
			} catch (err) {	
				log("Error: IndexedDB transaction");
			}
		} else {
			log("Object store entity already exists");
		}
	}
}

/**
 * Create ObjectStore of grammar.
 * @param {Object} idb_ The database.
 * @private
 */ 
function idbCreate_grammar(idb_) {	// grammar 
	var request = idb_.setVersion('1');
	request.onerror = function(e){log("Error: IndexedDB transaction");};
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('grammar')) {
			try {
				if(navigator=="chrome"){
					idb_.createObjectStore('grammar', 'id', true);
				}else{
					idb_.createObjectStore('grammar', {keyPath: 'id'});
				}
				//var gram=load("assets/gram/default.gram");
				M3D.DB.setGrammar(M3D.Editor.getContent());
				//M3D.Editor.setContent(gram);
				log("Object store grammar created");
			} catch (err) {
				log("Error: IndexedDB transaction");
			}
		} else {
			log("Object store grammar already exists");
		}
	}
}

/**
 * Create ObjectStore of attributes with contain of bin/attributes.xml.
 * @see Object.M3D.DB.setAttributes
 * @param {Object} idb_ The database.
 * @private
 */ 
function idbCreate_attributes(idb_){
	var request = idb_.setVersion('1');
	request.onerror = function(e){log("Error: IndexedDB transaction");};
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('attributes')) {
			try {
				if(navigator=="chrome"){
					idb_.createObjectStore('attributes', 'id', true);
				}else{
					idb_.createObjectStore('attributes', {keyPath: 'id'});
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
				log("Error: IndexedDB transaction");
			}
		} else {
			log("Object store attributes already exists");
		}
	}
}

/*function load(url) { 
	var request;  
	if (window.XMLHttpRequest) { // Firefox 
		request = new XMLHttpRequest(); 
	} else if (window.ActiveXObject) { // IE 
		request = new ActiveXObject("Microsoft.XMLHTTP"); 
	} else {
		log("Error: Load url data "+url);;
		return;
	}	 
	request.open('GET', url, false);
	request.send(null);  
	return request.responseText; 
}*/

  //--------------------------------------------------
  //--------	Add element in ObjectStore	----------
  //--------------------------------------------------
  
/**
 * Store a 3D object's position/rotation/scale and id into IndexedDB.
 * @param {Object} element The object containing the 3D objet info
 * @return {Boolean}
 */
M3D.DB.setObject = function(element) {
	idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.setObject");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		if (!idb_) {
			if (idbRequest_) {
				idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
			}
			return false;
		}
		if (!idb_.objectStoreNames.contains('entity')) {
			log("Object store doesn't exist");
			return false;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("setObject is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("setObject is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("setObject is timeout");
				idb_.close();
			}
			// Create a transaction that locks the world.
			var objectStore = txn.objectStore("entity");
			if(navigator=="chrome"){
				var request = objectStore.put({name: element.name, url: element.value.url, 
					position: {	X: element.value.position.X, Y: element.value.position.Y, Z: element.value.position.Z },
					scale: { X: element.value.scale.X, Y: element.value.scale.Y, Z: element.value.scale.Z }, 
					rotation: {	X: element.value.rotation.X, Y: element.value.rotation.Y, Z: element.value.rotation.Z
								}}, element.value.uid);
			}else{
				var request = objectStore.add({name: element.name, url: element.value.url, 
					position: {	X: element.value.position.X, Y: element.value.position.Y, Z: element.value.position.Z },
					scale: { X: element.value.scale.X, Y: element.value.scale.Y, Z: element.value.scale.Z }, 
					rotation: {	X: element.value.rotation.X, Y: element.value.rotation.Y, Z: element.value.rotation.Z
								}}, element.value.uid);
			}
			request.onerror = function(e){log("Error: IndexedDB transaction");return false;};
			request.onsuccess = function(event) {log("Add entity k");return true;};
		}
	}
}

/**
 * Store the grammar into IndexedDB.
 * @param {Object} grammar The object containing the grammar.
 * @return {Boolean}
 */
M3D.DB.setGrammar = function(grammar) {
	idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.setGrammar");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		if (!idb_) {
			if (idbRequest_) {
				idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
			}
			return false;
		}
		if (!idb_.objectStoreNames.contains('grammar')) {
			log("Object store doesn't exist");
			return false;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("setGrammar is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("setGrammar is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("setGrammar is timeout");
				idb_.close();
			}
			// Create a transaction that locks the world.
			var objectStore = txn.objectStore("grammar");
			if(navigator=="chrome"){
				var request = objectStore.put({grammar: grammar}, "gram");
			}else{
				var request = objectStore.add({grammar: grammar, id:"gram"});
			}
			request.onerror = function(e){log("Error: IndexedDB transaction");return false;};
			request.onsuccess = function(event) {log("Add grammar k");return true;};
		}	
	}
}

/**
 * Store the attributes into IndexedDB.
 * @param {Object} attributes The object containing the attributes.
 * @return {Boolean}
 */
M3D.DB.setAttributes = function(attributes) {
	idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.setAttributes");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		if (!idb_) {
			if (idbRequest_) {
				idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
			}
			return false;
		}
		if (!idb_.objectStoreNames.contains('attributes')) {
			log("Object store doesn't exist");
			return false;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("setAttributes is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("setAttributes is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("setAttributes is timeout");
				idb_.close();
			}
			// Create a transaction that locks the world.
			var objectStore = txn.objectStore("attributes");
			if(navigator=="chrome"){
				var request = objectStore.put({value: attributes}, "attributes_default");
			}else{
				var request = objectStore.add({value: attributes, id:"attributes_default"});
			}
			request.onerror = function(e){log("Error: IndexedDB transaction");return false;};
			request.onsuccess = function(event) {log("Add attributes_default k");return true;};
		}
	}
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
	return false;
}





  //--------------------------------------------------
  //-------	Update element in ObjectStore	----------
  //--------------------------------------------------

/**
 * Update Datas as we move one object.
 * @param {Object} element The object containing the 3D objet info
 */
M3D.DB.update_entity = function(element) {
	var idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.update_entity");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("update_entity is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("update_entity is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("update_entity is timeout");
				idb_.close();
			}
			// Create a transaction that locks the world.
			var objectStore = txn.objectStore("entity");
			if(navigator=="chrome"){
				var request = objectStore.put({name: element.name, url: element.value.url, 
					position: {	X: element.value.position.X, Y: element.value.position.Y, Z: element.value.position.Z },
					scale: { X: element.value.scale.X, Y: element.value.scale.Y, Z: element.value.scale.Z }, 
					rotation: {	X: element.value.rotation.X, Y: element.value.rotation.Y, Z: element.value.rotation.Z
								}}, element.value.uid);
			}else{
				objectStore.delete(element.value.uid);
				var request = objectStore.add({name: element.name, url: element.value.url, 
					position: {	X: element.value.position.X, Y: element.value.position.Y, Z: element.value.position.Z },
					scale: { X: element.value.scale.X, Y: element.value.scale.Y, Z: element.value.scale.Z }, 
					rotation: {	X: element.value.rotation.X, Y: element.value.rotation.Y, Z: element.value.rotation.Z
								}}, element.value.uid);;
			}
			request.onerror = function(e){log("Error: IndexedDB transaction");};
			request.onsuccess = function(event) {log("Update entity k");};
		}
	}
}

/**
 * Update grammar when the modified.
 * @param {String} grammar New grammar.
 */
M3D.DB.update_grammar = function(grammar) {
	idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.update_grammar");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("update_grammar is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("update_grammar is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("update_grammar is timeout");
				idb_.close();
			}
			// Create a transaction that locks the world.
			var objectStore = txn.objectStore("grammar");
			if(navigator=="chrome"){
				var request = objectStore.put({grammar: grammar}, "gram");
			}else{
				objectStore.delete("gram");
				var request = objectStore.add({grammar: grammar, id: "gram"});
			}
			request.onerror = function(e){log("Error: IndexedDB transaction");};
			request.onsuccess = function(event) {log("Update grammar k");};
		}	
	}		
}


  //--------------------------------------------------
  //-------	Delete element in ObjectStore	----------
  //--------------------------------------------------
  
/**
 * Remove an entity from IndexedDB.
 * @param {String} key The given key's name of the entry to be removed.
 */
M3D.DB.remove = function(key) { 
	idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.remove");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		var txn = idb_.transaction([], IDBTransaction.READ_WRITE);
		if(txn){
			txn.oncomplete = function () {
				log("remove is ok");
				idb_.close();
			}
			txn.onabort = function () {
				log("remove is abord");
				idb_.close();
			}
			txn.ontimeout = function () {
				log("remove is timeout");
				idb_.close();
			}
			// Create a transaction that locks the world.
			var objectStore = txn.objectStore("entity");
			if (objectStore.delete) {
			  var request = objectStore.delete(key);
			} else {
			  var request = objectStore.remove(key);
			}
		}
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
	var idbRequest_ = window.indexedDB.open(name_database, "3dwigs database" );
	idbRequest_.onerror = function(e){log("Error: IndexedDB transaction from M3D.DB.remove");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			var idb_ = event.result;
		}else{
			var idb_ = idbRequest_.result;
		}
		
		if (!idb_) {
		  if (idbRequest_) {
			idbRequest_.addEventListener('success', removeObjectStore, false); // If indexedDB is still opening, just queue this up.
		  }
		  return;
		}

		var request = idb_.setVersion("1");
		request.onerror = function(e){log("Error: IndexedDB transaction");};
		request.onsuccess = function(event) {

		  if (idb_.objectStoreNames.contains('entity')&&idb_.objectStoreNames.contains('grammar')&&idb_.objectStoreNames.contains('attributes')) {
			try {
			  // Spec has been updated to deleteObjectStore.
			  if (idb_.deleteObjectStore) {
				idb_.deleteObjectStore('entity');
				idb_.deleteObjectStore('grammar');
				idb_.deleteObjectStore('attributes');
			  } else {
				idb_.removeObjectStore('entity');
				idb_.removeObjectStore('grammar');	
				idb_.removeObjectStore('attributes');			
			  }
			  idbCreate_entity(idb_);
			  idbCreate_grammar(idb_);
			  idbCreate_attributes(idb_);
			  //$('#select-model option:not(:first-child)').remove();
			  $('#select-model option').not(':first-child').remove();
			  log("Removed k");
			} catch (err) {
			  log("Error: IndexedDB transaction");
			}
		  } else {
			log("entity doesn't exist.");
		  }
		  idb_.close();
		};
		
	}
}

