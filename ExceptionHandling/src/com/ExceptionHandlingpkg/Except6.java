package com.ExceptionHandlingpkg;

public class Except6 {
public static void main(String[] args) {
	try {
		int A[]={10,20,30};
		for(int i=0;i<=3;i++) {
		System.out.println(A[i]);	
		}
	}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(("please provide "));
		}
	}
}

