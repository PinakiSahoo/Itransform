package com.assign.lambdaexpressions.main;

import java.util.Arrays;
import java.util.List;

import com.assign.lambdaexpressions.model.Employee;

public class EmployeeDao {
	
	public List<Employee> findAllEmployees() {
		List<Employee> employees = Arrays.asList(
			new Employee(101, "Johh Doe", "HR", 45000),
			new Employee(33, "Bob Marting", "HR", 34000),
			new Employee(66, "Jane Doe", "ADMIN", 12000),
			new Employee(78, "Anna Polly", "ADMIN", 22000),
			new Employee(12, "Bryan Bash", "ADMIN", 10000),
			new Employee(33, "Kathy Sierra", "ACCOUNTS", 42000),
			new Employee(99, "George King", "ACCOUNTS", 22000),
			new Employee(345, "Mahesh Shelar", "ACCOUNTS", 18000),
			new Employee(233, "Satyendra Singh", "DEVELOPER", 14750),
			new Employee(189, "Sourabh Naik", "DEVELOPER", 55000),
			new Employee(200, "Tushar Rane", "DEVELOPER", 58000)			
		);
		
		return employees;
	}
}
