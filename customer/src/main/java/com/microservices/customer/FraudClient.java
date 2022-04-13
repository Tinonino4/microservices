package com.microservices.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="FRAUD")
public interface FraudClient {

    @GetMapping(value="/api/v1/fraud-check/{customerId}")
    FraudCheckResponse checkFraud(@PathVariable("customerId") Integer customerId);
}
