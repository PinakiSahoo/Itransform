package com.java.itransform.asignment.inheritance;

public class CorporateTraining extends Training {
	int days;
	CorporateTraining(){
		
	}
	public CorporateTraining(int days) {
		super();
		this.days = days;
	}
	public double getDays() {
		return fees*days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "CorporateTraining [days=" + days + "]";
	}
	

}
