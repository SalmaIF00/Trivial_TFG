package com.example.trivial_tfg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.services.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	// CONTROLADOR REGISTRAR USUARIO
	@PostMapping("/registro")
	public String registrar_usuario(Model model, HttpServletRequest request,
			@RequestParam("nombre") String nombre,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("nombre_usuario") String nombre_usuario,
			@RequestParam("password") String password,
			@RequestParam Long curso) {
		
		Usuario usuario = usuarioService.crearUsuario(null, curso, nombre, apellidos, nombre_usuario, password, "Alumno");
		
		return "redirect:/index";
	}
			
	// CONTROLADOR INICIO SESION USUARIO
	@PostMapping("/sesion")
	public String registrar_usuario(Model model, HttpServletRequest request, HttpSession httpSession, 
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("password") String password) {
		
		Usuario usuario1 = usuarioService.buscarNomYPwd(nombre,password);
		if(usuario1 !=null) {
			httpSession.setAttribute("usuario", usuario1);
			return "redirect:/asignaturas";
		}else {
			return "redirect:/index";
		}
		
	}
	
	
	// CONTROLADOR MOSTRAR PERFIL
	@GetMapping("/perfil")
	public String getPerfil() {

		return "html/perfil";
	}
}
