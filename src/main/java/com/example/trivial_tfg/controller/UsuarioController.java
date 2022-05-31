package com.example.trivial_tfg.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.services.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	// CONTROLADOR REGISTRAR USUARIO
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "registrar")
	public Usuario registrarUsuario(@RequestBody Map<String, String> json) {
		return usuarioService.crearUsuario(null, json.get("nombre"), json.get("apellidos"), json.get("nombre_usuario"),
				json.get("password"), "Usuario");
	}
	
	// CONTROLADOR MOSTRAR PERFIL
	@GetMapping("/perfil")
	public String getPerfil() {

		return "html/perfil";
	}
}
