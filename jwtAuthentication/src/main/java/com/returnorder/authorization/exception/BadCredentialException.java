package com.returnorder.authorization.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND , reason="Username or Password incorrect")
public class BadCredentialException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
