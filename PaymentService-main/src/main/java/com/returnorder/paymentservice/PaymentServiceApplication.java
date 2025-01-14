package com.returnorder.paymentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableFeignClients
public class PaymentServiceApplication {

	static Logger logger = LoggerFactory.getLogger(PaymentServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
		logger.info("Payment Service Application started successfully");
	}

}
