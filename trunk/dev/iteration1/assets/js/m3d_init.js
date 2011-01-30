/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */

var canvas = document.getElementById('canvas'),
	doc = new GLGE.Document(),
	obj,
	scene,
	hoverobj,
	now;

// -- callback function that is called when the xml document
//    has finished loading
doc.onLoad = function() {
	
	// auto loading functions
	M3D.DB.storeDefaultAttributes();
	M3D.DB.detectPreviousContent();
	
	// GLGE logic
	var mouse=new GLGE.MouseInput(canvas);
	var keys=new GLGE.KeyInput();
	var pickcolor=doc.getElement("green");
	var controller = new M3D.GUI.CameraController(canvas);
	
	var renderer = new GLGE.Renderer(document.getElementById("canvas"));
	scene = doc.getElement("mainscene");
	renderer.setScene(scene);

	// -- objet and camera rotation
	controller.onchange = function(xRot, yRot) { 
		M3D.GUI.handleCamera(xRot, yRot);
	}

	///////////////////////////			
	// -- the rendering loop
	///////////////////////////
	var now;
	var lasttime = 0;
	function render() {
		
		now=parseInt(new Date().getTime());
		lasttime=now;

		//checkkeys();

		// render the canvas
		renderer.render();
	}

	// -- render each millisecond
	setInterval(render, 1);	
	
}

// -- load the xml containing the scene data
doc.load("level.xml");

