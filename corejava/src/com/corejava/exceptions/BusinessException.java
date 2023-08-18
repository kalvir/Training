package com.corejava.exceptions;

public class BusinessException extends RuntimeException {
	/**
     * 
     */
	String msg;
	private static final long serialVersionUID = 2219102410227201351L;



	public BusinessException(String message) {
		super(message);
	}

	public BusinessException() {
		msg="Value is not in range";
	}

}
