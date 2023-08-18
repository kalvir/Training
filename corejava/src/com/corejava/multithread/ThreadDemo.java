package com.corejava.multithread;

//Java Program to Illustrate Priorities in Multithreading
//via help of getPriority() and setPriority() method

//Importing required classes
import java.lang.*;

//Main class
class ThreadDemo extends Thread {

	// Method 1
	// run() method for the thread that is called
	// as soon as start() is invoked for thread in main()
	public void run() {
		// Print statement
		
		System.out.println("Inside run method-"+this.getName());
	}

	// Main driver method
	public static void main(String[] args) {
		// Creating random threads
		// with the help of above class
		ThreadDemo t1 = new ThreadDemo();
		t1.setName("T1");
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("T2");
		ThreadDemo t3 = new ThreadDemo();
		t3.setName("T3");

		
		// Thread 1
		// Display the priority of above thread
		// using getPriority() method
		System.out.println("t1 thread priority : " + t1.getPriority());

		// Thread 1
		// Display the priority of above thread
		System.out.println("t2 thread priority : " + t2.getPriority());

		// Thread 3
		System.out.println("t3 thread priority : " + t3.getPriority());

		// Setting priorities of above threads by
		// passing integer arguments
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		System.out.println("t1 thread priority : " + t1.getPriority());

		// Thread 1
		// Display the priority of above thread
		System.out.println("t2 thread priority : " + t2.getPriority());

		// Thread 3
		System.out.println("t3 thread priority : " + t3.getPriority());
		// Main thread

		/*// Displays the name of
		// currently executing Thread
		System.out.println("Currently Executing Thread : "
				+ Thread.currentThread().getName());

		System.out.println("Main thread priority : "
				+ Thread.currentThread().getPriority());

		// Main thread priority is set to 10
		Thread.currentThread().setPriority(10);

		System.out.println("Main thread priority : "
				+ Thread.currentThread().getPriority());*/

		t3.start();
		t2.start();
		t1.start();
	}
}
