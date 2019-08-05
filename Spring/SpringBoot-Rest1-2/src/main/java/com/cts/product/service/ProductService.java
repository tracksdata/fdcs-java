package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import com.cts.product.entities.Product;

public interface ProductService {

	Product saveProduct(Product prod);

	public List<Product> findAnyProduct(String prodName);

	Product findByproductId(String prodId);

	List<Product> findByProductName(String prodName);

	List<Product> findAll();

	Product updateProduct(Product prod);

	void updateProductById(String prodId);

	void deleteProductById(String prodId);

	void deleteProduct(Product prod);

}