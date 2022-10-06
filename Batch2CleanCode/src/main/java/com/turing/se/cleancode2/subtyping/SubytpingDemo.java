package com.turing.se.cleancode2.subtyping;

interface Flyable
{
	void fly();
}
class Bird implements Flyable
{
	public void fly()
	{
		System.out.println("Bird fly");
	}
}
class Aeroplane implements Flyable
{
	public void fly()
	{
		System.out.println("Aeroplane fly");
	}
}
public class SubytpingDemo {
	public static void main(String[]args)
	{
		Flyable f = new Aeroplane();
		f.fly();
		
		f = new Bird();
		f.fly();
	}
}
