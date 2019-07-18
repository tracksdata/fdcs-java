package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

public class SaveProduct {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod = new Product();
		prod.setProdId("P005");
		prod.setProdName("Computer");
		prod.setPrice(348374);

		ProductService ps = ctx.getBean(ProductService.class);
		ps.saveProduct(prod);

		ctx.close();

	}

}
