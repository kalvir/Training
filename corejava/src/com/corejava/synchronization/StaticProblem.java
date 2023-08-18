package com.corejava.synchronization;

class PowerStatic {
	synchronized static  void printPower(int n) {// method not synchronized
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

	
}

class MyThread2 extends Thread {
	PowerStatic p;
	int number;

	MyThread2(PowerStatic p, int number) {
		this.p = p;
		this.number = number;
	}

	public void run() {
		p.printPower(number);
	}
}

public class StaticProblem {
	public static void main(String args[]) {
	
		PowerStatic ob1 = new PowerStatic(); //first object
		PowerStatic ob2 = new PowerStatic(); //second object
		MyThread2 p1 = new MyThread2(ob1,2);  
		MyThread2 p2 = new MyThread2(ob1,3); 
		MyThread2 p3 = new MyThread2(ob2,5);
		MyThread2 p4 = new MyThread2(ob2,8);

		p1.start();  
		p2.start();
		p3.start();
		p4.start();
	}
}
