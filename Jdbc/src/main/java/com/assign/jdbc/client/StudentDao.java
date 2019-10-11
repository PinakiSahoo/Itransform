package com.assign.jdbc.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assign.jdbc.model.Student;
import com.assign.jdbc.util.DBUtil;
import com.assign.jdbc.util.StudentDbUtil;

public class StudentDao {
	
	public boolean addStudent(Student student) {
		String query= "Insert into Student(studentid,studentname,studentroll)values(?,?,?)";
		
		try(Connection connection=StudentDbUtil.getConnection();
    	PreparedStatement statement = connection.prepareStatement(query)){
			statement.setInt(1,student.getStudentId());
		    statement.setString(2,student.getStudentName());
			statement.setInt(3,student.getStudentRoll());
			
			int count=statement.executeUpdate();
			
			if(count==1) {
				return true;
			}
			
			}	
	catch(SQLException e) {
		e.printStackTrace();
	}
		return false;
		
	
	}
	
public boolean deleteStudent(int id) {
		
		Student student = findStudentById(id);
		if(student == null)
			return false;
		else {
			String query = "DELETE FROM student WHERE studentid = " + id;
			
			try (Connection connection = DBUtil.getConnection();
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

public Student findStudentById(int id) {
	String query = "SELECT * FROM Student WHERE studentid = "+ id;	
	Student student = null;
	
	try (Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery()) {
		
		if(result.next()) {
			student = 
					new Student(result.getInt(1), result.getString(2), result.getInt(3));
		}			
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	return student;
}
	
}
	
	
	


