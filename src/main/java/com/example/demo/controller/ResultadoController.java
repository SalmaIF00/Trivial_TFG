package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.ResultadoService;

@Controller
public class ResultadoController {
	@Autowired
	private ResultadoService resultadoService;
}
