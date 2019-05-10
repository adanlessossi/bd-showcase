package com.businessdecision.microservices.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * Implementation of the Netflix API Gateway.
 * <p>
 * The annotation @EnableZuulProxy sets up a Zuul server endpoint and installs
 * some reverse proxy filters in it, so it canforward requests to backend
 * servers.
 * </p>
 * <p>
 * The backends can be registered manually throughconfiguration or via
 * DiscoveryClient
 * </p>
 * 
 * @author bernard.adanlessossi
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
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
