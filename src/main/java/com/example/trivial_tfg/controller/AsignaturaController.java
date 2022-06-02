package com.example.trivial_tfg.controller;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.services.AsignaturaService;
import com.example.trivial_tfg.services.CursoService;

@Controller
public class AsignaturaController {
	@Autowired
	private  AsignaturaService asignaturaService;
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/asignaturas")
	public String mostrarAsignaturas(Model model,HttpSession session) {
		Usuario u = (Usuario) session.getAttribute("usuario");
		Long id_curso = u.getCurso().getId_curso();
		
		Set<Asignatura> asignaturas = asignaturaService.buscarCurso(id_curso);
		
		model.addAttribute("asignaturas",asignaturas);
		return "html/asignaturas";
	}
	
}



