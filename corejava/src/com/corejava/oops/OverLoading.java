package com.corejava.oops;

//Class 1
//Calculator class
class Calculator {

	// Method with 2 integer parameters
	/*
	 * int multiply(int a, int b) {
	 * 
	 * // Returns product of integer numbers return a * b; }
	 */

	void multiply(float a, float b) {

		// Returns product of float numbers
		System.out.println(a * b);
	}

	// Method 2
	// With same name but with 2 double parameters
	/*
	 * double multiply(double a, double b) {
	 * 
	 * // Returns product of double numbers return a * b; }
	 */
}

// Class 2
// Main class
class OverLoading {

	// Main driver method
	public static void main(String[] args) {

		// Calling method by passing
		// input as in arguments

		Calculator c = new Calculator();
		// System.out.println(c.multiply(2, 4));
		c.multiply(5.0f,6.3f);
	}
}
