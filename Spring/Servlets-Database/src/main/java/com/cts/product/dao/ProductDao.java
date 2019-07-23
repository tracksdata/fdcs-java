package com.cts.product.dao;

import java.util.List;

import com.cts.product.entities.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	
	Product findById(String prodId);

	List<Product> findByProductName(String prodName);

	List<Product> findAll();

	void updateProductById(String prodId);

	Product updateProduct(Product prod);

	void deleteProductById(String prodId);

	void deleteProduct(Product prod);

}