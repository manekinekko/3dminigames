package tests;
import attributes.Duration;
import attributes.AttributeValue.Type;
import code.Code;
import junit.framework.TestCase;

public class DurationTest extends TestCase {
	Duration d1;
	Duration d2;
	Code c1;
	protected void setUp() throws Exception {
		super.setUp();
		Code c1 = new Code("toto");
		Duration d1 = new Duration(5, "MS");
		Duration d2 = new Duration(c1, "MS");
	}
	private Code value;
    private String unit;
    
    public void testGetCode(){
    	System.out.println(d1.getCode());
    	assertEquals(d1,null);
    	assertEquals(d2,null);
    	assertNotNull(d1.getCode());
    	assertEquals(d1.getCode(), "1");
    	assertNotNull(d2.getCode());
    }
    
}
