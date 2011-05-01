<?php
	
	require_once('bin/includes/global.fn.php');
	require_once('bin/includes/Session.class.php');
	
	if( $session->ok() == false )
	{
		redirect('login.php');
	}
	
?>
<!DOCTYPE html>
<html>
	<head>
		<title id="title">3DWIGS - 3D Web Interactive Game Studio</title>
		<link rel="icon" type="image/gif" href="assets/css/img/ajax-loader.gif">
		<!-- start: css parsing -->
		<link href="assets/css/jquery-ui.css" rel="stylesheet" type="text/css"/>
		<link href="assets/css/m3d_style.css" rel='stylesheet' type='text/css' media="all" />
		<!-- end: css parsing -->
	</head>
	<body onload="M3D.Upload.AJAXUpload(); new M3D.Upload.uploader('upload-model', 'status', M3D.Config.uploader, null, doc);">
		
		<div id="modal" ></div>
				
		<div id="m3d-ui">	
			
			<!-- start: canvas container -->
			<div id="container" class="box-shadow">
				<div id="loading-message">Loading 3DWIGS UI. Please wait...</div>
				<div id="loading"></div>
				<div id="title" >
					<h1><span>3D</span>WIGS</h1>
					<span class="def">3D Web Interactive Game Studio</span>
				</div>
				
				<div class="float-right" id="canvas-container">
					<canvas id="canvas" width="800" height="500"></canvas>
					<div id="canvas-border" ></div>
					<div id="tools-panel" >
						<span class="cursor camera-rotate" title="Rotate Camera">&nbsp;</span >
						<span class="cursor camera-move" title="Move Camera">&nbsp;</span>
						<span class="cursor camera-zoom" title="Zoom Camera">&nbsp;</span>
						<span class="cursor model-move" title="Move Mdel">&nbsp;</span>
						<span class="cursor model-rotate" title="Rotate Model">&nbsp;</span>
						<span class="cursor grid-toggle" title="Show/Hide Grid">&nbsp;</span>
						<span class="cursor camera-position" title="Get Camera Position">&nbsp;</span>
					</div>
					
				</div>
				
				<!-- start: editor -->
				<div id="editor">
					<textarea id="edwigs" class="codepress wrap edwigs"></textarea>
					<div id="attributes-panel">
						<div id="attributes-panel-body"></div>
						<div id="attributes-panel-footer"></div>
					</div>
				</div>
				<!-- end: editor -->
				
				<!-- start: menu -->
				<div id="viewmenu">
					<ul>
		
						<li>
							<select id="select-model">
									<option value="">--select model--</option>
							</select>
						</li>
				
						<li class="separator"></li>
	
						<li>
							<select style="width:100px;" id="importUrl" name="importUrl">
								<optgroup id="myModels" label="My models">
								</optgroup>
								<optgroup label="Free models">
									<option value="assets/dae/free/duck.dae" selected="true">Duck</option>
									<option value="assets/dae/free/f.dae" >Girl</option>
									<option value="assets/dae/free/avion.dae" >Plane</option>
								</optgroup>
								<optgroup label="Presets">
									<option value="assets/dae/presets/cube.dae">Cube</option>
									<option value="assets/dae/presets/sphere.dae">Sphere</option>
									<option value="assets/dae/presets/cylinder.dae">Cylinder</option>
								</optgroup>
							</select>
						</li>
	
						<li>
							<div id="import" class="button" >Add selected model</div>
						</li>

						<li class="separator"></li>

						<li>
							<div id="upload" class="button">Upload new model</div>
						</li>

						<li class="separator"></li>

						<li>
							<div id="toggle-attributes" class="button" >Preset Attributes</div>
						</li>
						
						<li class="separator"></li>

						<li>
							<div id="create-game" class="button">Create My Game</div>
						</li>
						<li>
							<div id="clear-canvas" class="button" >Clear Canvas</div>
						</li>
	
						<li style="float:right">
							<div id="logout" class="button">Logout</div>
						</li>

					</ul>
				</div>
				<!-- end: menu -->
				
				<!-- start: bottom info panel -->
				<div id="info-bottom" class="animate">
					<div class="column">
						<table summary="3D Model values">
							<thead>
								<tr>
									<th></th>
									<th>X</th>
									<th>Y</th>
									<th>Z</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Position</td>
									<td><input type="number" name="posX" id="posX" value="" placeholder="#" min="-10000" max="10000" step="0.0001"/></td>
									<td><input type="number" name="posY" id="posY" value="" placeholder="#" min="-10000" max="10000" step="0.0001"/></td>
									<td><input type="number" name="posZ" id="posZ" value="" placeholder="#" min="-10000" max="10000" step="0.0001"/></td>
									<td></td>
								</tr>
								<tr>
									<td>Rotation</td>
									<td><input type="number" name="rotX" id="rotX" value="" placeholder="#" min="0" max="6.2832" step="0.0001"/></td>
									<td><input type="number" name="rotY" id="rotY" value="" placeholder="#" min="0" max="6.2832" step="0.0001"/></td>
									<td><input type="number" name="rotZ" id="rotZ" value="" placeholder="#" min="0" max="6.2832" step="0.0001"/></td>
									<td></td>
								</tr>
								<tr>
									<td>Scale</td>
									<td><input type="number" name="scaleX" id="scaleX" value="" placeholder="#" min="0.001" max="1" step="0.0001"/></td>
									<td><input type="number" name="scaleY" id="scaleY" value="" placeholder="#" min="0.001" max="1" step="0.0001"/></td>
									<td><input type="number" name="scaleZ" id="scaleZ" value="" placeholder="#" min="0.001" max="1" step="0.0001"/></td>
									<td><input type="checkbox" name="scaleLock" id="scaleLock" checked="true"/>Lock Scale</td>
								</tr>
								<tr>
									<td>Bounding Box</td>
									<td><input type="number" name="bboxX" id="bboxX" value="" placeholder="#" min="0.0001" max="10000" step="0.0001"/></td>
									<td><input type="number" name="bboxY" id="bboxY" value="" placeholder="#" min="0.0001" max="10000" step="0.0001"/></td>
									<td><input type="number" name="bboxZ" id="bboxZ" value="" placeholder="#" min="0.0001" max="10000" step="0.0001"/></td>
									<td><input type="checkbox" name="switchBbox" id="switchBbox" />Show/Hide</td>
								</tr>
							</tbody>
						</table>
					</div>
					<br class="clear"/>
				</div>
				<!-- end: right info panel -->
				
				
			</div>
			<!-- end: canvas container -->

			
			<!-- start: windows container -->
			<div id="windows-container">
				
				<div id="status" class="ui-state-highlight"></div>
				
				<div id="entity-info" class="window box-shadow closed">
					<h2>Entity information</h2>
					<label for="name">Name<em>*</em></label>
					<input type="text" class="alphanumeric required" name="name" id="name" value="" placeholder="Entity name" />
					<br/>
					<div id="window-buttons">
						<input type="button" class="cancel" value="Cancel" name="cancel">
						<input type="button" class="validate" id="save-entity-info" value="Save" name="save" />
					</div>
				</div>
				
				<div id="game-info" class="window box-shadow closed">
					<h2>Welcome <?php echo $session->get('login'); ?>!</h2>
					<p>Please create your game.</p>
					<label for="game-name">Game name<em>*</em></label>
					<input type="text" class="alphanumeric required" name="game-name" id="game-name" value="" placeholder="Game name" />
					<br/>
					<div id="window-buttons">
						<input type="button" class="validate" id="save-game-info" value="Save" name="save" />
					</div>
				</div>
				
				
				<div id="help" class="window box-shadow closed">
					<h2>Help</h2>
					<div>
						&#187;Use mouse wheel to zoom in/out<br/>
						&#187;Use Shift key to rotate a model around Y-axis<br/>
						&#187;Use Alt key to rotate a model around X-axis<br/>
						&#187;Use mouse drag + X/Y/Z keys to move a model along with the X/Y/Z-axis<br/>
						&#187;Use mouse wheel + S key to scale a model<br/> 
						<i><strong>Hint&nbsp;</strong>You can import your collada models easily by 
						draging and dropping them onto onto the canvas!</i>
					</div>
					<div id="window-buttons">
						<input type="button" class="cancel" value="OK" name="cancel">
					</div>
				</div>
				
				<div id="confirmation-clear" class="window box-shadow closed">
					<h2>Confirmation!</h2>
					<div>Do you really want to clear the canvas?<br/>
					<b style="color:red;">NOTE: you will loose all your unsaved work!</b>
					</div>
					<div id="window-buttons">
						<input type="button" class="validate" value="clear content" name="confirm-clear-canvas" id="confirm-clear-canvas">
						<input type="button" class="cancel" value="NO" name="cancel">
					</div>
				</div>
				
				<div id="confirmation-load" class="window box-shadow closed">
					<h2>Welcome back, <?php echo $session->get('login'); ?>!</h2>
					<div>Do you want to load your previous content ?<br/>
					<b style="color:red;">NOTE: by clicking NO your previous content will be <u>lost</u>!</b>
					</div>
					<div id="window-buttons">
						<input type="button" class="validate" value="load" name="confirm-load-content" id="confirm-load-content">
						<input type="button" class="cancel" value="NO" name="cancel" id="confirm-no-load-content">
					</div>
				</div>
				
				<div id="upload-form" class="window box-shadow closed"  >
					<h2>Upload form</h2>
					<p class="text-center">
						Click on the area below or just drag &amp; drop your file to upload your model</i>
					</p>
					<div id="upload-model" class="pointer"></div>
					<br />
					<div id="window-buttons">
						<input type="button" class="cancel" value="Cancel" name="cancel">
					</div>
				</div>
				
				<div id="about" class="window box-shadow closed">
					<h2>About</h2>
					<p>
						<strong>3DWIGS</strong> - 3D Web Interactive Game Studio is a new way of creating 3D mini-games for the web.<br/>
					</p>
					<p>
						<strong>Author: </strong>Doctor R&eacute;mi Cozot.
						<strong>Developers: </strong>Berlon Antoine, Bouzillard Jer&ocirc;me, Chegham Wassim, Clergeau Thomas, Faghihi Afshin,
						Guichaoua Mathieu, Israel Quentin, Kien Emeric, Le Corronc Thibault, Le Galludec Benjamin,
						Le Normand Erik, Lubecki Aur&eacute;lien, Marginier David, Sanvoisin Aur&eacute;lien, Tolba Mohamed Amine,
						Weinzaepfel Philippe &amp; Zadith Ludovic.
					</p>
					<div id="window-buttons">
						<input type="button" class="cancel" value="OK" name="cancel">
						<input type="button" value="Help" id="showhelp" name="showhelp">
					</div>
				</div>
				
			</div>
			
			<div id="slider"></div>
			<!-- end: windows container -->

		</div>
		
		<!-- start: js parsing -->
		<script type="text/javascript" src="assets/js/loadjs.php"></script>
		<script>
		M3D.Config.username = "<?php echo $session->get('login'); ?>";
		</script>
		<!-- end: js parsing -->

	</body>
</html>