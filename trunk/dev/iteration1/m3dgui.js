
//////////////////////////////////////////////////////////////////////////////////
// CECI EST UN PROTO : LE CODE N'EST PAS TERMINE !! PAS DE JUGEMENT !! MERCI :)
//////////////////////////////////////////////////////////////////////////////////


// constants
var ANIMATE_START_POS = 300;
var ANIMATE_END_POS = 606;

var canvas = document.getElementById('canvas');

// -- create a document
var doc = new GLGE.Document();
var obj;

// -- callback function that is called when the xml document
//    has finished loading
doc.onLoad = function() {
	
	// -- create a renderer and pass in the canvas object
	var renderer = new GLGE.Renderer(document.getElementById("canvas"));
	// -- create a new scene. the name defined in the parameter corresponds
	//    to the id attribute of the scene element in the xml file.
	var scene = doc.getElement("mainscene");
	scene.backgroundColor = "#fff";
	
	// -- pass the scene to the renderer
	renderer.setScene(scene);

	// -- mouse look
	var mouse=new GLGE.MouseInput(canvas);
	var keys=new GLGE.KeyInput();
	var hoverobj;
	var mouseovercanvas;
	var now;
	var pickcolor=doc.getElement("green");
	var controller = new CameraController(canvas);
	
	// -- Event handler for mouse wheel event.
	function wheel(event){
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
                handle(delta);
	        /** Prevent default actions caused by mouse wheel.
	         * That might be ugly, but we handle scrolls somehow
	         * anyway, so don't bother here..
	         */
	        if (event.preventDefault)
                event.preventDefault();
		
		event.returnValue = false;
	}
	
	// -- 
	/** This is high-level function.
	 * It must react to delta being more/less than zero.
	 */
	function handle(delta) {
		
		if ( obj && keys.isKeyPressed(GLGE.KI_S) )
		{
			scale(delta);
			updateInfo();
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
	
	// -- camera look
	var hoverobj;
	var mouseovercanvas;
	function CameraController(element) {
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

	
	// -- scaling
	function scale(delta)
	{
		var delta = delta * 0.02; // reduce the delta coz 1 is too high for scaling!
		if ( obj ){
						
			obj.setScaleX( parseFloat(obj.getScaleX())+delta );
			obj.setScaleY( parseFloat(obj.getScaleY())+delta );
			obj.setScaleZ( parseFloat(obj.getScaleZ())+delta );
			
			updateInfo();
		}
	}
	
	// -- picking
	function pick(e){
		
		$('#canvas').css('cursor', 'hand');
		
		obj = scene.pick(e.clientX-this.parentNode.offsetLeft,e.clientY-this.parentNode.offsetTop).object; 
		
		if(obj && obj!=hoverobj){
			
			if(obj.getId()!="mainscene") {
				
				obj.oldmaterial=obj.getMaterial();
				obj.setMaterial(pickcolor);	
					
				updateInfo();
										
			}

			if(hoverobj && hoverobj.getId()!="mainscene") hoverobj.setMaterial(hoverobj.oldmaterial);
			
			hoverobj = obj;
			
			$('.animate').animate({
					top: ANIMATE_START_POS
				}, 100, function(){
					
					$('#info').show(10, function(){
						$(this).animate({top:ANIMATE_END_POS}, 150);
					});
					
				});
			
		}
		else if(hoverobj && obj!=hoverobj) {
			unpickObject();
		}

	}

	function unpickObject(){
		hoverobj.setMaterial(hoverobj.oldmaterial);

		updateInfo(false);
		
		hoverobj = null;
		obj=null;
								
		$('#info').animate({top:ANIMATE_START_POS}, 150);
	}

	function updateInfo(n){
		
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

	// -- import collada		
    function importCollada(url){
        
		var loading = document.getElementById('loading').style;
		loading.display = "block";
		
		var docCollada = new GLGE.Collada;
        docCollada.setDocument(url,doc.getAbsolutePath(doc.rootURL,null), function(){
			
			loading.display = "none";
			scene.addChild(docCollada);
			
		});
        
    }
	
	// -- picking
	$('#canvas').bind('mousedown', pick).bind('mouseup', function(){
		$('#canvas').css('cursor', 'default');
	});
	
	$('#canvas').bind('mouseover', function(e){mouseovercanvas=true;});
	
	// -- camera 
	document.getElementById("canvas").addEventListener('DOMMouseScroll', wheel, false);
	window.onmousewheel = document.onmousewheel = wheel;
	
	// -- manual value updating
	$('input[type="text"]:not([disabled])').bind('keypress', function(e){
		var value = parseFloat($(this).val());

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
		
	});
	
	// -- bounding box (TODO)
	var bbox;
	$('#switchBbox').click(function(){
		
		
		
		if ( obj ){
			
			if ( $(this).is(':checked') ){
				var positions = [-1,1,-1, 
								  1,1,-1, 
								  1,1,1,
								  -1,1,1,
								  -1,-1,1,
								  1,-1,1,
								  1,-1,-1,
								  -1,-1,-1];
				var color=doc.getElement( "cyan" );
				var mesh=doc.getElement( "box" );
				bbox = (new GLGE.Object).setDrawType(GLGE.DRAW_LINES);
				bbox.setMesh(mesh); //setMesh((new GLGE.Mesh).setPositions(positions));
				bbox.setMaterial(color);
				bbox.setZtransparent(true);
				bbox.setLoc( obj.getDLocX(), obj.getDLocY(), obj.getDLocZ() );
				bbox.setScale( obj.boundingVolume.dims[0], obj.boundingVolume.dims[1], obj.boundingVolume.dims[2])
				bbox.setRot( obj.getRotX(), obj.getRotY(), obj.getRotZ() );
				
				bbox.pickable = false;
				scene.addChild(bbox);
				
				
			}else {
				
				scene.removeChild(bbox);
				bbox = null;
				
			}
			
			
			
		}
	});

	// -- objet and camera rotaion
	controller.onchange = function(xRot, yRot) { 

		var deltaRot = 0.0001;
		var deltaLoc = 0.01;

		var newRotX = ( parseFloat(scene.camera.getRotX()) + xRot );
		var newRotY = ( parseFloat(scene.camera.getRotY()) + yRot );
		
		if ( obj ){
			
			if ( keys.isKeyPressed(GLGE.KI_SHIFT)){
								
				if ( keys.isKeyPressed(GLGE.KI_X) )
				{
					obj.setDRotX( newRotX * deltaRot ); 
				}
				else if ( keys.isKeyPressed(GLGE.KI_Y) )
				{
					obj.setDRotY( newRotY * deltaRot );
				}
				else if ( keys.isKeyPressed(GLGE.KI_Z) )
				{
					obj.ssetDRotZ( newRotY * deltaRot );
				}
			}
			else {
				
				
				if ( keys.isKeyPressed(GLGE.KI_X) )
				{
					obj.setDLocX( newRotX * deltaLoc ); 
				}
				else if ( keys.isKeyPressed(GLGE.KI_Y) )
				{
					obj.setDLocY( newRotY * deltaLoc );
				}
				else if ( keys.isKeyPressed(GLGE.KI_Z) )
				{
					obj.setDLocZ( newRotY * deltaLoc );
				}
				else {
					obj.setDRotX( -newRotX * deltaRot ); 
					obj.setDRotY( -newRotY * deltaRot ); 
				}
			
			}
			
			updateInfo();
			
		}
		else {
			
			if ( keys.isKeyPressed(GLGE.KI_R) )
			{
				
				scene.camera.setRotOrder( GLGE.ROT_XYZ );
				scene.camera.setRotX( -newRotX * deltaRot ); 
				scene.camera.setRotY( -newRotY * deltaRot ); 
				
			}else {
				
				scene.camera.setLookat( null );
				scene.camera.setDLocX( newRotY * 0.005 ); 
				scene.camera.setDLocY( -newRotX * 0.005 ); 
			}
		}
		
	}
	
		
	// -- camera control (TODO)
	function mouselook(){
		if(mouseovercanvas){
			var mousepos=mouse.getMousePosition();
			mousepos.x=mousepos.x-document.getElementById("container").offsetLeft;
			mousepos.y=mousepos.y-document.getElementById("container").offsetTop;
			var camera=scene.camera;
			camerarot=camera.getRotation();
			inc=(mousepos.y-(document.getElementById('canvas').offsetHeight/2))/500;
	//		var trans=camera.getRotMatrix().x([0,0,-1,1]);
			var trans=GLGE.mulMat4Vec4(camera.getRotMatrix(),[0,0,-1,1]);
			var mag=Math.pow(Math.pow(trans[0],2)+Math.pow(trans[1],2),0.5);
			trans[0]=trans[0]/mag;
			trans[1]=trans[1]/mag;
			camera.setRotX(1.56-trans[1]*inc);
			camera.setRotZ(-trans[0]*inc);
			var width=document.getElementById('canvas').offsetWidth;
			if(mousepos.x<width*0.3){
				var turn=Math.pow((mousepos.x-width*0.3)/(width*0.3),2)*0.005*(now-lasttime);
				camera.setRotY(camerarot.y+turn);
			}
			if(mousepos.x>width*0.7){
				var turn=Math.pow((mousepos.x-width*0.7)/(width*0.3),2)*0.005*(now-lasttime);
				camera.setRotY(camerarot.y-turn);
			}
		}
	}
	
	
	// -- reset camera
	$('#resetcamera').click(function resetcamera(){
		scene.camera.setDRot(0, 0, 0);
		scene.camera.setLoc(0, 0, 1000);
	});
	
	// -- bind collada import
	$('#import').click( function(){
		importCollada( $('#importUrl').val() );
	});
	
	// -- show upload area
	var flag = true;
	$('#showupload').click(function(){
		if (flag) {

			if ( hoverobj )
			{
				unpickObject();
			}


			$('.animate').animate({
					top: ANIMATE_START_POS
				}, 100, function(){
					
					$('#upload').show(10, function(){
						$(this).animate({top:ANIMATE_END_POS}, 150);
					});
					
				});
			
		}
		else {
			
			$('#upload').animate({
				top: ANIMATE_START_POS
			}, 150);
			
		}
		flag = !flag;
	})
	
	///////////////////////////			
	// -- the rendering loop
	///////////////////////////
	var now;
	var lastetime = 0;
	function render() {
		now=parseInt(new Date().getTime());
		//mouselook();
		renderer.render();
		lasttime=now;
	}

	// -- render each millisecond
	setInterval(render, 1);
	
	
}

// -- load the xml containing the scene data
doc.load("level.xml");