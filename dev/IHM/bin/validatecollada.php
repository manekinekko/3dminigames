<?php

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