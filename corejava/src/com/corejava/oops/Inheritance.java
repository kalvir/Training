package com.corejava.oops;

public class Inheritance {

	public static void main(String args[]) {
		Engineer e = new Engineer();
		System.out.println("Salary : " + e.salary + "\nBenefits : "
				+ e.benefits);
		e.childMethod();
		e.parentMethod();
	}

}

// Base or Super Class
class Employee {
	int salary = 60000;

	void parentMethod() {
		System.out.println("Parent Method");
	}
}

// Inherited or Sub Class
class Engineer extends Employee {
	int benefits = 10000;

	void childMethod() {
		System.out.println("Child Method");
	}
}
