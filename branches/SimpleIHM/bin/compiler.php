<?php
/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file bin/compiler.php
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/bin/compiler.php
 * @projectDescription This script runs the compiler.
 */
require_once('config.php');
require_once('includes/global.fn.php');
require_once('includes/Session.class.php');

// default response
$response = array('s'=>500, 'error'=>'The scenario content is empty');

// get the scenario content
$scenario = isset($_POST['s']) && !empty($_POST['s']) ? $_POST['s'] : false;

if ($scenario !== false){

	// prepare the command to be executed
	$command = 'java -jar 3dwigs.jar -out "%s" "%s"';
	
	// get the extra info from the POST request
	$game_name = isset($_POST['gn']) && !empty($_POST['gn']) ? $_POST['gn'] : false;
	$ts = isset($_POST['ts']) && !empty($_POST['ts']) ? $_POST['ts'] : false;
	
	// get the user login
	$user = $session->get('login');	
	
	// prepare the tmp file
	$tmp_file = TMP_DIR. DS .$user.'-'.$game_name.'.m3d';
	
	// put the scenario content into the 
	file_put_contents($tmp_file, $scenario);
	
	// create the new user dir
	if ( ! file_exists(USER_DIR . DS . $user) ) {
		mkdir(USER_DIR. DS .$user);
	}
	else {
		$response = array('s'=>500, 'error'=>'Can not locate: '.USER_DIR. DS .$user.'');
	}
	
	// prepapre the new game dir to be created
	$new_game_dir = USER_DIR. DS .$user. DS .$game_name;

	// copy template game the user's game dir (and create it)
	if ( copy_dir(TEMPLATE_ZIP, $new_game_dir) ) {
	
		$game_file = $new_game_dir. DS .'assets'. DS .'js'. DS .'edwigs-game.js';	
		
		if ( file_exists($game_file) ) {
			
			// run the compiler command
			$x = shell_exec(sprintf($command, $game_file, $tmp_file));
			//var_dump($command, $game_file, $tmp_file);
			if ( $x === NULL  ) {
				$response = array('s'=>200, 'url'=>'u/' . $user.'/'.$game_name.'/index.html');
			}
			else {
				$explod = explode("\n", $x); // use "" not '' !!
				$line = $explod[0];
				$msg = htmlentities($explod[1]);
				$err = array('message'=>$msg, 'line'=>$line);
				$response = array('s'=>500, 'error'=>$err);
			}
		
		}
		else {
			$response = array('s'=>500, 'error'=>'Can not locate: '.$game_file.'');
		}
		

	}
	else {
		$response = array('s'=>500, 'error'=>'Can not create game directory: '.$new_game_dir.'');
	}
	
}
else {
	$response = array('s'=>500, 'error'=>'Please use the 3DWIGS UI to execute this file!');
}

// output print
header('Content-Type:text/javascript');
echo json_encode($response);

?>