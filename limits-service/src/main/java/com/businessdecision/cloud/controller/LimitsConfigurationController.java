package com.businessdecision.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.businessdecision.cloud.config.ApplicationConfiguration;
import com.businessdecision.cloud.domain.LimitsConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author bernard.adanlessossi
 *
 */
@RestController
public class LimitsConfigurationController {

	@Autowired
	private ApplicationConfiguration applicationConfiguration;

	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		return new LimitsConfiguration(applicationConfiguration.getMinimum(), applicationConfiguration.getMaximum());
	}
	
	@GetMapping("/fault-tolerant-limits")
	@HystrixCommand(fallbackMethod = "fallBackRetrieveFromConfiguration")
	public LimitsConfiguration retrieveFaultTolerantLimitsFromConfiguration() {
		throw new RuntimeException("Service Not Available!");
	}
	
	/**
	 * Fallback method if the service is unavailable.
	 * @return the default values
	 */
	public LimitsConfiguration fallBackRetrieveFromConfiguration() {
		// return the default
		return new LimitsConfiguration(9, 999);
	}
}
