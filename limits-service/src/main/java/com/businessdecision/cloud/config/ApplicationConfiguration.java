/**
 * 
 */
package com.businessdecision.cloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author bernard.adanlessossi
 *
 */
@ConfigurationProperties("spring-cloud-service")
@Component
public class ApplicationConfiguration {

	private int maximum;
	
	private int minimum;

	/**
	 * 
	 */
	public ApplicationConfiguration() {
		super();
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
