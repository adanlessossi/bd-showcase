package com.businessdecision.microservices.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * Main entry point for the currency conversion.
 * <p>
 * Provides OpenFeign integrations for Spring Boot apps through
 * autoconfiguration and binding.
 * </p>
 * 
 * @author bernard.adanlessossi
 *
 */
@EnableFeignClients("com.businessdecision.microservices.currencyconversionservice") // Feign autoconfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

	/**
	 * Enables Spring Cloud Sleuth.
	 * <p>
	 * Implements a distributed tracing solution for Spring Cloud
	 * </p>
	 * <ul>
	 * <li>Adds trace and span ids to the Slf4J logs</li>
	 * <li>Provides an abstraction over common distributed tracing data models</li>
	 * <li>Instruments common ingress and egress points from Spring
	 * applications</li>
	 * <li>generate and collect Zipkin-compatible traces via HTTP</li>
	 * </ul>
	 * 
	 * @return the sampler responsible for deciding if a particular trace should be
	 *         'sampled'.
	 */
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
