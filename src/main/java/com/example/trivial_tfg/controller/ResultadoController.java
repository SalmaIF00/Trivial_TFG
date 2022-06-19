package com.example.trivial_tfg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.trivial_tfg.entity.Resultado;
import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.services.ResultadoService;

@Controller
public class ResultadoController {
	@Autowired
	private ResultadoService resultadoService;

	// CONTROLADOR PARA MOSTRAR RANKING
	@GetMapping("/ranking")
	public String ranking() {

		return "html/ranking";
	}

	// CONTROLADOR PARA MOSTRAR TODOS LOS RESULTADOS
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/resultados_ranking")
	public List<Resultado> resultado(Model model) {
		List<Resultado> resultados = (List<Resultado>) resultadoService.buscarResultados();
		
		return resultados;
	}
	
	// CONTROLADOR PARA MOSTRAR TODOS LOS RESULTADOS
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/resultados_perfil")
	public List<Resultado> resultadoperfil(Model model, HttpSession session) {
		Usuario u = (Usuario) session.getAttribute("usuario");
		List<Resultado> resultados = (List<Resultado>) resultadoService.buscarPorUsuario(u.getId_usuario());

		return resultados;
	}
}
