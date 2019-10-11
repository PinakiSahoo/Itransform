package com.java.itransform.asignment.inheritance;

public class Training {
	int id;
	String Subject;
	double fees;
	
	Training(){
		
	}
	public Training(int id, String subject, double fees) {
		super();
		this.id = id;
		Subject = subject;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public double getFees() {
		return fees*20;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Training [id=" + id + ", Subject=" + Subject + ", fees=" + fees + "]";
	}
	


}
