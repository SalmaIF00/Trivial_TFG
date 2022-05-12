package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import services.PreguntaService;

@Controller
public class PreguntaController {
	@Autowired
	private  PreguntaService preguntaService;
}
