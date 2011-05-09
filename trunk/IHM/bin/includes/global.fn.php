<?php
/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file bin/includes/global.fn.php
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/bin/includes/bin/includes/global.fn.php
 * @projectDescription This PHP script contains extra functions used by the application
 */
 
if( ! function_exists('redirect') )
{
	function redirect( $str )
	{
		header( 'location: ' . $str );
	}
}

if( ! function_exists('copy_dir') )
{

	function copy_dir($src, $dst) { 
		$dir = opendir($src); 
		
		if ( !file_exists($dst) ) {
			if ( ! mkdir($dst) ) {
				return false;
			}
		}
		
		while(false !== ( $file = readdir($dir)) ) { 
			if (( $file != '.' ) && ( $file != '..' ) ) { 
				if ( is_dir($src . '/' . $file) ) { 
					copy_dir($src . '/' . $file,$dst . '/' . $file); 
				} 
				else { 
					if ( ! @copy($src . '/' . $file, $dst . '/' . $file) ){
						return false;
					} 
				} 
			} 
		} 
		closedir($dir);
		return true; 
	} 

}
?>