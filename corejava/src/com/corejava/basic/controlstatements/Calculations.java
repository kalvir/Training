package com.corejava.basic.controlstatements;

public class Calculations {

	public static void main(String args[]) {
		Calculations s1 = new Calculations();
		s1.testDoWhile();
	}

	void testDoWhile() {
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 10);
	}

	void testWhile() {
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
	}

	void testForLoop() {
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);

	}

	void testSwitch() {
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		// Outputs "Thursday" (day 4)
	}

}
