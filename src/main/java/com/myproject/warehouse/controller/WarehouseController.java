package com.myproject.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.myproject.warehouse.domain.Product;
import com.myproject.warehouse.service.ProductService;

@Controller
public class WarehouseController {
	
	private ProductService productService;
	
	public WarehouseController(ProductService productService) {
		this.productService = productService;
	}

	
	@PostMapping("/index")
	public String addProduct(Model model, Product product) {

		Integer result = productService.addProduct(product);

		if (result < 1) {
			model.addAttribute("errorMessage", String.format("Can not add %s", product.getName()));
		}

		model.addAttribute("successMessage", String.format("Succesfully added %s", product.getName()));

		Product[] products = productService.getProducts();

		model.addAttribute("products", products);
		return "index";
	}
	
	/*@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
	    Product product = productService.getProductById(id);
	    model.addAttribute("editProduct", product);
	    return "editProduct";
	}*/
	
	@PostMapping("/update")
	public String update(Model model, Product product) {
		

		productService.updateProductById(product);
		return "redirect:/index";
	}

	@GetMapping("/delete/{id}")
	public String deleteProduct(Model model, @PathVariable("id") int id) {
		
		productService.deleteProductById(id);
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String getindex(Model model, Product product) {
		
		Product[] products = productService.getProducts();
		
		model.addAttribute("products", products);
		
		return "index";
	}

}
