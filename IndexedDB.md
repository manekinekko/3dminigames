Introduction

I - Résumé des possibilités actuel sur Firefox (4.0 Beta 10).

1.1 Chargement API.
1.2 Création et ouverture de la base de donnée.
1.3 Test si base de donnée déjà existante.
1.4 Création d'une table.
1.5 Ajout d'un object dans une table.
1.6 Modifier un object.
1.7 Supprimer un object.
1.8 Supprimer une table.
1.9 Chargement d'un object.
1.10 Pas implémentés et problèmes.


II - Résumé des possibilités actuel sur Chrome (dev 10.0.628.0).

2.1 Chargement API.
2.2 Création et ouverture de la base de donnée.
2.3 Test si base de donnée déjà existante.
2.4 Création d'une table.
2.5 Ajout d'un object dans une table.
2.6 Modifier un object.
2.7 Supprimer un object.
2.8 Supprimer une table.
2.9 Chargement d'un object.
1.10 Pas implémentés et problèmes.

Conclusion





---


Introduction

IndexedDB représente une base de donnée, géré par le navigateur, qui est sauvegardé chez le client.



---


I - Résumé des possibilités actuel sur Firefox (4.0 Beta 10).

1.1 - Chargement API.

« window.indexedDB = window.mozIndexedDB; »

1.2 - Création et ouverture de la base de donnée.

« var idbRequest = window.indexedDB.open("m3d","3DWIGS project"); »

1.3 - Test si base de donnée déjà existante.

A chaque création de table on doit mettre à jour la version de la base de donnée, ici on placera toujours la version à "1". On peut alors test si la version à était initialiser afin de savoir si l'utilisateur à déjà sa base de donnée créer.
« idbRequest.onsuccess = function(event) {
> db = idbRequest.result;
> var e= idbRequest;
> if(e.result.version != "1"){
> > //création des tables

> }else{
> > //chargement des données

> }
} 
idbRequest.onerror = function(e){log("Error: IndexedDB init");}; »

1.4 - Création d'une table.

« var request = db.setVersion('1');
request.onerror = function(e){log("Error: IndexedDB create table");};
request.onsuccess = function(e) {
> db.createObjectStore('/**nom\_table**/', {keyPath: 'id'});
} »

1.5 - Ajout d'un object dans une table.

« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/");
var request = objectStore.add({/**format json exemple: name: "toto", sexe: "m"**/}, id: "/**id\_object**/"});
request.onerror = function(e){log("Error: IndexedDB setObject");};
request.onsuccess = function(event) {log("Add object k");}; »

1.6 - Modifier un object.

« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/");
objectStore.delete(/**id\_object**/);
var request = objectStore.add({/**format json exemple: name: "toto", sexe: "m"**/}, id: "/**id\_object**/"});
request.onerror = function(e){log("Error: IndexedDB update object");};
request.onsuccess = function(event) {log("Update object k");}; »
1.7 - Supprimer un object.

« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/");
if (objectStore.delete) {
> var request = objectStore.delete(/**id\_object**/);
} else {
> var request = objectStore.remove(/**id\_object**/);
} »

1.8 - Supprimer une table.

« if (db.deleteObjectStore) {
> db.deleteObjectStore('/**nom\_table**/');
} else {
> db.removeObjectStore('/**nom\_table**/');
} »

1.9 - Chargement d'un object.

Pour récupérer les infos d'un object en particulier:
« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/'");
var request = objectStore.get("/**id\_object**/");
request.onsuccess=function(e){
> /**request.result permet d'accéder aux infos de l'object**/
} 
request.onerror = function(e){log("Error: IndexedDB load");}; »

Pour récupérer les infos de tout les objects d'une table:
« var request = db.transaction([.md](.md), IDBTransaction.READ\_ONLY).objectStore("/**nom\_table**/").openCursor();
var tmpArr = [.md](.md);
request.onsuccess = function(e) {
> var cursor = request.result;
> if (!cursor) {
> > var len = tmpArr.length;
> > for(var i=0; i<len; i++){
> > > /**tmpArr[i](i.md) permet d'accéder aux infos de l'objet i**/

> > }

> }
> tmpArr.push(cursor.value);
> cursor.continue();
}
request.onerror = function(e){log("Error: IndexedDB load");}; »

1.10 - Pas implémentés et problèmes.

**L'API synchrone n'est toujours pas implémenté.** Pour l'ajout et modification d'un object la fonction put() n'est pas implémenté.
**L'API asynchrone ne permet pas d'avoir une fonction get.**


II - Résumé des possibilités actuel sur Chrome (dev 10.0.628.0).

2.1 - Chargement API.

Test si le navigateur utilisé est chrome.
« if ('webkitIndexedDB' in window) {
> window.indexedDB = window.webkitIndexedDB;
> window.IDBTransaction = window.webkitIDBTransaction;
} »

2.2 - Création et ouverture de la base de donnée.

« var idbRequest = window.indexedDB.open("m3d","3DWIGS project"); »

2.3 - Test si base de donnée déjà existante.

A chaque création de table on doit mettre à jour la version de la base de donnée, ici on placera toujours la version à "1". On peut alors test si la version à était initialiser afin de savoir si l'utilisateur à déjà sa base de donnée créer.
«log( idbRequest);//évite un bug
 idbRequest.onsuccess = function(event) {
> db = event.result;
> var e= event;
> if(e.result.version != "1"){
> > //création des tables

> }else{
> > //chargement des données

> }
} 
idbRequest.onerror = function(e){log("Error: IndexedDB init");}; »

2.4 - Création d'une table.

« var request = db.setVersion('1');
log(request);//évite un bug
request.onerror = function(e){log("Error: IndexedDB create table");};
request.onsuccess = function(e) {
> db.createObjectStore('/**nom\_table**/', 'id', true);
} »

2.5 - Ajout d'un object dans une table.

« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/");
var request = objectStore.put({/**format json exemple: name: "toto", sexe: "m"**/}, /**id\_object**/);
log(request);//évite un bug
request.onerror = function(e){log("Error: IndexedDB setObject");};
request.onsuccess = function(event) {log("Add object k");}; »

2.6 - Modifier un object.

Pareil que l'ajout.

2.7 - Supprimer un object.

« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/");
if (objectStore.delete) {
> var request = objectStore.delete(/**id\_object**/);
} else {
> var request = objectStore.remove(/**id\_object**/);
} »

2.8 - Supprimer une table.

« if (db.deleteObjectStore) {
> db.deleteObjectStore('/**nom\_table**/');
} else {
> db.removeObjectStore('/**nom\_table**/');
} »

2.9 - Chargement d'un object.

Pour récupérer les infos d'un object en particulier:
« var objectStore = db.transaction([.md](.md), IDBTransaction.READ\_WRITE).objectStore("/**nom\_table**/'");
var request = objectStore.get("/**id\_object**/");
log(request);//évite un bug
request.onsuccess=function(e){
> /**e.result permet d'accéder aux infos de l'object**/
} 
request.onerror = function(e){log("Error: IndexedDB load");}; »

Pour récupérer les infos de tout les objects d'une table:
« var request = db.transaction([.md](.md), IDBTransaction.READ\_ONLY).objectStore("/**nom\_table**/").openCursor();
var tmpArr = [.md](.md);
log(request);//évite un bug
request.onsuccess = function(e) {
> var cursor = e.result;
> if (!cursor) {
> > var len = tmpArr.length;
> > for(var i=0; i<len; i++){
> > > /**tmpArr[i](i.md) permet d'accéder aux infos de l'objet i**/

> > }

> }
> tmpArr.push(cursor.value);
> cursor.continue();
}
request.onerror = function(e){log("Error: IndexedDB load");}; »

2.10 - Pas implémentés et problèmes.

**L'API synchrone n'est toujours pas implémenté.** Pour l'ajout et modification d'un object la fonction add() n'est pas implémenté.
**L'API asynchrone ne permet pas d'avoir une fonction get.** Bug: les onsuccess fonctionne pas forcement (faire un log de la variable avant la demande du onsuccess règle le problème..)


---


Conclusion

Le fait que IndexedDB fonctionne actuellement en asynchrone génère un souci concernant principalement le retour de fonction pour une requête dans la base de donnée.