package com.assign.jdbc.client;

import com.assign.jdbc.model.Student;

public class StudentJdbc {
	public static void main(String[] args) {
		StudentDao student =new StudentDao();
//		if(student.addStudent(new Student(11, "ADMIN", 1)))
//			System.out.println("-- Student Record added successfully --");
//		else
//			System.out.println("-- Failed to add record --");
		
		Student student1 = student.findStudentById(10);
	   if(student1 != null)
		System.out.println(student1);
     	else
	   	System.out.println("-- Student Record not found --");
		
	   if(student.deleteStudent(10)) 
			System.out.println(" -- Student Record deleted successfully --");
		else
			System.out.println(" -- Failed to load record --");
		
		
		
	}

}
