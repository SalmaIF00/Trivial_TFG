package com.example.trivial_tfg.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Respuesta;
import com.example.trivial_tfg.repository.RespuestaRepository;

@Transactional
@Service
public class RespuestaServiceImpl implements RespuestaService{
	@Autowired
	private RespuestaRepository respuestaRepository;
	@Override
	public Respuesta crearRespuesta(Respuesta respuesta) {
		
		return respuestaRepository.save(respuesta);
	}

	@Override
	public Optional<Respuesta> buscarRespuesta(Long id_respuesta) {
		
		return respuestaRepository.findById(id_respuesta);
	}

	@Override
	public Respuesta actualizarRespuesta(Respuesta respuesta) {
		
		return respuestaRepository.save(respuesta);
	}

	@Override
	public void borrarRespuesta(Long id_respuesta) {
		respuestaRepository.deleteById(id_respuesta);
		
	}


	
}
