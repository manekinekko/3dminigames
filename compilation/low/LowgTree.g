tree grammar LowgTree;

options {
    tokenVocab = Lowg;
    ASTLabelType = CommonTree;
}



game[ClassTab ct] returns[Codes c] @init{c = null;}: ^(GAME e = entities[ct] camera refreshLoop eventManager rs = resourcesSets  {c = new Codes(e,rs);});
	   


/* ENTITIES */

entities [ClassTab ct] returns [Code c] @init{c = new ConcreteCode();}: ^(OBJS (ob = object[ct]
		{
			c.append(ob);	
		}
	)+
	{
		for(java.util.Iterator<String> it = ct.getIterator(); it.hasNext(); ){
			String tmp = it.next();
			c.append(new DecafJS("_" + tmp , new NewDec(tmp).getCode()));
		}

	}

	);


object [ClassTab ct] returns [ClassJS cjs] @init{cjs = null; }: ^(OBJ i = ID pms = paramlist
	{
		String id = i.getText();
		if (!ct.check(id)){ ct.add(id);}		
		cjs = new ClassJS(i.getText() , new ArrayList<String>() , pms); 	
			
	}
	

	);

paramlist returns [List<AffJS> l] @init{l = new ArrayList<AffJS>();}: ^(PARAMLIST (p = param
		{
			l.add(p);	 
		} )+


		);

param returns [AffJS aff] @init{aff = null;}:^(PARAM id = ID v = initValue
		{aff = new AffJS(id.getText() , v);})
			
	
	;


/* CAMERA */

camera : CAMERA ID AD position AF;

position : POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG ;

triplet : initNumValue initNumValue initNumValue ;
 





/* REFRESH LOOP */ 

refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF;

keyboardCommands : (KEYSTROKE DP signalSets)(VIRG KEYSTROKE DP signalSets)*;
	

mouseCommands : (typeofclick DP signalSets)*;

signalSets : signal+;

signal : ID;

typeofclick : LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP 	;



/* EVENT MANAGER */


eventManager : signal (VIRG signal)* ARROW instructions  ( signal(VIRG signal)* ARROW instructions  )* ;
	
instructions :  resourcePath APPLY PG applyExpression PD PTVIRG | conceptInstruction PTVIRG;

resourcePath : (ID | ID PT ID);

applyExpression : arithmeticOperator initNumValue;

arithmeticOperator : PLUS | MOINS | MULT  |DIV | MOD;

conceptInstruction : GAMEOVER | PAUSE | NEWGAME | SAVEGAME;





/* RESOURCES */

resourcesSets returns [Code c] @init{ c =new ConcreteCode();}: ^(RESOURCES 	

			(r = resource{ 
				c.append(r);
			})*);
 

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







