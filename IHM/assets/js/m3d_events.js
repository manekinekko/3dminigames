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
	 *
	 */
	$('.window').draggable({
		'handle':'.window h2'	
	});
	
	/**
	 * Bind the canvas mouse down event to the picking function, and the mouse up to the editor update function.
	 * @see M3D.GUI.pickObject
	 */
	$('#canvas').bind('mousedown', function(e){

		M3D.GUI.pickObject(e, this);

	}).bind('mouseup', function(){
		
		M3D.GUI.checkEditor();
		M3D.DB.updateSelectedObject();
	
	});
	
	
	$('#status').bind('click', function(){
		var _this = $(this);
		
		_this.text('Updating scenario.Please wait...');
		
		M3D.GUI.updateEditor(function(){
			_this.removeClass('ui-state-error').addClass('ui-state-highlight').text('Your scenario was updated!');
			setTimeout(function(){
				_this.hide().removeClass('pointer').text('');
			}, 2000);
			M3D.DB.saveEditor({
				'uid': 'm3d',
				'value': M3D.Editor.getContent()
			});
			
		});

		
	});
		
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
	 * @see M3D.GUI.updateInputValuesFromObject
	 */
	$('input[type="number"]:not([disabled])').bind('keypress', function(){ 
		M3D.GUI.updateObjectValues(this);
		M3D.GUI.checkEditor();
		M3D.DB.updateSelectedObject();
	});
	/**
	 * Bind the slider insert/remove
	 * @deprecated Forget about this feature for now. We'll release
	 * it for the next update!
	 */
	//*
	var _lastSeletcedInput;
	$('#info-bottom input[type="number"]:not([disabled])').bind('focus', function(){
		
		// remember this input
		_lastSeletcedInput = this;
		
		if ($(this).val() !== ""){
			var _pos = $(_lastSeletcedInput).offset();
			$("#slider").slider("option", {
				'value': parseFloat($(_lastSeletcedInput).attr('value'), 4),
				'max': parseFloat($(_lastSeletcedInput).attr('max'), 4),
				'min': parseFloat($(_lastSeletcedInput).attr('min'), 4),
				'step': parseFloat($(_lastSeletcedInput).attr('step'), 4)
			}).show().css({
				'top':_pos.top-20,
				'left':_pos.left
			});
		}
		
	}).bind('blur', function(){
		$('#slider').hide();
	});
	// Bind the slider logic
	$("#slider").slider({
		animate: true,
		slide: function(event, ui) {
			M3D.GUI.updateInputValuesFromSlider(_lastSeletcedInput, ui.value);
			M3D.GUI.updateObjectValues(_lastSeletcedInput);
		},
		stop: function(event, ui) {
			M3D.GUI.checkEditor();
			M3D.DB.updateSelectedObject();
		}
	});
	//*/

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
	 * Bind the game creation
	 * @see M3D.GUI.createGame
	 */
	$('#create-game').bind('click', function(){
		M3D.GUI.createGame();
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
			
			_name = $(this).closest('.window').find('#name').val();
			_name = M3D.Common.ucfirst(_name);
			M3D.Editor.setDefaultContent([_name]); // an array of names
		}
		else {
			_nameElement.addClass('required');
		}
	});
	
	/**
	 *
	 */
	$('#save-game-info').bind('click', function(){
		
		var _b = $(this);
		var _el = $('#game-name');
		var _name = _el.val();
		if ( _name === ''  ){
			_el.addClass('warning');
		}else {
			_el.removeClass('warning');
			
			_b.val('saving...');
			M3D.Editor.setGameInfo(_name, function(){
				M3D.GUI.hidePopup('game-info');
				_b.val('save');				
			});		
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
	 * Bind showing the upload form
	 */
	$('#upload').bind('click', function(){
		M3D.GUI.showPopup('upload-form');
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
		
		var button = $(this);
		button.val('clearing content...');
		
		M3D.GUI.clearCanvas();
		M3D.GUI.clearSelectBox();
		M3D.DB.clear();
		
		M3D.Editor.clear(function(){
			M3D.GUI.hidePopup('confirmation-clear');
			button.val('YES');
			
			// delay 
			setTimeout(function(){
				M3D.GUI.showPopup('game-info', null, true);
			}, 1000);
		});
		
	});
	
	/**
	 * Bind loading the previous saved content.
	 * @see M3D.DB.load
	 * @see M3D.GUI.hidePopup
	 */
	$('#confirm-load-content').bind('click', function(){
		
		var _b = $(this);
		
		_b.val('loading...');
		M3D.DB.load(function(){
			_b.val('load');
			M3D.GUI.hidePopup('confirmation-load');
		});
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
	 * Bind the attributes description toggling
	 */
	$('.attributes_name').live('click', function(){
		$(this).next('.attributes_desc').toggle();
	});
	
	$('#toggle-attributes').bind('click', function(){
		$('#attributes_panel').toggle();
	});
	
	/**
	 * Bind the keypress events
	 */
	$(document).bind('keypress', function(){
		
		var _w = $('.window.opened');
		
		if( _w.length === 1 ){
			
			if ( keys.isKeyPressed(GLGE.KI_ENTER) ){
				_w.find('input.validate').trigger('click');
			}
			else if ( keys.isKeyPressed(GLGE.KI_ESCAPE) ){
				_w.find('input.cancel').trigger('click');				
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
			
			var _t = $(this);
			var _c = function(s){ return _t.hasClass(s); };
			
			if ( $(this).hasClass('camera-move') ){
			// move the camera
			M3D.GUI.CAMERA_STATE = M3D.GUI.CAMERA_MOVE;
			}	
			else if ( _c('camera-zoom') ) {
				// do a zoom
				M3D.GUI.CAMERA_STATE = M3D.GUI.CAMERA_ZOOM;			
			}	
			else if ( _c('camera-rotate') ) {
				// rotate the camera
				M3D.GUI.CAMERA_STATE = M3D.GUI.CAMERA_ROTATE;			
			}
			else if ( _c('model-rotate') ) {
				// rotate the model
				M3D.GUI.CAMERA_STATE = M3D.GUI.MODEL_ROTATE;
			}
			else if ( _c('model-move') ) {
				// move the model
				M3D.GUI.CAMERA_STATE = M3D.GUI.MODEL_MOVE;
			}
			else if ( _c('grid-toggle') ) {
				M3D.GUI.toggleGrid();
			}
			else if ( _c('camera-position') ) {
				var _cam = scene.camera;
				alert('Pos('+_cam.getLocX()+' '+_cam.getLocY()+' '+_cam.getLocZ()+')');
			}
			else {
				M3D.GUI.CAMERA_STATE = null;
			}
			
		}
		
	});

	
	/**
	 * Bind the logout operation.
	 */
	 $('#logout').bind('click', function(){
	 	
		window.location.href = 'logout.php';
		
	 });
	

});
