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
	List<String> liste;
	Map<String, AttributeValue> attributes;
	AttributeValue val, val2;
	protected void setUp() throws Exception {
		super.setUp();
		entity = new Entity("Entite", m);
		models = new ArrayList<Model>();
		liste = new ArrayList<String>();
        attributes = new HashMap<String, AttributeValue>();
        val = new AttributeValue(true);
		val2 = new AttributeValue(666);
	}
	
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
		entity.addAttribute("att1", val);
		entity.addAttribute("att2", val2);
		liste.add("att1"); liste.add("att2");
		System.out.println(entity.listAttributes());
		//assertEquals(entity.listAttributes(), liste);
	}

}
