package com.corejava.basic;

public class VariablesDemo {

	int data = 50; // instance or global
	static int m = 100; // static

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablesDemo obj1 = new VariablesDemo();
		VariablesDemo obj2 = new VariablesDemo();

		obj2.data = 51;
		System.out.println("obj1--Instance Variable---" + obj1.data);
		System.out.println("obj2--Instance Variable---" + obj2.data);

		obj1.m = 101;
		System.out.println("obj1--Instance Variable---" + obj1.m);
		System.out.println("obj2--Instance Variable---" + obj2.m);
		// System.out.println("obj2--Instance Variable---" + VariablesDemo.m);
		// single line comment

		/*
		 * Multi line comments obj2.data = 51;
		 * System.out.println("obj1--Instance Variable---" + obj1.data);
		 * System.out.println("obj2--Instance Variable---" + obj2.data);
		 */

	}

	void display() {

		int a = 100; // local
		System.out.println("Inside Display" + a);
		data = 200;
		m = 100;
	}

}
