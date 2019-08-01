package com.cts.product.controoler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("s1")
	public void f1() {
		System.out.println("--- f1 method");
	}
	
	
	@RequestMapping("s2")
	public String f2(Model model) {
		System.out.println("--- f2 method");
		model.addAttribute("name", "Praveen");
		return "one";
	}
	
}
