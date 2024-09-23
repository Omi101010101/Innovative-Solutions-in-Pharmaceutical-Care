package com.returnorder.componentprocess.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.returnorder.componentprocess.client.PaymentFeignClient;
import com.returnorder.componentprocess.model.Payment;
import com.returnorder.componentprocess.repository.PaymentRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class PaymentService {
	
	static Logger logger = LoggerFactory.getLogger(PaymentService.class);
	
	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private PaymentFeignClient paymentFeignClient;

	public String completeProcessing(int requestID, long creditCardNumber, double creditLimit,
			double processingCharge) {
		double currentBalance = -1;
		String finalResponse ="";
		
		Payment payment = new Payment();
		payment.setRequestID(requestID);
		payment.setCreditCardNumber(creditCardNumber);
		payment.setCreditLimit(creditLimit);
		payment.setProcessingCharge(processingCharge);
		paymentRepository.save(payment);

		logger.info("Calling Payment Microservice");
		
		currentBalance = paymentFeignClient.getCurrentBalance(creditCardNumber, processingCharge);
		
		if (currentBalance  <= -1)
			finalResponse = "We are sorry. Your payment could not be processed due to insufficient limit.";
		else
			finalResponse = "Your Payment is successful. Thank you for using our service.";

		return finalResponse;
	}

}
