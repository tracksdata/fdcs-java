package com.cts.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

//Dependency
@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public void saveProduct(Product prod) {
		System.out.println("Dao: " + prod.getProdId() + " Saved to DB");
	}

	@Override
	public Product findzbyId(String prodId) {

		return null;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

}
