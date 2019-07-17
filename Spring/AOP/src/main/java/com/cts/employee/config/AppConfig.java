package com.cts.employee.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cts.employee.dao,com.cts.employee.model,com.cts.employee.aop")
@EnableAspectJAutoProxy
public class AppConfig {
	
	

}
