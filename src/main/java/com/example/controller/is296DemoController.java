package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.vo.Datasource;

@Controller
public class is296DemoController {
	private Datasource ds;
	
	public Is296DemoController(Datasource ds) {
		System.out.println("Controller instantiated");
		this.ds = ds;

		
	}
	
	@GetMapping()
	public String getHomePage() {
		
	}

}
