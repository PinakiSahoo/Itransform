package com.training.myapp;

import com.training.myapp.exception.AgeNotWithInRangeException;
import com.training.myapp.exception.NameNotValidException;
import com.training.myapp.model.Student;

public class MyStudent {

	public static void main(String[] args) throws AgeNotWithInRangeException, NameNotValidException {
		// TODO Auto-generated method stub
Student student=new Student(1,"Smiley",23,"Java");
student.checkage(22);
Student student1=new Student(2,"kjjh",16,"Java");
student1.checkage(16);
student1.checkName("hloo7");
	}

}
