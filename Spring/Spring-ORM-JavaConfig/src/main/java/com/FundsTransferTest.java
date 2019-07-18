package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.AccountService;
import com.cts.product.service.ProductService;

public class FundsTransferTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		
		AccountService as=ctx.getBean(AccountService.class);
		as.transferFunds(1024, 1026, 1000);
		

		ctx.close();

	}

}
