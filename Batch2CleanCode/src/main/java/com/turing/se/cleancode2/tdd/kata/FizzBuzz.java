package com.turing.se.cleancode2.tdd.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {

	Printer printer ;
	
	List<Integer> divisors = new ArrayList<Integer>();
	List<String> literal = new ArrayList<String>();
	FizzBuzz(Printer printer)
	{
		this.printer = printer;
		divisors.add(15);
		divisors.add(5);
		divisors.add(3);
		literal.add("FizzBuzz");
		literal.add( "Buzz");
		literal.add( "Fizz");
		
		
	}
	public void print()
	{
		String data = "";
		for(int i=1;i<=20;i++)
		{
			boolean match = false;
			for(int j=0;j< divisors.size();j++)
			{
				int divisor = divisors.get(j);
				if( i % divisor ==0)
				{
					data += literal.get(j)+"\n";
					match = true;
					break;
				}
			}
			if(! match)
			{
				data += i +"\n";
			}
		}
		this.printer.print(data);
	}
	public static void main(String[]args)
	{
		FizzBuzz fizz = new FizzBuzz(new Printer());
		fizz.print();
		
	}
}
