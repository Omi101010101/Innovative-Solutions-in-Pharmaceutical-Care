package com.returnorder.componentprocess.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {
	@Id
	private int requestID;
	private long creditCardNumber;
	private double creditLimit;
	private double processingCharge;
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getProcessingCharge() {
		return processingCharge;
	}
	public void setProcessingCharge(double processingCharge) {
		this.processingCharge = processingCharge;
	}
	public Payment(int requestID, long creditCardNumber, double creditLimit, double processingCharge) {
		super();
		this.requestID = requestID;
		this.creditCardNumber = creditCardNumber;
		this.creditLimit = creditLimit;
		this.processingCharge = processingCharge;
	}
	public Payment() {
		super();
	}

	
}
