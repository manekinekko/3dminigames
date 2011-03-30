package com.istic.mini3d.tests;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Model;
import junit.framework.TestCase;
import com.istic.mini3d.attributes.AttributeValue;
import java.util.*;

public class EntityTest extends TestCase {
	Entity entity;
	Model m, m2, m3;
	List<Model> models;
	List<String> liste, liste2;
	Map<String, AttributeValue> attributes;
	AttributeValue val, val2;
	protected void setUp() throws Exception {
		super.setUp();
		entity = new Entity("Entite", m);
		models = new ArrayList<Model>();
		liste2 = new ArrayList<String>();
		liste = new ArrayList<String>();
        attributes = new HashMap<String, AttributeValue>();
        val = new AttributeValue(true);
		val2 = new AttributeValue(666);
		m = new Model("mod1");
		m2 = new Model("mod3");
		m.addAttribute("att1", val);
		m2.addAttribute("att2", val2);	
	}
	
	/*
	 * Passer les attributs de Entity en public pour lancer ces tests.
	 * 
	public void testAddAttribute(){
		attributes.put("att1", val);
		attributes.put("att2", val2);
		entity.addAttribute("att1", val);
		entity.addAttribute("att2", val2);
		assertEquals(entity.attributes, attributes);
	}
	
	public void testGetAttribute(){
		entity.addAttribute("att1", val);
		entity.addAttribute("att2", val2);
		assertEquals(entity.getAttribute("att1"), val);
		assertEquals(entity.getAttribute("att2"), val2);
	}
	
	public void testListAttributes(){
		entity = new Entity("testList", m, m2);
		entity.listAttributes();
		liste.add("att1"); liste.add("att2");
		liste2.add("att2"); liste2.add("att1");
		assertEquals(entity.listAttributes(), liste);
		assertNotSame(entity.listAttributes(), liste2);
	}

	// Quel est l interet de cette fonction ?
	public void testListModifyAttributes(){
		entity = new Entity("testList", m, m2);
		entity.listModifyAttributes();
	} */
}
