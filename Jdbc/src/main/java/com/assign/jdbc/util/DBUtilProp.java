package com.assign.jdbc.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtilProp {
	private static String DB_URL;
	private static String USERNAME;
	private static String PASSWORD;
	
	static 
    {
   	 try
   	 {
   		Properties property=new Properties();
   		property.load(new FileInputStream("C:\\Users\\pinsahoo\\Desktop\\Assignment\\Jdbc\\target\\resources\\jdbc.properties"));
       	  DB_URL =property.getProperty("DB_URL");
       	  USERNAME=property.getProperty("USERNAME");
       	  PASSWORD=property.getProperty("PASSWORD");
       
   	 }

   	 catch(Exception e) {
   		 e.printStackTrace();
   	 }
   		 
   	 }
  
	
	 public static Connection getConnection()
	    {
	    	Connection connection = null;
	    	
	    	try {
	    		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    		
	    		
	    	}
			return connection;
	    }
}
