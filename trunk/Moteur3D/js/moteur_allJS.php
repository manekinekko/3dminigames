<?php

/**
 * @author Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * This file combines all js files in one single js gzipped js file!
 */

ob_start('ob_gzhandler');
header('Content-Type: text/javascript; charset=utf-8');
header('Expires: '.gmdate("D, d M Y H:i:s", time() + 3600*24*30).' GMT'); // 1 month

$files = array(
                                
                                '../lib/glge_v0.8/glge-compiled-min.js',
   
                                /* Please in this order */
                                'moteur3d.js',
								'moteur_tools.js',
								'moteur_management.js',
								'moteur_collision.js',
								'moteur_movement.js',
								'moteur_camera.js',
								'moteur_debugger.js',
								'moteur_keyboard.js',
                );

foreach( $files as $f ){
                
        echo file_get_contents($f);
        echo "\n\n";
                
}


?>