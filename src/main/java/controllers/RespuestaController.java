package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import services.RespuestaService;

@Controller
public class RespuestaController {
	@Autowired
	private  RespuestaService respuestaService;
}
