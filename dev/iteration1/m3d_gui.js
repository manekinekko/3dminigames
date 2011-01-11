

/**
 * @guiFile
 * @name m3d_gui.js
 * @author chegham wassim
 */


var canvas = document.getElementById('canvas');

// -- create a document

var doc = new GLGE.Document();
var obj;
var scene;
var hoverobj;
var mouseovercanvas;
var now;

// -- callback function that is called when the xml document
//    has finished loading
doc.onLoad = function() {
	
	var mouse=new GLGE.MouseInput(canvas);
	var keys=new GLGE.KeyInput();
	var pickcolor=doc.getElement("green");
	var controller = new M3D.Utilitie.CameraController(canvas);
	
	// -- create a renderer and pass in the canvas object
	var renderer = new GLGE.Renderer(document.getElementById("canvas"));
	
	// -- create a new scene. the name defined in the parameter corresponds
	//    to the id attribute of the scene element in the xml file.
	scene = doc.getElement("mainscene");
	scene.backgroundColor = "#fff";
	
	// -- pass the scene to the renderer
	renderer.setScene(scene);

	
	// -- picking
	$('#canvas').bind('mousedown', M3D.Utilitie.pickObject);
	
	$('#canvas').bind('mouseover', function(e){mouseovercanvas=true;});
	
	// -- camera 
	document.getElementById("canvas").addEventListener('DOMMouseScroll', M3D.Utilitie.wheel, false);
	window.onmousewheel = document.onmousewheel = M3D.Utilitie.wheel;
	
	// -- manual value updating
	$('input[type="text"]:not([disabled])').bind('keypress', function(){ M3D.Utilitie.updateValues($(this)) });

	
	$('#switchBbox').bind('click', M3D.Utilitie.toggleBbox);

	// -- objet and camera rotaion
	controller.onchange = function(xRot, yRot) { 

		M3D.Utilitie.handleCamera(xRot, yRot);
	}
		
	// -- reset camera
	$('#resetcamera').bind('click', M3D.Utilitie.resetCameraPosition);
	
	// -- bind import
	$('#import').click( function(){
		M3D.Utilitie.importModel( $('#importUrl').val() );
	});
	
	// -- show upload area
	var flag = true;
	$('#showupload').click(function(){
		
		M3D.Utilitie.toggleShowUplaod();
		
	})
	
	///////////////////////////			
	// -- the rendering loop
	///////////////////////////
	var now;
	var lasttime = 0;
	function render() {
		now=parseInt(new Date().getTime());
		checkkeys();
		renderer.render();
		lasttime=now;
	}

	// -- render each millisecond
	setInterval(render, 1);
	
	
}

// -- load the xml containing the scene data
doc.load("level.xml");

