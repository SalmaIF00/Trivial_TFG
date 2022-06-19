package com.example.trivial_tfg.services;

import java.util.ArrayList;
import java.util.List;
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
	public Pregunta buscarPregunta(Long[] id_preguntas) {
		/* Buscamos un número random entre 0 a 9 */
		Integer random = (int) Math.floor(Math.random() * 10);

		/* Buscamos el id_pregunta recorriendo el array según el número random */
		Long buscarID = id_preguntas[random];

		Pregunta p = preguntaRepository.findById(buscarID).orElse(null);
		
		return p;
	}

	@Override
	public Long[] listarPreguntas(Long id_asignatura) {
		return preguntaRepository.findByIdAsignatura(id_asignatura) ;
	}

}
