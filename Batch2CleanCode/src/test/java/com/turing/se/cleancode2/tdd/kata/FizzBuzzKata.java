package com.turing.se.cleancode2.tdd.kata;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FizzBuzzKata {
	Printer printer = Mockito.mock(Printer.class);
	@Test
	public void testNormalNumber()
	{
		FizzBuzz fizz = new FizzBuzz(printer);
		fizz.print();
		
		String data = "";
		for(int i=1;i<=20;i++)
		{
			if( i % 15 ==0)
			{
				data += "FizzBuzz" + "\n";
			}
			else if(i % 3 == 0)
			{
				data += "Fizz" + "\n";
			}
			else if(i % 5== 0)
			{
				data += "Buzz" + "\n";
			}
			else
			{
				data += i +"\n";
			}
		}
		Mockito.verify(printer).print(data);
	}
}
