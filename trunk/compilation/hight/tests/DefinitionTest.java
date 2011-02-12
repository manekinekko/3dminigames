package tests;
import symbols.Definition;
import code.Code;
import junit.framework.TestCase;

public class DefinitionTest extends TestCase {
Definition d1;
Code c1;
	protected void setUp() throws Exception {
		super.setUp();
		c1 = new Code("bleu");
		d1 = new Definition("rouge",c1);
	}
	public void testGetCode(){
		assertNotNull(d1.getCode());
		assertEquals(d1.getCode().toString(),"bleu");
		assertNotNull(d1.getName());
		assertEquals(d1.getName(),"rouge");
	}
}
