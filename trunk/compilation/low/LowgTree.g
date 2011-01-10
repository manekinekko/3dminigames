tree grammar LowgTree;

options {
    tokenVocab = Lowg;
    ASTLabelType = CommonTree;
}

game 	returns[Codes c] @init{ c = null;}: ^(GAME rs = resourcesSets  e = entities{c = new Codes(e,rs);});
	   
/* RESOURCES */

resourcesSets returns [Code c] @init{ c =new ConcreteCode();}: ^(RESOURCES (r = resource{ c.append(r);})+);
 

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
	@init{s = null;}		: n = INT {
		s = new String(n.getText());
	  }
	| 

           f = FLOAT
	{
		s = new String(f.getText());


	}


	;


/* ENTITIES */

entities returns [Code c] @init{c = new ConcreteCode();}: ^(OBJS (ob = object
		{
			c.append(ob);	
		}
	)+
	);


object returns [ClassJS cjs] @init{cjs = null; }: ^(OBJ i = ID pms = parameters
	{
		List<AffJS> l= new ArrayList();
		l.add(pms);		
		cjs = new ClassJS(i.getText() , new ArrayList() , l); 
	}
	

	);

parameters returns [AffJS aff] @init{aff=null;}: ^(PARAMS id = FRICTIONCOEF  f = FLOAT
		{
			aff = new AffJS(id.getText() , f.getText());
		}


		);





