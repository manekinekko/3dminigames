﻿/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Events
 * @file assets/js/m3d_events.js
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/assets/js/m3d_events.js
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
	 * @see updateSelectedObject
	 * @see M3D.DB.updateSelectedObject
	 * 
	 * Forget about this for this moment
	 * untill we find a better implementation !!
	 */
	 /*
	$('#canvas').bind('mousedown', function(e){

		M3D.GUI.pickObject(e, this);

	}).bind('mouseup', function(){
		
		M3D.GUI.checkEditor();
		M3D.DB.updateSelectedObject();
	
	});
	/**/
	
	$('#editor-status').bind('click', function(){
		var _this = $(this);
		
		_this.text('Updating scenario.Please wait...');
		
		M3D.GUI.updateEditor(function(){
			_this.removeClass('ui-state-error').addClass('ui-state-highlight').text('Your scenario has been synchronized!');
			setTimeout(function(){
				_this.hide().removeClass('pointer').text('');
			}, 2000);
			M3D.DB.saveEditor({
				'uid': 'edwigs',
				'value': M3D.Editor.getContent()
			});
			
		});

		
	});
		
	/**
	 * Allow picking 3D models from the select box
	 * @see M3D.GUI.pickObjectFromSelect
	 */
	$('#select-model').bind('change', function(e){
		
		// unpick any object that has been picked previously!!
		M3D.GUI.unpickObject();
		
		// pick the new object
		M3D.GUI.pickObjectFromSelect(e);
		
	});
	
	/**
	 * Bind the mouse scroll event to the wheel function.
	 * @see M3D.GUI.wheel
	 */
	document.getElementById("canvas").addEventListener('DOMMouseScroll', M3D.GUI.wheel, false);
	window.document.getElementById("canvas").onmousewheel = document.getElementById("canvas").onmousewheel = M3D.GUI.wheel;
	
	/**
	 * Bind the live update of the 3D model position/rotation/scale's values.
	 * @see M3D.GUI.updateInputValuesFromObject
	 * @see M3D.GUI.checkEditor
	 * @see M3D.DB.updateSelectedObject
	 */
	$('input[type="number"]').bind('change', function(){ 
		M3D.GUI.updateObjectValues(this);
		M3D.DB.updateSelectedObject();
		$('#editor-status').addClass('ui-state-error pointer').text('Please click here to synchronize your scenario!').show();
	});
	/**
	 * Bind the slider insert/remove
	 * @deprecated Forget about this feature for now.
	 */
	//*
	var _lastSeletcedInput;
	$('#info-bottom input[type="number"]').bind('focus', function(){
		
		// remember this input
		_lastSeletcedInput = this;
		
		if ($(this).val() !== ""){
			var _pos = $(_lastSeletcedInput).offset();
			$("#slider").slider("option", {
				'value': parseFloat($(_lastSeletcedInput).attr('value'), 4),
				'max': parseFloat($(_lastSeletcedInput).attr('max'), 4),
				'min': parseFloat($(_lastSeletcedInput).attr('min'), 4),
				'step': parseFloat($(_lastSeletcedInput).attr('step'), 4)
			}).show();
		}
		
	}).bind('blur', function(){
		$('#slider').hide();
	});
	// Bind the slider logic
	$("#slider").slider({
		animate: true,
		orientation: "vertical",
		slide: function(event, ui) {
			M3D.GUI.updateInputValuesFromSlider(_lastSeletcedInput, ui.value);
			M3D.GUI.updateObjectValues(_lastSeletcedInput);
		},
		stop: function(event, ui) {
			$('#editor-status').addClass('ui-state-error pointer').text('Please click here to synchronize your scenario!').show();
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
	 * 
	 */
	$('#remove-object').bind('click', function(){
		if ( ! $(this).is('.disabled') ) {
			M3D.GUI.showPopup('confirmation-remove');
		}
	});
	
	/**
	 * 
	 */
	$('#confirm-remove-object').bind('click', function(){
		M3D.GUI.removeObject();
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
	$('.cancel').bind('click', function(){
		M3D.GUI.hidePopup();
	});
	
	/**
	 * Bind the save entity info event.
	 * @see M3D.DB.containsObj
	 * @see M3D.GUI.validateFields
	 * @see M3D.GUI.updateEntityList
	 * @see M3D.GUI.addObjectToScene
	 * @see M3D.Editor.setDefaultContent
	 */
	$('#save-entity-info').bind('click', function(){
		
		var _btn = $(this);

		// the name of the new entity is a time stamp
		var _nameElement = $('#name');
		var _name = _nameElement.val();
		if (M3D.GUI.validateFields( _btn ) && M3D.GUI.isUniqueEntityName( _name )) 
		{
			
			_nameElement.removeClass('warning');
			
			M3D.GUI.updateEntityListAndAddToDB();
			M3D.GUI.addObjectToScene();
			
			_name = $(this).closest('.window').find('#name').val();
			
			_btn.val('Saving ...');
			
			var _o = {
				name :  _name,
				url : $('#importUrl').val() /* the url of the last imported model */
			}
			
			var _t = $('#auto-update-editor').is(':checked');
			
			M3D.Editor.setDefaultContent([_o], _t, function(){
				_btn.val('Save');
				M3D.GUI.hidePopup();
			});
			
		}
		else {
			_nameElement.addClass('warning');
		}
		
	});
	
	/**
	 * Set the new game info
	 * @see M3D.Editor.setGameInfo
	 * @see M3D.GUI.hidePopup
	 * @see M3D.GUI.validateFields
	 */
	$('#save-game-info').bind('click', function(){
		
		var _btn = $(this);
		var _el = $('#game-name');
		var _name = _el.val();
		if ( M3D.GUI.validateFields( _el )){
			
			_el.removeClass('warning');
			
			_btn.val('saving...');
			M3D.Editor.setGameInfo(_name, function(){
				
				M3D.DB.setGameInfo({'name':_name});
				
				M3D.GUI.hidePopup();
				_btn.val('save');
			});		
			
		}
		else {
			_el.addClass('warning');
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
		
		var button = $('#confirm-clear-canvas');
		button.val('clearing content...');
		
		M3D.GUI.clearCanvas();
		M3D.GUI.clearSelectBox();
		M3D.DB.clear();
		M3D.Editor.clear(function(){
			
			button.val('clear content');
			
			/**
			 * Bug fix: This is actually a work around rather than a bug fix
			 * but, I could not findt the origin of this bug.
			 * 
			 * The bug is: The M3D.GUI.showPopup('game-info', true) is called endlessly !!!
			 * I think that this has a to do with the codepress edit process.
			 * 
			 * REALLY SORRY !!!
			 */
			if ( ! M3D.DB.checkEditorContentFromDB() ) {
				M3D.GUI.showPopup('game-info', true);
			}
			else {
				log('Game info already set ...');
			}
			/**/
			
		});
		
	});
	
	/**
	 * Bind loading the previous saved content.
	 * @see M3D.DB.load
	 * @see M3D.Editor.init
	 * @see M3D.GUI.hidePopup
	 */
	$('#confirm-load-content').bind('click', function(){
			
		/**
		 * Firefox 4 bug fix #18
		 */
		window.edwigs.textarea.value = "";
		/**/
		
		var _b = $(this);
		_b.val('loading...');
		M3D.DB.load(function(){
			_b.val('load');
			M3D.GUI.hidePopup();
		});

	});
	
	/**
	 * Bind NOT to load the previous saved content.
	 * @see M3D.GUI.showPopup
	 */
	 $('#confirm-no-load-content').one('click', function(){
						
			M3D.GUI.clearCanvas();
			M3D.GUI.clearSelectBox();
			M3D.DB.clear();
			M3D.Editor.clear(function(){
				
				M3D.GUI.showPopup('game-info', true);
				
			});

	 });

	/**
	 * Bind the attributes description toggling
	 */
	$('.attributes-name').live('click', function(){
		$(this).next('.attributes-desc').toggle();
	});
	
	$('#toggle-attributes').bind('click', function(){
		$('#attributes-panel').toggle();
	});
	
	/**
	 * Bind the global keypress events
	 */
	//*
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
	/**/
	
	/**
	 * Bind the camera operations: move, ratation and zoom.
	 */
	$('.cursor').not('.single-click').not('.grid-toggle').bind('click', function(){
		
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
				alert('Camera Pos('+_cam.getLocX()+' '+_cam.getLocY()+' '+_cam.getLocZ()+' '+_cam.getFar()+')');
			}
			else {
				M3D.GUI.CAMERA_STATE = null;
			}
			
		}
		
	});

	$('.grid-toggle').bind('click', function(){
		M3D.GUI.toggleGrid();
		$('.grid-toggle').toggleClass('active');
	})

	$('.action-save').not('.saving').bind('click', function(){
		
		$('.action-save').addClass('saving');
		
		M3D.DB.saveEditor({
			'uid': 'edwigs',
			'value': M3D.Editor.getContent()
		});
		
		setTimeout(function(){
			
			setTimeout(function(){
				$('.action-save').removeClass('saving');
			}, 1000);
			
		}, 1000);
	});

	$('.action-help').bind('click', function(){
		window.open('http://code.google.com/p/3dminigames/wiki/Keywords', 'height=200,width=180');
	});

	/**
	 * Bind the autosave process
	 */
	var _autosave = null;
	$("#editor").mouseenter(function(){
      
      _autosave = setInterval(function(){
      	
      	$('.ation-save').trigger('click');
		
      }, 20000); // 20 sec

    }).mouseleave(function(){
      
      clearInterval(_autosave);
      
    });

	
	
	/**
	 * Bind the logout operation.
	 */
	 $('#logout').bind('click', function(){
	 	
	 	$('#modal, #saving-message').show('fast');
	 	
		M3D.DB.saveEditor({
			'uid': 'edwigs',
			'value': M3D.Editor.getContent()
		});
		
		setTimeout(function(){
			$('#saving-message').hide('fast');
			window.location.href = 'logout.php';
		}, 3000);
		
		
	 });
	

});