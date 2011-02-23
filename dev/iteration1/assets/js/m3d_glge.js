/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_glge.js
 * @projectDescription This file handles the GLGE environment initialization. 
 */
doc.onLoad = function() {

	setTimeout(function(){
		$('#loading-message').text('UI components loaded!');
	}, 1000);
	
	mouse = new GLGE.MouseInput(canvas);
	mouseGlobale = new GLGE.MouseInput(canvas);
	mouseRecord = mouseGlobale.getMousePosition();
	keys = new GLGE.KeyInput();
	pickcolor = doc.getElement("green");
	controller = new M3D.GUI.CameraController(canvas);
	renderer = new GLGE.Renderer(document.getElementById("canvas"));
	scene = doc.getElement("mainscene");
	renderer.setScene(scene);
	
	///////////////////////////			
	// -- the rendering loop
	///////////////////////////
	function _render() {
		mouseRecordOld = mouseRecord;
		mouseRecord = mouseGlobale.getMousePosition()
		renderer.render();
	}

	// -- render each millisecond
	setInterval(_render, 1);
	
	// finish initialisation
	setTimeout(function(){
		$('#info-bottom').slideDown('slow', function(){
			$('#tools-panel, #viewmenu').fadeIn('slow', function(){
				$('#loading-message, #modal').hide();
								
				// Initilization
				M3D.GUI.init();
				M3D.DB.init();
				M3D.Editor.init();
				
				// -- objet and camera rotation
				controller.onchange = function(xRot, yRot) { 
					M3D.GUI.handleCamera(xRot, yRot);
				};

			});
		});
	}, 2000);
	
};

// -- wait 2 sec and load the xml containing the scene data 
setTimeout(function(){
	$('#loading-message').text('Loading UI components...');
	doc.load("level.xml");	
}, 2000);

