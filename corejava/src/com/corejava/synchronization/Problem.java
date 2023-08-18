package com.corejava.synchronization;

class Power {
	synchronized void printPower(int n) {// method not synchronized
		// synchronized void printPower(int n) {// method not synchronized
		int temp = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":- " + n
					+ "^" + i + " value: " + n * temp);
			temp = n * temp;
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	 void printPower2(int n) {
		synchronized (this)  { // synchronized block
			int temp = 1;
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":- " + n
						+ "^" + i + " value: " + n * temp);
				temp = n * temp;
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class MyThread extends Thread {
	Power p;
	int number;

	MyThread(Power p, int number) {
		this.p = p;
		this.number = number;
	}

	public void run() {
		//p.printPower(number);
		p.printPower2(number);
	}
}

public class Problem {
	public static void main(String args[]) {
		Power obj = new Power();// only one object
		MyThread p1 = new MyThread(obj, 5);
		MyThread p2 = new MyThread(obj, 8);
		p1.start();
		p2.start();
	}
}
