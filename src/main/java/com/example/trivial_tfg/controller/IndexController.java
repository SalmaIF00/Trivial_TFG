package com.example.trivial_tfg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

	// CONTROLADOR MOSTRAR INDEX 
	@GetMapping(value = { "/index", "/" })
	public String getIndex() {

		return "html/index";
	}
}
