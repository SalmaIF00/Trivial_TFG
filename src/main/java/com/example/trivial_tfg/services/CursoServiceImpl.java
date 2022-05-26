package com.example.trivial_tfg.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Curso;
import com.example.trivial_tfg.repository.CursoRepository;

@Transactional
@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public Curso crearCurso(Curso curso) {
		
		return cursoRepository.save(curso);
	}



	@Override
	public Curso actualizarCurso(Curso curso) {
		
		return cursoRepository.save(curso);
	}

	@Override
	public void borrarCurso(Long id_curso) {
		cursoRepository.deleteById(id_curso);
		
	}

	@Override
	public Optional<Curso> buscarCurso(Long id_curso) {
		return cursoRepository.findById(id_curso);
	}

}
