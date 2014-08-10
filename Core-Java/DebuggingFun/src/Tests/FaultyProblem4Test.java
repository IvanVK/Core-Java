package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class FaultyProblem4Test {
	@Test
	public void testFloats() {
		for (int i = 2; i < 97; i++) {
			for (int j = 3; j < i * 17; j++) {
				float a = (float) i / j;
				float b = 1 / ((float) j / i);
				System.out.println(a + ", " + b);
				assertTrue(FaultyProblem4.areEqual(a, b));
			}
		}
	}

	@Test
	public void testAgainFloats() {
		assertTrue(FaultyProblem4.areEqual(0 / 6, 0 / 5));
		assertTrue(FaultyProblem4.areEqual(401 / 399, 1 / (399 / 401)));
	}

	@Test
	public void testInts() {
		assertTrue(FaultyProblem4.areEqual(4, 4));
		assertTrue(FaultyProblem4.areEqual(0, 0));
		assertTrue(FaultyProblem4.areEqual(500, 500));
	}


}