package com.example.trivial_tfg.services;


import java.util.List;
import java.util.Optional;

import com.example.trivial_tfg.entity.Pregunta;

public interface PreguntaService{
	
	 Pregunta crearPregunta(Pregunta pregunta);
		
	 Optional<Pregunta> buscarPregunta(Long id_pregunta);
	
	 Pregunta actualizarPregunta(Pregunta pregunta);
	
	 void borrarPregunta(Long id_pregunta);
	 
	 List<Pregunta> listarPreguntas(Long id_asignatura);
}
