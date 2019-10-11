package com.assign.lambdaexpressions.main;

import com.assign.lambdaexpressions.model.MathOperations;

public  class Operations {
	public static void main(String[] args) {
		MathOperations add=(a,b)->a+b;
		MathOperations subtract=(a,b)->a-b;
		MathOperations multiply=(a,b)->a*b;
		MathOperations divide=(a,b)->a/b;
		System.out.println("addition of the two no is:"+add.operation(12,3));
		System.out.println("addition of the two no is:"+subtract.operation(12,3));
		System.out.println("addition of the two no is:"+multiply.operation(12,3));
		System.out.println("addition of the two no is:"+divide.operation(12,3));
		
	}

}
