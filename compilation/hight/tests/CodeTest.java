package tests;

import attributes.AttributeValue;
import code.Code;
import code.SymbolTable;
import symbols.Model;
import junit.framework.TestCase;


public class CodeTest extends TestCase {
	Code c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41;
	Model m1;
	Code c42, c43;
	SymbolTable tabSymb;
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
	
	// Ne marche pas, on voit pas trop pourquoi...
	public void testGenModel(){
		String str1 = "test";
		AttributeValue val1 = new AttributeValue("test");
		m1.addAttribute(str1, val1);
		c42 = Code.genModel(m1);
		c43 = new Code();
		c43.append("function " + m1.getName() + "() {\n");
		c43.append("\tthis." + str1 + " = ");
		c43.append("'" + val1.getCode() + "'");
		c43.append(";\n");
		c43.append("}\n");
		assertEquals(c42,c43);
	}
}
