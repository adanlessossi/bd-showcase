package com.businessdecision.microservices.netflixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Spring Cloud Netflix implementation providing:
 * <ul>
 * 	 <li>Service Discovery</li>
 * 	 <li>Circuit Breaker for Hystrix clients</li>
 * 	 <li>Client Side Load Balancer with Ribbon</li>
 * 	 <li>Router and Filter: automatic regsitration of Zuul filters</li>
 * </ul>
 * @author bernard.adanlessossi
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerApplication.class, args);
	}

}
