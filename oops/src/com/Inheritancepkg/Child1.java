package com.Inheritancepkg;

public class Child1 extends parent1 {
	void add() {
		super.add();
		System.out.println("i am child");
	}
public static void main(String[] args) {
	Child1 obj=new Child1();
	obj.add();
}
}
