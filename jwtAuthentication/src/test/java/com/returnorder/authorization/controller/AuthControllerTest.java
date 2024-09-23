package com.returnorder.authorization.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.returnorder.authorization.exception.BadCredentialException;
import com.returnorder.authorization.model.AuthenticationRequest;
import com.returnorder.authorization.model.AuthenticationResponse;
import com.returnorder.authorization.model.MyUser;
import com.returnorder.authorization.service.JwtUtil;
import com.returnorder.authorization.service.MyUserDetailsService;

@SpringBootTest
public class AuthControllerTest {

	@InjectMocks
	AuthenticationController authController;
	
	AuthenticationResponse resp;
	@Mock
	UserDetails userDetails;
	AuthenticationRequest req;
	@Mock
	MyUserDetailsService userservice;
	@Mock
	JwtUtil jwtutil;
	@Autowired
	@Mock
	AuthenticationManager am;
	@Test
	 void loginTest() throws BadCredentialException {

		
		AuthenticationRequest authreq=new AuthenticationRequest("Raj", "Raj");
		am.authenticate(new UsernamePasswordAuthenticationToken(authreq.getUsername(), authreq.getPassword()));
		MyUser user = new MyUser("Raj", null, "Raj");
		UserDetails loadUserByUsername = userservice.loadUserByUsername("Raj");
		UserDetails value = new User(user.getUserid(), user.getPassword(), new ArrayList<>());
		when(userservice.loadUserByUsername("Raj")).thenReturn(value);
		when(jwtutil.generateToken(loadUserByUsername)).thenReturn("token");
		
		ResponseEntity<?> login = authController.createAuthenticationToken(authreq);
		assertEquals( 200, login.getStatusCodeValue());
	}
	
	
	

}