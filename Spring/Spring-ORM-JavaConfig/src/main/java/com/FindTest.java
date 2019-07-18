package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

public class FindTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ctx.getBean(ProductService.class);
		Product prod = ps.findByproductId("P002");

		if (prod != null) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
		} else {
			System.out.println("Product id not found");
		}

		ctx.close();

	}

}
