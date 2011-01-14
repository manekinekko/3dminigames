tree grammar LowgTree;

options {
    tokenVocab = Lowg;
    ASTLabelType = CommonTree;
}

game 	returns[Codes c] @init{ c = null;}: ^(GAME rs = resourcesSets  e = entities{c = new Codes(e,rs);});
	   


/* REFRESH LOOP */ 

refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE DP signalSets)*;
	

mouseCommands : (typeofclick DP signalSets)*;

signalSets : signal+;

signal : ID;

typeofclick : LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP 	;









/* RESOURCES */

resourcesSets returns [Code c] @init{ c =new ConcreteCode();}: ^(RESOURCES 	

			(r = resource{ 
				c.append(r);
			})+);
 

resource returns [Inst ijs]
	@init{ijs = null; }
		:^(RESOURCE 
			n = ID 
			i = initNumValue
		{
			ijs = new DecafJS(n.getText() , i);	   

		}

	);


 
initNumValue returns[String s]
	@init{s = null;}		: n = INT {
		s = new String(n.getText());
	  }
	| 

           f = FLOAT
	{
		s = new String(f.getText());


	}
	;

initValue returns[String s]
	@init{s = null;}		: inv = initNumValue {
		s = inv;
	  }
	| 

           st = STRING
	{
		s = new String(st.getText());


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

		cjs = new ClassJS(i.getText() , new ArrayList() , pms); 
	}
	

	);

parameters returns [List<AffJS> l] @init{l = new ArrayList<AffJS>();}: ^(PARAMS id1 = POSX f1 = initNumValue id2 = POSY f2 = initNumValue  id3 = POSZ f3 = initNumValue pl = paramlist
		{

			l.add(new AffJS(id1.getText() , f1));
			l.add(new AffJS(id2.getText() , f2));
			l.add(new AffJS(id3.getText() , f3));
			l.addAll(pl);

		 


		}


		);

paramlist returns [List<AffJS> l] @init{l = new ArrayList<AffJS>();}:^(PARAMLIST (id = ID v = initValue
		{l.add(new AffJS(id.getText() , v));})*)
			
	
	;





