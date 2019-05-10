/**
 * 
 */
package com.businessdecision.microservices.currencyconversionservice.domain;

import java.math.BigDecimal;

/**
 * A sample currency conversion bean.
 * @author bernard.adanlessossi
 *
 */
public class CurrencyConversionBean {

	private Long id;

	private String currencyfrom;

	private String currencyto;

	private BigDecimal conversionMultiple;

	private BigDecimal amount;

	private BigDecimal calculatedAmount;

	private int port;

	/**
	 * Creates this.
	 */
	public CurrencyConversionBean() {
		super();
	}

	/**
	 * Creates this with parameters.
	 * @param id the id
	 * @param from the 'from'
	 * @param to the 'to'
	 * @param conversionMultiple the conversion multiplier
	 * @param amount the amount to convert
	 * @param calculatedAmount the calculated amount
	 * @param port the port serving this bean
	 */
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal amount,
			BigDecimal calculatedAmount, int port) {
		super();
		this.id = id;
		this.currencyfrom = from;
		this.currencyto = to;
		this.conversionMultiple = conversionMultiple;
		this.amount = amount;
		this.calculatedAmount = calculatedAmount;
		this.port = port;
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
	 * Gets the currency 'from'.
	 * @return the from
	 */
	public String getCurrencyfrom() {
		return currencyfrom;
	}

	/**
	 * Sets the currency 'from'.
	 * @param from the from to set
	 */
	public void setCurrencyfrom(String currencyfrom) {
		this.currencyfrom = currencyfrom;
	}

	/**
	 * Gets the currency 'to'.
	 * @return the to
	 */
	public String getCurrencyTo() {
		return currencyto;
	}

	/**
	 * Sets the currency 'to'.
	 * @param to the to to set
	 */
	public void setTo(String currencyto) {
		this.currencyto = currencyto;
	}

	/**
	 * Gets the conversion multiple.
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	/**
	 * Sets the conversion multiple.
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	/**
	 * Gets the amount.
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * Gets the calculated amount.
	 * @return the calculatedAmount
	 */
	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	/**
	 * Sets the calculated amount.
	 * @param calculatedAmount the calculatedAmount to set
	 */
	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
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
