package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import com.cts.product.entities.Product;

public interface ProductService {

	void saveProduct(Product prod);

	public List<Product> findOnlyIpads();

	Product findByproductId(String prodId);

	List<Product> findByProductName(String prodName);

	List<Product> findAll();

	Product updateProduct(Product prod);

	void updateProductById(String prodId);

	void deleteProductById(String prodId);

	void deleteProduct(Product prod);

}