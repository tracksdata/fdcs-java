package com.cts.product.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/products")
public class ProductRestController {

	
	@GetMapping
	public String greet() {
		return "Good Morning";
	}
	
	@PostMapping
	public String postData() {
		return "Good Morning Post Request";
	}
	
}
