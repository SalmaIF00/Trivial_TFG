package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import services.AsignaturaService;

@Controller
public class AsignaturaController {
	@Autowired
	private  AsignaturaService asignaturaService;
}
