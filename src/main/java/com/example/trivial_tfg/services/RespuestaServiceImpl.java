package com.example.trivial_tfg.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.dao.RespuestaDao;
import com.example.trivial_tfg.entity.Respuesta;

@Transactional
@Service
public class RespuestaServiceImpl implements RespuestaService{
	@Autowired
	private RespuestaDao respuestaDao;
	@Override
	public Respuesta crearRespuesta(Respuesta respuesta) {
		
		return respuestaDao.crear(respuesta);
	}

	@Override
	public Respuesta buscarRespuesta(Long id_respuesta) {
		
		return respuestaDao.buscar(id_respuesta);
	}

	@Override
	public Respuesta actualizarRespuesta(Respuesta respuesta) {
		
		return respuestaDao.actualizar(respuesta);
	}

	@Override
	public void borrarRespuesta(Long id_respuesta) {
		respuestaDao.borrar(id_respuesta);
		
	}


	
}
