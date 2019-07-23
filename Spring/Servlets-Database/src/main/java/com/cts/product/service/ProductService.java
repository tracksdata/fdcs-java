package com.cts.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cts.product.entities.Product;

public interface ProductService {

	void saveProduct(Product prod);

	
	Product findByproductId(String prodId);

	List<Product> findByProductName(String prodName);

	List<Product> findAll();

	Product updateProduct(Product prod);

	void updateProductById(String prodId);

	void deleteProductById(String prodId);

	void deleteProduct(Product prod);
	

}