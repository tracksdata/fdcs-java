package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

	@Bean
	public void f2() {
		System.out.println("--- WebConfig Config f2 method");
	}

}
