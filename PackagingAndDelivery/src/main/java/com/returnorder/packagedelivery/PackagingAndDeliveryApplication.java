package com.returnorder.packagedelivery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
@EnableFeignClients
public class PackagingAndDeliveryApplication {

	static Logger logger = LoggerFactory.getLogger(PackagingAndDeliveryApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PackagingAndDeliveryApplication.class, args);
		logger.info("Packaging and Delivery Module started successfully");
	}

}
