package com.ns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/add")
	public String addContact() {
		return "contact";
	}
	
	@RequestMapping("/search-by-id")
	public String searchById() {
		return "search";
	}
}
