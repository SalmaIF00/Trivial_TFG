package com.example.trivial_tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.trivial_tfg.services.AsignaturaService;

@Controller
public class AsignaturaController {
	@Autowired
	private  AsignaturaService asignaturaService;
}
