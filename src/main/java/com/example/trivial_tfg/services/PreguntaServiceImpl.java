package com.example.trivial_tfg.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.repository.PreguntaRepository;

@Transactional
@Service
public class PreguntaServiceImpl implements PreguntaService {
	@Autowired
	private PreguntaRepository preguntaRepository;

	@Override
	public Pregunta crearPregunta(Pregunta pregunta) {
		
		return preguntaRepository.save(pregunta);
	}

	@Override
	public Pregunta buscarPregunta(Long id_pregunta) {
		Pregunta p = preguntaRepository.findById(id_pregunta).orElse(null);
		return p;
	}

	@Override
	public Pregunta actualizarPregunta(Pregunta pregunta) {
		
		return preguntaRepository.save(pregunta);
	}

	@Override
	public void borrarPregunta(Long id_pregunta) {
		preguntaRepository.deleteById(id_pregunta);
		
	}

	@Override
	public Long[] listarPreguntas(Long id_asignatura) {
		return preguntaRepository.findByIdAsignatura(id_asignatura) ;
	}

}
