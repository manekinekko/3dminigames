package com.istic.mini3d.tests;
import java.util.ArrayList;
import java.util.List;

import com.istic.mini3d.symbols.Definition;
import com.istic.mini3d.symbols.Model;
import com.istic.mini3d.code.Code;
import junit.framework.TestCase;

public class DefinitionTest extends TestCase {
	Definition d1, d2;
	Code c1, c2;
	Model m, m2;
	String str1, str2;
	List<Model> sign; 
	List<String> params;
	protected void setUp() throws Exception {
		super.setUp();
		c1 = new Code("bleu");
		c2 = new Code("rouge");
		str1 = "bleu";
		str2 = "rouge";
		m = new Model("mod");
		m2 = new Model("mod2");
		sign = new ArrayList<Model>();
		params = new ArrayList<String>();
		d1 = new Definition(str1,c1);
		d2 = new Definition(str2,c2,m);
	}
	
	/* Tests a realiser en passant a public les attributs params et sign de Definition
	
	public void testAddModel(){
		d1.addModel(m);
		d1.addModel(m2);
		sign.add(m);
		sign.add(m2);
		assertEquals(d1.sign, sign);
	}
	
	public void testAddParam(){
		d1.addParam("param1");
		d1.addParam("param2");
		params.add("param1");
		params.add("param2");
		assertEquals(d1.params, params);
	}
	 
	public void testGetSignature(){
		d1.addModel(m);
		sign.add(m);
    	assertEquals(d1.getSignature(), sign);
    }
	
	public void testGetParams(){
		d1.addParam("param1");
		params.add("param1");
    	assertEquals(d1.getParams(), params);
	}
	
	public void testGetCode(){
		assertNotNull(d1.getCode());
		Code c = new Code(str1);
		assertEquals(d1.getCode().getCode(),c.getCode());
		assertNotNull(d1.getName());
		assertEquals(d1.getName(),"bleu");
	}
	
	public void testGetName(){
		assertNotSame(d1.getName(), d2.getName());
		assertEquals(d1.getName(), "bleu");
		assertEquals(d2.getName(), "rouge");
	}*/
	
	/* 
	 * Tester les set et get Duplicable apres avoir realiser les test pour Entity
	 */
	
	
}
