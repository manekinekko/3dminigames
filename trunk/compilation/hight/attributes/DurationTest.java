package attributes;

import attributes.AttributeValue.Type;
import code.Code;
import junit.framework.TestCase;

public class DurationTest extends TestCase {
	Duration d1;
	Duration d2;
	protected void setUp() throws Exception {
		super.setUp();
		Duration d1 = new Duration(1, "MS");
	}
	private Code value;
    private String unit;
    
    public void testGetCode(){
    	//assertNotNull(d1.getCode());
    	//assertEquals(d1.getCode().getCode(), "1");
    }
    
}
