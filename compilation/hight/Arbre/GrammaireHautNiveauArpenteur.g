tree grammar vslTree;

options {
    tokenVocab=GrammaireHautNiveau;
    ASTLabelType=CommonTree;
}

//@header {}

//@members {}

/*------------------------------------------------------------------
 * TREE RULES
 *------------------------------------------------------------------*/
 
 game :    ^(GAME gameData? newType* init+ definition* commande* reglesJeu* iaBasique*);
 
 
 ///////////////////////////// ( informations about the game)  //////////////////////////////////
 
 
 gameData : ^(GAMEATTRIBUT attributGame+);
 
 attributGame :  ^(GRAVITY NUMBER) |^(GRAVITY NUMBER NUMBER NUMBER) | ^(SCORE NUMBER); //Possible erreur
 
 
 //////////////////////////// ( Inheritance )  /////////////////////////////
 
 newType : ^(TYPE ident subType+);
 
 subType : -> ^(ident)| ^(typeObjet);
 
 //////////////////////////// ( Initializations )  /////////////////////////////
 
 init : ^(INITIS declarationObjet) | ^(INITHAS affectationObjet);
 
 declarationObjet : ^(DEC typeEntity entityMode)   // interaction is neutral by default
  |^(LIST (operation? ident)*)
  | ^(CAM PER view) | 'free' ->^(CAM FREE))?
  | ^(MEDIA ONCE))? 						 // sound, music or video played in loop or once
  | ^(IN ident)
  ;
  
 typeEntity :
	^(ident)|^(typeObjet3D)
	;
  
entityMode:
	^(PLAYER)
  |	^(interaction dupli)
  |	^(dupli)
  ;

dupli :
	^(DUPLICABLE)|	
	;
view :
	^(FI)
	|^(THI)
	;
	
interaction :
   ^(ALLY)
  |^(ENEMY)
  |^(NEUTRAL)
  ;
 
affectationObjet :
  ^( AFFECTATION ident valAggregation) 
  |^( AFFECTATION attribut valAffectation)
  |^( AFFECTATION typeCoordonnees coordonnees)
  |^( AFFECTATION attributListeOuObjet ident)
  |^( AFFECTATION attributTps operation uniteTps);
  ;
 
valAggregation :
	^(operation uniteTps?)
	|^(ident)
	; 
 
 valAffectation : 
	operation 
	|^(STRING)
	|^(BOOL)
	;