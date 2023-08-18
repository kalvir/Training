package com.corejava.multithread;

public class Assignment extends Thread {

	static String array[] = { "CB#1000", "INS#1000" };
	String input;

	Assignment(String input) {
		this.input = input;
	}

	public void run() {

		System.out.println(this.getName() + "-" + getInstCode(input));

	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Assignment t = new Assignment("CB");
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

	String getInstCode(String input) {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains("CB")) {
				String res[] = array[i].split("#");
				int code = Integer.valueOf(res[1]);
				code++;
				s = res[0] + code;
				array[i] = res[0] + "#" + code;
			}
		}

		return s;

	}

}
