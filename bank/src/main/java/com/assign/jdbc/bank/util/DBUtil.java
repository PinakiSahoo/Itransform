package com.assign.jdbc.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/bankaccount";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
