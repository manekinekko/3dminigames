package tests;

import lib.Coordonnees;
import code.Code;
import junit.framework.TestCase;

public class CoordonneesTest extends TestCase {
Coordonnees c1;
Code x;
Code y;
Code z;
	protected void setUp() throws Exception {
		super.setUp();
		x = new Code("a");
		y = new Code("b");
		z = new Code("c");
		c1 = new Coordonnees(x,y,z);
	}
public void testGet(){
	assertEquals(c1.getX().getCode(),"a");
	assertEquals(c1.getY().getCode(),"b");
	assertEquals(c1.getZ().getCode(),"c");
}
}
