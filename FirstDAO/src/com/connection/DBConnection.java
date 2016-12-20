package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection = null;
 void DbConnection() {
		
	}
	
	public static Connection getDBConnection() 
	{
		
			try {
				Class.forName("org.h2.Driver");
				connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return connection;
	}
		
	//temporarily test you are able to get connection or not
	
	public static void main(String[] args) 
	{
		if(getDBConnection() == null)
			System.out.println("Connection could not be established ");
		else
			System.out.println("Connection successfully established");		
	}
}

