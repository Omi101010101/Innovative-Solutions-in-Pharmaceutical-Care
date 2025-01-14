package com.returnorder.componentprocess.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="packagingAndDeliveryFeignClient", url="http://localhost:8083/PackagingAndDeliveryCharge/")
public interface PackagingAndDeliveryFeignClient {
	@GetMapping(value = "/{componentType}/{count}")
	double getPackagingAndDeliveryCharge(@PathVariable("componentType") String componentType, @PathVariable("count") int count);
}
