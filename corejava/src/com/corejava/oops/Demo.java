package com.corejava.oops;

import java.util.Iterator;

public class Demo {

	static int counter;
	final String USER_TYPE = "I";

	static {
		System.out.println("Static Block called");
	}
	{
		System.out.println("IIB Block called");
	}

	public Demo() {
		System.out.println("Default Constructor");
	}

	public Demo(int count) {
		System.out.println(count + " Constructor");
	}

	public static void display() {
		System.out.println("Inside Static Method()");
	}

	// cannot be overrided in child class
	public final void displayOnlyinDemo() {

		System.out.println("Inside displayOnlyinDemo Method()");
	}
	

	public void displayNonStatic() {
		System.out.println("Inside displayNonStatic Method()");
		// USER_TYPE="E";//Error: The final field Demo.USER_TYPE cannot be
		// assigned

	}

	public static void main(String[] args) {

		display(); // static member

		Demo d = new Demo();
		d.displayNonStatic(); // non static method access
		Test t = new Test();
	}

}

class Test {

	{
		Demo.display();
	}
}
