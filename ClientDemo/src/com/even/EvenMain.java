package com.even;

import java.util.Scanner;

public class EvenMain {
boolean even(int a) {
	if(a%2==0) {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter a");
	int a=s.nextInt();
	EvenMain obj=new EvenMain();
	boolean b=obj.even(a);
	if(b==true) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}

	}

}
