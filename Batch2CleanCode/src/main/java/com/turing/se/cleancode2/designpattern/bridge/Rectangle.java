package com.turing.se.cleancode2.designpattern.bridge;

public class Rectangle extends Shape{

	Rectangle(DrawingAPI api) {
		super(api);
	}

	@Override
	void draw() {
		this.api.drawRectangle();
	}

}
