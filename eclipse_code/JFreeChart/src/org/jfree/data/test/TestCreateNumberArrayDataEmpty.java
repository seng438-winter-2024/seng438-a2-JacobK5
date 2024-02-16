package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Before;
import org.junit.Test;

public class TestCreateNumberArrayDataEmpty extends DataUtilities {
	double[] data;

	@Before
	public void setUp() throws Exception {
		// set up data as an empty array
		data = new double[0];
	}

	@Test
	public void test() {
		// this test covers a minimum boundary value for variable data (empty)
		// result: passes
		Number[] numberArray = DataUtilities.createNumberArray(data);
		assertEquals(0, numberArray.length);
	}

}
