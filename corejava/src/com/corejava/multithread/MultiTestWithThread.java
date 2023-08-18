package com.corejava.multithread;

public class MultiTestWithThread extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiTestWithThread t1 = new MultiTestWithThread();
		t1.start();
	}
}