package com.example.trivial_tfg.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Rol;
import com.example.trivial_tfg.repository.RolRepository;

@Transactional
@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepository rolRepository;

	@Override
	public Rol crearRol(Rol rol) {

		return rolRepository.save(rol);
	}

	@Override
	public Rol buscarRol(Long id_rol) {
		return rolRepository.getById(id_rol);

	}

	@Override
	public Rol actualizarRol(Rol rol) {
		return rolRepository.save(rol);
	}

	@Override
	public void borrarRol(Long id_rol) {
		rolRepository.deleteById(id_rol);
	}



}
