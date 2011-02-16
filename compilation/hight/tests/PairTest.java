package tests;
import lib.Pair;
import junit.framework.TestCase;

public class PairTest extends TestCase {
Pair p1;
Pair p2;
Pair p3;
	protected void setUp() throws Exception {
		super.setUp();
		p1 = new Pair(3,5);
		p2 = new Pair(3,5);
		p3 = new Pair(3,4);
	}
	public void testHashCode(){
		assertNotNull(p1.hashCode());
		assertEquals(p1.hashCode(),43);
		assertNotNull(p2);
		assertNotNull(p3);
		assertEquals(p1.equals(p2),true);
		assertEquals(p1.equals(p3),false);
		assertEquals(p1.toString(),"(3, 5)");
		assertEquals(p1.getFirst(),3);
		assertEquals(p1.getSecond(),5);
		p1.setFirst(7);
		assertEquals(p1.getFirst(),7);
		p1.setSecond(8);
		assertEquals(p1.getSecond(),8);
	}
}
