package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class TestCalculateColumnTotalDataValidColumnValid extends DataUtilities {
	private Values2D data;

	@Before
	public void setUp() throws Exception {
		// mock data to have one column that has a total of 40
		Mockery mockingContext = new Mockery();
		data = mockingContext.mock(Values2D.class);
	    mockingContext.checking(new Expectations() {
	    	{
	             oneOf(data).getRowCount();
	             will(returnValue(3));
	             oneOf(data).getValue(0, 0);
	             will(returnValue(15));
	             oneOf(data).getValue(1, 0);
	             will(returnValue(5));
	             oneOf(data).getValue(2, 0);
	             will(returnValue(20));
	         }
	     });
	}

	@Test
	public void test() {
		// this test covers the valid equivalence classes for variables column, and data
		// result: passes
		double result = DataUtilities.calculateColumnTotal(data, 0);
	     assertEquals(40.0, result, .000000001d);
	}

}
