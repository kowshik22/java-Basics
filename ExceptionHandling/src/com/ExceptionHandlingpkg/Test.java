package com.ExceptionHandlingpkg;

public class Test {
public static int balance=10_000;
public static int min_balance=5_000;
public void withDraw(int amount)  throws MinimumBalanceException {
	if(amount > (balance-min_balance)) {
		throw new MinimumBalanceException();

	}
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
try {
	t.withDraw(1_000);
}
catch(MinimumBalanceException e ) {
	System.out.println("hello");
	e.printStackTrace();
}
	}

}
