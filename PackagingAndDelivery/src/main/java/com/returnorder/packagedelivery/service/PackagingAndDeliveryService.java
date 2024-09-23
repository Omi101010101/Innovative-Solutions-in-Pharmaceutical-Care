package com.returnorder.packagedelivery.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PackagingAndDeliveryService {
	
	static Logger logger = LoggerFactory.getLogger(PackagingAndDeliveryService.class);

	static final int PROTECTIVESHEATH = 150;
	static final int INTEGRALPACKING = 100;

	private int packagingAndDeliveryCost = 0;

	public int getPackingAndDeliveryCharge(String componentType, int count) {

		logger.info("Calculating packaging and delivery charges");
		
//		if (componentType.equals("integral") || componentType.equals("Integral")) {
//			packagingAndDeliveryCost = PROTECTIVESHEATH + INTEGRALPACKING + INTEGRALDELIVERY;
//			return (packagingAndDeliveryCost * count);
//		}
//
//		else if (componentType.equals("accessory") || componentType.equals("Accessory")) {
//			packagingAndDeliveryCost = PROTECTIVESHEATH + ACCESSORYPACKAGING + ACCESSORYDELIVERY;
//			return (packagingAndDeliveryCost * count);
//		}
		packagingAndDeliveryCost = PROTECTIVESHEATH + INTEGRALPACKING;

		return packagingAndDeliveryCost;
	}
}
