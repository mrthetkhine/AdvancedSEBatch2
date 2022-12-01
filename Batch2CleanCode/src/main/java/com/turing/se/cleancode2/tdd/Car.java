package com.turing.se.cleancode2.tdd;

public class Car {
	Engine engine;
	public Car(Engine engine)
	{
		this.engine = engine;
	}
	public void start()
	{
		System.out.println("Car start");
		this.engine.start();
	}
}
