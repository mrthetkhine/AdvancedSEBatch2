package com.turing.se.cleancode2.designpattern.template;

public class Demo {
	public static void main(String[]args)
	{
		FrameworkAction action = new ReportAction();
		action.process();
		
		action = new SaleAction();
		action.process();
	}
}
