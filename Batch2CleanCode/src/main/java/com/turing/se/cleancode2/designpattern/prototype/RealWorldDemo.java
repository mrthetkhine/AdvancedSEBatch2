package com.turing.se.cleancode2.designpattern.prototype;

public class RealWorldDemo {
	public static void main(String[]args)
	{
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println("str==str2 "+(str==str2));
		
		Integer a = 128;
		Integer b =Integer.valueOf(128);
		
		System.out.println("a==b "+(a == b));
		System.out.println("a==b "+(a.intValue()==b.intValue()));
	}
}
