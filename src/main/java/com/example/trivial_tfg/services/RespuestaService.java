package com.example.trivial_tfg.services;

import java.util.List;
import java.util.Optional;

import com.example.trivial_tfg.entity.Respuesta;

public interface RespuestaService{
	
	Respuesta crearRespuesta(Respuesta respuesta);
	
	 Optional<Respuesta> buscarRespuesta(Long id_respuesta);
	
	Respuesta actualizarRespuesta(Respuesta respuesta);
	
	void borrarRespuesta(Long id_respuesta);
	
	List<Respuesta> buscarIdPregunta(Long id_pregunta);

}
