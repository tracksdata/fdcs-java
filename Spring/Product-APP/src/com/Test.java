package com;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(458478);

		ProductDao prodDao = new ProductDaoImpl();

		ProductService prodService = new ProductServiceImpl();

		prodService.setProdDao(prodDao);

		prodService.saveProduct(prod);

	}

}
