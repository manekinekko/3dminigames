<?php
/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file bin/config.php
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/bin/config.php
 * @projectDescription This script uses the config.xml file and defines a configuration constantes
 */
// change to E_NONE on production !!
error_reporting(E_ALL);

define('DS', DIRECTORY_SEPARATOR);
define('APPPATH', str_replace('bin', '', dirname(__FILE__)));
define('CONFIG_FILE', APPPATH . DS . 'config.xml');
$config_file = simplexml_load_file(CONFIG_FILE);

if($config_file) {

	// define constantes below
	$arr = $config_file->xpath('/m3d/config/item[contains(name,"tmp_dir")]/url');
	define('TMP_DIR', APPPATH . DS . $arr[0]);
	
	$version = $config_file->xpath('/m3d/version');
	define('VERSION', $version[0][0]);
	define('USER_DIR', APPPATH . DS . 'u');
	define('TEMPLATE_ZIP', USER_DIR . DS . 'Game_Template_v1');
	define('COLLADA_DIR', APPPATH . DS . 'assets' . DS . 'dae');
	// ...

} else {
	exit('Please check that "/config.xml" exists  and is a valid XML file!');
}
?>