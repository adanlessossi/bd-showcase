/**
 * 
 */
package com.businessdecision.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.businessdecision.microservices.currencyconversionservice.domain.CurrencyConversionBean;

/**
 * Currency Exchange Service proxy to use Feign and Ribbon.
 * <p>
 * The annotation @FeignClient declares that a REST client with that interface
 * should becreated (e.g. for autowiring into another component). If ribbon is
 * available it will beused to load balance the backend requests
 * </p>
 * <p>
 * The load balancer can be configuredusing a @RibbonClient with the same name
 * as the feign client
 * </p>
 * 
 * @author bernard.adanlessossi
 *
 */
//@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000")
// @FeignClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	/**
	 * Proxies to the currency exchange service.
	 * @param from the 'from' currency
	 * @param to   the 'to' currency
	 * @return the conversion bean
	 */
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean getExchangeValue(@PathVariable String from, @PathVariable String to);
}
