package com.java.itransform.assignment.testexception;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.itransform.assignment.Factorial;
import com.java.itransform.assignment.exception.InvalidInputException;

public class TestFactorial {
	Scanner sc= new Scanner(System.in);
	int number;
	@Before
	public void inputNumber() {
		System.out.println("enter the no");
		number=sc.nextInt();
		
	}

	@Test
	public void testNumberIsGreaterThan2() {
		assertEquals(Factorial.getFactorial(number),Factorial.getFactorial(number));
	}
	
	@Test
	public void testNumberIsLessThan2() throws InvalidInputException  {
		assertEquals(Factorial.getFactorial(number),Factorial.getFactorial(number));
	}
	
		@After
      public void endTest() {
	       sc.reset();
  
}
}
