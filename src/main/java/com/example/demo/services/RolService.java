package com.example.demo.services;

import com.example.demo.entity.Rol;

public interface RolService{
	
	Rol crearRol(Rol rol);
	
	Rol buscarRol(Long id_rol);
	
	Rol actualizarRol(Rol rol);
	
	 void borrarRol(Long id_rol);
	 
	 int guardarUsuarioRol(Long id_usuario, Long id_rol);

}
