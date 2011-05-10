tree grammar highTree; 

options {
    tokenVocab=high;
    ASTLabelType=CommonTree;
} 
 
@header {
    package com.istic.mini3d.grammars;
    import com.istic.mini3d.Main;
    import com.istic.mini3d.code.*;
    import com.istic.mini3d.symbols.*;
    import com.istic.mini3d.lib.*;
    import com.istic.mini3d.attributes.*;
    import java.util.Iterator;
    import java.util.Hashtable;
    import java.util.Enumeration;
    import java.util.Date;
}

@members {   
    private int INT_DUPLICABLE=10;
    private Hashtable<String, String> aggreg = new Hashtable<String, String>();
    private ErrorHandler handler = ErrorHandler.getInstance();

    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        if(Main.isDebug()) {
            super.displayRecognitionError(tokenNames, e);
        }
        else {
            String msg = getErrorMessage(e, tokenNames);
            int line = ((CommonErrorNode)e.node).start.getLine();
            String word = ((CommonErrorNode)e.node).trappedException.token.getText();

            handler.add(ErrorHandler.ErrorType.FATAL, line, "Erreur sur \""+word+"\". ");
        }
    }

    public int getLine(CommonTree i) {
	return i.token.getLine();
    }
}

/*------------------------------------------------------------------
 * TREE RULES
 *------------------------------------------------------------------*/
 
game [SymbolTable st] returns [Code c]
    @init{c = new Code();}:
    ^(GAME_KW 
    gd=gameData[st]*
    {   Date d = new Date();
        c.append("/**\n* THIS FILE WAS GENERATED AUTOMATICALLY.\n* Please do not modify.\n* \n* file: edwigs-game.js\n* version: "+d.toLocaleString()+"\n*/\n\n");}
    newType[st]*
    in=initialization[st]
    {
	//st.print();
        //System.out.println(in.getCode());
        c.append(in);
        c.append("/*Definitions*/ \n");
    }
     
    (def=definition[st]
    {
	//System.out.println(def.getCode()+"\n");
        c.append(def);
    }
    )*

    com=commande[st]+
    {c.append(com);}
    reg=reglesJeu[st]+ ia=iaBasique[st]*)
    ;
	

/*------------------------------ Information about game ---------------------------------*/

gameData [SymbolTable st] returns [Code c]:
    ^(GAME_ATTRIBUT_KW attributGame_list[st]);
	
attributGame_list [SymbolTable st] returns [Code c]:
    attributGame[st]+;
	
attributGame [SymbolTable st] returns [Code c]:
	^(GRAVITY_KW FLOAT)
	| ^(GRAVITY_KW FLOAT FLOAT FLOAT)
	| ^(TURNBASED_KW ('true'|'false'))
	| ^(WORLD_KW mapType)
	| ^(GRIDSIZE_KW FLOAT)
	| ^(NAME_KW TEXTE)
	;

mapType returns [Integer i]:
    GENERIC
    | GRID
    | RIBBON
    ;

name returns [String s]:
    i=IDENT
    {s = i.getText();}
    ;
/*-------------------------- Inheritance, creation of type -------------------------------*/	
newType [SymbolTable st]
    @init{List<Model> sub = new ArrayList<Model>();} :
    ^(TYPE i=IDENT subType[st,sub]+)
    {
	String id = i.getText();
        Symbol verif = st.get(id);
	if(verif != null) {
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Type \""+id+"\" déjà déclaré.");
	} else {
	    Model[] tab = (Model[])sub.toArray(new Model[0]);
	    Model t = new Model(id, tab);
	    st.add(id, t);
	}
    }
    ;

subType [SymbolTable st, List<Model> sub] :
    i=IDENT
    {
	String id = i.getText();
	Symbol verif = st.get(id);
	if(verif == null) {
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Model \""+id+"\" non défini.");
	} else if(verif.getType() != Symbol.Type.MODEL) {
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), id+"\" n'est pas un Model.");
	} else {
	    sub.add((Model)verif);
	}
    }
    ;

initialization [SymbolTable st] returns [Code c]:
    init[st]+
    {
	Code modelCode = new Code();
	Code entitiesCode = new Code();
	Code entitiesFunCode = new Code();
	List<Entity> allEntities = st.getAllEntities();

	Iterator<Entity> it = allEntities.iterator();
	while(it.hasNext()) {
	    Entity ent = it.next();
	    Model model = null;
	    if(ent.listModels().size() > 1) {

	    } else {
	        model = ent.listModels().get(0);
	    }
	    modelCode.append(Code.genModel(model));
	    modelCode.append("\n");

	    entitiesFunCode.append(Code.genFuncEntity(ent));
	    entitiesFunCode.append("\n");

	    //entitiesCode.append(Code.genEntity(ent));
	    entitiesCode.append("\n");
	}

	c = new Code("/*Models*/\n");
	c.append(modelCode);
	c.append("\n/*Entities*/\n");
	c.append(entitiesFunCode);
	c.append(entitiesCode);
	c.append("\n");
    }
    ;

init [SymbolTable st] returns [Code c]:
    ^(INIT_IS_KW i=IDENT d=declarationObjet[st])
    {
        if(d!=null){
            String id = i.getText();
            Symbol verif = st.get(id);
            if(verif != null) {
                handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Elément \""+id+"\" déjà déclaré.");
            } else {
                int mode = d.getSecond();
	    
                Entity t = new Entity(id,d.getFirst());
                d.getFirst().toGenerate();

                if(mode == INT_DUPLICABLE)
                    t.setDuplicable();

                st.add(id,t);
            }
        }
    }
    | ^(INIT_HAS_KW ac=accesClass[st] ao=affectationObjet_list[st])
    {
        Iterator<Symbol> it = ac.iterator();
        while(it.hasNext()) {
	    Symbol s = it.next();
	    Iterator<Pair<String,AttributeValue>> ite = ao.iterator();
	    while(ite.hasNext()) {
		Pair<String,AttributeValue> p = ite.next();
		String attributeValue = p.getFirst();
                if(p.getSecond().getType()==AttributeValue.Type.AGGR){
                    boolean pl = false;
                    Entity s2 = (Entity)s;
                    List<Model> am = s2.listModels();
                    Iterator<Model> imod = am.iterator();
                    while(imod.hasNext()){
                        Model mod = imod.next();
                        if(mod.getName().equals("Player")){
                            Entity e1 = (Entity)st.get(attributeValue);
                            e1.setPlayerName(s.getName());
                            pl = true;
                            break;
                        }
                    }
                    if(!pl)
                        aggreg.put(attributeValue,s.getName());
                }else{
		    AttributeValue attr = s.getAttribute(attributeValue);
                    if(attr != null && attr.getType() != p.getSecond().getType()) {
			handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Type incompatible.");
                    }
                    s.addAttribute(p.getFirst(),p.getSecond());
                }
	    }
	}
    }
    | ^(INSERT_KW IDENT IDENT operation[st]?)
    | ^(REMOVE_KW (IDENT|operation[st]) IDENT)
    ;

// A revoir : CAMERA : si rien n'est ajoute on fait quoi ?, MEDIA pareil
declarationObjet [SymbolTable st] returns [Pair<Model, Integer> p]
    @init{d=null;s=null;}:
    ^(DEC t=typeEntity[st] (d=dupli)?)
    {
	if(d == null)
	    d=0;

	p = new Pair<Model, Integer>(t,d);
    }
    | ^(LIST_KW list_declaration[st])
    {

	//p = new Pair<Model, Integer>
    }
    | ^(CAMERA_KW PERSON view[st])
    | ^(CAMERA_KW FREE)
    | ^(CAMERA_KW ON)
    | ^(MEDIA_KW LOOP)
    | ^(MEDIA_KW ONCE) 						 // sound, music or video played in loop or once
    | ^(IN_KW IDENT)									  // ident of a list to add an element
    | PLAYER (s=SOLO)?
    {
	if(s != null) {
	    
	}
	p = new Pair<Model, Integer>((Model) st.get("Player"),0);
    }
    ;

list_declaration [SymbolTable st] returns [Code c]
    @init{o = null;}:
    ((o=operation[st])? i=IDENT
    {
	String id = i.getText();
	Symbol verif = st.get(id);
	if(verif == null) {
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Model \""+id+"\" non défini.");
	}
    })+
    ;
	
typeEntity [SymbolTable st] returns [Model t]:
    i=IDENT
    {
	String id = i.getText();
	Symbol verif = st.get(id);
	if(verif == null) {
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Model \""+id+"\" non défini.");
	} else {
	    t = (Model)verif;
	}
    }
    ;

dupli returns [Integer i]:
    DUPLICABLE
    {i=INT_DUPLICABLE;}
    ;
	
view [SymbolTable st] returns [Code c]:
    FIRST
    | THIRD
	;
affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c]
    @init{c = new ArrayList<Pair<String,AttributeValue>>();} :
    (a=affectationObjet[st]{c.addAll(a);} )+;

affectationObjet [SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] @init{c = new ArrayList<Pair<String,AttributeValue>>();}:
    ^( ALLOCATION_KW i=IDENT t=valAggregation[st]?)
    {
	if(t==null){
	    AttributeValue av = new AttributeValue(new Code(i.getText()),AttributeValue.Type.AGGR);
            c.add(new Pair<String,AttributeValue>(i.getText(),av));
        } else{
            c.add(new Pair<String,AttributeValue>(i.getText(),t));
        }
    }
    | ^( ALLOCATION_KW tc=typeCoordonnees[st] coo=coordinates[st])
    {
	String mode = tc.getCode();
        if(mode.equals("position")){
	    c.add(new Pair<String,AttributeValue>("posX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("posY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("posZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
        } else if(mode.equals("angle")){
            c.add(new Pair<String,AttributeValue>("orX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("orY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("orZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
        } else{
            c.add(new Pair<String,AttributeValue>("tX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("tY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
            c.add(new Pair<String,AttributeValue>("tZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
        }
    }
    | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT)
    | ^( ALLOCATION_KW att=attributTps[st] v=operation[st] u=timeUnit[st])
    {
	c.add(new Pair<String,AttributeValue>(att,new AttributeValue(new Duration(v,u))));
    }
    ;
    
	
valAggregation [SymbolTable st] returns [AttributeValue c]:
    ^(AGGREGATION_KW o=operation[st] t=timeUnit[st]?)
    {
	if(t!=null){
	    c= new AttributeValue(new Duration(o,t));
        } else{
            c=new AttributeValue(o, AttributeValue.Type.NUMBER);
        }
    }
    |^(AGGREGATION_KW i=IDENT)
    {
	String value = i.getText();
	try {
	    float tmp = Float.parseFloat(value);
	    c = new AttributeValue(tmp);
	} catch(NumberFormatException e) {
	    c = new AttributeValue(value);
	}
    }
    |^(AGGREGATION_KW i =TEXTE)
    {
	String value = i.getText();
	try {
	    float tmp = Float.parseFloat(value);
	    c = new AttributeValue(tmp);
	} catch(NumberFormatException e) {
            value = value.substring(1,value.length()-1);
	    c = new AttributeValue(value);
	}
    }
    | 'true' {c = new AttributeValue(true);}
    | 'false' {c = new AttributeValue(false);}
    ;


/* Definition */	
definition [SymbolTable st] returns [Code c] @init{ Definition d = new Definition(); c = new Code();}: 
    ^(DEFINITION_KW i=IDENT cons=consequences[st,d])
    {
	String ident = i.getText();
	if(st.get(ident)!=null) {
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "La définition \""+ident+"\" est déjà défini.");
	} else {
	    
	    d.setName(ident);
	    d.append(cons);
	    c.append(Code.genFuncDef(d));
	    st.add(ident,d);
	}
    }
    ;

consequences [SymbolTable st , Definition d] returns [Code c]
    @init{ c = new Code();} :
    ^(CONSEQUENCES_KW conslist=consequ_list[st,d])
    {
	c.append(conslist);
    }
    ;

consequ_list [SymbolTable st , Definition d] returns [Code c]
    @init{ c = new Code();} :
    (cons=consequ[st,d] { c.append(cons); })+
    ;
		
consequ [SymbolTable st,Definition d] returns [Code c]
    @init{ c = new Code();} :
    i=siAlors[st]
    {c=i;}
    | act=action[st]
    {c.append(act);}
    | a=affectation[st,d] {c=a;}
    | activCommande[st] {}
    | id=IDENT{	c.append(id.getText());c.append("\n");}
    | ^(VICTORY_KW IDENT IDENT?)
    | ^(DEFEAT_KW IDENT IDENT?)
    ;

action [SymbolTable st] returns [Code c]
    @init{ c = new Code();}:
    ent = accesClass[st] act = actionObjet[st,ent]
    {
      c.append(act);
    }
    |^(ENDS_KW IDENT IDENT?)
    |^(ENDS_KW GAME IDENT?)
    |^(STARTS_KW IDENT IDENT?)
    |^(STARTS_KW GAME IDENT?)
    |^(PAUSE_KW IDENT IDENT?)
    |^(PAUSE_KW GAME IDENT?)
    {
        c.append("\t");
        
       /* c.append("pause();\n");
        * equivaut à
        */ 
        c.append(Code.genFuncCall("pause",new ArrayList())); 
        
    }
    |^(MUTE_KW mode_mute[st] IDENT)
    |^(PLAY_KW IDENT)
    |^(STOP_KW IDENT)
    |^(BLOCK_KW transformation[st] accesClass[st] coordinates[st])
    |^(EFFACE_KW typeAcces[st] typeDestination[st]?)
    |^(GENERATE_KW ta=typeAcces[st] td=typeDestination[st]?)
    {
	for(Iterator<Symbol> it = ta.iterator() ; it.hasNext();) {
	    Symbol e = it.next();

	    //Erreur entité déja générée
	    if(!((Entity)e).getDuplicable() && (e.getGenerate()>=1)){
		handler.add(ErrorHandler.ErrorType.FATAL, 0, e.getName() + " n'est pas duplicable!");
	    }
	    if(td!=null){  
		e.getAttribute("posX").setCode(td.getX());
		e.getAttribute("posY").setCode(td.getY());
		e.getAttribute("posZ").setCode(td.getZ());
	    }  
	    e.toGenerate();
	    c.append("\t");		c.append(Code.genEntity((Entity) e));
	    c.append("\t");		c.append(Code.genAddObject((Entity) e,false,null));
	} 
    }
    |^(WAIT_KW op=operation[st] t=timeUnit[st] cons=consequences[st,new Definition()])
    {
    	c.append(Code.genSetTimeout(cons,op,t));
    }	//TO DO
    |SAVE_KW
    |^(NEXTURN_KW IDENT)
    //| ^(RELOAD_KW IDENT)
    |^(GRASPS_KW IDENT IDENT)
    |^(EXPELS_KW IDENT IDENT operation[st])
    |^(INGESTS_KW IDENT IDENT IDENT)
    ;

typeAcces [SymbolTable st] returns [ArrayList<Symbol> l]:
    ac=accesClass[st] {l=ac;}
    | operation[st] (IDENT | accesClass[st])
    ;		//TO DO

typeDestination [SymbolTable st] returns [Coordonnees coord]: 
    accesClass[st]
    | coo=coordinates[st]{coord=coo;};

actionObjet [SymbolTable st,List<Symbol> l] returns [Code c]@init{c=new Code();}:
    DIES_KW
    | actionCommandePressee[st]
    | act = actionCommandeMaintenue[st,l]
    {
      c.append(act);
    }
    |^(DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st])
    |^(UNTIL actionCommandeMaintenue[st,l] conditions[st])
    |^(EQUIP accesClass[st])
    |^(EQUIP NEXT)
    |^(EQUIP PREVIOUS)
    ;

actionCommandePressee [SymbolTable st] returns [Code c]:
  ^(JUMP operation[st])
  ; 

actionCommandeMaintenue [SymbolTable st,List<Symbol> ls] returns [Code c]@init{c = new Code();List<Integer> l = new ArrayList();int x=0,y=0,z=0;}:
  ^(MOVE (LEFT {x=-1;}| RIGHT {x=1;}| FORWARD {y=1;}| BACKWARD {y=-1;}| WUP {z=1;}| WDOWN{z=-1;}) val = operation[st]
  {
    int v = 1;
      try{
        v = Integer.parseInt(val.getCode());  
      }
      catch(Exception e){
        e.printStackTrace(); 
      } 

    x *= v; y *= v; z *= v;
    l.add(x); l.add(y); l.add(z);
  
    for(Iterator<Symbol> it = ls.iterator() ; it.hasNext();){
      Symbol s = it.next();
      c.append(Code.genTranslate(s.getName(),l, "false",s.getName()));
    }
  }
  ) //DONE
  | ^(TURN (LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE) operation[st])
  | ^(ACCELERATE operation[st])
  | ^(BRAKE operation[st])
  ;
  
transformation [SymbolTable st] returns [Code c]:
    TRANSLATION
    | ROTATION
    | SCALE
    ;
	
coordinates [SymbolTable st] returns [Coordonnees coo]:
    ^(COORDINATE_KW x=operation[st] y=operation[st] z=operation[st])
    {
	coo = new Coordonnees(x, y, z);
    }
    ;

/* Initialization of commands */
//gérer le disable commande

commande [SymbolTable st] returns [Code c]@init{int nbCommande = 0;c = new Code();} :
    ^(COMMAND_KW listplay=player_list[st] listCommand=actionCommande_list[st])
    {boolean present = false;
     Code [] tab = new Code[4];
     boolean clavier = false;
     ArrayList <Control> list_event = new ArrayList<Control>();
     ArrayList <Control> list_save = new ArrayList<Control>();
     ArrayList <Code> list_signature = new ArrayList<Code>();
     Iterator<Control> it = listCommand.iterator();
     while(it.hasNext()) {
	    Control ctr = it.next();
            if(ctr.getName().equals("3_UP")|ctr.getName().equals("3_DOWN") | ctr.getName().equals("3_LEFT") | ctr.getName().equals("3_RIGHT"))
                list_save.add(ctr);
            else{
                clavier = true;
                list_event.add(ctr);
                }
       }

       if(!list_event.isEmpty()){
            present = true;
            Iterator<Control> ei = list_event.iterator();
            while(ei.hasNext()){
                Control ctrl = ei.next();
                Definition def = ctrl.getDefinition();
                Code v = new Code(def.getName()+"(");
                if(!def.getSignature().isEmpty()){
                  Iterator<Model> im = def.getSignature().iterator();
                  while(im.hasNext()){
                    Model m = im.next();
                    System.out.println(m.getName());
                    Code l = new Code();
                    Enumeration enu = aggreg.keys();

                    while(enu.hasMoreElements()){
                        String e = (String)enu.nextElement();
                        String q = aggreg.get(e);

                        Entity fi = (Entity)st.get(e);
                        Entity et = (Entity)st.get(q);

                        if(et != null&&fi!= null){
                            String a = aggreg.get(q);
                            if(a!=null){
                                Entity et1 = (Entity)st.get(a);
                                System.out.println(et1.getPlayerName()+listplay.get(0).getName());
                                }
                            if(fi.listModels().contains(m) && ((et.getName().equals(listplay.get(0).getName()))||(et.getPlayerName().equals(listplay.get(0).getName())))){
                                l.append(e);
                                break;
                            }
                        }
                   }
                    if(l.getCode().equals("")){
                        System.out.println("pas d'alternatives");
                        System.exit(-1);
                    }else
                        v.append(l);

                  }
                }
                v.append(");");
                list_signature.add(v);
            }
       }
       if(!list_save.isEmpty()){

            Iterator<Control> ei = list_save.iterator();
            while(ei.hasNext()){
                Control ctrl = ei.next();
                Definition def = ctrl.getDefinition();
                Code v = new Code(def.getName()+"(");
                if(!def.getSignature().isEmpty()){
                  Iterator<Model> im = def.getSignature().iterator();
                  while(im.hasNext()){
                    Model m = im.next();
                    System.out.println(m.getName());
                    Code l = new Code();
                    Enumeration enu = aggreg.keys();
                    
                    while(enu.hasMoreElements()){
                        String e = (String)enu.nextElement();
                        String q = aggreg.get(e);

                        Entity fi = (Entity)st.get(e);
                        Entity et = (Entity)st.get(q);

                        if(et != null&&fi!= null){
                            String a = aggreg.get(q);
                            if(a!=null){
                                Entity et1 = (Entity)st.get(a);
                                System.out.println(et1.getPlayerName()+listplay.get(0).getName());
                                }
                            if(fi.listModels().contains(m) && ((et.getName().equals(listplay.get(0).getName()))||(et.getPlayerName().equals(listplay.get(0).getName())))){
                                l.append(e);
                                break;
                            }
                        }
                   }
                    if(l.getCode().equals("")){
                        System.out.println("pas d'alternatives");
                        System.exit(-1);
                    }else
                        v.append(l);

                  }
                }
                v.append(");");
                if(ctrl.getName().equals("3_UP")){tab[0] = v;}
                else if(ctrl.getName().equals("3_DOWN")){tab[1] = v;}
                else if(ctrl.getName().equals("3_LEFT")){tab[2] = v;}
                else{tab[3] = v;}
                System.out.println(v.getCode());
            }
       }
       c.append(Code.genRefreshLoop(tab,list_event));
       c.append("/*Commands*/ \n");
       c.append(Code.genEventListener(clavier,false,false));
       c.append(Code.genCMDKeyDown(list_event));
       c.append(Code.genCMDKeyUp(list_event));
       c.append(Code.genCMDExec(list_event,list_signature));
       }
    ;

player_list [SymbolTable st] returns [ArrayList<Symbol> list] @init{list = new ArrayList<Symbol>();}:
    (i=IDENT{String e = i.getText();Symbol m = st.get(e);
            if(m==null){
		handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Entité "+ e + "inexistante");
            }else{
                if( m.getType()== Symbol.Type.ENTITY){
                    list.add(m);
                }else{
		    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), e + " n'est pas une Entité");
                }
            }} )+
    ;

actionCommande_list[SymbolTable st] returns [ArrayList <Control> c_list] @init{c_list = new ArrayList<Control>();}:
	(c=actionCommande[st]{c_list.add(c);})+
	;
	
actionCommande [SymbolTable st] returns [Control c]:
    ^(MOUSE_KW v=souris[st] n=commandMode? d=definitionId[st])
    {if(n == null){
        c = new Control(v,Control.Source.SOURIS,d);
    }else{
        c = new Control(v,n,Control.Source.SOURIS,d);
    }
    Symbol s = st.get(c.getName());
    if(s != null){
	handler.add(ErrorHandler.ErrorType.FATAL, 0, "Commande déjà définie");
        }
    st.add(c.getName(),c);
    }
    |^(KEY_KW v=clavier[st] n=commandMode? d=definitionId[st]) // ident : that was defined with means
        {if(n == null){
        c = new Control(v,Control.Source.CLAVIER,d);
    }else{
        c = new Control(v,n,Control.Source.CLAVIER,d);
    }
    Symbol s = st.get(c.getName());
    if(s != null){
        handler.add(ErrorHandler.ErrorType.FATAL, 0, "Commande déjà définie");
        }
    st.add(c.getName(),c);
    }
    ;

commandMode returns [Control.Mode m]:
    PRESSED_KW {m = Control.Mode.PRESSED;} |HELD_KW {m = Control.Mode.HELD;}| RELEASED_KW {m = Control.Mode.RELEASED;}
    ;

definitionId [SymbolTable st] returns [Definition d]:
    i=IDENT{String nom = i.getText(); Symbol s = st.get(nom);
        if(s == null){
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "La Definition "+nom+" n'existe pas");
        }else{
        if( s.getType()== Symbol.Type.DEFINITION){
                    d=(Definition)s;
        }else{
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), nom+" n'est pas une Définition");
    }}}
    ;	
 
souris [SymbolTable st] returns [String c]:
    WUP{c = "UP";} | WDOWN{c = "DOWN";} | LEFT{c = "LEFT";} | RIGHT{c = "RIGHT";} | CLICK_LEFT{c = "CLK_LEFT";} | CLICK_MIDDLE{c = "CLK_MIDDLE";} | CLICK_RIGHT{c = "CLK_RIGHT";} | SCROLL_UP{c = "SCR_UP";} | SCROLL_DOWN{c = "SCR_UP";}
    ;
 
clavier [SymbolTable st] returns [String l]:
    i=LETTER {l = i.getText();l=l.toLowerCase();l=String.valueOf(new Character(l.charAt(0)).hashCode());}| WUP{l="38";} | WDOWN{l="40";} | LEFT{l="37";} | RIGHT{l="39";} | SPACE{l="32";} | ESCAPE{l="27";} | ENTER{l="13";}          //CHAR : Z,Q,S,D,...
    ;
  
activCommande [SymbolTable st] returns [Code c]:
    ^(ACTIVATE_KW typeCommand[st])
    |^(DISABLE_KW typeCommand[st])
    ;

typeCommand [SymbolTable st] returns [Code c]:
    COMMANDS
    | ^(MOUSE_KW souris[st]*)
    | ^(KEY_KW clavier[st]+)
    | KEYBOARD;
 	
reglesJeu [SymbolTable st] returns [Code c]:
    ^(RULE_KW IDENT? declencheur[st] definitionId[st])
    ;
 
declencheur [SymbolTable st] returns [Code c]:
    accesClass[st] (MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st])
    |^(ENDS_KW type_declencheur[st])
    |^(STARTS_KW type_declencheur[st])          //ident if it is a counter
    |^(BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st])
    |^(VICTORY_KW (PLAYER| IDENT)) //ident est le nom d'1 Team ou d'1 Player, Player la classe (global)
    |^(DEFEAT_KW (PLAYER| IDENT))
    ;
  
type_declencheur [SymbolTable st] returns [Code c]: 
    IDENT|GAME;
	
varOuNB [SymbolTable st] returns [Code c]:
    variable[st,new Definition()] | FLOAT;

declencheurTK [SymbolTable st] returns [Code c] :
    ^(TOUCHES_KW (OTHER)? accesClass[st])
    | ^(KILLS_KW (OTHER)? accesClass[st])
    | ^(OWNES_KW (OTHER)? accesClass[st])
    | ^(NOTOWNES_KW (OTHER)? accesClass[st])
    ;
	

	
declencheurKT [SymbolTable st] returns [Code c] :
    ^(KILLED_KW (OTHER)? accesClass[st])
    | ^(TOUCHED_KW (OTHER)? accesClass[st])
    | ^(OWNED_KW (OTHER)? accesClass[st])
    | ^(NOTOWNED_KW (OTHER)? accesClass[st])
    ;
	
/* Conditions */  
siAlors [SymbolTable st] returns [Code c]:
    ^(IF_KW cond=conditions[st] r1=consequences[st,new Definition()] r2=consequences[st,new Definition()]?)
    {c = Code.genIF(cond,r1,r2);}
    ;
//////////////////////////////////////////////////////////////////////////petit pb ici je pense
conditions [SymbolTable st] returns [Code c]
    @init{not=null;}:
    ^(CONDITION_KW (not=NOT)? cond=conditions[st])
    {
        if(not != null) {
            c = Code.genNot(cond);
        } else {
            c = cond;
        }
    }
    |^(OR cond1=conditions[st] cond2=conditions[st])
    {
        c = Code.genOr(cond1,cond2);
    }
    |^(AND cond1=conditions[st] cond2=conditions[st])
    {
        c = Code.genAnd(cond1,cond2);
    }
    |^(EQUALS cond1=operation[st] cond2=operation[st])
    {
        c = Code.genEquals(cond1,cond2);
    }
    |^(INF cond1=operation[st] cond2=operation[st])
    {
        c = Code.genInf(cond1,cond2);
    }
    |^(SUP cond1=operation[st] cond2=operation[st])
    {
        c = Code.genSup(cond1,cond2);
    }
    |^(INFEG cond1=operation[st] cond2=operation[st])
    {
        c = Code.genInfEg(cond1,cond2);
    }
    |^(SUPED cond1=operation[st] cond2=operation[st])
    {
        c = Code.genSupEg(cond1,cond2);
    }
    |^(DIFF cond1=operation[st] cond2=operation[st])
    {
        c = Code.genDiff(cond1,cond2);
    }
    | etat[st]
  ;

etat [SymbolTable st] returns [Code c]:
    ^(DEAD_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(ALIVE_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(EFFACED_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(GENERATED_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(TOUCHING_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(MOVING_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(WAITING_KW accesClass[st] (NOT)? (OTHER)? accesClass[st])
    | ^(FINISHED_KW type_declencheur[st] (NOT)?)
    | ^(STARTED_KW type_declencheur[st](NOT)?)
    | ^(PAUSED_KW type_declencheur[st](NOT)?)
    | ^(MUTED_KW type_declencheur[st] (NOT)? mode_mute[st])
    | ^(PLAYED_KW type_declencheur[st] (NOT)?)
    | ^(STOPPED_KW type_declencheur[st] (NOT)?)
    //| 'true'^
    | ^(VICTORY_KW IDENT)
    | ^(DEFEAT_KW IDENT)
    ;
  
mode_mute [SymbolTable st] returns [Code c]: 
    ON|OFF;
	
affectation [SymbolTable st , Definition d] returns [Code c]:
    ^(ASSIGN_KW i1=operation[st] i2=variable[st,d])
    {
	c = Code.genAffect(i2,i1);
    }
    |^(ADD_KW o=operation[st] v=variable[st,d])
    {
        c = Code.genIncr(v,o);
    }
    |^(SUB_KW op=operation[st] var=variable[st,d]) //TODO
    {
        c = Code.genSub(var,op);
    }
    |^(INVERT_KW variable[st,d] variable[st,d])
    {
        c = Code.genInvert(var,op);
    }
    ;
  
iaBasique [SymbolTable st] returns [Code c]: 
    ^(IA_KW IDENT reglesJeu[st]+);

/* Arithmetic expression */

operation [SymbolTable st] returns [Code c]:
    ^(RANDOM_KW c1 =operation[st] c2 =operation[st])
    {c=Code.genRD(c1,c2);}
    |^(PLUS operation[st] operation[st])
    {c=Code.genPLUS(c1,c2);}
    |^(MINUS operation[st] operation[st])
    {c=Code.genMINUS(c1,c2);}
    |^(MUL operation[st] operation[st])
    {c=Code.genMUL(c1,c2);}
    |^(DIV operation[st] operation[st])
    {c=Code.genDIV(c1,c2);}
    |^(MOD operation[st] operation[st])
    {c=Code.genMOD(c1,c2);}
    |^(POW operation[st] operation[st])
    {c=Code.genPOW(c1,c2);}
    |v = variable[st,new Definition()]
    {c = v;}
    |f = FLOAT
    {c = new Code(f.getText());}
    ;
 

variable [SymbolTable st , Definition d] returns [Code c]:
    ^(X tc=typeCoordonnees[st] sb=accesClass[st])
    {//TODO
	Symbol sy = sb.get(0);
	if(tc.equals("position")){
	    c = Code.genPosX(sy.getName());
        }else if(tc.equals("angle")){
            c = Code.genoRX(sy.getName());
        }else{
            c = Code.genTX(sy.getName());
        }
    }
    |^(Y tc =typeCoordonnees[st] sb=accesClass[st])
    {//TODO
	Symbol sy = sb.get(0);
	if(tc.equals("position")){
	    c = Code.genPosY(sy.getName());
        }else if(tc.equals("angle")){
            c = Code.genoRY(sy.getName());
        }else{
            c = Code.genTY(sy.getName());
        }
    }
    |^(Z typeCoordonnees[st] sb=accesClass[st])
    {//TODO
	Symbol sy = sb.get(0);
	if(tc.equals("position")){
	    c = Code.genPosZ(sy.getName());
        }else if(tc.equals("angle")){
            c= Code.genoRZ(sy.getName());
        }else{
            c= Code.genTZ(sy.getName());
        }
    }
    |^(VAR_I_KW i=IDENT e=accesClass[st])
    {//TODO //PRIO 
	Symbol si = e.get(0);
	String ident= i.getText();
	AttributeValue a = si.getAttribute(ident);
	String access = new String();
	if(a==null){
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), si.getName()+" n'a pas l'attribut "+ident);
	}
	else if(a.getType()!= AttributeValue.Type.NUMBER){
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), ident+" n'est pas un nombre.");
	}else{
	    
	    if(si.getType() == Symbol.Type.MODEL){
	         
	         //On verifie si le modèle a déja été appelé
	             boolean present = false;
               for (int j = 0 ; j< d.getSignature().size() ; j++ ){
                      if (d.getSignature().get(j).getName() == si.getName()){
                        present = true;                      
                      } 
               
               }
	             if(!present){
	               d.addModel((Model) si);
	             }
	             
	             access = "arg"+(d.getSignature().size()-1);
	         
	         
	         
	    }
	    else if(si.getType() == Symbol.Type.ENTITY){
          access = si.getName();
      }
      else{
        //ERREUR
      }
	
	
	    c=Code.genAccess(access,ident);
	}
    }
    |GAME_SCORE_KW
    |^(VALUE_KW at=attributTps[st] ac=accesClass[st])
    {//TODO
	Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
	if(a==null){
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), si.getName()+" n'a pas l'attribut "+at);
	}
	else{
	    c=Code.genAccess(si.getName(),at);
	}
    }
    ;

accesClass [SymbolTable st] returns [ArrayList<Symbol> sb]
    @init{sb = new ArrayList<Symbol>();} :	//TO DO
    ^(ACCESS_KW ALL)
    {
	sb.addAll(st.getAllEntities());
    }
    | ^(ACCESS_KW i=IDENT co=operation[st]?) //acces a un tableau.
    {
	String ident = i.getText(); Symbol s = st.get(ident);
	if(s==null){
	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), ident+" n'est pas défini.");
	}else{
	    sb.add(s);
	}
    }
    | ^(ACCESS_KW PLAYER)
    {
	//sb.add(Genre.player);
    }
    ;
  
typeCoordonnees [SymbolTable st] returns [Code c]:
	POSITION {c = new Code("position");}| ORIENTATION {c = new Code("angle");}| SIZE {c = new Code("taille");}
	;

timeUnit [SymbolTable st] returns [String c]:
	MIN	{c = "MIN";}
	| SEC{c = "SEC";}
	| MS{c = "MS";}
	| FRAME
	;

attributTps [SymbolTable st] returns [String c]:
	BOOST_INTERVAL{c ="boostInterval";}
	| SHOOT_INTERVAL {c = "shootInterval";}        //attributes of "weapon" :
	| RELOAD_TIME {c = "reloadTime";}
	;

attributListeOuObjet [SymbolTable st] returns [Code c]:
  INVENTORY
  | EQUIPED_OBJECT
  | ENTRANCES
  | EXITS
  | DAMAGE_ZONE
  | COLLECTORS
  | TYPES_COLLECTORS
  | GENERATORS
  | TYPE_GENERATORS
  | BREAKERS
  | TYPES_BREAKERS
  | TELEPORTABLES
  | TYPES_TELEPORTABLES
  ;
