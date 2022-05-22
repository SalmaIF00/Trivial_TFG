package services;

import entity.Curso;

public interface CursoService{
	
	 Curso crearCurso(Curso  curso);
	
	 Curso buscarCurso(Long id_curso);
	
	 Curso actualizarCurso(Curso  curso);
	
	 void borrarCurso(Long id_curso);

}
