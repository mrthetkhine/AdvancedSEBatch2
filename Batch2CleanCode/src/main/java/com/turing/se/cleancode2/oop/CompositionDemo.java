package com.turing.se.cleancode2.oop;

class Base
{
	public void work()
	{
		System.out.println("Human work");
	}
}
class Derived
{
	Base h = new Base();
	public void work()
	{
		h.work();
		System.out.println("Teacher work");
	}
}
public class CompositionDemo {
	public static void main(String[]args)
	{
		Derived t = new Derived();
		t.work();
	}
}
