package com.returnorder.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.returnorder.authorization.model.AuthenticationResponse;


@Component
public class ValidateService {
	@Autowired
	private JwtUtil jwtutil;

	public AuthenticationResponse validate(String token) {
		AuthenticationResponse authenticationResponse = new AuthenticationResponse();

		String jwt = token.substring(7);
		authenticationResponse.setJwtToken(jwt);

		if (jwtutil.validateToken(jwt)) {
			
			authenticationResponse.setValid(true);
		} else {
			authenticationResponse.setValid(false);
		}
		return authenticationResponse;
	}
}
