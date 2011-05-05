<?php
/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file bin/validatecollada.php
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/bin/validatecollada.php
 * @projectDescription This script checks and *tries* to validate the collada files. This script is intended to be used internally!!
 */
define('PATH', str_replace('bin', '', dirname(__FILE__)));
define('BIN', PATH.'bin');
define('DAE', PATH.'assets\dae\presets\\');

$xmllint = BIN."/libxml2-2.7.7.win32/bin/xmllint.exe";
$options = " --schema http://www.khronos.org/files/collada_schema_1_4 ";
$dae = DAE."/modele_jeu_lapin/";

if ( ! file_exists($xmllint) )
{
	exit($xmllint.' was not found');
}

foreach( glob(DAE.'/*.dae') as $dae )
{
	echo shell_exec($xmllint.$options.DAE.$dae);
}

?>