package com.bolsadeideas.springboot.horariointerceptor.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({"", "/", "/index", "/index/"})
	public String index(Model model) {
		return "index";
	}
	
}
