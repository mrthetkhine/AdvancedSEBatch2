package com.turing.se.cleancode2.tdd.kata;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Account {

	public static final String INVALID_WITHDRAW_AMOUNT = "Invalid Withdraw Amount";

	public static final String INVALID_DEPOSIT_AMOUNT = "Invalid deposit amount";

	public static final String INSUFFICIENT_BALANCE = "Insufficient balance";

	public static String DATE ="30/12/2022";
	
	List<Transaction> transactions = new ArrayList<>();
	Printer printer;
	
	int balance = 0;
	
	public BankAccount(Printer printer)
	{
		this.printer = printer;
	}
	@Override
	public void deposit(int amount) {
		
		if(amount < 0)
		{
			throw new RuntimeException(INVALID_DEPOSIT_AMOUNT);
		}
		this.balance += amount;
		createDepositTransaction(amount);
	}
	

	@Override
	public void withdraw(int amount) {
		
		if(amount <0)
		{
			throw new RuntimeException(INVALID_WITHDRAW_AMOUNT);
		}
		if(amount >this.balance)
		{
			throw new RuntimeException(INSUFFICIENT_BALANCE);
		}
		this.balance -= amount;
		
		createWithdrawTransaction(amount);
	}
	private void createDepositTransaction(int amount) {
		Transaction depositTransaction = createTransaction("+"+amount);
		this.transactions.add(depositTransaction);
	}
	private Transaction createTransaction(String amount) {
		return new Transaction(amount, this.balance);
	}
	private void createWithdrawTransaction(int amount) {
		Transaction withdrawTransaction = createTransaction("-"+amount);
		this.transactions.add(withdrawTransaction);
	}

	@Override
	public void printStatement() {
		
		String data = "";
		for(Transaction tran : this.transactions)
		{
			data += tran.toString()+"\n";
		}
		this.printer.print(data);
	}
	
	public static void main(String[]args)
	{
		BankAccount account = new BankAccount(new Printer());
		account.deposit(100);
		account.withdraw(50);
		account.printStatement();
	}

}
