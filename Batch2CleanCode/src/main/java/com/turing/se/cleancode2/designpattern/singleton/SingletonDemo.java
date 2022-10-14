package com.turing.se.cleancode2.designpattern.singleton;

public class SingletonDemo {
	public static void main(String[]args)
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println("Obj1 == obj2 "+(obj1==obj2));
		
		Runtime runtime = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		System.out.println("Runtime "+(runtime== runtime2));
	}
}
