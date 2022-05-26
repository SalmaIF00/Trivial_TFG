package com.example.trivial_tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.trivial_tfg.services.ResultadoService;

@Controller
public class ResultadoController {
	@Autowired
	private ResultadoService resultadoService;
}
