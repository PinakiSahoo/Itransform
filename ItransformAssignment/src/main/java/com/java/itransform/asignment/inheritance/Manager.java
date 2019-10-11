package com.java.itransform.asignment.inheritance;

public class Manager extends Employee {
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public Manager(int EmplooyeeId, String EmployeeName, int EmployeeSalary) {
		super(EmplooyeeId, EmployeeName,EmployeeSalary);
	
		this.petrolAllowance = 0.8 * getBasicSalary();
		this.foodAllowance = 0.13 * getBasicSalary();
		this.otherAllowance = 0.3 * getBasicSalary();
	}
	


	public double getPetrolAllowance() {
		return petrolAllowance;
	}

	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	public double getFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	
	@Override
	public double grossSalary() {
		double Grosssalary = getBasicSalary() + getFoodAllowance() +getPetrolAllowance ()+ getOtherAllowance()+ getHRA() + getMedical() ;
		return Grosssalary;
	}

	@Override
	public double netSalary() {
		double NetSalary = (getBasicSalary() + getHRA() + getMedical())-(getPT()+getPF());
		return NetSalary;
	}
	
	
	


	@Override
	public String toString() {
		return "Employee Id  "+getEmployeeId()+"   EmployeeName   " +getEmployeeName()+ "   BasicSalary   "+ getBasicSalary()+"    PetrolAllowance  " + getPetrolAllowance() + "   FoodAllowance  " + getFoodAllowance()
				+ " OtherAllowance   " + getOtherAllowance() + "  Grosssalary   " + grossSalary();
	}
	

}
