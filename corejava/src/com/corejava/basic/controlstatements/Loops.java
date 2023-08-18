package com.corejava.basic.controlstatements;

//Java program to illustrate enhanced for loop
public class Loops {

	// Main Function
	public static void main(String args[]) {

		Loops lp = new Loops();
		//lp.generalLoop(10);
		lp.forEachLoop();
	}

	void generalLoop(int count) {

		for (int i = count; i > 0; i--) {
			System.out.println("i-->" + i);
		}
 
	}

	void forEachLoop() {
		// String array
		String array[] = { "Sunil", "Kalvir", "Kamat" };

		// enhanced for loop
		for (String x : array) {
			System.out.println(x);
		}

		/*
		 * for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */

	}
}
