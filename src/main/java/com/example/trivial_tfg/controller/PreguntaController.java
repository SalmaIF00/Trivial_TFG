package com.example.trivial_tfg.controller;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.services.PreguntaService;

@Controller
public class PreguntaController {
	@Autowired
	private PreguntaService preguntaService;

	// CONTROLADOR MOSTRAR PREGUNTAS ALEATORIAS
	/**
	 * Guiarse con el springQuiz, cada muestra de pregunta era un controlador distinto
	 * Intentar hacer un controlador por pregunta, almacenando el id_pregunta en un array estático
	 * Dicho array no podrá repetirse (if id_pregunta != array) se almacena y se muestra.
	 * 
	 * @return
	 */
	@GetMapping("/preguntas_opciones")
	public String ranking() {

		return "html/preguntas_opciones";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/mostrarPreguntas/{id_asignatura}")
	public Set<Pregunta> mostrarPregunta(Model model, HttpSession session,
			@PathVariable(value = "id_asignatura") Long id_asignatura) {
		Set<Pregunta> preguntas = preguntaService.listarPreguntas(id_asignatura);
		return preguntas;
	}

}
