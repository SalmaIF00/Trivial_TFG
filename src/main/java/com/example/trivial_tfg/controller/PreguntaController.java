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

	/**
	 * Guiarse con el springQuiz, cada muestra de pregunta era un controlador
	 * distinto Intentar hacer un controlador por pregunta, almacenando el
	 * id_pregunta en un array estático Dicho array no podrá repetirse (if
	 * id_pregunta != array) se almacena y se muestra.
	 * 
	 * @return
	 */

	// CONTROLADOR MOSTRAR PREGUNTAS ALEATORIAS
	@GetMapping("/pregunta/{id_asignatura}")
	public String pregunta(HttpSession session,	@PathVariable("id_asignatura") Long id_asignatura, Model model, HttpServletRequest request) {

		@SuppressWarnings("unchecked")
		Integer cont = (Integer) session.getAttribute("contador");
		List<String> resp = (List<String>) session.getAttribute("respuesta");

		if (cont == null) {
			cont = 0;
		}

		if (resp == null) {
			resp = new ArrayList<>();
		}

		/* Esta función devolverá las 10 preguntas que correspondan a la asignatura */
		Long[] id_preguntas = preguntaService.listarPreguntas(id_asignatura);

		/* Buscamos un número random entre 0 a 9 */
		Integer random = (int) Math.floor(Math.random() * 10);

		/* Todos los números random se almacenarán en este array */
		List<Integer> set = new ArrayList<>();
		set.add(random);

		/* Buscamos el id_pregunta recorriendo el array según el número random */
		Long buscarID = id_preguntas[random];

		/* Tras encontrar el id_pregunta se obtendrá la pregunta completa */
		Pregunta p = preguntaService.buscarPregunta(buscarID);

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
