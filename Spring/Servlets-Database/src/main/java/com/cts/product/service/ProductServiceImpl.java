package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional
	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
	}


	@Override
	@Transactional
	public Product findByproductId(String prodId) {
		return prodDao.findById(prodId);
	}

	@Override
	@Transactional
	public List<Product> findByProductName(String prodName) {
		return prodDao.findByProductName(prodName);
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override
	@Transactional
	public Product updateProduct(Product prod) {
		return prodDao.updateProduct(prod);
	}

	@Override
	@Transactional
	public void updateProductById(String prodId) {
		prodDao.updateProductById(prodId);
	}

	@Override
	@Transactional
	public void deleteProductById(String prodId) {
		prodDao.deleteProductById(prodId);
	}

	@Override
	@Transactional
	public void deleteProduct(Product prod) {
		prodDao.deleteProduct(prod);
	}
	

}
