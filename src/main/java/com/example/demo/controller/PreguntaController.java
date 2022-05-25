package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.PreguntaService;

@Controller
public class PreguntaController {
	@Autowired
	private  PreguntaService preguntaService;
}
