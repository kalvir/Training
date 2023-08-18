package com.corejava.arrays;

import java.util.Arrays;

class ArrayExample1 {
	public static void main(String[] args) {
		// declares an Array of integers.
		int[] arr;

		// allocating memory for 5 integers.
		arr = new int[5];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		// for (int i = 0; i < arr.length; i++)

		// System.out.println("Element at index " + i + " : " + arr[i]);
		String output = "[";
		String name[] = { "Sunil", "Kalvir", "Kamat" };
		for (int i = name.length - 1; i >= 0; i--) {
			// approach1

			if (i == 0) {
				output += name[i] + "]";

			} else {
				output += name[i] + ",";
				System.out.println(output);
			}

			// approach2
			output += name[i];
			if (i != 0) {
				output += ",";
				System.out.println(output);

			}

			// approach3
			output += i > 0 ? name[i] + "," : name[i];

		}
		output += "]";
		System.out.println(output);
	}

}
