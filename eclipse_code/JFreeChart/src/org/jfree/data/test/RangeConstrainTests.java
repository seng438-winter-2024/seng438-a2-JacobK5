package org.jfree.data.test;

import static org.junit.Assert.*; 
import org.jfree.data.Range; 
import org.junit.*;

/**
 * Test class for the Range class's constrain method.
 */
public class RangeConstrainTests {

    // The Range object used for testing
    public Range exampleRange;

    // Set up the Range object before each test
    @Before
    public void setUp() throws Exception { 
        exampleRange = new Range(-1, 1);
    }

    // Set up any resources needed before all tests (not used in this example)
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    // Test case: Constrain a value that is within the range (Equivalence Class: Values within the range)
    @Test
    public void constrainInRange() {
        // Parameters: 0 (value to be constrained)
        // Returns: 0 (the constrained value)
        // Passes: Yes
        assertEquals("Constrained value should be 0 for values within the range", 0, exampleRange.constrain(0), 0.0001d);
    }

    // Test case: Constrain a value equal to the upper bound of the range (Equivalence Class: Value equal to upper bound)
    @Test
    public void constrainUpperBound() {
        // Parameters: 1 (value to be constrained)
        // Returns: 1 (the constrained value)
        // Passes: Yes
        assertEquals("Constrained value should be 1 for values equal to the upper bound", 1, exampleRange.constrain(1), 0.0001d);
    }

    // Test case: Constrain a value equal to the lower bound of the range (Equivalence Class: Value equal to lower bound)
    @Test
    public void constrainLowerBound() {
        // Parameters: -1 (value to be constrained)
        // Returns: -1 (the constrained value)
        // Passes: Yes
        assertEquals("Constrained value should be -1 for values equal to the lower bound", -1, exampleRange.constrain(-1), 0.0001d);
    }

    // Test case: Constrain a value that is toward the lower bound of the range (Boundary Value: Value near lower bound)
    @Test
    public void constrainTowardLowerBound() {
        // Parameters: -6544.34 (value to be constrained)
        // Returns: -1 (the correctly constrained value)
        // Passes: No because it returns 0.0 where it should return -1.0
        assertEquals("Constrained value should be -1 for values toward the lower bound", -1, exampleRange.constrain(-6544.34), 0.0001d);
    }

    // Test case: Constrain a value that is toward the upper bound of the range (Boundary Value: Value near upper bound)
    @Test
    public void constrainTowardUpperBound() {
        // Parameters: 6544.34 (value to be constrained)
        // Returns: 1 (the correctly constrained value)
        // Passes: Yes
        assertEquals("Constrained value should be 1 for values toward the upper bound", 1, exampleRange.constrain(6544.34), 0.0001d);
    }
    
    // Clean up any resources after each test (not used in this example)
    @After
    public void tearDown() throws Exception {
    }

    // Clean up any resources after all tests (not used in this example)
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
