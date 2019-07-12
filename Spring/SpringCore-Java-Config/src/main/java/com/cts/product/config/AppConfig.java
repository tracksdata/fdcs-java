package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.cts.product.service,com.cts.product.dao" })
public class AppConfig {

	@Bean
	public void test() {
		System.out.println("-- Default Data");
	}

	@Bean
	public void test1() {
		System.out.println("--- Another");
	}

}
