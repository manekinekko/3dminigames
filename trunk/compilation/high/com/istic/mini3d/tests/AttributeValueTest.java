package com.istic.mini3d.tests;

import com.istic.mini3d.attributes.AttributeValue;
import com.istic.mini3d.attributes.AttributeValue.Type;
import com.istic.mini3d.code.Code;
import com.istic.mini3d.attributes.Duration;
import junit.framework.TestCase;

public class AttributeValueTest extends TestCase {
	AttributeValue av;
	AttributeValue av1;
	AttributeValue av2;
	AttributeValue av3;
	AttributeValue av4;
	AttributeValue av5;
	protected void setUp() throws Exception {
		super.setUp();
		av = new AttributeValue();
		av1 = new AttributeValue(true);
		av2 = new AttributeValue(666);
		av3 = new AttributeValue("bleu");
		av4 = new AttributeValue(new Duration(1, "ms"));
		av5 = new AttributeValue(av3.getCode(), AttributeValue.Type.STRING);
	}
	//comment tester AGGR ?
	private Code value;
    private Type type;
    boolean b1 = true;
    float i1 = 666;
    Duration t1 = new Duration(1, "ms");
    String c1 =String.valueOf(b1);
    String c2 = String.valueOf(i1);
    
    public void testGetCode(){
    	assertNull(av.getCode());
    	assertNotNull(av1.getCode());
    	assertEquals(av1.getCode().getCode(), c1);
    	assertNotNull(av2.getCode());
    	assertEquals(av2.getCode().getCode(), c2);
    	assertNotNull(av3.getCode());
    	assertEquals(av3.getCode().getCode(), "bleu");
    	assertNotNull(av4.getCode());
    	assertEquals(av4.getCode().getCode(), "1");
    	assertNotNull(av5.getCode());
    	assertEquals(av5.getCode().getCode(), "bleu");
    }
    
    public void testGetType(){
    	assertNotNull(av.getType());
    	assertEquals(av.getType(), AttributeValue.Type.NIL);
    	assertNotNull(av1.getType());
    	assertEquals(av1.getType(), AttributeValue.Type.BOOLEAN);
    	assertNotNull(av2.getType());
    	assertEquals(av2.getType(), AttributeValue.Type.NUMBER);
    	assertNotNull(av3.getType());
    	assertEquals(av3.getType(), AttributeValue.Type.STRING);
    	assertNotNull(av4.getType());
    	assertEquals(av4.getType(), AttributeValue.Type.TIME);
    	assertNotNull(av5.getType());
    	assertEquals(av5.getType(), AttributeValue.Type.STRING);
    }

}
