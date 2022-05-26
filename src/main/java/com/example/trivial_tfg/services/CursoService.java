package com.example.trivial_tfg.services;

import java.util.Optional;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Curso;

public interface CursoService{
	
	 Curso crearCurso(Curso  curso);
	
	 Optional<Curso> buscarCurso(Long id_curso);
	
	 Curso actualizarCurso(Curso  curso);
	
	 void borrarCurso(Long id_curso);

}
