// Classe initialisant le jeu et responsable du déroulement de la partie
var canvasminx = 480, canvasminy = 70;
var canvas = $('canvas');
var ctx = canvas.getContext('2d');
var AuTourDe=1;//le joueur entrain de jouer
var couleurJoueur1=0;//initialisé lorsque la premiere boule est entrée (0=non initialisé,1=jaune,2=rouge)
var enStop=true;
var enMouvement=false;
var game;
var xJoueur1=0,xJoueur2=0;
var htm="";
var n=1;


var Game = Class.create({
	initialize: function() {
		this.table = new Table();
		this.queue = new Queue(0,0);
		this.encore1coup=false;
	},
	
	//méthode pour initialiser le jeu
	init: function() {
		this.table.initTable();
		this.triangleAnglais();	
	},
	
	//mise à jour de l'état du jeu
	update: function() {

	
		//Rafraichi l'image de la table
		ctx.clearRect(0, 0, $('canvas').width, $('canvas').height);
							
		this.table.update();
							
		//TODO (qui doit jouer etc, est ce qu'on est avec la queue, ou on doit placer la boule blanche...)
		if(this.table.isStable(nbBoules)){	
			enStop=true;
			if(!down && this.queue.vitesse == 0)			
				this.queue.direction = new Vector(this.table.boules[0].position.x-mousePos.x,this.table.boules[0].position.y-mousePos.y);				
			this.queue.tir(this.table.boules[0]);		
			if(enStop==true&&enMouvement==true){
				game.jeu();
				enMouvement=false;
			}
		}else{
			enMouvement=true;
			enStop=false;
		}
		this.queue.draw(this.table);
	},	
	
	// Type de jeu: Billard anglais
	triangleAnglais: function() {
		nbBoules = 16;
		var col=[1,2,1,1,3,2,2,1,2,1,1,2,1,2,2];	
		for (x=1;x<6;x++) {
			for (y=0;y<x;y++) {			
				this.table.boules.push(new Boule(n+1,454+x*22,260-y*24-(6-x)*(rayonBoule),col[n-1]));					
				n++;
			}
		}
	},	
	jeu: function() {
		if(couleurJoueur1==0){//determine la couleur associé au joueur celon la premiere boule rentré	 
			if(this.table.Jaune>0&&this.table.Jaune>=this.table.Rouge){
				if(AuTourDe==1)	couleurJoueur1=1;
				else couleurJoueur1=2;
				
				
			}else if(this.table.Rouge>0){
				if(AuTourDe==1)	couleurJoueur1=2;
				else couleurJoueur1=1;
			}
		}
		if(couleurJoueur1!=0){
			if(AuTourDe==1){//au joueur 1 de jouer
				if(this.table.Noir&&couleurJoueur1==1&&this.table.Jaune==7||this.table.Noir&&couleurJoueur1==2&&this.table.Rouge==7){
					textarea.value="Bravo "+joueur1.value+" vous avez gagner !";
					AuTourDe=0;
				}else if(this.table.Noir&&couleurJoueur1==1&&this.table.Jaune!=7||this.table.Noir&&couleurJoueur1==2&&this.table.Rouge!=7){
					textarea.value=joueur1.value+" vous avez perdu car la boule noir n'est plus sur le billard";
					AuTourDe=0;
				}else if(couleurJoueur1==1&&this.table.Jaune>this.table.JauneAvant&&this.table.Rouge==this.table.RougeAvant&&(!this.table.blancheTrou)||couleurJoueur1==2&&this.table.Jaune==this.table.JauneAvant&&this.table.Rouge>this.table.RougeAvant&&(!this.table.blancheTrou)){		//cas ou le joueur 1 rentre bien une de ses boules sans en entrer d'autre
					this.encore1coup=false;
				}else if(this.table.blancheTrou||premiereBouleTouche!=couleurJoueur1){
					if(premiereBouleTouche!=couleurJoueur1)textarea.value="Vous n'avez pas touché une de vos boules en premier. Deux coups pour "+joueur2.value+".";
					if(this.table.blancheTrou) textarea.value="Vous avez perdu la blanche deux coups pour "+joueur2.value+".";
					this.encore1coup=true;
					AuTourDe=2;
				}else{
					if(this.encore1coup) this.encore1coup=false;
					else AuTourDe=2;
				}		
			}else{//au joueur 2 de jouer
				if(this.table.Noir&&couleurJoueur1==2&&this.table.Jaune==7||this.table.Noir&&couleurJoueur1==1&&this.table.Rouge==7){
					textarea.value="Bravo "+joueur2.value+" vous avez gagner !";
					AuTourDe=0;
				}else if(this.table.Noir&&couleurJoueur1==2&&this.table.Jaune!=7||this.table.Noir&&couleurJoueur1==1&&this.table.Rouge!=7){
					textarea.value=joueur2.value+" vous avez perdu car la boule noir n'est plus sur le billard";
					AuTourDe=0;
				}else if(couleurJoueur1==2&&this.table.Jaune>this.table.JauneAvant&&this.table.Rouge==this.table.RougeAvant&&(!this.table.blancheTrou)||couleurJoueur1==1&&this.table.Jaune==this.table.JauneAvant&&this.table.Rouge>this.table.RougeAvant&&(!this.table.blancheTrou)){		//cas ou le joueur 1 rentre bien une de ses boules sans en entrer d'autre
					this.encore1coup=false;
				}else if(this.table.blancheTrou||couleurJoueur1==1&&premiereBouleTouche!=2||couleurJoueur1==2&&premiereBouleTouche!=1){
					if(couleurJoueur1==1&&premiereBouleTouche!=2||couleurJoueur1==2&&premiereBouleTouche!=1)textarea.value="Vous n'avez pas touché une de vos boules en premier. Deux coups pour "+joueur1.value+".";
					if(this.table.blancheTrou)textarea.value="Vous avez perdu la blanche deux coups pour "+joueur1.value+".";
					this.encore1coup=true;
					AuTourDe=1;
				}else{
					if(this.encore1coup) this.encore1coup=false;
					else AuTourDe=1;
				}
			}
			//Affichage des boules entrées
			while(couleurJoueur1==1&&this.table.Jaune>this.table.JauneAvant||couleurJoueur1==2&&this.table.Rouge>this.table.RougeAvant){
				if(couleurJoueur1==1){
					game.table.boules.push(new Boule(n+1,550+xJoueur1-rayonBoule+tableminx,rayonBoule+tableminy-90,1));
					this.table.JauneAvant++;
					nbBoules++;
				}
				if(couleurJoueur1==2){
					game.table.boules.push(new Boule(n+1,550+xJoueur1-rayonBoule+tableminx,rayonBoule+tableminy-90,2));
					this.table.RougeAvant++;
					nbBoules++;
				}
				xJoueur1+=26;
			}
			while(couleurJoueur1==2&&this.table.Jaune>this.table.JauneAvant||couleurJoueur1==1&&this.table.Rouge>this.table.RougeAvant){
				if(couleurJoueur1==2){
					game.table.boules.push(new Boule(n+1,550+xJoueur2-rayonBoule+tableminx,rayonBoule+tableminy+20,1));
					this.table.JauneAvant++;
					nbBoules++;
				}
				if(couleurJoueur1==1){
					game.table.boules.push(new Boule(n+1,550+xJoueur2-rayonBoule+tableminx,rayonBoule+tableminy+20,2));
					this.table.RougeAvant++;
					nbBoules++;
				}
				xJoueur2+=26;
			}
			premiereBouleTouche=-1;
		}else{
			if(AuTourDe==1)AuTourDe=2;
			else AuTourDe=1;
		}
		if(this.table.blancheTrou){//si la boule blanche est entre on la replace				
				this.table.boules.splice(0,0,new Boule(1,203,200,0));
				this.table.blancheTrou=false;
				++nbBoules;				
			}
	}
		
});

//NOUVELLE PARTIE
function main() {
enStop=true;
enMouvement=false;
game;
xJoueur1=0,xJoueur2=0;
htm="";
n=1;
AuTourDe=1;
textarea.value="";
setPosition();
game = new Game();
game.table.Jaune=0;
game.table.Rouge=0;
game.table.JauneAvant=0; 
game.table.RougeAvant=0;
game.table.Noir=false;
game.table.blancheTrou=false;
game.table.boules.push(new Boule(1,203,200,0)); // boule blanche pour le test
game.init();


boucle();
}

function boucle(){
		game.update();
		setTimeout("boucle()", 10);
}



