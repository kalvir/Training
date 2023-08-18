package com.corejava.basic.operators;

public class Ternary {
	public static void main(String args[]) {
		Ternary t = new Ternary();
		t.arithmatic();
	}

	public void arithmatic() {
		int a = 10;
		int b = 5;
		System.out.println(a + b);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2 // Quotient 
		System.out.println(a % b);// 0  //remainder
	}

	void ternary() {
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
	}
}
