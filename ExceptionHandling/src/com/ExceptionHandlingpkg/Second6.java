package com.ExceptionHandlingpkg;

import java.io.IOException;
//throws exception
public class Second6 { 
		  void m()throws IOException {  
		    throw new IOException("device error");//checked exception  
		  }  
		  void n()throws IOException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   Second6 obj=new Second6();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  
}
}
