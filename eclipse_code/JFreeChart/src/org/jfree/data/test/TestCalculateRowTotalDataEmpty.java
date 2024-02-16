package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class TestCalculateRowTotalDataEmpty extends DataUtilities {
	private Values2D data;

	@Before
	public void setUp() throws Exception {
		// mock data to be empty
		Mockery mockingContext = new Mockery();
		data = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(data).getRowCount();
				will(returnValue(0));
				one(data).getColumnCount();
				will(returnValue(0));
			}
		});
	}

	@Test()
	public void test() {
		// this test covers a minimum boundary value for variable data (empty),
		// the row number isn't expected to influence the behavior
		// result: passes
		double result = DataUtilities.calculateRowTotal(data, 0);
		assertEquals(0.0, result, .000000001d);
	}

}
