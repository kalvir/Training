package com.corejava.io;

import java.io.FileInputStream;

public class DataStreamExample {
	public static void main(String args[]) {
		try {
			// while loop
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) { // System.out.println(i);
				System.out.print((char) i);
			}

			fin.close();
			// for loop
			System.out.println();
			FileInputStream fins = new FileInputStream("D:\\testout.txt");
			for (; (i = fins.read()) != -1;) {

				System.out.print((char) i);
			}
			fins.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
