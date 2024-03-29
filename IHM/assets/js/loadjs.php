<?php

/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/loadjs.php
 * @projectDescription This file combines all js files in one single js gzipped js file!
 */

ob_start('ob_gzhandler');
header('Content-Type: text/javascript; charset=utf-8');
header('Expires: '.gmdate("D, d M Y H:i:s", time() + 3600*24*30).' GMT'); // 1 month

$files = array(
				'lib/jquery.min.js',
				'lib/jquery-ui.min.js',
				'lib/modernizr.min.js',
				'lib/fileuploader.js',
				'lib/json.min.js',
				'lib/codepress/codepress.js',

/*
				'lib/glge_v0.5.2/glge_math.js',
				'lib/glge_v0.5.2/glge.js',
				'lib/glge_v0.5.2/glge_collada.js',
				'lib/glge_v0.5.2/glge_input.js',
				'lib/glge_v0.5.2/patches/glge.js',
				'lib/glge_v0.5.2/patches/glge_collada.js',
/**/
				'lib/glge_v0.8/glge.js',
/**/				
				/* Please in this order */
				'm3d_init.js',
				'm3d_config.js',
				'm3d_glge.js',
				'm3d_gui.js',
				
				/* and the other scripts */
				'm3d_common.js',
				'm3d_editor.js',
				'm3d_upload.js',
				'm3d_events.js'
		);

// this is a hack to choose between the LocalStorage way and the IndexedBD one !
if ( isset($_GET['db'])) {
	$files[] = 'm3d_db.js';
}
else {
	$files[] = 'm3d_localstorage.js';
}


foreach( $files as $f ){
		
	echo file_get_contents($f);
	echo "\n\n";
		
}


?>