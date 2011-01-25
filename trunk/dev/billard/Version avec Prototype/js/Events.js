// WINDOW EVENTS
var mousePos = new Vector(0,0);  
var down;

//mise à jour de la position du canvas dans la page web
function setPosition()
{	
    var pos={'l':0,'t':0};
    var tmp=$("canvas");
   
    // on procède de parent en parent car IE fonctionne comme ça
    // (les autres donnent directement la position par rapport à la page)   
    do {
        pos.l += tmp.offsetLeft;
        tmp = tmp.offsetParent;
    } while( tmp !== null );
    tmp=$("canvas");
    do {
        pos.t += tmp.offsetTop;
        tmp = tmp.offsetParent;
    } while( tmp !== null );  
    canvasminx=pos.l;
	canvasminy=pos.t;	
}

//renvoie le vecteur position de la souris.
function mousePosition(e) 
{	 
	 if (!e) var e = window.event;
	 if (e.pageX || e.pageY){
		 mousePos.x = e.pageX-canvasminx-tableminx;
		 mousePos.y = e.pageY-canvasminy-tableminy;
	 }
	 else if (e.clientX || e.clientY){
		mousePos.x = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft-canvasminx-tableminx;
		mousePos.y = e.clientY + document.body.scrollTop + document.documentElement.scrollTop-canvasminy-tableminy;
	 }		 
}
