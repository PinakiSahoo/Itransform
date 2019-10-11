package com.java.itransform.asignment.inheritance;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;
	
public Employee() {
	
}


public Employee(int employeeId, String employeeName, double salary) {
	super();
	
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.basicSalary = salary;
	this.hra = 0.5*getBasicSalary();
	this.pf = 0.12*getBasicSalary();
	this.pt = 200;
	this.medical=100;
}


public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	employeeName = employeeName;
}

public double getHRA() {
	return hra;
}

public void setHRA(double hRA) {
	hra = hRA;
}

public double getMedical() {
	return medical;
}

public void setMedical(double medical) {
	medical = medical;
}

public double getPF() {
	return pf;
}

public void setPF(double pF) {
	pf = pF;
}

public double getPT() {
	return pt;
}

public void setPT(double pT) {
	pt = pT;
}

public double getNetSalary() {
	return netSalary;
}

public void setNetSalary(double netSalary) {
	netSalary = netSalary;
}

public double getGrossSalary() {
	return grossSalary;
}

public void setGrossSalary(double grossSalary) {
	grossSalary = grossSalary;
}


public double getBasicSalary() {
	return basicSalary;
}


public void setBasicSalary(double basicSalary) {
	basicSalary = basicSalary;
}

public double grossSalary () {
	this.grossSalary= this.basicSalary+this.hra+this.medical;
	return grossSalary;
	
}

public double netSalary() {
	this.netSalary= this.grossSalary()-(this.pf+this.pt);
	return netSalary; 
}


@Override
public String toString() {
	return "EmployeeID   " +employeeId+ "   EmployeeName   " +employeeName+ "   BasicSalary   "+ basicSalary + "  HRA  " + hra
			  + "    Medical   "+ medical +  "    NetSalary  "+ this.netSalary() + "  GrossSalary   " + this.grossSalary();

}

}


