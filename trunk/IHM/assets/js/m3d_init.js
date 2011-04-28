/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_init.js
 * @projectDescription This file initializes all the necessary namespaces and some global variables.
 */

/**
 * Set the global namespace.
 */
if (!window.M3D) {
	window.M3D = {};
}

/**
 * set the config namespace.
 * @see assets/js/m3d_config.js
 */
if (!window.M3D.Config){
	window.M3D.Config = {};
}
/**
 * set the GUI functions namespace.
 * @see assets/js/m3d_utils.js
 */
if (!window.M3D.GUI){
	window.M3D.GUI = {};
}
/**
 * Set the DB functions namespace
 * @see assets/js/m3d_db.js or assets/js/m3d_localstorage.js
 */
if (!window.M3D.DB) {
	window.M3D.DB = {};
}
/**
 * Set the common functions namespace
 * @see assets/js/m3d_common.js
 */
if (!window.M3D.Common) {
	window.M3D.Common = {};
}
/**
 * Set the editor's functions namespace.
 * @see assets/js/m3d_editor.js
 */
if (!window.M3D.Editor){
	window.M3D.Editor = {};
}
/**
 * Set the upload module functions namespace.
 * @see assets/js/m3d_upload.js
 */
if (!window.M3D.Upload){
	window.M3D.Upload = {};
}

/**
 * Initialize GLGE global variables.
 */
var canvas = document.getElementById('canvas'),
	doc = new GLGE.Document(),
	config = new GLGE.Document(),
	obj,
	urlCollada,
	grid,
	scene,
	hoverobj,
	now,
	mouseGlobale,								// ajout Tom 16/03 : rotateCam
	mouseRecordOld,
	mouseRecord;// ajout Tom 16/03 : rotateCam