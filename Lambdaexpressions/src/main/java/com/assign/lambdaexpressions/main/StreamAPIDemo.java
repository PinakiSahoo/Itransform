package com.assign.lambdaexpressions.main;



import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.assign.lambdaexpressions.model.Employee;

public class StreamAPIDemo {

	public static void main(String[] args) {

		// Find all the employee details and print them.

		EmployeeDao dao = new EmployeeDao();
		List<Employee> employees = dao.findAllEmployees();

//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		
//		public interface Consumer<T> {
//			public void accept(T t);
//		}
		
	// (1) Display Employee details 
		
//        Consumer<Employee> c = (e) -> System.out.println(e);                
//        employees.forEach(c);
		
		// (2) Find all Admin employees.
		
//		List<Employee> adminEmployees = new ArrayList<Employee>();
		
//		for(Employee employee: employees) {
//			if(employee.getEmployeeDepartment().equals("ADMIN")) {
//				adminEmployees.add(employee);
//			}
//		}
//
//		for (Employee employee : adminEmployees) {
//			System.out.println(employee);
//		}
		
		
//		public interface Predicate<T> {
//			public boolean test(T t);
//		}
		
//		public class MyPredicate implements Predicate<Employee> {
//			@Override
//			public boolean test(Employee e) {
//				return e.getEmployeeDepartment().equals("ADMIN");
//			}
//		}
		
//		Predicate<Employee> p = (e) -> e.getEmployeeDepartment().equals("ADMIN");
//		
//		List<Employee> adminEmployees = employees.stream()
//		               													  .filter(p)
//		               													  .collect(Collectors.toList());
//		
//		adminEmployees.forEach(e -> System.out.println(e));
		
		// (3) Find total no of employees.
		
//		long noOfEmployees = employees.stream().count();
//		System.out.println("Total no. of employees = " + noOfEmployees);
		
//		public interface Function<T, R> {
//			public R apply(T t);
//		}
//		
//		public MyFunction implements Function<Employee, String> {
//			@Override
//			public String apply(Employee e) {
//				return e.getEmployeeName();
//			}
//		}
		
//		Function<Employee, String> f = (e) -> e.getEmployeeName();
//		
//		List<String> adminEmployeeNames = employees.stream()
//		               														.filter(e -> e.getEmployeeDepartment().equals("ADMIN"))
//		               														.map(f)
//		               														.collect(Collectors.toList());
//		
//		adminEmployeeNames.forEach(e -> System.out.println(e));
		
	// (4) Display top 3 salaried employees
		
//		Comparator<Employee> c = (e1, e2) -> {
//			int result = Double.compare(e2.getEmployeeSalary(), e1.getEmployeeSalary());
//			if(result == 0)
//				Integer.compare(e2.getEmployeeId(), e1.getEmployeeId());
//			return result;
//		};
//		
//		List<Employee> top3SalariedEmployees = employees.stream()
//				                                                                   .sorted(c)
//				                                                                   .limit(3)
//				                                                                   .collect(Collectors.toList());
//		
//		top3SalariedEmployees.forEach(e -> System.out.println(e));
		
		// (5)  Demo of limit() and skip()
		
//		employees.stream()
//		               .skip(5)
//		               .limit(5)
//		               .forEach(e -> System.out.println(e));
		
		// (6) Find max, min, avg and sum of salaries
		
//		double maxSalary = employees.stream()
//		               								 .mapToDouble(e -> e.getEmployeeSalary())
//		               								 .max()
//		               								 .getAsDouble();
//		
//		System.out.println("maximum salary: " + maxSalary);
		
//		double minSalary = employees.stream()
//													.mapToDouble(e -> e.getEmployeeSalary())
//													.min()
//													.getAsDouble();
//		
//		System.out.println("Minimum salary: " + minSalary);
		
//		double sumOfSalaries = employees.stream()
//														  .mapToDouble(e -> e.getEmployeeSalary())
//														  .sum();
//		
//		System.out.println("Sum of salaries: " + sumOfSalaries);
		
		double averageSalary = employees.stream()
														  .mapToDouble(e -> e.getEmployeeSalary())
														  .average()
														  .getAsDouble();
		
		System.out.println("Average salary: " + averageSalary);	
	}
}
















