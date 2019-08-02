package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;

@RestController
@RequestMapping("api/products")
public class ProductRestController {

	@GetMapping
	public String f1() {
		return "Welcome to Spring Rest -  for GET request";
	}

	@GetMapping("/stores")
	public String f5() {
		return "Welcome to Spring Rest for to get store info -  for GET request";
	}

	@GetMapping("/product")
	public Product f6() {

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(374673);

		return prod;
	}
	
	@GetMapping("/ele")
	public List<Product> f7() {
		
		List<Product> prods=new ArrayList<Product>();

		Product prod1 = new Product();
		prod1.setProdId("P002");
		prod1.setProdName("Mobile");
		prod1.setPrice(834683);
		
		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(374673);
		
		prods.add(prod);
		prods.add(prod1);

		return prods;
	}
	

	@PostMapping
	public String f2() {
		return "Welcome to Spring Rest - for POST  request";
	}

	@PutMapping
	public String f3() {
		return "Welcome to Spring Rest - for PUT request";
	}

	@DeleteMapping
	public String f4() {
		return "Welcome to Spring Rest - for  DELETE request";
	}

}
