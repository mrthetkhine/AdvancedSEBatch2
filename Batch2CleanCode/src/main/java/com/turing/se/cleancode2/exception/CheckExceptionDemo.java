package com.turing.se.cleancode2.exception;

public class CheckExceptionDemo {
	
	public void process() throws Exception
	{
		throw new Exception("Unknown exception");
	}
	public static void main(String[]args)
	{
		System.out.println("Hello");
	}
}
