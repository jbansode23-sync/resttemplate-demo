package com.practice.resttemplatedemo.exception;

public class APICustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public APICustomException() {
		super();
	}

	public APICustomException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public APICustomException(String message) {
		super(message);
	}

	public APICustomException(Throwable cause) {
		super(cause);
	}
}
