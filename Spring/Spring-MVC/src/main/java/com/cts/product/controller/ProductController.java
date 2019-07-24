package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.model.Product;

@Controller
public class ProductController {

	@RequestMapping(value = { "/hello" })
	public void test() {
		System.out.println("--- ProductController test method for hello req");
	}

	@RequestMapping(value = { "s1" })
	public void test1() {
		System.out.println("--- ProductController test method for s1 req");
	}

	@RequestMapping("s2")
	public String test2() {
		System.out.println("--- test2 method");
		return "one";

	}

	@RequestMapping("s3")
	public String test3(Model data) {
		System.out.println("--- test3 method");

		data.addAttribute("name", "Praveen Reddy S");
		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(3846384);

		data.addAttribute("prod", prod);
		return "display";

	}

	@RequestMapping("s4")
	public ModelAndView test4() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("display");
		Product prod = new Product();
		prod.setProdId("P002");
		prod.setProdName("Mac Book Pro");
		prod.setPrice(34738486);

		mav.addObject("prod", prod);
		mav.addObject("name", "James");
		return mav;

	}

}
