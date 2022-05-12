package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import services.CursoService;

@Controller
public class CursoController {
	@Autowired
	private  CursoService cursoService;
}
