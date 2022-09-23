package com.turing.se.cleancode2.concurrent;

public class ConcurrentThread extends Thread{

	String name;
	public ConcurrentThread(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int i=0;i< 100;i++)
		{
			System.out.println("Thread "+name + " "+i);
		}
	}
	
	public static void main(String[]args)
	{
		ConcurrentThread threadOne = new ConcurrentThread("one");
		ConcurrentThread threadTwo = new ConcurrentThread("two");
		ConcurrentThread threadThree = new ConcurrentThread("three");
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}
