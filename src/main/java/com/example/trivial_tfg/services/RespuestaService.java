package com.example.trivial_tfg.services;

import java.util.Optional;
import java.util.Set;

import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.entity.Respuesta;

public interface RespuestaService{
	
	Respuesta crearRespuesta(Respuesta respuesta);
	
	 Optional<Respuesta> buscarRespuesta(Long id_respuesta);
	
	Respuesta actualizarRespuesta(Respuesta respuesta);
	
	void borrarRespuesta(Long id_respuesta);
	
	Set<Respuesta> buscarIdPregunta(Long id_pregunta);

}
