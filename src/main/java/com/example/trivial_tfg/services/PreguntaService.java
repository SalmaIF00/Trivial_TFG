package com.example.trivial_tfg.services;


import java.util.Optional;
import java.util.Set;

import com.example.trivial_tfg.entity.Pregunta;

public interface PreguntaService{
	
	 Pregunta crearPregunta(Pregunta pregunta);
		
	 Optional<Pregunta> buscarPregunta(Long id_pregunta);
	
	 Pregunta actualizarPregunta(Pregunta pregunta);
	
	 void borrarPregunta(Long id_pregunta);
	 
	 Set<Pregunta> listarPreguntas(Long id_asignatura);
}
