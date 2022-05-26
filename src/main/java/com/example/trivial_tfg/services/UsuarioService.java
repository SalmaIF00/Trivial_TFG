package com.example.trivial_tfg.services;

import java.util.List;
import java.util.Optional;

import com.example.trivial_tfg.entity.Usuario;

public interface UsuarioService {

//	Usuario crearUsuario(Long id_usuario, String nombre, String apellidos, String nombre_usuario, String password,
//			String rol);
	
//	List<Usuario> listarUsuario();
//
	Optional<Usuario> buscarUsuarioId(Long id_usuario);

//	Usuario buscarNomYPwd(String nombre, String pwd);

//	Usuario buscarNombreUsuario(String nombre_usuario);

	Usuario actualizarUsuario(Usuario usuario);

	void borrarUsuario(Long id_usuario);

	//public void asignarRol(Long id_usuario, Long id_rol);
}
