package com.example.trivial_tfg.services;

import java.util.Optional;
import java.util.Set;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Pregunta;

public interface AsignaturaService {
	
	Asignatura crearAsignatura(Asignatura asignatura);
	
	Optional<Asignatura> buscarAsignatura(Long id_asignatura);
	
	Asignatura actualizarRespuesta(Asignatura asignatura);
	
	void borrarAsignatura(Long id_asignatura);
	
	Set<Asignatura> buscarCurso(Long id_curso);
	
	Set<Pregunta> buscarPreguntas(Long id_asignatura);

	

}
