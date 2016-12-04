package com.abstractpkg;

abstract public class Bike {
abstract void dis();
void dis1(int a) {
	if(a%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}
}
