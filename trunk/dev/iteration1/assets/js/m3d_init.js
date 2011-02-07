/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_init.js
 */

// Initialize namespaces
if (!window.M3D) {
	window.M3D = {};
}

if (!window.M3D.GUI){
	window.M3D.GUI = {};
}
if (!window.M3D.DB) {
	window.M3D.DB = {};
}
if (!window.M3D.Common) {
	window.M3D.Common = {};
}
if (!window.M3D.Editor){
	window.M3D.Editor = {};
}
if (!window.M3D.Upload){
	window.M3D.Upload = {};
}


// Initialize GLGE global variables
var canvas = document.getElementById('canvas'),
	doc = new GLGE.Document(),
	obj,
	scene,
	hoverobj,
	now;