/**
 * Moteur3d de 3DWIGS: moteur_debugger.js
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.23
 */

(function(M3D){

	// pour le débug des bounding box
	var red=doc.getElement( "red" );
	var line=(new GLGE.Object).setDrawType(GLGE.DRAW_LINES);
	var positions = [];
	
	drawBB = function(obj){ 
        var pos = [obj.posX, obj.posY, obj.posZ];
        var bbox = tabObject[obj.id].getBoundingVolume().getCornerPoints();
        //bas gauche devant
        positions.push(bbox[0][0]);
        positions.push(bbox[0][1]);
        positions.push(bbox[0][2]);
        //bas droite devant
        positions.push(bbox[1][0]);
        positions.push(bbox[1][1]);
        positions.push(bbox[1][2]);
        //bas gauche derriere
		positions.push(bbox[4][0]);
        positions.push(bbox[4][1]);
        positions.push(bbox[4][2]);
        //bas droite derriere
        positions.push(bbox[5][0]);
        positions.push(bbox[5][1]);
        positions.push(bbox[5][2]);
        //haut gauche devant
        positions.push(bbox[2][0]);
        positions.push(bbox[2][1]);
        positions.push(bbox[2][2]);
        //haut droite devant
        positions.push(bbox[3][0]);
        positions.push(bbox[3][1]);
        positions.push(bbox[3][2]);
        //haut gauche derriere
        positions.push(bbox[6][0]);
        positions.push(bbox[6][1]);
        positions.push(bbox[6][2]);
        //haut droite derriere
        positions.push(bbox[7][0]);
        positions.push(bbox[7][1]);
        positions.push(bbox[7][2]);
        //bas droite devant
         positions.push(bbox[1][0]);
        positions.push(bbox[1][1]);
        positions.push(bbox[1][2]);
        //bas droite derriere
        positions.push(bbox[5][0]);
        positions.push(bbox[5][1]);
        positions.push(bbox[5][2]);
        //bas gauche devant
        positions.push(bbox[0][0]);
        positions.push(bbox[0][1]);
        positions.push(bbox[0][2]);
        //bas gauche derriere
        positions.push(bbox[4][0]);
        positions.push(bbox[4][1]);
        positions.push(bbox[4][2]);
        //haut gauche devant
        positions.push(bbox[2][0]);
        positions.push(bbox[2][1]);
        positions.push(bbox[2][2]);
        //haut gauche derriere
		positions.push(bbox[6][0]);
        positions.push(bbox[6][1]);
        positions.push(bbox[6][2]);
        //haut droite devant
        positions.push(bbox[3][0]);
        positions.push(bbox[3][1]);
        positions.push(bbox[3][2]);
        //haut droite derriere
		positions.push(bbox[7][0]);
        positions.push(bbox[7][1]);
        positions.push(bbox[7][2]);
        //bas gauche devant
        positions.push(bbox[0][0]);
        positions.push(bbox[0][1]);
        positions.push(bbox[0][2]);
        //haut gauche devant
        positions.push(bbox[2][0]);
        positions.push(bbox[2][1]);
        positions.push(bbox[2][2]);
        //bas gauche derriere
		positions.push(bbox[4][0]);
        positions.push(bbox[4][1]);
        positions.push(bbox[4][2]);
        //haut gauche derriere
        positions.push(bbox[6][0]);
        positions.push(bbox[6][1]);
        positions.push(bbox[6][2]);
        //bas droite derriere
        positions.push(bbox[5][0]);
        positions.push(bbox[5][1]);
        positions.push(bbox[5][2]);
        //haut droite derriere
        positions.push(bbox[7][0]);
        positions.push(bbox[7][1]);
        positions.push(bbox[7][2]);
        //bas droite devant
        positions.push(bbox[1][0]);
        positions.push(bbox[1][1]);
        positions.push(bbox[1][2]);
        //haut droite devant
        positions.push(bbox[3][0]);
        positions.push(bbox[3][1]);
        positions.push(bbox[3][2]);
        
        line.setMesh((new GLGE.Mesh).setPositions(positions));
        line.setMaterial(red);
        line.setZtransparent(true);
        gameScene.addChild(line);
	}
	debuggerBox = function(){
		positions = [];
		gameScene.removeChild(line);
	};

})(window.M3D);