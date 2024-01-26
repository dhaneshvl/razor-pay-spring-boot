package com.dw.razorpay;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "razorpay")
public class RazorPayClientConfig {
	private String key;
	private String secret;
	private String currency;
	private String company_name;
}