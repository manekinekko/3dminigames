<?php
/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file bin/compiler.php
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/bin/compiler.php
 * @projectDescription This script runs the compiler.
 */
require_once('config.php');

$scenario = isset($_POST['s']) && !empty($_POST['s']) ? $_POST['s'] : false;
$name = isset($_POST['n']) && !empty($_POST['n']) ? $_POST['n'] : false;

if ($scenario != false){
	
	$file = TMP_DIR.'/'.$name.'.m3d';
	
	file_put_contents($file, $scenario);
	
	header('Content-Type:text/javascript');
	echo json_encode(array('s'=>file_get_contents($file)));
	shell_exec('java -jar  3dwigs.jar >> ../u/demoUser/DemoGame/assets/js/edwigs-game.js');
}
else {
	echo '<pre>'; echo shell_exec('java -splash:dae/images/glgelogo.png'); echo '</pre>';
}

?>