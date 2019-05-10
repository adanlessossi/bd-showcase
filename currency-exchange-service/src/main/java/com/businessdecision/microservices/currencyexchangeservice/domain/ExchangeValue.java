/**
 * 
 */
package com.businessdecision.microservices.currencyexchangeservice.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A simple exchange value bean.
 * @author bernard.adanlessossi
 *
 */
@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	private String currencyfrom;
	
	private String currencyto;
	
	private BigDecimal conversionMultiple;
	
	private int port;
	
	/**
	 * Creates this.
	 */
	public ExchangeValue() {
		super();
	}

	/**
	 * Creates this with parameters.
	 * @param id the id
	 * @param from the 'from'
	 * @param to the 'to'
	 * @param conversionMultiple the conversion multiplier
	 */
	public ExchangeValue(Long id, String currencyfrom, String currencyto, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.currencyfrom = currencyfrom;
		this.currencyto = currencyto;
		this.conversionMultiple = conversionMultiple;
	}

	/**
	 * Gets the id.
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the 'from'.
	 * @return the from
	 */
	public String getCurrencyfrom() {
		return currencyfrom;
	}

	/**
	 * Sets the 'from'.
	 * @param from the from to set
	 */
	public void setCurrencyfrom(String currencyfrom) {
		this.currencyfrom = currencyfrom;
	}

	/**
	 * Gets the 'to'.
	 * @return the to
	 */
	public String getCurrencyto() {
		return currencyto;
	}

	/**
	 * Sets the 'to'.
	 * @param to the to to set
	 */
	public void setCurrencyto(String currencyto) {
		this.currencyto = currencyto;
	}

	/**
	 * Gets the conversion multiplier.
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	/**
	 * Sets the conversion multiplier.
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	/**
	 * Gets the port.
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Sets the port.
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
}
