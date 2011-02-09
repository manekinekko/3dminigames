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
	var idb_;
	var idbRequest_;
	var navigator;
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
  
  
  // Open our IndexedDB if the browser supports it.
  if (window.indexedDB) {
	idbRequest_ = window.indexedDB.open("m3d234", "3dwigs database" );
	idbRequest_.onerror = function(e){console.log("Error: IndexedDB transaction");};
	idbRequest_.onsuccess = function(event) {
		if(navigator=="chrome"){
			idb_ = event.result;
			if(event.result.version != "1"){
				idbCreate_entity();
				idbCreate_grammar();
			}else{
				idbShow_(event);
			}
		}else{
			idb_ = idbRequest_.result;
			if(idbRequest_.result.version != "1"){
				idbCreate_entity();
				idbCreate_grammar();
			}else{
				idbShow_(idbRequest_);
			}
		}
	};
  }else{
	console.log("Error: IndexedDB incompatible browser.");
  }

  //--------------------------------------------------
  //----------------	Reload	----------------------
  //--------------------------------------------------

function idbShow_(event){
	if (!idb_.objectStoreNames.contains('entity')||!idb_.objectStoreNames.contains('grammar')) {
	  console.log("Object store not yet created.");
	  return;
	}
	var objectStore = idb_.transaction([], IDBTransaction.READ_WRITE).objectStore("grammar");
	var request_grammar = objectStore.get("gram");
	if(navigator=="chrome"){
		request_grammar.onsuccess=function(e){
			M3D.Editor.setContent(e.result.grammar);
		};
	}else{
		request_grammar.onsuccess=function(e){
			M3D.Editor.setContent(request_grammar.result.grammar);
		};
	}
	request_grammar.onerror = function(e){console.log("Error: IndexedDB transaction");};	
	
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
		}
			return;
		}
		tmpArr.push(cursor.value);
		cursor.continue();
		
	}
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};	
}

  //--------------------------------------------------
  //---------	Create ObjectStore	------------------
  //--------------------------------------------------
  
function idbCreate_entity() {	// name, url, position of entity 
	if (!idb_) {
	  if (idbRequest_) {
		idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
	  }
	  return;
	}
	var request = idb_.setVersion('1');
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('entity')) {
			try {
				if(navigator=="chrome"){
					idb_.createObjectStore('entity', 'id', true);
				}else{
					idb_.createObjectStore('entity', {keyPath: 'id'});
				}
				console.log("Object store entity created");
			} catch (err) {	
				console.log("Error: IndexedDB transaction");
			}
		} else {
			console.log("Object store entity already exists");
		}
	}
}

function idbCreate_grammar() {	// grammar 
	if (!idb_) {
	  if (idbRequest_) {
		idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
	  }
	  return;
	}
	var request = idb_.setVersion('1');
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('grammar')) {
			try {
				if(navigator=="chrome"){
					idb_.createObjectStore('grammar', 'id', true);
				}else{
					idb_.createObjectStore('grammar', {keyPath: 'id'});
				}
				var gram=load("assets/gram/default.gram");
				M3D.DB.setGrammar(gram);
				M3D.Editor.setContent(gram);
				console.log("Object store grammar created");
			} catch (err) {
				console.log("Error: IndexedDB transaction");
			}
		} else {
			console.log("Object store grammar already exists");
		}
	}
}

function load(url) { 
	var request;  
	if (window.XMLHttpRequest) { // Firefox 
		request = new XMLHttpRequest(); 
	} else if (window.ActiveXObject) { // IE 
		request = new ActiveXObject("Microsoft.XMLHTTP"); 
	} else {
		console.log("Error: Load url data "+url);;
		return;
	}	 
	request.open('GET', url, false);
	request.send(null);  
	return request.responseText; 
}
  //--------------------------------------------------
  //--------	Add element in ObjectStore	----------
  //--------------------------------------------------
  
  
M3D.DB.setObject = function(element) {
	if (!idb_) {
		if (idbRequest_) {
			idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
		}
		return;
	}
	if (!idb_.objectStoreNames.contains('entity')) {
		console.log("Object store doesn't exist");
		return;
	}
	// Create a transaction that locks the world.
	var objectStore = idb_.transaction([], IDBTransaction.READ_WRITE).objectStore("entity");
	if(navigator=="chrome"){
		var request = objectStore.put({name: element.name, url: element.value.url, 
			position: {	posX: element.position.posX, posY: element.position.posY, posZ: element.position.posZ,
						scaleX: element.position.scaleX, scaleY: element.position.scaleY, scaleZ: element.position.scaleZ, 
						rotX: element.position.rotX, rotY: element.position.rotY, rotZ: element.position.rotZ
						}}, element.value.uid);
	}else{
		var request = objectStore.add({name: element.name, url: element.value.url, 
			position: {	posX: element.position.posX, posY: element.position.posY, posZ: element.position.posZ,
						scaleX: element.position.scaleX, scaleY: element.position.scaleY, scaleZ: element.position.scaleZ, 
						rotX: element.position.rotX, rotY: element.position.rotY, rotZ: element.position.rotZ
						}, id: element.value.uid});
	}
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(event) {console.log("Add entity k");};
}

M3D.DB.setGrammar = function(grammar) {
	if (!idb_) {
		if (idbRequest_) {
			idbRequest_.addEventListener('success', M3D.DB.remove, false); // If indexedDB is still opening, just queue this up.
		}
		return;
	}
	if (!idb_.objectStoreNames.contains('grammar')) {
		console.log("Object store doesn't exist");
		return;
	}
	// Create a transaction that locks the world.
	var objectStore = idb_.transaction([], IDBTransaction.READ_WRITE).objectStore("grammar");
	if(navigator=="chrome"){
		var request = objectStore.put({grammar: grammar}, "gram");
	}else{
		var request = objectStore.add({grammar: grammar, id:"gram"});
	}
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(event) {console.log("Add grammar k");};
}

  //--------------------------------------------------
  //-------	Update element in ObjectStore	----------
  //--------------------------------------------------


M3D.DB.update_entity = function(key, element) {
	var transaction = idb_.transaction([], IDBTransaction.READ_WRITE); // Create a transaction that locks the world.
	var objectStore = transaction.objectStore("entity");
	if(navigator=="chrome"){
		var request = objectStore.put({name: element.name, url: element.url, 
			position: {	posX: element.posX, posY: element.posY, posZ: element.posZ,
						scaleX: element.scaleX, scaleY: element.scaleY, scaleZ: element.scaleZ, 
						rotX: element.rotX, rotY: element.rotY, rotZ: element.rotZ
						}}, key);
	}else{
		objectStore.delete("key");
		var request = objectStore.add({name: element.name, url: element.url, 
			position: {	posX: element.posX, posY: element.posY, posZ: element.posZ,
						scaleX: element.scaleX, scaleY: element.scaleY, scaleZ: element.scaleZ, 
						rotX: element.rotX, rotY: element.rotY, rotZ: element.rotZ
						}, id: key});
	}
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(event) {console.log("Update entity k");};
}

M3D.DB.update_grammar = function(grammar) {
	var transaction = idb_.transaction([], IDBTransaction.READ_WRITE); // Create a transaction that locks the world.
	var objectStore = transaction.objectStore("grammar");
	if(navigator=="chrome"){
		var request = objectStore.put({grammar: grammar}, "gram");
	}else{
		objectStore.delete("gram");
		var request = objectStore.add({grammar: grammar, id: "gram"});
	}
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(event) {console.log("Update grammar k");};
}


  //--------------------------------------------------
  //-------	Delete element in ObjectStore	----------
  //--------------------------------------------------
  

M3D.DB.remove = function(key) { 
	var transaction = idb_.transaction([], IDBTransaction.READ_WRITE); // Create a transaction that locks the world.
	var objectStore = transaction.objectStore("entity");
	if (objectStore.delete) {
	  var request = objectStore.delete(key);
	} else {
	  var request = objectStore.remove(key);
	}
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(event) {console.log("DeleteKey "+key+" entity k");};
}

  //--------------------------------------------------
  //------------	Restart indexedDB	--------------
  //--------------------------------------------------

M3D.DB.clear = function(){
	if (!idb_) {
	  if (idbRequest_) {
		idbRequest_.addEventListener('success', removeObjectStore, false); // If indexedDB is still opening, just queue this up.
	  }
	  return;
	}

	var request = idb_.setVersion("1");
	request.onerror = function(e){console.log("Error: IndexedDB transaction");};
	request.onsuccess = function(event) {

	  if (idb_.objectStoreNames.contains('entity')&&idb_.objectStoreNames.contains('grammar')) {
		try {
		  // Spec has been updated to deleteObjectStore.
		  if (idb_.deleteObjectStore) {
			idb_.deleteObjectStore('entity');
			idb_.deleteObjectStore('grammar');
		  } else {
			idb_.removeObjectStore('entity');
			idb_.removeObjectStore('grammar');			
		  }
		  idbCreate_entity();
		  idbCreate_grammar();
		  id=0;
		  console.log("Removed k");
		} catch (err) {
		  console.log("Error: IndexedDB transaction");
		}
	  } else {
		console.log("entity doesn't exist.");
	  }
	};
}

