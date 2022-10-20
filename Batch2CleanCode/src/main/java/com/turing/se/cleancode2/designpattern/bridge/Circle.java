package com.turing.se.cleancode2.designpattern.bridge;

public class Circle extends Shape{

	public Circle(DrawingAPI api)
	{
		super(api);
	}
	@Override
	public void draw() {
		this.api.drawCircle();
	}

}
