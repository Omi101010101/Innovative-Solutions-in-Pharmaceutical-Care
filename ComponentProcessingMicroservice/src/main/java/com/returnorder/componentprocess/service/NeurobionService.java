package com.returnorder.componentprocess.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.returnorder.componentprocess.client.PackagingAndDeliveryFeignClient;
import com.returnorder.componentprocess.model.ProcessRequest;
import com.returnorder.componentprocess.model.ProcessResponse;
import com.returnorder.componentprocess.repository.ProcessRequestRepository;
import com.returnorder.componentprocess.repository.ProcessResponseRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class NeurobionService implements ProcessService {
	
	static Logger logger = LoggerFactory.getLogger(NeurobionService.class);
	
	@Autowired
	private ProcessRequestRepository processRequestRepository;

	@Autowired
	private ProcessResponseRepository processResponseRepository;

	@Autowired
	private PackagingAndDeliveryFeignClient packagingAndDeliveryFeignClient;

	@Override
	public ProcessResponse processDetail(int userID) {
		double packagingAndDeliveryCharge;
		int processingDays = 5;
		double processingCharge = 138;
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		
		ProcessResponse processResponse = new ProcessResponse();
		
		Optional<ProcessRequest> result = processRequestRepository.findById(userID);
		ProcessRequest processRequest = result.get();
		processingCharge=processingCharge*processRequest.getQuantityOfDefective();
		
		boolean isPriorityHigh = processRequest.isPriorityRequest();
		
		if (isPriorityHigh) {
			processingDays = 2;
			processingCharge += 200;
		} 
		
		c.add(Calendar.DATE, processingDays);

		processResponse.setUserID(userID);
		processResponse.setProcessingCharge(processingCharge);
		
		logger.info("Calling Packaging and Delivery Microservice to get packaging cost");
		
		String componentType = processRequest.getComponentType();
		int quantity = processRequest.getQuantityOfDefective();
		packagingAndDeliveryCharge = packagingAndDeliveryFeignClient.getPackagingAndDeliveryCharge(componentType,
				quantity);
		processResponse.setPackagingAndDeliveryCharge(packagingAndDeliveryCharge);
		processResponse.setDateOfDelivery(dateFormat.format(c.getTime()));
		processResponseRepository.save(processResponse);
		return processResponse;
	}

}
