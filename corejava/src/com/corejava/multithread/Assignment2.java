package com.corejava.multithread;

public class Assignment2 implements Runnable {

	// to make this as sharble to all threads
	String array[] = { "CB#1000", "INS#1000" };
	String input;

	Assignment2(String input) {
		this.input = input;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + "-"
				+ getInstCode(input));

	}

	public static void main(String[] args) {

		int p = 10;
		Assignment2 a = new Assignment2("CB");
		for (int i = 0; i < 5; i++) {

			Thread t = new Thread(a);
			// t.setPriority(p--);
			t.setName("T" + (i + 1));

			try {
				Thread.sleep(500);// approach 1

				t.start();
				// t.join(); // approach 2

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

	synchronized String getInstCode(String input) {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			String res[] = array[i].split("#");
			if (res[0].equals(input)) {

				int code = Integer.valueOf(res[1]);
				code++;
				s = res[0] + code;
				array[i] = res[0] + "#" + code;
				break;
			}

		}

		return s;

	}

}
