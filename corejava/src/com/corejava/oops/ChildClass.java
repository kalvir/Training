package com.corejava.oops;

public class ChildClass extends Demo {

	@Override
	public void displayNonStatic() {
		System.out.println("Inside Static Method()");
	}

	public static void display() {
		System.out.println("Inside Child Method()");
	}

	/*
	 * public void displayOnlyinDemo() {
	 * 
	 * System.out.println("Inside displayOnlyinDemo Method()"); }
	 */

}
