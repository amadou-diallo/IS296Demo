package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.controller.is296DemoController;
import com.example.vo.Datasource;



@Controller
public class Datasource2 {
	private is296DemoController ds;
	
	public Datasource2(is296DemoController ds) {
		System.out.println("Controller instantiated");
		this.ds = ds;

		
	}

}