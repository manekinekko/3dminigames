package com.istic.mini3d.tests;
import com.istic.mini3d.attributes.AttributeValue;
import com.istic.mini3d.code.SymbolTable;
import com.istic.mini3d.code.Code;
import com.istic.mini3d.symbols.Symbol;
import junit.framework.TestCase;

public class SymbolTableTest extends TestCase {
SymbolTable s1;
Symbol t1;
AttributeValue a1;
	protected void setUp() throws Exception {
		super.setUp();
		SymbolTable s1 = new SymbolTable();
		AttributeValue a1 = new AttributeValue(3);
		//Symbol t1 = new Symbol();
	}
public void testGet(){
	s1.add("abc",t1);
}
}
