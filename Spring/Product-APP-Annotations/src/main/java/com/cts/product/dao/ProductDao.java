package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	Product findzbyId(String prodId);

	List<Product> findAll();

}