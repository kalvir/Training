package com.corejava.basic.constructors;

class Staff {
	int id;
	String name;

	// creating a parameterized constructor
	Staff(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		Staff s1 = new Staff(121, "Sunil");
		Staff s2 = new Staff(122, "Kalvir");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}
