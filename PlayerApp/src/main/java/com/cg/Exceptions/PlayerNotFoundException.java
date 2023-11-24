package com.cg.Exceptions;

public class PlayerNotFoundException extends RuntimeException {

	private String message;

	public PlayerNotFoundException(String message) {

		super(message);
	}

	public PlayerNotFoundException() {

	}
}
