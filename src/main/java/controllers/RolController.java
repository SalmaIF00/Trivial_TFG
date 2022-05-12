package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import services.RolService;

@Controller
public class RolController {
	@Autowired
	private RolService rolService;
}
