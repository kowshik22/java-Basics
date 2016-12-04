package com.ExceptionHandlingpkg;
//slt
public class Except12 {
	public static double divide(int x,int y) {
		double result=0;
		try {
		result= x/y;
		}
		catch(ArithmeticException e) {
System.out.println("y value should not be zero");
System.out.println(e.getMessage());
		}
		finally
		{
			//if you created any object,you have make it null
			System.out.println("i am final block");
		}
		System.out.println("after catch");
		return result;
	}
public static void main(String[] args) {
	System.out.println(divide(20,10));
}
}
