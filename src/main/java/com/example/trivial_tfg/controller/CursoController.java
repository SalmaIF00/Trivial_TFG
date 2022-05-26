package com.example.trivial_tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.trivial_tfg.services.CursoService;

@Controller
public class CursoController {
	@Autowired
	private  CursoService cursoService;
}
