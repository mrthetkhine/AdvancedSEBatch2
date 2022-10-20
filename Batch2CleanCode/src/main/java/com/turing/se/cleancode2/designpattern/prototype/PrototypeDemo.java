package com.turing.se.cleancode2.designpattern.prototype;

public class PrototypeDemo {
	public static void main(String[]args)
	{
		HeavyClass heavy = new HeavyClass();
		try {
			HeavyClass another = (HeavyClass) heavy.reproduce();
			
			System.out.println("Another "+another);
			System.out.println("Heavy ==another "+(heavy==another));
			
			System.out.println("heavy "+(heavy.computationalHungryProperty == another.computationalHungryProperty));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
