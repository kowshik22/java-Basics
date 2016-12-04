

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
     
    	public void doGet(HttpServletRequest req,HttpServletResponse res)  
    	throws ServletException,IOException  
    	{  
    	res.setContentType("text/html");//setting the content type  
    	PrintWriter pw=res.getWriter();//get the stream to write the data  
    	  
    	//writing html in the stream  
    	pw.println("<html><body>");  
    	pw.println("Welcome to servlet");
    	pw.println("<p>malladi hoe are you</p>");
    	pw.println("<h>hello kowshik</h>");
    	pw.println("</body></html>");  
    	  
    	pw.close();

	}
    }

