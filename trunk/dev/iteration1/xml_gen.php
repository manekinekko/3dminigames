<?php
  function genXML($data) {
	
  	//print_r($data); exit();
  	
  	$camtruc = $data['cam'];
  	$scene = $data['scene'];
  	$tabcollada = $data['colladas']; 
  	$tablight = $data['lights'];
  	
	$dom = new DomDocument;
	
	// append comment
    $glge = $dom->createComment("\nAuto generated XML level for GLGE by 3DWIGS on ". date('c', time())."\n");
    $dom->appendChild($glge);
    
    
    // append root document
    $glge = $dom->createElement("glge");
    $dom->appendChild($glge);
	
    
    // append camera
    $cam_node = $dom->createElement("camera");
	$cam_node->setAttribute("id", $camtruc['id']);
	$cam_node->setAttribute("loc_x", (float)$camtruc['loc_x']);
	$cam_node->setAttribute("loc_y", (float)$camtruc['loc_y']);
	$cam_node->setAttribute("loc_z", (float)$camtruc['loc_z']);
	$cam_node->setAttribute("rot_x", (float)$camtruc['rot_x']);
	$cam_node->setAttribute("rot_y", (float)$camtruc['rot_y']);
	$cam_node->setAttribute("rot_z", (float)$camtruc['rot_z']);
	$glge->appendChild($cam_node);
	
	
	// append the scene
	$scene_node = $dom->createElement("scene");
    $scene_node->setAttribute("id", $scene['id']);
	$scene_node->setAttribute("camera", "#".$cam_node->getAttribute('id'));


	// append collada models
	foreach( $tabcollada as $i=>$collada ){
		$col_node = $dom->createElement("collada");
		$col_node->setAttribute("id", $collada['id']);
		$col_node->setAttribute("document", $collada['document']);
		$col_node->setAttribute("loc_x", (float)$collada['loc_X']);
		$col_node->setAttribute("loc_y", (float)$collada['loc_Y']);
		$col_node->setAttribute("loc_z", (float)$collada['loc_Z']);
		$col_node->setAttribute("rot_x", (float)$collada['rot_X']);
		$col_node->setAttribute("rot_y", (float)$collada['rot_Y']);
		$col_node->setAttribute("rot_z", (float)$collada['rot_Z']);
		$col_node->setAttribute("scale", (float)$collada['scale']);
		$scene_node->appendChild($col_node);
	}



	foreach( $tablight as $i=>$light ){
		$light_node = $dom->createElement("light");
		$light_node->setAttribute("id", $light['id']);
		$light_node->setAttribute("loc_x", (float)$light['loc_X']);
		$light_node->setAttribute("loc_y", (float)$light['loc_Y']);
		$light_node->setAttribute("loc_z", (float)$light['loc_Z']);
		$light_node->setAttribute("type", $light['type']);
		$scene_node->appendChild($light_node);
	}


	$glge->appendChild($scene_node);
	
	$filename = "level-".time().".xml";
	$dom->preserveWhiteSpace = false;
	$dom->formatOutput = true;
	$dom->save($filename);
	return $filename;
}	


header('Content-Type: application/json');

$data = json_decode(stripslashes($_POST['glge']), true); // true for assoc array, 3 for depth

$name = genXML($data);
echo json_encode(array('filename'=>$name));	
?>
