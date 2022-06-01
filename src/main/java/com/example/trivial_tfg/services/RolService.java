package com.example.trivial_tfg.services;

import java.util.Optional;

import com.example.trivial_tfg.entity.Rol;

public interface RolService{
	
	Rol crearRol(Rol rol);
	
	Rol buscarRol(Long id_rol);
	
	Rol actualizarRol(Rol rol);
	
	 void borrarRol(Long id_rol);
	 
}
