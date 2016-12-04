package com.multipkg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a=new Account(10001,10_000);
DepositThread d;
WithdrawThread w;
d=new DepositThread(a,1_000);
d.start();
d=new DepositThread(a,3_000);
d.start();
w=new WithdrawThread(a,2_000);
w.start();
w=new WithdrawThread(a,4_000);
w.start();
	}

}
