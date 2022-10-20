package com.turing.se.cleancode2.designpattern.bridge;

public class BridgeDemo {
	public static void main(String[]args)
	{
		DrawingAPI api = new CanvasApi();
		Shape shape  = new Rectangle(api);
		shape.draw();
		
		shape = new Circle(api);
		shape.draw();
	}
}
