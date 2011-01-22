
/**
 * @name m3d_utils.js
 * @author chegham wassim
 */


if(!window["M3D"]){
	window["M3D"]={};	
}

if (!window["M3D"].GUI){
		window["M3D"].GUI={};
}

(function(M3D){

// Contants
// values in pixels
M3D.GUI.ANIMATE_BOTTOM_START_POS = 300;
M3D.GUI.ANIMATE_BOTTOM_END_POS = 495;
M3D.GUI.ANIMATE_RIGHT_START_POS = 300;
M3D.GUI.ANIMATE_RIGHT_END_POS = -222;
M3D.GUI.ANIMATE_WINDOW_OPEN_POS = 150;
M3D.GUI.ANIMATE_WINDOW_CLOSE_POS = -300;

// values in ms
M3D.GUI.ANIMATE_WINDOW_SPEED = 150;

// -- Event handler for mouse wheel event.
M3D.GUI.wheel = function(event){
    var delta = 0;
	
    if (!event) /* For IE. */
    	event = window.event;
		
		
    if (event.wheelDelta) { /* IE/Opera. */
        delta = event.wheelDelta/120;
        /** In Opera 9, delta differs in sign as compared to IE.
         */
        if (window.opera)
            delta = -delta;
    } else if (event.detail) { /** Mozilla case. */
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
    if (event.preventDefault){
        event.preventDefault();
	}
	event.returnValue = false;
}




// -- pick up an object based on its UID
M3D.GUI.pickObjectFromSelect = function(e){

	var found = false;

	var uidSelect = $('#select-model').val();

    var objects = scene.getObjects();

	if ( uidSelect == "" ){	
		M3D.GUI.unpickObject();
	}
	else {
		for (var i = 0; !found && i < objects.length; i++) {
			
			var parent = objects[i].parent;
			
			console.log(parent.uid);
			console.log(uidSelect);
			console.log(parent.uid == uidSelect);
			
			if (parent.uid == uidSelect) {
				obj = parent;
				M3D.GUI.setMaterialEmit(0.1);
				
				//scene.camera.setLookat(obj.getPosition());
				
				M3D.GUI.updateInfo();
				M3D.GUI.toggleShowInfo();
				
				found = true;
				
			}else{
				M3D.GUI.unpickObject();
			}
			
		}
	}
	
}



// -- handle mouse wheel
M3D.GUI.handleMouseWheel = function(delta) {
	
	var keys=new GLGE.KeyInput();
	
	if ( obj && keys.isKeyPressed(GLGE.KI_S) )
	{
		M3D.GUI.scaleObject(delta);
		M3D.GUI.updateInfo();
	}
	else {
		
		delta *= 2; // tweak the delta
		
		if ( keys.isKeyPressed(GLGE.KI_X) )
		{
			scene.camera.setDLocX( parseFloat(scene.camera.getDLocX()) + delta);
		}
		else if ( keys.isKeyPressed(GLGE.KI_Y) )
		{
			scene.camera.setDLocY( parseFloat(scene.camera.getDLocY()) + delta);
		}
		else if ( keys.isKeyPressed(GLGE.KI_Z) )
		{
			scene.camera.setDLocZ( parseFloat(scene.camera.getDLocZ()) + delta);
		}
		else 
		{

	        if(delta!=0){
				scene.camera.setFovY(parseFloat(scene.camera.getFovY())-delta);
	        }
			
		}
		
	}
	
}



// -- import models	
M3D.lastImportedModel = null;
M3D.GUI.importModel = function(url){
    
	M3D.GUI.showWaiting();
	
	var docCollada = new GLGE.Collada;
	
	
    docCollada.setDocument(url,doc.getAbsolutePath(doc.rootURL,null), function(){
					
		M3D.lastImportedModel = docCollada;
		
		// ask for entity info
		var uid = docCollada.uid ? docCollada.uid : (new Date()).getTime();			
		M3D.GUI.showPopup('entity-info', uid, true);

		M3D.GUI.hideWaiting();
		
	});
    
};


M3D.GUI.showWaiting = function(){
	var loading = document.getElementById('loading').style;
	loading.display = "block";
}


M3D.GUI.hideWaiting = function(){
	var loading = document.getElementById('loading').style;
	loading.display = "none";
}


// -- show a pop up window
M3D.GUI.showPopup = function(name, uid, clearInput){
	
	
	if (clearInput) {
		// clear all inputs
		M3D.GUI.clearInputs();
	}
	
	if ( name == "entity-info" ){
		$('.animate').animate({top: M3D.GUI.ANIMATE_BOTTOM_START_POS});
	}
	
	$('#viewmenu').fadeOut(100);

	$('#entity-info').show();

	$('#modal').fadeIn(100, function(){
		
		var window = $('.window.opened'); 
		if ( window.length > 0 ){
			
			
			// the window we want is hidden, so show it!
			if ( window.attr('id') != name ){
				
				// close the openned one ...
				window.animate({ top: M3D.GUI.ANIMATE_WINDOW_CLOSE_POS }, function(){
					
					// ... tag it as closed ...
					$(this).removeClass('opened').addClass('closed');

					// ... then open the new one.
					$('#'+name).addClass('opened').removeClass('closed').animate({ top:M3D.GUI.ANIMATE_WINDOW_OPEN_POS }, M3D.GUI.ANIMATE_WINDOW_SPEED);
					
					
				})
				
			}
			
		}
		else {
			// ... open the new window
			$('#'+name).addClass('opened').removeClass('closed').animate({ top:M3D.GUI.ANIMATE_WINDOW_OPEN_POS }, M3D.GUI.ANIMATE_WINDOW_SPEED);
		}
		
		var nameValue = $('.window #name');
		nameValue.attr('uid', uid);
		
	});
	
	
}





M3D.GUI.hidePopup = function(){
	
	
	$('.window.opened').animate({ top:M3D.GUI.ANIMATE_WINDOW_CLOSE_POS }, function(){
		
		$(this).removeClass('opened').addClass('closed');
		$('#viewmenu').fadeIn(100);
		$('#modal').hide(100);
	});
	
	
}

// -- adapt the correct type input based on user selection
M3D.GUI.toggleInputSelect = function(el){

	var type = $(el).val();
	var parent = $(el).closest('.window');
	
	switch(type){
		
		case "boolean":
			parent.find('#new-attribut-value-input').addClass('hidden').val('');
			parent.find('#new-attribut-value-select').removeClass('hidden');
		break;
		
		default:
			parent.find('#new-attribut-value-select').addClass('hidden');
			parent.find('#new-attribut-value-input').removeClass('hidden').val('');
		break;
		
	}
	
}


M3D.GUI.saveNewRule = function(){
	
	var ruleName = $('#rule-name').val();
	var entityName = $('#entity-name').val();
	var entityAttribut = $('#entity-attribut').val();
	var ruleCondition = $('#rule-condition').val();
	var conditionValue = $('#rule-condition-value').val();
	var action = $('#rule-action').val();
	
	var value = [];
	value.push('rule '+ruleName+' is'); 
	value.push(entityName);
	value.push(entityAttribut);
	value.push(ruleCondition+' then');
	value.push(conditionValue);
	value.push(action);
	var ruleHTML = '<div><input class="input-rule" type="text" name="rules[]" value="'+value.join(' ')+'" disabled="true"/>&nbsp;<a href="#" class="delete-rule" title="Delete">Delete</a></div>';

	$('#rules-list').prepend(ruleHTML);

	// [DB]
	// Save the new rule into DB
}


M3D.GUI.deleteRule = function(el){
	
	var rule = $(el).closest('div');
	rule.remove(); 
	
	// [DB]
	// delete this rule from DB
	
}



M3D.GUI.saveNewEntity = function(){
	var entityInfo = $('#new-entity input[name="entity-name"]');
	var val = entityInfo.val();
	var lbl = entityInfo.val();
	var newEntityHtml = "<option value='"+val+"'>"+lbl+"</option>";		
	$('#entity').removeClass('required').append( newEntityHtml ).val(val);
	
	M3D.GUI.showPopup('entity-info');
	
	// [DB]
	// Save the new entity into DB
}

M3D.GUI.saveNewAttribut = function(){
	
	var name = $('#new-attribut-name').val();
	var type = $('#new-attribut-type-2').val();
	var value;
	var html;
	
	switch(type){
		
		case "boolean": 
			value = $('#new-attribut-value-select').val(); 
            html = "<select id='attribut-" + name + "' name='attribut-" + name + "' >";
            html += "<option value='true' " + M3D.Common.printSelected(value, 'true') + " >True</option>";
            html += "<option value='false' " + M3D.Common.printSelected(value, 'true') + " >False</option>";
            html += "<select>";
		
		break;
		default: 
			
			value = $('#new-attribut-value-input').val(); 
			html = "<input class='"+type+"' type='text' id='" + name + "' name='" + name + "' value='" + value + "'/><br/>";
		
		break;
		
	}

	html = "<label for='" + name + "'>" + name + "</label><br/>" + html;
	html = "<div class='custom-attributes'>"+html+"</div>";
	
	$('#attributes').append(html);
	
	// little hack to scoll down the attributes in order to show the new added attribut
	document.getElementById('attributes').scrollTop += 10000000; // we chose a huge number for purpose !!!
	
	// reset
	$('#new-attribut-name').val('');	
	$('#new-attribut-value-input').val('');
	$('#new-attribut-value-select option[selected]').attr('selected', false);

}


M3D.GUI.addNewAttribut = function(){
	
	var name = $('#new-attribut-name');
	var type = $('#new-attribut-type-1');
	var value;
	
	if (type.val() == 'boolean') {
		value = $('#new-attribut-value-select');
	}
	else {
		value = $('#new-attribut-value-input');
	}
	
	var attr = '<div class="entry-attributes"><input class="width-100" disabled="true" type="text" value="'+name.val()+'" />\
				<input class="width-100" disabled="true" type="text" value="'+type.val()+'" />\
				<input class="width-100" disabled="true" type="text" value="'+value.val()+'" />\
				<a href="#" class="detele-attribut">Delete</a></div>';
	
	// add html
	$('#entity-attributes-list').prepend( attr );
	
	// clear input
	name.val('');
	type.val('');
	value.val('');
	
	// [DB]
	// Save the new attribut into DB and add the DB id to the new attribut in the list
	// so we can easily delete an attribut
	
}



M3D.GUI.deleteAttributFromList = function(el){
	
	var parent = $(el).closest('.entry-attributes');
	parent.remove();
	
	// [DB]
	// Delete this attribut from the DB using its DB id that has been inserted during its creation
	
}

M3D.GUI.updateEntityList = function(){
	
	var uid = $('.window #name').attr('uid');
	var name  = $('.window #name').val();
	
	$('#select-model').append('<option value="'+uid+'">'+name+'</option>');

	M3D.GUI.hidePopup();
	
}


// -- add object to scene (TODO)
M3D.GUI.addObjectToScene = function() {
	
	// tweak the new object scale
	var bbox = M3D.lastImportedModel.getBoundingVolume().dims;
	
	// TO DO: may be these values should be computed rather than hard coded!
	var tmp_x = 0.05;
	var tmp_y = 0.05;
	var tmp_z = 0.05;
	M3D.lastImportedModel.setScale(tmp_x, tmp_y, tmp_z);
	M3D.lastImportedModel.getObjects()[0].parent.uid = $('#entity-info #name').attr('uid');
	
	console.log(M3D.lastImportedModel);
	
	scene.addChild(M3D.lastImportedModel);
	
	M3D.lastImportedModel = null;

};


// -- manual values updating
M3D.GUI.updateValues = function(element){
	
	var value = parseFloat(element.val());
	
	if( obj && value != 'NaN' )
	{
		switch( element.attr('name') )
		{
			case 'posX': obj.setDLocX( value ); break;
			case 'posY': obj.setDLocY( value ); break;
			case 'posZ': obj.setDLocZ( value ); break;
			
			case 'scaleX': if ( value > 0 ) obj.setDScaleX( value ); break;
			case 'scaleY': if ( value > 0 ) obj.setDScaleY( value ); break;
			case 'scaleZ': if ( value > 0 ) obj.setDScaleZ( value ); break;
			
			case 'rotX': if ( value > 0 ) obj.setDRotX( value ); break;
			case 'rotY': if ( value > 0 ) obj.setDRotY( value ); break;
			case 'rotZ': if ( value > 0 ) obj.setDRotZ( value ); break;							
			
		}
		
	}

};



// -- TO DO: to bug fix
// -- bounding box
M3D.GUI.drawBbox = function(){

	//blocs 1 � 4 = face sup, 5 � 8 = face inf, 9 � 12 = faces verticales
	
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
	
	positions.push(posX-(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ+(dimsZ/2));   
	positions.push(posX-(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	positions.push(posX-(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ+(dimsZ/2));   
	positions.push(posX+(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	positions.push(posX+(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ+(dimsZ/2));   
	positions.push(posX+(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	positions.push(posX+(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ+(dimsZ/2));   
	positions.push(posX-(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	
	positions.push(posX-(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX-(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ-(dimsZ/2));
	
	positions.push(posX-(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX+(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ-(dimsZ/2));
	
	positions.push(posX+(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX+(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ-(dimsZ/2));
	
	positions.push(posX+(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX-(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ-(dimsZ/2));
	
	
	positions.push(posX-(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX-(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	positions.push(posX-(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX-(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	positions.push(posX+(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX+(dimsX/2)); positions.push(posY-(dimsY/2)); positions.push(posZ+(dimsZ/2));
	
	positions.push(posX+(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ-(dimsZ/2));   
	positions.push(posX+(dimsX/2)); positions.push(posY+(dimsY/2)); positions.push(posZ+(dimsZ/2));

	var yellow = new GLGE.Material();
	yellow.setColor('#000');
	yellow.setSpecular=0.00;
	yellow.setEmit(1);
	
	var line=(new GLGE.Object).setDrawType(GLGE.DRAW_LINES);
	line.setMesh((new GLGE.Mesh).setPositions(positions));
	line.setMaterial(yellow);
	line.setLoc(posX, posY, posZ);
	line.setRot(rotX, rotY, rotZ);
	line.pickable = false;
	obj.parent.addObject(line);
	
} 


M3D.GUI.isRequiredFieldsOK = function(el){
	
	var isOK = true;
	var parent = $(el).closest('.window');
	
	parent.find('input[required], select[required]').each(function(){
		
		if ( $(this).val() == "" ){
			isOK = false;
			$(this).addClass('required');
		}
		else {
			$(this).removeClass('required');
		}
		
	});
	
	return isOK;
	
}


M3D.GUI.clearInputs = function(){
	$('.required').removeClass('required');
	$('.window').find('input[type="text"], select').each(function(){
		$(this).val('');
	});
}



// -- TO DO: to bug fix
// -- camera control
M3D.GUI.checkkeys = function (){

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

}


// -- handle camera displacement and rotation
M3D.GUI.handleCamera = function(xRot, yRot){
	
	var keys=new GLGE.KeyInput();
	
	var deltaRot = 0.0001;
	var deltaLocObject = 0.01;
	var deltaLocCamera = 0.001;
	
	var newRotX = ( parseFloat(scene.camera.getRotX()) + xRot );
	var newRotY = ( parseFloat(scene.camera.getRotY()) + yRot );
	
	if ( obj ){
		
		if ( keys.isKeyPressed(GLGE.KI_X) )
		{
			
			obj.parent.setDLocX( -newRotX * deltaLocObject ); 
		
		}
		else if ( keys.isKeyPressed(GLGE.KI_Y) )
		{
			obj.parent.setDLocY( newRotY * deltaLocObject );
		
		}
		else if ( keys.isKeyPressed(GLGE.KI_Z) )
		{
		
			obj.parent.setDLocZ( newRotY * deltaLocObject );
		
		}
		else if ( keys.isKeyPressed(GLGE.KI_SHIFT)){
							
			obj.parent.setDRotY( newRotY * deltaRot );

		}
		else if (keys.isKeyPressed(GLGE.KI_ALT)){
			
			obj.parent.setDRotX( newRotY * deltaRot );
		
		}
		else {
			obj.parent.setDRotX( newRotX * deltaRot ); 
			obj.parent.setDRotY( newRotY * deltaRot ); 
			
		}
		
		M3D.GUI.updateInfo();
		
	}
	else {
		
		if ( keys.isKeyPressed(GLGE.KI_R) )
		{
			
			scene.camera.setRotOrder( GLGE.ROT_YXZ );
			scene.camera.setRotX( -newRotX * deltaRot ); 
			scene.camera.setRotY( -newRotY * deltaRot ); 

			
		}else {
			
			scene.camera.setLookat( null );
			scene.camera.setDLocX( newRotY * deltaLocCamera ); 
			scene.camera.setDLocY( -newRotX * deltaLocCamera ); 
		}
	}
	
}


M3D.GUI.toggleBbox = function(){
	
	if ( obj ){
			
		if ( $('#switchBbox').is(':checked') ){
			
			M3D.GUI.drawBbox();
			
		}else {
			
			var bbox = obj.parent[0];
			scene.removeChild(bbox);
			
		}
		
	}
	
}



// -- update the selected object's info
M3D.GUI.updateInfo = function(n){
		
	if (n==undefined)
	{
		if (obj.getId()!="") $('#id').val( obj.getId());
		$('#posX').val( parseFloat(obj.getDLocX()).toFixed(2) );
		$('#posY').val( parseFloat(obj.getDLocY()).toFixed(2) );
		$('#posZ').val( parseFloat(obj.getDLocZ()).toFixed(2) );
		$('#scaleX').val( parseFloat(obj.getScaleX()).toFixed(2) );
		$('#scaleY').val( parseFloat(obj.getScaleY()).toFixed(2) );
		$('#scaleZ').val( parseFloat(obj.getScaleZ()).toFixed(2) );
		$('#rotX').val( parseFloat(obj.getDRotX()).toFixed(2) );
		$('#rotY').val( parseFloat(obj.getDRotY()).toFixed(2) );
		$('#rotZ').val( parseFloat(obj.getDRotZ()).toFixed(2) );
		$('#bboxX').val( parseFloat(obj.boundingVolume.dims[0]).toFixed(2) );
		$('#bboxY').val( parseFloat(obj.boundingVolume.dims[1]).toFixed(2) );
		$('#bboxZ').val( parseFloat(obj.boundingVolume.dims[2]).toFixed(2) );						
	}
	else {
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
}


// -- reset the camera's position
M3D.GUI.resetCameraPosition = function(){
	
	var c = doc.getElement('maincamera1');
	console.log(c);
	scene.camera.setDRot(c.getDRotX(), c.getDRotY(), c.getDRotZ());
	scene.camera.setDLoc(c.getDLocX(), c.getDLocY(), c.getDLocZ());
	scene.camera.setAspect(c.getAspect());
}



M3D.GUI.setMaterialEmit = function(v){
	
	var tmp = obj || hoverobj;
	if( tmp ){
		var child = tmp.children;
		for( i in child)
		{
			child[i].getMaterial().setEmit(v);
		}
	}
	
}


// -- picking objects
M3D.GUI.pickObject = function(e){
	
	
	obj = scene.pick(e.clientX-this.parentNode.offsetLeft,e.clientY-this.parentNode.offsetTop).object;
	
	if(obj && obj!=hoverobj){
		
		obj = obj.parent; // groupe
		
		if(obj.getId()!="mainscene") {
			
			M3D.GUI.setMaterialEmit(0.1);
				
			M3D.GUI.updateInfo();
									
		}

//		if (hoverobj && hoverobj.getId() != "mainscene") {
//			hoverobj.setMaterial(hoverobj.oldmaterial);
//		}
		
		hoverobj = obj;
		
		M3D.GUI.toggleShowInfo();
		
	}
	else if(hoverobj && obj!=hoverobj) {
		M3D.GUI.unpickObject();
	}

}




M3D.GUI.toggleShowInfo = function(){
	

    $('.animate').animate({
        top: M3D.GUI.ANIMATE_BOTTOM_START_POS
    }, 100, function(){
    
        $('#info-bottom').show(10, function(){
            $(this).animate({
                top: M3D.GUI.ANIMATE_BOTTOM_END_POS
            }, 150);
        });
        
        $('#info-right').show(10, function(){
            
			M3D.GUI.updateObjectAttributesList();
			
			$(this).animate({
                right: M3D.GUI.ANIMATE_RIGHT_END_POS
            }, 150);
        });
        
    });


}


// -- read and list a class attributes
M3D.GUI.updateObjectAttributesList = function(){
	
    var attr = "",
	    value,
		id,
		css_class = "string",
		len;
	
    for (att in obj) {
		
        value = obj[att];
		
        if ( M3D.Common.isValidType( value )  ) {
			
            id = "attribut-" + att;
            
            attr += "<label for='" + att + "'>" + att + "</label><br/>";
            
            if (typeof(value) == "number" || typeof(value)  == "string") {
            
				css_class = typeof(value) == "number" ? "number" : css_class;
                
                // type cast tweak for numbers
                value = "" + value;

                len = value.length;
                if (len <= 50) {
                    attr += "<input class='"+css_class+"' type='text' id='" + id + "' name='" + id + "' value='" + value + "'/><br/>";
                }
                else {
                    attr += "<textarea cols='5' row='5' name='" + id + "' id='" + id + "' >" + value + "</textarea>";
                }
                
            }
            else if (typeof(value) == "boolean") {
                attr += "<select id='attribut-" + att + "' name='attribut-" + att + "' >";
                attr += "<option value='true' " + M3D.Common.printSelected(value, 'true') + " >True</option>";
                attr += "<option value='false' " + M3D.Common.printSelected(value, 'true') + " >False</option>";
                attr += "<select>";
            }
        }
		
    }
	
	attr = "<div class='entity-attributes'>"+attr+"</div>";
    $('#attributes').html(attr);
    
}



// -- unpick an object
M3D.GUI.unpickObject = function(){
	
	M3D.GUI.setMaterialEmit(null);
	
	M3D.GUI.updateInfo(false);
	
	hoverobj = null;
	obj = null;
	
	// hide object info
	$('#info-bottom').animate({top:M3D.GUI.ANIMATE_BOTTOM_START_POS}, 150);
	$('#info-right').animate({right: M3D.GUI.ANIMATE_RIGHT_START_POS}, 150);
	
}



// -- scaling
M3D.GUI.scaleObject = function(delta)
{
	var delta = delta * 0.02; // reduce the delta coz 1 is too high for scaling!
	if ( obj ){
					
		obj.setScaleX( parseFloat(obj.getScaleX())+delta );
		obj.setScaleY( parseFloat(obj.getScaleY())+delta );
		obj.setScaleZ( parseFloat(obj.getScaleZ())+delta );
		
		M3D.GUI.updateInfo();
	}
}



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
            if (controller.onchange != null) {
                controller.onchange(controller.xRot, controller.yRot);
            }
        }
    };
}


// -- toggle the upload info
M3D.flag = true;
M3D.GUI.toggleShowUpload = function(){
	
	if (M3D.flag) {
	
		if (hoverobj) {
			M3D.GUI.unpickObject();
		}
		
		
		$('.animate').animate({
			top: M3D.GUI.ANIMATE_BOTTOM_START_POS
		}, 100, function(){
		
			$('#upload').show(10, function(){
				$(this).animate({
					top: M3D.GUI.ANIMATE_BOTTOM_END_POS
				}, 150);
			});
			
		});
		
	}
	else {
	
		$('#upload').animate({
			top: M3D.GUI.ANIMATE_BOTTOM_START_POS
		}, 150);
		
	}
	M3D.flag = !M3D.flag;
	
}


M3D.GUI.WebWorkers = function(workerUrl){
	var worker = this;
	this.url = workerUrl;
	this.cmd = null;
	this.extra = null;
	this.ww = null;
	
	function checkSupport() {
	  return !!window.Worker;
	}
	
	function init(){
		worker.ww = new Worker(worker.url);	
	}
	
	function post(){
	    worker.ww.postMessage({'cmd': worker.cmd, 'extra' : worker.extra});
	}
	
	this.setCommand = function(cmd){
		worker.cmd = cmd;
		return worker;
	}
	
	this.setExtra = function(extra){
		worker.extra = extra;
		return worker;
	}
	
	this.run = function(){
		
		checkSupport();
		init();
		post();
	}
	
	
}


})(window["M3D"]);
