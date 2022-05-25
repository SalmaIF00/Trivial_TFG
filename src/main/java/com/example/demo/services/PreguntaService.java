package com.example.demo.services;


import com.example.demo.entity.Pregunta;

public interface PreguntaService{
	
	 Pregunta crearPregunta(Pregunta pregunta);
		
	 Pregunta buscarPregunta(Long id_pregunta);
	
	 Pregunta actualizarPregunta(Pregunta pregunta);
	
	 void borrarPregunta(Long id_pregunta);

}
