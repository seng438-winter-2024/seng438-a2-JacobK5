package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;
import org.jmock.*;
import org.jfree.data.KeyedValues;

public class GetCumulativePercentagesTest extends DataUtilities {
    
	@Test
	public void getCumulativePercentagesForFirstValue() {
		/**
	     * Test case to verify the correctness of the cumulative percentage calculation for the first value.
	     * This test focuses on testing equivalence classes
	     * Parameters:
		 *
	     * 5,9 and 2 are the values passed
	     * 
	     * Returns:
	     * The cumulative percentage value for the first key-value pair, 
	     * expecting 0.3125
	     * 
	     * Test Status:
	     * Failed. Returns 0.4545 instead of 0.3125
	     */
		Mockery keyedValuesMock = new Mockery();
		//Mock KeyValues instance
		final KeyedValues data = keyedValuesMock.mock(KeyedValues.class);
		
		keyedValuesMock.checking(new Expectations() {{
			atLeast(1).of(data).getItemCount();
			will(returnValue((3)));
			
			allowing(data).getValue(0);
			will(returnValue(5));
			allowing(data).getValue(1);
			will(returnValue(9));
			allowing(data).getValue(2);
			will(returnValue(2));
			
			allowing(data).getKey(0);
			will(returnValue(0));
			allowing(data).getKey(1);
			will(returnValue(1));
			allowing(data).getKey(2);
			will(returnValue(2));
			
		}});
		//Perform test
		KeyedValues Result = DataUtilities.getCumulativePercentages(data);
		//Verify the result
		assertEquals("The value at index 0 should be 0.3125", 0.3125, Result.getValue(0));
	}

	
	 /**
     * Test case to verify the correctness of the cumulative percentage calculation for the last value.
     * This test focuses on testing equivalence class
     * Parameters:
     * 5,9 and 2 are passed to the method
     * 
     * Returns:
     * - The cumulative percentage value for the last key-value pair, expecting 1.0
     * 
     * Test status:
     * Failed. Returns 1.4545 instead of 1.0
     */
	@Test
	public void getCumulativePercentageShouldBeOneHundredPercent() {
		
		Mockery keyedValuesMock = new Mockery();
		final KeyedValues data = keyedValuesMock.mock(KeyedValues.class);
		
		
		keyedValuesMock.checking(new Expectations() {{
			atLeast(1).of(data).getItemCount();
			will(returnValue((3)));
			
			allowing(data).getValue(0);
			will(returnValue(5));
			allowing(data).getValue(1);
			will(returnValue(9));
			allowing(data).getValue(2);
			will(returnValue(2));
			
			allowing(data).getKey(0);
			will(returnValue(0));
			allowing(data).getKey(1);
			will(returnValue(1));
			allowing(data).getKey(2);
			will(returnValue(2));
			
		}});
		
		
		KeyedValues Result = DataUtilities.getCumulativePercentages(data);
		assertEquals("The value at index 2 should be 1.0", 1.0, Result.getValue(2));
	}
	
	
	 /**
     * Test case to verify the correctness of the cumulative percentage calculation for 0 input.
     * This test ensures boundary class testing with 0 as an input
     * Parameters:
     * 0 passed to the method.
     * 
     * Returns:
     * - An empty KeyedValues instance, indicating 0 items
     * 
     * Test Status :
     * Passed. 
     *
     */
	
	@Test
	public void getCumulativePercentageForEmptyInputShouldBeZero() {
	    Mockery keyedValuesMock = new Mockery();
	    final KeyedValues data = keyedValuesMock.mock(KeyedValues.class);
	    
	    keyedValuesMock.checking(new Expectations() {{
	        atLeast(1).of(data).getItemCount();
	        will(returnValue(0)); // Set the item count to 0 for an empty input
	        
	    }});
	    
	    KeyedValues Result = DataUtilities.getCumulativePercentages(data);
	    assertEquals("The result should be an empty KeyedValues instance", 
	                 0, Result.getItemCount());
	}
	
	/**
     * Test case to verify the behavior of the method when a null object is passed in for the first parameter.
     * This test ensures boundary class testing with null input
     * Parameters:
     * - Mocked KeyedValues instance set to null
     * 
     * Returns:
     * - Expects an IllegalParameterException to be thrown
     * 
     * Test Status:
     * Passed.
     */
	
	@Test (expected = IllegalArgumentException.class)
	public void getCumulativePercentageNullDataObject() {
	DataUtilities.getCumulativePercentages(null);
	}

	
}
