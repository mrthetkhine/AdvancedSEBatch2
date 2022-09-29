package com.turing.se.cleancode2.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class Data
{
	//AtomicInteger value = new AtomicInteger();
	int value = 0;
}
public class IncThread extends Thread{

	Data data;
	Semaphore semaphore;
	static int id= 0;
	
	IncThread(Data data,Semaphore sem)
	{
		super("IncThread "+id++);
		this.data = data;
		this.semaphore = sem;
	}
	public void run()
	{
		for(int i=0;i< 100000;i++)
		{
			System.out.println("I "+i);
			/*
			synchronized(this.data)
			{
				this.data.value++;
			}
			*/
			try {
				this.semaphore.acquire();
				this.data.value ++;
				//this.semaphore.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	public static void main(String[]args)
	{
		Semaphore sem = new Semaphore(1);
		Data data = new Data();
		IncThread threadOne = new IncThread(data,sem);
		IncThread threadTwo = new IncThread(data,sem);
		IncThread threadThree = new IncThread(data,sem);
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		
		try {
			threadOne.join();
			threadTwo.join();
			threadThree.join();
			
			System.out.println("Data "+data.value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
