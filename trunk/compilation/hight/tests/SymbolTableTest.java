package tests;
import attributes.AttributeValue;
import code.SymbolTable;
import code.Code;
import symbols.Symbol;
import junit.framework.TestCase;

public class SymbolTableTest extends TestCase {
SymbolTable s1;
AttributeValue a1;
	protected void setUp() throws Exception {
		super.setUp();
		SymbolTable s1 = new SymbolTable();
		AttributeValue a1 = new AttributeValue(3);
	}
public void testGet(){
	//s1.add("abc");
}
}
