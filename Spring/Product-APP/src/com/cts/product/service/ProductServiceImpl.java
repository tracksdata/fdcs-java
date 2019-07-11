package com.cts.product.service;

import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao;

	public void setProdDao(ProductDao prodDao) {
		this.prodDao = prodDao;
	}

	@Override
	public void saveProduct(Product prod) {

		prodDao.saveProduct(prod);

	}

	@Override
	public Product findzbyId(String prodId) {

		return prodDao.findzbyId(prodId);
	}

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

}
