package com.example.trivial_tfg.services;


import com.example.trivial_tfg.entity.Pregunta;

public interface PreguntaService{
	
	 Pregunta crearPregunta(Pregunta pregunta);
		
	 Long[] listarPreguntas(Long id_asignatura);

	Pregunta buscarPregunta(Long[] id_preguntas);
	 
}
