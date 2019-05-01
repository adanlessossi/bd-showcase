/**
 * 
 */
package com.businessdecision.microservices.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.businessdecision.microservices.currencyexchangeservice.domain.ExchangeValue;
import com.businessdecision.microservices.currencyexchangeservice.repository.ExchangeValueRepository;

/**
 * Currency Exchange endpoint.
 * 
 * @author bernard.adanlessossi
 *
 */
@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue = this.repository.findByCurrencyfromAndCurrencyto(from, to);
		if (exchangeValue == null) {
			System.out.println("Value seems to be null!!");
		}
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
