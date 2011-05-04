/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.GUI
 * @file assets/js/m3d_gui.js
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/assets/js/m3d_gui.js
 * @projectDescription This file contains all the necessary GUI functions.
 */
(function(M3D) {

	// Contants
	// values in pixels
	M3D.GUI.ANIMATE_WINDOW_OPEN_POS = 150;
	M3D.GUI.ANIMATE_WINDOW_CLOSE_POS = -300;

	// camera states
	M3D.GUI.CAMERA_MOVE = 1;
	M3D.GUI.CAMERA_ROTATE = 2;
	M3D.GUI.CAMERA_ZOOM = 3;
	M3D.GUI.MODEL_ROTATE = 4;
	M3D.GUI.MODEL_MOVE = 5;
	M3D.GUI.CAMERA_STATE = null;

	// values in ms
	M3D.GUI.ANIMATE_WINDOW_SPEED = 150;

	/**
	 *
	 */
	M3D.GUI.init = function() {
		log('initializating the GUI...');
		M3D.GUI.drawGrid();
	};
	/**
	 *
	 */
	M3D.GUI.drawGrid = function() {

		var x,y;
		var sn = scene || doc.getElement("mainscene");
		var boundries = 100;
		var step = 5;
		var positions=[];

		var push= function(x,y) {
			positions.push(x);
			positions.push(y);
			positions.push(0);
		};
		// horizontal
		for(y=-boundries; y<=boundries;y+=step) {
			x=-boundries;
			push(x,y);
			for(; x<=boundries;x+=step) {
				push(x,y);
				push(x,y);
			}
			push(x,y);
		}
		// vertical
		for(y=-boundries; y<=boundries;y+=step) {
			x=-boundries;
			push(y,x);
			for(; x<=boundries;x+=step) {
				push(y,x);
				push(y,x);
			}
			push(y,x);
		}

		var black=doc.getElement( "dark-gray" );
		/**
		 create new object and mesh and set the positions we've previously calculated
		 **/
		var _o = new GLGE.Object();
		var _m = new GLGE.Mesh();
		var line=_o.setDrawType(GLGE.DRAW_LINES);
		line.setMesh(_m.setPositions(positions));
		line.setMaterial(black);
		line.setId('grid');
		sn.addObject(line);
		grid = line;
	};
	/**
	 *
	 */
	M3D.GUI.toggleGrid = function() {
		if ( grid ) {
			alert('Toggling the grid is not implemented yet!');
		}
	};
	/**
	 * Set and initialize the attributes panel
	 * This function is loaded when the DB is ready!
	 */
	M3D.GUI.initAttributPanel = function() {
		var _attrHTML = [];

		// get all model tags
		var _models = M3D.DB.getAttributes('default').model;

		var _attributes = [];
		var _name = '', _type = '', _desc = '', _dflt = '';

		for(var i=0; i<_models.length; i++) {

			if ( _models[i] && _models[i]['name'] ) {
				_attrHTML.push('<h3>'+_models[i]['name']+'</h3>');
			}

			if ( _models[i] && _models[i]['attribute'] ) {
				_attributes = _models[i]['attribute'];

				for(var j=0; j<_attributes.length; j++) {

					if ( _attributes[i] && _attributes[i]['@attributes'] ) {

						_name = _attributes[j]['@attributes']['name'];
						_type = _attributes[j]['@attributes']['type'] || 'N/A';
						_dflt = _attributes[j]['@attributes']['value'] || 'N/A';
						_desc = _attributes[j]['@attributes']['description'] || 'N/A';

						_attrHTML.push('<div class="attributes-details">'+
						'<div class="attributes-name">'+
						'<span>'+_name+'</span>'+
						'</div>'+
						'<div class="attributes-desc">'+
						'<b>Type</b>&nbsp;'+_type+'<br/>'+
						'<b>Default</b>&nbsp;'+_dflt+'<br/>'+
						'<b>Description</b>&nbsp;'+_desc+'<br/>'+
						'</div>'+
						'</div>');

					}

				}

			}

		}

		$('#attributes-panel-body').append(_attrHTML.join(''));
	};
	/**
	 *
	 */
	// -- Create a new game based on its scenario
	M3D.GUI.createGame = function() {
		var _scenario = M3D.Editor.getContent();

		if ( _scenario === "" || !/game has name at/.test(_scenario)) {

			$('#status').show().text('Your scenario is empty!');
			setTimeout( function() {
				$('#status').hide().text('');
			}, 2000);
		} else {
			var _gameName = "edwigs_game_"+(new Date()).getTime();
			$.ajax({
				url: M3D.Config.compiler,
				dataType: 'json',
				type:'POST',
				data: {
					'n':_gameName,
					's':_scenario
				},
				beforeSend: function() {
					$('#status').show().text('creating game ...');
				},
				success: function(d) {
					$('#status').show().text('Game created');
				},
				complete: function(e) {
					setTimeout( function() {
						$('#status').hide().text('');
					}, 2000);
				},
				error: function (xhr, ajaxOptions, thrownError) {
					alert(xhr.status);
					alert(thrownError);
				}
			});
		}

	};
	/**
	 *
	 */
	// -- Event handler for mouse wheel event.
	M3D.GUI.wheel = function(event) {
		var delta = 0;

		/* For IE. */
		if (!event) {
			event = window.event;
		}

		/* IE/Opera. */
		if (event.wheelDelta) {
			delta = event.wheelDelta/120;
			/** In Opera 9, delta differs in sign as compared to IE.
			 */
			if (window.opera) {
				delta = -delta;
			}
		} else if (event.detail) {
			/** Mozilla case. */
			/** In Mozilla, sign of delta is different than in IE.
			 * Also, delta is multiple of 3.
			 */
			delta = -event.detail/3;
		}

		/** If delta is nonzero, handle it.
		 * Basically, delta is now positive if wheel was scrolled up,
		 * and negative, if wheel was scrolled down.
		 */
		if (delta) {
			M3D.GUI.handleMouseWheel(delta);
		}

		/** Prevent default actions caused by mouse wheel.
		 * That might be ugly, but we handle scrolls somehow
		 * anyway, so don't bother here..
		 */
		if (event.preventDefault) {
			event.preventDefault();
		}
		event.returnValue = false;
	};
	/**
	 *
	 */
	// -- handle mouse wheel
	M3D.GUI.handleMouseWheel = function(delta) {

		var keys=new GLGE.KeyInput();

		if ( obj && keys.isKeyPressed(GLGE.KI_S) ) {
			M3D.GUI.scaleObject(delta);
			M3D.GUI.updateInputValuesFromObject();
		} else {

			delta *= 2; // tweak the delta

			if ( keys.isKeyPressed(GLGE.KI_X) ) {
				scene.camera.setDLocX( parseFloat(scene.camera.getDLocX()) + delta);
			} else if ( keys.isKeyPressed(GLGE.KI_Y) ) {
				scene.camera.setDLocY( parseFloat(scene.camera.getDLocY()) + delta);
			} else if ( keys.isKeyPressed(GLGE.KI_Z) ) {
				scene.camera.setDLocZ( parseFloat(scene.camera.getDLocZ()) + delta);
			} else {

				if(delta !== 0) {
					scene.camera.setLocZ(parseFloat(scene.camera.getLocZ())-delta);
					//scene.camera.setFovY(parseFloat(scene.camera.getFovY())-delta);
				}

			}

		}

	};
	/**
	 *
	 */
	// -- import models
	M3D.lastImportedModel = null;
	M3D.GUI.importModel = function(data) {

		M3D.GUI.showWaiting();

		/**
		 * @global
		 */
		urlCollada = data.docUrl;

		var docCollada = new GLGE.Collada();

		docCollada.setDocument(urlCollada, doc.getAbsolutePath(doc.rootURL,null), function() {

			M3D.lastImportedModel = docCollada;

			if ( data.autoAddToScene ) {
				M3D.GUI.addObjectToScene({
					'uid': data.uid,
					'scaleX': data.scaleX,
					'scaleY': data.scaleY,
					'scaleZ': data.scaleZ,
					'locX': data.locX,
					'locY': data.locY,
					'locZ': data.locZ,
					'rotX': data.rotX,
					'rotY': data.rotY,
					'rotZ': data.rotZ
				});
				M3D.GUI.addOptionToSelectBox({
					'uid':data.uid,
					'name':data.name
				});
			} else {
				// ask for entity info
				var uid = docCollada.uid ? docCollada.uid : (new Date()).getTime();
				M3D.GUI.showPopup('entity-info', uid, true);
			}

			M3D.GUI.hideWaiting();

		});
	};
	/**
	 *
	 */
	M3D.GUI.showWaiting = function() {
		var loading = document.getElementById('loading').style;
		loading.display = "block";
	};
	/**
	 *
	 */
	M3D.GUI.hideWaiting = function() {
		var loading = document.getElementById('loading').style;
		loading.display = "none";
	};
	/**
	 *
	 */
	// -- show a pop up window
	M3D.GUI.showPopup = function(name, uid, clearInput) {

		if (clearInput) {
			// clear all inputs
			M3D.GUI.clearInputs();
		}

		$('#modal').show('fast', function() {

			var _window = $('.window.opened');
			if ( _window.length > 0 ) {

				// the window we want is hidden, so show it! ag it as closed ...
				if ( _window.attr('id') !== name ) {

					// close the opened one ... tag it as closed ...
					_window
					.removeClass('opened')
					.addClass('closed')
					.css({
						top: M3D.GUI.ANIMATE_WINDOW_CLOSE_POS
					});

					// ... then wait a bit and open the new one.
					setTimeout( function() {
						$('#'+name)
						.addClass('opened')
						.removeClass('closed')
						.css({
							top:M3D.GUI.ANIMATE_WINDOW_OPEN_POS
						});
					}, 100);
				}

			} else {
				// ... open the new window
				$('#'+name)
				.addClass('opened')
				.removeClass('closed')
				.css({
					top:M3D.GUI.ANIMATE_WINDOW_OPEN_POS
				});
			}

		});
	};
	/**
	 *
	 */
	M3D.GUI.hidePopup = function() {

		$('.window.opened')
		.css({
			top:M3D.GUI.ANIMATE_WINDOW_CLOSE_POS
		})
		.removeClass('opened')
		.addClass('closed');

		$('#modal').hide('fast');

	};
	/**
	 *
	 */
	M3D.GUI.updateEntityListAndAddToDB = function() {

		var _nameElement = $('#name');
		var uid = (new Date()).getTime();
		var name  = _nameElement.val();

		M3D.GUI.addOptionToSelectBox({
			'uid':uid,
			'name':name
		});

		// [DB]
		var element = {
			'uid' : uid,
			'value' : {
				'name': name,
				'url': urlCollada,
				'position' : {
					'X': M3D.lastImportedModel.getLocX(),
					'Y': M3D.lastImportedModel.getLocY(),
					'Z': M3D.lastImportedModel.getLocZ()
				},

				'scale' : {
					'X': M3D.lastImportedModel.getScaleX(),
					'Y': M3D.lastImportedModel.getScaleY(),
					'Z': M3D.lastImportedModel.getScaleZ()
				},
				'rotation' : {
					'X': M3D.lastImportedModel.getRotX(),
					'Y': M3D.lastImportedModel.getRotY(),
					'Z': M3D.lastImportedModel.getRotZ()
				}
			}
		};

		// handle the bbox
		var _bbox = {
			'X':'#',
			'Y':'#',
			'Z':'#'
		};
		if ( M3D.lastImportedModel.boundingVolume ) {
			var _bv = M3D.lastImportedModel.boundingVolume.dim;
			_bbox = {
				'X': _bv[0],
				'Y': _bv[1],
				'Z': _bv[2]
			};
		}
		element.value.bbox = _bbox;

		M3D.DB.setObject(element);
		// [/DB]

	};
	/**
	 *
	 */
	// -- adapt the correct type input based on user selection
	M3D.GUI.toggleInputSelect = function(el) {

		var type = $(el).val();
		var parent = $(el).closest('.window');
		var input = parent.find('#new-attribut-value-input');
		var select = parent.find('#new-attribut-value-select');
		switch(type) {

			case "boolean":
				input.addClass('hidden').val('');
				select.removeClass('hidden');
				break;

			case "string":
			case "number":
				select.addClass('hidden');
				input.removeClass('hidden number alphanumeric').val('');

				if (type === "string") {
					input.addClass('alphanumeric');
				} else {
					if (type === "number") {
						input.addClass('number');
					}
				}

				break;

		}

	};
	/**
	 *
	 */
	M3D.GUI.addOptionToSelectBox = function(o) {
		$('#select-model').append('<option value="'+o.uid+'">'+o.name+'</option>');
	};
	/**
	 *
	 */
	M3D.GUI.clearSelectBox = function() {
		$('#select-model option:not([value=""])').remove();
	};
	/**
	 *
	 */
	// -- add object to scene
	M3D.GUI.addObjectToScene = function( values ) {

		// tweak the new object position and scale
		var bbox = M3D.lastImportedModel.getBoundingVolume().dims;
		var v = values ? values : {};
		var tmp_scale_x = v.scaleX ? v.scaleX : 1;
		var tmp_scale_y = v.scaleY ? v.scaleY : 1;
		var tmp_scale_z = v.scaleZ ? v.scaleZ : 1;
		var tmp_locX = v.locX ? v.locX : 0;
		var tmp_locY = v.locY ? v.locY : 0;
		var tmp_locZ = v.locZ ? v.locZ : 0;
		var tmp_rotX = v.rotX ? v.rotX : 0;
		var tmp_rotY = v.rotY ? v.rotY : 0;
		var tmp_rotZ = v.rotZ ? v.rotZ : 0;

		M3D.lastImportedModel
		.setScale(tmp_scale_x, tmp_scale_y, tmp_scale_z)
		.setLoc(tmp_locX, tmp_locY, tmp_locZ)
		.setRot(tmp_rotX, tmp_rotY, tmp_rotZ);

		// set the uid of the current object.
		// NOTE: this uid is set to the collada document
		var objects = M3D.lastImportedModel.getObjects();
		objects[0].parent.uid = v.uid ? v.uid : $('#entity-info #name').attr('uid');

		// set the new scale to this collada children, so they have to right value!
		for(var i in objects) {
			objects[i].setScale(tmp_scale_x, tmp_scale_y, tmp_scale_z);
		}

		scene.addChild(M3D.lastImportedModel);

		// we don't need this reference anymore
		M3D.lastImportedModel = null;

	};
	/**
	 *
	 */
	// --
	M3D.GUI.updateInputValuesFromSlider = function(input, value) {

		var parent = $(input).closest("tr");

		// should the values change proportionally ?
		var proportional = parent.find('#scaleLock').length === 1 && $('#scaleLock').is(':checked');

		if ( proportional ) {
			parent.find("input[type='number']").each( function() {
				$(this).val(value);
			});
		} else {
			$(input).val(value);
		}
	};
	/**
	 *
	 */
	// -- manual values updating
	M3D.GUI.updateObjectValues = function(element) {

		var el = $(element);
		var value = parseFloat(el.val());

		if( obj && !isNaN(value) ) {
			var _obj = obj.parent;
			var locked = $('#scaleLock').is(':checked');

			switch( el.attr('name') ) {
				case 'posX':
					_obj.setLocX( value );
					break;
				case 'posY':
					_obj.setLocY( value );
					break;
				case 'posZ':
					_obj.setLocZ( value );
					break;

				case 'scaleX':
				case 'scaleY':
				case 'scaleZ':

					if ( locked ) {
						_obj.setScaleX(value);
						_obj.setScaleY(value);
						_obj.setScaleZ(value);
					} else {
						if (el.attr('name') === "scaleX" && value > 0) {
							_obj.setScaleX(value);
						} else if (el.attr('name') === "scaleY" && value > 0) {
							_obj.setScaleY(value);
						} else if (el.attr('name') === "scaleZ" && value > 0) {
							_obj.setScaleZ(value);
						}
					}

					break;

				case 'rotX':

					if (value > 0) {
						_obj.setRotX(value);
					}

					break;

				case 'rotY':

					if (value > 0) {
						_obj.setRotY(value);
					}

					break;

				case 'rotZ':

					if (value > 0) {
						_obj.setRotZ(value);
					}

					break;

			}

			$("#slider").slider('value', [value]);
		}

	};
	/**
	 *
	 */
	// -- TODO: find a better implementation !!
	// -- bounding box
	M3D.GUI.drawBbox = function() {

		//blocs 1 to 4 = face sup, 5 to 8 = face inf, 9 to 12 = faces verticales

		var dims = obj.getBoundingVolume().dims;
		var dimsX = dims[0];
		var dimsY = dims[1];
		var dimsZ = dims[2];

		var loc = obj.getPosition();
		var rot = obj.getRotation();

		var posX = loc.x;
		var posY = loc.y;
		var posZ = loc.z;
		var rotX = rot.x;
		var rotY = rot.y;
		var rotZ = rot.z;

		var positions=[];

		positions.push(posX-(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ+(dimsZ/2));
		positions.push(posX-(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX-(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ+(dimsZ/2));
		positions.push(posX+(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX+(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ+(dimsZ/2));
		positions.push(posX+(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX+(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ+(dimsZ/2));
		positions.push(posX-(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX-(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX-(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ-(dimsZ/2));

		positions.push(posX-(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX+(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ-(dimsZ/2));

		positions.push(posX+(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX+(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ-(dimsZ/2));

		positions.push(posX+(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX-(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ-(dimsZ/2));

		positions.push(posX-(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX-(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX-(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX-(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX+(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX+(dimsX/2));
		positions.push(posY-(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		positions.push(posX+(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ-(dimsZ/2));
		positions.push(posX+(dimsX/2));
		positions.push(posY+(dimsY/2));
		positions.push(posZ+(dimsZ/2));

		var yellow = new GLGE.Material();
		yellow.setColor('#000');
		yellow.setSpecular=0.00;
		yellow.setEmit(1);

		var line=(new GLGE.Object()).setDrawType(GLGE.DRAW_LINES);
		line.setMesh((new GLGE.Mesh()).setPositions(positions));
		line.setMaterial(yellow);
		line.setLoc(posX, posY, posZ);
		line.setRot(rotX, rotY, rotZ);
		line.setZtransparent(true);
		line.pickable = false;
		obj.parent.addObject(line);

	};
	/**
	 * Validate the a given input and all of its siblings
	 * @param {jQuery} el The jQuery input field
	 * @return True if ALL fields are valid, False otherwise
	 * @type {Boolean}
	 */
	M3D.GUI.validateFields = function(el) {

		var isOK = false;
		var parent = el.closest('.window.opened');
		var inputs = parent.find('input[type="text"], select');
		var current, val, ln = inputs.length;

		for(var i=0; i<ln; i++) {
			current = $(inputs[i]);
			val = current.val();

			if ( current.hasClass('required') || current.attr('required') ) {

				if ( M3D.Common.isAlphanumeric(val) ) {
					isOK = true;
					current.removeClass('warning');
				} else {
					isOK = false;
					current.addClass('warning');
				}

			};
		}

		return isOK;

	};
	/**
	 *
	 */
	M3D.GUI.clearInputs = function() {
		$('.window').find('input[type="text"], select').each( function() {
			$(this).val('');
		});
	};
	/**
	 * Check if the given entity name is unique or not
	 * @param {String} val The entity name
	 * @return True if val is unique, False if not
	 * @type {Boolean}
	 */
	M3D.GUI.isUnique = function(val) {

		var _opt = $('#select-model option');

		for(var i=0; i<_opt.length; i++) {
			if ( val === $(_opt[i]).text() ) {
				return false;
			}
		}

		return true;

	};
	/**
	 *
	 */
	// -- TO DO: to bug fix
	// -- camera control
	M3D.GUI.checkkeys = function () {

		var keys=new GLGE.KeyInput();
		var camera=scene.camera;
		camera.setLookat([0,0,0]);

		camerapos=camera.getPosition();
		camerarot=camera.getRotation();
		var cam = camera.getRotMatrix();

		cam = GLGE.inverseMat4(cam);
		if(keys.isKeyPressed(GLGE.KI_Z)) {
			camera.setLocX(camerapos.x-cam[8]*0.05*(now-lasttime));
			camera.setLocY(camerapos.y-cam[9]*0.05*(now-lasttime));
			camera.setLocZ(camerapos.z-cam[10]*0.05*(now-lasttime));
		}

		if(keys.isKeyPressed(GLGE.KI_S)) {
			camera.setLocX(camerapos.x+cam[8]*0.05*(now-lasttime));
			camera.setLocY(camerapos.y+cam[9]*0.05*(now-lasttime));
			camera.setLocZ(camerapos.z+cam[10]*0.05*(now-lasttime));
		}

		if(keys.isKeyPressed(GLGE.KI_Q)) {
			camera.setLocX(camerapos.x-cam[0]*0.05*(now-lasttime));
			camera.setLocY(camerapos.y-cam[1]*0.05*(now-lasttime));
			camera.setLocZ(camerapos.z-cam[2]*0.05*(now-lasttime));
		}

		if(keys.isKeyPressed(GLGE.KI_D)) {
			camera.setLocX(camerapos.x+cam[0]*0.05*(now-lasttime));
			camera.setLocY(camerapos.y+cam[1]*0.05*(now-lasttime));
			camera.setLocZ(camerapos.z+cam[2]*0.05*(now-lasttime));
		}

		if(keys.isKeyPressed(GLGE.KI_DOWN_ARROW)) {
			camera.setLocX(camerapos.x-cam[4]*0.05*(now-lasttime));
			camera.setLocY(camerapos.y-cam[5]*0.05*(now-lasttime));
			camera.setLocZ(camerapos.z-cam[6]*0.05*(now-lasttime));
		}
		if(keys.isKeyPressed(GLGE.KI_UP_ARROW)) {
			camera.setLocX(camerapos.x+cam[4]*0.05*(now-lasttime));
			camera.setLocY(camerapos.y+cam[5]*0.05*(now-lasttime));
			camera.setLocZ(camerapos.z+cam[6]*0.05*(now-lasttime));
		}

	};
	/**
	 *
	 */
	// -- handle camera displacement and rotation
	M3D.GUI.handleCamera = function(xRot, yRot) {

		var keys=new GLGE.KeyInput();

		var deltaRot = 0.0001;
		var deltaLocObject = 0.01;
		var deltaLocCamera = 0.001;

		var newRotX = ( parseFloat(scene.camera.getRotX()) + xRot );
		var newRotY = ( parseFloat(scene.camera.getRotY()) + yRot );

		if ( obj ) {

			if ( M3D.GUI.CAMERA_STATE === M3D.GUI.MODEL_MOVE && keys.isKeyPressed(GLGE.KI_X) ) {

				obj.parent.setLocX( -newRotX * deltaLocObject );

			} else if ( M3D.GUI.CAMERA_STATE === M3D.GUI.MODEL_MOVE && keys.isKeyPressed(GLGE.KI_Y) ) {
				obj.parent.setLocY( newRotY * deltaLocObject );

			} else if (M3D.GUI.CAMERA_STATE === M3D.GUI.MODEL_MOVE && keys.isKeyPressed(GLGE.KI_Z) ) {

				obj.parent.setLocZ( newRotY * deltaLocObject );

			} else if (M3D.GUI.CAMERA_STATE === M3D.GUI.MODEL_ROTATE && keys.isKeyPressed(GLGE.KI_Y)) {

				obj.parent.setRotY( newRotY * deltaRot );

			} else if (M3D.GUI.CAMERA_STATE === M3D.GUI.MODEL_ROTATE && keys.isKeyPressed(GLGE.KI_X)) {

				obj.parent.setRotX( newRotY * deltaRot );

			} else if ( M3D.GUI.CAMERA_STATE === M3D.GUI.MODEL_ROTATE ) {

				obj.parent.setRotX( newRotX * deltaRot );
				obj.parent.setRotY( newRotY * deltaRot );

			}

			M3D.GUI.updateInputValuesFromObject();

		} else {

			if (M3D.GUI.CAMERA_STATE === M3D.GUI.CAMERA_ROTATE) {

				//mouseRecord = mouseGlobale.getMousePosition();
				M3D.GUI.cameraRotate();

			} else if (M3D.GUI.CAMERA_STATE === M3D.GUI.CAMERA_MOVE) {

				scene.camera.setLookat(null);
				scene.camera.setLocX(newRotY * deltaLocCamera);
				scene.camera.setLocY(-newRotX * deltaLocCamera);

			} else if (M3D.GUI.CAMERA_STATE === M3D.GUI.CAMERA_ZOOM) {

				var _oldCam = mouseRecordOld;
				var _cam = mouseRecord;

				//				log('old camera ', _oldCam, 'new camera ', _cam);

				var _delta = 0;
				if ( _cam.x < _oldCam.x && _cam.y < _oldCam.y ) {
					delat = -1;
				} else if ( _cam.x > _oldCam.x && _cam.y > _oldCam.y ) {
					delta = 1;
				}

				scene.camera.setFovY(parseFloat(scene.camera.getFovY())+_delta);

			}
		}

	};
	/**
	 *
	 */
	// fonction modifiée par Tom le 16/02
	M3D.GUI.cameraRotate = function() {

		var mousepos = mouseGlobale.getMousePosition();
		//var height = document.getElementById('canvas').offsetHeight;

		// Position souris gauche ou droite .. haut ou bas?
		var gauche = mousepos.x <= mouseRecord.x;
		//var mouvVerti = 0;
		//if(mousepos.x <= height/3){mouvVerti = 1;}else if(mousepos.x >= (height*0.66)){mouvVerti = -1;}

		// rotation selon position souris
		var cam = scene.camera;
		var camPos = cam.getPosition();
		var sens = 0;
		if (gauche) {
			sens = 1;
		} else {
			sens = -1;
		}

		if(!cam.lookAt) {
			cam.setLookat([0,0,0]);
		}

		var abs = camPos.x - cam.lookAt[0];
		var ord = camPos.y - cam.lookAt[1];
		var carreA = Math.pow(abs,2);
		var carreO = Math.pow(ord,2);
		var hypo = Math.sqrt(carreA+carreO);
		var div = ord/hypo;
		var angle = Math.acos(div);
		var newAngle = (angle+(0.08*sens))%(2*Math.PI);
		console.log(Math.sin(angle)+" ... "+Math.sin(newAngle));
		var newAbs = Math.sin(newAngle)*hypo;
		var newOrd = Math.cos(newAngle)*hypo;
		//console.log(newOrd+" ... "+newAbs);
		var cotesin = 1;
		var cotecos = -1;
		if (Math.sin(newAngle) <= 0) {
			cotesin = -1;
		};
		//if (Math.cos(newAngle) >= 0){cotecos = +1;};
		cam.setLocX(cam.lookAt[0] + (cotesin*newAbs));
		cam.setLocY(cam.lookAt[1] + (/*cotecos**/newOrd));

		//	cam.setLocZ(camPos.z + mouvVerti);

		mouseRecord = mouseGlobale.getMousePosition ();	// ajoutee par Tom
	};
	/**
	 *
	 */
	M3D.GUI.toggleBbox = function() {

		if ( obj ) {

			if ( $('#switchBbox').is(':checked') ) {

				M3D.GUI.drawBbox();

			} else {

				var bbox = obj.parent[0];
				scene.removeChild(bbox);

			}

		}

	};
	/**
	 *
	 */
	// -- update the selected object's info
	// TODO check this function, it seems to cause a serious problem
	// when updating the object values manually!
	M3D.GUI.updateInputValuesFromObject = function(n) {

		if (n===undefined) {
			var _float = function(v) {
				return parseFloat(v).toFixed(2);
			};
			var _obj = obj.parent;

			if (_obj.getLocX && _obj.getLocY && _obj.getLocZ &&
			obj.getScaleX && obj.getScaleY && obj.getScaleZ &&
			_obj.getRotX && _obj.getRotY && _obj.getRotZ) {

				$('#scaleX').val(_float(_obj.getScaleX()));
				$('#scaleY').val(_float(_obj.getScaleY()));
				$('#scaleZ').val(_float(_obj.getScaleZ()));

				$('#posX').val(_float(_obj.getLocX()));
				$('#posY').val(_float(_obj.getLocY()));
				$('#posZ').val(_float(_obj.getLocZ()));

				$('#rotX').val(_float(_obj.getRotX()));
				$('#rotY').val(_float(_obj.getRotY()));
				$('#rotZ').val(_float(_obj.getRotZ()));

				if ( _obj.boundingVolume ) {
					$('#bboxX').val(_float(_obj.boundingVolume.dims[0]));
					$('#bboxY').val(_float(_obj.boundingVolume.dims[1]));
					$('#bboxZ').val(_float(_obj.boundingVolume.dims[2]));
				}

			}

		} else {
			$("#id").val( null );
			$("#posX").val( null );
			$("#posY").val( null );
			$("#posZ").val( null );
			$('#rotX').val( null );
			$('#rotY').val( null );
			$('#rotZ').val( null );
			$("#scaleX").val( null );
			$("#scaleY").val( null );
			$("#scaleZ").val( null );
			$('#bboxX').val( null );
			$('#bboxY').val( null );
			$('#bboxZ').val( null );
		}
	};
	/**
	 *
	 */
	// -- weither we should update the editor's content
	M3D.GUI.checkEditor = function() {

		if ( obj ) {
			var _obj = obj.parent;
			var _name = M3D.Common.getObjectId(_obj.uid);
			if ( M3D.Editor.findString(_name) ) {
				$('#status').addClass('ui-state-error pointer').text('Please click here to update your scenario!').show();
			} else {
				$('#status').removeClass('ui-state-error').text('').hide();
			}
		}
	};
	/**
	 *
	 */
	// -- update the editor content
	M3D.GUI.updateEditor = function(cb) {
		if (obj) {
			var _float = function(v) {
				return parseFloat(v).toFixed(2);
			};
			var _obj = obj.parent;
			M3D.Editor.updateObjectAttributes({
				id: M3D.Common.getObjectId( obj.uid ),
				position: {
					x:_float(_obj.getLocX()),
					y:_float(_obj.getLocY()),
					z:_float(_obj.getLocZ())
				},
				rotation: {
					x:_float(_obj.getRotX()),
					y:_float(_obj.getRotY()),
					z:_float(_obj.getRotZ())
				},
				scale: {
					x:_float(_obj.getScaleX()),
					y:_float(_obj.getScaleY()),
					z:_float(_obj.getScaleZ())
				}
			}, cb);
		}
	};
	/**
	 *
	 */
	// -- reset the camera's position
	M3D.GUI.resetCameraPosition = function() {
		var c = doc.getElement('maincamera1');
		scene.camera.setDRot(c.getDRotX(), c.getDRotY(), c.getDRotZ());
		scene.camera.setDLoc(c.getDLocX(), c.getDLocY(), c.getDLocZ());
		scene.camera.setAspect(c.getAspect());
	};
	/**
	 *
	 */
	M3D.GUI.setMaterialEmit = function(v) {

		var tmp = obj || hoverobj;
		if( tmp ) {
			var child = tmp.children;
			for( i in child) {
				if (child[i].className === "Object") {
					child[i].getMaterial().setEmit(v);
				}
			}
		}

	};
	/**
	 *
	 */
	// -- picking objects
	M3D.GUI.pickObject = function(e, canvas) {

		obj = scene.pick(e.clientX-canvas.parentNode.offsetLeft,e.clientY-canvas.parentNode.offsetTop).object;

		if(obj && obj !== hoverobj) {

			var _obj = obj.parent; // groupe

			if(_obj.getId()!=="mainscene") {

				M3D.GUI.setMaterialEmit(0.1);
				M3D.GUI.updateInputValuesFromObject();

				$('#select-model').val(_obj.uid);

			}

			hoverobj = _obj;

		} else if(hoverobj && obj!==hoverobj) {
			M3D.GUI.unpickObject();
		}

	};
	/**
	 *
	 */
	// -- pick up an object based on its UID
	M3D.GUI.pickObjectFromSelect = function(e) {
		
		// unpick any object that has been picked previously!!
		M3D.GUI.unpickObject();

		var _uidSelect = $('#select-model').val();

		var _objects = scene.getObjects();

		if ( _uidSelect === "" ) {
			M3D.GUI.unpickObject();
		} else {
			for (var i = 0; i < _objects.length; i++) {

				var _parent = _objects[i].parent;
				if (_parent.uid && _parent.uid === _uidSelect) {

					// update the global obj var
					obj = _parent;

					M3D.GUI.setMaterialEmit(0.1);
					M3D.GUI.updateInputValuesFromObject();

					// exit this function
					return;

				}
			}
		}

	};
	/**
	 *
	 */
	// -- unpick an object
	M3D.GUI.unpickObject = function() {

		M3D.GUI.setMaterialEmit(null);

		M3D.GUI.updateInputValuesFromObject(false);

		hoverobj = null;
		obj = null;

		$('#slider').hide();

		//$('#select-model').val("");

	};
	/**
	 *
	 */
	// -- scaling
	M3D.GUI.scaleObject = function(d) {
		if ( obj ) {
			var delta = d * 0.02; // reduce the delta coz 1 is too high for scaling!

			obj.setScaleX( parseFloat(obj.getScaleX())+delta );
			obj.setScaleY( parseFloat(obj.getScaleY())+delta );
			obj.setScaleZ( parseFloat(obj.getScaleZ())+delta );

			M3D.GUI.updateInputValuesFromObject();
		}
	};
	/**
	 *
	 */
	M3D.GUI.clearCanvas = function() {
		var o = scene.getObjects();
		for (var i in o) {
			if ( o[i].getId() != 'grid'
			&& o[i].getId() != 'xyzaxis'
			&& o[i].getId() != 'xaxis'
			&& o[i].getId() != 'yaxis'
			&& o[i].getId() != 'zaxis' ) {
				scene.removeChild(o[i]);
			}
		}
	};
	/**
	 *
	 */
	// -- camera controler
	M3D.GUI.CameraController = function(element) {
		var controller = this;
		this.onchange = null;
		this.xRot = 0;
		this.yRot = 0;
		this.scaleFactor = 0.01;
		this.dragging = false;
		this.curX = 0;
		this.curY = 0;

		// Assign a mouse down handler to the HTML element.
		element.onmousedown = function(ev) {
			controller.dragging = true;
			controller.curX = ev.clientX;
			controller.curY = ev.clientY;
		};
		// Assign a mouse up handler to the HTML element.
		element.onmouseup = function(ev) {
			controller.dragging = false;
		};
		// Assign a mouse move handler to the HTML element.
		element.onmousemove = function(ev) {
			if (controller.dragging) {
				// Determine how far we have moved since the last mouse move
				// event.
				var curX = ev.clientX;
				var curY = ev.clientY;
				var deltaX = (controller.curX - curX) / controller.scaleFactor;
				var deltaY = (controller.curY - curY) / controller.scaleFactor;
				controller.curX = curX;
				controller.curY = curY;
				// Update the X and Y rotation angles based on the mouse motion.
				controller.xRot = (controller.xRot + deltaY);
				controller.yRot = (controller.yRot + deltaX);

				// Clamp the X rotation to prevent the camera from going upside
				// down.

				//							if (controller.xRot < -90) {
				//				                controller.xRot = -90;
				//				            } else if (controller.xRot > 90) {
				//				                controller.xRot = 90;
				//				            }
				// Send the onchange event to any listener.
				if (controller.onchange !== null) {
					controller.onchange(controller.xRot, controller.yRot);
				}
			}
		};
	};
})(window.M3D);