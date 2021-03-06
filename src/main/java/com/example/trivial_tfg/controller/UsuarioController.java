package com.example.trivial_tfg.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.services.UsuarioService;

/**
 * Controlador registrar_usuario e iniciar_usuario se realizará directamente JAVA y HTML
 * Controlador mostrar_perfil recogerá los datos del usuario en JAVA, pasándolo en JS y mostránodlo en HTML
 * @author jpiano - sidrissi
 */
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
	public String iniciar_usuario(Model model, HttpServletRequest request, HttpSession httpSession, 
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("password") String password) {
		
		Usuario usuario1 = usuarioService.buscarNomYPwd(nombre,password);
		if(usuario1 !=null) {
			httpSession.setAttribute("usuario", usuario1);
			return "redirect:/perfil";
		}else {
			return "redirect:/index";
		}
		
	}
	
	// CONTROLADOR MOSTRAR PERFIL - OK
	/**
	 * Se obtiene solo los datos de usuario (los resultados irán en otro controlador y se pasarán a JS)
	 * 
	 */
	@GetMapping("/perfil")
	public String getPerfil(Model model, HttpSession session) {
		Usuario u = (Usuario) session.getAttribute("usuario");
		
		Long idU = u.getId_usuario();
		Usuario usuario = (Usuario) usuarioService.findById(idU);
		
		model.addAttribute("usuario", usuario);
		
		return "html/perfil";
	}
	
	//CONTROLADOR CERRAR SESIÓN - OK
	@GetMapping("/logout")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/index";
	}
}
