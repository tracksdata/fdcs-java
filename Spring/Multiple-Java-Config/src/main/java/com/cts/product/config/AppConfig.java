package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {InfrastructireConfig.class,WebConfig.class})
public class AppConfig {

	@Bean
	public void f3() {
		System.out.println("--- AppConfig Config f3 method");
	}

}
