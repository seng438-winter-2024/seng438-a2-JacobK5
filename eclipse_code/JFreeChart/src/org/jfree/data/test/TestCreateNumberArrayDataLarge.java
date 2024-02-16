package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Before;
import org.junit.Test;

public class TestCreateNumberArrayDataLarge extends DataUtilities {
	double[] data;
	final int dataSize = 10000000;
	
	@Before
	public void setUp() throws Exception {
		// set up data as a large double array with random values
		data = new double[dataSize];
		for(int i = 0; i < dataSize; i++) {
			data[i] = Math.random() * 100;
		}
	}

	@Test()
	public void test() {
		// this test covers the large equivalence class for variable data
		// result: fails because the last value isn't copied over to the numberArray
		Number[] numberArray = DataUtilities.createNumberArray(data);
		Number[] expected = new Number[dataSize];
		for(int i = 0; i < dataSize; i++) {
			expected[i] = data[i];
		}
		assertArrayEquals(expected, numberArray);
	}
}
