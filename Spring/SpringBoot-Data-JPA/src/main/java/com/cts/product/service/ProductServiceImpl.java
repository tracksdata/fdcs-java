package com.cts.product.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	public void saveProduct(Product prod) {

		prodDao.save(prod);

	}

	public Product findByproductId(String prodId) {
		return prodDao.findById(prodId).orElse(null);
	}

	public List<Product> findByProductName(String prodName) {
		return prodDao.findByProdNameIsLike(prodName);
	}

	public List<Product> findAll() {

		return prodDao.findAll();
	}

	
	public List<Product> findOnlyIpads(){
		return prodDao.findAllIpads();
	}
	
	public Product updateProduct(Product prod) {
		return prodDao.save(prod);
	}

	public void updateProductById(String prodId) {

	}

	public void deleteProductById(String prodId) {
		prodDao.deleteById(prodId);
	}

	public void deleteProduct(Product prod) {
		prodDao.delete(prod);
	}

}
