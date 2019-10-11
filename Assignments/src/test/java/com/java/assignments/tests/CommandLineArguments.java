package com.java.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.assignments.CommandLineArgumentsMain;

public class CommandLineArguments {

	@Test
	public void testCommandLineArguments() {
	 assertArrayEquals(new int []{1,2,3 },CommandLineArgumentsMain.argument());
		
	
}

}
