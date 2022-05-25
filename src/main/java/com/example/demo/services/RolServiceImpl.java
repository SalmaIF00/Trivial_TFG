package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RolDao;
import com.example.demo.entity.Rol;

@Transactional
@Service
public class RolServiceImpl implements RolService{
	
	@Autowired
	private RolDao rolDao;

	@Override
	public Rol crearRol(Rol rol) {
		
		return rolDao.crear(rol);
	}

	@Override
	public Rol buscarRol(Long id_rol) {
		return rolDao.buscar(id_rol);
	}

	@Override
	public Rol actualizarRol(Rol rol) {
		return rolDao.actualizar(rol);
	}

	@Override
	public void borrarRol(Long id_rol) {
		rolDao.borrar(id_rol);
		
	}

	@Override
	public int guardarUsuarioRol(Long id_usuario, Long id_rol) {
		return 	rolDao.saveUR(id_usuario, id_rol);
		
	}

}
