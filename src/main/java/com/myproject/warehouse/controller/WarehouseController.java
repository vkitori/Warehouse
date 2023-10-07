package com.myproject.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WarehouseController {
	
	@GetMapping("/home")
	public String getHome(Model model) {
		
		return "home";
	}

}
