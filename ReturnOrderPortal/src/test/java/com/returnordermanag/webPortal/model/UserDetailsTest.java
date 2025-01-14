package com.returnordermanag.webPortal.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.returnordermanag.webPortal.model.UserDetails;

public class UserDetailsTest {

	UserDetails userDetails = new UserDetails();
	

	@Test
	void testGetUserID() {
		userDetails.setUserID(1);
		assertEquals(1, userDetails.getUserID());
	}
	
	@Test
	void testSetUserID() {
		userDetails.setUserID(1);
		assertEquals(1, userDetails.getUserID());
	}
	
	@Test
	void testGetUserName() {
		userDetails.setUserName("Raj");
		assertEquals("Raj", userDetails.getUserName());
	}
	
	@Test
	void testSetUserName() {
		userDetails.setUserName("Raj");
		assertEquals("Raj", userDetails.getUserName());
	}
	@Test
	void testGetPassword() {
		userDetails.setPassword("Raj");
		assertEquals("Raj", userDetails.getPassword());
	}
	
	@Test
	void testSetPassword() {
		userDetails.setPassword("Raj");
		assertEquals("Raj", userDetails.getPassword());
	}
	
	@Test
	void testGetJwtToken() {
		userDetails.setJwtToken(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNTIyNTc5NywiaWF0IjoxNjE1MjIzOTk3fQ.IRD8qCvu6neU1Atkic1qcNnJd_YZEnzFa1F3oaBusiU");
		assertEquals("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNTIyNTc5NywiaWF0IjoxNjE1MjIzOTk3fQ.IRD8qCvu6neU1Atkic1qcNnJd_YZEnzFa1F3oaBusiU", userDetails.getJwtToken());
	}
	
	@Test
	void testSetJwtToken() {
		userDetails.setJwtToken(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNTIyNTc5NywiaWF0IjoxNjE1MjIzOTk3fQ.IRD8qCvu6neU1Atkic1qcNnJd_YZEnzFa1F3oaBusiU");
		assertEquals("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNTIyNTc5NywiaWF0IjoxNjE1MjIzOTk3fQ.IRD8qCvu6neU1Atkic1qcNnJd_YZEnzFa1F3oaBusiU", userDetails.getJwtToken());
	}
	
	@Test
	void testIsValid() {
		userDetails.setValid(true);
		assertEquals(true,userDetails.isValid());
	}
	
	@Test
	void testSetValid() {
		userDetails.setValid(true);
		assertEquals(true,userDetails.isValid());
	}
	
	@Test
	void testConstructor() {
		UserDetails ud = new UserDetails(1, "Raj", "Raj", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNTIyNTc5NywiaWF0IjoxNjE1MjIzOTk3fQ.IRD8qCvu6neU1Atkic1qcNnJd_YZEnzFa1F3oaBusiU", true);
		assertEquals("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNTIyNTc5NywiaWF0IjoxNjE1MjIzOTk3fQ.IRD8qCvu6neU1Atkic1qcNnJd_YZEnzFa1F3oaBusiU",ud.getJwtToken());
		assertEquals(1,ud.getUserID());
		assertEquals("Raj",ud.getUserName());
		assertEquals("Raj",ud.getPassword());
		assertEquals(true,ud.isValid());
	}
	}