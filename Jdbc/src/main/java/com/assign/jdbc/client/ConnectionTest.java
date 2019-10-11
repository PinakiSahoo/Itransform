package com.assign.jdbc.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		final String DB_URL = "jdbc:mysql://localhost:3306/student";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		
		try(Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
			if(connection != null)
				System.out.println("-- connected --");
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("-- Failed to connect --");
		}
	

	}

}
