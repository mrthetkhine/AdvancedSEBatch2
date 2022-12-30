package com.turing.se.cleancode2.tdd.kata;

public class Transaction {

	String depositOrWithdraw ;
	int balance;
	
	public Transaction(String operation,int balance) {
		this.depositOrWithdraw = operation;
		this.balance = balance;
	}
	public String toString()
	{
		return BankAccount.DATE+" "+ this.depositOrWithdraw+" "+this.balance;
	}
}
