package com.myproject.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myproject.warehouse.domain.Product;
import com.myproject.warehouse.service.ProductService;

@Controller
public class WarehouseController {
	
	private ProductService productService;
	
	public WarehouseController(ProductService productService) {
		super();
		this.productService = productService;
	}



	@GetMapping("/home")
	public String getHome(Model model) {
		
		Product[] products = productService.getProducts();
		
		model.addAttribute("products", products);
		
		return "home";
	}

}
