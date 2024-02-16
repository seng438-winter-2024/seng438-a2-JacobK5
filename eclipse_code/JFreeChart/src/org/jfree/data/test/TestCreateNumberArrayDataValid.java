package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.junit.Before;
import org.junit.Test;

public class TestCreateNumberArrayDataValid extends DataUtilities {
	double[] data;
	
	@Before
	public void setUp() throws Exception {
		// set up data as a double array with 3 values
		data = new double[3];
		data[0] = 0.0;
		data[1] = 1.1;
		data[2] = 2.2;
	}

	@Test()
	public void test() {
		// this test covers the valid equivalence class for variable data
		// result: fails because the last value isn't copied over to the numberArray
		Number[] numberArray = DataUtilities.createNumberArray(data);
		Number[] expected = new Number[3];
		expected[0] = 0.0;
		expected[1] = 1.1;
		expected[2] = 2.2;
		assertArrayEquals(expected, numberArray);
	}

}
