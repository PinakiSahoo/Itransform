package com.java.itransform.asignment.inheritance;

public class MarketingExecutive extends Employee {

	int kilometersTravelled;
	int tourAllowance;
	int telephoneAllowance = 1500;
	
	public MarketingExecutive( int empId, String empName,int salary, int kilometersTravelled) {
		super(empId,empName,salary);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = 5 * kilometersTravelled;
		
		
	}

	public int getKilometersTravelled() {
		return kilometersTravelled;
	}

	public void setKilometersTravelled(int kilometersTravelled) {
		this.kilometersTravelled = kilometersTravelled;
	}

	public int getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(int tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public int getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(int telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}

	@Override
	public String toString() {
		return "Employee Id  "+getEmployeeId()+"    EmployeeName   " +getEmployeeName()+ "   BasicSalary   "+ getBasicSalary()+"     MarketingExecutive kilometersTravelled      " + kilometersTravelled + ", tourAllowance=" + tourAllowance
				+ "    telephoneAllowanc    " + telephoneAllowance ;
	}
	
	
	
	
	
	
}
