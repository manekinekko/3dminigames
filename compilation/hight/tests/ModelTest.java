package tests;
import java.util.List;
import symbols.Model;
import junit.framework.TestCase;
import code.Code;
import code.SymbolTable;
import attributes.*;

import java.util.*;
import lib.Pair;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.filter.*;
import java.util.List;
import java.util.Iterator;

public class ModelTest extends TestCase {
	Model m1, m2, m3, m4, m5;	
	SymbolTable tabSymb;
	String str, str2;
	AttributeValue val, val2;
	Pair<String, AttributeValue> pair1, pair2;
	protected void setUp() throws Exception {
		super.setUp();
		m1 = new Model("ab");
		m2 = new Model("abc", m1);
		m3 = new Model("abcd", m1, m2);
		m4 = new Model("abcde", m1, m2, m3);
		m5 = new Model("abcdef", m1, m2, m3, m4);
		tabSymb = new SymbolTable();
		str = "toto"; str2= "tata";
		val = new AttributeValue(666); val2 = new AttributeValue(999);
		pair1= new Pair<String, AttributeValue>(str, val);
		pair2= new Pair<String, AttributeValue>(str2, val2);
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
	
	/* En commentaire, car teste en mettant "attributs" en public

	public void testAddAttribute(){
		m1.addAttribute(str);
		m2.addAttribute(str, val);	
		String c = String.valueOf((float)666);
		assertEquals(m1.attributs.get(str), null);
		assertEquals(m2.attributs.get(str).getCode().getCode(), c);
	}
	
	@SuppressWarnings("unchecked")
	public void testAddAttributes(){
		m3.addAttributes(pair1, pair2);
		String c = String.valueOf((float)666);
		String c2 = String.valueOf((float)999);
		assertEquals(m3.attributs.get(str).getCode().getCode(), c);
		assertEquals(m3.attributs.get(str2).getCode().getCode(), c2);
	}
	
	@SuppressWarnings("unchecked")
	public void testGetAllAttributes(){
		m4.addAttributes(pair1, pair2);
		assertEquals(m4.getAllAttributes().size(), 2);
	}
	
	@SuppressWarnings("unchecked")
	public void testContains(){
		m5.addAttribute(str2);
		m5.addAttribute(str2, val);
		m5.addAttributes(pair1, pair2);
		assertEquals(m5.contains(str), true);
		assertEquals(m5.contains(str2), true);
	}
	
	@SuppressWarnings("unchecked")
	public void testGetAttribute(){
		String str3 = "kikoo";
		m1.addAttribute(str3);
		m1.addAttribute(str, val2);
		m1.addAttributes(pair1, pair2);
		assertEquals(m1.getAttribute(str3), null);
		assertEquals(m1.getAttribute(str2), val2);
		assertEquals(m1.getAttribute(str), val);
	}
	*/

}
