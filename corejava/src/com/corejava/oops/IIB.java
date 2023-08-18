package com.corejava.oops;

public class IIB {

	int count;

	{
		count = 100;
		System.out.println("IIB called---" + count);
	}
	{
		count = 101;
		System.out.println("IIB2 called---" + count);
	}

	public IIB() {
		System.out.println("Default Constructor");
	}

	public IIB(int a, int b) {
		System.out.println("2 parameters Constructor");
	}

	public IIB(int a, int b, int c) {
		System.out.println("3 parameters  Constructor");
	}

	public static void main(String[] args) {
		IIB ib1=new IIB();
		IIB ib=new IIB(2,3);

	}

}
