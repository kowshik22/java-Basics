package com.toStringpkg;

public class ToString1 {
String name;
int rno;
ToString1(String name,int rno) {
	this.name=name;
	this.rno=rno;
}
public String toString() {
	return name+"......... "+rno;
}
public static void main(String[] args) {
	ToString1 t=new ToString1("kowshik",123);
	ToString1 t1=new ToString1("satya",435);
	System.out.println(t);
	System.out.println(t.toString());
	System.out.println(t1);
	
}
}
