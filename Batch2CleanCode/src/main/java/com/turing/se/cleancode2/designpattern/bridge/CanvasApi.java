package com.turing.se.cleancode2.designpattern.bridge;

public class CanvasApi implements DrawingAPI{

	@Override
	public void drawCircle() {
		System.out.println("Canvas draw Circle");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("Canvas draw Rectangle");
		
	}

}
