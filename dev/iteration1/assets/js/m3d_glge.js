/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_glge.js
 * @projectDescription This file handles the GLGE environment initialization. 
 */
doc.onLoad = function() {
	mouse = new GLGE.MouseInput(canvas);
	keys = new GLGE.KeyInput();
	pickcolor = doc.getElement("green");
	controller = new M3D.GUI.CameraController(canvas);
	renderer = new GLGE.Renderer(document.getElementById("canvas"));
	scene = doc.getElement("mainscene");
	renderer.setScene(scene);
	
	// Initilization
	M3D.GUI.init();

	//local storage
	if (M3D.DB.init()){ 
		M3D.DB.init();
		M3D.Editor.init();
	}
	
	// -- objet and camera rotation
	controller.onchange = function(xRot, yRot) { 
		M3D.GUI.handleCamera(xRot, yRot);
	}

	///////////////////////////			
	// -- the rendering loop
	///////////////////////////
	function _render() {
		// render the canvas
		renderer.render();
	}

	// -- render each millisecond
	setInterval(_render, 1);
	
}

// -- load the xml containing the scene data
doc.load("level.xml");

