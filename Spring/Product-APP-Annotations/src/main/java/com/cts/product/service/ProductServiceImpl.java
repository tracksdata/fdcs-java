package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

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
