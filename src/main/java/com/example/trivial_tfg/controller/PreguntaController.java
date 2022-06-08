package com.example.trivial_tfg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.services.PreguntaService;
import com.example.trivial_tfg.services.RespuestaService;

@Controller
public class PreguntaController {
	@Autowired
	private PreguntaService preguntaService;

	@Autowired
	private RespuestaService respuestaService;

	// CONTROLADOR MOSTRAR PREGUNTAS ALEATORIAS
	/**
	 * Guiarse con el springQuiz, cada muestra de pregunta era un controlador
	 * distinto Intentar hacer un controlador por pregunta, almacenando el
	 * id_pregunta en un array estático Dicho array no podrá repetirse (if
	 * id_pregunta != array) se almacena y se muestra.
	 * 
	 * @return
	 */
//	@GetMapping("/preguntas_opciones")
//	public String ranking() {
//
//		return "html/preguntas_opciones";
//	}
//
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.POST, value = "/{asignatura}/pregunta")
//	public Set<Pregunta> mostrarPregunta(Model model, HttpSession session, @PathVariable(value = "id_asignatura") Long id_asignatura) {
//		Set<Pregunta> preguntas = preguntaService.listarPreguntas(id_asignatura);
//		
//		return preguntas;
//	}

//	static List<Pregunta> preguntas = null;

	// CONTROLADOR PREGUNTA 1
	@GetMapping("/{id_asignatura}")
	public String pregunta1(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {
//		System.out.print(id_asignatura);
//		List<Pregunta> preguntas = (List<Pregunta>) preguntaService.listarPreguntas(id_asignatura);
//		
//		Pregunta pregunta = preguntas.get(0);
//		String p = pregunta.getPregunta();
//		
//		String p = null;
//
//		List<Pregunta> preguntas = (List<Pregunta>) preguntaService.listarPreguntas(id_asignatura);
//		for (int i = 0; i <= preguntas.size(); i++) {
//			if (i == 0) {
//				Pregunta pregunta = preguntas.get(1);
//				p = pregunta.getPregunta();
//			}
//		}
//
//		model.addAttribute("pregunta", p);
		return "html/preguntas_opciones";
	}

	@PostMapping("/{id_asignatura}")
	public String persistPregunta1(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {

		return "html/preguntas_opciones2";
	}

	// CONTROLADOR PREGUNTA 2
	@GetMapping("/pregunta2")
	public String pregunta2(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {
//			String p = null;
		//
//			List<Pregunta> preguntas = (List<Pregunta>) preguntaService.listarPreguntas(id_asignatura);
//			for (int i = 0; i <= preguntas.size(); i++) {
//				if (i == 0) {
//					Pregunta pregunta = preguntas.get(1);
//					p = pregunta.getPregunta();
//				}
//			}
		//
//			model.addAttribute("pregunta", p);
		return "html/preguntas_opciones2";
	}

	@PostMapping("/pregunta2")
	public String persistPregunta2(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {

		return "html/preguntas_opciones3";
	}

	// CONTROLADOR PREGUNTA 3
	@GetMapping("/pregunta3")
	public String pregunta3(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {

		return "html/preguntas_opciones3";
	}

	@PostMapping("/pregunta3")
	public String persistPregunta3(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {

		return "html/preguntas_opciones4";
	}

	// CONTROLADOR PREGUNTA 4
	@GetMapping("/pregunta4")
	public String pregunta4(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {

		return "html/preguntas_opciones4";
	}

	@PostMapping("/pregunta4")
	public String persistPregunta4(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {

		return "html/preguntas_opciones5";
	}
	
	// CONTROLADOR PREGUNTA 5

	// CONTROLADOR PREGUNTA 6

	// CONTROLADOR PREGUNTA 7

	// CONTROLADOR PREGUNTA 8

	// CONTROLADOR PREGUNTA 9

	// CONTROLADOR PREGUNTA 10
}
