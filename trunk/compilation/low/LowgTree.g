tree grammar LowgTree;

options {
    tokenVocab = Lowg;
    ASTLabelType = CommonTree;
}

game 	returns[Code c] @init{ c = new CodeResources();}: ^(GAME rs = resourcesSets { c.append(rs); } entities);
	   
/* RESOURCES */

resourcesSets returns [Code c] @init{ c =new CodeResources();}: ^(RESOURCES (r = resource{ c.append(r);})+);
 

resource returns [InstJS ijs]
	@init{ijs = null; }
		:^(RESOURCE 
			n = ID 
			i = initValue
		{
			ijs = new DecafJS(n.getText() , i);	   

		}

	);


 
initValue returns[String s]
	@init{s = null;}		: ^(VAL n = INT {
		s = new String(n.getText());
	  })
	| 

           ^(VAL f = FLOAT
	{
		s = new String(f.getText());


	})


	;


/* ENTITIES */

entities : object+;


object : OBJECT AFF ID parameters PTVIRG ;

parameters : FRICTIONCOEF AFF FLOAT;





