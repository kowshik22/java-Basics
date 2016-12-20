
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.Userdao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Calling doGet() method");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Calling doPost() method");	
		String username =request.getParameter("username");
		String password = request.getParameter("password");
				
		//Create the instance of UserDao
		Userdao userDAO = new Userdao();
		
		//declare one requestdispacther
		RequestDispatcher dispatcher;
		if(userDAO.isValidUser(username, password)){
			dispatcher = request.getRequestDispatcher("Home.jsp");
			dispatcher.forward(request, response);	
		}
		else
		{
			// Need to navigate to Login page + Show error message 
			dispatcher = request.getRequestDispatcher("Login.jsp"); 
			
			//Should not write SOP("Invalid Credentials") as it will be printed on console 
			//And not on webpage
			//We have to get PrintWriter object from response object
			
			PrintWriter writer = response.getWriter();
			writer.println("Invalid Credentials. Please try again");
			
			dispatcher.include(request, response); // whatever is there in login page + error message,
													// thus include. If forward id given, then it 
													//will go directly to Login page without including 
													//the error message.
		}
	}
	}


