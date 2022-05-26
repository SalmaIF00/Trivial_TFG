package com.example.trivial_tfg.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.dao.AsignaturaDao;
import com.example.trivial_tfg.entity.Asignatura;

@Transactional
@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	private AsignaturaDao asignaturaDao;

	@Override
	public Asignatura crearAsignatura(Asignatura Asignatura) {

		return asignaturaDao.crear(Asignatura);
	}

	@Override
	public Asignatura buscarAsignatura(Long id_asignatura) {

		return asignaturaDao.buscar(id_asignatura);
	}

	@Override
	public Asignatura actualizarRespuesta(Asignatura asignatura) {

		return asignaturaDao.actualizar(asignatura);
	}

	@Override
	public void borrarAsignatura(Long id_asignatura) {
		asignaturaDao.borrar(id_asignatura);

	}

}
