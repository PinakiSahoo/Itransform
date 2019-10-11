package com.java.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.assignments.Screener;


public class HellotTest {

	@Test
	public void testHelloWorld() {
		Screener screen = new Screener();
		assertEquals("HelloWorld",Screener.screen());
		
	}

}
