package com.rest.book.exception;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String exception) {
		super(exception);
	}

}
