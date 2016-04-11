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

}
