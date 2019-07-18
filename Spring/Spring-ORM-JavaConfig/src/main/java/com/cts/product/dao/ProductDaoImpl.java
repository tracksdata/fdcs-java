package com.cts.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entities.Product;
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void saveProduct(Product prod) {
		Session ses = sf.getCurrentSession();
		ses.save(prod);
	}

	@Override
	public Product findById(String prodId) {
		return sf.getCurrentSession().get(Product.class, prodId);
	}

	@Override
	public List<Product> findByProductName(String prodName) {
		String q1 = "from Product prod where prod.prodName like '"+ prodName+"'";
		Query<Product> qry = sf.getCurrentSession().createQuery(q1, Product.class);
		return qry.list();
	}

	@Override
	public List<Product> findAll() {
		String q1 = "from Product";
		Query<Product> qry = sf.getCurrentSession().createQuery(q1, Product.class);
		return qry.list();
	}

	@Override
	public void updateProductById(String prodId) {

		Product prod = findById(prodId);

		if (prod != null) {
			sf.getCurrentSession().update(prod);
		}

	}

	@Override
	public Product updateProduct(Product prod) {
		return (Product) sf.getCurrentSession().merge(prod);
	}

	@Override
	public void deleteProductById(String prodId) {

		Product prod = findById(prodId);

		if (prod != null) {
			sf.getCurrentSession().delete(prod);
		}

	}

	@Override
	public void deleteProduct(Product prod) {
		sf.getCurrentSession().delete(prod);
	}

}
