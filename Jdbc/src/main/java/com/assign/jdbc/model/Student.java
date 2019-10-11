package com.assign.jdbc.model;

public class Student {
	private int StudentId;
	private String StudentName;
	private int StudentRoll;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, int studentRoll) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentRoll = studentRoll;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentRoll() {
		return StudentRoll;
	}
	public void setStudentroll(int studentRoll) {
		StudentRoll = studentRoll;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentRoll=" + StudentRoll
				+ "]";
	}
	
	

}
