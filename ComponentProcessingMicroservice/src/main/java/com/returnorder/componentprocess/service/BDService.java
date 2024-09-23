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
public class BDService implements ProcessService {
	
	static Logger logger = LoggerFactory.getLogger(BDService.class);
	
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
		double processingCharge = 720;
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		
		ProcessResponse processResponse = new ProcessResponse();
		
		Optional<ProcessRequest> result = processRequestRepository.findById(userID);
		ProcessRequest processRequest = result.get();
		processingCharge=processingCharge*processRequest.getQuantityOfDefective();
		
		c.add(Calendar.DATE, processingDays);
		
		processResponse.setUserID(userID);
		processResponse.setProcessingCharge(processingCharge);
		
		logger.info("Calling Packaging and Delivery Microservice to get packaging cost Input to give - Component Type, Count Charge Output to receive - Packaging and Delivery charge");
		
		packagingAndDeliveryCharge = packagingAndDeliveryFeignClient.getPackagingAndDeliveryCharge(
				processRequest.getComponentType(), processRequest.getQuantityOfDefective());
		
		processResponse.setPackagingAndDeliveryCharge(packagingAndDeliveryCharge);
		processResponse.setDateOfDelivery(dateFormat.format(c.getTime()));
		processResponseRepository.save(processResponse);
		return processResponse;
	}
}

