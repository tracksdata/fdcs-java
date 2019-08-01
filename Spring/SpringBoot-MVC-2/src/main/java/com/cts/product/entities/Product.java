package com.cts.product.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Product {

	@Id
	private String prodId;
	private String prodName;
	private double price;

	@Transient
	List<Product> prods;
	
	@Transient
	List<String> ids;
	

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public List<Product> getProds() {
		return prods;
	}

	public void setProds(List<Product> prods) {
		this.prods = prods;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
