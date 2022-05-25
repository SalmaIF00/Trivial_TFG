package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.CursoService;

@Controller
public class CursoController {
	@Autowired
	private  CursoService cursoService;
}
