package com.returnordermanag.webPortal.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.returnordermanag.webPortal.model.AuthenticationRequest;

public class AuthenticationRequestTest {

	AuthenticationRequest authenticationRequest = new AuthenticationRequest();
	
	
	
	@Test
	void testGetUserName() {
		authenticationRequest.setUsername("Raj");
		assertEquals("Raj", authenticationRequest.getUsername());
	}
	
	@Test
	void testSetUserName() {
		authenticationRequest.setUsername("Raj");
		assertEquals("Raj", authenticationRequest.getUsername());
	}
	@Test
	void testGetPassword() {
		authenticationRequest.setPassword("Raj");
		assertEquals("Raj", authenticationRequest.getPassword());
	}
	
	@Test
	void testSetPassword() {
		authenticationRequest.setPassword("Raj");
		assertEquals("Raj", authenticationRequest.getPassword());
	}
	
	@Test
	void testConstructor() {
		AuthenticationRequest ar = new AuthenticationRequest("Raj", "Raj");
		assertEquals("Raj", ar.getUsername());
		assertEquals("Raj", ar.getPassword());
	}
}