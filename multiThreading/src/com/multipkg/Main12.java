package com.multipkg;

public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThirdRun1 obj=new ThirdRun1();
Thread t=new Thread(obj);
Thread t1=new Thread(obj);
t.start();
t1.start();
	}

}
