package com.multipkg;

public class Account {
private int accountNumber;
private double balance;
public Account(int accountNumber,double balance) {
	this.accountNumber=accountNumber;
	this.balance=balance;
}
public synchronized void deposit(int amount) {
	balance=balance+amount;
	System.out.println("balance after deposit amount:"+amount+"is:"+balance);
}
public synchronized void withdraw(int amount) {
	balance=balance-amount;
	System.out.println("balance after withdraw amount:"+amount+"is:"+balance);
	
}
}
