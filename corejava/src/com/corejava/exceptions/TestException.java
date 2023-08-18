package com.corejava.exceptions;

import java.sql.SQLException;

public class TestException {

	public static void main(String[] args) {

		TestException t = new TestException();
		try {
			t.withdraw(1000);
		} /*
		 * catch (BusinessException | ArithmeticException e) {
		 * System.out.println(e.getMessage()); }
		 */
		catch (BusinessException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

	public void withdraw(int withdraw) throws ArithmeticException,
			ArrayIndexOutOfBoundsException {

		/*
		 * int bal = 100; if (bal < withdraw) { throw new
		 * BusinessException("No Balance"); }
		 */
		/*
		 * try { int num = 50 / 0; } catch (ArithmeticException e) { throw e; }
		 */
		int num = 50 / 0;

	}
}
