package com.example.trivial_tfg.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.dao.ResultadoDao;
import com.example.trivial_tfg.entity.Resultado;

@Transactional
@Service
public class ResultadoServiceImpl implements ResultadoService {

	@Autowired
	ResultadoDao resultadoDao;
	
	@Override
	public Resultado crearResultado(Resultado resultado) {
		
		return resultadoDao.crear(resultado);
	}

	@Override
	public Resultado buscarResultado(Long id_resultado) {
		
		return resultadoDao.buscar(id_resultado);
	}

	@Override
	public Resultado actualizarResultado(Resultado resultado) {
		
		return resultadoDao.actualizar(resultado);
	}

	@Override
	public void borrarResultado(Long id_resultado) {
		resultadoDao.borrar(id_resultado);
		
	}

}	
