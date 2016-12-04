package com.Constructorpkg;

public class Basic {
Basic() {
	System.out.println("hi, hello");
}
Basic(int a,int b) {
	System.out.println((a+b));
}
Basic(int a,int b,int c) {
	System.out.println((a+b+c));
}
public static void main(String[] args) {
	Basic o1=new Basic();
	Basic o2=new Basic(12,13);
	Basic o3=new Basic(12,13,14);
}
}
