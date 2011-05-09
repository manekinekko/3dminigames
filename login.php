<?php

	require_once('bin/includes/global.fn.php');
	require_once('bin/includes/Session.class.php');

	if ( $session->ok() ) redirect( 'index.php' );

	$_SESSION['error'] = "";
	if ( isset($_POST['submit-login']) )
	{

		extract($_POST);

		if ( ! $session->login( $login, $password ) )
		{
			$_SESSION['error'] = "Wrong credentials!";
		}
		else 
		{
		  redirect( 'index.php' );
		}

	}

?>
<!DOCTYPE html> 
<html lang="en"> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
		<title>3DWIGS</title>
		<link rel="stylesheet" type="text/css" href="assets/css/m3d_style.css" media="screen" /> 
		<link rel="stylesheet" type="text/css" href="assets/css/m3d_login.css" media="screen" /> 
	</head> 
		<body>
			<form id="login" method="post" action=""> 
				<h1>Login to your 3DWIGS account</h1> 
				<?php if ( $_SESSION['error'] != "" ) echo '<p>' . $_SESSION['error'] . '</p>'; ?>
				<p> 
					<label for="login">Login</label> 
					<input id="login" name="login" type="text" /> 
				</p> 
				<p> 
					<label for="password">Password</label> 
					<input id="password" name="password" type="password" /> 
				</p>
				<p>
					<input type="submit" name="submit-login" value="login" id="submit-login"  />
					<p>
					<b><u>Demo account</u> : </b><i>DemoUser</i> / <i>demo</i>
					</p>
				</p>
		</form>
	</body> 

</html>
