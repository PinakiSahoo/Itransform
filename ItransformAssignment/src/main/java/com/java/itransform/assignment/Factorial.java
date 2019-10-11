package com.java.itransform.assignment;

import com.java.itransform.assignment.exception.InvalidInputException;

public class Factorial {

	public static int getFactorial(int number) {
		int fact=1;
		try {
			if (number<2)throw new InvalidInputException("invvalid");
			else {
				for(int i=number;i>=2;i--) {
					fact*=i;
				}
			}
		}
		
		catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
	
	         return fact;
}
}
