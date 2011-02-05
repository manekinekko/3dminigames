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
  // IndexedDB spec is still evolving, various browsers keep it
  // behind various flags and implementation varies.
  if ('webkitIndexedDB' in window) {
	window.indexedDB = window.webkitIndexedDB;
	window.IDBTransaction = window.webkitIDBTransaction;
  } else if ('moz_indexedDB' in window) {
	window.indexedDB = window.moz_indexedDB;
  }

  //--------------------------------------------------
  //------------	Open indexedDB	------------------
  //--------------------------------------------------
  
  
  // Open our IndexedDB if the browser supports it.
  if (window.indexedDB) {
	idbRequest_ = window.indexedDB.open("m3d205", "3dwigs database" );
	idbRequest_.onerror = M3D.DB.Error;
	idbRequest_.addEventListener('success', function(event) {
		idb_ = event.result;
		if(event.result.version != "1"){
			idbCreate_entity();
			idbCreate_grammar();
		}else{
			idbShow_(event);
		}
	}, false);
  }

  
M3D.DB.Error = function(event) {
	console.log("Error: "+event.message + ' (' + event.code + ')');
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
	request_grammar.onsuccess=function(e){
		//place ici la restauration de la grammaire sur la page avec :	e.result
	};
	request_grammar.onerror = M3D.DB.Error;	
	
	var transaction = idb_.transaction([], IDBTransaction.READ_ONLY); // Ready is default.
	var request = transaction.objectStore("entity").openCursor(); // Get all results.
	// This callback will continue to be called until we have no more results.
	var tmpArr = [];
	request.onsuccess = function(e) {
		var cursor = e.result;
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
	request.onerror = M3D.DB.Error;	
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
	request.onerror = M3D.DB.Error;
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('entity')) {
			try {
				var objectStore = idb_.createObjectStore('entity', 'id', true);
				console.log("Object store entity created");
			} catch (err) {
				M3D.DB.Error();
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
	request.onerror = M3D.DB.Error;
	request.onsuccess = function(e) {
		if (!idb_.objectStoreNames.contains('grammar')) {
			try {
				var objectStore = idb_.createObjectStore('grammar', 'id', true);
				console.log("Object store grammar created");
			} catch (err) {
				M3D.DB.Error();
			}
		} else {
			console.log("Object store grammar already exists");
		}
		M3D.DB.add_grammar("");
	}
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
	var request = objectStore.put({name: element.name, url: element.value.url, 
		position: {	posX: element.position.posX, posY: element.position.posY, posZ: element.position.posZ,
					scaleX: element.position.scaleX, scaleY: element.position.scaleY, scaleZ: element.position.scaleZ, 
					rotX: element.position.rotX, rotY: element.position.rotY, rotZ: element.position.rotZ
					}}, element.value.uid);
	console.log(element.value);
	request.onerror = M3D.DB.Error;
	request.onsuccess = function(event) {console.log("Add entity k");};
}

M3D.DB.add_grammar = function(grammar) {
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
	var request = objectStore.put({grammar: grammar}, "gram");
	request.onerror = M3D.DB.Error;
	request.onsuccess = function(event) {console.log("Add grammar k");};
}

  //--------------------------------------------------
  //-------	Update element in ObjectStore	----------
  //--------------------------------------------------


M3D.DB.update_entity = function(key, element) {
	var transaction = idb_.transaction([], IDBTransaction.READ_WRITE); // Create a transaction that locks the world.
	var objectStore = transaction.objectStore("entity");
	var request = objectStore.put({name: element.name, url: element.url, 
		position: {	posX: element.posX, posY: element.posY, posZ: element.posZ,
					scaleX: element.scaleX, scaleY: element.scaleY, scaleZ: element.scaleZ, 
					rotX: element.rotX, rotY: element.rotY, rotZ: element.rotZ
					}}, key);
	request.onerror = M3D.DB.Error;
	request.onsuccess = function(event) {console.log("Update entity k");};
}

M3D.DB.update_grammar = function(grammar) {
	var transaction = idb_.transaction([], IDBTransaction.READ_WRITE); // Create a transaction that locks the world.
	var objectStore = transaction.objectStore("grammar");
	var request = objectStore.put({grammar: grammar}, "gram");
	request.onerror = M3D.DB.Error;
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
	request.onerror = M3D.DB.Error;
	request.onsuccess = function(event) {console.log("DeleteKey "+key+" entity k");};
}

  //--------------------------------------------------
  //--------	Get element in ObjectStore	----------
  //--------------------------------------------------

M3D.DB.get_entity = function(key){
	var attr="";
	var objectStore = idb_.transaction([], IDBTransaction.READ_WRITE).objectStore("entity");
	var objectStore_entity = objectStore.get(key);
	objectStore_entity.onsuccess=function(e){
		attr = e.result;
		//ici change la valeur key par attr dans la grammaire
	}
	objectStore_entity.onerror = M3D.DB.Error;
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
	request.onerror = M3D.DB.Error;
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
		  M3D.DB.Error();
		}
	  } else {
		console.log("entity doesn't exist.");
	  }
	};
}

