package com;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

public class FindTest2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ctx.getBean(ProductService.class);

		List<Product> prods = ps.findByProductName("%e%");

		for (Product prod : prods) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("----------------------");
		}

		ctx.close();

	}

}
