package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfrastructireConfig {

	@Bean
	public void f1() {
		System.out.println("--- Infrastructire Config f1 method");
	}

}
