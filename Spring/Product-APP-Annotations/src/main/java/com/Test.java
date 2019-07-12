package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(458478);

		// ProductDao prodDao = new ProductDaoImpl();

		// ProductService prodService = new ProductServiceImpl();
		ProductService productService = ac.getBean(ProductService.class);

		// prodService.setProdDao(prodDao);

		productService.saveProduct(prod);

	}

}
