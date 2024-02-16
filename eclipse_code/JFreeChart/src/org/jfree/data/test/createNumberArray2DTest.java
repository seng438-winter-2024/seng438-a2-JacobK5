package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;


//-------The createNumberArray2DTest follows the order of test listed in the Test cases Developed section--//
//Equivalence class testing for valid Input : test_createNumberArray2DValidParameter, test_createNumberArray2DSingleRow, test_createNumberArray2DSingleColumn,test_createNumberArray2DNegativeValues,test_createNumberArray2DZeroValues,test_createNumberArray2DPositiveValues 
//Equivalence class testing for Invalid Input: test_createNumberArray2DInvalidParameter
//Boundary Value Testing: test_createNumberArray2DPositiveExtreme, test_createNumberArray2DNegativeExtreme
public class createNumberArray2DTest {

	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //throws an exception when giving an invalid data(null value) as a parameter.
	 //Expected Result:throws an IllegalArgumentException 
	 //Test Result:failed because it threw an IllegalArgumentException instead of InvalidParameterException
	 @Test
	 (expected = InvalidParameterException.class)
	 public void test_createNumberArray2DInvalidParameter() {
		double [][] data = null;
		Number[][] num  = DataUtilities.createNumberArray2D(data);		
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving a double 2D array as a parameter.
	 //Test case {{1.0,2.0},{3.0,4.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[row][column] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DValidParameter(){
	  	double [][] expected = {{1.0,2.0},{3.0,4.0}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
	  	assertEquals("check whether both arrays have same row dimension",expected.length,actual.length);
	  	for(int i = 0; i<expected.length;i++ ) {
	  		assertEquals("check columns in each row whether the two arrays have same dimension",expected[i].length,actual[i].length);
	  	}
	  	
	  	for(int row=0;row<expected.length;row++) {
	  		for(int column=0;column<expected[row].length;column++) {
	  			assertEquals("values of indicies are identical ",expected[row][column],actual[row][column].doubleValue(),.000000001d);
	  		}
	  	}
	  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving a single row double 2D array as a parameter.
	 //Test case {{1.0,2.0,3.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][2] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DSingleRow(){
	  	double [][] expected = {{1.0,2.0,3.0}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
	  	assertEquals("There is one row",1,actual.length);
	  	assertEquals("Number of columns",expected[0].length,actual[0].length);
	  	
	  	for(int column=0;column<expected[0].length;column++) {
	  		assertEquals("values of indicies are identical",expected[0][column],actual[0][column].doubleValue(),.000000001d);
	  	}
	  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving a single column double 2D array as a parameter.
	 //Test case {{1.0},{2.0},{3.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][0],[1][0],[2][0] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DSingleColumn(){
	  	double [][] expected = {{1.0},{2.0},{3.0}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
	  	assertEquals("Number of Rows",expected.length,actual.length);
	  	assertEquals("There is one column",1,actual[0].length);
	  	
	  	for(int row=0;row<expected.length;row++) {
	  		assertEquals("values of indicies are identical",expected[row][0],actual[row][0].doubleValue(),.000000001d);
	  	}
	  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving an array of negative values of double 2D array as a parameter.
	 //Test case {{-3.0,-2.0,-10.0},{-7.0,-40.0,-100.0},{-34.0,-2.0,-0.1}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][2],[1][2],[2][2] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DNegativeValues(){
	  	double [][] expected = {{-3.0,-2.0,-10.0},{-7.0,-40.0,-100.0},{-34.0,-2.0,-0.1}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
		assertEquals("check whether both arrays have same row dimension",expected.length,actual.length);
	  	for(int i = 0; i<expected.length;i++ ) {
	  		assertEquals("check columns in each row whether the two arrays have same dimension",expected[i].length,actual[i].length);
	  	}
	  	
	  	for(int row=0;row<expected.length;row++) {
	  		for(int column=0;column<expected[row].length;column++) {
	  			assertEquals("values of indicies are identical ",expected[row][column],actual[row][column].doubleValue(),.000000001d);
	  		}
	  	}
	  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving an array of zero values of double 2D array as a parameter.
	 //Test case {{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][2],[1][2],[2][2] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DZeroValues(){
	  	double [][] expected = {{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
		assertEquals("check whether both arrays have same row dimension",expected.length,actual.length);
	  	for(int i = 0; i<expected.length;i++ ) {
	  		assertEquals("check columns in each row whether the two arrays have same dimension",expected[i].length,actual[i].length);
	  	}
	  	
	  	for(int row=0;row<expected.length;row++) {
	  		for(int column=0;column<expected[row].length;column++) {
	  			assertEquals("values of indicies are identical ",expected[row][column],actual[row][column].doubleValue(),.000000001d);
	  		}
	  	}
	  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving an array of positive values of double 2D array as a parameter.
	 //Test case {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][2],[1][2],[2][2] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DPositiveValues(){
		  	double [][] expected = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
			assertEquals("check whether both arrays have same row dimension",expected.length,actual.length);
		  	for(int i = 0; i<expected.length;i++ ) {
		  		assertEquals("check columns in each row whether the two arrays have same dimension",expected[i].length,actual[i].length);
		  	}

		  	for(int row=0;row<expected.length;row++) {
		  		for(int column=0;column<expected[row].length;column++) {
		  			assertEquals("values of indicies are identical ",expected[row][column],actual[row][column].doubleValue(),.000000001d);
		  		}
		  	}  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving an array of positive extreme values of double 2D array as a parameter.
	 //Test case {{10000000000.0},{20000000000.0},{30000000000.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][0],[1][0],[2][0] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DPositiveExtreme(){
	  	double [][] expected = {{10000000000.0},{20000000000.0},{30000000000.0}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
		assertEquals("check whether both arrays have same row dimension",expected.length,actual.length);
	  	for(int i = 0; i<expected.length;i++ ) {
	  		assertEquals("check columns in each row whether the two arrays have same dimension",expected[i].length,actual[i].length);
	  	}
	  	for(int row=0;row<expected.length;row++) {
	  		for(int column=0;column<expected[row].length;column++) {
	  			assertEquals("values of indicies are identical ",expected[row][column],actual[row][column].doubleValue(),.000000001d);
	  		}
	  	}
	  		  		  	
	 }
	 
	 //This test case is to check createNumberArray2D(double[][]):Number[][]
	 //successfully creates a Number 2D array when receiving an array of negative extreme values of double 2D array as a parameter.
	 //Test case {{-10000000000.0},{-20000000000.0},{-30000000000.0}}
	 //Expected Result: Passes
	 //Test Result:failed because function is incorrect, actual[0][0],[1][0],[2][0] is not null but system prints as null
	 @Test
	 public void test_createNumberArray2DNegativeExtreme(){
	  	double [][] expected = {{-10000000000.0},{-20000000000.0},{-30000000000.0}};
	  	Number [][] actual =DataUtilities.createNumberArray2D(expected);
		assertEquals("check whether both arrays have same row dimension",expected.length,actual.length);
	  	for(int i = 0; i<expected.length;i++ ) {
	  		assertEquals("check columns in each row whether the two arrays have same dimension",expected[i].length,actual[i].length);
	  	}
	  	
	  	for(int row=0;row<expected.length;row++) {
	  		for(int column=0;column<expected[row].length;column++) {
	  			assertEquals("values of indicies are identical ",expected[row][column],actual[row][column].doubleValue(),.000000001d);
	  		}
	  	}
	  		  		  	
	 }
	 
	 

}
