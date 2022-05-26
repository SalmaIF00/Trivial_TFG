package com.example.trivial_tfg.services;

import com.example.trivial_tfg.entity.Asignatura;

public interface AsignaturaService {
	
	Asignatura crearAsignatura(Asignatura Asignatura);
	
	Asignatura buscarAsignatura(Long id_asignatura);
	
	Asignatura actualizarRespuesta(Asignatura asignatura);
	
	void borrarAsignatura(Long id_asignatura);

}
