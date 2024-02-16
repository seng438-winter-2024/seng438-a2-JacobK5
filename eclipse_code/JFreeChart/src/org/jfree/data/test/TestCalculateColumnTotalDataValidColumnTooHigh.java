package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class TestCalculateColumnTotalDataValidColumnTooHigh extends DataUtilities {
	private Values2D data;

	@Before
	public void setUp() throws Exception {
		// mock data to have only one column and throw an exception if you try to get a value in column 1
		Mockery mockingContext = new Mockery();
		data = mockingContext.mock(Values2D.class);
	    mockingContext.checking(new Expectations() {
	    	{
	             oneOf(data).getRowCount();
	             will(returnValue(3));
	             allowing(data).getValue(with(any(Integer.class)), with(1));
	             will(throwException(new IndexOutOfBoundsException()));
	         }
	     });
	}

	@Test
	public void test() {
		// this test covers the out of bounds equivalence class for variable column,
		// the data isn't expected to influence the behavior
		// result: fails because it throws IndexOutOfBoundsException instead of returning 0
		double result = DataUtilities.calculateColumnTotal(data, 1);
		assertEquals(0, result, .000000001d);
	}

}
