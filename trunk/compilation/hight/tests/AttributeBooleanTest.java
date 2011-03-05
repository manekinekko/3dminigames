package tests;
import attributes.AttributeBoolean;
import junit.framework.TestCase;

public class AttributeBooleanTest extends TestCase {
AttributeBoolean b1;
	protected void setUp() throws Exception {
		super.setUp();
		
		b1.setValue(true);
	}
public void testSet(){
	assertEquals(b1.getValue(),"true");
}
}
