/**
 * 
 */
package com.businessdecision.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.businessdecision.microservices.currencyexchangeservice.domain.ExchangeValue;

/**
 * @author bernard.adanlessossi
 *
 */
@Repository
@Component
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByCurrencyfromAndCurrencyto(final String currencyFrom, final String currencyTo);
}
