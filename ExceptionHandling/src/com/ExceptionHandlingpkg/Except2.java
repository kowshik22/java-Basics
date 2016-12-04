package com.ExceptionHandlingpkg;

public class Except2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
System.out.println((x/y));
	}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("please providr only numbers");
//we can write multiple catch blocks are better to go with one catch block		
			}
			
}
}
