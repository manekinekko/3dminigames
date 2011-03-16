package tests;
import attributes.Duration;
import code.Code;
import junit.framework.TestCase;

public class DurationTest extends TestCase {
	Duration d1;
	Duration d2;
	Duration d3;
	Duration d4;
	Code c1;
	protected void setUp() throws Exception {
		super.setUp();
		c1 = new Code("toto");
		d1 = new Duration(5, "MS");
		d2 = new Duration(c1, "ZX");
		d3 = new Duration(13, "SEC");
		d4 = new Duration(new Code("tata"), "MIN");
	}
    
    public void testGetCode(){
    	System.out.println(d1.getCode());
    	System.out.println(d2.getCode());
    	System.out.println(d3.getCode());
    	System.out.println(d4.getCode());
    	assertNotSame(d1,null);
    	assertNotSame(d2,null);
    	assertNotNull(d1.getCode());
    	assertEquals(d1.getCode().toString(), "5");
    	assertNotNull(d2.getCode());
    }
    
    /*public void testCalcUnit(){
    	assertEquals(d1.calcUnit(),1);
    	assertEquals(d2.calcUnit(),0);
    	assertEquals(d3.calcUnit(),1000);
    	assertEquals(d4.calcUnit(),60000);
    }*/
    
}
