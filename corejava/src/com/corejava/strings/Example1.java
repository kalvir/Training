package com.corejava.strings;

public class Example1 {

	public static void main(String[] args) {
		String s = "Welcome";
		// System.out.println(s+"-before-"+s.hashCode());
		s = s.concat("Sunil");
		// System.out.println(s+"-after-"+s.hashCode());
		// System.out.println(s+"-"+s.hashCode());
		// System.out.println(s);
		// String s1="Welcome";
		// System.out.println(s1+"-"+s1.hashCode());

		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1 + "-s1-" + "Hash-" + s1.hashCode() + "-address-"
				+ System.identityHashCode(s1));
		System.out.println(s2 + "-s2-" + "Hash-" + s2.hashCode() + "-address-"
				+ System.identityHashCode(s2));
		s2 = s1.concat("Sunil");
		System.out.println(s2 == s1);
		String s3 = new String("hello");
		String s4 = new String("hello");

		System.out.println(s3 + "-s3-" + "Hash-" + s3.hashCode() + "-address-"
				+ System.identityHashCode(s3));
		System.out.println(s4 + "-s4-" + "Hash-" + s4.hashCode() + "-address-"
				+ System.identityHashCode(s4));
		// System.out.println(s1==s2);
		// System.out.println(s1==s3);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
