package com.dlh.zambas.vending.machine;

public class NotSufficientChangeException extends RuntimeException{
	private String message;

	public NotSufficientChangeException(String string) { this.message = string; }

	@Override
	public String getMessage() {
		return message;
	}


}
