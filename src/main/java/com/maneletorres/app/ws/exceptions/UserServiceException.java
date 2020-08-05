package com.maneletorres.app.ws.exceptions;

public class UserServiceException extends RuntimeException {
	private static final long serialVersionUID = 7960040112507206823L;

	public UserServiceException(String message) {
		super(message);
	}
}