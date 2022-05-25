package com.example.demo.services;

import com.example.demo.entity.Asignatura;

public interface AsignaturaService {
	
	Asignatura crearAsignatura(Asignatura Asignatura);
	
	Asignatura buscarAsignatura(Long id_asignatura);
	
	Asignatura actualizarRespuesta(Asignatura asignatura);
	
	void borrarAsignatura(Long id_asignatura);

}
