package com.turing.se.cleancode2.designpattern.singleton;

public final class Singleton {
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	public void method()
	{
		System.out.println("singleton API");
	}
}
