/**
 * Path 1 
 * Gets the model inverse matrix to transform the model within the world
 */
GLGE.Placeable.prototype.getInverseModelMatrix=function(){
	if(!this.matrix){
		this.getModelMatrix();
	}
	if(!this.invmatrix){
		this.invmatrix=GLGE.inverseMat4(this.matrix);

//		Report this bug to the dev
//		this.invmatrix=GLGE.transposeMat4(this.matrix);

	}
	return this.invmatrix;
}