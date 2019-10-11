package com.java.itransform.assignment;

public class Student {
	int roll_no;
	String name;
	int Age;
	String course;
	public Student() {
		
	}
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", Age=" + Age + ", course=" + course + "]";
	}

	public Student(int roll_no, String name, int age, String course) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		Age = age;
		this.course = course;
	}
	
}


