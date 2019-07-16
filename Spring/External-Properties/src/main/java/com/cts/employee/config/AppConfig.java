package com.cts.employee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

// Ref web site: https://www.concretepage.com/spring-5/spring-value

@Configuration
@ComponentScan(basePackages = { "com.cts.employee.dao" })
@PropertySource(value = { "applicationContext.properties" })
public class AppConfig {

	@Value(value = "${db.url}")
	private String url;

	@Autowired
	private Environment env;

	@Bean
	public void test() {

		System.out.println("Name: " + env.getProperty("name"));
		System.out.println("URL: " + url);

	}

}
