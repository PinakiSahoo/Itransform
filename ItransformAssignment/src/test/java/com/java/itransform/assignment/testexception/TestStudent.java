package com.java.itransform.assignment.testexception;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.itransform.assignment.Student;
import com.java.itransform.assignment.StudentService;
import com.java.itransform.assignment.exception.AgeNotWithinRangeException;

public class TestStudent {

	 
		Scanner sc =new Scanner(System.in);
		Student student=new Student();
		@Before
		public void startTest() {
		student.setRoll_no(sc.nextInt());
		student.setName(sc.next());
		student.setAge(sc.nextInt());
		student.setCourse(sc.next());
		
		
		}
		@Test
		public void testAge1() throws AgeNotWithinRangeException {
			assertEquals(true,StudentService.CheckAge(student.getAge()));
		
		
	}
		@Test
		public void testAge2() throws AgeNotWithinRangeException {
			assertEquals(false,StudentService.CheckAge(student.getAge()));
		}
		@Test
		public void testName1() throws AgeNotWithinRangeException {
			assertEquals(true,StudentService.CheckName(student.getName()));
		}
		@Test
		public void testName2() throws AgeNotWithinRangeException {
			assertEquals(false,StudentService.CheckName(student.getName()));
			
		}
		@After
		public void endTest() {
            sc.reset();
}
}
