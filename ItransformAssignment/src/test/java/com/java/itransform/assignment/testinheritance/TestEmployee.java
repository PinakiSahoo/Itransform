/**
 * 
 */
package com.java.itransform.assignment.testinheritance;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.itransform.asignment.inheritance.Employee;

/**
 * @author pinsahoo
 *
 */
public class TestEmployee {

	@Test
	public void testEmployee() {
		Employee e=new Employee(101,"Bella",20000.0);
		e.setBasicSalary(10000);
		e.setHRA(5000.0);
		e.setPF(2000.0);
		e.setPT(200);
		e.setMedical(100);
		e.setNetSalary(15000);
		assertEquals(20000,e.getBasicSalary(),0.01);
		assertEquals(22900,e.netSalary(),0.01);
		assertEquals(25100,e.grossSalary(),0.01);
		
		
	}

}
