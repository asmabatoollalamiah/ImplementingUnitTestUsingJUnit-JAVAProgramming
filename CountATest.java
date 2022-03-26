package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("javaBean");
		assertEquals(3, output);
	}

}
