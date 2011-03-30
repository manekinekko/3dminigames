package com.istic.mini3d.tests;

import java.util.ArrayList;
import java.util.List;

import com.istic.mini3d.attributes.AttributeValue;
import com.istic.mini3d.code.Code;
import com.istic.mini3d.code.SymbolTable;
import com.istic.mini3d.symbols.Definition;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Model;
import junit.framework.TestCase;


public class CodeTest extends TestCase {
	Code c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41;
	Model m1; Entity e1; Definition d1, d2;
	Code c42, c43, c44;
	SymbolTable tabSymb;
	List<String> params;
	protected void setUp() throws Exception {
		super.setUp();
		c1 = new Code();
		c2 = new Code("bleu");
		c3 = new Code("bleu");
		c3.append("rouge");
		c4 = new Code("boom");
		c4.append(c2.getCode());
		c5 = Code.genEntity("bleu");
		c6 = Code.genRessourceI("bleu", 3, true);
		c7 = Code.genRessourceS("bleu", "3", false);
		c8 = Code.genSigPre("boumbo", "car");
		c9 = Code.genSigOp("jazz", "autobot", "earth", "prime", 1984);
		c10 = Code.genAffect(c2, c2);
		c11 = Code.genIncr(c2, c2);
		c12 = Code.genSub(c2, c2);
		c13 = Code.genInvert(c2, c3);
		c14 = Code.genNot(c2);
		c15 = Code.genOr(c2, c2);
		c16 = Code.genAnd(c2, c2);
		c17 = Code.genInfEg(c2, c2);
		c18 = Code.genInf(c2, c2);
		c19 = Code.genSupEg(c2, c2);
		c20 = Code.genSup(c2, c2);
		c21 = Code.genEquals(c2, c2);
		c22 = Code.genDiff(c2, c2);
		c23 = Code.genRD(c2,c2);
		c24 = Code.genPLUS(c2,c2);
		c25 = Code.genMINUS(c2,c2);
		c26 = Code.genMUL(c2,c2);
		c27 = Code.genDIV(c2,c2);
		c28 = Code.genMOD(c2,c2);
		c29 = Code.genPOW(c2,c2);
		c30 = Code.genPosX("bob");
		c31 = Code.genoRX("bob");
		c32 = Code.genTX("bob");
		c33 = Code.genPosY("bob");
		c34 = Code.genoRY("bob");
		c35 = Code.genTY("bob");
		c36 = Code.genPosZ("bob");
		c37 = Code.genoRZ("bob");
		c38 = Code.genTZ("bob");
		c39 = Code.genIF(c2,c2,c2);
		c40 = Code.genAccess("vert","hulk");
		c41 = Code.genEOL();
		c42 = new Code();
		m1 = new Model("ab");
		tabSymb = new SymbolTable();
		Model.init(tabSymb);
		params = new ArrayList<String>();
		}
	public void testAppend(){
		assertNotNull(c1.getCode());
		assertEquals(c1.getCode(),"");
		assertNotNull(c2.getCode());
		assertEquals(c2.getCode(),"bleu");
		assertEquals(c3.getCode(),"bleurouge");
		assertEquals(c4.getCode(),"boombleu");
		assertNotNull(c5.getCode());
		assertEquals(c5.getCode(),"objectbleu=");
		assertNotNull(c6.getCode());
		assertEquals(c6.getCode()," bleu=3.0 ;");
		assertNotNull(c7.getCode());
		assertEquals(c7.getCode()," bleu=3,");
		assertNotNull(c8.getCode());
		assertEquals(c8.getCode(),"boumbo->car;");
		assertNotNull(c9.getCode());
		assertEquals(c9.getCode(),"jazz->autobot.earthapply (prime1984.0);");
		assertNotNull(c10.getCode());
		assertEquals(c10.getCode(),"bleu = bleu;\n");
		assertNotNull(c11.getCode());
		assertEquals(c11.getCode(),"bleu += bleu;\n");
		assertNotNull(c12.getCode());
		assertEquals(c12.getCode(),"bleu -= bleu;\n");
		assertNotNull(c13.getCode());
		assertEquals(c13.getCode(),"var tmp = bleu;\nbleu = bleurouge;\nbleurouge = tmp ;\n");
		assertNotNull(c14.getCode());
		assertEquals(c14.getCode(),"!(bleu)");
		assertNotNull(c15.getCode());
		assertEquals(c15.getCode(),"(bleu) || (bleu)");
		assertNotNull(c16.getCode());
		assertEquals(c16.getCode(),"(bleu) && (bleu)");
		assertNotNull(c17.getCode());
		assertEquals(c17.getCode(),"(bleu) <= (bleu)");
		assertNotNull(c18.getCode());
		assertEquals(c18.getCode(),"(bleu) < (bleu)");
		assertNotNull(c19.getCode());
		assertEquals(c19.getCode(),"(bleu) >= (bleu)");
		assertNotNull(c20.getCode());
		assertEquals(c20.getCode(),"(bleu) > (bleu)");
		assertNotNull(c21.getCode());
		assertEquals(c21.getCode(),"(bleu) == (bleu)");
		assertNotNull(c22.getCode());
		assertEquals(c22.getCode(),"(bleu) != (bleu)");
		assertNotNull(c23.getCode());
		assertEquals(c23.getCode(),"Math.random()*(bleu-bleu) + (bleu)");
		assertNotNull(c24.getCode());
		assertEquals(c24.getCode(),"(bleu) + (bleu)");
		assertNotNull(c25.getCode());
		assertEquals(c25.getCode(),"(bleu) - (bleu)");
		assertNotNull(c26.getCode());
		assertEquals(c26.getCode(),"(bleu) * (bleu)");
		assertNotNull(c27.getCode());
		assertEquals(c27.getCode(),"(bleu) / (bleu)");
		assertNotNull(c28.getCode());
		assertEquals(c28.getCode(),"(bleu) % (bleu)");
		assertNotNull(c29.getCode());
		assertEquals(c29.getCode(),"Math.pow(bleu,bleu)");
		assertNotNull(c30.getCode());
		assertEquals(c30.getCode(),"bob.posX");
		assertNotNull(c31.getCode());
		assertEquals(c31.getCode(),"bob.orX");
		assertNotNull(c32.getCode());
		assertEquals(c32.getCode(),"bob.tX");
		assertNotNull(c33.getCode());
		assertEquals(c33.getCode(),"bob.posY");
		assertNotNull(c34.getCode());
		assertEquals(c34.getCode(),"bob.orY");
		assertNotNull(c35.getCode());
		assertEquals(c35.getCode(),"bob.tY");
		assertNotNull(c36.getCode());
		assertEquals(c36.getCode(),"bob.posZ");
		assertNotNull(c37.getCode());
		assertEquals(c37.getCode(),"bob.orZ");
		assertNotNull(c38.getCode());
		assertEquals(c38.getCode(),"bob.tZ");
		assertNotNull(c39.getCode());
		assertEquals(c39.getCode(),"if(bleu){ \nbleu} \nelse{ \nbleu} \n");
		assertNotNull(c40.getCode());
		assertEquals(c40.getCode(),"vert.hulk");
		assertNotNull(c41.getCode());
		assertEquals(c41.getCode(),";");
	}
	
	public void testGenModel(){
		String str1 = "testString";
		AttributeValue val1 = new AttributeValue("testVal");
		m1.addAttribute(str1, val1);
		c42 = Code.genModel(m1);
		c43 = new Code();
		c43.append("function " + m1.getName() + "() {\n");
		c43.append("\tthis." + str1 + " = ");
		c43.append("'" + val1.getCode() + "'");
		c43.append(";\n");
		c43.append("}\n");
		assertEquals(c42.getCode(),c43.getCode());
	}
	
	/*
     * ent.listModifyAttributes() ou ent.listAttributes() ?
     * si on suit bien le raisonnement, on veut recuperer les attributs du premier model
     * pour ensuite les marquer du genre : entity.attr="val"; 
     * et c'est grace a listAttributes qu on les recupere
     */
	public void testGenFuncEntity(){
		String str1 = "test";
		AttributeValue val1 = new AttributeValue("testVal");
		m1.addAttribute(str1, val1);
		e1 =new Entity("testEnt",m1);
		c42= Code.genFuncEntity(e1);
		c43 = new Code();
        c43.append("function gen" + e1.getName() + "() {\n");
        c43.append("\tvar entity = new " + e1.listModels().get(0).getName() + "();\n");
        /* Voir commentaires dans le code de genFuncEntity
         * c43.append("\tentity." + str1 + " = '" + val1.getCode() + "';\n");
         * */
        c43.append("\treturn entity;\n}\n");
        assertEquals(c42.getCode(),c43.getCode());
	}
	
	public void testGenFuncDef(){
		c42 = new Code("codeTest");
		d1 = new Definition("testDef",c42,m1,m1);
		d2 = new Definition("testDef2",c42,m1,m1);
		c43 = Code.genFuncDef(d1);
		c41 = Code.genFuncDef(d2);
		c44 = new Code();
		c44.append("function " + d1.getName() + "(");
		c44.append("arg" + "0");
		c44.append(",");
		c44.append("arg" + "1");
		c44.append(") {\n");
        c44.append(c42.getCode());
        c44.append("}\n\n");
		assertEquals(c43.getCode(), c44.getCode());
		assertNotSame(c41.getCode(), c43.getCode());
		assertNotSame(c41.getCode(), c44.getCode());
	}
	
	public void testGenEntity(){
		String str1 = "testString";
		AttributeValue val1 = new AttributeValue("testVal");
		m1.addAttribute(str1, val1);
		e1 =new Entity("testLol",m1);
		c41 = Code.genEntity(new Entity("testEnt"));
		c42 = Code.genEntity(e1);
		c43 = new Code();
		c43.append(e1.getName() + " = gen" + e1.getName() + "();\n");
		assertEquals(c42.getCode(), c43.getCode());
		assertNotSame(c41.getCode(), c42.getCode());
		assertNotSame(c41.getCode(), c43.getCode());
	}
	
	public void testGenFuncCall(){
		params.add("testParam1");
		params.add("testParam2");
		params.add("testParam3");
		c41 = Code.genFuncCall("testFuncCall", params);
		params.add("testParam4");
		c42 = Code.genFuncCall("testFuncCall", params);
		c43 = new Code();
		c43.append("testFuncCall");
    	c43.append("(");
    	c43.append(params.get(0));
    	c43.append(",");
    	c43.append(params.get(1));
    	c43.append(",");
    	c43.append(params.get(2));
    	c43.append(",");
    	c43.append(params.get(3));
    	c43.append(");\n");
    	assertEquals(c42.getCode(), c43.getCode());
		assertNotSame(c41.getCode(), c42.getCode());
		assertNotSame(c41.getCode(), c43.getCode());
	}
	
	public void testGenAddObject(){
		String str1 = "testString";
		AttributeValue val1 = new AttributeValue("testVal");
		m1.addAttribute(str1, val1);
		e1 =new Entity("testLol",m1);
		e1.addAttribute("posX", new AttributeValue("val1"));
		e1.addAttribute("posY", new AttributeValue("val2"));
		e1.addAttribute("posZ", new AttributeValue("val3"));
		e1.addAttribute("orX", new AttributeValue("val4"));
		e1.addAttribute("orY", new AttributeValue("val5"));
		e1.addAttribute("orZ", new AttributeValue("val6"));
		e1.addAttribute("sizeX", new AttributeValue("val7"));
		c41 = Code.genAddObject(e1);
		e1.addAttribute("sizeX", new AttributeValue("val8"));
		c42 = Code.genAddObject(e1);
		assertNotSame(c41.getCode(), c42.getCode());
	}
	
	public void testGenTab(){
		Integer i = 5;
		Integer i2 = 6;
		Integer i3 = null;
		c40 = Code.genTab("testGenTab", i3);
		c41 = Code.genTab("testGenTab", i2);
		c42 = Code.genTab("testGenTab", i);
		assertNotSame(c42.getCode(), c41.getCode());
		assertEquals(c40.getCode(),"testGenTab= new Array();");
	}
	
	public void testGenClearInterval(){
		c41 = Code.genClearInterval("testClear");
		c42 = Code.genClearInterval("testClear2");
		assertEquals(c41.getCode(),"clearInterval(testClear);\n");
		assertNotSame(c42.getCode(), c41.getCode());
	}
	
	public void testGenSetInterval(){
		c41 = Code.genSetInterval("code", "testSet");
		c42 = Code.genSetInterval("code2", "testSet");
		c43 = Code.genSetInterval("code", "testSet2");
		assertEquals(c41.getCode(),"setInterval(code,testSet);\n");
		assertNotSame(c42.getCode(), c41.getCode());
		assertNotSame(c43.getCode(), c41.getCode());
		assertNotSame(c42.getCode(), c43.getCode());
	}
	
	public void testGenRefreshLoop(){
		c41 = Code.genRefreshLoop();
		assertNotSame(c41.getCode(),null);
	}
	
	public void testGenSetTimeout(){
		
	}
}
