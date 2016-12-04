package com.ExceptionHandlingpkg;
//propagation
public class Second5 {
	void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   Second5 obj=new Second5();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  
}
}
