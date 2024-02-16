package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

//-------The containsTest follows the order of test listed in the Test cases Developed section--//
//Equivalence class for valid Input: containsPositiveValWithinRange, containsNegativeValWithinRange, 
//Equivalence class for invalid Input:containsValIsNotTrue
//Boundary Value Test: containsValOnUpperBound, containsValOnLowerBound, containsValOnExtremeUpperBound, containsValOnExtremeLowerBound 
public class containsTest {

	//this test verifies whether the contains(double value):boolean returns true when the positive parameter is within the Range
		//Test case range [-400.0,400.0]  double val 200.0
		//Expected result: true
		//Test Result:Passed
		@Test
		public void containsPositiveValWithinRange() {
			Range exampleRange = new Range(-400.0, 400.0);
		    double val = 200.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns true when the negative parameter is within the Range
		//Test case range [-400.0,400.0]  double val -200.0
		//Expected result: true
		//Test Result:Passed
		@Test
		public void containsNegativeValWithinRange() {
			Range exampleRange = new Range(-400.0, 400.0);
		    double val = -200.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns true when value Zero is within the Range
		//Test case range [-400.0,400.0]  double val 0.0
		//Expected result: true
		//Test Result:Passed
		@Test
		public void containsZeroValWithinRange() {
			Range exampleRange = new Range(-400.0, 400.0);
		    double val = 0.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns false when value is out of the Range
		//Test case range [-400.0,400.0]  double val 500.0
		//Expected result: false
		//Test Result:Passed
		@Test
		public void containsValIsNotTrue() {
			Range exampleRange = new Range(-400.0, 400.0);
		    double val = 500.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.FALSE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns true when value is on the upper bound of the Range
		//Test case range [-10000.0,10000.0]  double val 10000.0
		//Expected result: True
		//Test Result:Passed
		@Test
		public void containsValOnUpperBound() {
			Range exampleRange = new Range(-10000.0, 10000.0);
		    double val = 10000.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns true when value is on the lower bound of the Range
		//Test case range [-9999999.0,0.0]  double val -9999999.0
		//Expected result: True
		//Test Result:Passed
		@Test
		public void containsValOnLowerBound() {
			Range exampleRange = new Range(-9999999.0, 0.0);
		    double val = -9999999.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns true when value is extremely high(positive) on the upper bound of the Range
		//Test case range [0.0,10000000000.0]  double val 10000000000.0
		//Expected result: True
		//Test Result:Passed
		@Test
		public void containsValOnExtremeUpperBound() {
			Range exampleRange = new Range(0.0, 10000000000.0);
		    double val = 10000000000.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		//this test verifies whether the contains(double value):boolean returns true when value is extremely low(negative) on the lower bound of the Range
		//Test case range [-10000000000.0,0.0]  double val -10000000000.0
		//Expected result: True
		//Test Result:Passed
		@Test
		public void containsValOnExtremeLowerBound() {
			Range exampleRange = new Range( -10000000000.0,0.0);
		    double val = -10000000000.0;
		    boolean actual = exampleRange.contains(val);
		    assertSame("the value is within the range:  " + val, Boolean.TRUE, actual);
		}
		
		
		

		

}
