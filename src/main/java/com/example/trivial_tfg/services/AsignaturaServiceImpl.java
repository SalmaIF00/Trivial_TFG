package com.example.trivial_tfg.services;

import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.repository.AsignaturaRepository;

@Transactional
@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	public Asignatura crearAsignatura(Asignatura asignatura) {

		return asignaturaRepository.save(asignatura);
	}

	@Override
	public Optional<Asignatura> buscarAsignatura(Long id_asignatura) {

		return asignaturaRepository.findById(id_asignatura);
	}

	@Override
	public Asignatura actualizarRespuesta(Asignatura asignatura) {

		return asignaturaRepository.save(asignatura);
	}

	@Override
	public void borrarAsignatura(Long id_asignatura) {
		asignaturaRepository.deleteById(id_asignatura);

	}

	@Override
	public Set<Asignatura> buscarCurso(Long id_curso) {
		return asignaturaRepository.findByIdCurso(id_curso);
		
	}

	@Override
	public Set<Pregunta> buscarPreguntas(Long id_asignatura) {
		
		return null;
	}

}
