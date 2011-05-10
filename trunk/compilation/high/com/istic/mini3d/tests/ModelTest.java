package com.istic.mini3d.tests;
import java.util.List;
import com.istic.mini3d.symbols.Model;
import junit.framework.TestCase;
import com.istic.mini3d.code.SymbolTable;
import com.istic.mini3d.attributes.*;
import java.util.ArrayList;


public class ModelTest extends TestCase {
	Model m1, m2, m3, m4, m5;	
	SymbolTable tabSymb;
	String str, str2, str3;
	AttributeValue val, val2, val3;
	List<String> list;
	List<Model> gen;
	protected void setUp() throws Exception {
		super.setUp();
		m1 = new Model("ab");
		m2 = new Model("abc", m1);
		m3 = new Model("abcd", m1, m2);
		m4 = new Model("abcde", m1, m2, m3);
		m5 = new Model("abcdef", m1, m2, m3, m4);
		tabSymb = new SymbolTable();
		str = "toto"; str2= "tata"; str3="kikoo";
		list = new ArrayList<String>();
		gen = new ArrayList<Model>();
		val = new AttributeValue(666); val2 = new AttributeValue(999);
	}
	
	public void testGetName(){
		assertEquals(m1.getName(),"ab");
		assertEquals(m2.getName(),"abc");
		assertEquals(m3.getName(),"abcd");
		assertEquals(m4.getName(),"abcde");
		assertEquals(m5.getName(),"abcdef");
	}
	
	//A retester lorsque la fonction init sera entierement terminee
	public void testInit(){
		Model.init(tabSymb);
	}

	/* Test realises en passant en public les attributs de Model.
	  
	public void testAddAttribute(){
		m1.addAttribute(str, val);	
		String c = String.valueOf((float)666);
		assertEquals(m1.attributs.get(str).getCode().getCode(), c);
	}
	
	public void testGetAllAttributes(){
		m1.addAttribute(str, val);
		m1.addAttribute(str2, val2);
		assertEquals(m1.getAllAttributes().size(), 2);
	}
	
	public void testGetAttribute(){
		m1.addAttribute(str3,null);
		m1.addAttribute(str, val2);
		assertEquals(m1.getAttribute(str3), null);
		assertEquals(m1.getAttribute(str), val2);
	}
	
	public void testListAttributes(){
		list.add(str3);
		list.add(str);
		list.add(str2);
		m1.addAttribute(str,val);
		m1.addAttribute(str2,val2);
		m1.addAttribute(str3, val3);
		assertEquals(m1.listAttributes(), list);
	}

	public void testContains(){
		m3.addAttribute(str2, val);
		m4.addAttribute(str, val2);
		assertEquals(m3.contains(str2), true);
		assertEquals(m4.contains(str), true);
	} 
	
	public void testAddGenerated(){
		gen.add(m1);
		Model.addGenerated(m1);
		//assertEquals(Model.generated, gen);
	} */

}
