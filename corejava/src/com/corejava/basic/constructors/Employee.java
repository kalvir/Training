package com.corejava.basic.constructors;

class Employee {
	int id;
	String name;

	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		// displaying values of the object
		emp1.display();
		emp2.display();
	}
}
