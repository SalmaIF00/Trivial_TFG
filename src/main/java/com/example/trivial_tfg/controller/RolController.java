package com.example.trivial_tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.trivial_tfg.services.RolService;

@Controller
public class RolController {
	@Autowired
	private RolService rolService;

	// POSIBLEMENTE NO SEA NECESARIO
}
