<?php
	
	// change to E_NONE on production !!
	error_reporting(E_ALL);
	
	define('APPPATH', str_replace('bin', '', dirname(__FILE__)));
	define('CONFIG_FILE', APPPATH.'/config.xml');
    $config_file = simplexml_load_file(CONFIG_FILE);		
	
	if ( $config_file ){
		
		// define constantes below
		$arr = $config_file->xpath('/m3d/config/item[contains(name,"tmp_dir")]/url');
		define('TMP_DIR', APPPATH.'/'.$arr[0]);
		// ...
		
		
	}
	else {
		exit('Please check that "config.xml" is a valid XML file!');
	}
	
?>