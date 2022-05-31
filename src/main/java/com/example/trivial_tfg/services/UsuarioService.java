package com.example.trivial_tfg.services;

import java.util.List;
import java.util.Optional;

import com.example.trivial_tfg.entity.Usuario;

public interface UsuarioService {

	List<Usuario> listarUsuario();

	Usuario buscarUsuarioId(Long id_usuario);

	Usuario buscarNomYPwd(String nombre, String pwd);

	Usuario crearUsuario(Long id_usuario, String nombre, String apellidos, String nombre_usuario, String password,
			String rol);

	Usuario buscarNombre(String nombre);

}
