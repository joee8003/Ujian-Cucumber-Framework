package com.juaracoding.cucumber4.utlis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationPropertiesBooking {

	@Value("${browser}")
	private String browser;
	
	@Value("${City}")
	private String city;
	
	@Value("${Checkin}")
	private String checkin;
	
	@Value("${Checkout}")
	private String checkout;
	
	@Value("${Travellers}")
	private String travellers;

	public String getBrowser() {
		return browser;
	}
	public String getCity() {
		return city;
	}
	public String getCheckin() {
		return checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public String getTravellers() {
		return travellers;
	}
}


