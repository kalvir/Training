package com.corejava.strings;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op = new String();
		String duplicateCheck = "";
		long startTime = System.currentTimeMillis();
		String s[] = { "sunil@gmail.com", "sunil@cbg.gm", "sunil@valtech.com",
				"kalvir@valtech.com", "kamat@outlook.com", "sunil@outlook.com" ,"dembo@yahoo.com"};
		for (int i = 0; i < s.length; i++) {
			String res[] = s[i].split("@");

			String sub[] = res[1].split("\\.");
			op += i == s.length - 1 ? sub[0] : sub[0] + ",";
		}//gmail,outlook,valtech,cbg,valtech,outlook

		String finalResult[] = op.split(",");
		for (int i = 0; i < finalResult.length; i++) {
			duplicateCheck += i == finalResult.length - 1 ? finalResult[i]
					: finalResult[i] + ",";

			if (countOccurrences(finalResult[i], duplicateCheck, false) == 1) {
				countOccurrences(finalResult[i], op, true);
			}

		}
		System.out.println("Time taken: "
				+ (System.currentTimeMillis() - startTime) + "ms");
	}

	static int countOccurrences(String str, String word, boolean display) {
		// split the string by spaces in a
		String a[] = word.split(",");

		// search for pattern in a
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			// if match found increase count
			if (str.equals(a[i]))
				count++;
		}
		if (display)
			System.out.println(str + "-" + count);
		return count;
	}
}
