package com.turing.se.cleancode2.tdd.kata;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BankKata {
	Printer printer = Mockito.mock(Printer.class);
	@Test
	void testNegativeAmountDepositShouldThrowException()
	{
	
		Account account = new BankAccount(printer);
		RuntimeException exception = assertThrows(RuntimeException.class,()->{
			account.deposit(-100);
		});
		assertEquals(BankAccount.INVALID_DEPOSIT_AMOUNT,exception.getMessage());
	}
	@Test
	void testDeposit100()
	{
		
		Account account = new BankAccount(printer);
		account.deposit(100);
		account.printStatement();
		
		String statement = "30/12/2022 +100 100\n";
		Mockito.verify(printer).print(statement);
	}
	@Test
	void testDepositTwoTimes()
	{
		
		Account account = new BankAccount(printer);
		account.deposit(100);
		account.deposit(50);
		
		account.printStatement();
		
		String statement = "30/12/2022 +100 100\n"+
				"30/12/2022 +50 150\n";
		Mockito.verify(printer).print(statement);
	}
	@Test
	void testWithdrawShouldThrowExceptionWhenBalanceIsInsufficient()
	{
		
		Account account = new BankAccount(printer);
		
		RuntimeException exception = assertThrows(RuntimeException.class,()->{
			 account.withdraw(100);
		});
		
		assertEquals(BankAccount.INSUFFICIENT_BALANCE,exception.getMessage());
	}
	@Test
	void testNegativeWithdrawAmountShouldThrowException()
	{
		Account account = new BankAccount(printer);
		
		RuntimeException exception = assertThrows(RuntimeException.class,()->{
			 account.withdraw(-100);
		});
		
		assertEquals(BankAccount.INVALID_WITHDRAW_AMOUNT,exception.getMessage());
	}
	@Test
	void testDepositWithdraw()
	{
		Account account = new BankAccount(printer);
		account.deposit(100);
		account.withdraw(50);
		
		account.printStatement();
		
		String statement = "30/12/2022 +100 100\n"+
				"30/12/2022 -50 50\n";
		Mockito.verify(printer).print(statement);
	}
}
