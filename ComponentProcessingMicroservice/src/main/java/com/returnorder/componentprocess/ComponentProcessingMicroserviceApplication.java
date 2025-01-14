package com.returnorder.componentprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
@EnableFeignClients
public class ComponentProcessingMicroserviceApplication {
	
	static Logger logger = LoggerFactory.getLogger(ComponentProcessingMicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ComponentProcessingMicroserviceApplication.class, args);
		logger.info("Component Processing Module started successfully");
	}

}
