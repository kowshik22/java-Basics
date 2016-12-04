package com.even;

public class Even12 {
boolean even(int a) {
	if(a%2==0) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String[] args) {
	Even12 obj=new Even12();
	boolean b=obj.even(13);
	if(b==true) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}
}
