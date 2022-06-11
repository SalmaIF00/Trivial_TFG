package com.example.trivial_tfg.services;


import java.util.Set;

import com.example.trivial_tfg.entity.Pregunta;

public interface PreguntaService{
	
	 Pregunta crearPregunta(Pregunta pregunta);
		
	 Pregunta buscarPregunta(Long id_pregunta);
	
	 Pregunta actualizarPregunta(Pregunta pregunta);
	
	 void borrarPregunta(Long id_pregunta);
	 
	 Long[] listarPreguntas(Long id_asignatura);
	 
	 
	 
	 
}
