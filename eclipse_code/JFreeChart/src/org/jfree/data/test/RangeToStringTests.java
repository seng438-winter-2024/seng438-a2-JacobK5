package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.*;

/**
 * Test class for the Range class's toString method.
 */
public class RangeToStringTests {

    // Range objects used for testing
    private Range exampleRange1;
    private Range exampleRange2;
    private Range exampleRange3;
    private Range exampleRange4;
    private Range exampleRange5;

    // Set up resources needed before all tests (not used in this example)
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    // Set up the Range objects before each test
    @Before
    public void setUp() throws Exception {
        exampleRange1 = new Range(1.0, 1.0);
        exampleRange2 = new Range(5.0, 10.0);
        exampleRange3 = new Range(-10.0, -5.0);
        exampleRange4 = new Range(-5.0, 10.0);
        exampleRange5 = new Range(-1.0, 1.0);
    }

    // Test case: ToString for a range with similar bounds (Equivalence Class: Similar bounds)
    @Test
    public void toStringSimilarBounds() {
        // Parameters: None
        // Returns: String representation of the range
        // Passes: Yes, it returns "Range[1.0,1.0]
        assertEquals("A String \"Range[lower,upper]\" where lower=lower range and upper=upper range.",
                "Range[1.0,1.0]", exampleRange1.toString());
        System.out.println(exampleRange1.toString());
    }

    // Test case: ToString for a range with positive bounds (Equivalence Class: Positive bounds)
    @Test
    public void toStringPositiveBounds() {
        // Parameters: None
        // Returns: String representation of the range
        // Passes: No because it returns "Range [7.5, 10.0]" where it should return ""Range [5.0, 10.0]"
        assertEquals("A String \"Range[lower,upper]\" where lower=lower range and upper=upper range.",
                "Range[5.0,10.0]", exampleRange2.toString());
        System.out.println(exampleRange2.toString());
    }

    // Test case: ToString for a range with negative bounds (Equivalence Class: Negative bounds)
    @Test
    public void toStringNegativeBounds() {
        // Parameters: None
        // Returns: String representation of the range
        // Passes: No because it returns "Range [-7.5, -5.0]" where it should return "Range [-10.0, -5.0]"
        assertEquals("A String \"Range[lower,upper]\" where lower=lower range and upper=upper range.",
                "Range[-10.0, -5.0]", exampleRange3.toString());
        System.out.println(exampleRange3.toString());
    }

    // Test case: ToString for a range with negative and positive bounds (Equivalence Class: Negative and Positive bounds, Boundary Value: Value near lower bound)
    @Test
    public void toStringNegativePositiveBounds() {
        // Parameters: None
        // Returns: String representation of the range
    	// Passes: No because it returns "Range [2.5, 10.0]" where it should return "Range [-5.0, 10.0]"
    	assertEquals("A String \"Range[lower,upper]\" where lower=lower range and upper=upper range.",
                "Range[-5.0, 10.0]", exampleRange4.toString());
        System.out.println(exampleRange4.toString());
    }

    // Test case: ToString for a base case range (Equivalence Class: Base case, Boundary Value: base case)
    @Test
    public void toStringBaseCase() {
        // Parameters: None
        // Returns: String representation of the range
    	// Passes: No because it returns "Range [0.0, 1.0]" where it should return "Range [-1.0, 1.0]"
        assertEquals("A String \"Range[lower,upper]\" where lower=lower range and upper=upper range.",
                "Range[-1.0, 1.0]", exampleRange5.toString());
        System.out.println(exampleRange5.toString());
    }

    // Clean up resources after each test (not used in this example)
    @After
    public void tearDown() throws Exception {
    }

    // Clean up resources after all tests (not used in this example)
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
