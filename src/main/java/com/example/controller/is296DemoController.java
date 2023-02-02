package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.vo.Datasource;

@Controller
public class is296DemoController {
	private Datasource ds;
	
	public is296DemoController(Datasource ds) {
		System.out.println("Controler instantiated");
		this.ds = ds;

		
	}
	
	@GetMapping("/")
	public String getHomePage() {
		return "home";
		
	}

}
