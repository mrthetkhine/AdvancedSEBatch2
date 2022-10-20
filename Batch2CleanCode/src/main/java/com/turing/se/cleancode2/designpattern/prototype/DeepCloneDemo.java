package com.turing.se.cleancode2.designpattern.prototype;

import com.google.gson.Gson;

public class DeepCloneDemo {
	public static void main(String[]args)
	{
		HeavyClass heavy = new HeavyClass();
		Gson gson = new Gson();
		 
		HeavyClass copy = gson.fromJson(gson.toJson(heavy), HeavyClass.class);
		System.out.println("heavy==copy "+(heavy== copy));
		
		System.out.println("heay.prop==copy.prop "+(heavy.computationalHungryProperty==copy.computationalHungryProperty));
		
	}
}
