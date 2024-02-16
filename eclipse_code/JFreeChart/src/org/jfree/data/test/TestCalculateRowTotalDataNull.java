package org.jfree.data.test;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.junit.Test;

public class TestCalculateRowTotalDataNull extends DataUtilities {
	// set data as null
	private Values2D data = null;

	@Test(expected = InvalidParameterException.class)
	public void test() {
		// this test covers the invalid equivalence class for variable data,
		// the column number isn't expected to influence the behavior
		// result: fails because it throws NullPointerException instead of InvalidParameterException
		DataUtilities.calculateRowTotal(data, 0);
	}

}
