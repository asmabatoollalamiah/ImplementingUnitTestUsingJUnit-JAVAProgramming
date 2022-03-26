package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DivideTest {

	@Test
	public void positiveTest() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(100, 5);
		assertEquals(20.0, output);
	}
	
	@Test(expected = ArithmeticException.class)
	public void negativeTest() {
		JunitTesting test = new JunitTesting();
		test.divide(15, 0);
		
	}

}
