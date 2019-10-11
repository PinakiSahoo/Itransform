package com.assign.jdbc.client;

import com.assign.jdbc.model.Employee;

public class EmployeeJdbc {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();

//		if(dao.addEmployee(new Employee("Alex Brown", "ADMIN", 240.00987)))
//			System.out.println("-- Employee Record added successfully --");
//	else
//		System.out.println("-- Failed to add record --");
//		
		
//		List<Employee> employees = dao.findAllEmployees();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		
//		Employee employee = dao.findEmployeeById(2);
//		if(employee != null)
//			System.out.println(employee);
//		else
//			System.out.println("-- Employee Record not found --");
		
//		if(dao.deleteEmployee(3)) 
//			System.out.println(" -- Employee Record deleted successfully --");
//		else
//			System.out.println(" -- Failed to load record --");
	
		
		
		if(dao.updateEmployeeDetails(new Employee( 3,"Bobmar", "ADMIN", 240.00766)))
		System.out.println("-- Employee Record added successfully --");
	   else
		System.out.println("-- Failed to add record --");
	
		}
	
}








