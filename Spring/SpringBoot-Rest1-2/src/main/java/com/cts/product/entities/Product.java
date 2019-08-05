package com.cts.product.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CookieValue;

@Entity
public class Product {
	@Id
	@Column(name="prod_id")
	private String prodId;
	@Column(name="prod_name")
	private String prodName;
	private double price;

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
