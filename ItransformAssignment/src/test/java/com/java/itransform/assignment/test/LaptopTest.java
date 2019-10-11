package com.java.itransform.assignment.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.itransform.assignment.collection.Laptop;

public class LaptopTest {

	

	@Test
	public void testLaptop() {
		List<Laptop> list=Arrays.asList(new Laptop("lenovo",654, "linux", "corei5"));
				                       
		
		assertEquals(list , hasitems(new Laptop("lenovo",654, "linux", "corei5")));
				                     
	}

	private Object hasitems(Laptop laptop1) {
	
		// TODO Auto-generated method stub
		return new Laptop("lenovo",654, "linux", "corei5");
		
	}

}
