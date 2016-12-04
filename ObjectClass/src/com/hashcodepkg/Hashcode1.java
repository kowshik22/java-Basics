package com.hashcodepkg;

public class Hashcode1 {
int i;
Hashcode1(int i) {
	this.i=i;
}
public static void main(String[] args) {
	Hashcode1 o1=new Hashcode1(19);
	Hashcode1 o2=new Hashcode1(20);
	Hashcode1 o3=new Hashcode1(21);
	System.out.println(o1);
	System.out.println(o2);
	System.out.println(o3);
}
}
