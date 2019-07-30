package com.cts.product;

import java.util.List;

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

		//Product prod = new Product();
		//prod.setProdId("P027");
		//prod.setProdName("IPad MIni");
		//prod.setPrice(92000);
		
		
		//ps.saveProduct(prod);
		
		List<Product> prods=ps.findOnlyIpads();
		
		for(Product prod:prods) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("--------------------");
		}
		

	}

}
