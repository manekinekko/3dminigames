package tests;

import code.Code;
import symbols.Control;
import symbols.Definition;
import symbols.Model;
import symbols.Control.Mode;
import symbols.Control.Source;

import junit.framework.TestCase;

public class ControlTest extends TestCase {	
	Control ctr, ctr2;
	String name, name2;
	Mode mode;
	Source source, source2;
	Definition d, d2;
	String commande;
	Code cod;
	Model m;	
	protected void setUp() throws Exception {
		super.setUp();
		name ="kikoo";
		name2 = "kooki";
		mode = Mode.PRESSED;
		source = Source.CLAVIER;
		source2 = Source.SOURIS;
		cod = new Code();
		d = new Definition("def1", cod);
		m = new Model("mod");
		d2 = new Definition("def2", cod, m);
		ctr = new Control(name, mode, source, d);
		ctr2 = new Control(name2, source2, d2);
	}
	
	public void testGetName(){
		assertEquals(ctr.getName(), "3_kikoo");
		assertEquals(ctr2.getName(), "3_kooki");
		assertNotSame(ctr.getName(), ctr2.getName());
	}
	
	public void testGetMode(){
		assertEquals(ctr.getMode(), Mode.PRESSED);
		assertEquals(ctr2.getMode(), Mode.HELD);
		assertNotSame(ctr.getMode(), ctr2.getMode());
	}
	
	public void testGetSource(){
		assertEquals(ctr.getSource(), Source.CLAVIER);
		assertEquals(ctr2.getSource(), Source.SOURIS);
		assertNotSame(ctr.getSource(), ctr2.getSource());
	}
	
	public void testGetDefinition(){
		assertEquals(ctr.getDefinition(), d);
		assertEquals(ctr2.getDefinition(), d2);
		assertNotSame(ctr.getDefinition(), ctr2.getDefinition());
	}
	
	public void testGetCommande(){
		assertEquals(ctr.getCommande(), "kikoo");
		assertEquals(ctr2.getCommande(), "kooki");
		assertNotSame(ctr.getCommande(), ctr2.getCommande());
	}
	

}
