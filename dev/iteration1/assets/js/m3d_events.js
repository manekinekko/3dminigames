/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Events
 * @file assets/js/m3d_events.js
 * @projectDescription This file contains all the binding events.
 */
$(function(){

	/**
	 * Prevent default event for all anchor tags whose href attribute begins with a '#'.
	 */
	$('a[href^="#"]').live("click", function(e){ e.preventDefault(); });
	
	/**
	 * Bind the canvas mouse down event to the picking function, and the mouse up to the editor update function.
	 * @see M3D.GUI.pickObject
	 */
	$('#canvas').bind('mousedown', function(e){	M3D.GUI.pickObject(e, this);
												mouseRecord = mouseGlobale.getMousePosition();
	}).bind('mouseup', M3D.GUI.updateEditor);
		
	/**
	 * Allow picking 3D models from the select box
	 * @see M3D.GUI.pickObjectFromSelect
	 */
	$('#select-model').bind('change', M3D.GUI.pickObjectFromSelect);
	
	/**
	 * Bind the mouse scroll event to the wheel function.
	 * @see M3D.GUI.wheel
	 */
	document.getElementById("canvas").addEventListener('DOMMouseScroll', M3D.GUI.wheel, false);
	window.document.getElementById("canvas").onmousewheel = document.getElementById("canvas").onmousewheel = M3D.GUI.wheel;
	
	/**
	 * Bind the live update of the 3D model position/rotation/scale's values.
	 * @see M3D.GUI.updateValues
	 */
	$('input[type="text"]:not([disabled])').bind('keypress', function(){ M3D.GUI.updateValues($(this)); })
	/**
	 * Bind the slider insert/remove
	 */
	var _lastSeletcedInput;
	$('#info-bottom input[type="text"]:not([disabled])').bind('focus', function(){
		
		_lastSeletcedInput = $(this);
		
		$('#slider').show().css({
			'top':$(this).offset().top-20,
			'left':$(this).offset().left
		});
	}).bind('blur', function(){
		$('#slider').hide();
	});
	/**
	 * Bind the slider logic
	 */
	$("#slider").slider({
		animate: true,
		max:1000,
		min:-1000,
		value:0,
		step:0.0001,
		slide: function(event, ui) {
			_lastSeletcedInput.val(ui.value);
			M3D.GUI.updateValues(_lastSeletcedInput);
		}
	});

	/**
	 * Bind the toggle view of the bounding box, weither when clicking on the switchBbox check box
	 * or when pressing the b key.
	 * @see M3D.GUI.toggleBbox
	 */
	$('#switchBbox').bind('click', M3D.GUI.toggleBbox);
	$('#canvas').bind('keypress', function(){
		if ( obj && keys.isKeyPressed(GLGE.KI_B) ){
			M3D.GUI.toggleBbox();
			$('#switchBbox').attr('checked', !$('#switchBbox').is(':checked') );
		}
	});

	/**
	 * Bind the camera's properties reset.
	 * @see M3D.GUI.resetCameraPosition
	 */
	$('#resetcamera').bind('click', M3D.GUI.resetCameraPosition);
	
	/**
	 * Bind the 3D model importing.
	 * @see M3D.GUI.importModel
	 */
	$('#import').bind('click', function(){
		M3D.GUI.importModel( {
			docUrl: $('#importUrl').val(),
			autoAddToScene: false
		});
	});
	
	/**
	 * Bind "cancel" buttons.
	 * @see M3D.GUI.hidePopup
	 */
	$('.cancel').bind('click', M3D.GUI.hidePopup);
	
	/**
	 * Bind the save entity info event.
	 * @see M3D.DB.containsObj
	 * @see M3D.GUI.validateFields
	 * @see M3D.GUI.updateEntityList
	 * @see M3D.GUI.addObjectToScene
	 * @see M3D.Editor.setContent
	 */
	$('#save-entity-info').bind('click', function(){
		var _nameElement = $('#name');
		var _name = _nameElement.val();
		if (M3D.GUI.validateFields(this) && !M3D.DB.containsObj( _name )) {
			
			_nameElement.removeClass('required');
			
			M3D.GUI.updateEntityList();
			M3D.GUI.addObjectToScene();
			
			var _name = $(this).closest('.window').find('#name').val();
			_name = M3D.Common.ucfirst(_name);
			M3D.Editor.setContent('type '+_name+' is Object;\n'+
									_name+' has position at 0.00 0.00 0.00;\n'+
									_name+' has rotation at 0.00 0.00 0.00;\n'+
									_name+' has scale at 0.00 0.00 0.00;\n');
		}
		else {
			_nameElement.addClass('required');
		}
	});

	/**
	 * Bind showing the help window
	 * @see M3D.GUI.showPopup
	 */
	$('#showhelp').bind('click', function(){
		M3D.GUI.showPopup('help');
	});

	/**
	 * EASTER EGG :)
	 * Bind showing the about window
	 * @see M3D.GUI.showPopup
	 */
	$('#container h1').bind('click', function(){
		M3D.GUI.showPopup('about');
	});
	
	/**
	 * Bind clearing the canvas.
	 * @see M3D.GUI.showPopup
	 * @see M3D.GUI.clearCanvas
	 * @see M3D.DB.clear
	 * @see M3D.GUI.hidePopup
	 */
	$('#clear-canvas').bind('click', function(){
		M3D.GUI.showPopup('confirmation-clear');
	});
	$('#confirm-clear-canvas').bind('click', function(){
		M3D.GUI.clearCanvas();
		M3D.DB.clear();
		M3D.GUI.hidePopup('confirmation-clear');
	});
	
	/**
	 * Bind loading the previous saved content.
	 * @see M3D.DB.load
	 * @see M3D.GUI.hidePopup
	 */
	$('#confirm-load-content').bind('click', function(){
		M3D.DB.load();
		M3D.GUI.hidePopup('confirmation-load');
	});
	
	/**
	 * Bind generating a GLGE xml level file from the current canvas.
	 * @see M3D.GUI.generateLevelFile
	 * @deprecated This binding will probably be moved elsewhere!
	 */
	$('#generate-xml').bind('click', M3D.GUI.generateLevelFile);

	/**
	 * Bind the editor content storing into the DB.
	 * @see M3D.DB.update_grammar
	 * @deprecated This binding is not really done yet!
	 */
	$('#editor iframe').live('keypress', function (e){
		alert(e);
		k = e.keyCode ? e.keyCode : e.which;
		if (k==13)	//13 = enter
		{
			alert("ici");
			if ( M3D.DB.update_grammar() ) {
				M3D.DB.update_grammar(M3D.Editor.getContent());
			}
		}
	});
	
	/**
	 * Bind the camera operations: move, ratation and zoom.
	 */
	$('.cursor').bind('click', function(){
		
		if ( $(this).hasClass('active') ) {
			$(this).removeClass('active');
			M3D.GUI.CAMERA_STATE = null;
		}
		else {
			
			$('.cursor.active').removeClass('active');
			$(this).addClass('active');
			
			if ( $(this).hasClass('camera-move') ){
			// move the camera
			M3D.GUI.CAMERA_STATE = M3D.GUI.CAMERA_MOVE;
			}	
			else if ( $(this).hasClass('camera-zoom') ) {
				// do a zoom
				M3D.GUI.CAMERA_STATE = M3D.GUI.CAMERA_ZOOM;			
			}	
			else if ( $(this).hasClass('camera-rotate') ) {
				// rotate the camera
				M3D.GUI.CAMERA_STATE = M3D.GUI.CAMERA_ROTATE;			
			}
			else if ( $(this).hasClass('model-rotate') ) {
				// rotate the model
				
			}
			else if ( $(this).hasClass('model-move') ) {
				// move the model
				
			}
			else {
				M3D.GUI.CAMERA_STATE = null;
			}
			
		}
		
		
	});

});
