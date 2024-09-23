package com.returnorder.componentprocess.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.returnorder.componentprocess.client.AuthenticationFeignClient;
import com.returnorder.componentprocess.model.AuthenticationResponse;
import com.returnorder.componentprocess.model.ProcessRequest;
import com.returnorder.componentprocess.model.ProcessResponse;
import com.returnorder.componentprocess.repository.ProcessRequestRepository;
import com.returnorder.componentprocess.service.AService;
import com.returnorder.componentprocess.service.AutrinService;
import com.returnorder.componentprocess.service.BDService;
import com.returnorder.componentprocess.service.BecosuleService;
import com.returnorder.componentprocess.service.BendonService;
import com.returnorder.componentprocess.service.ConfirminService;
import com.returnorder.componentprocess.service.EVIONService;
import com.returnorder.componentprocess.service.LimceeService;
import com.returnorder.componentprocess.service.NeurobionService;
import com.returnorder.componentprocess.service.OkametService;
import com.returnorder.componentprocess.service.DoloService;
import com.returnorder.componentprocess.service.AzService;
import com.returnorder.componentprocess.service.DibetaService;
import com.returnorder.componentprocess.service.PaymentService;
import com.returnorder.componentprocess.service.ZoformService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class ComponentProcessingController {
	
	static Logger logger = LoggerFactory.getLogger(ComponentProcessingController.class);
	
	@Autowired
	AService aService;

	@Autowired
	DoloService doloService;
	@Autowired
	BDService bdService;
	@Autowired
	BendonService benService;
	@Autowired
	AutrinService autrinService;
	@Autowired
	DibetaService dibetaService;

	@Autowired
	AzService azService;

	@Autowired
	EVIONService evionService;
	@Autowired
	BecosuleService becosuleService;
	@Autowired
	NeurobionService neurobionService;
	@Autowired
	LimceeService limceeService;
	@Autowired
	ConfirminService confirminService;
	@Autowired
	ZoformService zoformService;
	@Autowired
	OkametService okametService;

	@Autowired
	AService accessoryPartService;
	@Autowired
	PaymentService paymentService;
	@Autowired
	ProcessRequestRepository processRequestRepository;
	@Autowired
	AuthenticationFeignClient authenticationFeignClient;

	@PostMapping("/service")
	public ProcessResponse getProcessingDetails(@RequestHeader("Authorization") String token,
			@RequestBody ProcessRequest processRequest) throws Exception {
		
		logger.info("Handling /service request");
		
		AuthenticationResponse authenticationResponse = null;
		try {
			authenticationResponse = authenticationFeignClient.getValidity(token);
			boolean valid=authenticationResponse.getValid();
			if(!valid)
				return null;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Authorization Failed. Please try again");
		}
		
		
		processRequestRepository.save(processRequest);
		ProcessResponse response = null;
		int userID = processRequest.getUserID();
		String componentType = processRequest.getComponentType();
		if (componentType.equals("BECOSULES Z CAPSULES 1000MG"))
			response = (becosuleService.processDetail(userID));
		else if (componentType.equals("EVION 400MG CAPSULES"))
			response = (evionService.processDetail(userID));
		else if (componentType.equals("DOLO 650MG TAB"))
			response = (doloService.processDetail(userID));
		else if (componentType.equals("AZITHROMYCIN 500MG"))
			response = (azService.processDetail(userID));
		else if (componentType.equals("NEUROBION FORTE TAB"))
			response = (neurobionService.processDetail(userID));
		else if (componentType.equals("BENADON 40MG TAB"))
			response = (benService.processDetail(userID));
		else if (componentType.equals("BD ULTRAFINE PEN NEEDLE 32GX4 MM"))
			response = (bdService.processDetail(userID));
		else if (componentType.equals("AUTRIN CAPSULE"))
				response = (autrinService.processDetail(userID));
		else if (componentType.equals("LIMCEE CHEWABLE TABLETS 500 mg"))
				response = (limceeService.processDetail(userID));
		else if (componentType.equals("DIBETA SR 500MG TAB"))
				response = (dibetaService.processDetail(userID));
		else if (componentType.equals("CONFIRMIN 500MG TAB"))
        		response = (confirminService.processDetail(userID));
		else if (componentType.equals("ZOFORM SR 500MG TAB"))
				response = (zoformService.processDetail(userID));
		else if (componentType.equals("OKAMET 500MG TAB"))
			response = (okametService.processDetail(userID));
//		
		
		return response;
	}

	@PostMapping("/payment/{requestID}/{creditCardNumber}/{creditLimit}/{processingCharge}")
	public String paymentProcessing(@RequestHeader("Authorization") String token,
			@PathVariable("requestID") int requestID, @PathVariable("creditCardNumber") long creditCardNumber,
			@PathVariable("creditLimit") double creditLimit,
			@PathVariable("processingCharge") double processingcharge) throws Exception {
		
		logger.info("Processing the order");
		
		AuthenticationResponse authenticationResponse = null;
		try {	
			authenticationResponse = authenticationFeignClient.getValidity(token);
			if(!authenticationResponse.getValid())
				return null;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Authorization Failed. Please try again");
		}
		
		return paymentService.completeProcessing(requestID, creditCardNumber, creditLimit, processingcharge);
	}
}
