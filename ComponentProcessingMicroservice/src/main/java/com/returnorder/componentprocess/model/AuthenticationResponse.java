package com.returnorder.componentprocess.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class AuthenticationResponse {

	private String jwtToken;
	private Boolean valid;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public AuthenticationResponse(String jwtToken, Boolean valid) {
		super();
		this.jwtToken = jwtToken;
		this.valid = valid;
	}
	public AuthenticationResponse() {
		super();
	}

	
}