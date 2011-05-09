<?php

	require_once('bin/includes/global.fn.php');
	require_once('bin/includes/Session.class.php');

	$session->logout();
	redirect('login.php');

?>
