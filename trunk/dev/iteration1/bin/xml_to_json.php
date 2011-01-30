<?php
    header('Content-Type: text/javascript; charset=utf8');
   
    $file = isset($_POST['filename']) ? $_POST['filename'] : '';
    
    if ( $file === '' || !file_exists($file) ) exit('You can not access this file directly!');
    
    $arr = simplexml_load_file($file);
    
    if ( is_object($arr) ){
    	
	    $arr = array('attributes' => $arr);
	    echo json_encode($arr);
	    exit();
	    
    }
    else {
    	var_dump($arr);
    	exit('Could not parse '.$file);
    }
    
    
    
?>