package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CursoDao;
import com.example.demo.entity.Curso;

@Transactional
@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoDao cursoDao;

	@Override
	public Curso crearCurso(Curso curso) {
		
		return cursoDao.crear(curso);
	}

	@Override
	public Curso buscarCurso(Long id_curso) {
		
		return cursoDao.buscar(id_curso);
	}

	@Override
	public Curso actualizarCurso(Curso curso) {
		
		return cursoDao.actualizar(curso);
	}

	@Override
	public void borrarCurso(Long id_curso) {
		cursoDao.borrar(id_curso);
		
	}

}
