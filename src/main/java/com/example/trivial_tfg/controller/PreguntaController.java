package com.example.trivial_tfg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.services.PreguntaService;

@Controller
public class PreguntaController {
	@Autowired
	private PreguntaService preguntaService;

	// CONTROLADOR MOSTRAR PREGUNTAS ALEATORIAS
	@GetMapping("/pregunta/{id_asignatura}")
	public String pregunta(HttpSession session, @PathVariable("id_asignatura") Long id_asignatura, Model model,
			HttpServletRequest request) {

		@SuppressWarnings("unchecked")
		Integer cont = (Integer) session.getAttribute("contador");
		List<String> resp = (List<String>) session.getAttribute("respuesta");

		/* Recuperamos session del contador */
		if (cont == null) {
			cont = 0;
		}

		/* Recuperamos session de las respuestas */
		if (resp == null) {
			resp = new ArrayList<>();
		}

		/* Esta función devolverá las 10 preguntas que correspondan a la asignatura */
		Long[] id_preguntas = preguntaService.listarPreguntas(id_asignatura);

		Pregunta p = preguntaService.buscarPregunta(id_preguntas);

		model.addAttribute("id_asignatura", id_asignatura);
		model.addAttribute("respuesta", p.getRespuestas());
		model.addAttribute("pregunta", p.getPregunta());

		request.getSession().setAttribute("contador", cont + 1);
		if (cont == 10) {
			return "html/ranking";
		} else {
			return "html/preguntas_opciones";
		}
	}

//	@PostMapping("/pregunta/{id_asignatura}")
//	public String persistPregunta(@RequestParam("respuesta") String respuesta, HttpServletRequest request){
//		// Recuperamos la sesión de respuestas
//		List<Integer> resp = (List<Integer>) request.getSession().getAttribute("respuesta");
//		Integer cont = (Integer) request.getSession().getAttribute("contador");
//		
//		if(respuesta != null) {
//			request.getSession().setAttribute("respuesta", respuesta);
//		}
//		
//		if(cont == 10) {
//			return "html/ranking";
//		}else {
//			return "html/preguntas_opciones";
//		}
//	}

}
