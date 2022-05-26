package com.example.trivial_tfg.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.dao.PreguntaDao;
import com.example.trivial_tfg.entity.Pregunta;

@Transactional
@Service
public class PreguntaServiceImpl implements PreguntaService {
	@Autowired
	private PreguntaDao preguntaDao;

	@Override
	public Pregunta crearPregunta(Pregunta pregunta) {
		
		return preguntaDao.crear(pregunta);
	}

	@Override
	public Pregunta buscarPregunta(Long id_pregunta) {
		
		return preguntaDao.buscar(id_pregunta);
	}

	@Override
	public Pregunta actualizarPregunta(Pregunta pregunta) {
		
		return preguntaDao.actualizar(pregunta);
	}

	@Override
	public void borrarPregunta(Long id_pregunta) {
		preguntaDao.borrar(id_pregunta);
		
	}

}
