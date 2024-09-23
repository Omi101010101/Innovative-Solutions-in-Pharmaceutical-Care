package com.returnorder.packagedelivery.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.returnorder.packagedelivery.service.PackagingAndDeliveryService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class PackagingAndDeliveryController {

	static Logger logger = LoggerFactory.getLogger(PackagingAndDeliveryController.class);
	
	@Autowired
	PackagingAndDeliveryService packagingAndDeliveryService;

	@GetMapping("/PackagingAndDeliveryCharge/{componentType}/{count}")
	public int packagingAndDeliveryCost(@PathVariable String componentType, @PathVariable int count) {
		logger.info("Handling /PackagingAndDeliveryCharge/{componentType}/{count} request");
		return packagingAndDeliveryService.getPackingAndDeliveryCharge(componentType, count);

	}

}