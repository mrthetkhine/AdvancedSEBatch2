package com.turing.se.cleancode2.designpattern.strategy;

public class Demo {
	public static void main(String[]args)
	{
		Context context = new Context();
		context.setSortStrategy(new MergedSort());
		context.sort();
		
		context.setSortStrategy(new SelectionSort());
		context.sort();
	}
}
