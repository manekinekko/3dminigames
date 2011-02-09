/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */
$(function(){
	
	// Start Event Bindings
	
	// -- picking
	$('#canvas').bind('mousedown', M3D.GUI.pickObject);	
	
	// -- mouse wheel for camera
	document.getElementById("canvas").addEventListener('DOMMouseScroll', M3D.GUI.wheel, false);
	window.document.getElementById("canvas").onmousewheel = document.getElementById("canvas").onmousewheel = M3D.GUI.wheel;
	
	// -- values manual updating
	$('input[type="text"]:not([disabled])').bind('keypress', function(){ M3D.GUI.updateValues($(this)); });

	
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
		var _nameElement = $('#name');
		var _name = _nameElement.val();
		if (M3D.GUI.validateFields(this) && !M3D.DB.containsObj( _name )) {
			
			_nameElement.removeClass('required');
			
			M3D.GUI.updateEntityList();
			M3D.GUI.addObjectToScene();
			
			var _name = $(this).closest('.window').find('#name').val();
			_name = M3D.Common.ucfirst(_name);
			M3D.Editor.setContent('type '+_name+' is Object;');
		}
		else {
			_nameElement.addClass('required');
		}
	});
	
	// -- object picking from select box
	$('#select-model').bind('change', M3D.GUI.pickObjectFromSelect);
	
	// -- show upload area
	$('#showupload').click(function(){M3D.GUI.toggleShowUpload();});
	
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
	
	// -- save grammar
	$('#iframe').keydown(function (e){
		/*if(e.keyCode==13)*/	//13 = enter
		console.log("ici");
		M3D.DB.update_grammar(M3D.Editor.getContent());
	});

	// -- generate the GLGE XML level file
	$('#generate-xml').bind('click', M3D.GUI.generateLevelFile);
	
	
	// -- handle the autocomplete feature into the editor
	/*
	var availableTags = [
			"ActionScript",
			"AppleScript",
			"Asp",
			"BASIC",
			"C",
			"C++",
			"Clojure",
			"COBOL",
			"ColdFusion",
			"Erlang",
			"Fortran",
			"Groovy",
			"Haskell",
			"Java",
			"JavaScript",
			"Lisp",
			"Perl",
			"PHP",
			"Python",
			"Ruby",
			"Scala",
			"Scheme"
		];
	$( "#editor textarea" ).autocomplete({
		source: availableTags
	});
	*/
	
});
