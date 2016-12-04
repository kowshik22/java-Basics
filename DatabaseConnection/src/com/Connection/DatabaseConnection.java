package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
public static void main(String[] args) {
	Connection con=null;
	try {
		Class.forName("org.h2.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try 
	{
		con=DriverManager.getConnection("jdbc:h2:~/test","sa"," ");
	} catch (SQLException e) {
		System.out.println("connected");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 Statement st=null;
	try {
		st=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		
	}
	try {
		st.execute("insert into person values(111,'freind','you');");
		System.out.println("inserted");
	} catch (SQLException e) {
		// TODO Auto-generated catch 
		e.printStackTrace();
	}
	try {
		ResultSet rt=st.executeQuery("slect * from person");
		while(rt.next()) {
			System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getString(3));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}