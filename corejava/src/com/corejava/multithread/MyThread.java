package com.corejava.multithread;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread Running..." + this.getName());
	}

	public static void main(String[] args) {
		MyThread p1 = new MyThread();
		MyThread p2 = new MyThread();
		MyThread p3 = new MyThread();

		p1.setPriority(7);
		p2.setPriority(6);
		p1.start();
		p2.start();
		// p2.start();
		System.out.println("Current Thread:" + Thread.currentThread().getName()
				+ ":Priority:" + Thread.currentThread().getPriority());
		System.out.println("P1 thread priority : " + p1.getPriority()
				+ p1.getName());
		System.out.println("P2 thread priority : " + p2.getPriority()
				+ p2.getName());
		System.out.println("P3 thread priority : " + p3.getPriority()
				+ p3.getName());

	}
}
