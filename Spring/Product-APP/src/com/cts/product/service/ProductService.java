package com.cts.product.service;

import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

public interface ProductService {

	void saveProduct(Product prod);

	Product findzbyId(String prodId);

	List<Product> findAll();
	
	public void setProdDao(ProductDao prodDao);

}