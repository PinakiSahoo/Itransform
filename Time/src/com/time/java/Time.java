package com.time.java;

public class Time { 
	double am;
	double pm;
	public Time()
	{
		
	}
	public Time(double am, double pm) {
		super();
		this.am = am;
		this.pm = pm;
	}
	public double getAm() {
		return am;
	}
	public void setAm(double am) {
		this.am = am;
	}
	public double getPm() {
		return pm;
	}
	public void setPm(double pm) {
		this.pm = pm;
	}
	@Override
	public String toString() {
		return "Time [am=" + am + ", pm=" + pm + "]";
	}
	
}
