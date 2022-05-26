package com.example.trivial_tfg.dao;

import com.example.trivial_tfg.entity.Usuario;

public interface UsuarioDao extends DaoGenerico<Usuario> {
	Usuario findByNameAndPass(String nombre, String pwd);

//	List<Usuario> findAll();

	Integer findId();

	Usuario findByUserName(String usuario);
}
