package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.RolService;

@Controller
public class RolController {
	@Autowired
	private RolService rolService;
}
