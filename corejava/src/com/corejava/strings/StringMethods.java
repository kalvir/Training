package com.corejava.strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods sm= new StringMethods();
		sm.testCompareTo();

	}

	
	public void testCompareTo(){
		String str1 = "CBG Training";
		String str2 = "CBG Training";
		String str3 = "Training Java";

		int result1 = str1.compareTo(str2);
		System.out.println(result1);  // 0

		// comparing str1 with str3
		int result2 = str1.compareTo(str3);
		System.out.println(result2);  // 18

		// comparing str3 with str1
		int result3 = str3.compareTo(str1);
		System.out.println(result3);  // -18

	}
}
