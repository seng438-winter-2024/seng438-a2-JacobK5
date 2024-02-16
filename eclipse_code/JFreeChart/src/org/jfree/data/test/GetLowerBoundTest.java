package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range; 
import org.junit.*;

public class GetLowerBoundTest {

	/**
     * Test case to verify the correctness of the lower bound for two negative numbers.
     *
     * Test Strategy:
     * This test focuses on equivalence class testing with two negative numbers.
     *
     * Parameters:
     * - Example Range instance initialized with lower and upper bounds both set to -3 and -1.
     * 
     * Returns:
     * - The lower bound value, expecting -3.
     * 
     * Test status: 
     * Passed
     */
	
    @Test
    public void lowerBoundForTwoNegNumbers() {
    	final Range exampleRange = new Range(-3,-1);
    	assertEquals("The lower bound value of -3 and -1 should be -3",
    	-3, exampleRange.getLowerBound(), .000000001d);
    }
    /**
     * Test case to verify the correctness of the lower bound for two positive numbers.
     *
     * Test Strategy:
     * This test focuses on equivalence class testing with two positive numbers.
     *
     * Parameters:
     * - Example Range instance initialized with lower bound set to 1 and upper bound set to 10.
     * 
     * Returns:
     * - The lower bound value, expecting 1.
     * Test status: 
     * Passed
     */
    @Test
    public void lowerBoundForTwoPosNumbers() {
    	final Range exampleRange = new Range(1,10);
    	assertEquals("The lower bound value of 1 and 10 should be 1",
    	1, exampleRange.getLowerBound(), .000000001d);
    }
    /**
     * Test case to verify the correctness of the lower bound for extreme positive numbers.
     *
     * Test Strategy:
     * This test focuses on boundary class testing with an extreme positive number.
     *
     * Parameters:
     * - Example Range instance initialized with lower bound set to 9999999 and upper bound set to positive infinity.
     * 
     * Returns:
     * - The lower bound value, expecting 9999999.
     * 
     * Test status: 
     * Passed
     */
    @Test
    public void lowerBoundForExtremePosNumbers() {
    	final Range exampleRange = new Range(9999999,Double.POSITIVE_INFINITY);
    	assertEquals("The lower bound value of 9999999 and Positive Infinity should be 9999999 ",
    	9999999, exampleRange.getLowerBound(), .000000001d);
    }
    /**
     * Test case to verify the correctness of the lower bound for extreme negative numbers.
     *
     * Test Strategy:
     * This test focuses on boundary class testing with an extreme negative number
     *
     * Parameters:
     * - Example Range instance initialized with lower bound set to negative infinity and upper bound set to 10000000.
     * 
     * Returns:
     * - The lower bound value, expecting negative infinity.
     * 
     * Test status: 
     * Passed
     */
    @Test
    public void lowerBoundForExtremeNegNumbers() {
    	final Range exampleRange = new Range(Double.NEGATIVE_INFINITY,10000000);
    	assertEquals("The lower bound value of Negative Infinity and 10000000 should be Negative Infinity ",
    	Double.NEGATIVE_INFINITY, exampleRange.getLowerBound(), .000000001d);
    }
    
    
}


