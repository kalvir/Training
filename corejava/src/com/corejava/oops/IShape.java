package com.corejava.oops;

public interface IShape {
	public abstract void draw();

	public double getArea();

}

class Triangle implements IShape {

	@Override
	public void draw() {

	}

	@Override
	public double getArea() {

		return 0;
	}

}

class TestDemo {
	public static void main(String args[]) {

		IShape shape = new Triangle();
		shape.draw();
	}
}
