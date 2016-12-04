package com.ExceptionHandlingpkg;

public class Second4 { 
		   void validate(int age){  
		     if(age<18)  
		    	  throw new ArithmeticException("not valid");
		     else  
		      System.out.println("welcome to vote");  
		   }  
		   public static void main(String args[]){ 
			   Second4 obj=new Second4();
			   obj.validate(0);
		        
		      System.out.println("rest of the code...");  
		  }  

}
