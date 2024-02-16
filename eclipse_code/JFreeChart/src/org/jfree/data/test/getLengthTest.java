package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

//-------The getLengthTest follows the order of test listed in the Test cases Developed section--//
//Equivalence class for valid Input:getLengthOfTwoNegativeInputs,getLengthOfOneNegativeOneZero,getLengthOfOneZeroOnePositive,getLengthBetweenZeroes,getLengthBetweenTwoPositives
//Equivalence class for invalid Input:
//Boundary Value Test: getLengthBetweenUpperBoundExtreme, getLengthBetweenLowerBoundExtreme, getLengthBetweenExtreme
public class getLengthTest {
	private Range exampleRange;
	
	
	    
	    //this test verifies that the getLength():double function successfully returns the correct length 
	    //between the range of two negative double numbers.
	    //Test case [-4.0,-3.0]
	    //Expected Length 1.0
	    //Test Result:Passed. 
	    @Test
	    public void getLengthOfTwoNegativeInputs() {
	    	exampleRange = new Range(-4.0,-3.0);
	    	double actual = exampleRange.getLength();
	        double expected = 1.0;
	      	assertEquals("the range between the lower and upper bound is 1.0",expected,actual,.000000001d);
	      }
	      
	    //this test verifies whether the getLength():double function successfully returns the correct range between
	    //between the range of one negative double number, and 0  
	    // Test case[-10.0,0]
	    //Expected Length 10.0
	    //Test Result: Passed.     
	    @Test
	    public void getLengthOfOneNegativeOneZero() {
	    	  exampleRange = new Range(-10.0,0.0);
	    	  double actual = exampleRange.getLength();
	    	  double expected = 10.0;
	    	  assertEquals("the range between the lower and upper bound is 10.0",expected,actual,.000000001d);
	    }
	             
	    //this test verifies whether the getLength():double function successfully returns the correct range between
	    //between the range of 0, and one positive double number  
	    // Test case[0.0,140.0]
	    //Expected Length 140.0
	    //Test Result: Passed.     
		@Test
		public void getLengthOfOneZeroOnePositive() {
			exampleRange = new Range(0.0,140.0);
			double actual = exampleRange.getLength();
			double expected = 140.0;
			assertEquals("the range between the lower and upper bound is 140.0",expected,actual,.000000001d);
		}
		
		//this test verifies whether the getLength():double function successfully returns the correct range between
	    //between the range of 0 and 0   
	    // Test case[0.0,0.0]
	    //Expected Length 0.0
	    //Test Result:passed      
		@Test
		public void getLengthBetweenZeroes() {
			exampleRange = new Range(0.0,0.0);
			double actual = exampleRange.getLength();
			double expected = 0.0;
			assertEquals("the range between the lower and upper bound is 0.0",expected,actual,.000000001d);
		}

		
		
		//this test verifies whether the getLength():double function successfully returns the correct range between
	    //between the range of two positive values 100.0 and 119.0   
	    // Test case[100.0,119.0]
	    //Expected Length 19.0
	    //Test Result:passed      
		@Test
		public void getLengthBetweenTwoPositives() {
			exampleRange = new Range(100.0,119.0);
			double actual = exampleRange.getLength();
			double expected = 19.0;
			assertEquals("the range between the lower and upper bound is 19.0",expected,actual,.000000001d);
		}
	    
		
		//this test verifies whether the getLength():double function successfully returns the correct range between extreme value UpperBound and another value 
	    // Test case[-3.0,10000000000.0]
	    //Expected Length 10000000003.0
	    //Test Result:passed      
		@Test
		public void getLengthBetweenUpperBoundExtreme() {
			exampleRange = new Range(-3.0,10000000000.0);
			double actual = exampleRange.getLength();
			double expected = 10000000003.0;
			assertEquals("the range between the lower and upper bound is 10000000003.0",expected,actual,.000000001d);
		}
		
		
		
		//this test verifies whether the getLength():double function successfully returns the correct range between extreme value LowerBound and another value
	    // Test case[-3333399999.0,-99999.0]
	    //Expected Length 30000000003.0
	    //Test Result:passed      
		@Test
		public void getLengthBetweenLowerBoundExtreme() {
			exampleRange = new Range(-3333399999.0,-99999.0);
			double actual = exampleRange.getLength();
			double expected = 3333300000.0;
			assertEquals("the range between the lower and upper bound is 3333300000.0",expected,actual,.000000001d);
		}
	    
		
		//this test verifies whether the getLength():double function successfully returns the correct range between extreme values for both
		//the UpperBound and LowerBound
	    // Test case[-999999999999999.0,999999999999999.0]
	    //Expected Length 10000000003.0
	    //Test Result:passed      
		@Test
		public void getLengthBetweenExtreme() {
			exampleRange = new Range(-999999999999999.0,999999999999999.0);
			double actual = exampleRange.getLength();
			double expected = 1999999999999998.0;
			assertEquals("the range between the lower and upper bound is 1999999999999998.0",expected,actual,.000000001d);
		}
	

}
