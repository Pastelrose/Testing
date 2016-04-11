package simpletest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimcalcTest {

	@Test
	public void testAdd() {
		Simcalc calc = new Simcalc();
		calc.add(10,20);
		assertEquals(30,calc.getResult());
	}
	@Test
	public void testSub() {
		Simcalc calc = new Simcalc();
		calc.sub(10,20);
		assertEquals(-10,calc.getResult());	
	}
	@Test

	public void testMul() {
		Simcalc calc = new Simcalc();
		calc.mul(10,20);
		assertEquals(200,calc.getResult());	
	}

	public void testDiv() {
		Simcalc calc = new Simcalc();
		calc.div(100,20);
		assertEquals(5,calc.getResult());
	
	}



}
