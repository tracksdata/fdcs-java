package com.cts.product.dao;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	public void saveProduct(Product prod) {
		System.out.println("Dao: Saving " + prod.getProdName() + " to DB");
	}

}
