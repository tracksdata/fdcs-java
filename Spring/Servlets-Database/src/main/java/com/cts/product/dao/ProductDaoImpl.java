package com.cts.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import com.cts.product.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void saveProduct(Product prod) {
		entityManager.persist(prod);
	}

	
	@Override
	public Product findById(String prodId) {
		
		return entityManager.find(Product.class, prodId);
	}

	@Override
	public List<Product> findByProductName(String prodName) {
		String q1 = "from Product prod where prod.prodName like '" + prodName + "'";
		TypedQuery<Product> qry = entityManager.createQuery(q1, Product.class);
		return qry.getResultList();
	}

	@Override
	public List<Product> findAll() {
		
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<Product> cq = builder.createQuery(Product.class);
    Root<Product> root = cq.from(Product.class);
    cq.select(root);
    return entityManager.createQuery(cq).getResultList();
	}

	@Override
	public void updateProductById(String prodId) {

		Product prod = findById(prodId);

		if (prod != null) {
			entityManager.merge(prod);
		}

	}

	@Override
	public Product updateProduct(Product prod) {
		return (Product) entityManager.merge(prod);
	}

	@Override
	public void deleteProductById(String prodId) {

		Product prod = findById(prodId);

		if (prod != null) {
			entityManager.remove(prod);
		}

	}

	@Override
	public void deleteProduct(Product prod) {
		entityManager.remove(prod);
	}


}
