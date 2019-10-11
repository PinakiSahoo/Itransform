package addition.test;

import static org.junit.Assert.*;

import org.junit.Test;

import addition.main.Calculator;

public class Addition {

	@Test
	public void testAdditionTwoNumbers() {
		assertEquals(4,Calculator.getN1()+Calculator.n2);
		
	}

}
