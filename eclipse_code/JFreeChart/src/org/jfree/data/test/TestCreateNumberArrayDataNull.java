package org.jfree.data.test;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class TestCreateNumberArrayDataNull extends DataUtilities {
	// set data as null
	double[] data = null;

	@Test(expected = InvalidParameterException.class)
	public void test() {
		// this test covers the invalid equivalence class for variable data
		// result: fails because it throws IllegalArgumentException instead of InvalidParameterException
		Number[] numberArray = DataUtilities.createNumberArray(data);
	}

}
