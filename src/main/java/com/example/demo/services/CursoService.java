package com.example.demo.services;

import com.example.demo.entity.Curso;

public interface CursoService{
	
	 Curso crearCurso(Curso  curso);
	
	 Curso buscarCurso(Long id_curso);
	
	 Curso actualizarCurso(Curso  curso);
	
	 void borrarCurso(Long id_curso);

}
