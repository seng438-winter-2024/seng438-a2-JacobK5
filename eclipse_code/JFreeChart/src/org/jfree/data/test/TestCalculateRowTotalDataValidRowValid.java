package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class TestCalculateRowTotalDataValidRowValid extends DataUtilities {
	private Values2D data;

	@Before
	public void setUp() throws Exception {
		// mock data to have one row that has a total of 40
		Mockery mockingContext = new Mockery();
		data = mockingContext.mock(Values2D.class);
	    mockingContext.checking(new Expectations() {
	    	{
	             oneOf(data).getColumnCount();
	             will(returnValue(3));
	             oneOf(data).getValue(0, 0);
	             will(returnValue(15));
	             oneOf(data).getValue(0, 1);
	             will(returnValue(5));
	             oneOf(data).getValue(0, 2);
	             will(returnValue(20));
	         }
	     });
	}

	@Test
	public void test() {
		// this test covers the valid equivalence classes for variables column, and data
		// result: fails because it doesn't include the value of the last column in the row in the sum
		double result = DataUtilities.calculateRowTotal(data, 0);
	     assertEquals(40.0, result, .000000001d);
	}

}
