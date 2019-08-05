package com.cts.product.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductRestController {

	@Autowired
	private ProductService ps;

	@GetMapping
	public ResponseEntity<List<Product>> listAll() {
		return ResponseEntity.ok(ps.findAll());
	}

	@GetMapping(value = "/{prodId}")
	public ResponseEntity<?> findProductById(@PathVariable("prodId") String prodId) {
		System.out.println("-- > Id: " + prodId);

		Product prod = ps.findByproductId(prodId);

		if (prod != null) {
			return ResponseEntity.ok(prod);
		}

		return ResponseEntity.badRequest().body("Product Id " + prodId + " not Found in out database");
	}

	@GetMapping("product/{prodName}")
	public ResponseEntity<List<Product>> findByName(@PathVariable("prodName") String prodName) {
		return ResponseEntity.ok(ps.findAnyProduct("%" + prodName + "%"));
	}

	@PostMapping
	public ResponseEntity<?> saveProduct(@RequestBody Product prod) {
		return ResponseEntity.ok(ps.saveProduct(prod));
	}

	@DeleteMapping("{prodId}")
	public ResponseEntity<?> removeProduct(@PathVariable("prodId") String prodId) {
		Product prod = ps.findByproductId(prodId);

		if (prod != null) {
			ps.deleteProductById(prodId);
			return ResponseEntity.ok(prod);
		}

		return ResponseEntity.badRequest().body("Product Id " + prodId + " Not found");
	}

	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product prod) {

		Product p = ps.findByproductId(prod.getProdId());

		if (p != null) {
			ps.updateProduct(prod);
			return ResponseEntity.ok(prod);
		}

		return ResponseEntity.badRequest().body("Product Id " + prod.getProdId() + " Not Found");

	}

}
