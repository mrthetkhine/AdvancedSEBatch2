package com.turing.se.cleancode2.solid;

public class DIDemo {
	public static void main(String args[])
	{
		
		Engine engine = new GasEngine();
		Car car = new Car(engine);
		
		car.start();
	}
}
