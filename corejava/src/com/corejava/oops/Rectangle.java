package com.corejava.oops;

abstract class Shape {
	private double length;
	private double width;

	// Declaring abstract method
	public abstract void draw();

	// Defining concrete method
	public double getArea() {
		return length * width;
	}
}

public class Rectangle extends Shape {
	public Rectangle(double length, double width) {
	}

	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	public static void main(String args[]) {
		// TwoDShape object referring to rectangle.
		//Shape rect = new Rectangle(10, 10);
		Rectangle rect1= new Rectangle(10, 10);
		rect1.draw();
		System.out.println("Area of given rectangle = " + rect1.getArea());
	}
}
