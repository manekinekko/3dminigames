/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
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
	
	// auto loadings functions
	M3D.DB.load();
	
	// GLGE logic
	var mouse=new GLGE.MouseInput(canvas);
	var keys=new GLGE.KeyInput();
	var pickcolor=doc.getElement("green");
	var controller = new M3D.GUI.CameraController(canvas);
	
	var renderer = new GLGE.Renderer(document.getElementById("canvas"));
	scene = doc.getElement("mainscene");
	renderer.setScene(scene);

	// Start Event Bindings
	setTimeout(function(){ $('#viewmenu').children().animate({top:70}, 200); }, 1500);
	$('#viewmenu').hover(function(){
		$(this).children().animate({top:30}, 200);
	}, function(){
		$(this).children().animate({top:70}, 200);
	})
	
	// -- is hovering the canvas ?
	$('#canvas').bind('mouseover', function(e){mouseovercanvas=true;});
	
	// -- picking
	$('#canvas').bind('mousedown', M3D.GUI.pickObject);	
	
	// -- mouse wheel for camera
	document.getElementById("canvas").addEventListener('DOMMouseScroll', M3D.GUI.wheel, false);
	window.document.getElementById("canvas").onmousewheel = document.getElementById("canvas").onmousewheel = M3D.GUI.wheel;
	
	// -- values manual updating
	$('input[type="text"]:not([disabled])').bind('keypress', function(){ M3D.GUI.updateValues($(this)) });

	
	// -- toggling the bbox
	$('#switchBbox').bind('click', M3D.GUI.toggleBbox);
	$('#canvas').bind('keypress', function(){
		if ( obj && keys.isKeyPressed(GLGE.KI_B) ){
			M3D.GUI.toggleBbox();
			$('#switchBbox').attr('checked', !$('#switchBbox').is(':checked') );
		}
	});

	// -- objet and camera rotation
	controller.onchange = function(xRot, yRot) { 
		M3D.GUI.handleCamera(xRot, yRot);
	}
		
	// -- reset camera
	$('#resetcamera').bind('click', M3D.GUI.resetCameraPosition);
	
	// -- bind import model
	$('#import').bind('click', function(){
		M3D.GUI.importModel( {
			docUrl: $('#importUrl').val(),
			autoAddToScene: false
		});
	});
	
	// -- open new attribut
	$('.add-atttributes').bind('click', function(){
		M3D.GUI.showPopup('entity-new-attribut');
	});
	// -- window button
	$('.cancel').bind('click', M3D.GUI.hidePopup);
	$('#save-entity-info').bind('click', function(){
		
		if ( M3D.GUI.validateFields(this) ){
			M3D.GUI.updateEntityList();
			M3D.GUI.addObjectToScene();
		}
		
	});
	
	// -- object picking from select box
	$('#select-model').bind('change', M3D.GUI.pickObjectFromSelect);
	
	// -- show upload area
	$('#showupload').click(function(){M3D.GUI.toggleShowUpload});
	
	// -- add new attributes
	$('#new-attribut-type-1, #new-attribut-type-2').bind('change', function(){
		M3D.GUI.toggleInputSelect(this);
	});
	
	// -- save new attribut
	$('#save-new-attribut').bind('click', function(){
		
		if ( M3D.GUI.validateFields(this) ){
			M3D.GUI.saveNewAttribut();
		}
		
	});
	
	$('#add-new-attribut').bind('click', M3D.GUI.addNewAttribut);
	
	// -- show the help window
	$('#showhelp').bind('click', function(){
		M3D.GUI.showPopup('help');
	});

	// -- easter egg :)
	$('#container h1').bind('click', function(){
		M3D.GUI.showPopup('about');
	});
	
	// -- prevent default
	$('a[href="#"]').live("click", function(e){ e.preventDefault(); });
	
	// -- add new entity type
	$('#add-new-entity').bind('click', function(){
		M3D.GUI.showPopup('new-entity');
	});
	
	// -- save new attributes
	$('#save-new-entity').bind('click', function(){
		
		if ( M3D.GUI.validateFields(this) ){
			M3D.GUI.saveNewEntity();
		}
		
	});
	
	// -- delete attributes
	$('.detele-attribut').live('click', function(){
		M3D.GUI.deleteAttributFromList(this);
	});
	
	// -- open the rules manager window
	$('#manage-rules').bind('click', function(){
		M3D.GUI.showPopup('rules');
	});
	
	// -- add a new rule
	$('#add-rule').bind('click', function(){
		if ( M3D.GUI.validateFields(this) ){
			M3D.GUI.saveNewRule();
		}
	});
	
	// -- delete a rule
	$('.delete-rule').live('click', function(){
		M3D.GUI.deleteRule(this);
	});
	
	// -- clear user canvas
	$('#clear-canvas').bind('click', function(){
		M3D.GUI.showPopup('confirmation-clear');
	});
	
	$('#confirm-clear-canvas').bind('click', function(){
		M3D.GUI.clearCanvas();
		M3D.DB.clear();
		M3D.GUI.hidePopup('confirmation-clear');
	});
	
	
	$('#generate-xml').bind('click', M3D.GUI.generateLevelFile);
	
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

