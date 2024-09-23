package com.returnorder.packagedelivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.returnorder.packagedelivery.controller.PackagingAndDeliveryController;
import com.returnorder.packagedelivery.service.PackagingAndDeliveryService;

@SpringBootTest
class PackagingAndDeliveryApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void PackageAndDeliveryTestForIntegral() {
		PackagingAndDeliveryService pds = new PackagingAndDeliveryService();
		double actualResult = pds.getPackingAndDeliveryCharge("integral", 10);
		double expectedResult = 3500.0;
		Assertions.assertEquals(expectedResult, actualResult);
	}

	@Test
	void PackageAndDeliveryTestForAccessory() {
		PackagingAndDeliveryService pds = new PackagingAndDeliveryService();
		double actualResult = pds.getPackingAndDeliveryCharge("accessory", 10);
		double expectedResult = 2000.0;
		Assertions.assertEquals(expectedResult, actualResult);
	}

	@Test
	void PackageAndDeliveryTestForCountIsZero() {
		PackagingAndDeliveryService pds = new PackagingAndDeliveryService();
		double actualResult = pds.getPackingAndDeliveryCharge("integral || accessory", 0);
		double expectedResult = 0;
		Assertions.assertEquals(expectedResult, actualResult);
	}

}