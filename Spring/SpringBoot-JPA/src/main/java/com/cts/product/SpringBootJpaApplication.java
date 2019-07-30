package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootJpaApplication.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProdId("P026");
		prod.setProdName("IPad Air");
		prod.setPrice(126000);
		
		
		ps.saveProduct(prod);
		
		

	}

}
