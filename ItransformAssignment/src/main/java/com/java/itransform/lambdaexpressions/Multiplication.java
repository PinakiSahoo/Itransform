package com.java.itransform.lambdaexpressions;

public interface Multiplication {
	 
	    // An abstract function 
	    void abstractFun(int x); 
	  
	    default // A non-abstract (or default) function 
	     void normalFun() 
	    { 
	       System.out.println("Hello"); 
	    } 
	} 


