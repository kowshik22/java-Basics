package com.ExceptionHandlingpkg;

public class Second1 {

	public static void main(String[] args) {
try {		// TODO Auto-generated method stub
int a[]=new int[5];
a[5]=50;
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}
System.out.println("hi");
	}

}
