<?php

require_once('config.php');

$scenario = isset($_POST['s']) && !empty($_POST['s']) ? $_POST['s'] : false;
$name = isset($_POST['n']) && !empty($_POST['n']) ? $_POST['n'] : false;

if ($scenario != false){
	
	$file = TMP_DIR.'/'.$name.'.m3d';
	
	file_put_contents($file, $scenario);
	
	header('Content-Type:text/javascript');
	echo json_encode(array('s'=>file_get_contents($file)));
	
}
else {
	echo '<pre>'; echo shell_exec('java -splash:dae/images/glgelogo.png'); echo '</pre>';
}

?>