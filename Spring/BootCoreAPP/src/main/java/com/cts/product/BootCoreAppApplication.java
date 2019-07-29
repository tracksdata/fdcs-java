package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.EmployeeServiceImpl;
import com.cts.product.service.ProductServiceImpl;

@SpringBootApplication
public class BootCoreAppApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(BootCoreAppApplication.class, args);
		
		ProductServiceImpl ps=ac.getBean(ProductServiceImpl.class);
		EmployeeServiceImpl es=ac.getBean(EmployeeServiceImpl.class);
		es.testEmployeeService();
		ps.testService();
		
	}

}
