package com.cts.employee.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		

	}

}
