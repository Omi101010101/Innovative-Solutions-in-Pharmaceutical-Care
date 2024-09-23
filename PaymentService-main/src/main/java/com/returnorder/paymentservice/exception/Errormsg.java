package com.returnorder.paymentservice.exception;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Errormsg {
	 private String message;
	 private List<String> details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public Errormsg(String message, List<String> details) {
		super();
		this.message = message;
		this.details = details;
	}
	public Errormsg() {
		super();
	}
	 
	 
}