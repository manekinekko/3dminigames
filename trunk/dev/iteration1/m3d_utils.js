
/**
 * @utilsFile
 * @name m3d_utils.js
 * @author chegham wassim
 */


if(!window["M3D"]){
	/**
	* @namespace Holds the functionality of the library
	*/
	window["M3D"]={};
	window["M3D"].Utilitie={};
	
}

(function(M3D){


M3D.Utilitie.ANIMATE_START_POS = 300;
M3D.Utilitie.ANIMATE_END_POS = 606;


// -- Event handler for mouse wheel event.
M3D.Utilitie.wheel = function(event){
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
        if (delta)
            M3D.Utilitie.handleMouseWheel(delta);
			
			
        /** Prevent default actions caused by mouse wheel.
         * That might be ugly, but we handle scrolls somehow
         * anyway, so don't bother here..
         */
        if (event.preventDefault)
            event.preventDefault();
	
	event.returnValue = false;
}




// -- handle mouse wheel
M3D.Utilitie.handleMouseWheel = function(delta) {
	
	var keys=new GLGE.KeyInput();
	
	if ( obj && keys.isKeyPressed(GLGE.KI_S) )
	{
		M3D.Utilitie.scaleObject(delta);
		M3D.Utilitie.updateInfo();
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
M3D.Utilitie.importModel = function(url){
    
	var ext = url.split('.');
	var filetype = ext[ ext.length-1 ];
	
	if ( filetype == "dae" ){
		
		var loading = document.getElementById('loading').style;
		loading.display = "block";
		
		var docCollada = new GLGE.Collada;
        docCollada.setDocument(url,doc.getAbsolutePath(doc.rootURL,null), function(){
			
			loading.display = "none";
			scene.addChild(docCollada);
			
		});
		
	}
	else {
		
		// basic geometry models
		addObjectToScene(url);
		
	}
    
};



// -- add object to scene (TODO)
M3D.Utilitie.addObjectToScene = function(mesh) {
    var obj = new GLGE.Object();
    obj.setMesh(doc.getElement(mesh));
	scene.addChild(obj);
};



// -- manual values updating
M3D.Utilitie.updateValues = function(element){
	
	var value = parseFloat(element.val());
	
	if( obj && value != 'NaN' )
	{
		switch( $(this).attr('name') )
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




// -- bounding box
M3D.Utilitie.drawBbox = function(posX,posY,posZ,rotX,rotY,rotZ,cote){

	//blocs 1 � 4 = face sup, 5 � 8 = face inf, 9 � 12 = faces verticales
	var positions=[];
	
	positions.push(posX-(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ+(cote/2));   
	positions.push(posX-(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ+(cote/2));
	
	positions.push(posX-(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ+(cote/2));   
	positions.push(posX+(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ+(cote/2));
	
	positions.push(posX+(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ+(cote/2));   
	positions.push(posX+(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ+(cote/2));
	
	positions.push(posX+(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ+(cote/2));   
	positions.push(posX-(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ+(cote/2));
	
	
	positions.push(posX-(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX-(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ-(cote/2));
	
	positions.push(posX-(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX+(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ-(cote/2));
	
	positions.push(posX+(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX+(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ-(cote/2));
	
	positions.push(posX+(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX-(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ-(cote/2));
	
	
	positions.push(posX-(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX-(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ+(cote/2));
	
	positions.push(posX-(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX-(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ+(cote/2));
	
	positions.push(posX+(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX+(cote/2)); positions.push(posY-(cote/2)); positions.push(posZ+(cote/2));
	
	positions.push(posX+(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ-(cote/2));   
	positions.push(posX+(cote/2)); positions.push(posY+(cote/2)); positions.push(posZ+(cote/2));

	var yellow = new GLGE.Material();
	yellow.setColorB(1);
	yellow.setColorG(1);
	yellow.setColorR(0);
	yellow.setSpecular=0.00;
	yellow.setEmit(1);
	
	var line=(new GLGE.Object).setDrawType(GLGE.DRAW_LINES);
	line.setMesh((new GLGE.Mesh).setPositions(positions));
	line.setMaterial(yellow);
	line.setDRot(rotX, rotY, rotZ);
	line.pickable = false;
	scene.addObject(line);
} 



// -- camera control (TODO)
M3D.Utilitie.checkkeys = function (){	

	var camera=gameScene.camera;
	camerapos=camera.getPosition();
	camerarot=camera.getRotation();
	var cam = camera.getRotMatrix();
	cam = GLGE.inverseMat4(cam);	

	if(keys.isKeyPressed(GLGE.KI_G))
		camLookAt = true;			
	
	if(keys.isKeyPressed(GLGE.KI_F)) 
		camLookAt = false;

		if(camLookAt){
		var objpos={x:0,y:0,z:0};		
			var coord=[camerapos.x-objpos.x,camerapos.y-objpos.y,camerapos.z-objpos.z];
			var zvec=GLGE.toUnitVec3(coord);
			var xvec=GLGE.toUnitVec3(GLGE.crossVec3([cam[4],cam[5],cam[6]],zvec));
			var yvec=GLGE.toUnitVec3(GLGE.crossVec3(zvec,xvec));		
			camera.setRotMatrix(GLGE.Mat4([xvec[0], yvec[0], zvec[0], 0,
							xvec[1], yvec[1], zvec[1], 0,
							xvec[2], yvec[2], zvec[2], 0,
							0, 0, 0, 1]));
	}
	
	if(keys.isKeyPressed(GLGE.KI_Z)) {camera.setLocX(camerapos.x-cam[8]*0.5*(now-lasttime));camera.setLocY(camerapos.y-cam[9]*0.5*(now-lasttime));camera.setLocZ(camerapos.z-cam[10]*0.5*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_S)) {camera.setLocX(camerapos.x+cam[8]*0.5*(now-lasttime));camera.setLocY(camerapos.y+cam[9]*0.5*(now-lasttime));camera.setLocZ(camerapos.z+cam[10]*0.5*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_Q)) {camera.setLocX(camerapos.x-cam[0]*0.5*(now-lasttime));camera.setLocY(camerapos.y-cam[1]*0.5*(now-lasttime));camera.setLocZ(camerapos.z-cam[2]*0.5*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_D)) {camera.setLocX(camerapos.x+cam[0]*0.5*(now-lasttime));camera.setLocY(camerapos.y+cam[1]*0.5*(now-lasttime));camera.setLocZ(camerapos.z+cam[2]*0.5*(now-lasttime));}

	if(keys.isKeyPressed(GLGE.KI_DOWN_ARROW)) {camera.setLocX(camerapos.x-cam[4]*0.5*(now-lasttime));camera.setLocY(camerapos.y-cam[5]*0.5*(now-lasttime));camera.setLocZ(camerapos.z-cam[6]*0.5*(now-lasttime));}		
		
	if(keys.isKeyPressed(GLGE.KI_UP_ARROW)) {camera.setLocX(camerapos.x+cam[4]*0.5*(now-lasttime));camera.setLocY(camerapos.y+cam[5]*0.5*(now-lasttime));camera.setLocZ(camerapos.z+cam[6]*0.5*(now-lasttime));}		
	

}



// -- handle camera displacement and rotation
M3D.Utilitie.handleCamera = function(xRot, yRot){
	
	var keys=new GLGE.KeyInput();
	
	var deltaRot = 0.0001;
	var deltaLoc = 0.01;

	var newRotX = ( parseFloat(scene.camera.getRotX()) + xRot );
	var newRotY = ( parseFloat(scene.camera.getRotY()) + yRot );
	
	if ( obj ){
		
		if ( keys.isKeyPressed(GLGE.KI_X) )
		{
			
			obj.setDLocX( -newRotX * deltaLoc ); 
		
		}
		else if ( keys.isKeyPressed(GLGE.KI_Y) )
		{
			obj.setDLocY( newRotY * deltaLoc );
		
		}
		else if ( keys.isKeyPressed(GLGE.KI_Z) )
		{
		
			obj.setDLocZ( newRotY * deltaLoc );
		
		}
		else if ( keys.isKeyPressed(GLGE.KI_SHIFT)){
							
			obj.setDRotY( newRotY * deltaRot );

		}
		else if (keys.isKeyPressed(GLGE.KI_ALT)){
			
			obj.setDRotX( newRotY * deltaRot );
		
		}
		else {
			obj.setDRotX( -newRotX * deltaRot ); 
			obj.setDRotY( -newRotY * deltaRot ); 
		}
		
		M3D.Utilitie.updateInfo();
		
	}
	else {
		
		if ( keys.isKeyPressed(GLGE.KI_R) )
		{
			
			scene.camera.setRotOrder( GLGE.ROT_YXZ );
			scene.camera.setRotX( -newRotX * deltaRot ); 
			scene.camera.setRotY( -newRotY * deltaRot ); 

			
		}else {
			
			scene.camera.setLookat( null );
			scene.camera.setDLocX( newRotY * 0.005 ); 
			scene.camera.setDLocY( -newRotX * 0.005 ); 
		}
	}
	
}



M3D.Utilitie.toggleBbox = function(){
	
	
	if ( obj ){
		
		var bbox;
			
		if ( $('#switchBbox').is(':checked') ){
			
			M3D.Utilitie.drawBbox(obj.getDLocX(), obj.getDLocY(), obj.getDLocZ(), obj.boundingVolume.dims[0], obj.getRotX(), obj.getRotY(), obj.getRotZ());
			
			
		}else {
			
			scene.removeChild(bbox);
			bbox = null;
			
		}
		
	}
	
}



// -- update the selected object's info
M3D.Utilitie.updateInfo = function(n){
		
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
M3D.Utilitie.resetcamera = function(){
	scene.camera.setDRot(0, 0, 0);
	scene.camera.setLoc(0, 0, 1000);
}



// -- picking objects
M3D.Utilitie.pickObject = function(e){
	
	
	obj = scene.pick(e.clientX-this.parentNode.offsetLeft,e.clientY-this.parentNode.offsetTop).object; 
	
	if(obj && obj!=hoverobj){
		
		if(obj.getId()!="mainscene") {
			
			obj.getMaterial().setEmit(.1);
				
			M3D.Utilitie.updateInfo();
									
		}

		if(hoverobj && hoverobj.getId()!="mainscene") hoverobj.setMaterial(hoverobj.oldmaterial);
		
		hoverobj = obj;
		
		$('.animate').animate({
				top: M3D.Utilitie.ANIMATE_START_POS
			}, 100, function(){
				
				$('#info').show(10, function(){
					$(this).animate({top:M3D.Utilitie.ANIMATE_END_POS}, 150);
				});
				
			});
		
	}
	else if(hoverobj && obj!=hoverobj) {
		M3D.Utilitie.unpickObject();
	}

}


// -- unpick an object
M3D.Utilitie.unpickObject = function(){
	
	hoverobj.getMaterial().setEmit(null);
	
	M3D.Utilitie.updateInfo(false);
	
	hoverobj = null;
	obj=null;
							
	$('#info').animate({top:M3D.Utilitie.ANIMATE_START_POS}, 150);
	
}



// -- scaling
M3D.Utilitie.scaleObject = function(delta)
{
	var delta = delta * 0.02; // reduce the delta coz 1 is too high for scaling!
	if ( obj ){
					
		obj.setScaleX( parseFloat(obj.getScaleX())+delta );
		obj.setScaleY( parseFloat(obj.getScaleY())+delta );
		obj.setScaleZ( parseFloat(obj.getScaleZ())+delta );
		
		M3D.Utilitie.updateInfo();
	}
}



// -- camera controler
M3D.Utilitie.CameraController = function(element) {
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
M3D.Utilitie.toggleShowUpload = function(){
	
	if (flag) {
	
		if (hoverobj) {
			M3D.Utilitie.unpickObject();
		}
		
		
		$('.animate').animate({
			top: M3D.Utilitie.ANIMATE_START_POS
		}, 100, function(){
		
			$('#upload').show(10, function(){
				$(this).animate({
					top: M3D.Utilitie.ANIMATE_END_POS
				}, 150);
			});
			
		});
		
	}
	else {
	
		$('#upload').animate({
			top: M3D.Utilitie.ANIMATE_START_POS
		}, 150);
		
	}
	flag = !flag;
	
}


})(window["M3D"]);
