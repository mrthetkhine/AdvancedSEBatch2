package com.turing.se.cleancode2.oop;

public class Account {
	private int balance;
	
	
	public void credit(int amount)
	{
		if(amount >0)
		{
			this.balance += amount;
		}
		
	}
	public void debit(int amount)
	{
		if(this.balance-amount >=0)
		{
			this.balance -= amount;
		}
		
	}
	
	public int getBalance()
	{
		return this.balance;
	}
}
