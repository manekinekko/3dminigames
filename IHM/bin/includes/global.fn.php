<?php

if( ! function_exists('redirect') )
{
	function redirect( $str )
	{
		header( 'location: ' . $str );
	}
}

?>