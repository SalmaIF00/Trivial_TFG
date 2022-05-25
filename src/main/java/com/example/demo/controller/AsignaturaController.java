package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.AsignaturaService;

@Controller
public class AsignaturaController {
	@Autowired
	private  AsignaturaService asignaturaService;
}
