package tests;

import code.Code;
import symbols.Model;
import junit.framework.TestCase;

public class CodeTest extends TestCase {
	Code c1;
	Code c2;
	Code c3;
	Code c4;
	Code c5;
	Code c6;
	Code c7;
	Code c8;
	Code c9;
	Code c10;
	Code c11;
	Code c12;
	Code c13;
	Code c14;
	Code c15;
	Code c16;
	Code c17;
	Code c18;
	Code c19;
	Code c20;
	Code c21;
	Code c22;
	Code c23;
	Code c24;
	Code c25;
	Code c26;
	Code c27;
	Code c28;
	Code c29;
	Code c30;
	Code c31;
	Code c32;
	Code c33;
	Code c34;
	Code c35;
	Code c36;
	Code c37;
	Code c38;
	Code c39;
	Code c40;
	Code c41;
	Model m1;
	Code c42;
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
		//m1 = new Model("ab");
		//test sur Model cause erreurs ou NullPointerException
		//c42 = Code.genModel(new Model("abc"));
		}
	public void testAppend(){
		System.out.println(c2);
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
		//System.out.println(c42);
	}
}
