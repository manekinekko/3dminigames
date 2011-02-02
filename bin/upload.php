<?php


ini_set("memory_limit","128M");
//echo ini_get("memory_limit");

// Destination folder for downloaded files
$upload_folder = '../assets/dae/custom';

// If the browser supports sendAsBinary () can use the array $ _FILES
if(count($_FILES)>0) { 

	if( move_uploaded_file( $_FILES['upload']['tmp_name'] , $upload_folder.'/'.$_FILES['upload']['name'] ) ) {
		echo 'OK';
	}
	exit();
	
} else if(isset($_GET['up'])) {
	
	// If the browser does not support sendAsBinary ()
	if(isset($_GET['base64'])) {
		$content = base64_decode(file_get_contents('php://input'));
	} else {
		$content = file_get_contents('php://input');
	}

	
	if(file_put_contents($upload_folder.'/'.$_GET['filename'], $content)) {
		echo 'OK';
	}
		
	exit();
}
?>