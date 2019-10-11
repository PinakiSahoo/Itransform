
package com.assign.jdbc.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.assign.jdbc.model.Employee;
import com.assign.jdbc.util.DBUtil;
import com.assign.jdbc.util.DBUtilProp;

public class EmployeeDao {
	

	public boolean addEmployee(Employee e) {
		
		String query = "INSERT INTO employee (employeename, employeedept, employeesalary) VALUES(?, ?, ?)";
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			
			statement.setString(1, e.getName());
			statement.setString(2, e.getDept());
			statement.setDouble(3, e.getSalary());
			
			int count = statement.executeUpdate();
			if(count == 1)
				return true;				
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteEmployee(int id) {
		
		Employee employee = findEmployeeById(id);
		if(employee == null)
			return false;
		else {
			String query = "DELETE FROM employees WHERE emp_id = " + id;
			
			try (Connection connection = DBUtilProp.getConnection();
					PreparedStatement statement = connection.prepareStatement(query)) {
				int count = statement.executeUpdate();
				if(count == 1)
					return true;				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
		}		
		
	}
	
	public List<Employee> findAllEmployees() {
		
		String query = "SELECT * FROM employees";
		List<Employee> employees = new ArrayList<>();
		
		try (Connection connection =DBUtilProp.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
		
			
			while(result.next()) {
				Employee employee = 
						new Employee(result.getInt(1), result.getString(2), result.getString(4), result.getDouble(3));
				employees.add(employee);
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}
	
	public Employee findEmployeeById(int id) {
		String query = "SELECT * FROM employee WHERE emp_id = " + id;	
		Employee employee = null;
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
			
			if(result.next()) {
				employee = 
						new Employee(result.getInt(1), result.getString(2), result.getString(4), result.getDouble(3));
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	
	public boolean updateEmployeeDetails(Employee e) {
	
		String query="Update Employee set employeename=? Where employeeid=?";

		try (Connection connection =DBUtilProp.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
	
			
			
			statement.setString(1,e.getName());
			statement.setInt(2,e.getId());
            
		int count = statement.executeUpdate();
		if(count == 1)
			return true;
		}
			
			
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	return false;
	
}


}






