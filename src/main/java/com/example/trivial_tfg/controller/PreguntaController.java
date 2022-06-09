package com.example.trivial_tfg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.entity.Respuesta;
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

	// CONTROLADOR PREGUNTA 1
	@GetMapping(value = { "/{id_asignatura}", "/pregunta" })
	public String pregunta1(HttpSession session, @PathVariable("id_asignatura") Long id_asignatura, Model model) {
		List<Pregunta> preguntas = (List<Pregunta>) preguntaService.listarPreguntas(id_asignatura);
		Pregunta p = null;
		String pregunta = null;
		
		for (int i = 0; i <= preguntas.size(); i++) {
			p = preguntas.get(0);
			pregunta = p.getPregunta();
		}

		List<Respuesta> respuesta = (List<Respuesta>) respuestaService.buscarIdPregunta(p.getId_pregunta());
		model.addAttribute("respuesta", respuesta);
		model.addAttribute("pregunta", pregunta);
		model.addAttribute("id_asignatura", id_asignatura);
		
		return "html/preguntas_opciones";
	}

	@PostMapping(value = { "/{id_asignatura}", "/pregunta" })
	public String persistPregunta1(@PathVariable("id_asignatura") Long id_asignatura, Model model) {

		return "redirect:/preguntas_opciones";
	}

	
	
	
	
	
	
//	// CONTROLADOR PREGUNTA 2
//	@GetMapping("/pregunta2")
//	public String pregunta2(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {
//		System.out.print(id_asignatura);
//		List<Pregunta> preguntas = (List<Pregunta>) preguntaService.listarPreguntas(id_asignatura);
//
//		Pregunta p = null;
//		String pregunta = null;
//
//		for (int i = 0; i <= preguntas.size(); i++) {
//			p = preguntas.get(1);
//			pregunta = p.getPregunta();
//		}
//
//		List<Respuesta> respuesta = (List<Respuesta>) respuestaService.buscarIdPregunta(p.getId_pregunta());
//		model.addAttribute("respuesta", respuesta);
//		model.addAttribute("pregunta", pregunta);
//
//		return "html/preguntas_opciones2";
//	}
//
//	@PostMapping("/{id_asignatura}/2")
//	public String persistPregunta2(@PathVariable("id_asignatura") Long id_asignatura, Model model,
//			HttpSession session) {
//
//		return "redirect:/pregunta3";
//	}
//
//	// CONTROLADOR PREGUNTA 3
//	@GetMapping("/pregunta3")
//	public String pregunta3(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {
//
//		return "html/preguntas_opciones3";
//	}
//
//	@PostMapping("/pregunta3")
//	public String persistPregunta3(@PathVariable("id_asignatura") Long id_asignatura, Model model,
//			HttpSession session) {
//
//		return "html/preguntas_opciones4";
//	}
//
//	// CONTROLADOR PREGUNTA 4
//	@GetMapping("/pregunta4")
//	public String pregunta4(@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpSession session) {
//
//		return "html/preguntas_opciones4";
//	}
//
//	@PostMapping("/pregunta4")
//	public String persistPregunta4(@PathVariable("id_asignatura") Long id_asignatura, Model model,
//			HttpSession session) {
//
//		return "html/preguntas_opciones5";
//	}

	// CONTROLADOR PREGUNTA 5

	// CONTROLADOR PREGUNTA 6

	// CONTROLADOR PREGUNTA 7

	// CONTROLADOR PREGUNTA 8

	// CONTROLADOR PREGUNTA 9

	// CONTROLADOR PREGUNTA 10
}
