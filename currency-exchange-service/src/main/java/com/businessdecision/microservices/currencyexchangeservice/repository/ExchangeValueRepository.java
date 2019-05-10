/**
 * 
 */
package com.businessdecision.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.businessdecision.microservices.currencyexchangeservice.domain.ExchangeValue;

/**
 * Repository for the {@link ExchangeValue}.
 * @author bernard.adanlessossi
 *
 */
@Repository
@Component
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	/**
	 * Custom method to find by currency from and to.
	 * @param currencyFrom the currency 'from'
	 * @param currencyTo the currency 'to'
	 * @return the exchange value
	 */
	public ExchangeValue findByCurrencyfromAndCurrencyto(final String currencyFrom, final String currencyTo);
}
