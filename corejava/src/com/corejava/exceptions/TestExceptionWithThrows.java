package com.corejava.exceptions;

import java.sql.SQLException;

public class TestExceptionWithThrows {

	public static void main(String[] args) {

		TestExceptionWithThrows t = new TestExceptionWithThrows();
		try {
			t.withdraw(1000);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void withdraw(int withdraw) throws SQLException {

		int bal = 100;
		/*
		 * if (bal < withdraw) { throw new SQLException("No Balance"); }
		 */

	}
}
