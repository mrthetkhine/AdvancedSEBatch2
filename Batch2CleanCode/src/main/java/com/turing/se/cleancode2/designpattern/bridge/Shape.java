package com.turing.se.cleancode2.designpattern.bridge;

public abstract class Shape {
	   DrawingAPI api;
	   
	   Shape(DrawingAPI api)
	   {
	       this.api = api;
	   }
	   abstract void draw();
}
