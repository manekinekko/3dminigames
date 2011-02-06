/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */

$(function(){
	
	// Start Event Bindings
	
	// -- menu auto hidding
	function _autoHideMenu(){setTimeout(function(){ $('#viewmenu').children().animate({top:70}, 200); }, 1500);}
	_autoHideMenu();
	$('#viewmenu').hover(function(){
		$(this).children().animate({top:30}, 200);
	}, function(){
		_autoHideMenu();
	})
	
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
	$('.add-attributes').bind('click', function(){
		M3D.GUI.showPopup('entity-new-attribut', true);
	});
	// -- window button
	$('.cancel').bind('click', M3D.GUI.hidePopup);
	$('#save-entity-info').bind('click', function(){
		if (M3D.GUI.validateFields(this)) {
			M3D.GUI.updateEntityList();
			M3D.GUI.addObjectToScene();
		}
	});
	
	// -- object picking from select box
	$('#select-model').bind('change', M3D.GUI.pickObjectFromSelect);
	
	// -- show upload area
	$('#showupload').click(function(){M3D.GUI.toggleShowUpload});
	
	// -- add new attributes
	$('#new-attribut-type, #quick-new-attribut-type').bind('change', function(){
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
	
	// -- cancel adding a new entity
	$('#cancel-new-entity').bind('click', function(){
		M3D.GUI.showPopup('entity-info');
	});
	
	// -- delete attributes
	$('.detele-attribut').live('click', function(){
		M3D.GUI.deleteAttributFromList(this);
	});
	
	// -- open the rules manager window
	$('#manage-rules').bind('click', function(){
		M3D.GUI.showPopup('rules', true);
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
	
	
	// -- load previous content
	$('#confirm-load-content').bind('click', function(){
		M3D.DB.load();
		M3D.GUI.hidePopup('confirmation-load');
	});
	
	$('#generate-xml').bind('click', M3D.GUI.generateLevelFile);
	
});
